package com.tencent.mm.plugin.game;

/* loaded from: classes5.dex */
public class a1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f138690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f138691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f138692c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.p0 f138693d;

    public a1(com.tencent.mm.plugin.game.p0 p0Var, android.content.Context context, int i17, java.lang.String str) {
        this.f138693d = p0Var;
        this.f138690a = context;
        this.f138691b = i17;
        this.f138692c = str;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "createLiteApp fail");
        this.f138693d.getClass();
        int i17 = this.f138691b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = this.f138692c;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "fallbackActivity! fromScene:%d username:%s", valueOf, str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        if (i17 != 0) {
            intent.putExtra("chat_from_scene", i17);
        }
        j45.l.u(this.f138690a, ".ui.chatting.ChattingUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0("gh_25d9ac85a4bc");
        this.f138693d.f140603d.alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "createLiteApp success");
    }
}
