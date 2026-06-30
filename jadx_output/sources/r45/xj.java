package r45;

/* loaded from: classes9.dex */
public class xj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390153d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390154e;

    /* renamed from: f, reason: collision with root package name */
    public int f390155f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390156g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390157h;

    /* renamed from: i, reason: collision with root package name */
    public int f390158i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390159m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f390160n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f390161o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xj)) {
            return false;
        }
        r45.xj xjVar = (r45.xj) fVar;
        return n51.f.a(this.f390153d, xjVar.f390153d) && n51.f.a(this.f390154e, xjVar.f390154e) && n51.f.a(java.lang.Integer.valueOf(this.f390155f), java.lang.Integer.valueOf(xjVar.f390155f)) && n51.f.a(this.f390156g, xjVar.f390156g) && n51.f.a(this.f390157h, xjVar.f390157h) && n51.f.a(java.lang.Integer.valueOf(this.f390158i), java.lang.Integer.valueOf(xjVar.f390158i)) && n51.f.a(this.f390159m, xjVar.f390159m) && n51.f.a(this.f390160n, xjVar.f390160n) && n51.f.a(java.lang.Integer.valueOf(this.f390161o), java.lang.Integer.valueOf(xjVar.f390161o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390160n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390153d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390154e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f390155f);
            java.lang.String str3 = this.f390156g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f390157h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f390158i);
            java.lang.String str5 = this.f390159m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.g(8, 8, linkedList);
            fVar.e(9, this.f390161o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f390153d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f390154e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f390155f);
            java.lang.String str8 = this.f390156g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f390157h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            int e18 = e17 + b36.f.e(6, this.f390158i);
            java.lang.String str10 = this.f390159m;
            if (str10 != null) {
                e18 += b36.f.j(7, str10);
            }
            return e18 + b36.f.g(8, 8, linkedList) + b36.f.e(9, this.f390161o);
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
        r45.xj xjVar = (r45.xj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xjVar.f390153d = aVar2.k(intValue);
                return 0;
            case 2:
                xjVar.f390154e = aVar2.k(intValue);
                return 0;
            case 3:
                xjVar.f390155f = aVar2.g(intValue);
                return 0;
            case 4:
                xjVar.f390156g = aVar2.k(intValue);
                return 0;
            case 5:
                xjVar.f390157h = aVar2.k(intValue);
                return 0;
            case 6:
                xjVar.f390158i = aVar2.g(intValue);
                return 0;
            case 7:
                xjVar.f390159m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.yj yjVar = new r45.yj();
                    if (bArr2 != null && bArr2.length > 0) {
                        yjVar.parseFrom(bArr2);
                    }
                    xjVar.f390160n.add(yjVar);
                }
                return 0;
            case 9:
                xjVar.f390161o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
