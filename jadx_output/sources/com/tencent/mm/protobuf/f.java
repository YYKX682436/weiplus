package com.tencent.mm.protobuf;

/* loaded from: classes8.dex */
public class f {
    protected static final int OPCODE_COMPUTESIZE = 1;
    protected static final int OPCODE_PARSEFROM = 2;
    protected static final int OPCODE_POPULATEBUILDERWITHFIELD = 3;
    protected static final int OPCODE_WRITEFIELDS = 0;
    protected static d36.b unknownTagHandler = new d36.a();
    protected boolean __includeUnKnownField = false;
    protected byte[] __initialProtobufBytes;

    public static int getNextFieldNumber(c36.a aVar) {
        return aVar.a();
    }

    public static <T extends com.tencent.mm.protobuf.f> T mmPbUnSerialize(T t17, byte[] bArr) {
        try {
            return (T) t17.newInstance().parseFrom(bArr);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return equals(fVar);
    }

    public int computeSize() {
        int i17 = 0;
        try {
            i17 = op(1, new java.lang.Object[0]);
            com.tencent.mm.protobuf.n.c(this.__initialProtobufBytes, java.lang.Integer.valueOf(i17));
            return i17;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.protobuf.n.a("computeSize error", e17);
            return i17;
        }
    }

    public com.tencent.mm.protobuf.f fromJson(java.lang.String str) {
        return this;
    }

    @java.lang.Deprecated
    public byte[] getData() {
        return this.__initialProtobufBytes;
    }

    public boolean includeUnKnownField() {
        return this.__includeUnKnownField;
    }

    public byte[] initialProtobufBytes() {
        return this.__initialProtobufBytes;
    }

    public com.tencent.mm.protobuf.f newInstance() {
        return null;
    }

    public int op(int i17, java.lang.Object... objArr) {
        throw new java.lang.Error("Cannot use this method");
    }

    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        this.__initialProtobufBytes = bArr;
        com.tencent.mm.protobuf.n.c(bArr, -2);
        op(2, bArr);
        return this;
    }

    public boolean populateBuilderWithField(c36.a aVar, com.tencent.mm.protobuf.f fVar, int i17) {
        int op6 = op(3, aVar, fVar, java.lang.Integer.valueOf(i17));
        boolean z17 = true;
        boolean z18 = op6 == 0;
        if (!this.__includeUnKnownField && z18) {
            z17 = false;
        }
        this.__includeUnKnownField = z17;
        return z18;
    }

    public byte[] toByteArray() {
        validate();
        g36.f fVar = new g36.f(new byte[computeSize()]);
        writeFields(fVar);
        f36.a aVar = fVar.f268192b;
        int i17 = aVar.f259374b;
        int i18 = aVar.f259375c;
        int i19 = i17 - i18;
        byte[] bArr = fVar.f268191a;
        if (i19 == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i18];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i18);
        return bArr2;
    }

    public byte[] toByteArrayOrNull() {
        try {
            return toByteArray();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public java.lang.Object toJSON() {
        return "";
    }

    public com.tencent.mm.protobuf.f validate() {
        return this;
    }

    public void writeFields(g36.f fVar) {
        op(0, fVar);
    }
}
