package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes4.dex */
public class tc extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(com.tencent.mm.ui.chatting.viewitems.nc ncVar, int i17, r35.m3 m3Var, yb5.d dVar) {
        super(i17, m3Var);
        this.f205574e = dVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        if (getTag() == null || !(getTag() instanceof java.lang.String)) {
            return;
        }
        java.lang.String str = (java.lang.String) getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgPat", "click %s", str);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Contact_User", str);
        yb5.d dVar = this.f205574e;
        putExtra.putExtra("Contact_ChatRoomId", dVar.x());
        putExtra.putExtra("CONTACT_INFO_UI_SOURCE", 21);
        putExtra.putExtra("Contact_Scene", 14);
        j45.l.j(dVar.g(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", putExtra, null);
    }
}
