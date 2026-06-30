package hw2;

/* loaded from: classes5.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.g0 f285528d;

    public f0(hw2.g0 g0Var) {
        this.f285528d = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hw2.g0 g0Var = this.f285528d;
        if (g0Var.f285537n) {
            ju3.d0.k(g0Var.f285531e, ju3.c0.K2, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
