package eg3;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg3.g f252655d;

    public c(eg3.g gVar) {
        this.f252655d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f252655d.getClass();
        yj0.a.h(this, "com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
