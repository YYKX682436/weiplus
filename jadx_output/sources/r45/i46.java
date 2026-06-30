package r45;

/* loaded from: classes4.dex */
public class i46 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376725d;

    /* renamed from: e, reason: collision with root package name */
    public int f376726e;

    /* renamed from: f, reason: collision with root package name */
    public long f376727f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376728g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376729h;

    /* renamed from: i, reason: collision with root package name */
    public long f376730i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f376731m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i46)) {
            return false;
        }
        r45.i46 i46Var = (r45.i46) fVar;
        return n51.f.a(this.f376725d, i46Var.f376725d) && n51.f.a(java.lang.Integer.valueOf(this.f376726e), java.lang.Integer.valueOf(i46Var.f376726e)) && n51.f.a(java.lang.Long.valueOf(this.f376727f), java.lang.Long.valueOf(i46Var.f376727f)) && n51.f.a(this.f376728g, i46Var.f376728g) && n51.f.a(this.f376729h, i46Var.f376729h) && n51.f.a(java.lang.Long.valueOf(this.f376730i), java.lang.Long.valueOf(i46Var.f376730i)) && n51.f.a(this.f376731m, i46Var.f376731m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376725d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f376726e);
            fVar.h(3, this.f376727f);
            java.lang.String str2 = this.f376728g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f376729h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f376730i);
            fVar.g(7, 1, this.f376731m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f376725d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f376726e) + b36.f.h(3, this.f376727f);
            java.lang.String str5 = this.f376728g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f376729h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            return j17 + b36.f.h(6, this.f376730i) + b36.f.g(7, 1, this.f376731m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f376731m.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.i46 i46Var = (r45.i46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i46Var.f376725d = aVar2.k(intValue);
                return 0;
            case 2:
                i46Var.f376726e = aVar2.g(intValue);
                return 0;
            case 3:
                i46Var.f376727f = aVar2.i(intValue);
                return 0;
            case 4:
                i46Var.f376728g = aVar2.k(intValue);
                return 0;
            case 5:
                i46Var.f376729h = aVar2.k(intValue);
                return 0;
            case 6:
                i46Var.f376730i = aVar2.i(intValue);
                return 0;
            case 7:
                i46Var.f376731m.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
