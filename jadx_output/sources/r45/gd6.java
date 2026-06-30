package r45;

/* loaded from: classes4.dex */
public class gd6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375142d;

    /* renamed from: e, reason: collision with root package name */
    public int f375143e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r86 f375144f;

    /* renamed from: g, reason: collision with root package name */
    public int f375145g;

    /* renamed from: h, reason: collision with root package name */
    public int f375146h;

    /* renamed from: i, reason: collision with root package name */
    public int f375147i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375148m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375149n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375150o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gd6)) {
            return false;
        }
        r45.gd6 gd6Var = (r45.gd6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375142d), java.lang.Integer.valueOf(gd6Var.f375142d)) && n51.f.a(java.lang.Integer.valueOf(this.f375143e), java.lang.Integer.valueOf(gd6Var.f375143e)) && n51.f.a(this.f375144f, gd6Var.f375144f) && n51.f.a(java.lang.Integer.valueOf(this.f375145g), java.lang.Integer.valueOf(gd6Var.f375145g)) && n51.f.a(java.lang.Integer.valueOf(this.f375146h), java.lang.Integer.valueOf(gd6Var.f375146h)) && n51.f.a(java.lang.Integer.valueOf(this.f375147i), java.lang.Integer.valueOf(gd6Var.f375147i)) && n51.f.a(this.f375148m, gd6Var.f375148m) && n51.f.a(this.f375149n, gd6Var.f375149n) && n51.f.a(this.f375150o, gd6Var.f375150o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375142d);
            fVar.e(2, this.f375143e);
            r45.r86 r86Var = this.f375144f;
            if (r86Var != null) {
                fVar.i(5, r86Var.computeSize());
                this.f375144f.writeFields(fVar);
            }
            fVar.e(6, this.f375145g);
            fVar.e(8, this.f375146h);
            fVar.e(9, this.f375147i);
            java.lang.String str = this.f375148m;
            if (str != null) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f375149n;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            java.lang.String str3 = this.f375150o;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375142d) + 0 + b36.f.e(2, this.f375143e);
            r45.r86 r86Var2 = this.f375144f;
            if (r86Var2 != null) {
                e17 += b36.f.i(5, r86Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.f375145g) + b36.f.e(8, this.f375146h) + b36.f.e(9, this.f375147i);
            java.lang.String str4 = this.f375148m;
            if (str4 != null) {
                e18 += b36.f.j(10, str4);
            }
            java.lang.String str5 = this.f375149n;
            if (str5 != null) {
                e18 += b36.f.j(11, str5);
            }
            java.lang.String str6 = this.f375150o;
            return str6 != null ? e18 + b36.f.j(12, str6) : e18;
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
        r45.gd6 gd6Var = (r45.gd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gd6Var.f375142d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gd6Var.f375143e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.r86 r86Var3 = new r45.r86();
                if (bArr != null && bArr.length > 0) {
                    r86Var3.parseFrom(bArr);
                }
                gd6Var.f375144f = r86Var3;
            }
            return 0;
        }
        if (intValue == 6) {
            gd6Var.f375145g = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 8:
                gd6Var.f375146h = aVar2.g(intValue);
                return 0;
            case 9:
                gd6Var.f375147i = aVar2.g(intValue);
                return 0;
            case 10:
                gd6Var.f375148m = aVar2.k(intValue);
                return 0;
            case 11:
                gd6Var.f375149n = aVar2.k(intValue);
                return 0;
            case 12:
                gd6Var.f375150o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
