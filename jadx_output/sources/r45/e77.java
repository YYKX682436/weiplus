package r45;

/* loaded from: classes9.dex */
public class e77 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373084d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f77 f373085e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373086f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373087g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373088h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373089i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373090m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373091n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e77)) {
            return false;
        }
        r45.e77 e77Var = (r45.e77) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373084d), java.lang.Integer.valueOf(e77Var.f373084d)) && n51.f.a(this.f373085e, e77Var.f373085e) && n51.f.a(this.f373086f, e77Var.f373086f) && n51.f.a(this.f373087g, e77Var.f373087g) && n51.f.a(this.f373088h, e77Var.f373088h) && n51.f.a(this.f373089i, e77Var.f373089i) && n51.f.a(this.f373090m, e77Var.f373090m) && n51.f.a(this.f373091n, e77Var.f373091n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373084d);
            r45.f77 f77Var = this.f373085e;
            if (f77Var != null) {
                fVar.i(2, f77Var.computeSize());
                this.f373085e.writeFields(fVar);
            }
            java.lang.String str = this.f373086f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f373087g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f373088h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f373089i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f373090m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f373091n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373084d) + 0;
            r45.f77 f77Var2 = this.f373085e;
            if (f77Var2 != null) {
                e17 += b36.f.i(2, f77Var2.computeSize());
            }
            java.lang.String str7 = this.f373086f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f373087g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f373088h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f373089i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f373090m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f373091n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.e77 e77Var = (r45.e77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e77Var.f373084d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.f77 f77Var3 = new r45.f77();
                    if (bArr != null && bArr.length > 0) {
                        f77Var3.parseFrom(bArr);
                    }
                    e77Var.f373085e = f77Var3;
                }
                return 0;
            case 3:
                e77Var.f373086f = aVar2.k(intValue);
                return 0;
            case 4:
                e77Var.f373087g = aVar2.k(intValue);
                return 0;
            case 5:
                e77Var.f373088h = aVar2.k(intValue);
                return 0;
            case 6:
                e77Var.f373089i = aVar2.k(intValue);
                return 0;
            case 7:
                e77Var.f373090m = aVar2.k(intValue);
                return 0;
            case 8:
                e77Var.f373091n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
