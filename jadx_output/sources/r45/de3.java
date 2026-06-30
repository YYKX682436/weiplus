package r45;

/* loaded from: classes9.dex */
public class de3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372346d;

    /* renamed from: e, reason: collision with root package name */
    public int f372347e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zq6 f372348f;

    static {
        new r45.de3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.de3)) {
            return false;
        }
        r45.de3 de3Var = (r45.de3) fVar;
        return n51.f.a(this.f372346d, de3Var.f372346d) && n51.f.a(java.lang.Integer.valueOf(this.f372347e), java.lang.Integer.valueOf(de3Var.f372347e)) && n51.f.a(this.f372348f, de3Var.f372348f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.de3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372346d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f372347e);
            r45.zq6 zq6Var = this.f372348f;
            if (zq6Var != null) {
                fVar.i(3, zq6Var.computeSize());
                this.f372348f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f372346d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f372347e);
            r45.zq6 zq6Var2 = this.f372348f;
            return zq6Var2 != null ? j17 + b36.f.i(3, zq6Var2.computeSize()) : j17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f372346d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f372347e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.zq6 zq6Var3 = new r45.zq6();
            if (bArr != null && bArr.length > 0) {
                zq6Var3.parseFrom(bArr);
            }
            this.f372348f = zq6Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.de3) super.parseFrom(bArr);
    }
}
