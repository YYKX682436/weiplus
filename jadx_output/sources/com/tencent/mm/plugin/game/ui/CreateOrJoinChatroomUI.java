package com.tencent.mm.plugin.game.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class CreateOrJoinChatroomUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f140645q = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140646e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140647f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140648g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140649h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140650i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f140651m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f140652n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f140653o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f140654p = null;

    public static void O6(com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI createOrJoinChatroomUI, java.lang.String str) {
        createOrJoinChatroomUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(createOrJoinChatroomUI, createOrJoinChatroomUI.f140648g);
        intent.putExtra("action", createOrJoinChatroomUI.f140646e);
        intent.putExtra("app_name", Zi);
        intent.putExtra("rawUrl", str);
        j45.l.n(createOrJoinChatroomUI, "webview", ".ui.tools.game.GameChattingRoomWebViewUI", intent, 5);
    }

    public final void P6() {
        android.app.ProgressDialog progressDialog = this.f140654p;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f140654p.cancel();
    }

    public final void Q6(int i17) {
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f140648g;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.f140646e.equals("action_create")) {
            com.tencent.mm.opensdk.modelbiz.CreateChatroom.Resp resp = new com.tencent.mm.opensdk.modelbiz.CreateChatroom.Resp();
            if (h17 != null) {
                resp.openId = h17.field_openId;
            }
            resp.transaction = this.f140649h;
            resp.extMsg = this.f140653o;
            resp.errCode = i17;
            resp.toBundle(bundle);
        } else if (this.f140646e.equals("action_join")) {
            com.tencent.mm.opensdk.modelbiz.JoinChatroom.Resp resp2 = new com.tencent.mm.opensdk.modelbiz.JoinChatroom.Resp();
            if (h17 != null) {
                resp2.openId = h17.field_openId;
            }
            resp2.transaction = this.f140649h;
            resp2.extMsg = this.f140653o;
            resp2.errCode = i17;
            resp2.toBundle(bundle);
        }
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = this.f140647f;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 5) {
            if (i18 == 4) {
                Q6(0);
            } else if (i18 == 5) {
                if (intent != null) {
                    ((com.tencent.mm.app.plugin.j) o25.z1.a()).b(this, intent.getStringExtra("rawUrl"), true, null, null);
                }
            } else if (i18 == 0) {
                Q6(-2);
            }
        }
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        com.tencent.mars.xlog.Log.i("MicroMsg.CreateOrJoinChatroomUI", "onCreate");
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        android.content.Intent intent = getIntent();
        this.f140646e = intent.getStringExtra("action");
        this.f140647f = intent.getStringExtra("package_name");
        this.f140648g = intent.getStringExtra("key_app_id");
        this.f140649h = intent.getStringExtra("key_transaction");
        this.f140650i = intent.getStringExtra(ya.b.GROUP_ID);
        this.f140651m = intent.getStringExtra("chatroom_name");
        this.f140652n = intent.getStringExtra("chatroom_nickname");
        this.f140653o = intent.getStringExtra("ext_msg");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f140646e) || com.tencent.mm.sdk.platformtools.t8.K0(this.f140648g) || com.tencent.mm.sdk.platformtools.t8.K0(this.f140650i)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CreateOrJoinChatroomUI", "Invalid args");
            finish();
            return;
        }
        this.f140654p = db5.e1.Q(this, "", getBaseContext().getString(com.tencent.mm.R.string.fpq), true, true, null);
        if (!this.f140646e.equals("action_create")) {
            if (this.f140646e.equals("action_join")) {
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = new m53.j1();
                lVar.f70665b = new m53.k1();
                lVar.f70666c = "/cgi-bin/mmgame-bin/gamejoinchatroom";
                lVar.f70667d = 1206;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                m53.j1 j1Var = (m53.j1) a17.f70710a.f70684a;
                j1Var.f323808d = this.f140648g;
                j1Var.f323809e = this.f140650i;
                java.lang.String str = this.f140652n;
                j1Var.f323810f = new com.tencent.mm.protobuf.g(str == null ? new byte[0] : str.getBytes());
                com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.plugin.game.ui.q(this), false);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CreateOrJoinChatroomUI", "createChatroom, appid = %s, groupId = %s, ChatRoomName = %s", this.f140648g, this.f140650i, this.f140651m);
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = new m53.s0();
        lVar2.f70665b = new m53.t0();
        lVar2.f70666c = "/cgi-bin/mmgame-bin/gamecreatechatroom";
        lVar2.f70667d = 1205;
        com.tencent.mm.modelbase.o a18 = lVar2.a();
        m53.s0 s0Var = (m53.s0) a18.f70710a.f70684a;
        s0Var.f324038d = this.f140648g;
        s0Var.f324039e = this.f140650i;
        java.lang.String str2 = this.f140651m;
        s0Var.f324040f = new com.tencent.mm.protobuf.g(str2 == null ? new byte[0] : str2.getBytes());
        java.lang.String str3 = this.f140652n;
        s0Var.f324041g = new com.tencent.mm.protobuf.g(str3 == null ? new byte[0] : str3.getBytes());
        com.tencent.mm.modelbase.z2.d(a18, new com.tencent.mm.plugin.game.ui.p(this), false);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        P6();
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        super.onDestroy();
    }
}
