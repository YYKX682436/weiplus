package r45;

/* loaded from: classes9.dex */
public class zg3 extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391997f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f391998g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391999h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392000i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392001m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f392002n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f392003o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f392004p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f392006r;

    /* renamed from: d, reason: collision with root package name */
    public int f391995d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391996e = "ok";

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f392005q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zg3)) {
            return false;
        }
        r45.zg3 zg3Var = (r45.zg3) fVar;
        return n51.f.a(this.BaseResponse, zg3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f391995d), java.lang.Integer.valueOf(zg3Var.f391995d)) && n51.f.a(this.f391996e, zg3Var.f391996e) && n51.f.a(this.f391997f, zg3Var.f391997f) && n51.f.a(java.lang.Boolean.valueOf(this.f391998g), java.lang.Boolean.valueOf(zg3Var.f391998g)) && n51.f.a(this.f391999h, zg3Var.f391999h) && n51.f.a(this.f392000i, zg3Var.f392000i) && n51.f.a(this.f392001m, zg3Var.f392001m) && n51.f.a(this.f392002n, zg3Var.f392002n) && n51.f.a(this.f392003o, zg3Var.f392003o) && n51.f.a(this.f392004p, zg3Var.f392004p) && n51.f.a(this.f392005q, zg3Var.f392005q) && n51.f.a(java.lang.Boolean.valueOf(this.f392006r), java.lang.Boolean.valueOf(zg3Var.f392006r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f392005q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f391995d);
            java.lang.String str = this.f391996e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f391997f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(6, this.f391998g);
            java.lang.String str3 = this.f391999h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f392000i;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f392001m;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f392002n;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f392003o;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f392004p;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.g(13, 8, linkedList);
            fVar.a(14, this.f392006r);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f391995d);
            java.lang.String str9 = this.f391996e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f391997f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            int a17 = i18 + b36.f.a(6, this.f391998g);
            java.lang.String str11 = this.f391999h;
            if (str11 != null) {
                a17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f392000i;
            if (str12 != null) {
                a17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f392001m;
            if (str13 != null) {
                a17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f392002n;
            if (str14 != null) {
                a17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f392003o;
            if (str15 != null) {
                a17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f392004p;
            if (str16 != null) {
                a17 += b36.f.j(12, str16);
            }
            return a17 + b36.f.g(13, 8, linkedList) + b36.f.a(14, this.f392006r);
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
        r45.zg3 zg3Var = (r45.zg3) objArr[1];
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
                    zg3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                zg3Var.f391995d = aVar2.g(intValue);
                return 0;
            case 3:
                zg3Var.f391996e = aVar2.k(intValue);
                return 0;
            case 4:
                zg3Var.f391997f = aVar2.k(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                zg3Var.f391998g = aVar2.c(intValue);
                return 0;
            case 7:
                zg3Var.f391999h = aVar2.k(intValue);
                return 0;
            case 8:
                zg3Var.f392000i = aVar2.k(intValue);
                return 0;
            case 9:
                zg3Var.f392001m = aVar2.k(intValue);
                return 0;
            case 10:
                zg3Var.f392002n = aVar2.k(intValue);
                return 0;
            case 11:
                zg3Var.f392003o = aVar2.k(intValue);
                return 0;
            case 12:
                zg3Var.f392004p = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.zv3 zv3Var = new r45.zv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        zv3Var.parseFrom(bArr3);
                    }
                    zg3Var.f392005q.add(zv3Var);
                }
                return 0;
            case 14:
                zg3Var.f392006r = aVar2.c(intValue);
                return 0;
        }
    }
}
