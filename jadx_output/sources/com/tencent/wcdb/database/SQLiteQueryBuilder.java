package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public class SQLiteQueryBuilder {
    private static final java.lang.String TAG = "WCDB.SQLiteQueryBuilder";
    private static final java.util.regex.Pattern sLimitPattern = java.util.regex.Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private boolean mStrict;
    private java.util.Map<java.lang.String, java.lang.String> mProjectionMap = null;
    private java.lang.String mTables = "";
    private java.lang.StringBuilder mWhereClause = null;
    private boolean mDistinct = false;
    private com.tencent.wcdb.database.SQLiteDatabase.CursorFactory mFactory = null;

    private static void appendClause(java.lang.StringBuilder sb6, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        sb6.append(str);
        sb6.append(str2);
    }

    public static void appendColumns(java.lang.StringBuilder sb6, java.lang.String[] strArr) {
        int length = strArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String str = strArr[i17];
            if (str != null) {
                if (i17 > 0) {
                    sb6.append(", ");
                }
                sb6.append(str);
            }
        }
        sb6.append(' ');
    }

    public static java.lang.String buildQueryString(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (android.text.TextUtils.isEmpty(str3) && !android.text.TextUtils.isEmpty(str4)) {
            throw new java.lang.IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        if (!android.text.TextUtils.isEmpty(str6) && !sLimitPattern.matcher(str6).matches()) {
            throw new java.lang.IllegalArgumentException("invalid LIMIT clauses:" + str6);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(120);
        sb6.append("SELECT ");
        if (z17) {
            sb6.append("DISTINCT ");
        }
        if (strArr == null || strArr.length == 0) {
            sb6.append("* ");
        } else {
            appendColumns(sb6, strArr);
        }
        sb6.append("FROM ");
        sb6.append(str);
        appendClause(sb6, " WHERE ", str2);
        appendClause(sb6, " GROUP BY ", str3);
        appendClause(sb6, " HAVING ", str4);
        appendClause(sb6, " ORDER BY ", str5);
        appendClause(sb6, " LIMIT ", str6);
        return sb6.toString();
    }

    private java.lang.String[] computeProjection(java.lang.String[] strArr) {
        int i17 = 0;
        if (strArr == null || strArr.length <= 0) {
            java.util.Map<java.lang.String, java.lang.String> map = this.mProjectionMap;
            if (map == null) {
                return null;
            }
            java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet = map.entrySet();
            java.lang.String[] strArr2 = new java.lang.String[entrySet.size()];
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : entrySet) {
                if (!entry.getKey().equals("_count")) {
                    strArr2[i17] = entry.getValue();
                    i17++;
                }
            }
            return strArr2;
        }
        if (this.mProjectionMap == null) {
            return strArr;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length];
        int length = strArr.length;
        while (i17 < length) {
            java.lang.String str = strArr[i17];
            java.lang.String str2 = this.mProjectionMap.get(str);
            if (str2 != null) {
                strArr3[i17] = str2;
            } else {
                if (this.mStrict || !(str.contains(" AS ") || str.contains(" as "))) {
                    throw new java.lang.IllegalArgumentException("Invalid column " + strArr[i17]);
                }
                strArr3[i17] = str;
            }
            i17++;
        }
        return strArr3;
    }

    private void validateQuerySql(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        sQLiteDatabase.getThreadSession().prepare(str, sQLiteDatabase.getThreadDefaultConnectionFlags(true), cancellationSignal, null);
    }

    public void appendWhere(java.lang.CharSequence charSequence) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new java.lang.StringBuilder(charSequence.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        this.mWhereClause.append(charSequence);
    }

    public void appendWhereEscapeString(java.lang.String str) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new java.lang.StringBuilder(str.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        com.tencent.wcdb.DatabaseUtils.appendEscapedSQLString(this.mWhereClause, str);
    }

    public java.lang.String buildQuery(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String[] computeProjection = computeProjection(strArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = this.mWhereClause;
        boolean z17 = sb7 != null && sb7.length() > 0;
        if (z17) {
            sb6.append(this.mWhereClause.toString());
            sb6.append(')');
        }
        if (str != null && str.length() > 0) {
            if (z17) {
                sb6.append(" AND ");
            }
            sb6.append('(');
            sb6.append(str);
            sb6.append(')');
        }
        return buildQueryString(this.mDistinct, this.mTables, computeProjection, sb6.toString(), str2, str3, str4, str5);
    }

    public java.lang.String buildUnionQuery(java.lang.String[] strArr, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        int length = strArr.length;
        java.lang.String str3 = this.mDistinct ? " UNION " : " UNION ALL ";
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 > 0) {
                sb6.append(str3);
            }
            sb6.append(strArr[i17]);
        }
        appendClause(sb6, " ORDER BY ", str);
        appendClause(sb6, " LIMIT ", str2);
        return sb6.toString();
    }

    public java.lang.String buildUnionSubQuery(java.lang.String str, java.lang.String[] strArr, java.util.Set<java.lang.String> set, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String str6 = strArr[i18];
            if (str6.equals(str)) {
                strArr2[i18] = "'" + str2 + "' AS " + str;
            } else if (i18 > i17 && !set.contains(str6)) {
                strArr2[i18] = "NULL AS ".concat(str6);
            } else {
                strArr2[i18] = str6;
            }
        }
        return buildQuery(strArr2, str3, str4, str5, null, null);
    }

    public java.lang.String getTables() {
        return this.mTables;
    }

    public com.tencent.wcdb.Cursor query(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, null, null);
    }

    public void setCursorFactory(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory) {
        this.mFactory = cursorFactory;
    }

    public void setDistinct(boolean z17) {
        this.mDistinct = z17;
    }

    public void setProjectionMap(java.util.Map<java.lang.String, java.lang.String> map) {
        this.mProjectionMap = map;
    }

    public void setStrict(boolean z17) {
        this.mStrict = z17;
    }

    public void setTables(java.lang.String str) {
        this.mTables = str;
    }

    public com.tencent.wcdb.Cursor query(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, str5, null);
    }

    public com.tencent.wcdb.Cursor query(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (this.mTables == null) {
            return null;
        }
        if (this.mStrict && str != null && str.length() > 0) {
            validateQuerySql(sQLiteDatabase, buildQuery(strArr, "(" + str + ")", str2, str3, str4, str5), cancellationSignal);
        }
        java.lang.String buildQuery = buildQuery(strArr, str, str2, str3, str4, str5);
        com.tencent.wcdb.support.Log.d(TAG, "Performing query: " + buildQuery);
        return sQLiteDatabase.rawQueryWithFactory(this.mFactory, buildQuery, strArr2, com.tencent.wcdb.database.SQLiteDatabase.findEditTable(this.mTables), cancellationSignal);
    }

    @java.lang.Deprecated
    public java.lang.String buildUnionSubQuery(java.lang.String str, java.lang.String[] strArr, java.util.Set<java.lang.String> set, int i17, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr2, java.lang.String str4, java.lang.String str5) {
        return buildUnionSubQuery(str, strArr, set, i17, str2, str3, str4, str5);
    }

    @java.lang.Deprecated
    public java.lang.String buildQuery(java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return buildQuery(strArr, str, str2, str3, str4, str5);
    }
}
