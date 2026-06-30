package fr4;

/* loaded from: classes8.dex */
public final class q implements gr4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265854c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f265855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragment f265858g;

    public q(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context, java.lang.String str4, java.lang.String str5, com.tencent.mm.ui.MMFragment mMFragment) {
        this.f265852a = str;
        this.f265853b = str2;
        this.f265854c = str3;
        this.f265855d = context;
        this.f265856e = str4;
        this.f265857f = str5;
        this.f265858g = mMFragment;
    }

    @Override // gr4.e
    public final void a(r45.ij3 ij3Var) {
        java.lang.String str;
        java.lang.String str2 = this.f265856e;
        boolean b17 = kotlin.jvm.internal.o.b(this.f265852a, "1");
        int Ri = ((fr4.g0) i95.n0.c(fr4.g0.class)).Ri(ij3Var.f377097d.f390335f);
        if (ij3Var.f377097d != null) {
            fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
            java.lang.String msg_session_id = ij3Var.f377097d.f390335f;
            kotlin.jvm.internal.o.f(msg_session_id, "msg_session_id");
            java.lang.String str3 = this.f265853b;
            java.lang.String str4 = this.f265854c;
            r45.xq4 xq4Var = ij3Var.f377097d;
            str = "key_w1w_refer_ext_info";
            g0Var.ij(msg_session_id, str3, str4, xq4Var.f390336g, xq4Var.f390338i, Ri);
            com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgConvClickListener", "can_change_identity: " + ij3Var.f377097d.f390337h + ", can_recv_msg: " + ij3Var.f377097d.f390338i);
        } else {
            str = "key_w1w_refer_ext_info";
            com.tencent.mars.xlog.Log.w("W1w.W1wPersonalMsgConvClickListener", "session_info is null, using default needChooseId=true, disableSendMsg=false");
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String str5 = this.f265857f;
            com.tencent.mm.ui.MMFragment mMFragment = this.f265858g;
            intent.putExtra("Chat_User", str2);
            intent.putExtra("Chat_Self", str5);
            intent.putExtra("key_w1w_need_choose_id", ij3Var.f377097d.f390337h);
            intent.putExtra("key_w1w_avatar_style", b17);
            intent.putExtra("key_w1w_disable_sendmsg", !ij3Var.f377097d.f390338i);
            intent.putExtra("finish_direct", true);
            intent.addFlags(67108864);
            java.lang.String stringExtra = mMFragment.getStringExtra("key_w1w_refer_scene");
            if (stringExtra == null) {
                stringExtra = "0";
            }
            intent.putExtra("key_w1w_refer_scene", stringExtra);
            java.lang.String stringExtra2 = mMFragment.getStringExtra("key_w1w_refer_scene_note");
            java.lang.String str6 = "";
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            intent.putExtra("key_w1w_refer_scene_note", stringExtra2);
            java.lang.String stringExtra3 = mMFragment.getStringExtra("key_w1w_refer_session_id");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            intent.putExtra("key_w1w_refer_session_id", stringExtra3);
            java.lang.String str7 = str;
            java.lang.String stringExtra4 = mMFragment.getStringExtra(str7);
            if (stringExtra4 != null) {
                str6 = stringExtra4;
            }
            intent.putExtra(str7, str6);
            intent.putExtra("key_w1w_conv_is_hello", Ri == 1);
            j45.l.u(this.f265855d, ".ui.chatting.ChattingUI", intent, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("W1wPersonalMsgLiteAppStoreHelper", "Failed to start chatting via global service", e17);
        }
        pm0.v.K(null, new fr4.p(str2));
    }
}
