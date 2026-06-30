package r45;

/* loaded from: classes8.dex */
public class d24 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372006d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372007e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372008f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f372009g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f372010h;

    /* renamed from: i, reason: collision with root package name */
    public int f372011i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372012m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d24)) {
            return false;
        }
        r45.d24 d24Var = (r45.d24) fVar;
        return n51.f.a(this.f372006d, d24Var.f372006d) && n51.f.a(this.f372007e, d24Var.f372007e) && n51.f.a(this.f372008f, d24Var.f372008f) && n51.f.a(this.f372009g, d24Var.f372009g) && n51.f.a(java.lang.Integer.valueOf(this.f372010h), java.lang.Integer.valueOf(d24Var.f372010h)) && n51.f.a(java.lang.Integer.valueOf(this.f372011i), java.lang.Integer.valueOf(d24Var.f372011i)) && n51.f.a(this.f372012m, d24Var.f372012m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372009g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372006d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372007e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372008f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList);
            fVar.e(5, this.f372010h);
            fVar.e(6, this.f372011i);
            java.lang.String str4 = this.f372012m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f372006d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f372007e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f372008f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int g17 = j17 + b36.f.g(4, 1, linkedList) + b36.f.e(5, this.f372010h) + b36.f.e(6, this.f372011i);
            java.lang.String str8 = this.f372012m;
            return str8 != null ? g17 + b36.f.j(7, str8) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.d24 d24Var = (r45.d24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d24Var.f372006d = aVar2.k(intValue);
                return 0;
            case 2:
                d24Var.f372007e = aVar2.k(intValue);
                return 0;
            case 3:
                d24Var.f372008f = aVar2.k(intValue);
                return 0;
            case 4:
                d24Var.f372009g.add(aVar2.k(intValue));
                return 0;
            case 5:
                d24Var.f372010h = aVar2.g(intValue);
                return 0;
            case 6:
                d24Var.f372011i = aVar2.g(intValue);
                return 0;
            case 7:
                d24Var.f372012m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
