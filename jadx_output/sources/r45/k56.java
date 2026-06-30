package r45;

/* loaded from: classes7.dex */
public class k56 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378387d;

    /* renamed from: e, reason: collision with root package name */
    public long f378388e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378389f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378390g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378391h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378392i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xy6 f378393m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k56)) {
            return false;
        }
        r45.k56 k56Var = (r45.k56) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378387d), java.lang.Integer.valueOf(k56Var.f378387d)) && n51.f.a(java.lang.Long.valueOf(this.f378388e), java.lang.Long.valueOf(k56Var.f378388e)) && n51.f.a(this.f378389f, k56Var.f378389f) && n51.f.a(this.f378390g, k56Var.f378390g) && n51.f.a(this.f378391h, k56Var.f378391h) && n51.f.a(this.f378392i, k56Var.f378392i) && n51.f.a(this.f378393m, k56Var.f378393m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378387d);
            fVar.h(2, this.f378388e);
            java.lang.String str = this.f378389f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f378390g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f378391h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378392i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.xy6 xy6Var = this.f378393m;
            if (xy6Var != null) {
                fVar.i(7, xy6Var.computeSize());
                this.f378393m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378387d) + 0 + b36.f.h(2, this.f378388e);
            java.lang.String str5 = this.f378389f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f378390g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f378391h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f378392i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            r45.xy6 xy6Var2 = this.f378393m;
            return xy6Var2 != null ? e17 + b36.f.i(7, xy6Var2.computeSize()) : e17;
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
        r45.k56 k56Var = (r45.k56) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k56Var.f378387d = aVar2.g(intValue);
                return 0;
            case 2:
                k56Var.f378388e = aVar2.i(intValue);
                return 0;
            case 3:
                k56Var.f378389f = aVar2.k(intValue);
                return 0;
            case 4:
                k56Var.f378390g = aVar2.k(intValue);
                return 0;
            case 5:
                k56Var.f378391h = aVar2.k(intValue);
                return 0;
            case 6:
                k56Var.f378392i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.xy6 xy6Var3 = new r45.xy6();
                    if (bArr != null && bArr.length > 0) {
                        xy6Var3.parseFrom(bArr);
                    }
                    k56Var.f378393m = xy6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
