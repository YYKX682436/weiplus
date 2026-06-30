package r45;

/* loaded from: classes4.dex */
public class xb6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389948d;

    /* renamed from: e, reason: collision with root package name */
    public int f389949e;

    /* renamed from: g, reason: collision with root package name */
    public int f389951g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cb6 f389952h;

    /* renamed from: i, reason: collision with root package name */
    public int f389953i;

    /* renamed from: m, reason: collision with root package name */
    public int f389954m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ga6 f389955n;

    /* renamed from: o, reason: collision with root package name */
    public long f389956o;

    /* renamed from: p, reason: collision with root package name */
    public long f389957p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389958q;

    /* renamed from: r, reason: collision with root package name */
    public int f389959r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f389961t;

    /* renamed from: u, reason: collision with root package name */
    public r45.vb6 f389962u;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f389950f = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f389960s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xb6)) {
            return false;
        }
        r45.xb6 xb6Var = (r45.xb6) fVar;
        return n51.f.a(this.BaseResponse, xb6Var.BaseResponse) && n51.f.a(this.f389948d, xb6Var.f389948d) && n51.f.a(java.lang.Integer.valueOf(this.f389949e), java.lang.Integer.valueOf(xb6Var.f389949e)) && n51.f.a(this.f389950f, xb6Var.f389950f) && n51.f.a(java.lang.Integer.valueOf(this.f389951g), java.lang.Integer.valueOf(xb6Var.f389951g)) && n51.f.a(this.f389952h, xb6Var.f389952h) && n51.f.a(java.lang.Integer.valueOf(this.f389953i), java.lang.Integer.valueOf(xb6Var.f389953i)) && n51.f.a(java.lang.Integer.valueOf(this.f389954m), java.lang.Integer.valueOf(xb6Var.f389954m)) && n51.f.a(this.f389955n, xb6Var.f389955n) && n51.f.a(java.lang.Long.valueOf(this.f389956o), java.lang.Long.valueOf(xb6Var.f389956o)) && n51.f.a(java.lang.Long.valueOf(this.f389957p), java.lang.Long.valueOf(xb6Var.f389957p)) && n51.f.a(this.f389958q, xb6Var.f389958q) && n51.f.a(java.lang.Integer.valueOf(this.f389959r), java.lang.Integer.valueOf(xb6Var.f389959r)) && n51.f.a(this.f389960s, xb6Var.f389960s) && n51.f.a(java.lang.Boolean.valueOf(this.f389961t), java.lang.Boolean.valueOf(xb6Var.f389961t)) && n51.f.a(this.f389962u, xb6Var.f389962u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389960s;
        java.util.LinkedList linkedList2 = this.f389950f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f389948d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f389949e);
            fVar.g(4, 8, linkedList2);
            fVar.e(5, this.f389951g);
            r45.cb6 cb6Var = this.f389952h;
            if (cb6Var != null) {
                fVar.i(6, cb6Var.computeSize());
                this.f389952h.writeFields(fVar);
            }
            fVar.e(7, this.f389953i);
            fVar.e(8, this.f389954m);
            r45.ga6 ga6Var = this.f389955n;
            if (ga6Var != null) {
                fVar.i(9, ga6Var.computeSize());
                this.f389955n.writeFields(fVar);
            }
            fVar.h(10, this.f389956o);
            fVar.h(11, this.f389957p);
            java.lang.String str2 = this.f389958q;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            fVar.e(13, this.f389959r);
            fVar.g(14, 8, linkedList);
            fVar.a(15, this.f389961t);
            r45.vb6 vb6Var = this.f389962u;
            if (vb6Var != null) {
                fVar.i(16, vb6Var.computeSize());
                this.f389962u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str3 = this.f389948d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f389949e) + b36.f.g(4, 8, linkedList2) + b36.f.e(5, this.f389951g);
            r45.cb6 cb6Var2 = this.f389952h;
            if (cb6Var2 != null) {
                e17 += b36.f.i(6, cb6Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(7, this.f389953i) + b36.f.e(8, this.f389954m);
            r45.ga6 ga6Var2 = this.f389955n;
            if (ga6Var2 != null) {
                e18 += b36.f.i(9, ga6Var2.computeSize());
            }
            int h17 = e18 + b36.f.h(10, this.f389956o) + b36.f.h(11, this.f389957p);
            java.lang.String str4 = this.f389958q;
            if (str4 != null) {
                h17 += b36.f.j(12, str4);
            }
            int e19 = h17 + b36.f.e(13, this.f389959r) + b36.f.g(14, 8, linkedList) + b36.f.a(15, this.f389961t);
            r45.vb6 vb6Var2 = this.f389962u;
            return vb6Var2 != null ? e19 + b36.f.i(16, vb6Var2.computeSize()) : e19;
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
        r45.xb6 xb6Var = (r45.xb6) objArr[1];
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
                    xb6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                xb6Var.f389948d = aVar2.k(intValue);
                return 0;
            case 3:
                xb6Var.f389949e = aVar2.g(intValue);
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
                    xb6Var.f389950f.add(snsObject);
                }
                return 0;
            case 5:
                xb6Var.f389951g = aVar2.g(intValue);
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
                    xb6Var.f389952h = cb6Var3;
                }
                return 0;
            case 7:
                xb6Var.f389953i = aVar2.g(intValue);
                return 0;
            case 8:
                xb6Var.f389954m = aVar2.g(intValue);
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
                    xb6Var.f389955n = ga6Var3;
                }
                return 0;
            case 10:
                xb6Var.f389956o = aVar2.i(intValue);
                return 0;
            case 11:
                xb6Var.f389957p = aVar2.i(intValue);
                return 0;
            case 12:
                xb6Var.f389958q = aVar2.k(intValue);
                return 0;
            case 13:
                xb6Var.f389959r = aVar2.g(intValue);
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
                    xb6Var.f389960s.add(yb6Var);
                }
                return 0;
            case 15:
                xb6Var.f389961t = aVar2.c(intValue);
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.vb6 vb6Var3 = new r45.vb6();
                    if (bArr7 != null && bArr7.length > 0) {
                        vb6Var3.parseFrom(bArr7);
                    }
                    xb6Var.f389962u = vb6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
