package r45;

/* loaded from: classes9.dex */
public class hb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f376007d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376008e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jz3 f376009f;

    /* renamed from: g, reason: collision with root package name */
    public r45.be5 f376010g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376011h;

    /* renamed from: n, reason: collision with root package name */
    public int f376014n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f376015o;

    /* renamed from: p, reason: collision with root package name */
    public int f376016p;

    /* renamed from: q, reason: collision with root package name */
    public long f376017q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f376018r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f376019s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f376020t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f376021u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f376022v;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f376012i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f376013m = true;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f376023w = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hb5)) {
            return false;
        }
        r45.hb5 hb5Var = (r45.hb5) fVar;
        return n51.f.a(this.BaseResponse, hb5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f376007d), java.lang.Integer.valueOf(hb5Var.f376007d)) && n51.f.a(this.f376008e, hb5Var.f376008e) && n51.f.a(this.f376009f, hb5Var.f376009f) && n51.f.a(this.f376010g, hb5Var.f376010g) && n51.f.a(this.f376011h, hb5Var.f376011h) && n51.f.a(this.f376012i, hb5Var.f376012i) && n51.f.a(java.lang.Boolean.valueOf(this.f376013m), java.lang.Boolean.valueOf(hb5Var.f376013m)) && n51.f.a(java.lang.Integer.valueOf(this.f376014n), java.lang.Integer.valueOf(hb5Var.f376014n)) && n51.f.a(this.f376015o, hb5Var.f376015o) && n51.f.a(java.lang.Integer.valueOf(this.f376016p), java.lang.Integer.valueOf(hb5Var.f376016p)) && n51.f.a(java.lang.Long.valueOf(this.f376017q), java.lang.Long.valueOf(hb5Var.f376017q)) && n51.f.a(this.f376018r, hb5Var.f376018r) && n51.f.a(this.f376019s, hb5Var.f376019s) && n51.f.a(this.f376020t, hb5Var.f376020t) && n51.f.a(this.f376021u, hb5Var.f376021u) && n51.f.a(this.f376022v, hb5Var.f376022v) && n51.f.a(this.f376023w, hb5Var.f376023w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376023w;
        java.util.LinkedList linkedList2 = this.f376012i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f376007d);
            java.lang.String str = this.f376008e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.jz3 jz3Var = this.f376009f;
            if (jz3Var != null) {
                fVar.i(4, jz3Var.computeSize());
                this.f376009f.writeFields(fVar);
            }
            r45.be5 be5Var = this.f376010g;
            if (be5Var != null) {
                fVar.i(5, be5Var.computeSize());
                this.f376010g.writeFields(fVar);
            }
            java.lang.String str2 = this.f376011h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList2);
            fVar.a(8, this.f376013m);
            fVar.e(9, this.f376014n);
            java.lang.String str3 = this.f376015o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f376016p);
            fVar.h(12, this.f376017q);
            java.lang.String str4 = this.f376018r;
            if (str4 != null) {
                fVar.j(13, str4);
            }
            java.lang.String str5 = this.f376019s;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f376020t;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f376021u;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            java.lang.String str8 = this.f376022v;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            fVar.g(18, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f376007d);
            java.lang.String str9 = this.f376008e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            r45.jz3 jz3Var2 = this.f376009f;
            if (jz3Var2 != null) {
                i18 += b36.f.i(4, jz3Var2.computeSize());
            }
            r45.be5 be5Var2 = this.f376010g;
            if (be5Var2 != null) {
                i18 += b36.f.i(5, be5Var2.computeSize());
            }
            java.lang.String str10 = this.f376011h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int g17 = i18 + b36.f.g(7, 8, linkedList2) + b36.f.a(8, this.f376013m) + b36.f.e(9, this.f376014n);
            java.lang.String str11 = this.f376015o;
            if (str11 != null) {
                g17 += b36.f.j(10, str11);
            }
            int e17 = g17 + b36.f.e(11, this.f376016p) + b36.f.h(12, this.f376017q);
            java.lang.String str12 = this.f376018r;
            if (str12 != null) {
                e17 += b36.f.j(13, str12);
            }
            java.lang.String str13 = this.f376019s;
            if (str13 != null) {
                e17 += b36.f.j(14, str13);
            }
            java.lang.String str14 = this.f376020t;
            if (str14 != null) {
                e17 += b36.f.j(15, str14);
            }
            java.lang.String str15 = this.f376021u;
            if (str15 != null) {
                e17 += b36.f.j(16, str15);
            }
            java.lang.String str16 = this.f376022v;
            if (str16 != null) {
                e17 += b36.f.j(17, str16);
            }
            return e17 + b36.f.g(18, 8, linkedList);
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
        r45.hb5 hb5Var = (r45.hb5) objArr[1];
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
                    hb5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                hb5Var.f376007d = aVar2.g(intValue);
                return 0;
            case 3:
                hb5Var.f376008e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.jz3 jz3Var3 = new r45.jz3();
                    if (bArr3 != null && bArr3.length > 0) {
                        jz3Var3.parseFrom(bArr3);
                    }
                    hb5Var.f376009f = jz3Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.be5 be5Var3 = new r45.be5();
                    if (bArr4 != null && bArr4.length > 0) {
                        be5Var3.parseFrom(bArr4);
                    }
                    hb5Var.f376010g = be5Var3;
                }
                return 0;
            case 6:
                hb5Var.f376011h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qv qvVar = new r45.qv();
                    if (bArr5 != null && bArr5.length > 0) {
                        qvVar.parseFrom(bArr5);
                    }
                    hb5Var.f376012i.add(qvVar);
                }
                return 0;
            case 8:
                hb5Var.f376013m = aVar2.c(intValue);
                return 0;
            case 9:
                hb5Var.f376014n = aVar2.g(intValue);
                return 0;
            case 10:
                hb5Var.f376015o = aVar2.k(intValue);
                return 0;
            case 11:
                hb5Var.f376016p = aVar2.g(intValue);
                return 0;
            case 12:
                hb5Var.f376017q = aVar2.i(intValue);
                return 0;
            case 13:
                hb5Var.f376018r = aVar2.k(intValue);
                return 0;
            case 14:
                hb5Var.f376019s = aVar2.k(intValue);
                return 0;
            case 15:
                hb5Var.f376020t = aVar2.k(intValue);
                return 0;
            case 16:
                hb5Var.f376021u = aVar2.k(intValue);
                return 0;
            case 17:
                hb5Var.f376022v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.ql5 ql5Var = new r45.ql5();
                    if (bArr6 != null && bArr6.length > 0) {
                        ql5Var.parseFrom(bArr6);
                    }
                    hb5Var.f376023w.add(ql5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
