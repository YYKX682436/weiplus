package r45;

/* loaded from: classes9.dex */
public class lj5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379523d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379524e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379525f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379526g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379527h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379528i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lj5)) {
            return false;
        }
        r45.lj5 lj5Var = (r45.lj5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379523d), java.lang.Integer.valueOf(lj5Var.f379523d)) && n51.f.a(this.f379524e, lj5Var.f379524e) && n51.f.a(this.f379525f, lj5Var.f379525f) && n51.f.a(this.f379526g, lj5Var.f379526g) && n51.f.a(this.f379527h, lj5Var.f379527h) && n51.f.a(this.f379528i, lj5Var.f379528i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379523d);
            java.lang.String str = this.f379524e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379525f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f379526g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f379527h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f379528i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379523d) + 0;
            java.lang.String str6 = this.f379524e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f379525f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f379526g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f379527h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f379528i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.lj5 lj5Var = (r45.lj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lj5Var.f379523d = aVar2.g(intValue);
                return 0;
            case 2:
                lj5Var.f379524e = aVar2.k(intValue);
                return 0;
            case 3:
                lj5Var.f379525f = aVar2.k(intValue);
                return 0;
            case 4:
                lj5Var.f379526g = aVar2.k(intValue);
                return 0;
            case 5:
                lj5Var.f379527h = aVar2.k(intValue);
                return 0;
            case 6:
                lj5Var.f379528i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
