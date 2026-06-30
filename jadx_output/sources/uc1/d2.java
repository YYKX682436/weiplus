package uc1;

/* loaded from: classes13.dex */
public class d2 extends uc1.b {
    public static final int CTRL_INDEX = 200;
    public static final java.lang.String NAME = "translateMapMarker";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f426307g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f426308h = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        ((java.util.ArrayList) this.f426307g).add(new uc1.b2(this, lVar, jSONObject, i17));
        F();
    }

    public final synchronized void F() {
        if (this.f426308h.get()) {
            return;
        }
        if (((java.util.ArrayList) this.f426307g).size() == 0) {
            return;
        }
        java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.ArrayList) this.f426307g).remove(0);
        if (runnable != null) {
            ik1.h0.a().postToWorker(runnable);
        }
    }

    public final void G(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, boolean z17) {
        C(lVar, i17, o(str), str.equals("ok"), z17);
        this.f426308h.set(false);
        F();
    }
}
