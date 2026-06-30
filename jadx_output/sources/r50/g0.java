package r50;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392579d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r50.j0 j0Var) {
        super(1);
        this.f392579d = j0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vg5.a state = (vg5.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wg5.e)) {
            r50.j0 j0Var = this.f392579d;
            j0Var.W6().f().setOnClickListener(new r50.z(j0Var));
            if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
                j0Var.f392588g = new com.tencent.mm.pluginsdk.ui.chat.t5(j0Var.getActivity());
            } else {
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(j0Var.getActivity());
                j0Var.f392588g = wi6;
                int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
                wi6.setEntranceScene(0);
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = j0Var.f392588g;
                if (chatFooterPanel != null) {
                    chatFooterPanel.setVisibility(8);
                }
                int g17 = com.tencent.mm.sdk.platformtools.d2.g(j0Var.getActivity());
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = j0Var.f392588g;
                if (chatFooterPanel2 != null) {
                    chatFooterPanel2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i65.a.B(j0Var.getActivity()), g17));
                }
                em.b W6 = j0Var.W6();
                if (W6.f254092o == null) {
                    W6.f254092o = (android.widget.LinearLayout) W6.f254078a.findViewById(com.tencent.mm.R.id.dcu);
                }
                W6.f254092o.addView(j0Var.f392588g);
                com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "init: height %s, addView, Gone smileyPanel", java.lang.Integer.valueOf(g17));
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = j0Var.f392588g;
                if (chatFooterPanel3 != null) {
                    chatFooterPanel3.c();
                }
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel4 = j0Var.f392588g;
                if (chatFooterPanel4 != null) {
                    chatFooterPanel4.i();
                }
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel5 = j0Var.f392588g;
                if (chatFooterPanel5 != null) {
                    chatFooterPanel5.setOnTextOperationListener(new r50.u(j0Var));
                }
            }
            em.b W62 = j0Var.W6();
            if (W62.f254093p == null) {
                W62.f254093p = (android.widget.LinearLayout) W62.f254078a.findViewById(com.tencent.mm.R.id.ty8);
            }
            W62.f254093p.setOnTouchListener(new r50.a0(j0Var));
            java.util.ArrayList arrayList = (java.util.ArrayList) state.f436775f;
            if (arrayList.size() == 1) {
                java.lang.String str = (java.lang.String) arrayList.get(0);
                if (com.tencent.mm.storage.z3.R4(str)) {
                    ct.p2 p2Var = (ct.p2) i95.n0.c(ct.p2.class);
                    com.tencent.mm.ui.widget.MMEditText e17 = j0Var.W6().e();
                    android.app.Activity context = j0Var.getContext();
                    ((qg5.a) p2Var).getClass();
                    com.tencent.mm.ui.i1.c(e17, context, str);
                }
            }
            j0Var.W6().i().setTextSize(0, i65.a.f(j0Var.getContext(), com.tencent.mm.R.dimen.f479575r));
            if (j0Var.V6()) {
                j0Var.W6().e().setEnableSendBtn(true);
                j0Var.W6().e().setImeOptions(4);
            } else {
                j0Var.W6().i().setOnClickListener(new r50.b0(j0Var));
            }
            j0Var.W6().e().c(new r50.c0(j0Var));
            j0Var.W6().e().b("", com.tencent.mm.sdk.platformtools.m2.f(j0Var.getContext()), (nl5.a0) ((jz5.n) j0Var.f392596r).getValue(), null);
            ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).wi(j0Var.getContext(), 17, j0Var.W6().e(), j0Var.W6().j(), "");
            a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
            if (mVar != null) {
                mVar.f973g = 4;
            }
            j0Var.W6().j().setOnSpeechInputListener(new r50.d0(j0Var));
            j0Var.W6().j().setOnSpeechInputShowListener(new r50.e0(j0Var));
            j0Var.W6().e().setOnTouchListener(new r50.f0());
        }
        return jz5.f0.f302826a;
    }
}
