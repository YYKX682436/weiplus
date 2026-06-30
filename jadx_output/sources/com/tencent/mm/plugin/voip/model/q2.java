package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.h2 f176790e;

    public q2(com.tencent.mm.plugin.voip.model.h2 h2Var, java.lang.String str) {
        this.f176790e = h2Var;
        this.f176789d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq4.a aVar = this.f176790e.f176559b;
        if (aVar != null) {
            java.lang.String str = this.f176789d;
            com.tencent.mm.plugin.voip.model.d0 d0Var = (com.tencent.mm.plugin.voip.model.d0) aVar;
            if (d0Var.f176376g != null) {
                d0Var.L = str;
                d0Var.f176376g.e4(str);
            }
        }
    }
}
