package r45;

/* loaded from: classes12.dex */
public class zc6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391910d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391911e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391912f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391913g;

    /* renamed from: h, reason: collision with root package name */
    public int f391914h;

    /* renamed from: i, reason: collision with root package name */
    public int f391915i;

    /* renamed from: m, reason: collision with root package name */
    public int f391916m;

    /* renamed from: n, reason: collision with root package name */
    public int f391917n;

    /* renamed from: o, reason: collision with root package name */
    public r45.wc6 f391918o;

    /* renamed from: p, reason: collision with root package name */
    public r45.wc6 f391919p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zc6)) {
            return false;
        }
        r45.zc6 zc6Var = (r45.zc6) fVar;
        return n51.f.a(this.BaseRequest, zc6Var.BaseRequest) && n51.f.a(this.f391910d, zc6Var.f391910d) && n51.f.a(this.f391911e, zc6Var.f391911e) && n51.f.a(this.f391912f, zc6Var.f391912f) && n51.f.a(this.f391913g, zc6Var.f391913g) && n51.f.a(java.lang.Integer.valueOf(this.f391914h), java.lang.Integer.valueOf(zc6Var.f391914h)) && n51.f.a(java.lang.Integer.valueOf(this.f391915i), java.lang.Integer.valueOf(zc6Var.f391915i)) && n51.f.a(java.lang.Integer.valueOf(this.f391916m), java.lang.Integer.valueOf(zc6Var.f391916m)) && n51.f.a(java.lang.Integer.valueOf(this.f391917n), java.lang.Integer.valueOf(zc6Var.f391917n)) && n51.f.a(this.f391918o, zc6Var.f391918o) && n51.f.a(this.f391919p, zc6Var.f391919p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f391910d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f391911e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f391912f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f391913g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f391914h);
            fVar.e(7, this.f391915i);
            fVar.e(8, this.f391916m);
            fVar.e(9, this.f391917n);
            r45.wc6 wc6Var = this.f391918o;
            if (wc6Var != null) {
                fVar.i(10, wc6Var.computeSize());
                this.f391918o.writeFields(fVar);
            }
            r45.wc6 wc6Var2 = this.f391919p;
            if (wc6Var2 != null) {
                fVar.i(11, wc6Var2.computeSize());
                this.f391919p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f391910d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str4 = this.f391911e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f391912f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f391913g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            int e17 = i18 + b36.f.e(6, this.f391914h) + b36.f.e(7, this.f391915i) + b36.f.e(8, this.f391916m) + b36.f.e(9, this.f391917n);
            r45.wc6 wc6Var3 = this.f391918o;
            if (wc6Var3 != null) {
                e17 += b36.f.i(10, wc6Var3.computeSize());
            }
            r45.wc6 wc6Var4 = this.f391919p;
            return wc6Var4 != null ? e17 + b36.f.i(11, wc6Var4.computeSize()) : e17;
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
        r45.zc6 zc6Var = (r45.zc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    zc6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                zc6Var.f391910d = aVar2.d(intValue);
                return 0;
            case 3:
                zc6Var.f391911e = aVar2.k(intValue);
                return 0;
            case 4:
                zc6Var.f391912f = aVar2.k(intValue);
                return 0;
            case 5:
                zc6Var.f391913g = aVar2.k(intValue);
                return 0;
            case 6:
                zc6Var.f391914h = aVar2.g(intValue);
                return 0;
            case 7:
                zc6Var.f391915i = aVar2.g(intValue);
                return 0;
            case 8:
                zc6Var.f391916m = aVar2.g(intValue);
                return 0;
            case 9:
                zc6Var.f391917n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.wc6 wc6Var5 = new r45.wc6();
                    if (bArr2 != null && bArr2.length > 0) {
                        wc6Var5.parseFrom(bArr2);
                    }
                    zc6Var.f391918o = wc6Var5;
                }
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.wc6 wc6Var6 = new r45.wc6();
                    if (bArr3 != null && bArr3.length > 0) {
                        wc6Var6.parseFrom(bArr3);
                    }
                    zc6Var.f391919p = wc6Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
