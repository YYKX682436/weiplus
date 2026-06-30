package r45;

/* loaded from: classes9.dex */
public class g04 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374777d;

    /* renamed from: e, reason: collision with root package name */
    public r45.n34 f374778e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n34 f374779f;

    /* renamed from: g, reason: collision with root package name */
    public int f374780g;

    /* renamed from: h, reason: collision with root package name */
    public int f374781h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374782i;

    /* renamed from: m, reason: collision with root package name */
    public int f374783m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g04)) {
            return false;
        }
        r45.g04 g04Var = (r45.g04) fVar;
        return n51.f.a(this.f374777d, g04Var.f374777d) && n51.f.a(this.f374778e, g04Var.f374778e) && n51.f.a(this.f374779f, g04Var.f374779f) && n51.f.a(java.lang.Integer.valueOf(this.f374780g), java.lang.Integer.valueOf(g04Var.f374780g)) && n51.f.a(java.lang.Integer.valueOf(this.f374781h), java.lang.Integer.valueOf(g04Var.f374781h)) && n51.f.a(this.f374782i, g04Var.f374782i) && n51.f.a(java.lang.Integer.valueOf(this.f374783m), java.lang.Integer.valueOf(g04Var.f374783m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374777d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.n34 n34Var = this.f374778e;
            if (n34Var != null) {
                fVar.i(2, n34Var.computeSize());
                this.f374778e.writeFields(fVar);
            }
            r45.n34 n34Var2 = this.f374779f;
            if (n34Var2 != null) {
                fVar.i(3, n34Var2.computeSize());
                this.f374779f.writeFields(fVar);
            }
            fVar.e(4, this.f374780g);
            fVar.e(5, this.f374781h);
            java.lang.String str2 = this.f374782i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f374783m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f374777d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.n34 n34Var3 = this.f374778e;
            if (n34Var3 != null) {
                j17 += b36.f.i(2, n34Var3.computeSize());
            }
            r45.n34 n34Var4 = this.f374779f;
            if (n34Var4 != null) {
                j17 += b36.f.i(3, n34Var4.computeSize());
            }
            int e17 = j17 + b36.f.e(4, this.f374780g) + b36.f.e(5, this.f374781h);
            java.lang.String str4 = this.f374782i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.e(7, this.f374783m);
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
        r45.g04 g04Var = (r45.g04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g04Var.f374777d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.n34 n34Var5 = new r45.n34();
                    if (bArr != null && bArr.length > 0) {
                        n34Var5.parseFrom(bArr);
                    }
                    g04Var.f374778e = n34Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.n34 n34Var6 = new r45.n34();
                    if (bArr2 != null && bArr2.length > 0) {
                        n34Var6.parseFrom(bArr2);
                    }
                    g04Var.f374779f = n34Var6;
                }
                return 0;
            case 4:
                g04Var.f374780g = aVar2.g(intValue);
                return 0;
            case 5:
                g04Var.f374781h = aVar2.g(intValue);
                return 0;
            case 6:
                g04Var.f374782i = aVar2.k(intValue);
                return 0;
            case 7:
                g04Var.f374783m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
