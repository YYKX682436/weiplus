package lr4;

/* loaded from: classes8.dex */
public final class m implements gr4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lr4.n f320751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kr4.g f320752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f320753c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f320755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320756f;

    public m(lr4.n nVar, kr4.g gVar, fr4.g0 g0Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f320751a = nVar;
        this.f320752b = gVar;
        this.f320753c = g0Var;
        this.f320754d = str;
        this.f320755e = i17;
        this.f320756f = str2;
    }

    @Override // gr4.e
    public final void a(r45.ij3 ij3Var) {
        jz5.f0 f0Var;
        lr4.n nVar = this.f320751a;
        r45.xq4 xq4Var = ij3Var.f377097d;
        kr4.g gVar = this.f320752b;
        if (xq4Var != null) {
            int Ri = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Ri(xq4Var.f390335f);
            java.lang.String msg_session_id = xq4Var.f390335f;
            kotlin.jvm.internal.o.f(msg_session_id, "msg_session_id");
            com.tencent.mm.storage.z3 z3Var = gVar.Z;
            java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
            if (d17 == null) {
                d17 = "";
            }
            fr4.g0 g0Var = this.f320753c;
            g0Var.ij(msg_session_id, d17, g0Var.Di(), xq4Var.f390336g, xq4Var.f390338i, Ri);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("W1w.W1wPersonalMsgConvClickListener", "session_info is null, using default values");
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f320756f;
        intent.putExtra("Chat_User", gVar.field_sessionId);
        intent.putExtra("Chat_Self", this.f320754d);
        r45.xq4 xq4Var2 = ij3Var.f377097d;
        intent.putExtra("key_w1w_need_choose_id", xq4Var2 != null ? xq4Var2.f390337h : true);
        intent.putExtra("key_w1w_disable_sendmsg", ij3Var.f377097d != null ? !r1.f390338i : false);
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_w1w_conv_is_hello", this.f320755e == 1);
        try {
            android.content.Intent intent2 = nVar.f320757a.requireActivity().getIntent();
            if (intent2 != null) {
                intent.putExtra("key_w1w_refer_scene", intent2.getStringExtra("key_w1w_refer_scene"));
                intent.putExtra("key_w1w_refer_scene_note", intent2.getStringExtra("key_w1w_refer_scene_note"));
                intent.putExtra("key_w1w_refer_session_id", intent2.getStringExtra("key_w1w_refer_session_id"));
                java.lang.String stringExtra = intent2.getStringExtra("key_w1w_refer_ext_info");
                fr4.s[] sVarArr = fr4.s.f265860d;
                intent.putExtra("key_w1w_refer_ext_info", mr4.a.d(stringExtra, "w1w-personal-msg-chat-list", str));
            }
            j45.l.u(nVar.f320757a.requireContext(), ".ui.chatting.ChattingUI", intent, null);
            pm0.v.K(null, new lr4.l(gVar));
            yz5.l lVar = nVar.f320758b;
            if (lVar != null) {
                lVar.invoke(gVar);
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("W1w.W1wPersonalMsgConvClickListener", "no activity attached to fragment, maybe internet is not connected");
        }
    }
}
