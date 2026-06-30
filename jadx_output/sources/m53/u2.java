package m53;

/* loaded from: classes8.dex */
public class u2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324090d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324091e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324092f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324093g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f324094h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f324095i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f324096m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f324097n;

    /* renamed from: o, reason: collision with root package name */
    public m53.q3 f324098o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.u2)) {
            return false;
        }
        m53.u2 u2Var = (m53.u2) fVar;
        return n51.f.a(this.f324090d, u2Var.f324090d) && n51.f.a(this.f324091e, u2Var.f324091e) && n51.f.a(this.f324092f, u2Var.f324092f) && n51.f.a(this.f324093g, u2Var.f324093g) && n51.f.a(this.f324094h, u2Var.f324094h) && n51.f.a(this.f324095i, u2Var.f324095i) && n51.f.a(java.lang.Boolean.valueOf(this.f324096m), java.lang.Boolean.valueOf(u2Var.f324096m)) && n51.f.a(java.lang.Boolean.valueOf(this.f324097n), java.lang.Boolean.valueOf(u2Var.f324097n)) && n51.f.a(this.f324098o, u2Var.f324098o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324090d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f324091e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f324092f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f324093g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f324094h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f324095i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.a(7, this.f324096m);
            fVar.a(8, this.f324097n);
            m53.q3 q3Var = this.f324098o;
            if (q3Var != null) {
                fVar.i(9, q3Var.computeSize());
                this.f324098o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f324090d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f324091e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f324092f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f324093g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f324094h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f324095i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            int a17 = j17 + b36.f.a(7, this.f324096m) + b36.f.a(8, this.f324097n);
            m53.q3 q3Var2 = this.f324098o;
            return q3Var2 != null ? a17 + b36.f.i(9, q3Var2.computeSize()) : a17;
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
        m53.u2 u2Var = (m53.u2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                u2Var.f324090d = aVar2.k(intValue);
                return 0;
            case 2:
                u2Var.f324091e = aVar2.k(intValue);
                return 0;
            case 3:
                u2Var.f324092f = aVar2.k(intValue);
                return 0;
            case 4:
                u2Var.f324093g = aVar2.k(intValue);
                return 0;
            case 5:
                u2Var.f324094h = aVar2.k(intValue);
                return 0;
            case 6:
                u2Var.f324095i = aVar2.k(intValue);
                return 0;
            case 7:
                u2Var.f324096m = aVar2.c(intValue);
                return 0;
            case 8:
                u2Var.f324097n = aVar2.c(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    m53.q3 q3Var3 = new m53.q3();
                    if (bArr != null && bArr.length > 0) {
                        q3Var3.parseFrom(bArr);
                    }
                    u2Var.f324098o = q3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
