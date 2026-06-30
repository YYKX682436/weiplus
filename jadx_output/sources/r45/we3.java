package r45;

/* loaded from: classes12.dex */
public class we3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f389084d;

    /* renamed from: e, reason: collision with root package name */
    public int f389085e;

    /* renamed from: g, reason: collision with root package name */
    public r45.hj0 f389087g;

    /* renamed from: h, reason: collision with root package name */
    public int f389088h;

    /* renamed from: m, reason: collision with root package name */
    public int f389090m;

    /* renamed from: o, reason: collision with root package name */
    public int f389092o;

    /* renamed from: q, reason: collision with root package name */
    public int f389094q;

    /* renamed from: r, reason: collision with root package name */
    public int f389095r;

    /* renamed from: s, reason: collision with root package name */
    public int f389096s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f389098u;

    /* renamed from: v, reason: collision with root package name */
    public r45.cu5 f389099v;

    /* renamed from: x, reason: collision with root package name */
    public int f389101x;

    /* renamed from: y, reason: collision with root package name */
    public long f389102y;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f389086f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f389089i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f389091n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f389093p = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f389097t = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f389100w = new java.util.LinkedList();

    static {
        new r45.we3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.we3 parseFrom(byte[] bArr) {
        return (r45.we3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.we3)) {
            return false;
        }
        r45.we3 we3Var = (r45.we3) fVar;
        return n51.f.a(this.BaseResponse, we3Var.BaseResponse) && n51.f.a(this.f389084d, we3Var.f389084d) && n51.f.a(java.lang.Integer.valueOf(this.f389085e), java.lang.Integer.valueOf(we3Var.f389085e)) && n51.f.a(this.f389086f, we3Var.f389086f) && n51.f.a(this.f389087g, we3Var.f389087g) && n51.f.a(java.lang.Integer.valueOf(this.f389088h), java.lang.Integer.valueOf(we3Var.f389088h)) && n51.f.a(this.f389089i, we3Var.f389089i) && n51.f.a(java.lang.Integer.valueOf(this.f389090m), java.lang.Integer.valueOf(we3Var.f389090m)) && n51.f.a(this.f389091n, we3Var.f389091n) && n51.f.a(java.lang.Integer.valueOf(this.f389092o), java.lang.Integer.valueOf(we3Var.f389092o)) && n51.f.a(this.f389093p, we3Var.f389093p) && n51.f.a(java.lang.Integer.valueOf(this.f389094q), java.lang.Integer.valueOf(we3Var.f389094q)) && n51.f.a(java.lang.Integer.valueOf(this.f389095r), java.lang.Integer.valueOf(we3Var.f389095r)) && n51.f.a(java.lang.Integer.valueOf(this.f389096s), java.lang.Integer.valueOf(we3Var.f389096s)) && n51.f.a(this.f389097t, we3Var.f389097t) && n51.f.a(this.f389098u, we3Var.f389098u) && n51.f.a(this.f389099v, we3Var.f389099v) && n51.f.a(this.f389100w, we3Var.f389100w) && n51.f.a(java.lang.Integer.valueOf(this.f389101x), java.lang.Integer.valueOf(we3Var.f389101x)) && n51.f.a(java.lang.Long.valueOf(this.f389102y), java.lang.Long.valueOf(we3Var.f389102y));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.we3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389100w;
        java.util.LinkedList linkedList2 = this.f389097t;
        java.util.LinkedList linkedList3 = this.f389093p;
        java.util.LinkedList linkedList4 = this.f389091n;
        java.util.LinkedList linkedList5 = this.f389089i;
        java.util.LinkedList linkedList6 = this.f389086f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f389084d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f389084d.writeFields(fVar);
            }
            fVar.e(3, this.f389085e);
            fVar.g(4, 8, linkedList6);
            r45.hj0 hj0Var = this.f389087g;
            if (hj0Var != null) {
                fVar.i(5, hj0Var.computeSize());
                this.f389087g.writeFields(fVar);
            }
            fVar.e(6, this.f389088h);
            fVar.g(7, 8, linkedList5);
            fVar.e(8, this.f389090m);
            fVar.g(9, 8, linkedList4);
            fVar.e(10, this.f389092o);
            fVar.g(11, 8, linkedList3);
            fVar.e(12, this.f389094q);
            fVar.e(13, this.f389095r);
            fVar.e(14, this.f389096s);
            fVar.g(15, 8, linkedList2);
            java.lang.String str = this.f389098u;
            if (str != null) {
                fVar.j(16, str);
            }
            r45.cu5 cu5Var2 = this.f389099v;
            if (cu5Var2 != null) {
                fVar.i(17, cu5Var2.computeSize());
                this.f389099v.writeFields(fVar);
            }
            fVar.g(18, 8, linkedList);
            fVar.e(19, this.f389101x);
            fVar.h(20, this.f389102y);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            r45.cu5 cu5Var3 = this.f389084d;
            if (cu5Var3 != null) {
                i18 += b36.f.i(2, cu5Var3.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f389085e) + b36.f.g(4, 8, linkedList6);
            r45.hj0 hj0Var2 = this.f389087g;
            if (hj0Var2 != null) {
                e17 += b36.f.i(5, hj0Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.f389088h) + b36.f.g(7, 8, linkedList5) + b36.f.e(8, this.f389090m) + b36.f.g(9, 8, linkedList4) + b36.f.e(10, this.f389092o) + b36.f.g(11, 8, linkedList3) + b36.f.e(12, this.f389094q) + b36.f.e(13, this.f389095r) + b36.f.e(14, this.f389096s) + b36.f.g(15, 8, linkedList2);
            java.lang.String str2 = this.f389098u;
            if (str2 != null) {
                e18 += b36.f.j(16, str2);
            }
            r45.cu5 cu5Var4 = this.f389099v;
            if (cu5Var4 != null) {
                e18 += b36.f.i(17, cu5Var4.computeSize());
            }
            return e18 + b36.f.g(18, 8, linkedList) + b36.f.e(19, this.f389101x) + b36.f.h(20, this.f389102y);
        }
        if (i17 == 2) {
            linkedList6.clear();
            linkedList5.clear();
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
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f389084d = cu5Var5;
                }
                return 0;
            case 3:
                this.f389085e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.zj0 zj0Var = new r45.zj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        zj0Var.parseFrom(bArr3);
                    }
                    linkedList6.add(zj0Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.hj0 hj0Var3 = new r45.hj0();
                    if (bArr4 != null && bArr4.length > 0) {
                        hj0Var3.parseFrom(bArr4);
                    }
                    this.f389087g = hj0Var3;
                }
                return 0;
            case 6:
                this.f389088h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.hj0 hj0Var4 = new r45.hj0();
                    if (bArr5 != null && bArr5.length > 0) {
                        hj0Var4.parseFrom(bArr5);
                    }
                    linkedList5.add(hj0Var4);
                }
                return 0;
            case 8:
                this.f389090m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.nj0 nj0Var = new r45.nj0();
                    if (bArr6 != null && bArr6.length > 0) {
                        nj0Var.parseFrom(bArr6);
                    }
                    linkedList4.add(nj0Var);
                }
                return 0;
            case 10:
                this.f389092o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.kj0 kj0Var = new r45.kj0();
                    if (bArr7 != null && bArr7.length > 0) {
                        kj0Var.parseFrom(bArr7);
                    }
                    linkedList3.add(kj0Var);
                }
                return 0;
            case 12:
                this.f389094q = aVar2.g(intValue);
                return 0;
            case 13:
                this.f389095r = aVar2.g(intValue);
                return 0;
            case 14:
                this.f389096s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.kj0 kj0Var2 = new r45.kj0();
                    if (bArr8 != null && bArr8.length > 0) {
                        kj0Var2.parseFrom(bArr8);
                    }
                    linkedList2.add(kj0Var2);
                }
                return 0;
            case 16:
                this.f389098u = aVar2.k(intValue);
                return 0;
            case 17:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr9 != null && bArr9.length > 0) {
                        cu5Var6.b(bArr9);
                    }
                    this.f389099v = cu5Var6;
                }
                return 0;
            case 18:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.wj0 wj0Var = new r45.wj0();
                    if (bArr10 != null && bArr10.length > 0) {
                        wj0Var.parseFrom(bArr10);
                    }
                    linkedList.add(wj0Var);
                }
                return 0;
            case 19:
                this.f389101x = aVar2.g(intValue);
                return 0;
            case 20:
                this.f389102y = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
