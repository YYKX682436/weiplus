package fr4;

/* loaded from: classes8.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ij3 f265868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f265869g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265870h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265871i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265872m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265873n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265874o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f265875p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f265876q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265877r;

    public x(java.lang.String str, java.lang.String str2, r45.ij3 ij3Var, boolean z17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, android.content.Context context, fr4.g0 g0Var, java.lang.String str8) {
        this.f265866d = str;
        this.f265867e = str2;
        this.f265868f = ij3Var;
        this.f265869g = z17;
        this.f265870h = str3;
        this.f265871i = str4;
        this.f265872m = str5;
        this.f265873n = str6;
        this.f265874o = str7;
        this.f265875p = context;
        this.f265876q = g0Var;
        this.f265877r = str8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.ij3 ij3Var = this.f265868f;
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_Self", this.f265866d);
            intent.putExtra("Chat_User", this.f265867e);
            boolean z17 = true;
            intent.putExtra("finish_direct", true);
            intent.putExtra("key_w1w_need_choose_id", ij3Var.f377097d.f390337h);
            intent.putExtra("key_w1w_avatar_style", this.f265869g);
            if (ij3Var.f377097d.f390338i) {
                z17 = false;
            }
            intent.putExtra("key_w1w_disable_sendmsg", z17);
            intent.putExtra("key_w1w_nickname", this.f265870h);
            intent.putExtra("key_w1w_refer_scene", this.f265871i);
            intent.putExtra("key_w1w_refer_scene_note", this.f265872m);
            intent.putExtra("key_w1w_refer_session_id", this.f265873n);
            intent.putExtra("key_w1w_refer_ext_info", this.f265874o);
            android.content.Context context = this.f265875p;
            if (context != null) {
                com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[launchChatting] starting ChattingUI for sessionId=" + ij3Var.f377097d.f390335f);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                pm0.v.K(null, new fr4.w(this.f265876q, this.f265877r));
                com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[launchChatting] successfully launched chatting interface");
            } else {
                com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "[launchChatting] Context is null, cannot start activity");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "Error starting activity: " + e17.getMessage());
        }
    }
}
