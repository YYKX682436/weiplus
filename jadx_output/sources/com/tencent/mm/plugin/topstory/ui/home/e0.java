package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm4.y f174959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.l0 f174961f;

    public e0(com.tencent.mm.plugin.topstory.ui.home.l0 l0Var, wm4.y yVar, java.lang.String str) {
        this.f174961f = l0Var;
        this.f174959d = yVar;
        this.f174960e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.home.l0 l0Var = this.f174961f;
        l0Var.f175032a.getClass();
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        jbVar.field_ctrInfo = new r45.vs2();
        java.lang.String str = this.f174960e;
        jbVar.field_tipsId = str;
        l0Var.f175032a.getClass();
        this.f174959d.a(1, str, jbVar, new r45.f03());
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().I();
    }
}
