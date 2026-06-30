package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d37 f176535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f176536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.i3 f176537f;

    public g3(com.tencent.mm.plugin.voip.model.i3 i3Var, r45.d37 d37Var, boolean z17) {
        this.f176537f = i3Var;
        this.f176535d = d37Var;
        this.f176536e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.i3 i3Var = this.f176537f;
        i3Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.f3(i3Var, this.f176535d, this.f176536e));
    }
}
