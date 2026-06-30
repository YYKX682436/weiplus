package ts3;

/* loaded from: classes9.dex */
public class p implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f421694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421695b;

    public p(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI, boolean z17) {
        this.f421695b = readerAppUI;
        this.f421694a = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        g4Var.clear();
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.f421695b;
        if (20 == readerAppUI.f155060h) {
            if (this.f421694a) {
                g4Var.c(intValue, 0, 1, readerAppUI.getResources().getString(com.tencent.mm.R.string.hrg), com.tencent.mm.R.raw.icons_filled_share);
            }
            j45.l.g("favorite");
            g4Var.c(intValue, 1, 2, readerAppUI.getResources().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            readerAppUI.f155065p = ((java.lang.Integer) view.getTag(com.tencent.mm.R.id.ljk)).intValue();
        }
        g4Var.c(intValue, 2, 3, readerAppUI.getResources().getString(com.tencent.mm.R.string.hrf), com.tencent.mm.R.raw.icons_filled_delete);
    }
}
