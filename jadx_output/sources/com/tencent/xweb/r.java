package com.tencent.xweb;

/* loaded from: classes13.dex */
public class r implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cy5.y f220529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f220533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.j f220534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f220535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.q1 f220536i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f220537j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f220538k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.o1 f220539l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f220540m;

    public r(int i17, cy5.y yVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.xweb.j jVar, java.util.HashMap hashMap, com.tencent.xweb.q1 q1Var, android.app.Activity activity, android.view.ViewGroup viewGroup, com.tencent.xweb.o1 o1Var, android.webkit.ValueCallback valueCallback) {
        this.f220528a = i17;
        this.f220529b = yVar;
        this.f220530c = str;
        this.f220531d = str2;
        this.f220532e = str3;
        this.f220533f = z17;
        this.f220534g = jVar;
        this.f220535h = hashMap;
        this.f220536i = q1Var;
        this.f220537j = activity;
        this.f220538k = viewGroup;
        this.f220539l = o1Var;
        this.f220540m = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.xweb.t.c(((java.lang.Integer) obj).intValue(), this.f220528a, this.f220529b, this.f220530c, this.f220531d, this.f220532e, this.f220533f, this.f220534g, this.f220535h, this.f220536i, this.f220537j, this.f220538k, this.f220539l, this.f220540m);
    }
}
