package ou1;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ou1.a f348915d = new ou1.a();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/cast/banner/ScreenCastBanner$onInitializeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "cast", ".ui.ScreenCastActivity", new android.content.Intent(), null);
        yj0.a.h(this, "com/tencent/mm/plugin/cast/banner/ScreenCastBanner$onInitializeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
