package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f183304d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f183305e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f183306f;

    /* renamed from: g, reason: collision with root package name */
    public int f183307g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f183308h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f183309i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183310m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.modeltools.o0 f183311n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f183312o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.webkit.PermissionRequest f183313p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183314q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlin.jvm.internal.h0 h0Var, java.lang.String[] strArr, android.content.Context context, com.tencent.mm.plugin.webview.modeltools.o0 o0Var, kotlin.jvm.internal.h0 h0Var2, android.webkit.PermissionRequest permissionRequest, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f183308h = h0Var;
        this.f183309i = strArr;
        this.f183310m = context;
        this.f183311n = o0Var;
        this.f183312o = h0Var2;
        this.f183313p = permissionRequest;
        this.f183314q = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.modeltools.k0(this.f183308h, this.f183309i, this.f183310m, this.f183311n, this.f183312o, this.f183313p, this.f183314q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.modeltools.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e9  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.modeltools.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
