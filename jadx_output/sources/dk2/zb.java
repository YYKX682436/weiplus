package dk2;

/* loaded from: classes3.dex */
public final class zb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.ac f234434d;

    public zb(dk2.ac acVar) {
        this.f234434d = acVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        dk2.ac acVar = this.f234434d;
        com.tencent.mars.xlog.Log.i(acVar.f233203g, "productID " + acVar.f233198b + " do not remind clicked");
        acVar.a();
    }
}
