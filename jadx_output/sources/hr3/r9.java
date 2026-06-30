package hr3;

/* loaded from: classes5.dex */
public class r9 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference f283946d;

    public r9(com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference) {
        this.f283946d = normalProfileHeaderPreference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f283946d.R.getString(com.tencent.mm.R.string.f490359sr));
    }
}
