package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class c0 implements ei.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.b0 f153034d;

    public c0(com.tencent.mm.plugin.performance.watchdogs.b0 b0Var) {
        this.f153034d = b0Var;
    }

    @Override // ei.a
    public void a(boolean z17) {
        bm5.f1.a();
        this.f153034d.f153019n = z17;
        if (z17) {
            return;
        }
        this.f153034d.f153024s = java.lang.System.currentTimeMillis();
    }
}
