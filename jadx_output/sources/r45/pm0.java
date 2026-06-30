package r45;

/* loaded from: classes7.dex */
public class pm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383174d;

    /* renamed from: e, reason: collision with root package name */
    public int f383175e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383176f;

    /* renamed from: g, reason: collision with root package name */
    public int f383177g;

    static {
        new r45.pm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pm0)) {
            return false;
        }
        r45.pm0 pm0Var = (r45.pm0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383174d), java.lang.Integer.valueOf(pm0Var.f383174d)) && n51.f.a(java.lang.Integer.valueOf(this.f383175e), java.lang.Integer.valueOf(pm0Var.f383175e)) && n51.f.a(this.f383176f, pm0Var.f383176f) && n51.f.a(java.lang.Integer.valueOf(this.f383177g), java.lang.Integer.valueOf(pm0Var.f383177g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.pm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383174d);
            fVar.e(2, this.f383175e);
            java.lang.String str = this.f383176f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f383177g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383174d) + 0 + b36.f.e(2, this.f383175e);
            java.lang.String str2 = this.f383176f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.e(4, this.f383177g);
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
            this.f383174d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f383175e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f383176f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f383177g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.pm0) super.parseFrom(bArr);
    }
}
