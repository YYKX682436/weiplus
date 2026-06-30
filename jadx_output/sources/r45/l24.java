package r45;

/* loaded from: classes7.dex */
public class l24 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f379086d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379087e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f379088f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379089g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379090h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379091i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379092m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379093n;

    /* renamed from: o, reason: collision with root package name */
    public int f379094o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f379095p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f379096q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l24)) {
            return false;
        }
        r45.l24 l24Var = (r45.l24) fVar;
        return n51.f.a(this.BaseResponse, l24Var.BaseResponse) && n51.f.a(this.f379086d, l24Var.f379086d) && n51.f.a(this.f379087e, l24Var.f379087e) && n51.f.a(this.f379088f, l24Var.f379088f) && n51.f.a(this.f379089g, l24Var.f379089g) && n51.f.a(this.f379090h, l24Var.f379090h) && n51.f.a(this.f379091i, l24Var.f379091i) && n51.f.a(this.f379092m, l24Var.f379092m) && n51.f.a(this.f379093n, l24Var.f379093n) && n51.f.a(java.lang.Integer.valueOf(this.f379094o), java.lang.Integer.valueOf(l24Var.f379094o)) && n51.f.a(this.f379095p, l24Var.f379095p) && n51.f.a(this.f379096q, l24Var.f379096q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379088f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.j14 j14Var = this.f379086d;
            if (j14Var != null) {
                fVar.i(2, j14Var.computeSize());
                this.f379086d.writeFields(fVar);
            }
            java.lang.String str = this.f379087e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            java.lang.String str2 = this.f379089g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f379090h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f379091i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f379092m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f379093n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.e(10, this.f379094o);
            java.lang.String str7 = this.f379095p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f379096q;
            if (str8 == null) {
                return 0;
            }
            fVar.j(12, str8);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.j14 j14Var2 = this.f379086d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.computeSize());
            }
            java.lang.String str9 = this.f379087e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            java.lang.String str10 = this.f379089g;
            if (str10 != null) {
                g17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f379090h;
            if (str11 != null) {
                g17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f379091i;
            if (str12 != null) {
                g17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f379092m;
            if (str13 != null) {
                g17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f379093n;
            if (str14 != null) {
                g17 += b36.f.j(9, str14);
            }
            int e17 = g17 + b36.f.e(10, this.f379094o);
            java.lang.String str15 = this.f379095p;
            if (str15 != null) {
                e17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f379096q;
            return str16 != null ? e17 + b36.f.j(12, str16) : e17;
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
        r45.l24 l24Var = (r45.l24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    l24Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr3 != null && bArr3.length > 0) {
                        j14Var3.parseFrom(bArr3);
                    }
                    l24Var.f379086d = j14Var3;
                }
                return 0;
            case 3:
                l24Var.f379087e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.jv5 jv5Var = new r45.jv5();
                    if (bArr4 != null && bArr4.length > 0) {
                        jv5Var.parseFrom(bArr4);
                    }
                    l24Var.f379088f.add(jv5Var);
                }
                return 0;
            case 5:
                l24Var.f379089g = aVar2.k(intValue);
                return 0;
            case 6:
                l24Var.f379090h = aVar2.k(intValue);
                return 0;
            case 7:
                l24Var.f379091i = aVar2.k(intValue);
                return 0;
            case 8:
                l24Var.f379092m = aVar2.k(intValue);
                return 0;
            case 9:
                l24Var.f379093n = aVar2.k(intValue);
                return 0;
            case 10:
                l24Var.f379094o = aVar2.g(intValue);
                return 0;
            case 11:
                l24Var.f379095p = aVar2.k(intValue);
                return 0;
            case 12:
                l24Var.f379096q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
