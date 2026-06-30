package r45;

/* loaded from: classes4.dex */
public class lf6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379428d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379429e;

    /* renamed from: f, reason: collision with root package name */
    public int f379430f;

    /* renamed from: g, reason: collision with root package name */
    public r45.tl5 f379431g;

    /* renamed from: h, reason: collision with root package name */
    public r45.oe6 f379432h;

    /* renamed from: i, reason: collision with root package name */
    public long f379433i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379434m;

    /* renamed from: n, reason: collision with root package name */
    public int f379435n;

    /* renamed from: o, reason: collision with root package name */
    public int f379436o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lf6)) {
            return false;
        }
        r45.lf6 lf6Var = (r45.lf6) fVar;
        return n51.f.a(this.f379428d, lf6Var.f379428d) && n51.f.a(this.f379429e, lf6Var.f379429e) && n51.f.a(java.lang.Integer.valueOf(this.f379430f), java.lang.Integer.valueOf(lf6Var.f379430f)) && n51.f.a(this.f379431g, lf6Var.f379431g) && n51.f.a(this.f379432h, lf6Var.f379432h) && n51.f.a(java.lang.Long.valueOf(this.f379433i), java.lang.Long.valueOf(lf6Var.f379433i)) && n51.f.a(this.f379434m, lf6Var.f379434m) && n51.f.a(java.lang.Integer.valueOf(this.f379435n), java.lang.Integer.valueOf(lf6Var.f379435n)) && n51.f.a(java.lang.Integer.valueOf(this.f379436o), java.lang.Integer.valueOf(lf6Var.f379436o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379428d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379429e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f379430f);
            r45.tl5 tl5Var = this.f379431g;
            if (tl5Var != null) {
                fVar.i(4, tl5Var.computeSize());
                this.f379431g.writeFields(fVar);
            }
            r45.oe6 oe6Var = this.f379432h;
            if (oe6Var != null) {
                fVar.i(5, oe6Var.computeSize());
                this.f379432h.writeFields(fVar);
            }
            fVar.h(6, this.f379433i);
            java.lang.String str3 = this.f379434m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f379435n);
            fVar.e(9, this.f379436o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f379428d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f379429e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f379430f);
            r45.tl5 tl5Var2 = this.f379431g;
            if (tl5Var2 != null) {
                e17 += b36.f.i(4, tl5Var2.computeSize());
            }
            r45.oe6 oe6Var2 = this.f379432h;
            if (oe6Var2 != null) {
                e17 += b36.f.i(5, oe6Var2.computeSize());
            }
            int h17 = e17 + b36.f.h(6, this.f379433i);
            java.lang.String str6 = this.f379434m;
            if (str6 != null) {
                h17 += b36.f.j(7, str6);
            }
            return h17 + b36.f.e(8, this.f379435n) + b36.f.e(9, this.f379436o);
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
        r45.lf6 lf6Var = (r45.lf6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lf6Var.f379428d = aVar2.k(intValue);
                return 0;
            case 2:
                lf6Var.f379429e = aVar2.k(intValue);
                return 0;
            case 3:
                lf6Var.f379430f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tl5 tl5Var3 = new r45.tl5();
                    if (bArr != null && bArr.length > 0) {
                        tl5Var3.parseFrom(bArr);
                    }
                    lf6Var.f379431g = tl5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.oe6 oe6Var3 = new r45.oe6();
                    if (bArr2 != null && bArr2.length > 0) {
                        oe6Var3.parseFrom(bArr2);
                    }
                    lf6Var.f379432h = oe6Var3;
                }
                return 0;
            case 6:
                lf6Var.f379433i = aVar2.i(intValue);
                return 0;
            case 7:
                lf6Var.f379434m = aVar2.k(intValue);
                return 0;
            case 8:
                lf6Var.f379435n = aVar2.g(intValue);
                return 0;
            case 9:
                lf6Var.f379436o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
