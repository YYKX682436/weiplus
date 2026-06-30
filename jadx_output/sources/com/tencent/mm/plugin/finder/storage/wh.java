package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class wh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wh f128254d = new com.tencent.mm.plugin.finder.storage.wh();

    public wh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_local_backup_config_andr, "{\"topLoading\":0.3,\"top\":0,\"bottom\":0, \"minCount\":3, \"disableUnread\":false}", true));
        com.tencent.mm.plugin.finder.storage.d00 d00Var = new com.tencent.mm.plugin.finder.storage.d00();
        d00Var.f126613a = jSONObject.optDouble("topLoading", 0.3d);
        d00Var.f126614b = jSONObject.optInt("top");
        d00Var.f126615c = jSONObject.optInt("bottom");
        d00Var.f126616d = jSONObject.optInt("minCount");
        d00Var.f126617e = jSONObject.optBoolean("disableUnread");
        return d00Var;
    }
}
