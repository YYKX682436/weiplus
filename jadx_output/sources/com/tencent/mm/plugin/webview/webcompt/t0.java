package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f187913d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f187914e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f187915f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f187916g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f187917h;

    /* renamed from: i, reason: collision with root package name */
    public int f187918i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f187919m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f187920n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187921o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o25.k2 f187922p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r45.d24 f187923q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187924r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187925s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187926t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f187927u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(boolean z17, com.tencent.mm.plugin.webview.webcompt.f1 f1Var, o25.k2 k2Var, r45.d24 d24Var, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f187920n = z17;
        this.f187921o = f1Var;
        this.f187922p = k2Var;
        this.f187923q = d24Var;
        this.f187924r = str;
        this.f187925s = str2;
        this.f187926t = str3;
        this.f187927u = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.webview.webcompt.t0 t0Var = new com.tencent.mm.plugin.webview.webcompt.t0(this.f187920n, this.f187921o, this.f187922p, this.f187923q, this.f187924r, this.f187925s, this.f187926t, this.f187927u, continuation);
        t0Var.f187919m = obj;
        return t0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.webcompt.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x04f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x04a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0260 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.webcompt.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
