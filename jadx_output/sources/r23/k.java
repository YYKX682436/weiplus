package r23;

/* loaded from: classes4.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r23.m f368838d;

    public k(r23.m mVar) {
        this.f368838d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/mjtemplate/MaasAlbumTipPopup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r23.m mVar = this.f368838d;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "onPositiveClick: ");
        yz5.l lVar = mVar.f368842m;
        if (lVar != null) {
            lVar.invoke(mVar.f368840k);
        }
        mVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/MaasAlbumTipPopup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
