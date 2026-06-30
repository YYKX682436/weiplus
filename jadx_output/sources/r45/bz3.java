package r45;

/* loaded from: classes2.dex */
public class bz3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371172d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371173e;

    /* renamed from: f, reason: collision with root package name */
    public float f371174f;

    /* renamed from: g, reason: collision with root package name */
    public float f371175g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cg0 f371176h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371177i;

    /* renamed from: m, reason: collision with root package name */
    public float f371178m;

    /* renamed from: n, reason: collision with root package name */
    public float f371179n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bz3)) {
            return false;
        }
        r45.bz3 bz3Var = (r45.bz3) fVar;
        return n51.f.a(this.f371172d, bz3Var.f371172d) && n51.f.a(this.f371173e, bz3Var.f371173e) && n51.f.a(java.lang.Float.valueOf(this.f371174f), java.lang.Float.valueOf(bz3Var.f371174f)) && n51.f.a(java.lang.Float.valueOf(this.f371175g), java.lang.Float.valueOf(bz3Var.f371175g)) && n51.f.a(this.f371176h, bz3Var.f371176h) && n51.f.a(this.f371177i, bz3Var.f371177i) && n51.f.a(java.lang.Float.valueOf(this.f371178m), java.lang.Float.valueOf(bz3Var.f371178m)) && n51.f.a(java.lang.Float.valueOf(this.f371179n), java.lang.Float.valueOf(bz3Var.f371179n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371172d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371173e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.d(3, this.f371174f);
            fVar.d(4, this.f371175g);
            r45.cg0 cg0Var = this.f371176h;
            if (cg0Var != null) {
                fVar.i(6, cg0Var.computeSize());
                this.f371176h.writeFields(fVar);
            }
            java.lang.String str3 = this.f371177i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.d(8, this.f371178m);
            fVar.d(9, this.f371179n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f371172d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f371173e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int d17 = j17 + b36.f.d(3, this.f371174f) + b36.f.d(4, this.f371175g);
            r45.cg0 cg0Var2 = this.f371176h;
            if (cg0Var2 != null) {
                d17 += b36.f.i(6, cg0Var2.computeSize());
            }
            java.lang.String str6 = this.f371177i;
            if (str6 != null) {
                d17 += b36.f.j(7, str6);
            }
            return d17 + b36.f.d(8, this.f371178m) + b36.f.d(9, this.f371179n);
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
        r45.bz3 bz3Var = (r45.bz3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bz3Var.f371172d = aVar2.k(intValue);
                return 0;
            case 2:
                bz3Var.f371173e = aVar2.k(intValue);
                return 0;
            case 3:
                bz3Var.f371174f = aVar2.f(intValue);
                return 0;
            case 4:
                bz3Var.f371175g = aVar2.f(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.cg0 cg0Var3 = new r45.cg0();
                    if (bArr != null && bArr.length > 0) {
                        cg0Var3.parseFrom(bArr);
                    }
                    bz3Var.f371176h = cg0Var3;
                }
                return 0;
            case 7:
                bz3Var.f371177i = aVar2.k(intValue);
                return 0;
            case 8:
                bz3Var.f371178m = aVar2.f(intValue);
                return 0;
            case 9:
                bz3Var.f371179n = aVar2.f(intValue);
                return 0;
        }
    }
}
