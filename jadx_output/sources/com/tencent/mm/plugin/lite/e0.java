package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f143459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f143460f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143461g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143462h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f143463i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f143464m;

    public e0(com.tencent.mm.plugin.lite.w wVar, java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, boolean z17, int i19) {
        this.f143458d = str;
        this.f143459e = i17;
        this.f143460f = i18;
        this.f143461g = str2;
        this.f143462h = str3;
        this.f143463i = z17;
        this.f143464m = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.logic.g1.s().Q(this.f143458d, this.f143459e, this.f143460f, this.f143461g, this.f143462h, this.f143463i, this.f143464m);
    }
}
