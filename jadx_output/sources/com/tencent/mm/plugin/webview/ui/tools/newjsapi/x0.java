package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.api.o6 f186641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186644g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f186645h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186646i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f186647m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f186648n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.feature.emoji.api.o6 o6Var, nw4.k kVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.Long l17, java.lang.Boolean bool) {
        super(0);
        this.f186641d = o6Var;
        this.f186642e = kVar;
        this.f186643f = str;
        this.f186644g = str2;
        this.f186645h = i17;
        this.f186646i = str3;
        this.f186647m = l17;
        this.f186648n = bool;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.emoji.api.o6 service = this.f186641d;
        kotlin.jvm.internal.o.f(service, "$service");
        android.content.Context context = this.f186642e.f340860a;
        java.lang.String str = this.f186643f;
        java.lang.String str2 = this.f186644g;
        int i17 = this.f186645h;
        ((com.tencent.mm.feature.emoji.c4) service).pj(context, str, str2, i17, this.f186646i, this.f186647m, java.lang.Integer.valueOf(1000000 + i17), this.f186648n, null, null, null);
        return jz5.f0.f302826a;
    }
}
