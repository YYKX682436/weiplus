package r45;

/* loaded from: classes9.dex */
public class ni3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381418d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381419e;

    /* renamed from: f, reason: collision with root package name */
    public int f381420f;

    /* renamed from: g, reason: collision with root package name */
    public int f381421g;

    /* renamed from: i, reason: collision with root package name */
    public r45.ru f381423i;

    /* renamed from: m, reason: collision with root package name */
    public int f381424m;

    /* renamed from: n, reason: collision with root package name */
    public int f381425n;

    /* renamed from: o, reason: collision with root package name */
    public r45.iu f381426o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f381427p;

    /* renamed from: q, reason: collision with root package name */
    public r45.iu f381428q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f381429r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f381430s;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f381422h = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f381431t = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ni3)) {
            return false;
        }
        r45.ni3 ni3Var = (r45.ni3) fVar;
        return n51.f.a(this.BaseResponse, ni3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f381418d), java.lang.Integer.valueOf(ni3Var.f381418d)) && n51.f.a(this.f381419e, ni3Var.f381419e) && n51.f.a(java.lang.Integer.valueOf(this.f381420f), java.lang.Integer.valueOf(ni3Var.f381420f)) && n51.f.a(java.lang.Integer.valueOf(this.f381421g), java.lang.Integer.valueOf(ni3Var.f381421g)) && n51.f.a(this.f381422h, ni3Var.f381422h) && n51.f.a(this.f381423i, ni3Var.f381423i) && n51.f.a(java.lang.Integer.valueOf(this.f381424m), java.lang.Integer.valueOf(ni3Var.f381424m)) && n51.f.a(java.lang.Integer.valueOf(this.f381425n), java.lang.Integer.valueOf(ni3Var.f381425n)) && n51.f.a(this.f381426o, ni3Var.f381426o) && n51.f.a(this.f381427p, ni3Var.f381427p) && n51.f.a(this.f381428q, ni3Var.f381428q) && n51.f.a(this.f381429r, ni3Var.f381429r) && n51.f.a(this.f381430s, ni3Var.f381430s) && n51.f.a(this.f381431t, ni3Var.f381431t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381422h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f381418d);
            java.lang.String str = this.f381419e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f381420f);
            fVar.e(5, this.f381421g);
            fVar.g(6, 8, linkedList);
            r45.ru ruVar = this.f381423i;
            if (ruVar != null) {
                fVar.i(7, ruVar.computeSize());
                this.f381423i.writeFields(fVar);
            }
            fVar.e(8, this.f381424m);
            fVar.e(9, this.f381425n);
            r45.iu iuVar = this.f381426o;
            if (iuVar != null) {
                fVar.i(10, iuVar.computeSize());
                this.f381426o.writeFields(fVar);
            }
            java.lang.String str2 = this.f381427p;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            r45.iu iuVar2 = this.f381428q;
            if (iuVar2 != null) {
                fVar.i(12, iuVar2.computeSize());
                this.f381428q.writeFields(fVar);
            }
            java.lang.String str3 = this.f381429r;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            java.lang.String str4 = this.f381430s;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            fVar.g(15, 8, this.f381431t);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f381418d);
            java.lang.String str5 = this.f381419e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f381420f) + b36.f.e(5, this.f381421g) + b36.f.g(6, 8, linkedList);
            r45.ru ruVar2 = this.f381423i;
            if (ruVar2 != null) {
                e17 += b36.f.i(7, ruVar2.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f381424m) + b36.f.e(9, this.f381425n);
            r45.iu iuVar3 = this.f381426o;
            if (iuVar3 != null) {
                e18 += b36.f.i(10, iuVar3.computeSize());
            }
            java.lang.String str6 = this.f381427p;
            if (str6 != null) {
                e18 += b36.f.j(11, str6);
            }
            r45.iu iuVar4 = this.f381428q;
            if (iuVar4 != null) {
                e18 += b36.f.i(12, iuVar4.computeSize());
            }
            java.lang.String str7 = this.f381429r;
            if (str7 != null) {
                e18 += b36.f.j(13, str7);
            }
            java.lang.String str8 = this.f381430s;
            if (str8 != null) {
                e18 += b36.f.j(14, str8);
            }
            return e18 + b36.f.g(15, 8, this.f381431t);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f381431t.clear();
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
        r45.ni3 ni3Var = (r45.ni3) objArr[1];
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
                    ni3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ni3Var.f381418d = aVar2.g(intValue);
                return 0;
            case 3:
                ni3Var.f381419e = aVar2.k(intValue);
                return 0;
            case 4:
                ni3Var.f381420f = aVar2.g(intValue);
                return 0;
            case 5:
                ni3Var.f381421g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.tt ttVar = new r45.tt();
                    if (bArr3 != null && bArr3.length > 0) {
                        ttVar.parseFrom(bArr3);
                    }
                    ni3Var.f381422h.add(ttVar);
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ru ruVar3 = new r45.ru();
                    if (bArr4 != null && bArr4.length > 0) {
                        ruVar3.parseFrom(bArr4);
                    }
                    ni3Var.f381423i = ruVar3;
                }
                return 0;
            case 8:
                ni3Var.f381424m = aVar2.g(intValue);
                return 0;
            case 9:
                ni3Var.f381425n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.iu iuVar5 = new r45.iu();
                    if (bArr5 != null && bArr5.length > 0) {
                        iuVar5.parseFrom(bArr5);
                    }
                    ni3Var.f381426o = iuVar5;
                }
                return 0;
            case 11:
                ni3Var.f381427p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.iu iuVar6 = new r45.iu();
                    if (bArr6 != null && bArr6.length > 0) {
                        iuVar6.parseFrom(bArr6);
                    }
                    ni3Var.f381428q = iuVar6;
                }
                return 0;
            case 13:
                ni3Var.f381429r = aVar2.k(intValue);
                return 0;
            case 14:
                ni3Var.f381430s = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.xt xtVar = new r45.xt();
                    if (bArr7 != null && bArr7.length > 0) {
                        xtVar.parseFrom(bArr7);
                    }
                    ni3Var.f381431t.add(xtVar);
                }
                return 0;
            default:
                return -1;
        }
    }
}
