package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class s5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 f121938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var) {
        super(1);
        this.f121938d = t5Var;
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
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var = this.f121938d;
        boolean z17 = false;
        boolean z18 = !aVar.b(0, view, t5Var.f121963s);
        boolean z19 = !aVar.b(1, view, t5Var.f121963s);
        if (z18 && z19) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
