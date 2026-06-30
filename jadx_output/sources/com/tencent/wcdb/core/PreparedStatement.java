package com.tencent.wcdb.core;

/* loaded from: classes12.dex */
public class PreparedStatement extends com.tencent.wcdb.base.CppObject {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    boolean autoFinalize = false;
    int columnCount = -1;

    /* renamed from: com.tencent.wcdb.core.PreparedStatement$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$wcdb$winq$ColumnType;

        static {
            int[] iArr = new int[com.tencent.wcdb.winq.ColumnType.values().length];
            $SwitchMap$com$tencent$wcdb$winq$ColumnType = iArr;
            try {
                iArr[com.tencent.wcdb.winq.ColumnType.Integer.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.Float.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.Text.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.BLOB.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.Null.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public PreparedStatement(long j17) {
        this.cppObj = j17;
    }

    private static native void bindBLOB(long j17, byte[] bArr, int i17);

    private static native void bindDouble(long j17, double d17, int i17);

    private static native void bindInteger(long j17, long j18, int i17);

    private static native void bindNull(long j17, int i17);

    private static native int bindParameterIndex(long j17, java.lang.String str);

    private static native void bindText(long j17, java.lang.String str, int i17);

    private static native boolean checkPrepared(long j17);

    private static native void clearBindings(long j17);

    private com.tencent.wcdb.base.WCDBException createException() {
        return com.tencent.wcdb.base.WCDBException.createException(getError(this.cppObj));
    }

    private static native void finalize(long j17);

    private static native byte[] getBLOB(long j17, int i17);

    private static native int getColumnCount(long j17);

    private static native java.lang.String getColumnName(long j17, int i17);

    private static native java.lang.String getColumnTableName(long j17, int i17);

    private static native int getColumnType(long j17, int i17);

    private static native double getDouble(long j17, int i17);

    private static native long getError(long j17);

    private static native long getInteger(long j17, int i17);

    private static native java.lang.String getOriginalColumnName(long j17, int i17);

    private static native java.lang.String getText(long j17, int i17);

    private static native boolean isDone(long j17);

    private static native boolean isReadOnly(long j17);

    private static native boolean prepare(long j17, long j18);

    private static native boolean prepareSQL(long j17, java.lang.String str);

    private static native void reset(long j17);

    private static native boolean step(long j17);

    public void bindBLOB(byte[] bArr, int i17) {
        if (bArr == null) {
            bindNull(i17);
        } else {
            bindBLOB(this.cppObj, bArr, i17);
        }
    }

    public void bindBool(boolean z17, int i17) {
        bindInteger(this.cppObj, z17 ? 1L : 0L, i17);
    }

    public void bindDouble(float f17, int i17) {
        bindDouble(this.cppObj, f17, i17);
    }

    public void bindInteger(byte b17, int i17) {
        bindInteger(this.cppObj, b17, i17);
    }

    public void bindNull(int i17) {
        bindNull(this.cppObj, i17);
    }

    public <T> void bindObject(T t17, com.tencent.wcdb.orm.TableBinding<T> tableBinding) {
        if (t17 == null) {
            return;
        }
        int i17 = 1;
        for (com.tencent.wcdb.orm.Field<T> field : tableBinding.allBindingFields()) {
            tableBinding.bindField(t17, field, i17, this);
            i17++;
        }
    }

    public int bindParameterIndex(java.lang.String str) {
        return bindParameterIndex(this.cppObj, str);
    }

    public void bindRow(com.tencent.wcdb.base.Value[] valueArr) {
        int i17 = 1;
        for (com.tencent.wcdb.base.Value value : valueArr) {
            bindValue(value, i17);
            i17++;
        }
    }

    public void bindText(java.lang.String str, int i17) {
        if (str == null) {
            bindNull(i17);
        } else {
            bindText(this.cppObj, str, i17);
        }
    }

    public void bindValue(com.tencent.wcdb.base.Value value, int i17) {
        if (value == null) {
            bindNull(i17);
            return;
        }
        int i18 = com.tencent.wcdb.core.PreparedStatement.AnonymousClass1.$SwitchMap$com$tencent$wcdb$winq$ColumnType[value.getType().ordinal()];
        if (i18 == 1) {
            bindInteger(value.getLong(), i17);
            return;
        }
        if (i18 == 2) {
            bindDouble(value.getDouble(), i17);
            return;
        }
        if (i18 == 3) {
            bindText(value.getText(), i17);
        } else if (i18 == 4) {
            bindBLOB(value.getBLOB(), i17);
        } else {
            if (i18 != 5) {
                return;
            }
            bindNull(i17);
        }
    }

    public boolean checkPrepared() {
        return checkPrepared(this.cppObj);
    }

    public void clearBindings() {
        clearBindings(this.cppObj);
    }

    public void finalizeStatement() {
        finalize(this.cppObj);
    }

    public <T> java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        return getAllObjects(fieldArr, com.tencent.wcdb.orm.Field.getBindClass(fieldArr));
    }

    public byte[] getBLOB(int i17) {
        return getBLOB(this.cppObj, i17);
    }

    public boolean getBool(int i17) {
        return getInteger(this.cppObj, i17) > 0;
    }

    public byte getByte(int i17) {
        return (byte) getInteger(this.cppObj, i17);
    }

    public int getColumnCount() {
        if (this.columnCount == -1) {
            this.columnCount = getColumnCount(this.cppObj);
        }
        return this.columnCount;
    }

    public java.lang.String getColumnName(int i17) {
        return getColumnName(this.cppObj, i17);
    }

    public java.lang.String getColumnTableName(int i17) {
        return getColumnTableName(this.cppObj, i17);
    }

    public com.tencent.wcdb.winq.ColumnType getColumnType(int i17) {
        return com.tencent.wcdb.winq.ColumnType.valueOf(getColumnType(this.cppObj, i17));
    }

    public double getDouble(int i17) {
        return getDouble(this.cppObj, i17);
    }

    public float getFloat(int i17) {
        return (float) getDouble(this.cppObj, i17);
    }

    public int getInt(int i17) {
        return (int) getInteger(this.cppObj, i17);
    }

    public long getLong(int i17) {
        return getInteger(this.cppObj, i17);
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getMultiRows() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        step();
        while (!isDone(this.cppObj)) {
            arrayList.add(getOneRow());
            step();
        }
        return arrayList;
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        step();
        while (!isDone(this.cppObj)) {
            arrayList.add(getValue(0));
            step();
        }
        return arrayList;
    }

    public java.util.List<byte[]> getOneColumnBLOB() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        step();
        while (!isDone(this.cppObj)) {
            arrayList.add(getBLOB(0));
            step();
        }
        return arrayList;
    }

    public java.util.List<java.lang.Double> getOneColumnDouble() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        step();
        while (!isDone(this.cppObj)) {
            arrayList.add(java.lang.Double.valueOf(getDouble(0)));
            step();
        }
        return arrayList;
    }

    public java.util.List<java.lang.Float> getOneColumnFloat() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        step();
        while (!isDone(this.cppObj)) {
            arrayList.add(java.lang.Float.valueOf((float) getDouble(0)));
            step();
        }
        return arrayList;
    }

    public java.util.List<java.lang.Integer> getOneColumnInt() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        step();
        while (!isDone(this.cppObj)) {
            arrayList.add(java.lang.Integer.valueOf((int) getLong(0)));
            step();
        }
        return arrayList;
    }

    public java.util.List<java.lang.Long> getOneColumnLong() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        step();
        while (!isDone(this.cppObj)) {
            arrayList.add(java.lang.Long.valueOf(getLong(0)));
            step();
        }
        return arrayList;
    }

    public java.util.List<java.lang.String> getOneColumnString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        step();
        while (!isDone(this.cppObj)) {
            arrayList.add(getText(0));
            step();
        }
        return arrayList;
    }

    public <T> T getOneObject(com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        return (T) getOneObject(fieldArr, com.tencent.wcdb.orm.Field.getBindClass(fieldArr));
    }

    public com.tencent.wcdb.base.Value[] getOneRow() {
        int columnCount = getColumnCount();
        if (columnCount == 0) {
            return new com.tencent.wcdb.base.Value[0];
        }
        com.tencent.wcdb.base.Value[] valueArr = new com.tencent.wcdb.base.Value[columnCount];
        for (int i17 = 0; i17 < columnCount; i17++) {
            valueArr[i17] = getValue(i17);
        }
        return valueArr;
    }

    public java.lang.String getOriginalColumnName(int i17) {
        return getOriginalColumnName(this.cppObj, i17);
    }

    public short getShort(int i17) {
        return (short) getInteger(this.cppObj, i17);
    }

    public java.lang.String getText(int i17) {
        return getText(this.cppObj, i17);
    }

    public com.tencent.wcdb.base.Value getValue(int i17) {
        int columnType = getColumnType(this.cppObj, i17);
        return columnType != 1 ? columnType != 2 ? columnType != 3 ? columnType != 4 ? new com.tencent.wcdb.base.Value() : new com.tencent.wcdb.base.Value(getBLOB(this.cppObj, i17)) : new com.tencent.wcdb.base.Value(getText(this.cppObj, i17)) : new com.tencent.wcdb.base.Value(getDouble(this.cppObj, i17)) : new com.tencent.wcdb.base.Value(getInteger(this.cppObj, i17));
    }

    public boolean isDone() {
        return isDone(this.cppObj);
    }

    public boolean isReadOnly() {
        return isReadOnly(this.cppObj);
    }

    public void prepare(com.tencent.wcdb.winq.Statement statement) {
        this.columnCount = -1;
        if (!prepare(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statement))) {
            throw createException();
        }
    }

    public void reset() {
        reset(this.cppObj);
    }

    public void step() {
        if (step(this.cppObj)) {
            return;
        }
        if (this.autoFinalize) {
            finalizeStatement();
        }
        throw createException();
    }

    public void bindBool(java.lang.Boolean bool, int i17) {
        if (bool != null) {
            bindInteger(this.cppObj, bool.booleanValue() ? 1L : 0L, i17);
        } else {
            bindNull(i17);
        }
    }

    public void bindDouble(java.lang.Float f17, int i17) {
        if (f17 != null) {
            bindDouble(this.cppObj, f17.floatValue(), i17);
        } else {
            bindNull(i17);
        }
    }

    public void bindInteger(java.lang.Byte b17, int i17) {
        if (b17 != null) {
            bindInteger(this.cppObj, b17.byteValue(), i17);
        } else {
            bindNull(i17);
        }
    }

    public <T, R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.Class<R> cls) {
        com.tencent.wcdb.orm.TableBinding<T> tableBinding = fieldArr[0].getTableBinding();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        step();
        while (!isDone(this.cppObj)) {
            try {
                arrayList.add(tableBinding.extractObject(fieldArr, this, cls));
                step();
            } catch (java.lang.ReflectiveOperationException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        return arrayList;
    }

    public <T, R extends T> R getOneObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.Class<R> cls) {
        try {
            return (R) fieldArr[0].getTableBinding().extractObject(fieldArr, this, cls);
        } catch (java.lang.ReflectiveOperationException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public <T> void bindObject(T t17, com.tencent.wcdb.orm.Field<T> field, int i17) {
        if (t17 == null) {
            bindNull(i17);
        } else {
            field.getTableBinding().bindField(t17, field, i17, this);
        }
    }

    public void bindDouble(double d17, int i17) {
        bindDouble(this.cppObj, d17, i17);
    }

    public void bindInteger(short s17, int i17) {
        bindInteger(this.cppObj, s17, i17);
    }

    public void prepare(java.lang.String str) {
        this.columnCount = -1;
        if (!prepareSQL(this.cppObj, str)) {
            throw createException();
        }
    }

    public void bindDouble(java.lang.Double d17, int i17) {
        if (d17 != null) {
            bindDouble(this.cppObj, d17.doubleValue(), i17);
        } else {
            bindNull(i17);
        }
    }

    public void bindInteger(java.lang.Short sh6, int i17) {
        if (sh6 != null) {
            bindInteger(this.cppObj, sh6.shortValue(), i17);
        } else {
            bindNull(i17);
        }
    }

    public <T> void bindObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        if (t17 == null || fieldArr.length == 0) {
            return;
        }
        com.tencent.wcdb.orm.TableBinding<T> tableBinding = fieldArr[0].getTableBinding();
        int i17 = 1;
        for (com.tencent.wcdb.orm.Field<T> field : fieldArr) {
            tableBinding.bindField(t17, field, i17, this);
            i17++;
        }
    }

    public void bindInteger(int i17, int i18) {
        bindInteger(this.cppObj, i17, i18);
    }

    public void bindInteger(java.lang.Integer num, int i17) {
        if (num != null) {
            bindInteger(this.cppObj, num.intValue(), i17);
        } else {
            bindNull(i17);
        }
    }

    public void bindInteger(long j17, int i17) {
        bindInteger(this.cppObj, j17, i17);
    }

    public void bindInteger(java.lang.Long l17, int i17) {
        if (l17 != null) {
            bindInteger(this.cppObj, l17.longValue(), i17);
        } else {
            bindNull(i17);
        }
    }
}
