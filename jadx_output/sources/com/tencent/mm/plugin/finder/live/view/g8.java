package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class g8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f116327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f116328b;

    public g8(com.tencent.mm.ipcinvoker.r rVar, org.json.JSONObject jSONObject) {
        this.f116327a = rVar;
        this.f116328b = jSONObject;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.ipcinvoker.r rVar = this.f116327a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.ju1 ju1Var = (r45.ju1) ke2.o0.f306976v.a(fVar, new r45.ju1());
            if (ju1Var == null || !ju1Var.getBoolean(0)) {
                com.tencent.mars.xlog.Log.e("FinderLiveProductRecordPlayWidget", "resp is null or no replay");
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(""));
            } else {
                java.lang.String string = ju1Var.getString(2);
                mn2.g1 g1Var = mn2.g1.f329975a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329965s));
                com.tencent.mm.plugin.finder.live.view.f8 f8Var = new com.tencent.mm.plugin.finder.live.view.f8(this.f116328b, ju1Var, rVar);
                b17.getClass();
                b17.f447873d = f8Var;
                b17.f();
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveProductRecordPlayWidget", "cgi failed: type=" + fVar.f70615a + " code=" + fVar.f70616b);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(""));
        }
        return jz5.f0.f302826a;
    }
}
