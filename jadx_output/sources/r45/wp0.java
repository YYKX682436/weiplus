package r45;

/* loaded from: classes9.dex */
public class wp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389359d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389360e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389361f;

    /* renamed from: g, reason: collision with root package name */
    public int f389362g;

    /* renamed from: h, reason: collision with root package name */
    public int f389363h;

    public r45.wp0 b(java.lang.String str) {
        this.f389361f = str;
        return this;
    }

    public r45.wp0 c(int i17) {
        this.f389363h = i17;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wp0)) {
            return false;
        }
        r45.wp0 wp0Var = (r45.wp0) fVar;
        return n51.f.a(this.f389359d, wp0Var.f389359d) && n51.f.a(this.f389360e, wp0Var.f389360e) && n51.f.a(this.f389361f, wp0Var.f389361f) && n51.f.a(java.lang.Integer.valueOf(this.f389362g), java.lang.Integer.valueOf(wp0Var.f389362g)) && n51.f.a(java.lang.Integer.valueOf(this.f389363h), java.lang.Integer.valueOf(wp0Var.f389363h));
    }

    public r45.wp0 d(int i17) {
        this.f389362g = i17;
        return this;
    }

    public r45.wp0 e(java.lang.String str) {
        this.f389360e = str;
        return this;
    }

    public r45.wp0 f(java.lang.String str) {
        this.f389359d = str;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389359d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389360e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f389361f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f389362g);
            fVar.e(5, this.f389363h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f389359d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f389360e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f389361f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f389362g) + b36.f.e(5, this.f389363h);
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
        r45.wp0 wp0Var = (r45.wp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wp0Var.f389359d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wp0Var.f389360e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            wp0Var.f389361f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            wp0Var.f389362g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wp0Var.f389363h = aVar2.g(intValue);
        return 0;
    }
}
