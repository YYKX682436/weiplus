package zo1;

/* loaded from: classes5.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        super(1);
        this.f474692d = selectContactUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "On expansion changed, isExpand=" + booleanValue);
        android.transition.AutoTransition autoTransition = new android.transition.AutoTransition();
        autoTransition.setDuration(200L);
        autoTransition.setInterpolator((android.animation.TimeInterpolator) new android.view.animation.LinearInterpolator());
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI = this.f474692d;
        androidx.recyclerview.widget.RecyclerView recyclerView = selectContactUI.f92852i;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("avatarRv");
            throw null;
        }
        android.view.ViewParent parent = recyclerView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.transition.TransitionManager.beginDelayedTransition((android.view.ViewGroup) parent, autoTransition);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = selectContactUI.f92852i;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("avatarRv");
            throw null;
        }
        if (booleanValue) {
            layoutManager = selectContactUI.f92858r;
            if (layoutManager == null) {
                kotlin.jvm.internal.o.o("avatarLayoutManagerGrid");
                throw null;
            }
        } else {
            layoutManager = selectContactUI.f92857q;
            if (layoutManager == null) {
                kotlin.jvm.internal.o.o("avatarLayoutManagerLinear");
                throw null;
            }
        }
        recyclerView2.setLayoutManager(layoutManager);
        return jz5.f0.f302826a;
    }
}
