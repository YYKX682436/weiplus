package r45;

/* loaded from: classes4.dex */
public class eb6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373239d;

    /* renamed from: e, reason: collision with root package name */
    public int f373240e;

    /* renamed from: g, reason: collision with root package name */
    public int f373242g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cb6 f373243h;

    /* renamed from: i, reason: collision with root package name */
    public int f373244i;

    /* renamed from: m, reason: collision with root package name */
    public int f373245m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ga6 f373246n;

    /* renamed from: o, reason: collision with root package name */
    public long f373247o;

    /* renamed from: p, reason: collision with root package name */
    public long f373248p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f373249q;

    /* renamed from: r, reason: collision with root package name */
    public int f373250r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f373252t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f373253u;

    /* renamed from: v, reason: collision with root package name */
    public int f373254v;

    /* renamed from: w, reason: collision with root package name */
    public int f373255w;

    /* renamed from: y, reason: collision with root package name */
    public long f373257y;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f373241f = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f373251s = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f373256x = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eb6)) {
            return false;
        }
        r45.eb6 eb6Var = (r45.eb6) fVar;
        return n51.f.a(this.BaseResponse, eb6Var.BaseResponse) && n51.f.a(this.f373239d, eb6Var.f373239d) && n51.f.a(java.lang.Integer.valueOf(this.f373240e), java.lang.Integer.valueOf(eb6Var.f373240e)) && n51.f.a(this.f373241f, eb6Var.f373241f) && n51.f.a(java.lang.Integer.valueOf(this.f373242g), java.lang.Integer.valueOf(eb6Var.f373242g)) && n51.f.a(this.f373243h, eb6Var.f373243h) && n51.f.a(java.lang.Integer.valueOf(this.f373244i), java.lang.Integer.valueOf(eb6Var.f373244i)) && n51.f.a(java.lang.Integer.valueOf(this.f373245m), java.lang.Integer.valueOf(eb6Var.f373245m)) && n51.f.a(this.f373246n, eb6Var.f373246n) && n51.f.a(java.lang.Long.valueOf(this.f373247o), java.lang.Long.valueOf(eb6Var.f373247o)) && n51.f.a(java.lang.Long.valueOf(this.f373248p), java.lang.Long.valueOf(eb6Var.f373248p)) && n51.f.a(this.f373249q, eb6Var.f373249q) && n51.f.a(java.lang.Integer.valueOf(this.f373250r), java.lang.Integer.valueOf(eb6Var.f373250r)) && n51.f.a(this.f373251s, eb6Var.f373251s) && n51.f.a(java.lang.Boolean.valueOf(this.f373252t), java.lang.Boolean.valueOf(eb6Var.f373252t)) && n51.f.a(this.f373253u, eb6Var.f373253u) && n51.f.a(java.lang.Integer.valueOf(this.f373254v), java.lang.Integer.valueOf(eb6Var.f373254v)) && n51.f.a(java.lang.Integer.valueOf(this.f373255w), java.lang.Integer.valueOf(eb6Var.f373255w)) && n51.f.a(this.f373256x, eb6Var.f373256x) && n51.f.a(java.lang.Long.valueOf(this.f373257y), java.lang.Long.valueOf(eb6Var.f373257y));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373256x;
        java.util.LinkedList linkedList2 = this.f373251s;
        java.util.LinkedList linkedList3 = this.f373241f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f373239d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f373240e);
            fVar.g(4, 8, linkedList3);
            fVar.e(5, this.f373242g);
            r45.cb6 cb6Var = this.f373243h;
            if (cb6Var != null) {
                fVar.i(6, cb6Var.computeSize());
                this.f373243h.writeFields(fVar);
            }
            fVar.e(7, this.f373244i);
            fVar.e(8, this.f373245m);
            r45.ga6 ga6Var = this.f373246n;
            if (ga6Var != null) {
                fVar.i(9, ga6Var.computeSize());
                this.f373246n.writeFields(fVar);
            }
            fVar.h(10, this.f373247o);
            fVar.h(11, this.f373248p);
            java.lang.String str2 = this.f373249q;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            fVar.e(13, this.f373250r);
            fVar.g(14, 8, linkedList2);
            fVar.a(15, this.f373252t);
            java.lang.String str3 = this.f373253u;
            if (str3 != null) {
                fVar.j(16, str3);
            }
            fVar.e(17, this.f373254v);
            fVar.e(18, this.f373255w);
            fVar.g(19, 8, linkedList);
            fVar.h(20, this.f373257y);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str4 = this.f373239d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f373240e) + b36.f.g(4, 8, linkedList3) + b36.f.e(5, this.f373242g);
            r45.cb6 cb6Var2 = this.f373243h;
            if (cb6Var2 != null) {
                e17 += b36.f.i(6, cb6Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(7, this.f373244i) + b36.f.e(8, this.f373245m);
            r45.ga6 ga6Var2 = this.f373246n;
            if (ga6Var2 != null) {
                e18 += b36.f.i(9, ga6Var2.computeSize());
            }
            int h17 = e18 + b36.f.h(10, this.f373247o) + b36.f.h(11, this.f373248p);
            java.lang.String str5 = this.f373249q;
            if (str5 != null) {
                h17 += b36.f.j(12, str5);
            }
            int e19 = h17 + b36.f.e(13, this.f373250r) + b36.f.g(14, 8, linkedList2) + b36.f.a(15, this.f373252t);
            java.lang.String str6 = this.f373253u;
            if (str6 != null) {
                e19 += b36.f.j(16, str6);
            }
            return e19 + b36.f.e(17, this.f373254v) + b36.f.e(18, this.f373255w) + b36.f.g(19, 8, linkedList) + b36.f.h(20, this.f373257y);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.eb6 eb6Var = (r45.eb6) objArr[1];
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
                    eb6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                eb6Var.f373239d = aVar2.k(intValue);
                return 0;
            case 3:
                eb6Var.f373240e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        snsObject.parseFrom(bArr3);
                    }
                    eb6Var.f373241f.add(snsObject);
                }
                return 0;
            case 5:
                eb6Var.f373242g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cb6 cb6Var3 = new r45.cb6();
                    if (bArr4 != null && bArr4.length > 0) {
                        cb6Var3.parseFrom(bArr4);
                    }
                    eb6Var.f373243h = cb6Var3;
                }
                return 0;
            case 7:
                eb6Var.f373244i = aVar2.g(intValue);
                return 0;
            case 8:
                eb6Var.f373245m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ga6 ga6Var3 = new r45.ga6();
                    if (bArr5 != null && bArr5.length > 0) {
                        ga6Var3.parseFrom(bArr5);
                    }
                    eb6Var.f373246n = ga6Var3;
                }
                return 0;
            case 10:
                eb6Var.f373247o = aVar2.i(intValue);
                return 0;
            case 11:
                eb6Var.f373248p = aVar2.i(intValue);
                return 0;
            case 12:
                eb6Var.f373249q = aVar2.k(intValue);
                return 0;
            case 13:
                eb6Var.f373250r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.yb6 yb6Var = new r45.yb6();
                    if (bArr6 != null && bArr6.length > 0) {
                        yb6Var.parseFrom(bArr6);
                    }
                    eb6Var.f373251s.add(yb6Var);
                }
                return 0;
            case 15:
                eb6Var.f373252t = aVar2.c(intValue);
                return 0;
            case 16:
                eb6Var.f373253u = aVar2.k(intValue);
                return 0;
            case 17:
                eb6Var.f373254v = aVar2.g(intValue);
                return 0;
            case 18:
                eb6Var.f373255w = aVar2.g(intValue);
                return 0;
            case 19:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = new com.tencent.mm.protocal.protobuf.SnsObject();
                    if (bArr7 != null && bArr7.length > 0) {
                        snsObject2.parseFrom(bArr7);
                    }
                    eb6Var.f373256x.add(snsObject2);
                }
                return 0;
            case 20:
                eb6Var.f373257y = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
