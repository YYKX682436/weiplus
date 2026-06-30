package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.t f180986a = new com.tencent.mm.plugin.wallet_core.utils.t();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r2 == 2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r8, com.tencent.mm.storage.f9 r9) {
        /*
            r7 = this;
            com.tencent.mm.plugin.wallet_core.utils.m0 r0 = com.tencent.mm.plugin.wallet_core.utils.n0.f180939e
            r1 = 0
            if (r9 == 0) goto La
            java.lang.String r2 = r9.Q0()
            goto Lb
        La:
            r2 = r1
        Lb:
            com.tencent.mm.plugin.wallet_core.utils.n0 r2 = r0.a(r2)
            if (r9 == 0) goto L16
            java.lang.String r3 = r9.Q0()
            goto L17
        L16:
            r3 = r1
        L17:
            java.lang.String r4 = ""
            if (r3 != 0) goto L1c
            r3 = r4
        L1c:
            com.tencent.mm.plugin.wallet_core.utils.m0 r5 = com.tencent.mm.plugin.wallet_core.utils.n0.f180939e
            int r2 = r2.f180949d
            r5 = 1
            if (r2 == r5) goto L28
            com.tencent.mm.plugin.wallet_core.utils.m0 r5 = com.tencent.mm.plugin.wallet_core.utils.n0.f180939e
            r5 = 2
            if (r2 != r5) goto L39
        L28:
            gm0.m r2 = gm0.j1.b()
            if (r2 == 0) goto L33
            java.lang.String r2 = r2.k()
            goto L34
        L33:
            r2 = r1
        L34:
            if (r2 != 0) goto L38
            r3 = r4
            goto L39
        L38:
            r3 = r2
        L39:
            if (r8 == 0) goto L41
            java.lang.String r2 = "biz_type"
            r5 = 6
            r8.putInt(r2, r5)
        L41:
            if (r8 == 0) goto L58
            if (r9 == 0) goto L4e
            long r5 = r9.I0()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            goto L4f
        L4e:
            r2 = r1
        L4f:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "msg_svr_id"
            r8.putString(r5, r2)
        L58:
            if (r8 == 0) goto L61
            java.lang.String r2 = "pay_channel"
            r5 = 65
            r8.putInt(r2, r5)
        L61:
            if (r8 == 0) goto L68
            java.lang.String r2 = "chat_username"
            r8.putString(r2, r3)
        L68:
            if (r8 == 0) goto L7a
            if (r9 == 0) goto L74
            java.lang.String r2 = g95.e0.d(r9)
            if (r2 != 0) goto L73
            goto L74
        L73:
            r4 = r2
        L74:
            java.lang.String r2 = "sender_username"
            r8.putString(r2, r4)
        L7a:
            if (r8 == 0) goto L8f
            if (r9 == 0) goto L83
            java.lang.String r2 = r9.Q0()
            goto L84
        L83:
            r2 = r1
        L84:
            com.tencent.mm.plugin.wallet_core.utils.n0 r0 = r0.a(r2)
            java.lang.String r2 = "chat_type"
            int r0 = r0.f180949d
            r8.putInt(r2, r0)
        L8f:
            if (r8 == 0) goto La5
            com.tencent.mm.plugin.wallet_core.utils.r0 r0 = com.tencent.mm.plugin.wallet_core.utils.s0.f180980e
            if (r9 == 0) goto L99
            java.lang.String r1 = g95.e0.d(r9)
        L99:
            com.tencent.mm.plugin.wallet_core.utils.s0 r9 = r0.a(r1)
            java.lang.String r0 = "send_type"
            int r9 = r9.f180985d
            r8.putInt(r0, r9)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.utils.t.a(android.os.Bundle, com.tencent.mm.storage.f9):void");
    }

    public final void b(android.os.Bundle bundle, java.lang.String str) {
        if (bundle != null) {
            bundle.putInt("biz_type", 6);
        }
        if (bundle != null) {
            bundle.putInt("pay_channel", 7);
        }
        if (bundle != null) {
            bundle.putString("sender_username", str == null ? "" : str);
        }
        if (bundle != null) {
            bundle.putInt("chat_type", com.tencent.mm.plugin.wallet_core.utils.n0.f180939e.b(str == null ? "" : str).f180949d);
        }
        if (bundle != null) {
            com.tencent.mm.plugin.wallet_core.utils.r0 r0Var = com.tencent.mm.plugin.wallet_core.utils.s0.f180980e;
            if (str == null) {
                str = "";
            }
            bundle.putInt("send_type", r0Var.a(str).f180985d);
        }
    }
}
