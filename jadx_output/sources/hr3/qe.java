package hr3;

/* loaded from: classes5.dex */
public final class qe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283924d;

    public qe(hr3.pf pfVar) {
        this.f283924d = pfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initForSayHiPictureUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.pf pfVar = this.f283924d;
        pfVar.X6(pfVar.S6().getText().toString());
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initForSayHiPictureUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
