package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public enum ColumnType {
    Null(0),
    Integer(1),
    Float(2),
    Text(3),
    BLOB(4);

    private final int value;

    ColumnType(int i17) {
        this.value = i17;
    }

    public static com.tencent.wcdb.winq.ColumnType valueOf(int i17) {
        if (i17 == 1) {
            return Integer;
        }
        if (i17 == 2) {
            return Float;
        }
        if (i17 == 3) {
            return Text;
        }
        if (i17 != 4) {
            return Null;
        }
        return BLOB;
    }
}
