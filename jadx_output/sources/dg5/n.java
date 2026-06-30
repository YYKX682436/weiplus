package dg5;

/* loaded from: classes11.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener, com.tencent.mm.ui.da, r01.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMFragmentActivity f232380d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.w6 f232381e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f232382f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f232383g;

    /* renamed from: h, reason: collision with root package name */
    public final r01.m f232384h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f232385i;

    /* renamed from: m, reason: collision with root package name */
    public s01.a0 f232386m;

    /* renamed from: n, reason: collision with root package name */
    public final w01.c f232387n = new w01.c();

    public n(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, java.lang.String str) {
        this.f232380d = mMFragmentActivity;
        this.f232383g = str;
        r01.m y07 = r01.q3.bj().y0(str);
        this.f232384h = y07;
        if (y07 == null) {
            com.tencent.mars.xlog.Log.w("EnterpriseConversationDropMenuPresenter", "init fatherAttr is null, username=%s", str);
        }
        this.f232385i = r01.q3.cj().d1(str);
    }

    @Override // r01.w2
    public void K1(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f232382f;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f232382f = null;
        }
        if (m1Var.getType() == 1355) {
            r45.v90 H = ((s01.g0) m1Var).H();
            if (H.f388000e == null) {
                com.tencent.mars.xlog.Log.i("EnterpriseConversationDropMenuPresenter", "onBizChatSceneEnd full_chat is null");
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, b(com.tencent.mm.R.string.i48), 0).show();
                return;
            }
            s01.h D0 = r01.q3.Ui().D0(H.f388000e.f377592d.f383085d);
            if (D0 == null) {
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, b(com.tencent.mm.R.string.i48), 0).show();
            } else {
                c(D0.field_bizChatLocalId);
            }
        }
    }

    public final boolean a() {
        s01.a0 y07 = r01.q3.Vi().y0(r01.q3.Vi().z0(this.f232385i));
        this.f232386m = y07;
        return (y07 == null || com.tencent.mm.sdk.platformtools.t8.K0(y07.field_addMemberUrl)) ? false : true;
    }

    public final java.lang.String b(int i17) {
        return this.f232380d.getString(i17);
    }

    public final void c(long j17) {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f232380d;
        if (mMFragmentActivity instanceof com.tencent.mm.ui.conversation.presenter.BaseBizConversationUI) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("key_biz_chat_id", j17);
            bundle.putBoolean("finish_direct", false);
            bundle.putBoolean("key_need_send_video", false);
            bundle.putBoolean("key_is_biz_chat", true);
            ((com.tencent.mm.ui.conversation.presenter.BaseBizConversationUI) mMFragmentActivity).startChatting(this.f232385i, bundle, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.xc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mmOnActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            r0 = -1
            if (r9 != r0) goto L85
            if (r10 != 0) goto L7
            goto L85
        L7:
            r9 = 1
            if (r8 == r9) goto Lb
            return
        Lb:
            java.lang.String r8 = "result_data"
            android.os.Bundle r8 = r10.getBundleExtra(r8)
            r10 = 0
            if (r8 == 0) goto L72
            java.lang.String r0 = "EnterpriseConversationDropMenuPresenter"
            java.lang.String r1 = "bundle != null"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.String r0 = "enterprise_members"
            java.lang.String r8 = r8.getString(r0)
            r45.j53 r0 = new r45.j53
            r0.<init>()
            s01.h r1 = new s01.h
            r1.<init>()
            s01.a0 r2 = r7.f232386m
            r3 = 0
            if (r2 == 0) goto L33
            java.lang.String r2 = r2.field_addMemberUrl
            goto L34
        L33:
            r2 = r3
        L34:
            r1.field_addMemberUrl = r2
            java.lang.String r2 = r7.f232385i
            r1.field_brandUserName = r2
            boolean r8 = s01.r.a(r1, r8, r3, r0)
            if (r8 == 0) goto L72
            long r3 = r1.field_bizChatLocalId
            r5 = -1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L4c
            r7.c(r3)
            goto L73
        L4c:
            s01.y r8 = r01.q3.Ni()
            s01.g0 r8 = r8.e(r2, r0, r7)
            com.tencent.mm.ui.MMFragmentActivity r0 = r7.f232380d
            r1 = 2131756315(0x7f10051b, float:1.9143534E38)
            java.lang.String r1 = r7.b(r1)
            r2 = 2131756354(0x7f100542, float:1.9143613E38)
            java.lang.String r2 = r7.b(r2)
            r3 = 1
            r4 = 1
            dg5.m r5 = new dg5.m
            r5.<init>(r7, r8)
            com.tencent.mm.ui.widget.dialog.u3 r8 = db5.e1.Q(r0, r1, r2, r3, r4, r5)
            r7.f232382f = r8
            goto L73
        L72:
            r9 = r10
        L73:
            if (r9 != 0) goto L85
            r8 = 2131774428(0x7f104bdc, float:1.9180272E38)
            java.lang.String r8 = r7.b(r8)
            com.tencent.mm.ui.MMFragmentActivity r9 = r7.f232380d
            android.widget.Toast r8 = dp.a.makeText(r9, r8, r10)
            r8.show()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dg5.n.mmOnActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        java.lang.String str2 = this.f232383g;
        try {
            r01.m y07 = r01.q3.bj().y0(str2);
            r45.ik ikVar = new r45.ik();
            ikVar.parseFrom(y07.field_raw_attrs);
            str = ikVar.f377105g;
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
        if (!z17) {
            this.f232387n.a(str2);
        }
        com.tencent.mm.ui.tools.w6 w6Var = this.f232381e;
        if (w6Var != null) {
            w6Var.a();
            this.f232381e = null;
        }
        com.tencent.mm.ui.tools.w6 w6Var2 = new com.tencent.mm.ui.tools.w6(this.f232380d);
        this.f232381e = w6Var2;
        w6Var2.f210880u = new dg5.j(this);
        w6Var2.f210881v = new dg5.k(this, z17, str);
        w6Var2.e();
        return false;
    }
}
