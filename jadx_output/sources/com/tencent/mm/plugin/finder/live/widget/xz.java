package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f120391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.zz f120392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.q63 f120393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f120394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f120395h;

    public xz(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, com.tencent.mm.plugin.finder.live.widget.zz zzVar, r45.q63 q63Var, boolean z17, java.lang.Runnable runnable) {
        this.f120391d = m10Var;
        this.f120392e = zzVar;
        this.f120393f = q63Var;
        this.f120394g = z17;
        this.f120395h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120391d;
        dk2.xf W0 = m10Var.f119001c.W0();
        com.tencent.mm.plugin.finder.live.widget.zz zzVar = this.f120392e;
        if (W0 != null) {
            com.tencent.mm.plugin.finder.live.widget.dz dzVar = zzVar.f120617a;
            int integer = this.f120393f.getInteger(11);
            com.tencent.mm.plugin.finder.live.plugin.l basePlugin = m10Var.f119001c;
            boolean z17 = this.f120394g;
            com.tencent.mm.plugin.finder.live.widget.wz wzVar = new com.tencent.mm.plugin.finder.live.widget.wz(m10Var, z17, this.f120395h);
            dzVar.getClass();
            kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
            dzVar.f118178q = integer;
            dzVar.f118179r = basePlugin.W0();
            dzVar.f118180s = basePlugin;
            dzVar.f118177p = z17;
            dzVar.f118176o = wzVar;
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = m10Var.f119013o;
        if (y1Var != null) {
            y1Var.h(zzVar.f120617a);
        }
    }
}
