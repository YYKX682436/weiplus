package r45;

/* loaded from: classes10.dex */
public class km4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378821d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378822e;

    /* renamed from: f, reason: collision with root package name */
    public int f378823f;

    /* renamed from: g, reason: collision with root package name */
    public int f378824g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378825h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378826i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378827m;

    /* renamed from: n, reason: collision with root package name */
    public r45.vl4 f378828n;

    /* renamed from: o, reason: collision with root package name */
    public r45.hm4 f378829o;

    /* renamed from: p, reason: collision with root package name */
    public r45.jm4 f378830p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.km4)) {
            return false;
        }
        r45.km4 km4Var = (r45.km4) fVar;
        return n51.f.a(this.f378821d, km4Var.f378821d) && n51.f.a(this.f378822e, km4Var.f378822e) && n51.f.a(java.lang.Integer.valueOf(this.f378823f), java.lang.Integer.valueOf(km4Var.f378823f)) && n51.f.a(java.lang.Integer.valueOf(this.f378824g), java.lang.Integer.valueOf(km4Var.f378824g)) && n51.f.a(this.f378825h, km4Var.f378825h) && n51.f.a(this.f378826i, km4Var.f378826i) && n51.f.a(this.f378827m, km4Var.f378827m) && n51.f.a(this.f378828n, km4Var.f378828n) && n51.f.a(this.f378829o, km4Var.f378829o) && n51.f.a(this.f378830p, km4Var.f378830p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378821d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378822e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f378823f);
            fVar.e(4, this.f378824g);
            java.lang.String str3 = this.f378825h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378826i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f378827m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            r45.vl4 vl4Var = this.f378828n;
            if (vl4Var != null) {
                fVar.i(8, vl4Var.computeSize());
                this.f378828n.writeFields(fVar);
            }
            r45.hm4 hm4Var = this.f378829o;
            if (hm4Var != null) {
                fVar.i(9, hm4Var.computeSize());
                this.f378829o.writeFields(fVar);
            }
            r45.jm4 jm4Var = this.f378830p;
            if (jm4Var != null) {
                fVar.i(10, jm4Var.computeSize());
                this.f378830p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f378821d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f378822e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f378823f) + b36.f.e(4, this.f378824g);
            java.lang.String str8 = this.f378825h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f378826i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f378827m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            r45.vl4 vl4Var2 = this.f378828n;
            if (vl4Var2 != null) {
                e17 += b36.f.i(8, vl4Var2.computeSize());
            }
            r45.hm4 hm4Var2 = this.f378829o;
            if (hm4Var2 != null) {
                e17 += b36.f.i(9, hm4Var2.computeSize());
            }
            r45.jm4 jm4Var2 = this.f378830p;
            return jm4Var2 != null ? e17 + b36.f.i(10, jm4Var2.computeSize()) : e17;
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
        r45.km4 km4Var = (r45.km4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                km4Var.f378821d = aVar2.k(intValue);
                return 0;
            case 2:
                km4Var.f378822e = aVar2.k(intValue);
                return 0;
            case 3:
                km4Var.f378823f = aVar2.g(intValue);
                return 0;
            case 4:
                km4Var.f378824g = aVar2.g(intValue);
                return 0;
            case 5:
                km4Var.f378825h = aVar2.k(intValue);
                return 0;
            case 6:
                km4Var.f378826i = aVar2.k(intValue);
                return 0;
            case 7:
                km4Var.f378827m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.vl4 vl4Var3 = new r45.vl4();
                    if (bArr != null && bArr.length > 0) {
                        vl4Var3.parseFrom(bArr);
                    }
                    km4Var.f378828n = vl4Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.hm4 hm4Var3 = new r45.hm4();
                    if (bArr2 != null && bArr2.length > 0) {
                        hm4Var3.parseFrom(bArr2);
                    }
                    km4Var.f378829o = hm4Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.jm4 jm4Var3 = new r45.jm4();
                    if (bArr3 != null && bArr3.length > 0) {
                        jm4Var3.parseFrom(bArr3);
                    }
                    km4Var.f378830p = jm4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
