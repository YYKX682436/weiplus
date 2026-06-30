package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k0 f121751d = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k0();

    public k0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        android.content.Context context = view.getContext();
        if (!(context instanceof com.tencent.mm.ui.MMActivity) || ((com.tencent.mm.ui.MMActivity) context).isPaused()) {
            return java.lang.Boolean.FALSE;
        }
        dp2.a aVar = dp2.a.f242183a;
        boolean z17 = false;
        boolean z18 = !aVar.b(0, view, 0.5f);
        boolean z19 = !aVar.b(1, view, 0.5f);
        if (z18 && z19) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
