package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f183292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.modeltools.o0 f183294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183295g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183296h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.webkit.GeolocationPermissions.Callback f183297i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183298m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f183299n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183300o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context, com.tencent.mm.plugin.webview.modeltools.o0 o0Var, java.lang.String str, java.lang.String str2, android.webkit.GeolocationPermissions.Callback callback, java.lang.String str3, int i17, java.lang.String str4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f183293e = context;
        this.f183294f = o0Var;
        this.f183295g = str;
        this.f183296h = str2;
        this.f183297i = callback;
        this.f183298m = str3;
        this.f183299n = i17;
        this.f183300o = str4;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.modeltools.j0(this.f183293e, this.f183294f, this.f183295g, this.f183296h, this.f183297i, this.f183298m, this.f183299n, this.f183300o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.modeltools.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0148  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.modeltools.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
