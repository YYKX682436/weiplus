package pj4;

/* loaded from: classes10.dex */
public class t extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f355288d;

    /* renamed from: e, reason: collision with root package name */
    public int f355289e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f355290f;

    /* renamed from: g, reason: collision with root package name */
    public int f355291g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355292h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f355293i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f355294m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.t)) {
            return false;
        }
        pj4.t tVar = (pj4.t) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f355288d), java.lang.Integer.valueOf(tVar.f355288d)) && n51.f.a(java.lang.Integer.valueOf(this.f355289e), java.lang.Integer.valueOf(tVar.f355289e)) && n51.f.a(java.lang.Boolean.valueOf(this.f355290f), java.lang.Boolean.valueOf(tVar.f355290f)) && n51.f.a(java.lang.Integer.valueOf(this.f355291g), java.lang.Integer.valueOf(tVar.f355291g)) && n51.f.a(this.f355292h, tVar.f355292h) && n51.f.a(this.f355293i, tVar.f355293i) && n51.f.a(java.lang.Boolean.valueOf(this.f355294m), java.lang.Boolean.valueOf(tVar.f355294m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f355288d);
            fVar.e(2, this.f355289e);
            fVar.a(3, this.f355290f);
            fVar.e(4, this.f355291g);
            java.lang.String str = this.f355292h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f355293i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f355294m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f355288d) + 0 + b36.f.e(2, this.f355289e) + b36.f.a(3, this.f355290f) + b36.f.e(4, this.f355291g);
            java.lang.String str3 = this.f355292h;
            if (str3 != null) {
                e17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f355293i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.a(7, this.f355294m);
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
        pj4.t tVar = (pj4.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tVar.f355288d = aVar2.g(intValue);
                return 0;
            case 2:
                tVar.f355289e = aVar2.g(intValue);
                return 0;
            case 3:
                tVar.f355290f = aVar2.c(intValue);
                return 0;
            case 4:
                tVar.f355291g = aVar2.g(intValue);
                return 0;
            case 5:
                tVar.f355292h = aVar2.k(intValue);
                return 0;
            case 6:
                tVar.f355293i = aVar2.k(intValue);
                return 0;
            case 7:
                tVar.f355294m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f355288d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "scaleType", valueOf, false);
            eVar.d(jSONObject, "pullDownScene", java.lang.Integer.valueOf(this.f355289e), false);
            eVar.d(jSONObject, "isPreviewVideo", java.lang.Boolean.valueOf(this.f355290f), false);
            eVar.d(jSONObject, "statusCreateTime", java.lang.Integer.valueOf(this.f355291g), false);
            eVar.d(jSONObject, "textStatusId", this.f355292h, false);
            eVar.d(jSONObject, "userName", this.f355293i, false);
            eVar.d(jSONObject, "isContextResumedOnInitPullDownView", java.lang.Boolean.valueOf(this.f355294m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
