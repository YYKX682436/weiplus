package ek5;

/* loaded from: classes9.dex */
public final class c0 extends ek5.b {
    @Override // ek5.b
    public android.content.Intent c(android.content.Context context, int i17, java.lang.String content, android.content.Intent retransmitIntent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(retransmitIntent, "retransmitIntent");
        if (i17 == 8) {
            com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(content);
            if (com.tencent.mm.sdk.platformtools.t8.K0(D3.f196358a)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ForwardPhotoAccountNameCardConfig", "getView : parse possible friend msg failed");
            }
            int i18 = D3.f196374q;
            java.util.Set set = c01.e2.f37117a;
            boolean D32 = com.tencent.mm.storage.z3.D3(i18);
            long longExtra = retransmitIntent.getLongExtra("Retr_Msg_Id", -1L);
            if (!D32 && longExtra > 0) {
                android.content.Intent Ri = ((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).Ri(context);
                Ri.putExtra("Select_Conv_Type", 7);
                return Ri;
            }
        }
        return super.c(context, i17, content, retransmitIntent);
    }

    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        ob5.a aVar = new ob5.a();
        param.a(aVar);
        java.lang.String stringExtra = intent.getStringExtra("Select_Talker_Name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVar.n(stringExtra);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(param.d())) {
            l15.c cVar = new l15.c();
            cVar.fromXml(param.d());
            aVar.l(cVar);
        }
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.v0.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return hk5.a0.class;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return ob5.a.class;
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.b0.c(43);
    }

    @Override // ek5.b
    public void k(android.content.Intent retransmitIntent) {
        kotlin.jvm.internal.o.g(retransmitIntent, "retransmitIntent");
        if (retransmitIntent.getBooleanExtra("Select_Send_Card", false)) {
            retransmitIntent.putExtra("Retr_Msg_Type", 8);
        }
    }
}
