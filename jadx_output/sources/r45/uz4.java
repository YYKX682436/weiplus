package r45;

/* loaded from: classes11.dex */
public class uz4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387756d;

    /* renamed from: e, reason: collision with root package name */
    public int f387757e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vz4 f387758f;

    /* renamed from: g, reason: collision with root package name */
    public int f387759g;

    /* renamed from: h, reason: collision with root package name */
    public r45.wz4 f387760h;

    /* renamed from: i, reason: collision with root package name */
    public int f387761i;

    /* renamed from: m, reason: collision with root package name */
    public int f387762m;

    /* renamed from: n, reason: collision with root package name */
    public int f387763n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f387764o;

    /* renamed from: p, reason: collision with root package name */
    public int f387765p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uz4)) {
            return false;
        }
        r45.uz4 uz4Var = (r45.uz4) fVar;
        return n51.f.a(this.f387756d, uz4Var.f387756d) && n51.f.a(java.lang.Integer.valueOf(this.f387757e), java.lang.Integer.valueOf(uz4Var.f387757e)) && n51.f.a(this.f387758f, uz4Var.f387758f) && n51.f.a(java.lang.Integer.valueOf(this.f387759g), java.lang.Integer.valueOf(uz4Var.f387759g)) && n51.f.a(this.f387760h, uz4Var.f387760h) && n51.f.a(java.lang.Integer.valueOf(this.f387761i), java.lang.Integer.valueOf(uz4Var.f387761i)) && n51.f.a(java.lang.Integer.valueOf(this.f387762m), java.lang.Integer.valueOf(uz4Var.f387762m)) && n51.f.a(java.lang.Integer.valueOf(this.f387763n), java.lang.Integer.valueOf(uz4Var.f387763n)) && n51.f.a(this.f387764o, uz4Var.f387764o) && n51.f.a(java.lang.Integer.valueOf(this.f387765p), java.lang.Integer.valueOf(uz4Var.f387765p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387756d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f387757e);
            r45.vz4 vz4Var = this.f387758f;
            if (vz4Var != null) {
                fVar.i(3, vz4Var.computeSize());
                this.f387758f.writeFields(fVar);
            }
            fVar.e(4, this.f387759g);
            r45.wz4 wz4Var = this.f387760h;
            if (wz4Var != null) {
                fVar.i(5, wz4Var.computeSize());
                this.f387760h.writeFields(fVar);
            }
            fVar.e(7, this.f387761i);
            fVar.e(8, this.f387762m);
            fVar.e(9, this.f387763n);
            java.lang.String str2 = this.f387764o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.e(11, this.f387765p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f387756d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f387757e);
            r45.vz4 vz4Var2 = this.f387758f;
            if (vz4Var2 != null) {
                j17 += b36.f.i(3, vz4Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(4, this.f387759g);
            r45.wz4 wz4Var2 = this.f387760h;
            if (wz4Var2 != null) {
                e17 += b36.f.i(5, wz4Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(7, this.f387761i) + b36.f.e(8, this.f387762m) + b36.f.e(9, this.f387763n);
            java.lang.String str4 = this.f387764o;
            if (str4 != null) {
                e18 += b36.f.j(10, str4);
            }
            return e18 + b36.f.e(11, this.f387765p);
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
        r45.uz4 uz4Var = (r45.uz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uz4Var.f387756d = aVar2.k(intValue);
                return 0;
            case 2:
                uz4Var.f387757e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.vz4 vz4Var3 = new r45.vz4();
                    if (bArr != null && bArr.length > 0) {
                        vz4Var3.parseFrom(bArr);
                    }
                    uz4Var.f387758f = vz4Var3;
                }
                return 0;
            case 4:
                uz4Var.f387759g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.wz4 wz4Var3 = new r45.wz4();
                    if (bArr2 != null && bArr2.length > 0) {
                        wz4Var3.parseFrom(bArr2);
                    }
                    uz4Var.f387760h = wz4Var3;
                }
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                uz4Var.f387761i = aVar2.g(intValue);
                return 0;
            case 8:
                uz4Var.f387762m = aVar2.g(intValue);
                return 0;
            case 9:
                uz4Var.f387763n = aVar2.g(intValue);
                return 0;
            case 10:
                uz4Var.f387764o = aVar2.k(intValue);
                return 0;
            case 11:
                uz4Var.f387765p = aVar2.g(intValue);
                return 0;
        }
    }
}
