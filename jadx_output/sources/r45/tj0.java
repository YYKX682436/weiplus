package r45;

/* loaded from: classes11.dex */
public class tj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386495d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386496e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386497f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386498g;

    /* renamed from: h, reason: collision with root package name */
    public int f386499h;

    /* renamed from: i, reason: collision with root package name */
    public int f386500i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386501m;

    /* renamed from: n, reason: collision with root package name */
    public int f386502n;

    /* renamed from: o, reason: collision with root package name */
    public long f386503o;

    static {
        new r45.tj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.tj0 parseFrom(byte[] bArr) {
        return (r45.tj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tj0)) {
            return false;
        }
        r45.tj0 tj0Var = (r45.tj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386495d), java.lang.Integer.valueOf(tj0Var.f386495d)) && n51.f.a(this.f386496e, tj0Var.f386496e) && n51.f.a(this.f386497f, tj0Var.f386497f) && n51.f.a(this.f386498g, tj0Var.f386498g) && n51.f.a(java.lang.Integer.valueOf(this.f386499h), java.lang.Integer.valueOf(tj0Var.f386499h)) && n51.f.a(java.lang.Integer.valueOf(this.f386500i), java.lang.Integer.valueOf(tj0Var.f386500i)) && n51.f.a(this.f386501m, tj0Var.f386501m) && n51.f.a(java.lang.Integer.valueOf(this.f386502n), java.lang.Integer.valueOf(tj0Var.f386502n)) && n51.f.a(java.lang.Long.valueOf(this.f386503o), java.lang.Long.valueOf(tj0Var.f386503o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.tj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386495d);
            java.lang.String str = this.f386496e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386497f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386498g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f386499h);
            fVar.e(6, this.f386500i);
            java.lang.String str4 = this.f386501m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f386502n);
            fVar.h(9, this.f386503o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386495d) + 0;
            java.lang.String str5 = this.f386496e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f386497f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f386498g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f386499h) + b36.f.e(6, this.f386500i);
            java.lang.String str8 = this.f386501m;
            if (str8 != null) {
                e18 += b36.f.j(7, str8);
            }
            return e18 + b36.f.e(8, this.f386502n) + b36.f.h(9, this.f386503o);
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
                this.f386495d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f386496e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f386497f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f386498g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f386499h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f386500i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f386501m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f386502n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f386503o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
