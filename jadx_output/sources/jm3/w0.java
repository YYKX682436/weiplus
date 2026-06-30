package jm3;

/* loaded from: classes10.dex */
public final class w0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvPostUI f300361d;

    public w0(com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI) {
        this.f300361d = musicMvPostUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI = this.f300361d;
        androidx.appcompat.app.AppCompatActivity context = musicMvPostUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        musicMvPostUI.f150888m = e17 == null || e17.length() == 0;
        com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = fm3.g0.f264070a.c();
        c17.f59482k = 14L;
        c17.k();
        c17.o();
        musicMvPostUI.V6(true);
        return true;
    }
}
