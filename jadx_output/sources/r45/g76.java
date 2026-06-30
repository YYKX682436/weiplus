package r45;

/* loaded from: classes4.dex */
public class g76 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f374960d;

    /* renamed from: e, reason: collision with root package name */
    public int f374961e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f374962f;

    /* renamed from: g, reason: collision with root package name */
    public int f374963g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f374964h;

    /* renamed from: i, reason: collision with root package name */
    public int f374965i;

    /* renamed from: m, reason: collision with root package name */
    public r45.mo5 f374966m;

    /* renamed from: n, reason: collision with root package name */
    public int f374967n;

    /* renamed from: o, reason: collision with root package name */
    public int f374968o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f374969p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f374970q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g76)) {
            return false;
        }
        r45.g76 g76Var = (r45.g76) fVar;
        return n51.f.a(this.BaseRequest, g76Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f374960d), java.lang.Long.valueOf(g76Var.f374960d)) && n51.f.a(java.lang.Integer.valueOf(this.f374961e), java.lang.Integer.valueOf(g76Var.f374961e)) && n51.f.a(this.f374962f, g76Var.f374962f) && n51.f.a(java.lang.Integer.valueOf(this.f374963g), java.lang.Integer.valueOf(g76Var.f374963g)) && n51.f.a(this.f374964h, g76Var.f374964h) && n51.f.a(java.lang.Integer.valueOf(this.f374965i), java.lang.Integer.valueOf(g76Var.f374965i)) && n51.f.a(this.f374966m, g76Var.f374966m) && n51.f.a(java.lang.Integer.valueOf(this.f374967n), java.lang.Integer.valueOf(g76Var.f374967n)) && n51.f.a(java.lang.Integer.valueOf(this.f374968o), java.lang.Integer.valueOf(g76Var.f374968o)) && n51.f.a(this.f374969p, g76Var.f374969p) && n51.f.a(this.f374970q, g76Var.f374970q);
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
            fVar.h(2, this.f374960d);
            fVar.e(3, this.f374961e);
            r45.cu5 cu5Var = this.f374962f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f374962f.writeFields(fVar);
            }
            fVar.e(5, this.f374963g);
            r45.cu5 cu5Var2 = this.f374964h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.computeSize());
                this.f374964h.writeFields(fVar);
            }
            fVar.e(7, this.f374965i);
            r45.mo5 mo5Var = this.f374966m;
            if (mo5Var != null) {
                fVar.i(8, mo5Var.computeSize());
                this.f374966m.writeFields(fVar);
            }
            fVar.e(9, this.f374967n);
            fVar.e(10, this.f374968o);
            java.lang.String str = this.f374969p;
            if (str != null) {
                fVar.j(11, str);
            }
            java.lang.String str2 = this.f374970q;
            if (str2 == null) {
                return 0;
            }
            fVar.j(12, str2);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f374960d) + b36.f.e(3, this.f374961e);
            r45.cu5 cu5Var3 = this.f374962f;
            if (cu5Var3 != null) {
                i18 += b36.f.i(4, cu5Var3.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f374963g);
            r45.cu5 cu5Var4 = this.f374964h;
            if (cu5Var4 != null) {
                e17 += b36.f.i(6, cu5Var4.computeSize());
            }
            int e18 = e17 + b36.f.e(7, this.f374965i);
            r45.mo5 mo5Var2 = this.f374966m;
            if (mo5Var2 != null) {
                e18 += b36.f.i(8, mo5Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(9, this.f374967n) + b36.f.e(10, this.f374968o);
            java.lang.String str3 = this.f374969p;
            if (str3 != null) {
                e19 += b36.f.j(11, str3);
            }
            java.lang.String str4 = this.f374970q;
            return str4 != null ? e19 + b36.f.j(12, str4) : e19;
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
        r45.g76 g76Var = (r45.g76) objArr[1];
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
                    g76Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                g76Var.f374960d = aVar2.i(intValue);
                return 0;
            case 3:
                g76Var.f374961e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    g76Var.f374962f = cu5Var5;
                }
                return 0;
            case 5:
                g76Var.f374963g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    g76Var.f374964h = cu5Var6;
                }
                return 0;
            case 7:
                g76Var.f374965i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.mo5 mo5Var3 = new r45.mo5();
                    if (bArr4 != null && bArr4.length > 0) {
                        mo5Var3.parseFrom(bArr4);
                    }
                    g76Var.f374966m = mo5Var3;
                }
                return 0;
            case 9:
                g76Var.f374967n = aVar2.g(intValue);
                return 0;
            case 10:
                g76Var.f374968o = aVar2.g(intValue);
                return 0;
            case 11:
                g76Var.f374969p = aVar2.k(intValue);
                return 0;
            case 12:
                g76Var.f374970q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
