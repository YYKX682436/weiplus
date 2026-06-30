package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f175049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175050f;

    public n(com.tencent.mm.plugin.topstory.ui.home.j jVar, java.lang.String str, android.content.Intent intent) {
        this.f175050f = jVar;
        this.f175048d = str;
        this.f175049e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f175048d;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175050f;
        jVar.Q = com.tencent.mm.plugin.topstory.ui.home.j.a(jVar, str);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.z(jVar.f174986d, this.f175049e, 16, false);
    }
}
