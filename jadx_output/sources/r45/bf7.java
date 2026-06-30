package r45;

/* loaded from: classes2.dex */
public class bf7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370731d;

    /* renamed from: e, reason: collision with root package name */
    public int f370732e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370733f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370734g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370735h;

    /* renamed from: i, reason: collision with root package name */
    public int f370736i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f370737m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f370738n = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bf7)) {
            return false;
        }
        r45.bf7 bf7Var = (r45.bf7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370731d), java.lang.Integer.valueOf(bf7Var.f370731d)) && n51.f.a(java.lang.Integer.valueOf(this.f370732e), java.lang.Integer.valueOf(bf7Var.f370732e)) && n51.f.a(this.f370733f, bf7Var.f370733f) && n51.f.a(this.f370734g, bf7Var.f370734g) && n51.f.a(this.f370735h, bf7Var.f370735h) && n51.f.a(java.lang.Integer.valueOf(this.f370736i), java.lang.Integer.valueOf(bf7Var.f370736i)) && n51.f.a(java.lang.Boolean.valueOf(this.f370737m), java.lang.Boolean.valueOf(bf7Var.f370737m)) && n51.f.a(java.lang.Boolean.valueOf(this.f370738n), java.lang.Boolean.valueOf(bf7Var.f370738n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370731d);
            fVar.e(2, this.f370732e);
            java.lang.String str = this.f370733f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f370734g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f370735h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f370736i);
            fVar.a(7, this.f370737m);
            fVar.a(8, this.f370738n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370731d) + 0 + b36.f.e(2, this.f370732e);
            java.lang.String str4 = this.f370733f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f370734g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f370735h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f370736i) + b36.f.a(7, this.f370737m) + b36.f.a(8, this.f370738n);
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
        r45.bf7 bf7Var = (r45.bf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bf7Var.f370731d = aVar2.g(intValue);
                return 0;
            case 2:
                bf7Var.f370732e = aVar2.g(intValue);
                return 0;
            case 3:
                bf7Var.f370733f = aVar2.k(intValue);
                return 0;
            case 4:
                bf7Var.f370734g = aVar2.k(intValue);
                return 0;
            case 5:
                bf7Var.f370735h = aVar2.k(intValue);
                return 0;
            case 6:
                bf7Var.f370736i = aVar2.g(intValue);
                return 0;
            case 7:
                bf7Var.f370737m = aVar2.c(intValue);
                return 0;
            case 8:
                bf7Var.f370738n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f370731d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "h5_version", valueOf, false);
            eVar.d(jSONObject, "sub_type", java.lang.Integer.valueOf(this.f370732e), false);
            eVar.d(jSONObject, "session_id", this.f370733f, false);
            eVar.d(jSONObject, "keyword_id", this.f370734g, false);
            eVar.d(jSONObject, "wording_id", this.f370735h, false);
            eVar.d(jSONObject, "sug_pos", java.lang.Integer.valueOf(this.f370736i), false);
            eVar.d(jSONObject, "is_local_search", java.lang.Boolean.valueOf(this.f370737m), false);
            eVar.d(jSONObject, "no_history_save", java.lang.Boolean.valueOf(this.f370738n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
