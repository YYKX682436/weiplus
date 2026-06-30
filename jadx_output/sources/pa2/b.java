package pa2;

/* loaded from: classes2.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa2.g f352969d;

    public b(pa2.g gVar) {
        this.f352969d = gVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null && menuItem.getItemId() == 10001) {
            pa2.g gVar = this.f352969d;
            java.lang.String B = gVar.B();
            if (B.length() == 0) {
                com.tencent.mars.xlog.Log.e("FinderTemplateShareHandler", "doUnpublish: templateId is empty");
                return;
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = gVar.f434158a;
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(appCompatActivity, appCompatActivity.getResources().getString(com.tencent.mm.R.string.ggc), false, 0, null);
            java.lang.String stringExtra = appCompatActivity.getIntent().getStringExtra("key_finder_user_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            new cq.k();
            pm0.v.T(new bq.x1(stringExtra, B).l(), new cq.r0(new pa2.d(f17, gVar), new pa2.e(f17, gVar)));
        }
    }
}
