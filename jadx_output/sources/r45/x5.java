package r45;

/* loaded from: classes2.dex */
public class x5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389782d;

    /* renamed from: e, reason: collision with root package name */
    public int f389783e;

    /* renamed from: f, reason: collision with root package name */
    public int f389784f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389785g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389786h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389787i;

    static {
        new r45.x5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.x5 parseFrom(byte[] bArr) {
        return (r45.x5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x5)) {
            return false;
        }
        r45.x5 x5Var = (r45.x5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389782d), java.lang.Integer.valueOf(x5Var.f389782d)) && n51.f.a(java.lang.Integer.valueOf(this.f389783e), java.lang.Integer.valueOf(x5Var.f389783e)) && n51.f.a(java.lang.Integer.valueOf(this.f389784f), java.lang.Integer.valueOf(x5Var.f389784f)) && n51.f.a(this.f389785g, x5Var.f389785g) && n51.f.a(this.f389786h, x5Var.f389786h) && n51.f.a(this.f389787i, x5Var.f389787i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.x5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389782d);
            fVar.e(2, this.f389783e);
            fVar.e(3, this.f389784f);
            java.lang.String str = this.f389785g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f389786h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f389787i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389782d) + 0 + b36.f.e(2, this.f389783e) + b36.f.e(3, this.f389784f);
            java.lang.String str4 = this.f389785g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f389786h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f389787i;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        switch (intValue) {
            case 1:
                this.f389782d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f389783e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f389784f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f389785g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f389786h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f389787i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
