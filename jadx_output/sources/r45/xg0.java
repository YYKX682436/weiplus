package r45;

/* loaded from: classes2.dex */
public class xg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f390059d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f390060e;

    /* renamed from: f, reason: collision with root package name */
    public int f390061f;

    /* renamed from: g, reason: collision with root package name */
    public int f390062g;

    /* renamed from: h, reason: collision with root package name */
    public int f390063h;

    /* renamed from: i, reason: collision with root package name */
    public int f390064i;

    /* renamed from: m, reason: collision with root package name */
    public int f390065m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f390066n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f390067o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f390068p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f390069q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xg0)) {
            return false;
        }
        r45.xg0 xg0Var = (r45.xg0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f390059d), java.lang.Boolean.valueOf(xg0Var.f390059d)) && n51.f.a(java.lang.Boolean.valueOf(this.f390060e), java.lang.Boolean.valueOf(xg0Var.f390060e)) && n51.f.a(java.lang.Integer.valueOf(this.f390061f), java.lang.Integer.valueOf(xg0Var.f390061f)) && n51.f.a(java.lang.Integer.valueOf(this.f390062g), java.lang.Integer.valueOf(xg0Var.f390062g)) && n51.f.a(java.lang.Integer.valueOf(this.f390063h), java.lang.Integer.valueOf(xg0Var.f390063h)) && n51.f.a(java.lang.Integer.valueOf(this.f390064i), java.lang.Integer.valueOf(xg0Var.f390064i)) && n51.f.a(java.lang.Integer.valueOf(this.f390065m), java.lang.Integer.valueOf(xg0Var.f390065m)) && n51.f.a(java.lang.Boolean.valueOf(this.f390066n), java.lang.Boolean.valueOf(xg0Var.f390066n)) && n51.f.a(java.lang.Boolean.valueOf(this.f390067o), java.lang.Boolean.valueOf(xg0Var.f390067o)) && n51.f.a(java.lang.Boolean.valueOf(this.f390068p), java.lang.Boolean.valueOf(xg0Var.f390068p)) && n51.f.a(java.lang.Boolean.valueOf(this.f390069q), java.lang.Boolean.valueOf(xg0Var.f390069q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f390059d);
            fVar.a(2, this.f390060e);
            fVar.e(3, this.f390061f);
            fVar.e(4, this.f390062g);
            fVar.e(5, this.f390063h);
            fVar.e(6, this.f390064i);
            fVar.e(7, this.f390065m);
            fVar.a(8, this.f390066n);
            fVar.a(9, this.f390067o);
            fVar.a(10, this.f390068p);
            fVar.a(11, this.f390069q);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f390059d) + 0 + b36.f.a(2, this.f390060e) + b36.f.e(3, this.f390061f) + b36.f.e(4, this.f390062g) + b36.f.e(5, this.f390063h) + b36.f.e(6, this.f390064i) + b36.f.e(7, this.f390065m) + b36.f.a(8, this.f390066n) + b36.f.a(9, this.f390067o) + b36.f.a(10, this.f390068p) + b36.f.a(11, this.f390069q);
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
        r45.xg0 xg0Var = (r45.xg0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xg0Var.f390059d = aVar2.c(intValue);
                return 0;
            case 2:
                xg0Var.f390060e = aVar2.c(intValue);
                return 0;
            case 3:
                xg0Var.f390061f = aVar2.g(intValue);
                return 0;
            case 4:
                xg0Var.f390062g = aVar2.g(intValue);
                return 0;
            case 5:
                xg0Var.f390063h = aVar2.g(intValue);
                return 0;
            case 6:
                xg0Var.f390064i = aVar2.g(intValue);
                return 0;
            case 7:
                xg0Var.f390065m = aVar2.g(intValue);
                return 0;
            case 8:
                xg0Var.f390066n = aVar2.c(intValue);
                return 0;
            case 9:
                xg0Var.f390067o = aVar2.c(intValue);
                return 0;
            case 10:
                xg0Var.f390068p = aVar2.c(intValue);
                return 0;
            case 11:
                xg0Var.f390069q = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f390059d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "NeedPreloadFold", valueOf, false);
            eVar.d(jSONObject, "NeedPreload", java.lang.Boolean.valueOf(this.f390060e), false);
            eVar.d(jSONObject, "PreloadTopNum", java.lang.Integer.valueOf(this.f390061f), false);
            eVar.d(jSONObject, "PreloadInterval", java.lang.Integer.valueOf(this.f390062g), false);
            eVar.d(jSONObject, "PreloadSyncGap", java.lang.Integer.valueOf(this.f390063h), false);
            eVar.d(jSONObject, "PreloadPicGap", java.lang.Integer.valueOf(this.f390064i), false);
            eVar.d(jSONObject, "PreloadPicLimit", java.lang.Integer.valueOf(this.f390065m), false);
            eVar.d(jSONObject, "NeedPreloadAtForeground", java.lang.Boolean.valueOf(this.f390066n), false);
            eVar.d(jSONObject, "NeedPreloadAtChatList", java.lang.Boolean.valueOf(this.f390067o), false);
            eVar.d(jSONObject, "NeedPreloadAtAppMsgExpose", java.lang.Boolean.valueOf(this.f390068p), false);
            eVar.d(jSONObject, "NeedCheckTabAtForegroundPreload", java.lang.Boolean.valueOf(this.f390069q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
