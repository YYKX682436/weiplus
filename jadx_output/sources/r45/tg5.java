package r45;

/* loaded from: classes9.dex */
public class tg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386405d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386406e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cx3 f386407f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386408g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386409h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bs f386410i;

    /* renamed from: m, reason: collision with root package name */
    public r45.tw4 f386411m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f386412n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xw3 f386413o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tg5)) {
            return false;
        }
        r45.tg5 tg5Var = (r45.tg5) fVar;
        return n51.f.a(this.BaseResponse, tg5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f386405d), java.lang.Integer.valueOf(tg5Var.f386405d)) && n51.f.a(this.f386406e, tg5Var.f386406e) && n51.f.a(this.f386407f, tg5Var.f386407f) && n51.f.a(this.f386408g, tg5Var.f386408g) && n51.f.a(this.f386409h, tg5Var.f386409h) && n51.f.a(this.f386410i, tg5Var.f386410i) && n51.f.a(this.f386411m, tg5Var.f386411m) && n51.f.a(java.lang.Boolean.valueOf(this.f386412n), java.lang.Boolean.valueOf(tg5Var.f386412n)) && n51.f.a(this.f386413o, tg5Var.f386413o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f386405d);
            java.lang.String str = this.f386406e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cx3 cx3Var = this.f386407f;
            if (cx3Var != null) {
                fVar.i(4, cx3Var.computeSize());
                this.f386407f.writeFields(fVar);
            }
            java.lang.String str2 = this.f386408g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f386409h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            r45.bs bsVar = this.f386410i;
            if (bsVar != null) {
                fVar.i(7, bsVar.computeSize());
                this.f386410i.writeFields(fVar);
            }
            r45.tw4 tw4Var = this.f386411m;
            if (tw4Var != null) {
                fVar.i(8, tw4Var.computeSize());
                this.f386411m.writeFields(fVar);
            }
            fVar.a(9, this.f386412n);
            r45.xw3 xw3Var = this.f386413o;
            if (xw3Var != null) {
                fVar.i(10, xw3Var.computeSize());
                this.f386413o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f386405d);
            java.lang.String str4 = this.f386406e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.cx3 cx3Var2 = this.f386407f;
            if (cx3Var2 != null) {
                i18 += b36.f.i(4, cx3Var2.computeSize());
            }
            java.lang.String str5 = this.f386408g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f386409h;
            if (str6 != null) {
                i18 += b36.f.j(6, str6);
            }
            r45.bs bsVar2 = this.f386410i;
            if (bsVar2 != null) {
                i18 += b36.f.i(7, bsVar2.computeSize());
            }
            r45.tw4 tw4Var2 = this.f386411m;
            if (tw4Var2 != null) {
                i18 += b36.f.i(8, tw4Var2.computeSize());
            }
            int a17 = i18 + b36.f.a(9, this.f386412n);
            r45.xw3 xw3Var2 = this.f386413o;
            return xw3Var2 != null ? a17 + b36.f.i(10, xw3Var2.computeSize()) : a17;
        }
        if (i17 == 2) {
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
        r45.tg5 tg5Var = (r45.tg5) objArr[1];
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
                    tg5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                tg5Var.f386405d = aVar2.g(intValue);
                return 0;
            case 3:
                tg5Var.f386406e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cx3 cx3Var3 = new r45.cx3();
                    if (bArr2 != null && bArr2.length > 0) {
                        cx3Var3.parseFrom(bArr2);
                    }
                    tg5Var.f386407f = cx3Var3;
                }
                return 0;
            case 5:
                tg5Var.f386408g = aVar2.k(intValue);
                return 0;
            case 6:
                tg5Var.f386409h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.bs bsVar3 = new r45.bs();
                    if (bArr3 != null && bArr3.length > 0) {
                        bsVar3.parseFrom(bArr3);
                    }
                    tg5Var.f386410i = bsVar3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr4 != null && bArr4.length > 0) {
                        tw4Var3.parseFrom(bArr4);
                    }
                    tg5Var.f386411m = tw4Var3;
                }
                return 0;
            case 9:
                tg5Var.f386412n = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.xw3 xw3Var3 = new r45.xw3();
                    if (bArr5 != null && bArr5.length > 0) {
                        xw3Var3.parseFrom(bArr5);
                    }
                    tg5Var.f386413o = xw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
