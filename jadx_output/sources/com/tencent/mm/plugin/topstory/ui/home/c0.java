package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm4.y f174938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f174939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174940f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.l0 f174941g;

    public c0(com.tencent.mm.plugin.topstory.ui.home.l0 l0Var, wm4.y yVar, int i17, java.lang.String str) {
        this.f174941g = l0Var;
        this.f174938d = yVar;
        this.f174939e = i17;
        this.f174940f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f174941g.f175032a.getClass();
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        jbVar.field_ctrInfo = new r45.vs2();
        java.lang.String str = this.f174940f;
        jbVar.field_tipsId = str;
        this.f174938d.b(this.f174939e, str, jbVar);
    }
}
