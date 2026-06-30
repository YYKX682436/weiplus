package com.tencent.mm.pluginsdk.model.app;

@j95.b
/* loaded from: classes5.dex */
public final class y2 extends i95.w implements l90.i {
    public l90.m wi(android.content.Context context, com.tencent.mm.storage.p7 msg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        y35.r c17 = y35.r.c(com.tencent.mm.sdk.platformtools.x2.f193071a, msg);
        boolean z17 = c17.f459237f;
        java.lang.String digest = c17.f459233b;
        kotlin.jvm.internal.o.f(digest, "digest");
        return new l90.m(z17, digest, c17.k(), null);
    }
}
