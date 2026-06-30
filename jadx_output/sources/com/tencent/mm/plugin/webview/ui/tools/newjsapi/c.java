package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f185988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f185989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ipcinvoker.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f185989e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.c(this.f185989e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:5:0x0012, B:6:0x005a, B:8:0x0062, B:10:0x006c, B:13:0x0078, B:15:0x007a, B:17:0x008b, B:19:0x0091, B:21:0x0097, B:23:0x00a0, B:25:0x00a6, B:26:0x00aa, B:35:0x002c, B:37:0x003d, B:38:0x0048, B:40:0x0050), top: B:2:0x000e }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
