package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes2.dex */
public final class t8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f186540d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f186541e;

    /* renamed from: f, reason: collision with root package name */
    public int f186542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f186543g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186544h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(org.json.JSONObject jSONObject, com.tencent.mm.ipcinvoker.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f186543g = jSONObject;
        this.f186544h = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.t8(this.f186543g, this.f186544h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.t8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x02e4  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.t8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
