package qg5;

@j95.b
/* loaded from: classes8.dex */
public final class h2 extends i95.w implements ct.x2 {
    public void wi(android.content.Context context, long j17, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).fj(context, j17, str, 0);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("msg_id", j17);
        bundle.putString("msg_talker", str);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, qg5.f2.class, qg5.g2.f362990d);
    }
}
