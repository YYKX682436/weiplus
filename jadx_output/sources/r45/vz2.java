package r45;

/* loaded from: classes2.dex */
public class vz2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388689d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388690e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388692g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388694i;

    /* renamed from: p, reason: collision with root package name */
    public int f388698p;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f388691f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f388693h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f388695m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f388696n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f388697o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vz2)) {
            return false;
        }
        r45.vz2 vz2Var = (r45.vz2) fVar;
        return n51.f.a(this.f388689d, vz2Var.f388689d) && n51.f.a(this.f388690e, vz2Var.f388690e) && n51.f.a(this.f388691f, vz2Var.f388691f) && n51.f.a(this.f388692g, vz2Var.f388692g) && n51.f.a(this.f388693h, vz2Var.f388693h) && n51.f.a(this.f388694i, vz2Var.f388694i) && n51.f.a(this.f388695m, vz2Var.f388695m) && n51.f.a(this.f388696n, vz2Var.f388696n) && n51.f.a(this.f388697o, vz2Var.f388697o) && n51.f.a(java.lang.Integer.valueOf(this.f388698p), java.lang.Integer.valueOf(vz2Var.f388698p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388697o;
        java.util.LinkedList linkedList2 = this.f388696n;
        java.util.LinkedList linkedList3 = this.f388695m;
        java.util.LinkedList linkedList4 = this.f388693h;
        java.util.LinkedList linkedList5 = this.f388691f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388689d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388690e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList5);
            java.lang.String str3 = this.f388692g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.g(5, 1, linkedList4);
            java.lang.String str4 = this.f388694i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.g(7, 1, linkedList3);
            fVar.g(8, 1, linkedList2);
            fVar.g(9, 1, linkedList);
            fVar.e(10, this.f388698p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f388689d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            java.lang.String str6 = this.f388690e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int g17 = j17 + b36.f.g(3, 1, linkedList5);
            java.lang.String str7 = this.f388692g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            int g18 = g17 + b36.f.g(5, 1, linkedList4);
            java.lang.String str8 = this.f388694i;
            if (str8 != null) {
                g18 += b36.f.j(6, str8);
            }
            return g18 + b36.f.g(7, 1, linkedList3) + b36.f.g(8, 1, linkedList2) + b36.f.g(9, 1, linkedList) + b36.f.e(10, this.f388698p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
        r45.vz2 vz2Var = (r45.vz2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vz2Var.f388689d = aVar2.k(intValue);
                return 0;
            case 2:
                vz2Var.f388690e = aVar2.k(intValue);
                return 0;
            case 3:
                vz2Var.f388691f.add(aVar2.k(intValue));
                return 0;
            case 4:
                vz2Var.f388692g = aVar2.k(intValue);
                return 0;
            case 5:
                vz2Var.f388693h.add(aVar2.k(intValue));
                return 0;
            case 6:
                vz2Var.f388694i = aVar2.k(intValue);
                return 0;
            case 7:
                vz2Var.f388695m.add(aVar2.k(intValue));
                return 0;
            case 8:
                vz2Var.f388696n.add(aVar2.k(intValue));
                return 0;
            case 9:
                vz2Var.f388697o.add(aVar2.k(intValue));
                return 0;
            case 10:
                vz2Var.f388698p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
