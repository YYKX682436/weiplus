package r23;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r23.m f368839d;

    public l(r23.m mVar) {
        this.f368839d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/mjtemplate/MaasAlbumTipPopup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r23.m mVar = this.f368839d;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "onNegativeClick: ");
        yz5.a aVar = mVar.f368843n;
        if (aVar != null) {
            aVar.invoke();
        }
        mVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/MaasAlbumTipPopup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
