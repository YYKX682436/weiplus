package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class Identifier extends com.tencent.wcdb.base.CppObject implements com.tencent.wcdb.winq.IdentifierConvertible {
    public static int getCppType(com.tencent.wcdb.winq.Identifier identifier) {
        if (identifier == null) {
            return 1;
        }
        return identifier.getType();
    }

    private static native java.lang.String getDescription(long j17);

    public static native boolean isWriteStatement(long j17);

    public com.tencent.wcdb.winq.Identifier asIdentifier() {
        return this;
    }

    public java.lang.String getDescription() {
        return getDescription(this.cppObj);
    }

    public int getType() {
        return 0;
    }

    public java.lang.String toString() {
        return getDescription();
    }

    public static int getCppType(com.tencent.wcdb.winq.IdentifierConvertible identifierConvertible) {
        if (identifierConvertible == null) {
            return 1;
        }
        return identifierConvertible.asIdentifier().getType();
    }
}
