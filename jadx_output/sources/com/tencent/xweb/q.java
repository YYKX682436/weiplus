package com.tencent.xweb;

/* loaded from: classes13.dex */
public class q implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cy5.y f220505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f220509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.j f220510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f220511h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.q1 f220512i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f220513j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f220514k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.o1 f220515l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f220516m;

    public q(int i17, cy5.y yVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.xweb.j jVar, java.util.HashMap hashMap, com.tencent.xweb.q1 q1Var, android.app.Activity activity, android.view.ViewGroup viewGroup, com.tencent.xweb.o1 o1Var, android.webkit.ValueCallback valueCallback) {
        this.f220504a = i17;
        this.f220505b = yVar;
        this.f220506c = str;
        this.f220507d = str2;
        this.f220508e = str3;
        this.f220509f = z17;
        this.f220510g = jVar;
        this.f220511h = hashMap;
        this.f220512i = q1Var;
        this.f220513j = activity;
        this.f220514k = viewGroup;
        this.f220515l = o1Var;
        this.f220516m = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.xweb.t.c(((java.lang.Integer) obj).intValue(), this.f220504a, this.f220505b, this.f220506c, this.f220507d, this.f220508e, this.f220509f, this.f220510g, this.f220511h, this.f220512i, this.f220513j, this.f220514k, this.f220515l, this.f220516m);
    }
}
