package r45;

/* loaded from: classes2.dex */
public class ps3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383374d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383375e;

    /* renamed from: f, reason: collision with root package name */
    public int f383376f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383377g;

    /* renamed from: h, reason: collision with root package name */
    public r45.q35 f383378h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383380m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383381n;

    /* renamed from: o, reason: collision with root package name */
    public int f383382o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f383383p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383384q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f383385r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f383386s;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f383379i = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f383387t = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ps3)) {
            return false;
        }
        r45.ps3 ps3Var = (r45.ps3) fVar;
        return n51.f.a(this.BaseResponse, ps3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383374d), java.lang.Integer.valueOf(ps3Var.f383374d)) && n51.f.a(this.f383375e, ps3Var.f383375e) && n51.f.a(java.lang.Integer.valueOf(this.f383376f), java.lang.Integer.valueOf(ps3Var.f383376f)) && n51.f.a(this.f383377g, ps3Var.f383377g) && n51.f.a(this.f383378h, ps3Var.f383378h) && n51.f.a(this.f383379i, ps3Var.f383379i) && n51.f.a(this.f383380m, ps3Var.f383380m) && n51.f.a(this.f383381n, ps3Var.f383381n) && n51.f.a(java.lang.Integer.valueOf(this.f383382o), java.lang.Integer.valueOf(ps3Var.f383382o)) && n51.f.a(this.f383383p, ps3Var.f383383p) && n51.f.a(this.f383384q, ps3Var.f383384q) && n51.f.a(this.f383385r, ps3Var.f383385r) && n51.f.a(this.f383386s, ps3Var.f383386s) && n51.f.a(this.f383387t, ps3Var.f383387t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383387t;
        java.util.LinkedList linkedList2 = this.f383379i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f383374d);
            java.lang.String str = this.f383375e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f383376f);
            java.lang.String str2 = this.f383377g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.q35 q35Var = this.f383378h;
            if (q35Var != null) {
                fVar.i(6, q35Var.computeSize());
                this.f383378h.writeFields(fVar);
            }
            fVar.g(7, 8, linkedList2);
            java.lang.String str3 = this.f383380m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f383381n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f383382o);
            java.lang.String str5 = this.f383383p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f383384q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f383385r;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f383386s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            fVar.g(16, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f383374d);
            java.lang.String str9 = this.f383375e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int e17 = i18 + b36.f.e(4, this.f383376f);
            java.lang.String str10 = this.f383377g;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            r45.q35 q35Var2 = this.f383378h;
            if (q35Var2 != null) {
                e17 += b36.f.i(6, q35Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList2);
            java.lang.String str11 = this.f383380m;
            if (str11 != null) {
                g17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f383381n;
            if (str12 != null) {
                g17 += b36.f.j(9, str12);
            }
            int e18 = g17 + b36.f.e(10, this.f383382o);
            java.lang.String str13 = this.f383383p;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f383384q;
            if (str14 != null) {
                e18 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f383385r;
            if (str15 != null) {
                e18 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f383386s;
            if (str16 != null) {
                e18 += b36.f.j(14, str16);
            }
            return e18 + b36.f.g(16, 8, linkedList);
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
        r45.ps3 ps3Var = (r45.ps3) objArr[1];
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
                    ps3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ps3Var.f383374d = aVar2.g(intValue);
                return 0;
            case 3:
                ps3Var.f383375e = aVar2.k(intValue);
                return 0;
            case 4:
                ps3Var.f383376f = aVar2.g(intValue);
                return 0;
            case 5:
                ps3Var.f383377g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.q35 q35Var3 = new r45.q35();
                    if (bArr3 != null && bArr3.length > 0) {
                        q35Var3.parseFrom(bArr3);
                    }
                    ps3Var.f383378h = q35Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.xp4 xp4Var = new r45.xp4();
                    if (bArr4 != null && bArr4.length > 0) {
                        xp4Var.parseFrom(bArr4);
                    }
                    ps3Var.f383379i.add(xp4Var);
                }
                return 0;
            case 8:
                ps3Var.f383380m = aVar2.k(intValue);
                return 0;
            case 9:
                ps3Var.f383381n = aVar2.k(intValue);
                return 0;
            case 10:
                ps3Var.f383382o = aVar2.g(intValue);
                return 0;
            case 11:
                ps3Var.f383383p = aVar2.k(intValue);
                return 0;
            case 12:
                ps3Var.f383384q = aVar2.k(intValue);
                return 0;
            case 13:
                ps3Var.f383385r = aVar2.k(intValue);
                return 0;
            case 14:
                ps3Var.f383386s = aVar2.k(intValue);
                return 0;
            case 15:
            default:
                return -1;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ee7 ee7Var = new r45.ee7();
                    if (bArr5 != null && bArr5.length > 0) {
                        ee7Var.parseFrom(bArr5);
                    }
                    ps3Var.f383387t.add(ee7Var);
                }
                return 0;
        }
    }
}
