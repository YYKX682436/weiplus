package com.tencent.mm.ui.transmit.recent;

/* loaded from: classes7.dex */
public final class j implements db5.k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.transmit.recent.j f211057a = new com.tencent.mm.ui.transmit.recent.j();

    @Override // db5.k4
    public final void a(android.widget.ImageView imageView, db5.h4 h4Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(h4Var.A)) {
            return;
        }
        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.y.a())) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, h4Var.A, null);
            return;
        }
        try {
            ((com.tencent.mm.feature.avatar.s) ((kv.y) i95.n0.c(kv.y.class))).wi(imageView, h4Var.A);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MircoMsg.RecentForwardUtils", "attachAvatar for username:" + h4Var.A + ", get exception:" + e17);
        }
    }
}
