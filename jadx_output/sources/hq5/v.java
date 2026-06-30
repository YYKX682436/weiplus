package hq5;

/* loaded from: classes5.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.w f283280d;

    public v(hq5.w wVar) {
        this.f283280d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewHintUIC$onStateChange$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jq5.o.f301283a.c(this.f283280d.getContext());
        cq5.i.f221543a.d(cq5.a.f221498p);
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewHintUIC$onStateChange$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
