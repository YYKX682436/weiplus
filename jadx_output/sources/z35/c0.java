package z35;

/* loaded from: classes4.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView f470006d;

    public c0(com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView) {
        this.f470006d = heroSeekBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f470006d.d();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
