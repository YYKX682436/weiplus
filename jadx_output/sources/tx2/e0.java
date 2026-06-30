package tx2;

/* loaded from: classes.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422548e;

    public e0(java.lang.String str, tx2.i0 i0Var) {
        this.f422547d = str;
        this.f422548e = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", this.f422547d);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(this.f422548e.f118381d, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
