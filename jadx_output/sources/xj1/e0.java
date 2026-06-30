package xj1;

/* loaded from: classes4.dex */
public final class e0 implements android.view.View.OnCreateContextMenuListener {
    public e0(java.lang.String str) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, "打开小程序且path=?wechat_appbrand_test=1");
        contextMenu.add(0, 1, 0, com.tencent.mm.R.string.f490334s3);
    }
}
