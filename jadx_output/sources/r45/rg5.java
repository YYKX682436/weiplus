package r45;

/* loaded from: classes9.dex */
public class rg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384842d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384843e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bx3 f384844f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f384845g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public long f384846h;

    /* renamed from: i, reason: collision with root package name */
    public long f384847i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ft5 f384848m;

    /* renamed from: n, reason: collision with root package name */
    public r45.bs f384849n;

    /* renamed from: o, reason: collision with root package name */
    public r45.an6 f384850o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fq4 f384851p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tw4 f384852q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384853r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f384854s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f384855t;

    /* renamed from: u, reason: collision with root package name */
    public r45.kp4 f384856u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rg5)) {
            return false;
        }
        r45.rg5 rg5Var = (r45.rg5) fVar;
        return n51.f.a(this.BaseResponse, rg5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384842d), java.lang.Integer.valueOf(rg5Var.f384842d)) && n51.f.a(this.f384843e, rg5Var.f384843e) && n51.f.a(this.f384844f, rg5Var.f384844f) && n51.f.a(this.f384845g, rg5Var.f384845g) && n51.f.a(java.lang.Long.valueOf(this.f384846h), java.lang.Long.valueOf(rg5Var.f384846h)) && n51.f.a(java.lang.Long.valueOf(this.f384847i), java.lang.Long.valueOf(rg5Var.f384847i)) && n51.f.a(this.f384848m, rg5Var.f384848m) && n51.f.a(this.f384849n, rg5Var.f384849n) && n51.f.a(this.f384850o, rg5Var.f384850o) && n51.f.a(this.f384851p, rg5Var.f384851p) && n51.f.a(this.f384852q, rg5Var.f384852q) && n51.f.a(this.f384853r, rg5Var.f384853r) && n51.f.a(this.f384854s, rg5Var.f384854s) && n51.f.a(this.f384855t, rg5Var.f384855t) && n51.f.a(this.f384856u, rg5Var.f384856u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384845g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f384842d);
            java.lang.String str = this.f384843e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.bx3 bx3Var = this.f384844f;
            if (bx3Var != null) {
                fVar.i(4, bx3Var.computeSize());
                this.f384844f.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList);
            fVar.h(6, this.f384846h);
            fVar.h(7, this.f384847i);
            r45.ft5 ft5Var = this.f384848m;
            if (ft5Var != null) {
                fVar.i(8, ft5Var.computeSize());
                this.f384848m.writeFields(fVar);
            }
            r45.bs bsVar = this.f384849n;
            if (bsVar != null) {
                fVar.i(9, bsVar.computeSize());
                this.f384849n.writeFields(fVar);
            }
            r45.an6 an6Var = this.f384850o;
            if (an6Var != null) {
                fVar.i(10, an6Var.computeSize());
                this.f384850o.writeFields(fVar);
            }
            r45.fq4 fq4Var = this.f384851p;
            if (fq4Var != null) {
                fVar.i(11, fq4Var.computeSize());
                this.f384851p.writeFields(fVar);
            }
            r45.tw4 tw4Var = this.f384852q;
            if (tw4Var != null) {
                fVar.i(12, tw4Var.computeSize());
                this.f384852q.writeFields(fVar);
            }
            java.lang.String str2 = this.f384853r;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            java.lang.String str3 = this.f384854s;
            if (str3 != null) {
                fVar.j(14, str3);
            }
            java.lang.String str4 = this.f384855t;
            if (str4 != null) {
                fVar.j(15, str4);
            }
            r45.kp4 kp4Var = this.f384856u;
            if (kp4Var != null) {
                fVar.i(16, kp4Var.computeSize());
                this.f384856u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f384842d);
            java.lang.String str5 = this.f384843e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            r45.bx3 bx3Var2 = this.f384844f;
            if (bx3Var2 != null) {
                i18 += b36.f.i(4, bx3Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList) + b36.f.h(6, this.f384846h) + b36.f.h(7, this.f384847i);
            r45.ft5 ft5Var2 = this.f384848m;
            if (ft5Var2 != null) {
                g17 += b36.f.i(8, ft5Var2.computeSize());
            }
            r45.bs bsVar2 = this.f384849n;
            if (bsVar2 != null) {
                g17 += b36.f.i(9, bsVar2.computeSize());
            }
            r45.an6 an6Var2 = this.f384850o;
            if (an6Var2 != null) {
                g17 += b36.f.i(10, an6Var2.computeSize());
            }
            r45.fq4 fq4Var2 = this.f384851p;
            if (fq4Var2 != null) {
                g17 += b36.f.i(11, fq4Var2.computeSize());
            }
            r45.tw4 tw4Var2 = this.f384852q;
            if (tw4Var2 != null) {
                g17 += b36.f.i(12, tw4Var2.computeSize());
            }
            java.lang.String str6 = this.f384853r;
            if (str6 != null) {
                g17 += b36.f.j(13, str6);
            }
            java.lang.String str7 = this.f384854s;
            if (str7 != null) {
                g17 += b36.f.j(14, str7);
            }
            java.lang.String str8 = this.f384855t;
            if (str8 != null) {
                g17 += b36.f.j(15, str8);
            }
            r45.kp4 kp4Var2 = this.f384856u;
            return kp4Var2 != null ? g17 + b36.f.i(16, kp4Var2.computeSize()) : g17;
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
        r45.rg5 rg5Var = (r45.rg5) objArr[1];
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
                    rg5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                rg5Var.f384842d = aVar2.g(intValue);
                return 0;
            case 3:
                rg5Var.f384843e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.bx3 bx3Var3 = new r45.bx3();
                    if (bArr3 != null && bArr3.length > 0) {
                        bx3Var3.parseFrom(bArr3);
                    }
                    rg5Var.f384844f = bx3Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.v55 v55Var = new r45.v55();
                    if (bArr4 != null && bArr4.length > 0) {
                        v55Var.parseFrom(bArr4);
                    }
                    rg5Var.f384845g.add(v55Var);
                }
                return 0;
            case 6:
                rg5Var.f384846h = aVar2.i(intValue);
                return 0;
            case 7:
                rg5Var.f384847i = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ft5 ft5Var3 = new r45.ft5();
                    if (bArr5 != null && bArr5.length > 0) {
                        ft5Var3.parseFrom(bArr5);
                    }
                    rg5Var.f384848m = ft5Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.bs bsVar3 = new r45.bs();
                    if (bArr6 != null && bArr6.length > 0) {
                        bsVar3.parseFrom(bArr6);
                    }
                    rg5Var.f384849n = bsVar3;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.an6 an6Var3 = new r45.an6();
                    if (bArr7 != null && bArr7.length > 0) {
                        an6Var3.parseFrom(bArr7);
                    }
                    rg5Var.f384850o = an6Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.fq4 fq4Var3 = new r45.fq4();
                    if (bArr8 != null && bArr8.length > 0) {
                        fq4Var3.parseFrom(bArr8);
                    }
                    rg5Var.f384851p = fq4Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr9 != null && bArr9.length > 0) {
                        tw4Var3.parseFrom(bArr9);
                    }
                    rg5Var.f384852q = tw4Var3;
                }
                return 0;
            case 13:
                rg5Var.f384853r = aVar2.k(intValue);
                return 0;
            case 14:
                rg5Var.f384854s = aVar2.k(intValue);
                return 0;
            case 15:
                rg5Var.f384855t = aVar2.k(intValue);
                return 0;
            case 16:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.kp4 kp4Var3 = new r45.kp4();
                    if (bArr10 != null && bArr10.length > 0) {
                        kp4Var3.parseFrom(bArr10);
                    }
                    rg5Var.f384856u = kp4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
