package r45;

/* loaded from: classes10.dex */
public class ji0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f377822d;

    /* renamed from: e, reason: collision with root package name */
    public float f377823e;

    /* renamed from: f, reason: collision with root package name */
    public int f377824f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377825g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377826h;

    /* renamed from: i, reason: collision with root package name */
    public float f377827i;

    /* renamed from: m, reason: collision with root package name */
    public int f377828m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f377829n;

    /* renamed from: o, reason: collision with root package name */
    public int f377830o;

    /* renamed from: p, reason: collision with root package name */
    public int f377831p;

    /* renamed from: q, reason: collision with root package name */
    public r45.he6 f377832q;

    /* renamed from: r, reason: collision with root package name */
    public r45.di0 f377833r;

    /* renamed from: s, reason: collision with root package name */
    public r45.kp f377834s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ji0)) {
            return false;
        }
        r45.ji0 ji0Var = (r45.ji0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f377822d), java.lang.Float.valueOf(ji0Var.f377822d)) && n51.f.a(java.lang.Float.valueOf(this.f377823e), java.lang.Float.valueOf(ji0Var.f377823e)) && n51.f.a(java.lang.Integer.valueOf(this.f377824f), java.lang.Integer.valueOf(ji0Var.f377824f)) && n51.f.a(this.f377825g, ji0Var.f377825g) && n51.f.a(this.f377826h, ji0Var.f377826h) && n51.f.a(java.lang.Float.valueOf(this.f377827i), java.lang.Float.valueOf(ji0Var.f377827i)) && n51.f.a(java.lang.Integer.valueOf(this.f377828m), java.lang.Integer.valueOf(ji0Var.f377828m)) && n51.f.a(this.f377829n, ji0Var.f377829n) && n51.f.a(java.lang.Integer.valueOf(this.f377830o), java.lang.Integer.valueOf(ji0Var.f377830o)) && n51.f.a(java.lang.Integer.valueOf(this.f377831p), java.lang.Integer.valueOf(ji0Var.f377831p)) && n51.f.a(this.f377832q, ji0Var.f377832q) && n51.f.a(this.f377833r, ji0Var.f377833r) && n51.f.a(this.f377834s, ji0Var.f377834s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f377822d);
            fVar.d(2, this.f377823e);
            fVar.e(3, this.f377824f);
            java.lang.String str = this.f377825g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f377826h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.d(6, this.f377827i);
            fVar.e(7, this.f377828m);
            java.lang.String str3 = this.f377829n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f377830o);
            fVar.e(10, this.f377831p);
            r45.he6 he6Var = this.f377832q;
            if (he6Var != null) {
                fVar.i(11, he6Var.computeSize());
                this.f377832q.writeFields(fVar);
            }
            r45.di0 di0Var = this.f377833r;
            if (di0Var != null) {
                fVar.i(12, di0Var.computeSize());
                this.f377833r.writeFields(fVar);
            }
            r45.kp kpVar = this.f377834s;
            if (kpVar == null) {
                return 0;
            }
            fVar.i(13, kpVar.computeSize());
            this.f377834s.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f377822d) + 0 + b36.f.d(2, this.f377823e) + b36.f.e(3, this.f377824f);
            java.lang.String str4 = this.f377825g;
            if (str4 != null) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f377826h;
            if (str5 != null) {
                d17 += b36.f.j(5, str5);
            }
            int d18 = d17 + b36.f.d(6, this.f377827i) + b36.f.e(7, this.f377828m);
            java.lang.String str6 = this.f377829n;
            if (str6 != null) {
                d18 += b36.f.j(8, str6);
            }
            int e17 = d18 + b36.f.e(9, this.f377830o) + b36.f.e(10, this.f377831p);
            r45.he6 he6Var2 = this.f377832q;
            if (he6Var2 != null) {
                e17 += b36.f.i(11, he6Var2.computeSize());
            }
            r45.di0 di0Var2 = this.f377833r;
            if (di0Var2 != null) {
                e17 += b36.f.i(12, di0Var2.computeSize());
            }
            r45.kp kpVar2 = this.f377834s;
            return kpVar2 != null ? e17 + b36.f.i(13, kpVar2.computeSize()) : e17;
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
        r45.ji0 ji0Var = (r45.ji0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ji0Var.f377822d = aVar2.f(intValue);
                return 0;
            case 2:
                ji0Var.f377823e = aVar2.f(intValue);
                return 0;
            case 3:
                ji0Var.f377824f = aVar2.g(intValue);
                return 0;
            case 4:
                ji0Var.f377825g = aVar2.k(intValue);
                return 0;
            case 5:
                ji0Var.f377826h = aVar2.k(intValue);
                return 0;
            case 6:
                ji0Var.f377827i = aVar2.f(intValue);
                return 0;
            case 7:
                ji0Var.f377828m = aVar2.g(intValue);
                return 0;
            case 8:
                ji0Var.f377829n = aVar2.k(intValue);
                return 0;
            case 9:
                ji0Var.f377830o = aVar2.g(intValue);
                return 0;
            case 10:
                ji0Var.f377831p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he6 he6Var3 = new r45.he6();
                    if (bArr != null && bArr.length > 0) {
                        he6Var3.parseFrom(bArr);
                    }
                    ji0Var.f377832q = he6Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.di0 di0Var3 = new r45.di0();
                    if (bArr2 != null && bArr2.length > 0) {
                        di0Var3.parseFrom(bArr2);
                    }
                    ji0Var.f377833r = di0Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.kp kpVar3 = new r45.kp();
                    if (bArr3 != null && bArr3.length > 0) {
                        kpVar3.parseFrom(bArr3);
                    }
                    ji0Var.f377834s = kpVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
