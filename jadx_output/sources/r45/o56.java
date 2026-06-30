package r45;

/* loaded from: classes14.dex */
public class o56 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.gc f381949d;

    /* renamed from: e, reason: collision with root package name */
    public int f381950e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fc f381951f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381952g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381953h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381954i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381955m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f381957o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f381958p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ic f381959q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f381961s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ty6 f381962t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f381963u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f381964v;

    /* renamed from: w, reason: collision with root package name */
    public r45.ec f381965w;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f381956n = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f381960r = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o56)) {
            return false;
        }
        r45.o56 o56Var = (r45.o56) fVar;
        return n51.f.a(this.BaseResponse, o56Var.BaseResponse) && n51.f.a(this.f381949d, o56Var.f381949d) && n51.f.a(java.lang.Integer.valueOf(this.f381950e), java.lang.Integer.valueOf(o56Var.f381950e)) && n51.f.a(this.f381951f, o56Var.f381951f) && n51.f.a(this.f381952g, o56Var.f381952g) && n51.f.a(this.f381953h, o56Var.f381953h) && n51.f.a(this.f381954i, o56Var.f381954i) && n51.f.a(this.f381955m, o56Var.f381955m) && n51.f.a(this.f381956n, o56Var.f381956n) && n51.f.a(this.f381957o, o56Var.f381957o) && n51.f.a(this.f381958p, o56Var.f381958p) && n51.f.a(this.f381959q, o56Var.f381959q) && n51.f.a(this.f381960r, o56Var.f381960r) && n51.f.a(this.f381961s, o56Var.f381961s) && n51.f.a(this.f381962t, o56Var.f381962t) && n51.f.a(java.lang.Boolean.valueOf(this.f381963u), java.lang.Boolean.valueOf(o56Var.f381963u)) && n51.f.a(this.f381964v, o56Var.f381964v) && n51.f.a(this.f381965w, o56Var.f381965w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381960r;
        java.util.LinkedList linkedList2 = this.f381956n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.gc gcVar = this.f381949d;
            if (gcVar != null) {
                fVar.i(2, gcVar.computeSize());
                this.f381949d.writeFields(fVar);
            }
            fVar.e(3, this.f381950e);
            r45.fc fcVar = this.f381951f;
            if (fcVar != null) {
                fVar.i(4, fcVar.computeSize());
                this.f381951f.writeFields(fVar);
            }
            java.lang.String str = this.f381952g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f381953h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f381954i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f381955m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.g(9, 8, linkedList2);
            java.lang.String str5 = this.f381957o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f381958p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            r45.ic icVar = this.f381959q;
            if (icVar != null) {
                fVar.i(12, icVar.computeSize());
                this.f381959q.writeFields(fVar);
            }
            fVar.g(13, 8, linkedList);
            java.lang.String str7 = this.f381961s;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            r45.ty6 ty6Var = this.f381962t;
            if (ty6Var != null) {
                fVar.i(15, ty6Var.computeSize());
                this.f381962t.writeFields(fVar);
            }
            fVar.a(16, this.f381963u);
            java.lang.String str8 = this.f381964v;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            r45.ec ecVar = this.f381965w;
            if (ecVar != null) {
                fVar.i(19, ecVar.computeSize());
                this.f381965w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            r45.gc gcVar2 = this.f381949d;
            if (gcVar2 != null) {
                i18 += b36.f.i(2, gcVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f381950e);
            r45.fc fcVar2 = this.f381951f;
            if (fcVar2 != null) {
                e17 += b36.f.i(4, fcVar2.computeSize());
            }
            java.lang.String str9 = this.f381952g;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f381953h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f381954i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f381955m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            int g17 = e17 + b36.f.g(9, 8, linkedList2);
            java.lang.String str13 = this.f381957o;
            if (str13 != null) {
                g17 += b36.f.j(10, str13);
            }
            java.lang.String str14 = this.f381958p;
            if (str14 != null) {
                g17 += b36.f.j(11, str14);
            }
            r45.ic icVar2 = this.f381959q;
            if (icVar2 != null) {
                g17 += b36.f.i(12, icVar2.computeSize());
            }
            int g18 = g17 + b36.f.g(13, 8, linkedList);
            java.lang.String str15 = this.f381961s;
            if (str15 != null) {
                g18 += b36.f.j(14, str15);
            }
            r45.ty6 ty6Var2 = this.f381962t;
            if (ty6Var2 != null) {
                g18 += b36.f.i(15, ty6Var2.computeSize());
            }
            int a17 = g18 + b36.f.a(16, this.f381963u);
            java.lang.String str16 = this.f381964v;
            if (str16 != null) {
                a17 += b36.f.j(17, str16);
            }
            r45.ec ecVar2 = this.f381965w;
            return ecVar2 != null ? a17 + b36.f.i(19, ecVar2.computeSize()) : a17;
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
        r45.o56 o56Var = (r45.o56) objArr[1];
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
                    o56Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.gc gcVar3 = new r45.gc();
                    if (bArr3 != null && bArr3.length > 0) {
                        gcVar3.parseFrom(bArr3);
                    }
                    o56Var.f381949d = gcVar3;
                }
                return 0;
            case 3:
                o56Var.f381950e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.fc fcVar3 = new r45.fc();
                    if (bArr4 != null && bArr4.length > 0) {
                        fcVar3.parseFrom(bArr4);
                    }
                    o56Var.f381951f = fcVar3;
                }
                return 0;
            case 5:
                o56Var.f381952g = aVar2.k(intValue);
                return 0;
            case 6:
                o56Var.f381953h = aVar2.k(intValue);
                return 0;
            case 7:
                o56Var.f381954i = aVar2.k(intValue);
                return 0;
            case 8:
                o56Var.f381955m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.hc hcVar = new r45.hc();
                    if (bArr5 != null && bArr5.length > 0) {
                        hcVar.parseFrom(bArr5);
                    }
                    o56Var.f381956n.add(hcVar);
                }
                return 0;
            case 10:
                o56Var.f381957o = aVar2.k(intValue);
                return 0;
            case 11:
                o56Var.f381958p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.ic icVar3 = new r45.ic();
                    if (bArr6 != null && bArr6.length > 0) {
                        icVar3.parseFrom(bArr6);
                    }
                    o56Var.f381959q = icVar3;
                }
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ic icVar4 = new r45.ic();
                    if (bArr7 != null && bArr7.length > 0) {
                        icVar4.parseFrom(bArr7);
                    }
                    o56Var.f381960r.add(icVar4);
                }
                return 0;
            case 14:
                o56Var.f381961s = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.ty6 ty6Var3 = new r45.ty6();
                    if (bArr8 != null && bArr8.length > 0) {
                        ty6Var3.parseFrom(bArr8);
                    }
                    o56Var.f381962t = ty6Var3;
                }
                return 0;
            case 16:
                o56Var.f381963u = aVar2.c(intValue);
                return 0;
            case 17:
                o56Var.f381964v = aVar2.k(intValue);
                return 0;
            case 18:
            default:
                return -1;
            case 19:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.ec ecVar3 = new r45.ec();
                    if (bArr9 != null && bArr9.length > 0) {
                        ecVar3.parseFrom(bArr9);
                    }
                    o56Var.f381965w = ecVar3;
                }
                return 0;
        }
    }
}
