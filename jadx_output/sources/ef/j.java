package ef;

/* loaded from: classes7.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef.m f252120d;

    public j(ef.m mVar) {
        this.f252120d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ef.m mVar = this.f252120d;
        mVar.getClass();
        ef.e eVar = mVar.f252126c;
        if (eVar == null) {
            return;
        }
        if (eVar.q()) {
            mVar.f252131h = 0;
            android.view.View view = eVar.getView();
            mVar.e(java.lang.Integer.valueOf(view != null ? view.getMeasuredHeight() : 0));
            return;
        }
        android.view.View view2 = eVar.getView();
        if (view2 != null) {
            view2.getMeasuredHeight();
        }
        int i17 = mVar.f252131h + 1;
        mVar.f252131h = i17;
        if (i17 < 5) {
            mVar.d();
        }
    }
}
