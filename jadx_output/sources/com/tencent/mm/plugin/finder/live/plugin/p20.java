package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p20 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t20 f113818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f113820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f113821g;

    public p20(com.tencent.mm.plugin.finder.live.plugin.t20 t20Var, java.lang.String str, android.view.View view, yz5.a aVar) {
        this.f113818d = t20Var;
        this.f113819e = str;
        this.f113820f = view;
        this.f113821g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.t20 t20Var = this.f113818d;
        t20Var.v1();
        ((android.widget.TextView) ((jz5.n) t20Var.f114333r).getValue()).setText(this.f113819e);
        com.tencent.mm.plugin.finder.live.plugin.t20.t1(t20Var, this.f113820f);
        t20Var.K0(0);
        this.f113821g.invoke();
    }
}
