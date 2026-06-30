package r45;

/* loaded from: classes8.dex */
public class ya7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390931d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390932e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qa7 f390933f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xa7 f390934g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390935h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390936i;

    /* renamed from: m, reason: collision with root package name */
    public int f390937m;

    /* renamed from: n, reason: collision with root package name */
    public int f390938n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ya7)) {
            return false;
        }
        r45.ya7 ya7Var = (r45.ya7) fVar;
        return n51.f.a(this.f390931d, ya7Var.f390931d) && n51.f.a(this.f390932e, ya7Var.f390932e) && n51.f.a(this.f390933f, ya7Var.f390933f) && n51.f.a(this.f390934g, ya7Var.f390934g) && n51.f.a(this.f390935h, ya7Var.f390935h) && n51.f.a(this.f390936i, ya7Var.f390936i) && n51.f.a(java.lang.Integer.valueOf(this.f390937m), java.lang.Integer.valueOf(ya7Var.f390937m)) && n51.f.a(java.lang.Integer.valueOf(this.f390938n), java.lang.Integer.valueOf(ya7Var.f390938n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390931d;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f390932e;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            r45.qa7 qa7Var = this.f390933f;
            if (qa7Var != null) {
                fVar.i(9, qa7Var.computeSize());
                this.f390933f.writeFields(fVar);
            }
            r45.xa7 xa7Var = this.f390934g;
            if (xa7Var != null) {
                fVar.i(10, xa7Var.computeSize());
                this.f390934g.writeFields(fVar);
            }
            java.lang.String str3 = this.f390935h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f390936i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f390937m);
            fVar.e(8, this.f390938n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f390931d;
            int j17 = str5 != null ? 0 + b36.f.j(4, str5) : 0;
            java.lang.String str6 = this.f390932e;
            if (str6 != null) {
                j17 += b36.f.j(12, str6);
            }
            r45.qa7 qa7Var2 = this.f390933f;
            if (qa7Var2 != null) {
                j17 += b36.f.i(9, qa7Var2.computeSize());
            }
            r45.xa7 xa7Var2 = this.f390934g;
            if (xa7Var2 != null) {
                j17 += b36.f.i(10, xa7Var2.computeSize());
            }
            java.lang.String str7 = this.f390935h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f390936i;
            if (str8 != null) {
                j17 += b36.f.j(6, str8);
            }
            return j17 + b36.f.e(7, this.f390937m) + b36.f.e(8, this.f390938n);
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
        r45.ya7 ya7Var = (r45.ya7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 4:
                ya7Var.f390931d = aVar2.k(intValue);
                return 0;
            case 5:
                ya7Var.f390935h = aVar2.k(intValue);
                return 0;
            case 6:
                ya7Var.f390936i = aVar2.k(intValue);
                return 0;
            case 7:
                ya7Var.f390937m = aVar2.g(intValue);
                return 0;
            case 8:
                ya7Var.f390938n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.qa7 qa7Var3 = new r45.qa7();
                    if (bArr != null && bArr.length > 0) {
                        qa7Var3.parseFrom(bArr);
                    }
                    ya7Var.f390933f = qa7Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.xa7 xa7Var3 = new r45.xa7();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa7Var3.parseFrom(bArr2);
                    }
                    ya7Var.f390934g = xa7Var3;
                }
                return 0;
            case 11:
            default:
                return -1;
            case 12:
                ya7Var.f390932e = aVar2.k(intValue);
                return 0;
        }
    }
}
