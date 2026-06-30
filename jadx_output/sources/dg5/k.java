package dg5;

/* loaded from: classes11.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f232375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dg5.n f232377f;

    public k(dg5.n nVar, boolean z17, java.lang.String str) {
        this.f232377f = nVar;
        this.f232375d = z17;
        this.f232376e = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        s01.a0 a0Var;
        int itemId = menuItem.getItemId();
        dg5.n nVar = this.f232377f;
        if (itemId == 1) {
            boolean a17 = nVar.a();
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = nVar.f232380d;
            if (a17) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", nVar.f232386m.field_addMemberUrl);
                com.tencent.mars.xlog.Log.i("EnterpriseConversationDropMenuPresenter", "KRawUrl :%s", nVar.f232386m.field_addMemberUrl);
                intent.putExtra("useJs", true);
                intent.addFlags(67108864);
                if (mMFragmentActivity instanceof com.tencent.mm.ui.MMActivity) {
                    ((com.tencent.mm.ui.MMActivity) mMFragmentActivity).mmSetOnActivityResultCallback(nVar);
                } else if (mMFragmentActivity instanceof com.tencent.mm.ui.conversation.presenter.BaseBizConversationUI) {
                    ((com.tencent.mm.ui.conversation.presenter.BaseBizConversationUI) mMFragmentActivity).f207976e = nVar;
                }
                j45.l.n(mMFragmentActivity, "webview", ".ui.tools.WebViewUI", intent, 1);
                return;
            }
            dp.a.makeText(mMFragmentActivity, nVar.b(com.tencent.mm.R.string.f490757ao1), 0).show();
            s01.d0 Vi = r01.q3.Vi();
            java.lang.String str = nVar.f232385i;
            java.lang.String z07 = Vi.z0(str);
            s01.a0 y07 = r01.q3.Vi().y0(z07);
            nVar.f232386m = y07;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            objArr[1] = z07;
            objArr[2] = java.lang.Boolean.valueOf(y07 == null);
            com.tencent.mars.xlog.Log.i("EnterpriseConversationDropMenuPresenter", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
            if (com.tencent.mm.sdk.platformtools.t8.K0(z07) || (a0Var = nVar.f232386m) == null || a0Var.u0() || com.tencent.mm.sdk.platformtools.t8.K0(nVar.f232386m.field_addMemberUrl)) {
                r01.q3.Ni().h(str, nVar);
                nVar.f232382f = db5.e1.Q(nVar.f232380d, nVar.b(com.tencent.mm.R.string.f490573yv), nVar.b(com.tencent.mm.R.string.f490604zq), true, true, new dg5.l(nVar));
                return;
            }
            return;
        }
        if (itemId == 2) {
            if (!this.f232375d) {
                nVar.f232387n.a(nVar.f232383g);
                nVar.f232387n.b(nVar.f232380d);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            java.lang.String str2 = this.f232376e;
            intent2.putExtra("rawUrl", str2);
            com.tencent.mars.xlog.Log.i("EnterpriseConversationDropMenuPresenter", "KRawUrl :%s", str2);
            intent2.putExtra("useJs", true);
            intent2.addFlags(67108864);
            j45.l.n(nVar.f232380d, "webview", ".ui.tools.WebViewUI", intent2, 0);
            return;
        }
        if (itemId == 3) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Contact_User", nVar.f232383g);
            j45.l.j(nVar.f232380d, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent3, null);
            return;
        }
        if (itemId != 4) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(nVar.f232385i)) {
            com.tencent.mars.xlog.Log.e("EnterpriseConversationDropMenuPresenter", "brandUserName null");
            return;
        }
        android.content.Intent intent4 = new android.content.Intent(nVar.f232380d, (java.lang.Class<?>) com.tencent.mm.ui.bizchat.BizChatFavUI.class);
        intent4.putExtra("Contact_User", nVar.f232385i);
        intent4.addFlags(67108864);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity2 = nVar.f232380d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMFragmentActivity2, arrayList.toArray(), "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationDropMenuPresenter$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMFragmentActivity2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMFragmentActivity2, "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationDropMenuPresenter$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
