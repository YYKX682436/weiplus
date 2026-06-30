package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f114866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c4 f114867f;

    public w3(android.view.ViewGroup viewGroup, int i17, com.tencent.mm.plugin.finder.live.plugin.c4 c4Var) {
        this.f114865d = viewGroup;
        this.f114866e = i17;
        this.f114867f = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f114865d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f114866e + com.tencent.mm.ui.bl.c(viewGroup.getContext());
        qo0.c cVar = this.f114867f.f112102v;
        if (cVar != null) {
            qo0.c.a(cVar, qo0.b.V2, null, 2, null);
        }
    }
}
