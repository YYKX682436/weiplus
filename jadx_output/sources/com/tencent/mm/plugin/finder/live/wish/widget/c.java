package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.e f120692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.c04 f120693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.live.wish.widget.e eVar, r45.c04 c04Var) {
        super(0);
        this.f120692d = eVar;
        this.f120693e = c04Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.wish.widget.e eVar = this.f120692d;
        ((az2.f) ((jz5.n) eVar.f120701o).getValue()).b();
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = (com.tencent.mm.plugin.finder.live.wish.widget.t0) eVar.f120698i;
        t0Var.getClass();
        r45.c04 wishConfig = this.f120693e;
        kotlin.jvm.internal.o.g(wishConfig, "wishConfig");
        com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "interactionWishEditComplete: " + wishConfig);
        t0Var.H(wishConfig);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("wish_type", (int) wishConfig.getLong(0));
        jSONObject.put("wish_cnt", wishConfig.getLong(1));
        jSONObject.put("reward_text", wishConfig.getString(4));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.B2, jSONObject.toString(), null, 4, null);
        android.content.Context context = eVar.f118381d;
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f493744ow0));
        eVar.a();
        return jz5.f0.f302826a;
    }
}
