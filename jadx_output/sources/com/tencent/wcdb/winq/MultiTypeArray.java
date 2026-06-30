package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
class MultiTypeArray {
    double[] doubleValues;
    long[] longValues;
    java.lang.String[] stringValues;
    int[] types;

    /* renamed from: com.tencent.wcdb.winq.MultiTypeArray$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$wcdb$winq$ColumnType;

        static {
            int[] iArr = new int[com.tencent.wcdb.winq.ColumnType.values().length];
            $SwitchMap$com$tencent$wcdb$winq$ColumnType = iArr;
            try {
                iArr[com.tencent.wcdb.winq.ColumnType.Null.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.Integer.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.Float.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.Text.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
    public MultiTypeArray(java.lang.Object[] objArr) {
        int length = objArr.length;
        this.types = new int[length];
        this.longValues = new long[length];
        this.doubleValues = new double[length];
        this.stringValues = new java.lang.String[length];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < length; i27++) {
            java.lang.Object obj = objArr[i27];
            switch (getObjectType(obj)) {
                case 0:
                    this.types[i27] = 1;
                    i18++;
                    break;
                case 1:
                    this.types[i27] = 2;
                    this.longValues[i18] = ((java.lang.Boolean) obj).booleanValue() ? 1L : 0L;
                    i18++;
                    break;
                case 2:
                    this.types[i27] = 3;
                    this.longValues[i18] = ((java.lang.Character) obj).charValue();
                    i18++;
                    break;
                case 3:
                    this.types[i27] = 3;
                    this.longValues[i18] = ((java.lang.Byte) obj).byteValue();
                    i18++;
                    break;
                case 4:
                    this.types[i27] = 3;
                    this.longValues[i18] = ((java.lang.Short) obj).shortValue();
                    i18++;
                    break;
                case 5:
                    this.types[i27] = 3;
                    this.longValues[i18] = ((java.lang.Integer) obj).intValue();
                    i18++;
                    break;
                case 6:
                    this.types[i27] = 3;
                    this.longValues[i18] = ((java.lang.Long) obj).longValue();
                    i18++;
                    break;
                case 7:
                    this.types[i27] = 5;
                    this.doubleValues[i19] = ((java.lang.Float) obj).floatValue();
                    i19++;
                    break;
                case 8:
                    this.types[i27] = 5;
                    this.doubleValues[i19] = ((java.lang.Double) obj).doubleValue();
                    i19++;
                    break;
                case 9:
                    this.types[i27] = 6;
                    this.stringValues[i17] = (java.lang.String) obj;
                    i17++;
                    break;
                case 10:
                    com.tencent.wcdb.winq.Identifier identifier = (com.tencent.wcdb.winq.Identifier) obj;
                    this.types[i27] = com.tencent.wcdb.winq.Identifier.getCppType(identifier);
                    this.longValues[i18] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) identifier);
                    i18++;
                    break;
                case 11:
                    com.tencent.wcdb.base.Value value = (com.tencent.wcdb.base.Value) obj;
                    int i28 = com.tencent.wcdb.winq.MultiTypeArray.AnonymousClass1.$SwitchMap$com$tencent$wcdb$winq$ColumnType[value.getType().ordinal()];
                    if (i28 != 1) {
                        if (i28 != 2) {
                            if (i28 != 3) {
                                if (i28 != 4) {
                                    break;
                                } else {
                                    this.types[i27] = 6;
                                    this.stringValues[i17] = value.getText();
                                    i17++;
                                    break;
                                }
                            } else {
                                this.types[i27] = 5;
                                this.doubleValues[i19] = value.getDouble();
                                i19++;
                                break;
                            }
                        } else {
                            this.types[i27] = 3;
                            this.longValues[i18] = value.getLong();
                        }
                    } else {
                        this.types[i27] = 1;
                    }
                    i18++;
                    break;
            }
        }
        java.lang.String[] strArr = this.stringValues;
        if (strArr.length * 0.75d > i17) {
            if (i17 == 0) {
                this.stringValues = null;
            } else {
                this.stringValues = (java.lang.String[]) java.util.Arrays.copyOf(strArr, i17);
            }
        }
    }

    public static int getObjectType(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof com.tencent.wcdb.winq.Identifier) {
            return 10;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (cls == java.lang.String.class) {
            return 9;
        }
        if (cls == java.lang.Integer.class) {
            return 5;
        }
        if (cls == java.lang.Float.class) {
            return 7;
        }
        if (cls == java.lang.Double.class) {
            return 8;
        }
        if (cls == java.lang.Boolean.class) {
            return 1;
        }
        if (cls == java.lang.Short.class) {
            return 4;
        }
        if (cls == java.lang.Long.class) {
            return 6;
        }
        if (cls == java.lang.Character.class) {
            return 2;
        }
        if (cls == java.lang.Byte.class) {
            return 3;
        }
        return cls == com.tencent.wcdb.base.Value.class ? 11 : 12;
    }
}
