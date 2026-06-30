package df2;

/* loaded from: classes3.dex */
public final class g extends df2.de implements df2.l9 {

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f230180p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f230181q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230180p = new androidx.lifecycle.j0();
        this.f230181q = new java.util.HashSet();
    }

    @Override // df2.l9
    public void b5() {
        m7("autoDismiss", false);
    }

    @Override // df2.l9
    public java.lang.String getTag() {
        return "CreateNextNoticeGuide";
    }

    public final void m7(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("CreateNextNoticeGuide", "dismissBubble: source=" + str + ", onViewUnMount=" + z17);
        androidx.lifecycle.j0 j0Var = this.f230180p;
        if (z17) {
            android.view.View f76 = f7(this);
            boolean z18 = false;
            if (f76 != null && f76.getVisibility() == 0) {
                z18 = true;
            }
            if (z18) {
                j0Var.setValue(j0Var.getValue());
                a7(str, this);
            }
        }
        j0Var.setValue(null);
        a7(str, this);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        this.f230180p.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.a(this));
    }

    @Override // df2.de, if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        m7("onViewUnmount", true);
        super.onViewUnmount(pluginLayout);
    }
}
