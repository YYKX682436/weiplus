package os2;

/* loaded from: classes2.dex */
public final class c implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.view.FinderFollowMoreView f348023d;

    public c(com.tencent.mm.plugin.finder.profile.view.FinderFollowMoreView finderFollowMoreView) {
        this.f348023d = finderFollowMoreView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_entrance_type", 26);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        android.content.Context context = this.f348023d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        iyVar.c(context, intent);
        java.lang.Object obj = holder.f293125i;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListItem");
        intent.putExtra("finder_username", ((com.tencent.mm.plugin.finder.viewmodel.component.t) obj).f135948d.getUsername());
        intent.putExtra("KEY_FROM_TIMELINE", false);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context2 = holder.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        i0Var.mk(context2, intent);
    }
}
