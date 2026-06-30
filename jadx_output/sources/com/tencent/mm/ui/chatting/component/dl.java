package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class dl implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.gl f198944a;

    public dl(com.tencent.mm.ui.chatting.component.gl glVar) {
        this.f198944a = glVar;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        java.lang.String str;
        java.lang.String str2;
        if (sVar == null) {
            return;
        }
        com.tencent.mm.ui.chatting.component.gl glVar = this.f198944a;
        glVar.getClass();
        java.lang.String z07 = sVar.z0();
        long V = !com.tencent.mm.sdk.platformtools.t8.K0(z07) ? com.tencent.mm.sdk.platformtools.t8.V(z07, 0L) : 0L;
        if (V != 0) {
            str = "TypingTrigger_ISP" + V;
            str2 = "TypingInterval_ISP" + V;
        } else {
            str = "TypingTrigger";
            str2 = "TypingInterval";
        }
        boolean m17 = gm0.j1.b().m();
        java.lang.String str3 = com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
        java.lang.String str4 = "15";
        if (m17) {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
            if (d17 != null) {
                str3 = d17;
            }
            java.lang.String d18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str2);
            if (d18 != null) {
                str4 = d18;
            }
        }
        glVar.f199109e = com.tencent.mm.sdk.platformtools.t8.P(str3, 0);
        glVar.f199110f = com.tencent.mm.sdk.platformtools.t8.P(str4, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SignallingComponent", "ispId: %d, trigger:%d, interval:%d", java.lang.Long.valueOf(V), java.lang.Integer.valueOf(glVar.f199109e), java.lang.Integer.valueOf(glVar.f199110f));
        int i17 = glVar.f199109e;
        if (i17 != -1 && i17 != -2 && i17 <= 0) {
            glVar.f199109e = 10;
        }
        if (glVar.f199110f <= 0) {
            glVar.f199110f = 15;
        }
        sVar.H(glVar.f199110f * 1000, 20000L);
    }
}
