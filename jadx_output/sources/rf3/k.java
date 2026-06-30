package rf3;

/* loaded from: classes12.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf3.p f394993d;

    public k(rf3.p pVar) {
        this.f394993d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/media/image/ImageBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf3.p.g0(this.f394993d, dg3.q.f232342f);
        yj0.a.h(this, "com/tencent/mm/plugin/media/image/ImageBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
