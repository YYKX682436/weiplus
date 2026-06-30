package df2;

/* loaded from: classes3.dex */
public final class ph extends if2.b implements if2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6() {
        java.lang.String str;
        java.lang.Object obj = this.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        java.lang.Object context = view != null ? view.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
            int hashCode = hashCode();
            java.lang.String b76 = b7();
            r45.v74 v74Var = ((mm2.e1) business(mm2.e1.class)).f328980g;
            if (v74Var == null || (str = v74Var.getString(3)) == null) {
                str = "";
            }
            android.view.Window window = activity.getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            ((b92.d2) d8Var).wi(hashCode, b76, str, activity, window, ((mm2.e1) business(mm2.e1.class)).f328983m, ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0));
        }
    }

    public final void a7() {
        java.lang.String str;
        zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
        int hashCode = hashCode();
        java.lang.String b76 = b7();
        r45.v74 v74Var = ((mm2.e1) business(mm2.e1.class)).f328980g;
        if (v74Var == null || (str = v74Var.getString(3)) == null) {
            str = "";
        }
        ((b92.d2) d8Var).Ai(hashCode, b76, str);
    }

    public final java.lang.String b7() {
        if2.z zVar = if2.z.f291153a;
        java.lang.Object obj = this.f291099e;
        int ordinal = zVar.c(obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null).ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "UnknownLive" : "Visitor" : "Secondary" : "Anchor";
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        Z6();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        a7();
    }

    @Override // if2.e
    public void pause() {
        a7();
    }

    @Override // if2.e
    public void resume() {
        Z6();
    }
}
