package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class vb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f186583d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f186584e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f186585f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f186586g;

    /* renamed from: h, reason: collision with root package name */
    public int f186587h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f186588i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f186588i = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.vb(this.f186588i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.vb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        if (r12 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0107  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00cf -> B:9:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f7 -> B:6:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0104 -> B:7:0x0105). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.vb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
