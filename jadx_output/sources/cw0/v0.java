package cw0;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f222689d;

    public v0(cw0.w0 w0Var) {
        this.f222689d = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationVolumePanel$initListener$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw0.w0 w0Var = this.f222689d;
        yz5.l onAutoAdjustStateChange = w0Var.getOnAutoAdjustStateChange();
        boolean z17 = false;
        if (onAutoAdjustStateChange != null && ((java.lang.Boolean) onAutoAdjustStateChange.invoke(null)).booleanValue()) {
            z17 = true;
        }
        w0Var.M(z17);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationVolumePanel$initListener$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
