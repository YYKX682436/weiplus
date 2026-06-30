package com.tencent.wcdb;

/* loaded from: classes12.dex */
public final class CursorJoiner implements java.util.Iterator<com.tencent.wcdb.CursorJoiner.Result>, java.lang.Iterable<com.tencent.wcdb.CursorJoiner.Result> {
    private int[] mColumnsLeft;
    private int[] mColumnsRight;
    private com.tencent.wcdb.CursorJoiner.Result mCompareResult;
    private boolean mCompareResultIsValid;
    private com.tencent.wcdb.Cursor mCursorLeft;
    private com.tencent.wcdb.Cursor mCursorRight;
    private java.lang.String[] mValues;

    /* renamed from: com.tencent.wcdb.CursorJoiner$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$wcdb$CursorJoiner$Result;

        static {
            int[] iArr = new int[com.tencent.wcdb.CursorJoiner.Result.values().length];
            $SwitchMap$com$tencent$wcdb$CursorJoiner$Result = iArr;
            try {
                iArr[com.tencent.wcdb.CursorJoiner.Result.BOTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$CursorJoiner$Result[com.tencent.wcdb.CursorJoiner.Result.LEFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$CursorJoiner$Result[com.tencent.wcdb.CursorJoiner.Result.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes12.dex */
    public enum Result {
        RIGHT,
        LEFT,
        BOTH
    }

    public CursorJoiner(com.tencent.wcdb.Cursor cursor, java.lang.String[] strArr, com.tencent.wcdb.Cursor cursor2, java.lang.String[] strArr2) {
        if (strArr.length != strArr2.length) {
            throw new java.lang.IllegalArgumentException("you must have the same number of columns on the left and right, " + strArr.length + " != " + strArr2.length);
        }
        this.mCursorLeft = cursor;
        this.mCursorRight = cursor2;
        cursor.moveToFirst();
        this.mCursorRight.moveToFirst();
        this.mCompareResultIsValid = false;
        this.mColumnsLeft = buildColumnIndiciesArray(cursor, strArr);
        this.mColumnsRight = buildColumnIndiciesArray(cursor2, strArr2);
        this.mValues = new java.lang.String[this.mColumnsLeft.length * 2];
    }

    private int[] buildColumnIndiciesArray(com.tencent.wcdb.Cursor cursor, java.lang.String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            iArr[i17] = cursor.getColumnIndexOrThrow(strArr[i17]);
        }
        return iArr;
    }

    private static int compareStrings(java.lang.String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("you must specify an even number of values");
        }
        for (int i17 = 0; i17 < strArr.length; i17 += 2) {
            java.lang.String str = strArr[i17];
            if (str != null) {
                java.lang.String str2 = strArr[i17 + 1];
                if (str2 == null) {
                    return 1;
                }
                int compareTo = str.compareTo(str2);
                if (compareTo != 0) {
                    return compareTo < 0 ? -1 : 1;
                }
            } else if (strArr[i17 + 1] != null) {
                return -1;
            }
        }
        return 0;
    }

    private void incrementCursors() {
        if (this.mCompareResultIsValid) {
            int i17 = com.tencent.wcdb.CursorJoiner.AnonymousClass1.$SwitchMap$com$tencent$wcdb$CursorJoiner$Result[this.mCompareResult.ordinal()];
            if (i17 == 1) {
                this.mCursorLeft.moveToNext();
                this.mCursorRight.moveToNext();
            } else if (i17 == 2) {
                this.mCursorLeft.moveToNext();
            } else if (i17 == 3) {
                this.mCursorRight.moveToNext();
            }
            this.mCompareResultIsValid = false;
        }
    }

    private static void populateValues(java.lang.String[] strArr, com.tencent.wcdb.Cursor cursor, int[] iArr, int i17) {
        for (int i18 = 0; i18 < iArr.length; i18++) {
            strArr[(i18 * 2) + i17] = cursor.getString(iArr[i18]);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.mCompareResultIsValid) {
            return (this.mCursorLeft.isAfterLast() && this.mCursorRight.isAfterLast()) ? false : true;
        }
        int i17 = com.tencent.wcdb.CursorJoiner.AnonymousClass1.$SwitchMap$com$tencent$wcdb$CursorJoiner$Result[this.mCompareResult.ordinal()];
        if (i17 == 1) {
            return (this.mCursorLeft.isLast() && this.mCursorRight.isLast()) ? false : true;
        }
        if (i17 == 2) {
            return (this.mCursorLeft.isLast() && this.mCursorRight.isAfterLast()) ? false : true;
        }
        if (i17 == 3) {
            return (this.mCursorLeft.isAfterLast() && this.mCursorRight.isLast()) ? false : true;
        }
        throw new java.lang.IllegalStateException("bad value for mCompareResult, " + this.mCompareResult);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.tencent.wcdb.CursorJoiner.Result> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("not implemented");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public com.tencent.wcdb.CursorJoiner.Result next() {
        if (hasNext()) {
            incrementCursors();
            boolean z17 = !this.mCursorLeft.isAfterLast();
            boolean z18 = !this.mCursorRight.isAfterLast();
            if (z17 && z18) {
                populateValues(this.mValues, this.mCursorLeft, this.mColumnsLeft, 0);
                populateValues(this.mValues, this.mCursorRight, this.mColumnsRight, 1);
                int compareStrings = compareStrings(this.mValues);
                if (compareStrings == -1) {
                    this.mCompareResult = com.tencent.wcdb.CursorJoiner.Result.LEFT;
                } else if (compareStrings == 0) {
                    this.mCompareResult = com.tencent.wcdb.CursorJoiner.Result.BOTH;
                } else if (compareStrings == 1) {
                    this.mCompareResult = com.tencent.wcdb.CursorJoiner.Result.RIGHT;
                }
            } else if (z17) {
                this.mCompareResult = com.tencent.wcdb.CursorJoiner.Result.LEFT;
            } else {
                this.mCompareResult = com.tencent.wcdb.CursorJoiner.Result.RIGHT;
            }
            this.mCompareResultIsValid = true;
            return this.mCompareResult;
        }
        throw new java.lang.IllegalStateException("you must only call next() when hasNext() is true");
    }
}
