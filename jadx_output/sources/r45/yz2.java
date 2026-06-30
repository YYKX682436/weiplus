package r45;

/* loaded from: classes2.dex */
public class yz2 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public r45.l42 f391518e;

    /* renamed from: f, reason: collision with root package name */
    public int f391519f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391520g;

    /* renamed from: h, reason: collision with root package name */
    public int f391521h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391522i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f391523m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f391524n;

    /* renamed from: p, reason: collision with root package name */
    public int f391526p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f391527q;

    /* renamed from: r, reason: collision with root package name */
    public int f391528r;

    /* renamed from: s, reason: collision with root package name */
    public r45.s92 f391529s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ha2 f391530t;

    /* renamed from: u, reason: collision with root package name */
    public r45.vz2 f391531u;

    /* renamed from: v, reason: collision with root package name */
    public r45.zz2 f391532v;

    /* renamed from: w, reason: collision with root package name */
    public int f391533w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f391534x;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f391517d = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f391525o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yz2)) {
            return false;
        }
        r45.yz2 yz2Var = (r45.yz2) fVar;
        return n51.f.a(this.BaseResponse, yz2Var.BaseResponse) && n51.f.a(this.f391517d, yz2Var.f391517d) && n51.f.a(this.f391518e, yz2Var.f391518e) && n51.f.a(java.lang.Integer.valueOf(this.f391519f), java.lang.Integer.valueOf(yz2Var.f391519f)) && n51.f.a(this.f391520g, yz2Var.f391520g) && n51.f.a(java.lang.Integer.valueOf(this.f391521h), java.lang.Integer.valueOf(yz2Var.f391521h)) && n51.f.a(this.f391522i, yz2Var.f391522i) && n51.f.a(java.lang.Boolean.valueOf(this.f391523m), java.lang.Boolean.valueOf(yz2Var.f391523m)) && n51.f.a(java.lang.Boolean.valueOf(this.f391524n), java.lang.Boolean.valueOf(yz2Var.f391524n)) && n51.f.a(this.f391525o, yz2Var.f391525o) && n51.f.a(java.lang.Integer.valueOf(this.f391526p), java.lang.Integer.valueOf(yz2Var.f391526p)) && n51.f.a(java.lang.Boolean.valueOf(this.f391527q), java.lang.Boolean.valueOf(yz2Var.f391527q)) && n51.f.a(java.lang.Integer.valueOf(this.f391528r), java.lang.Integer.valueOf(yz2Var.f391528r)) && n51.f.a(this.f391529s, yz2Var.f391529s) && n51.f.a(this.f391530t, yz2Var.f391530t) && n51.f.a(this.f391531u, yz2Var.f391531u) && n51.f.a(this.f391532v, yz2Var.f391532v) && n51.f.a(java.lang.Integer.valueOf(this.f391533w), java.lang.Integer.valueOf(yz2Var.f391533w)) && n51.f.a(java.lang.Boolean.valueOf(this.f391534x), java.lang.Boolean.valueOf(yz2Var.f391534x));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391525o;
        java.util.LinkedList linkedList2 = this.f391517d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            r45.l42 l42Var = this.f391518e;
            if (l42Var != null) {
                fVar.i(3, l42Var.computeSize());
                this.f391518e.writeFields(fVar);
            }
            fVar.e(4, this.f391519f);
            com.tencent.mm.protobuf.g gVar = this.f391520g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.e(6, this.f391521h);
            com.tencent.mm.protobuf.g gVar2 = this.f391522i;
            if (gVar2 != null) {
                fVar.b(7, gVar2);
            }
            fVar.a(8, this.f391523m);
            fVar.a(9, this.f391524n);
            fVar.g(10, 8, linkedList);
            fVar.e(11, this.f391526p);
            fVar.a(12, this.f391527q);
            fVar.e(13, this.f391528r);
            r45.s92 s92Var = this.f391529s;
            if (s92Var != null) {
                fVar.i(14, s92Var.computeSize());
                this.f391529s.writeFields(fVar);
            }
            r45.ha2 ha2Var = this.f391530t;
            if (ha2Var != null) {
                fVar.i(15, ha2Var.computeSize());
                this.f391530t.writeFields(fVar);
            }
            r45.vz2 vz2Var = this.f391531u;
            if (vz2Var != null) {
                fVar.i(16, vz2Var.computeSize());
                this.f391531u.writeFields(fVar);
            }
            r45.zz2 zz2Var = this.f391532v;
            if (zz2Var != null) {
                fVar.i(17, zz2Var.computeSize());
                this.f391532v.writeFields(fVar);
            }
            fVar.e(18, this.f391533w);
            fVar.a(19, this.f391534x);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.g(2, 8, linkedList2);
            r45.l42 l42Var2 = this.f391518e;
            if (l42Var2 != null) {
                i18 += b36.f.i(3, l42Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f391519f);
            com.tencent.mm.protobuf.g gVar3 = this.f391520g;
            if (gVar3 != null) {
                e17 += b36.f.b(5, gVar3);
            }
            int e18 = e17 + b36.f.e(6, this.f391521h);
            com.tencent.mm.protobuf.g gVar4 = this.f391522i;
            if (gVar4 != null) {
                e18 += b36.f.b(7, gVar4);
            }
            int a17 = e18 + b36.f.a(8, this.f391523m) + b36.f.a(9, this.f391524n) + b36.f.g(10, 8, linkedList) + b36.f.e(11, this.f391526p) + b36.f.a(12, this.f391527q) + b36.f.e(13, this.f391528r);
            r45.s92 s92Var2 = this.f391529s;
            if (s92Var2 != null) {
                a17 += b36.f.i(14, s92Var2.computeSize());
            }
            r45.ha2 ha2Var2 = this.f391530t;
            if (ha2Var2 != null) {
                a17 += b36.f.i(15, ha2Var2.computeSize());
            }
            r45.vz2 vz2Var2 = this.f391531u;
            if (vz2Var2 != null) {
                a17 += b36.f.i(16, vz2Var2.computeSize());
            }
            r45.zz2 zz2Var2 = this.f391532v;
            if (zz2Var2 != null) {
                a17 += b36.f.i(17, zz2Var2.computeSize());
            }
            return a17 + b36.f.e(18, this.f391533w) + b36.f.a(19, this.f391534x);
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
        r45.yz2 yz2Var = (r45.yz2) objArr[1];
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
                    yz2Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.fa2 fa2Var = new r45.fa2();
                    if (bArr3 != null && bArr3.length > 0) {
                        fa2Var.parseFrom(bArr3);
                    }
                    yz2Var.f391517d.add(fa2Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.l42 l42Var3 = new r45.l42();
                    if (bArr4 != null && bArr4.length > 0) {
                        l42Var3.parseFrom(bArr4);
                    }
                    yz2Var.f391518e = l42Var3;
                }
                return 0;
            case 4:
                yz2Var.f391519f = aVar2.g(intValue);
                return 0;
            case 5:
                yz2Var.f391520g = aVar2.d(intValue);
                return 0;
            case 6:
                yz2Var.f391521h = aVar2.g(intValue);
                return 0;
            case 7:
                yz2Var.f391522i = aVar2.d(intValue);
                return 0;
            case 8:
                yz2Var.f391523m = aVar2.c(intValue);
                return 0;
            case 9:
                yz2Var.f391524n = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                    if (bArr5 != null && bArr5.length > 0) {
                        finderObject.parseFrom(bArr5);
                    }
                    yz2Var.f391525o.add(finderObject);
                }
                return 0;
            case 11:
                yz2Var.f391526p = aVar2.g(intValue);
                return 0;
            case 12:
                yz2Var.f391527q = aVar2.c(intValue);
                return 0;
            case 13:
                yz2Var.f391528r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.s92 s92Var3 = new r45.s92();
                    if (bArr6 != null && bArr6.length > 0) {
                        s92Var3.parseFrom(bArr6);
                    }
                    yz2Var.f391529s = s92Var3;
                }
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ha2 ha2Var3 = new r45.ha2();
                    if (bArr7 != null && bArr7.length > 0) {
                        ha2Var3.parseFrom(bArr7);
                    }
                    yz2Var.f391530t = ha2Var3;
                }
                return 0;
            case 16:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.vz2 vz2Var3 = new r45.vz2();
                    if (bArr8 != null && bArr8.length > 0) {
                        vz2Var3.parseFrom(bArr8);
                    }
                    yz2Var.f391531u = vz2Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.zz2 zz2Var3 = new r45.zz2();
                    if (bArr9 != null && bArr9.length > 0) {
                        zz2Var3.parseFrom(bArr9);
                    }
                    yz2Var.f391532v = zz2Var3;
                }
                return 0;
            case 18:
                yz2Var.f391533w = aVar2.g(intValue);
                return 0;
            case 19:
                yz2Var.f391534x = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
