package r45;

/* loaded from: classes10.dex */
public class gi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f375268d;

    /* renamed from: e, reason: collision with root package name */
    public float f375269e;

    /* renamed from: f, reason: collision with root package name */
    public float f375270f;

    /* renamed from: g, reason: collision with root package name */
    public int f375271g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375272h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375273i;

    /* renamed from: m, reason: collision with root package name */
    public int f375274m;

    /* renamed from: n, reason: collision with root package name */
    public int f375275n;

    /* renamed from: o, reason: collision with root package name */
    public r45.di0 f375276o;

    /* renamed from: p, reason: collision with root package name */
    public r45.kp f375277p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gi0)) {
            return false;
        }
        r45.gi0 gi0Var = (r45.gi0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f375268d), java.lang.Float.valueOf(gi0Var.f375268d)) && n51.f.a(java.lang.Float.valueOf(this.f375269e), java.lang.Float.valueOf(gi0Var.f375269e)) && n51.f.a(java.lang.Float.valueOf(this.f375270f), java.lang.Float.valueOf(gi0Var.f375270f)) && n51.f.a(java.lang.Integer.valueOf(this.f375271g), java.lang.Integer.valueOf(gi0Var.f375271g)) && n51.f.a(this.f375272h, gi0Var.f375272h) && n51.f.a(this.f375273i, gi0Var.f375273i) && n51.f.a(java.lang.Integer.valueOf(this.f375274m), java.lang.Integer.valueOf(gi0Var.f375274m)) && n51.f.a(java.lang.Integer.valueOf(this.f375275n), java.lang.Integer.valueOf(gi0Var.f375275n)) && n51.f.a(this.f375276o, gi0Var.f375276o) && n51.f.a(this.f375277p, gi0Var.f375277p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f375268d);
            fVar.d(2, this.f375269e);
            fVar.d(3, this.f375270f);
            fVar.e(4, this.f375271g);
            java.lang.String str = this.f375272h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f375273i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f375274m);
            fVar.e(8, this.f375275n);
            r45.di0 di0Var = this.f375276o;
            if (di0Var != null) {
                fVar.i(9, di0Var.computeSize());
                this.f375276o.writeFields(fVar);
            }
            r45.kp kpVar = this.f375277p;
            if (kpVar != null) {
                fVar.i(10, kpVar.computeSize());
                this.f375277p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f375268d) + 0 + b36.f.d(2, this.f375269e) + b36.f.d(3, this.f375270f) + b36.f.e(4, this.f375271g);
            java.lang.String str3 = this.f375272h;
            if (str3 != null) {
                d17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f375273i;
            if (str4 != null) {
                d17 += b36.f.j(6, str4);
            }
            int e17 = d17 + b36.f.e(7, this.f375274m) + b36.f.e(8, this.f375275n);
            r45.di0 di0Var2 = this.f375276o;
            if (di0Var2 != null) {
                e17 += b36.f.i(9, di0Var2.computeSize());
            }
            r45.kp kpVar2 = this.f375277p;
            return kpVar2 != null ? e17 + b36.f.i(10, kpVar2.computeSize()) : e17;
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
        r45.gi0 gi0Var = (r45.gi0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gi0Var.f375268d = aVar2.f(intValue);
                return 0;
            case 2:
                gi0Var.f375269e = aVar2.f(intValue);
                return 0;
            case 3:
                gi0Var.f375270f = aVar2.f(intValue);
                return 0;
            case 4:
                gi0Var.f375271g = aVar2.g(intValue);
                return 0;
            case 5:
                gi0Var.f375272h = aVar2.k(intValue);
                return 0;
            case 6:
                gi0Var.f375273i = aVar2.k(intValue);
                return 0;
            case 7:
                gi0Var.f375274m = aVar2.g(intValue);
                return 0;
            case 8:
                gi0Var.f375275n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.di0 di0Var3 = new r45.di0();
                    if (bArr != null && bArr.length > 0) {
                        di0Var3.parseFrom(bArr);
                    }
                    gi0Var.f375276o = di0Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.kp kpVar3 = new r45.kp();
                    if (bArr2 != null && bArr2.length > 0) {
                        kpVar3.parseFrom(bArr2);
                    }
                    gi0Var.f375277p = kpVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
