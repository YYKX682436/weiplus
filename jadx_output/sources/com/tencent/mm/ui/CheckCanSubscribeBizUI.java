package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class CheckCanSubscribeBizUI extends com.tencent.mm.ui.MMActivity implements l75.z0, com.tencent.mm.modelbase.u0, l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f196612d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f196613e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f196614f;

    /* renamed from: g, reason: collision with root package name */
    public int f196615g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f196616h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f196617i;

    /* renamed from: m, reason: collision with root package name */
    public int f196618m;

    /* renamed from: n, reason: collision with root package name */
    public int f196619n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f196622q;

    /* renamed from: u, reason: collision with root package name */
    public int f196626u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f196627v;

    /* renamed from: o, reason: collision with root package name */
    public boolean f196620o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f196621p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f196623r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f196624s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f196625t = false;

    /* renamed from: w, reason: collision with root package name */
    public int f196628w = 0;

    public static void T6(com.tencent.mm.ui.CheckCanSubscribeBizUI checkCanSubscribeBizUI) {
        synchronized (checkCanSubscribeBizUI) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess..,canJump = " + checkCanSubscribeBizUI.f196620o);
            int i17 = checkCanSubscribeBizUI.f196626u;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  MM_CHECK_CAN_SUBSCRIBE_BIZ_SCENE_WEBVIEW");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", checkCanSubscribeBizUI.f196627v);
                j45.l.j(checkCanSubscribeBizUI, "webview", ".ui.tools.WebViewUI", intent, null);
                checkCanSubscribeBizUI.finish();
                return;
            }
            if (i17 != 0 || checkCanSubscribeBizUI.f196628w != 1) {
                if (checkCanSubscribeBizUI.V6() && checkCanSubscribeBizUI.f196620o) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  jumpToChattingUI");
                    checkCanSubscribeBizUI.W6();
                } else if (checkCanSubscribeBizUI.f196620o) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  jumpToContactInfoUI");
                    checkCanSubscribeBizUI.X6();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  not canJump");
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  MM_CHECK_CAN_SUBSCRIBE_BIZ_SCENE_PROFILE  extInfo:" + checkCanSubscribeBizUI.f196614f);
            if (checkCanSubscribeBizUI.f196624s) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "has jump ignore this scene");
                return;
            }
            checkCanSubscribeBizUI.f196624s = true;
            c01.d9.e().a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, checkCanSubscribeBizUI);
            c01.d9.e().g(new com.tencent.mm.modelsimple.k0(checkCanSubscribeBizUI.f196614f, null, 4, 0, o45.cg.a(), new byte[0]));
        }
    }

    public final void U6(int i17, int i18, java.lang.String str) {
        dp.a.makeText(this, getString(com.tencent.mm.R.string.f493436k62), 1).show();
        if (this.f196618m == 1) {
            com.tencent.mm.ui.LauncherUI.n7(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean V6() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.CheckCanSubscribeBizUI.V6():boolean");
    }

    public final void W6() {
        if (this.f196624s) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ChattingUI");
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", this.f196613e);
        putExtra.putExtra("finish_direct", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f196613e)) {
            com.tencent.mm.ui.contact.g1.c(putExtra, this.f196613e);
        }
        putExtra.setClass(this, com.tencent.mm.ui.chatting.ChattingUI.class);
        if (this.f196623r) {
            return;
        }
        setResult(-1);
        this.f196624s = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/CheckCanSubscribeBizUI", "jumpToChattingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/CheckCanSubscribeBizUI", "jumpToChattingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final void X6() {
        if (this.f196624s) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ContactInfoUI");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f196613e, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_Scene", this.f196619n);
        intent.putExtra("Verify_ticket", this.f196622q);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        if (n17 != null) {
            intent.putExtra("Contact_Alias", n17.t0());
            intent.putExtra("Contact_Nick", n17.P0());
            intent.putExtra("Contact_Signature", n17.V);
            intent.putExtra("Contact_RegionCode", n17.f236570l1);
            intent.putExtra("Contact_Sex", n17.I);
            intent.putExtra("Contact_VUser_Info", n17.f236588y0);
            intent.putExtra("Contact_VUser_Info_Flag", n17.f1());
            intent.putExtra("Contact_KWeibo_flag", n17.i1());
            intent.putExtra("Contact_KWeibo", n17.f236585x0);
            intent.putExtra("Contact_KWeiboNick", n17.j1());
        }
        intent.putExtra("Contact_User", this.f196613e);
        if (this.f196623r) {
            return;
        }
        setResult(-1);
        this.f196624s = true;
        j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        finish();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        onNotifyChange((java.lang.String) obj, null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bmq;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0185  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.CheckCanSubscribeBizUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.util.LinkedList linkedList = this.f196616h;
        if (linkedList != null) {
            linkedList.clear();
        }
        if (gm0.j1.a()) {
            c01.d9.e().q(605, this);
            r01.q3.cj().remove(this);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && keyEvent.getRepeatCount() == 0) {
            this.f196623r = true;
            if (this.f196624s) {
                return true;
            }
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.ui.y1(this, str));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 605) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, MMFunc_CheckCanSubscribeBiz  do nothing");
            return;
        }
        if (m1Var.getType() != 233) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CheckCanSubscribeBizUI", "un support scene type : %d", java.lang.Integer.valueOf(m1Var.getType()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, MMFunc_GetA8Key");
        c01.d9.e().q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, geta8key  errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            U6(i17, i18, str);
            return;
        }
        com.tencent.mm.modelsimple.k0 k0Var = (com.tencent.mm.modelsimple.k0) m1Var;
        int K = k0Var.K();
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "geta8key, action code = %d", java.lang.Integer.valueOf(K));
        if (K != 15) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, geta8key  actionCode = " + K);
            U6(i17, i18, str);
            return;
        }
        java.lang.String Q = k0Var.Q();
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = new com.tencent.mm.autogen.events.GetA8KeyRedirectEvent();
        am.df dfVar = getA8KeyRedirectEvent.f54376g;
        dfVar.f6446a = K;
        dfVar.f6447b = Q;
        dfVar.f6448c = new java.lang.ref.WeakReference(this);
        getA8KeyRedirectEvent.b(android.os.Looper.myLooper());
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
