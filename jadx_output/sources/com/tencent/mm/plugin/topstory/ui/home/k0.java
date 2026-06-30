package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f175025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.l0 f175026f;

    public k0(com.tencent.mm.plugin.topstory.ui.home.l0 l0Var, java.lang.String str, long j17) {
        this.f175026f = l0Var;
        this.f175024d = str;
        this.f175025e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f175026f.f175032a.g(this.f175024d, this.f175025e);
    }
}
