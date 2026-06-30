package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class v8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f185478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 f185480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185481g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185482h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(java.lang.String str, com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var, nw4.y2 y2Var, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f185479e = str;
        this.f185480f = e9Var;
        this.f185481g = y2Var;
        this.f185482h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.ui.tools.jsapi.v8(this.f185479e, this.f185480f, this.f185481g, this.f185482h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.ui.tools.jsapi.v8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x009f  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.tencent.mm.plugin.webview.ui.tools.jsapi.e9] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.tencent.mm.modelsimple.j] */
    /* JADX WARN: Type inference failed for: r9v2, types: [r45.cu5] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.jsapi.v8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
