package com.example.android.amlway2.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Abdulrhman on 23/03/2017.
 */

public final class ContractBill {
    public ContractBill() {
    }

    static final String CONTENT_AUTHORITY = "com.example.android.amlWay";
    static final Uri BASE_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    static final String PathBill = "bills";

    public static final class billEntry implements BaseColumns {

        static final Uri CONTENT_URI = BASE_URI.buildUpon().appendPath(PathBill).build();
        static final String TABLE_NAME = "bills";
        static final String COLUMN_ID = _ID;
        static final String COLUMN_CUSTOMER_NAME = "CUSTOMER_NAME";
        static final String COLUMN_EMPLOYEE_NAME = "EMPLOYEE_NAME";
        static final String COLUMN_FROM = "FROM";
        static final String COLUMN_TO = "TO";
        static final String COLUMN_PRICE = "PRICE";
        static final String COLUMN_WEIGHT = "WEIGHT";
        static final String COLUMN_COUNT = "COUNT";
        static final String COLUMN_ELEMENT = "ELEMENT";
        static final String COLUMN_Bill_TYPE = "TYPE";

    }
}
