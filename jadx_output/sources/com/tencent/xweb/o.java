package com.tencent.xweb;

/* loaded from: classes13.dex */
public class o implements cy5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f220350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f220351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220352c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f220353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy5.y f220354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f220355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220357h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f220358i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.j f220359j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f220360k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.q1 f220361l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.o1 f220362m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f220363n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f220364o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f220365p;

    public o(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, java.lang.String str, java.lang.ref.WeakReference weakReference3, cy5.y yVar, int i17, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.xweb.j jVar, java.util.HashMap hashMap, com.tencent.xweb.q1 q1Var, com.tencent.xweb.o1 o1Var, android.webkit.ValueCallback valueCallback, android.app.Activity activity, boolean z18) {
        this.f220350a = weakReference;
        this.f220351b = weakReference2;
        this.f220352c = str;
        this.f220353d = weakReference3;
        this.f220354e = yVar;
        this.f220355f = i17;
        this.f220356g = str2;
        this.f220357h = str3;
        this.f220358i = z17;
        this.f220359j = jVar;
        this.f220360k = hashMap;
        this.f220361l = q1Var;
        this.f220362m = o1Var;
        this.f220363n = valueCallback;
        this.f220364o = activity;
        this.f220365p = z18;
    }

    @Override // cy5.o
    public void a() {
        by5.c4.f("FileReaderXWeb", "onXWalkPluginUpdateStarted");
    }

    @Override // cy5.o
    public void b(int i17) {
        by5.c4.f("FileReaderXWeb", "onXWalkPluginUpdateProgress " + i17);
        android.app.Activity activity = (android.app.Activity) this.f220350a.get();
        android.widget.TextView textView = (android.widget.TextView) this.f220351b.get();
        if (activity == null || activity.isDestroyed() || textView == null) {
            return;
        }
        textView.setText(activity.getString(com.tencent.xwebsdk.R.string.xweb_file_reader_plugin_downloading) + i17 + "%");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019c  */
    @Override // cy5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r32) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.o.c(int):void");
    }
}
