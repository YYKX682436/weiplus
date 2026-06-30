package kf2;

/* loaded from: classes.dex */
public final class p0 extends kf2.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(df2.k controller, com.tencent.mm.plugin.lite.s liteAppStore) {
        super(controller, liteAppStore);
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(liteAppStore, "liteAppStore");
    }

    @Override // kf2.x
    public boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        if (jSONObject == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("vertical_scroll_rects");
        kotlin.jvm.internal.o.f(jSONArray, "getJSONArray(...)");
        c75.c.d(jSONArray, new kf2.n0(arrayList));
        org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("horizontal_scroll_rects");
        kotlin.jvm.internal.o.f(jSONArray2, "getJSONArray(...)");
        c75.c.d(jSONArray2, new kf2.o0(arrayList2));
        com.tencent.mm.plugin.finder.live.controller.gamependant.GamePendantContainer gamePendantContainer = this.f307311a.f230525p;
        if (gamePendantContainer == null) {
            return false;
        }
        pm0.v.X(new kf2.f(gamePendantContainer, arrayList, arrayList2));
        return false;
    }

    @Override // kf2.x
    public java.lang.String e() {
        return "setScrollRangeParams";
    }
}
