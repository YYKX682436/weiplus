package hb5;

/* loaded from: classes11.dex */
public class x0 implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatroomInfoUI f280266a;

    public x0(com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI) {
        this.f280266a = bizChatroomInfoUI;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        s01.a0 a0Var;
        int i18 = com.tencent.mm.ui.bizchat.BizChatroomInfoUI.H;
        com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI = this.f280266a;
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = bizChatroomInfoUI.f197939g;
        lz.f fVar = contactListExpandPreference.M;
        if (((fVar == null || !((r35.u1) fVar).f369274f.g(i17)) ? null : ((r35.u1) contactListExpandPreference.M).f369274f.getItem(i17)) instanceof s01.a0) {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = bizChatroomInfoUI.f197939g;
            lz.f fVar2 = contactListExpandPreference2.M;
            a0Var = (s01.a0) ((fVar2 == null || !((r35.u1) fVar2).f369274f.g(i17)) ? null : ((r35.u1) contactListExpandPreference2.M).f369274f.getItem(i17));
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(a0Var == null);
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatroomInfoUI", "onItemNormalClick userInfo == null:%s", objArr);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "onItemNormalClick field_userId:%s", a0Var.field_userId);
        java.lang.String str = a0Var.field_userId;
        r45.tj tjVar = new r45.tj();
        r45.sj sjVar = new r45.sj();
        sjVar.f385768d = str;
        tjVar.f386494d.add(sjVar);
        bizChatroomInfoUI.X6(null, tjVar);
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        int i18 = com.tencent.mm.ui.bizchat.BizChatroomInfoUI.H;
        com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI = this.f280266a;
        bizChatroomInfoUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (!bizChatroomInfoUI.f197949t) {
            s01.a0 a0Var = bizChatroomInfoUI.f197955z;
            if (a0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(a0Var.field_addMemberUrl)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BizChatroomInfoUI", "dealAddMemberBtn: addMemberUrl is null");
                dp.a.makeText(bizChatroomInfoUI, bizChatroomInfoUI.getString(com.tencent.mm.R.string.f490757ao1), 0).show();
                return;
            }
            intent.putExtra("rawUrl", bizChatroomInfoUI.f197955z.field_addMemberUrl);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(bizChatroomInfoUI.f197954y.field_addMemberUrl)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BizChatroomInfoUI", "dealAddMemberBtn: addMemberUrl is null");
                dp.a.makeText(bizChatroomInfoUI, bizChatroomInfoUI.getString(com.tencent.mm.R.string.f490757ao1), 0).show();
                return;
            }
            intent.putExtra("rawUrl", bizChatroomInfoUI.f197954y.field_addMemberUrl);
        }
        intent.putExtra("useJs", true);
        j45.l.n(bizChatroomInfoUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f280266a.f197939g;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        s01.a0 a0Var;
        com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI = this.f280266a;
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = bizChatroomInfoUI.f197939g;
        lz.f fVar = contactListExpandPreference.M;
        if (((fVar == null || !((r35.u1) fVar).f369274f.g(i17)) ? null : ((r35.u1) contactListExpandPreference.M).f369274f.getItem(i17)) instanceof s01.a0) {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = bizChatroomInfoUI.f197939g;
            lz.f fVar2 = contactListExpandPreference2.M;
            a0Var = (s01.a0) ((fVar2 == null || !((r35.u1) fVar2).f369274f.g(i17)) ? null : ((r35.u1) contactListExpandPreference2.M).f369274f.getItem(i17));
        } else {
            a0Var = null;
        }
        if (a0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(a0Var.field_profileUrl)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(a0Var == null);
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatroomInfoUI", "onItemNormalClick userInfo == null:%s", objArr);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "onItemNormalClick Url:%s", a0Var.field_profileUrl);
            r01.q3.Ni().i(a0Var.field_userId, a0Var.field_brandUserName, bizChatroomInfoUI);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", a0Var.field_profileUrl);
            intent.putExtra("useJs", true);
            j45.l.j(bizChatroomInfoUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
