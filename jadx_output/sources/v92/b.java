package v92;

/* loaded from: classes15.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v92.g f434153d;

    public b(v92.g gVar) {
        this.f434153d = gVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        v92.g gVar = this.f434153d;
        if (itemId == 20002) {
            if (gVar.p()) {
                db5.t7.makeText(gVar.f434158a, com.tencent.mm.R.string.f3u, 0).show();
                return;
            } else {
                gVar.r();
                return;
            }
        }
        if (itemId == 20003) {
            if (gVar.p()) {
                db5.t7.makeText(gVar.f434158a, com.tencent.mm.R.string.f3v, 0).show();
                return;
            } else {
                gVar.t();
                return;
            }
        }
        if (itemId != 20010) {
            return;
        }
        if (gVar.p()) {
            db5.t7.makeText(gVar.f434158a, com.tencent.mm.R.string.o1g, 0).show();
        } else {
            gVar.s();
        }
    }
}
