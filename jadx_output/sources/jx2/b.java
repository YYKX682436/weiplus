package jx2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.k f302401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jx2.h f302402e;

    public b(jx2.k kVar, jx2.h hVar) {
        this.f302401d = kVar;
        this.f302402e = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jx2.l lVar = (jx2.l) this.f302401d;
        lVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String string = lVar.f302437b.getString(7);
        if (string == null) {
            string = "";
        }
        intent.putExtra("rawUrl", string);
        j45.l.j(lVar.f302436a, "webview", ".ui.tools.WebViewUI", intent, null);
        yz5.a aVar = this.f302402e.f302430k;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
