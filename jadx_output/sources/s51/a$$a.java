package s51;

/* loaded from: classes15.dex */
public final /* synthetic */ class a$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.picker.base.view.WheelView f403151d;

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.picker.base.view.WheelView wheelView = this.f403151d;
        q51.b bVar = wheelView.f72384i;
        if (bVar != null) {
            bVar.onItemSelected(wheelView.getCurrentItem());
        }
    }
}
