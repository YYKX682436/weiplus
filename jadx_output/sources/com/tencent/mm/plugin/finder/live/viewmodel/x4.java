package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.c5 f117527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.d5 f117528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.c6 f117529f;

    public x4(com.tencent.mm.plugin.finder.live.viewmodel.c5 c5Var, com.tencent.mm.plugin.finder.live.viewmodel.d5 d5Var, com.tencent.mm.plugin.finder.live.viewmodel.c6 c6Var) {
        this.f117527d = c5Var;
        this.f117528e = d5Var;
        this.f117529f = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.viewmodel.d5 d5Var = this.f117528e;
        android.widget.RelativeLayout relativeLayout = d5Var.f117027d;
        kotlin.jvm.internal.o.f(relativeLayout, "<get-contentParent>(...)");
        com.tencent.mm.plugin.finder.live.viewmodel.c6 c6Var = this.f117529f;
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f117527d.f116972d;
        com.tencent.mm.plugin.finder.live.util.y.o(r5Var, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.b5(r5Var, d5Var, relativeLayout, c6Var, null), 3, null);
    }
}
