package xq3;

/* loaded from: classes12.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456105d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456106e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456107f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456108g;

    /* renamed from: h, reason: collision with root package name */
    public int f456109h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.n)) {
            return false;
        }
        xq3.n nVar = (xq3.n) fVar;
        return n51.f.a(this.f456105d, nVar.f456105d) && n51.f.a(this.f456106e, nVar.f456106e) && n51.f.a(this.f456107f, nVar.f456107f) && n51.f.a(this.f456108g, nVar.f456108g) && n51.f.a(java.lang.Integer.valueOf(this.f456109h), java.lang.Integer.valueOf(nVar.f456109h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456105d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456106e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456107f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f456108g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f456109h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f456105d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f456106e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f456107f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f456108g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f456109h);
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
        xq3.n nVar = (xq3.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nVar.f456105d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            nVar.f456106e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nVar.f456107f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            nVar.f456108g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        nVar.f456109h = aVar2.g(intValue);
        return 0;
    }
}
