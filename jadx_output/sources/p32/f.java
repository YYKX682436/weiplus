package p32;

/* loaded from: classes.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f351465d;

    public f(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f351465d = mMActivity;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("query_source_type", 9);
            intent.putExtra("query_media_type", 1);
            intent.putExtra("max_select_count", 1);
            j45.l.n(this.f351465d, "gallery", ".ui.AlbumPreviewUI", intent, 1001);
        }
    }
}
