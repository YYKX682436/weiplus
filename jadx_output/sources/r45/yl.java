package r45;

/* loaded from: classes2.dex */
public class yl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391189d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391190e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391191f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391192g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391193h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391194i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391195m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f391196n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f391197o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f391198p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yl)) {
            return false;
        }
        r45.yl ylVar = (r45.yl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391189d), java.lang.Integer.valueOf(ylVar.f391189d)) && n51.f.a(this.f391190e, ylVar.f391190e) && n51.f.a(this.f391191f, ylVar.f391191f) && n51.f.a(this.f391192g, ylVar.f391192g) && n51.f.a(this.f391193h, ylVar.f391193h) && n51.f.a(this.f391194i, ylVar.f391194i) && n51.f.a(this.f391195m, ylVar.f391195m) && n51.f.a(this.f391196n, ylVar.f391196n) && n51.f.a(this.f391197o, ylVar.f391197o) && n51.f.a(java.lang.Integer.valueOf(this.f391198p), java.lang.Integer.valueOf(ylVar.f391198p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391197o;
        java.util.LinkedList linkedList2 = this.f391196n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391189d);
            java.lang.String str = this.f391190e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f391191f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f391192g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f391193h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f391194i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f391195m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.g(8, 8, linkedList2);
            fVar.g(9, 1, linkedList);
            fVar.e(10, this.f391198p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391189d) + 0;
            java.lang.String str7 = this.f391190e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f391191f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f391192g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f391193h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f391194i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f391195m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            return e17 + b36.f.g(8, 8, linkedList2) + b36.f.g(9, 1, linkedList) + b36.f.e(10, this.f391198p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.yl ylVar = (r45.yl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ylVar.f391189d = aVar2.g(intValue);
                return 0;
            case 2:
                ylVar.f391190e = aVar2.k(intValue);
                return 0;
            case 3:
                ylVar.f391191f = aVar2.k(intValue);
                return 0;
            case 4:
                ylVar.f391192g = aVar2.k(intValue);
                return 0;
            case 5:
                ylVar.f391193h = aVar2.k(intValue);
                return 0;
            case 6:
                ylVar.f391194i = aVar2.k(intValue);
                return 0;
            case 7:
                ylVar.f391195m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.xl xlVar = new r45.xl();
                    if (bArr2 != null && bArr2.length > 0) {
                        xlVar.parseFrom(bArr2);
                    }
                    ylVar.f391196n.add(xlVar);
                }
                return 0;
            case 9:
                ylVar.f391197o.add(aVar2.k(intValue));
                return 0;
            case 10:
                ylVar.f391198p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
