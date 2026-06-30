package r45;

/* loaded from: classes10.dex */
public class g02 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374769e;

    /* renamed from: f, reason: collision with root package name */
    public long f374770f;

    /* renamed from: g, reason: collision with root package name */
    public long f374771g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374772h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374773i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374774m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f374768d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f374775n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g02)) {
            return false;
        }
        r45.g02 g02Var = (r45.g02) fVar;
        return n51.f.a(this.f374768d, g02Var.f374768d) && n51.f.a(this.f374769e, g02Var.f374769e) && n51.f.a(java.lang.Long.valueOf(this.f374770f), java.lang.Long.valueOf(g02Var.f374770f)) && n51.f.a(java.lang.Long.valueOf(this.f374771g), java.lang.Long.valueOf(g02Var.f374771g)) && n51.f.a(this.f374772h, g02Var.f374772h) && n51.f.a(this.f374773i, g02Var.f374773i) && n51.f.a(this.f374774m, g02Var.f374774m) && n51.f.a(this.f374775n, g02Var.f374775n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374775n;
        java.util.LinkedList linkedList2 = this.f374768d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            java.lang.String str = this.f374769e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f374770f);
            fVar.h(4, this.f374771g);
            java.lang.String str2 = this.f374772h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f374773i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f374774m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            java.lang.String str5 = this.f374769e;
            if (str5 != null) {
                g17 += b36.f.j(2, str5);
            }
            int h17 = g17 + b36.f.h(3, this.f374770f) + b36.f.h(4, this.f374771g);
            java.lang.String str6 = this.f374772h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f374773i;
            if (str7 != null) {
                h17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f374774m;
            if (str8 != null) {
                h17 += b36.f.j(7, str8);
            }
            return h17 + b36.f.g(8, 8, linkedList);
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
        r45.g02 g02Var = (r45.g02) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.dm4 dm4Var = new r45.dm4();
                    if (bArr2 != null && bArr2.length > 0) {
                        dm4Var.parseFrom(bArr2);
                    }
                    g02Var.f374768d.add(dm4Var);
                }
                return 0;
            case 2:
                g02Var.f374769e = aVar2.k(intValue);
                return 0;
            case 3:
                g02Var.f374770f = aVar2.i(intValue);
                return 0;
            case 4:
                g02Var.f374771g = aVar2.i(intValue);
                return 0;
            case 5:
                g02Var.f374772h = aVar2.k(intValue);
                return 0;
            case 6:
                g02Var.f374773i = aVar2.k(intValue);
                return 0;
            case 7:
                g02Var.f374774m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ql4 ql4Var = new r45.ql4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ql4Var.parseFrom(bArr3);
                    }
                    g02Var.f374775n.add(ql4Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
