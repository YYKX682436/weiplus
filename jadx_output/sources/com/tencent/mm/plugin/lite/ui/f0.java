package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class f0 implements com.tencent.mm.plugin.lite.ui.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144402a;

    public f0(com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView) {
        this.f144402a = wxaHalfScreenLiteAppView;
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void a() {
        com.tencent.mars.xlog.Log.i("WxaLiteAppDragHalfScreenUI", "onWholeScreen!");
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void b(float f17) {
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void c(com.tencent.mm.plugin.lite.ui.a type) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            str = "onHide";
        } else if (ordinal == 1) {
            str = "onFullScreen";
        } else if (ordinal == 2) {
            str = "onShow";
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            str = "onResume";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.tencent.mm.feature.lite.i) g0Var).Uj(this.f144402a.getAppUuid(), 0L, "app.halfScreen.animationEnd", jSONObject);
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void d(com.tencent.mm.plugin.lite.ui.a type) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            str = "onHide";
        } else if (ordinal == 1) {
            str = "onFullScreen";
        } else if (ordinal == 2) {
            str = "onShow";
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            str = "onResume";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.tencent.mm.feature.lite.i) g0Var).Uj(this.f144402a.getAppUuid(), 0L, "app.halfScreen.animationStart", jSONObject);
    }
}
