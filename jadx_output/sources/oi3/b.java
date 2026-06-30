package oi3;

/* loaded from: classes3.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.msg.MsgIdTalker a(java.lang.String str) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(str, "str");
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"-"}, false, 0, 6, null);
        if (f07.size() != 2) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.msg.MsgIdTalker(java.lang.Long.parseLong((java.lang.String) f07.get(0)), (java.lang.String) f07.get(1)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return (com.tencent.mm.plugin.msg.MsgIdTalker) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
    }
}
