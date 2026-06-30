package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f114716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f114717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.r0 f114718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114719g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114720h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114721i;

    public vg(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar, in5.r0 r0Var, android.view.View view, android.view.View view2, kotlin.jvm.internal.h0 h0Var) {
        this.f114716d = mgVar;
        this.f114717e = zfVar;
        this.f114718f = r0Var;
        this.f114719g = view;
        this.f114720h = view2;
        this.f114721i = h0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.plugin.mg commentPlugin = this.f114716d;
        if (itemId == 163) {
            kotlin.jvm.internal.o.g(commentPlugin, "commentPlugin");
            dk2.zf msg = this.f114717e;
            kotlin.jvm.internal.o.g(msg, "msg");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", msg.a());
            bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 2);
            bundle.putString("PARAM_MEMBERS_PROFILE_MESSAGE_ID", msg.v());
            bundle.putLong("PARAM_MEMBERS_PROFILE_MESSAGE_SEQ", msg.m());
            commentPlugin.f113503p.statusChange(qo0.b.f365376l1, bundle);
        } else {
            com.tencent.mm.plugin.finder.view.zq zqVar = com.tencent.mm.plugin.finder.view.zq.f133490a;
            android.content.Context context = commentPlugin.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            zqVar.d(1, context, commentPlugin.S0(), this.f114718f.f293120d, this.f114719g, this.f114716d, menuItem, i17, this.f114717e);
        }
        this.f114720h.setBackground((android.graphics.drawable.Drawable) this.f114721i.f310123d);
        com.tencent.mm.plugin.finder.view.oc.f132781a.a();
    }
}
