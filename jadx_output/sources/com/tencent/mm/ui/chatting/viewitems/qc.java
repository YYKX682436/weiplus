package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class qc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f205345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205347f;

    public qc(com.tencent.mm.ui.chatting.viewitems.nc ncVar, android.util.Pair pair, java.lang.String str, yb5.d dVar) {
        this.f205345d = pair;
        this.f205346e = str;
        this.f205347f = dVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 291) {
            mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
            ((lp3.l) jVar).Di(this.f205345d, 1, this.f205346e);
            android.app.Activity g17 = this.f205347f.g();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(g17);
            e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bre);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
        }
    }
}
