package lr4;

/* loaded from: classes11.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr4.e f320736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr4.k f320737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f320738f;

    public i(lr4.e eVar, lr4.k kVar, android.view.View view) {
        this.f320736d = eVar;
        this.f320737e = kVar;
        this.f320738f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lr4.e eVar = this.f320736d;
        kr4.g gVar = (kr4.g) eVar.f293125i;
        lr4.c cVar = this.f320737e.f320746i;
        if (cVar != null) {
            android.view.View itemView = this.f320738f;
            kotlin.jvm.internal.o.f(itemView, "$itemView");
            eVar.getAdapterPosition();
            kotlin.jvm.internal.o.d(gVar);
            java.lang.String Di = ((fr4.g0) i95.n0.c(fr4.g0.class)).Di();
            lr4.n nVar = (lr4.n) cVar;
            boolean b17 = kotlin.jvm.internal.o.b(gVar.field_sessionId, "w1wsayhisessionholder@w1wmsg");
            com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment w1wPersonalMsgBaseConvFragment = nVar.f320757a;
            if (b17) {
                java.lang.String b18 = mr4.a.b();
                android.content.Context context = itemView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(context, com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgSayHiConvListUI.class);
                intent.putExtra("KEY_CONV_TYPE", 2);
                try {
                    android.content.Intent intent2 = w1wPersonalMsgBaseConvFragment.requireActivity().getIntent();
                    if (intent2 != null) {
                        intent.putExtra("key_w1w_refer_scene", intent2.getStringExtra("key_w1w_refer_scene"));
                        intent.putExtra("key_w1w_refer_scene_note", intent2.getStringExtra("key_w1w_refer_scene_note"));
                        intent.putExtra("key_w1w_refer_session_id", intent2.getStringExtra("key_w1w_refer_session_id"));
                        java.lang.String stringExtra = intent2.getStringExtra("key_w1w_refer_ext_info");
                        fr4.s[] sVarArr = fr4.s.f265860d;
                        intent.putExtra("key_w1w_refer_ext_info", mr4.a.d(stringExtra, "w1w-personal-msg-chat-list", b18));
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    z17 = false;
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvClickListener", "enterSayHiChatListPage", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvClickListener", "enterSayHiChatListPage", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e17) {
                    z17 = false;
                    com.tencent.mars.xlog.Log.w("W1w.W1wPersonalMsgConvClickListener", e17.getMessage());
                }
                w1wPersonalMsgBaseConvFragment.K0(vu4.d.f440303s, mr4.a.a((gVar.field_unReadCount <= 0 || gVar.field_readStatus != 0) ? "hello_window:hello_window" : "reddot_hello_window:reddot_hello_window"), b18, gVar.field_sessionId);
                gVar.field_readStatus = 1;
                kr4.m Bi = ((fr4.g0) i95.n0.c(fr4.g0.class)).Bi();
                if (Bi.update(gVar.systemRowid, gVar, z17)) {
                    Bi.doNotify(gVar.field_sessionId, 1, gVar);
                }
            } else {
                java.lang.String b19 = mr4.a.b();
                if (gVar.field_unReadCount > 0) {
                    ((fr4.g0) i95.n0.c(fr4.g0.class)).bj(com.tencent.shadow.dynamic.host.FailedException.ERROR_PLUGIN_PROCESS_LOADER_NOT_LOADED, gVar.field_selfUserName);
                }
                fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
                int Ri = g0Var.Ri(gVar.field_sessionId);
                com.tencent.mm.storage.z3 z3Var = gVar.Z;
                java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
                if (d17 == null) {
                    d17 = "";
                }
                g0Var.fj(d17, Di, new lr4.m(nVar, gVar, g0Var, Di, Ri, b19));
                w1wPersonalMsgBaseConvFragment.K0(vu4.d.f440293f, mr4.a.a(gVar.field_sessionId + ":message_window"), b19, gVar.field_sessionId);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
