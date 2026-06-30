package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class gk implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ik f204048d;

    public gk(com.tencent.mm.ui.chatting.viewitems.ik ikVar) {
        this.f204048d = ikVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.viewitems.ik ikVar = this.f204048d;
        java.lang.String format = ikVar.f204194g ? ikVar.f204197m : java.lang.String.format("%s:%s", ikVar.f204195h, ikVar.f204196i);
        com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, format, format, null);
        dp.a.makeText(ikVar.f204191d.g(), com.tencent.mm.R.string.f490361st, 0).show();
    }
}
