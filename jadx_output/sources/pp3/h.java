package pp3;

/* loaded from: classes5.dex */
public class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f357475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp3.j f357477f;

    public h(pp3.j jVar, android.util.Pair pair, java.lang.String str) {
        this.f357477f = jVar;
        this.f357475d = pair;
        this.f357476e = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 547) {
            ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Di(this.f357475d, 2, this.f357476e);
            pp3.j jVar = this.f357477f;
            android.content.Context context = ((android.view.View) jVar.f357482a).getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bre);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
            mp3.m mVar = jVar.f357483b;
            if (mVar != null) {
                ((com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView) mVar).f152895i.dismiss();
            }
            jVar.a();
            jVar.b();
        }
    }
}
