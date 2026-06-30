package hr3;

/* loaded from: classes.dex */
public final class oe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283864d;

    public oe(hr3.pf pfVar) {
        this.f283864d = pfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initForSayHiPictureUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "addPhotoLayout onClick called");
        hr3.pf pfVar = this.f283864d;
        pfVar.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) pfVar.getActivity(), 1, true);
        k0Var.f211872n = new hr3.jf(pfVar);
        k0Var.f211881s = new hr3.kf(pfVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initForSayHiPictureUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
