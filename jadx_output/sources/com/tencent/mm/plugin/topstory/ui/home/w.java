package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.a f175092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wm4.y f175093e;

    public w(com.tencent.mm.plugin.topstory.ui.home.j jVar, com.tencent.mm.plugin.finder.extension.reddot.a aVar, wm4.y yVar) {
        this.f175092d = aVar;
        this.f175093e = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = this.f175092d;
        r45.f03 f03Var = aVar.f105328b;
        this.f175093e.b(aVar.f105327a ? f03Var != null ? f03Var.f373888e : 0 : 0, "", aVar.f105329c);
    }
}
