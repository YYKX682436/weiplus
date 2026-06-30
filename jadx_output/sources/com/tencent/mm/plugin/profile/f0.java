package com.tencent.mm.plugin.profile;

/* loaded from: classes5.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153462d;

    public f0(com.tencent.mm.plugin.profile.r0 r0Var, java.lang.String str) {
        this.f153462d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.p7[] L0;
        y35.r[] g17;
        java.lang.String str = this.f153462d;
        int i17 = 0;
        if (str != null && (L0 = r21.w.Ai().L0(str, 3)) != null && (g17 = y35.r.g(com.tencent.mm.sdk.platformtools.x2.f193071a, L0)) != null) {
            if (!(g17.length == 0)) {
                int length = g17.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        break;
                    }
                    if (g17[i18].k()) {
                        i17 = 1;
                        break;
                    }
                    i18++;
                }
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "friend_request_reply_btn");
        hashMap.put("friend_request_has_img", java.lang.Integer.valueOf(i17));
        hashMap.put("add_username", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 33926);
    }
}
