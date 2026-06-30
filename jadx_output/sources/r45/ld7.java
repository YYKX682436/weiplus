package r45;

/* loaded from: classes9.dex */
public class ld7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379332d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379333e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379334f;

    /* renamed from: g, reason: collision with root package name */
    public r45.md7 f379335g;

    /* renamed from: h, reason: collision with root package name */
    public int f379336h;

    /* renamed from: i, reason: collision with root package name */
    public int f379337i;

    /* renamed from: m, reason: collision with root package name */
    public int f379338m;

    /* renamed from: n, reason: collision with root package name */
    public r45.om4 f379339n;

    /* renamed from: o, reason: collision with root package name */
    public r45.v46 f379340o;

    /* renamed from: p, reason: collision with root package name */
    public int f379341p;

    /* renamed from: q, reason: collision with root package name */
    public long f379342q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379343r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379344s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ld7)) {
            return false;
        }
        r45.ld7 ld7Var = (r45.ld7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379332d), java.lang.Integer.valueOf(ld7Var.f379332d)) && n51.f.a(this.f379333e, ld7Var.f379333e) && n51.f.a(this.f379334f, ld7Var.f379334f) && n51.f.a(this.f379335g, ld7Var.f379335g) && n51.f.a(java.lang.Integer.valueOf(this.f379336h), java.lang.Integer.valueOf(ld7Var.f379336h)) && n51.f.a(java.lang.Integer.valueOf(this.f379337i), java.lang.Integer.valueOf(ld7Var.f379337i)) && n51.f.a(java.lang.Integer.valueOf(this.f379338m), java.lang.Integer.valueOf(ld7Var.f379338m)) && n51.f.a(this.f379339n, ld7Var.f379339n) && n51.f.a(this.f379340o, ld7Var.f379340o) && n51.f.a(java.lang.Integer.valueOf(this.f379341p), java.lang.Integer.valueOf(ld7Var.f379341p)) && n51.f.a(java.lang.Long.valueOf(this.f379342q), java.lang.Long.valueOf(ld7Var.f379342q)) && n51.f.a(this.f379343r, ld7Var.f379343r) && n51.f.a(this.f379344s, ld7Var.f379344s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379332d);
            java.lang.String str = this.f379333e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379334f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.md7 md7Var = this.f379335g;
            if (md7Var != null) {
                fVar.i(4, md7Var.computeSize());
                this.f379335g.writeFields(fVar);
            }
            fVar.e(5, this.f379336h);
            fVar.e(6, this.f379337i);
            fVar.e(7, this.f379338m);
            r45.om4 om4Var = this.f379339n;
            if (om4Var != null) {
                fVar.i(8, om4Var.computeSize());
                this.f379339n.writeFields(fVar);
            }
            r45.v46 v46Var = this.f379340o;
            if (v46Var != null) {
                fVar.i(9, v46Var.computeSize());
                this.f379340o.writeFields(fVar);
            }
            fVar.e(10, this.f379341p);
            fVar.h(11, this.f379342q);
            java.lang.String str3 = this.f379343r;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            java.lang.String str4 = this.f379344s;
            if (str4 == null) {
                return 0;
            }
            fVar.j(13, str4);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379332d) + 0;
            java.lang.String str5 = this.f379333e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f379334f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            r45.md7 md7Var2 = this.f379335g;
            if (md7Var2 != null) {
                e17 += b36.f.i(4, md7Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.f379336h) + b36.f.e(6, this.f379337i) + b36.f.e(7, this.f379338m);
            r45.om4 om4Var2 = this.f379339n;
            if (om4Var2 != null) {
                e18 += b36.f.i(8, om4Var2.computeSize());
            }
            r45.v46 v46Var2 = this.f379340o;
            if (v46Var2 != null) {
                e18 += b36.f.i(9, v46Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(10, this.f379341p) + b36.f.h(11, this.f379342q);
            java.lang.String str7 = this.f379343r;
            if (str7 != null) {
                e19 += b36.f.j(12, str7);
            }
            java.lang.String str8 = this.f379344s;
            return str8 != null ? e19 + b36.f.j(13, str8) : e19;
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
        r45.ld7 ld7Var = (r45.ld7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ld7Var.f379332d = aVar2.g(intValue);
                return 0;
            case 2:
                ld7Var.f379333e = aVar2.k(intValue);
                return 0;
            case 3:
                ld7Var.f379334f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.md7 md7Var3 = new r45.md7();
                    if (bArr != null && bArr.length > 0) {
                        md7Var3.parseFrom(bArr);
                    }
                    ld7Var.f379335g = md7Var3;
                }
                return 0;
            case 5:
                ld7Var.f379336h = aVar2.g(intValue);
                return 0;
            case 6:
                ld7Var.f379337i = aVar2.g(intValue);
                return 0;
            case 7:
                ld7Var.f379338m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.om4 om4Var3 = new r45.om4();
                    if (bArr2 != null && bArr2.length > 0) {
                        om4Var3.parseFrom(bArr2);
                    }
                    ld7Var.f379339n = om4Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.v46 v46Var3 = new r45.v46();
                    if (bArr3 != null && bArr3.length > 0) {
                        v46Var3.parseFrom(bArr3);
                    }
                    ld7Var.f379340o = v46Var3;
                }
                return 0;
            case 10:
                ld7Var.f379341p = aVar2.g(intValue);
                return 0;
            case 11:
                ld7Var.f379342q = aVar2.i(intValue);
                return 0;
            case 12:
                ld7Var.f379343r = aVar2.k(intValue);
                return 0;
            case 13:
                ld7Var.f379344s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
