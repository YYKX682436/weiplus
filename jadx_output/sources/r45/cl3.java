package r45;

/* loaded from: classes4.dex */
public class cl3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371638f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371639g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371640h;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f371642m;

    /* renamed from: o, reason: collision with root package name */
    public r45.ae0 f371644o;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371647r;

    /* renamed from: s, reason: collision with root package name */
    public int f371648s;

    /* renamed from: t, reason: collision with root package name */
    public int f371649t;

    /* renamed from: u, reason: collision with root package name */
    public r45.v75 f371650u;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f371641i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f371643n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f371645p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f371646q = new java.util.LinkedList();

    static {
        new r45.cl3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cl3)) {
            return false;
        }
        r45.cl3 cl3Var = (r45.cl3) fVar;
        return n51.f.a(this.BaseResponse, cl3Var.BaseResponse) && n51.f.a(this.f371636d, cl3Var.f371636d) && n51.f.a(this.f371637e, cl3Var.f371637e) && n51.f.a(this.f371638f, cl3Var.f371638f) && n51.f.a(this.f371639g, cl3Var.f371639g) && n51.f.a(this.f371640h, cl3Var.f371640h) && n51.f.a(this.f371641i, cl3Var.f371641i) && n51.f.a(this.f371642m, cl3Var.f371642m) && n51.f.a(this.f371643n, cl3Var.f371643n) && n51.f.a(this.f371644o, cl3Var.f371644o) && n51.f.a(this.f371645p, cl3Var.f371645p) && n51.f.a(this.f371646q, cl3Var.f371646q) && n51.f.a(this.f371647r, cl3Var.f371647r) && n51.f.a(java.lang.Integer.valueOf(this.f371648s), java.lang.Integer.valueOf(cl3Var.f371648s)) && n51.f.a(java.lang.Integer.valueOf(this.f371649t), java.lang.Integer.valueOf(cl3Var.f371649t)) && n51.f.a(this.f371650u, cl3Var.f371650u);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.cl3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371646q;
        java.util.LinkedList linkedList2 = this.f371645p;
        java.util.LinkedList linkedList3 = this.f371643n;
        java.util.LinkedList linkedList4 = this.f371641i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f371636d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f371637e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f371638f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f371639g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f371640h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.g(7, 8, linkedList4);
            r45.cu5 cu5Var = this.f371642m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.computeSize());
                this.f371642m.writeFields(fVar);
            }
            fVar.g(9, 8, linkedList3);
            r45.ae0 ae0Var = this.f371644o;
            if (ae0Var != null) {
                fVar.i(10, ae0Var.computeSize());
                this.f371644o.writeFields(fVar);
            }
            fVar.g(11, 8, linkedList2);
            fVar.g(12, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f371647r;
            if (gVar != null) {
                fVar.b(13, gVar);
            }
            fVar.e(14, this.f371648s);
            fVar.e(15, this.f371649t);
            r45.v75 v75Var = this.f371650u;
            if (v75Var != null) {
                fVar.i(16, v75Var.computeSize());
                this.f371650u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str6 = this.f371636d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f371637e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f371638f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f371639g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f371640h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int g17 = i18 + b36.f.g(7, 8, linkedList4);
            r45.cu5 cu5Var2 = this.f371642m;
            if (cu5Var2 != null) {
                g17 += b36.f.i(8, cu5Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(9, 8, linkedList3);
            r45.ae0 ae0Var2 = this.f371644o;
            if (ae0Var2 != null) {
                g18 += b36.f.i(10, ae0Var2.computeSize());
            }
            int g19 = g18 + b36.f.g(11, 8, linkedList2) + b36.f.g(12, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f371647r;
            if (gVar2 != null) {
                g19 += b36.f.b(13, gVar2);
            }
            int e17 = g19 + b36.f.e(14, this.f371648s) + b36.f.e(15, this.f371649t);
            r45.v75 v75Var2 = this.f371650u;
            return v75Var2 != null ? e17 + b36.f.i(16, v75Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    this.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                this.f371636d = aVar2.k(intValue);
                return 0;
            case 3:
                this.f371637e = aVar2.k(intValue);
                return 0;
            case 4:
                this.f371638f = aVar2.k(intValue);
                return 0;
            case 5:
                this.f371639g = aVar2.k(intValue);
                return 0;
            case 6:
                this.f371640h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.zj0 zj0Var = new r45.zj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        zj0Var.parseFrom(bArr2);
                    }
                    linkedList4.add(zj0Var);
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    this.f371642m = cu5Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ri0 ri0Var = new r45.ri0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ri0Var.parseFrom(bArr4);
                    }
                    linkedList3.add(ri0Var);
                }
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.ae0 ae0Var3 = new r45.ae0();
                    if (bArr5 != null && bArr5.length > 0) {
                        ae0Var3.parseFrom(bArr5);
                    }
                    this.f371644o = ae0Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.kj0 kj0Var = new r45.kj0();
                    if (bArr6 != null && bArr6.length > 0) {
                        kj0Var.parseFrom(bArr6);
                    }
                    linkedList2.add(kj0Var);
                }
                return 0;
            case 12:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.vd0 vd0Var = new r45.vd0();
                    if (bArr7 != null && bArr7.length > 0) {
                        vd0Var.parseFrom(bArr7);
                    }
                    linkedList.add(vd0Var);
                }
                return 0;
            case 13:
                this.f371647r = aVar2.d(intValue);
                return 0;
            case 14:
                this.f371648s = aVar2.g(intValue);
                return 0;
            case 15:
                this.f371649t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.v75 v75Var3 = new r45.v75();
                    if (bArr8 != null && bArr8.length > 0) {
                        v75Var3.parseFrom(bArr8);
                    }
                    this.f371650u = v75Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.cl3) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
