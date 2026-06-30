package r45;

/* loaded from: classes9.dex */
public class aq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370188d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370190f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370192h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370194m;

    /* renamed from: o, reason: collision with root package name */
    public int f370196o;

    /* renamed from: e, reason: collision with root package name */
    public boolean f370189e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f370191g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f370193i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f370195n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f370197p = false;

    public final java.lang.String b() {
        return this.f370190f;
    }

    public final java.lang.String c() {
        return this.f370194m;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aq0)) {
            return false;
        }
        r45.aq0 aq0Var = (r45.aq0) fVar;
        return n51.f.a(this.f370188d, aq0Var.f370188d) && n51.f.a(this.f370190f, aq0Var.f370190f) && n51.f.a(this.f370192h, aq0Var.f370192h) && n51.f.a(this.f370194m, aq0Var.f370194m) && n51.f.a(java.lang.Integer.valueOf(this.f370196o), java.lang.Integer.valueOf(aq0Var.f370196o));
    }

    public final r45.aq0 d(java.lang.String str) {
        this.f370190f = str;
        this.f370191g = true;
        return this;
    }

    public final r45.aq0 e(java.lang.String str) {
        this.f370194m = str;
        this.f370195n = true;
        return this;
    }

    public final r45.aq0 f(java.lang.String str) {
        this.f370192h = str;
        this.f370193i = true;
        return this;
    }

    public final r45.aq0 g(java.lang.String str) {
        this.f370188d = str;
        this.f370189e = true;
        return this;
    }

    public final java.lang.String getThumbUrl() {
        return this.f370192h;
    }

    public final java.lang.String getTitle() {
        return this.f370188d;
    }

    public final int getType() {
        return this.f370196o;
    }

    public final r45.aq0 i(int i17) {
        this.f370196o = i17;
        this.f370197p = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370188d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370190f;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370192h;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f370194m;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            if (this.f370197p) {
                fVar.e(5, this.f370196o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f370188d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f370190f;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f370192h;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f370194m;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return this.f370197p ? j17 + b36.f.e(5, this.f370196o) : j17;
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
        r45.aq0 aq0Var = (r45.aq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aq0Var.f370188d = aVar2.k(intValue);
            aq0Var.f370189e = true;
            return 0;
        }
        if (intValue == 2) {
            aq0Var.f370190f = aVar2.k(intValue);
            aq0Var.f370191g = true;
            return 0;
        }
        if (intValue == 3) {
            aq0Var.f370192h = aVar2.k(intValue);
            aq0Var.f370193i = true;
            return 0;
        }
        if (intValue == 4) {
            aq0Var.f370194m = aVar2.k(intValue);
            aq0Var.f370195n = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        aq0Var.f370196o = aVar2.g(intValue);
        aq0Var.f370197p = true;
        return 0;
    }
}
