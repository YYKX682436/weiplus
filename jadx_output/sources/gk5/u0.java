package gk5;

/* loaded from: classes9.dex */
public final class u0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk5.v0 f272720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f272721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272722c;

    public u0(gk5.v0 v0Var, java.util.List list, java.lang.String str) {
        this.f272720a = v0Var;
        this.f272721b = list;
        this.f272722c = str;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        wi5.n0 n0Var;
        gk5.v0 v0Var = this.f272720a;
        j75.f Q6 = v0Var.Q6();
        boolean z17 = (Q6 == null || (n0Var = (wi5.n0) Q6.getState()) == null || !n0Var.G) ? false : true;
        java.util.List list = this.f272721b;
        if (!z17) {
            j75.f Q62 = v0Var.Q6();
            if (Q62 != null) {
                Q62.B3(new xi5.g(list, intent, i17));
                return;
            }
            return;
        }
        if (i17 == -1) {
            if (intent == null || (str = intent.getStringExtra("Retr_ForwardExtraText")) == null) {
                str = "";
            }
            v0Var.f323514f = !r26.n0.N(str);
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it.next();
                kotlin.jvm.internal.o.d(str2);
                if (!r26.n0.N(str2)) {
                    java.lang.String cardUsername = this.f272722c;
                    kotlin.jvm.internal.o.g(cardUsername, "cardUsername");
                    com.tencent.mm.storage.f9 e76 = v0Var.e7();
                    if (e76 != null) {
                        e76.t3();
                        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                        ob5.a aVar = (ob5.a) v0Var.c7();
                        cj6.lb(aVar.getLong(aVar.f43702d + 0), e76, true);
                        ((ce0.e) ((xg3.t0) i95.n0.c(xg3.t0.class))).getClass();
                        com.tencent.mm.modelsimple.g1.L(e76, 21, 1);
                        w11.r1 b17 = w11.s1.b(str2, null, 2, null);
                        b17.g(str2);
                        b17.e(v0Var.d7());
                        b17.f442130e = 49;
                        b17.f442131f = 1;
                        b17.f442134i = 4;
                        c01.h7 h7Var = new c01.h7();
                        ob5.a aVar2 = (ob5.a) v0Var.c7();
                        h7Var.f37227b = aVar2.getLong(aVar2.f43702d + 0);
                        ob5.a aVar3 = (ob5.a) v0Var.c7();
                        h7Var.f37229d = aVar3.getString(aVar3.f43702d + 1);
                        h7Var.f37230e = v0Var.getActivity().getIntent().getStringExtra("msg_forward_sns_obj_id");
                        b17.f(h7Var);
                        w11.n1 a17 = b17.a();
                        w11.r0 r0Var = (w11.r0) a17.f442095a;
                        java.lang.Long valueOf = r0Var != null ? java.lang.Long.valueOf(r0Var.f442117f) : null;
                        com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
                        long longValue = valueOf != null ? valueOf.longValue() : 0L;
                        am.xz xzVar = updateForwardMsgIdEvent.f54918g;
                        xzVar.f8409a = longValue;
                        xzVar.f8410b = 0;
                        xzVar.f8411c = str2;
                        updateForwardMsgIdEvent.e();
                        a17.a();
                    } else {
                        jz5.g gVar = v0Var.f272724s;
                        java.lang.String str3 = (java.lang.String) ((jz5.n) gVar).getValue();
                        kotlin.jvm.internal.o.f(str3, "<get-cardReceiveUsername>(...)");
                        if (r26.n0.N(str3)) {
                            v0Var.q7(str2, ((ob5.a) v0Var.c7()).k());
                        } else {
                            java.lang.String str4 = (java.lang.String) ((jz5.n) gVar).getValue();
                            kotlin.jvm.internal.o.f(str4, "<get-cardReceiveUsername>(...)");
                            v0Var.q7(str4, cardUsername);
                        }
                    }
                    if (v0Var.f323514f) {
                        ((dk5.s5) tg3.t1.a()).Ui(str, str2);
                    }
                }
            }
            v0Var.Y6(list.size() > 1, false, null);
        }
    }
}
