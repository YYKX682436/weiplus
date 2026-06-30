package r45;

/* loaded from: classes9.dex */
public class v45 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387879d;

    /* renamed from: e, reason: collision with root package name */
    public int f387880e;

    /* renamed from: f, reason: collision with root package name */
    public int f387881f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387882g;

    /* renamed from: h, reason: collision with root package name */
    public long f387883h;

    /* renamed from: i, reason: collision with root package name */
    public int f387884i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387885m;

    /* renamed from: n, reason: collision with root package name */
    public int f387886n;

    static {
        new r45.v45();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.v45 parseFrom(byte[] bArr) {
        return (r45.v45) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v45)) {
            return false;
        }
        r45.v45 v45Var = (r45.v45) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387879d), java.lang.Integer.valueOf(v45Var.f387879d)) && n51.f.a(java.lang.Integer.valueOf(this.f387880e), java.lang.Integer.valueOf(v45Var.f387880e)) && n51.f.a(java.lang.Integer.valueOf(this.f387881f), java.lang.Integer.valueOf(v45Var.f387881f)) && n51.f.a(this.f387882g, v45Var.f387882g) && n51.f.a(java.lang.Long.valueOf(this.f387883h), java.lang.Long.valueOf(v45Var.f387883h)) && n51.f.a(java.lang.Integer.valueOf(this.f387884i), java.lang.Integer.valueOf(v45Var.f387884i)) && n51.f.a(this.f387885m, v45Var.f387885m) && n51.f.a(java.lang.Integer.valueOf(this.f387886n), java.lang.Integer.valueOf(v45Var.f387886n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.v45();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387879d);
            fVar.e(2, this.f387880e);
            fVar.e(3, this.f387881f);
            java.lang.String str = this.f387882g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f387883h);
            fVar.e(6, this.f387884i);
            java.lang.String str2 = this.f387885m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f387886n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387879d) + 0 + b36.f.e(2, this.f387880e) + b36.f.e(3, this.f387881f);
            java.lang.String str3 = this.f387882g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int h17 = e17 + b36.f.h(5, this.f387883h) + b36.f.e(6, this.f387884i);
            java.lang.String str4 = this.f387885m;
            if (str4 != null) {
                h17 += b36.f.j(7, str4);
            }
            return h17 + b36.f.e(8, this.f387886n);
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
                this.f387879d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f387880e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f387881f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f387882g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f387883h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f387884i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f387885m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f387886n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
