package com.tencent.wcdb.base;

/* loaded from: classes12.dex */
public class Value {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.lang.Object value;

    /* renamed from: com.tencent.wcdb.base.Value$1, reason: invalid class name */
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
            try {
                $SwitchMap$com$tencent$wcdb$winq$ColumnType[com.tencent.wcdb.winq.ColumnType.BLOB.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public Value() {
        this.value = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this || obj == this.value) {
            return true;
        }
        if (obj instanceof com.tencent.wcdb.base.Value) {
            com.tencent.wcdb.base.Value value = (com.tencent.wcdb.base.Value) obj;
            int i17 = com.tencent.wcdb.base.Value.AnonymousClass1.$SwitchMap$com$tencent$wcdb$winq$ColumnType[getType().ordinal()];
            if (i17 == 1) {
                return value.getLong() == 0;
            }
            if (i17 == 2) {
                return ((java.lang.Long) this.value).longValue() == value.getLong();
            }
            if (i17 == 3) {
                return ((java.lang.Double) this.value).doubleValue() == value.getDouble();
            }
            if (i17 == 4) {
                return this.value.equals(value.getText());
            }
            if (i17 == 5) {
                return java.util.Arrays.equals((byte[]) this.value, value.getBLOB());
            }
        }
        return java.util.Objects.deepEquals(obj, this.value);
    }

    public byte[] getBLOB() {
        java.lang.Object obj = this.value;
        if (obj == null) {
            return null;
        }
        return obj instanceof byte[] ? (byte[]) obj : obj.toString().getBytes();
    }

    public boolean getBool() {
        return getLong() != 0;
    }

    public byte getByte() {
        return (byte) getLong();
    }

    public double getDouble() {
        java.lang.Object obj = this.value;
        if (!(obj instanceof java.lang.Double) && !(obj instanceof java.lang.Long)) {
            if (!(obj instanceof java.lang.String)) {
                return 0.0d;
            }
            try {
                return java.lang.Double.parseDouble((java.lang.String) obj);
            } catch (java.lang.NumberFormatException unused) {
                return 0.0d;
            }
        }
        return ((java.lang.Double) obj).doubleValue();
    }

    public float getFloat() {
        return (float) getDouble();
    }

    public int getInt() {
        return (int) getLong();
    }

    public long getLong() {
        java.lang.Object obj = this.value;
        if (!(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String)) {
                return 0L;
            }
            try {
                return java.lang.Long.parseLong((java.lang.String) obj);
            } catch (java.lang.NumberFormatException unused) {
                return 0L;
            }
        }
        return ((java.lang.Long) obj).longValue();
    }

    public short getShort() {
        return (short) getLong();
    }

    public java.lang.String getText() {
        java.lang.Object obj = this.value;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof byte[]) {
            return new java.lang.String((byte[]) obj);
        }
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public com.tencent.wcdb.winq.ColumnType getType() {
        java.lang.Object obj = this.value;
        if (obj == null) {
            return com.tencent.wcdb.winq.ColumnType.Null;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (cls == java.lang.Long.class) {
            return com.tencent.wcdb.winq.ColumnType.Integer;
        }
        if (cls == java.lang.String.class) {
            return com.tencent.wcdb.winq.ColumnType.Text;
        }
        if (cls == byte[].class) {
            return com.tencent.wcdb.winq.ColumnType.BLOB;
        }
        if (cls == java.lang.Double.class) {
            return com.tencent.wcdb.winq.ColumnType.Float;
        }
        throw new java.lang.AssertionError();
    }

    public int hashCode() {
        java.lang.Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public Value(boolean z17) {
        this.value = java.lang.Long.valueOf(z17 ? 1L : 0L);
    }

    public Value(byte b17) {
        this.value = java.lang.Long.valueOf(b17);
    }

    public Value(int i17) {
        this.value = java.lang.Long.valueOf(i17);
    }

    public Value(long j17) {
        this.value = java.lang.Long.valueOf(j17);
    }

    public Value(float f17) {
        this.value = java.lang.Double.valueOf(f17);
    }

    public Value(double d17) {
        this.value = java.lang.Double.valueOf(d17);
    }

    public Value(java.lang.String str) {
        this.value = str;
    }

    public Value(byte[] bArr) {
        this.value = bArr;
    }

    public Value(java.lang.Object obj) {
        if (obj == null) {
            this.value = null;
            return;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (cls != java.lang.Long.class && cls != java.lang.Double.class && cls != java.lang.String.class && cls != byte[].class) {
            if (cls != java.lang.Integer.class && cls != java.lang.Short.class && cls != java.lang.Byte.class) {
                if (cls == java.lang.Float.class) {
                    this.value = java.lang.Double.valueOf(((java.lang.Number) obj).doubleValue());
                    return;
                } else {
                    this.value = obj.toString();
                    return;
                }
            }
            this.value = java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
            return;
        }
        this.value = obj;
    }

    public Value(com.tencent.wcdb.base.Value value) {
        this(value == null ? null : value.value);
    }
}
