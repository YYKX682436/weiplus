package r45;

/* loaded from: classes4.dex */
public class wt6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389451d;

    /* renamed from: e, reason: collision with root package name */
    public int f389452e;

    /* renamed from: f, reason: collision with root package name */
    public int f389453f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389454g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f389455h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389456i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f389457m;

    static {
        new r45.wt6();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.wt6 parseFrom(byte[] bArr) {
        return (r45.wt6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wt6)) {
            return false;
        }
        r45.wt6 wt6Var = (r45.wt6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389451d), java.lang.Integer.valueOf(wt6Var.f389451d)) && n51.f.a(java.lang.Integer.valueOf(this.f389452e), java.lang.Integer.valueOf(wt6Var.f389452e)) && n51.f.a(java.lang.Integer.valueOf(this.f389453f), java.lang.Integer.valueOf(wt6Var.f389453f)) && n51.f.a(this.f389454g, wt6Var.f389454g) && n51.f.a(java.lang.Boolean.valueOf(this.f389455h), java.lang.Boolean.valueOf(wt6Var.f389455h)) && n51.f.a(this.f389456i, wt6Var.f389456i) && n51.f.a(java.lang.Boolean.valueOf(this.f389457m), java.lang.Boolean.valueOf(wt6Var.f389457m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.wt6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389451d);
            fVar.e(2, this.f389452e);
            fVar.e(3, this.f389453f);
            java.lang.String str = this.f389454g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.a(5, this.f389455h);
            java.lang.String str2 = this.f389456i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f389457m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389451d) + 0 + b36.f.e(2, this.f389452e) + b36.f.e(3, this.f389453f);
            java.lang.String str3 = this.f389454g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int a17 = e17 + b36.f.a(5, this.f389455h);
            java.lang.String str4 = this.f389456i;
            if (str4 != null) {
                a17 += b36.f.j(6, str4);
            }
            return a17 + b36.f.a(7, this.f389457m);
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
                this.f389451d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f389452e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f389453f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f389454g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f389455h = aVar2.c(intValue);
                return 0;
            case 6:
                this.f389456i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f389457m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
