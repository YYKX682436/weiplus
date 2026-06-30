package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f176765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f176767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.h2 f176768g;

    public n2(com.tencent.mm.plugin.voip.model.h2 h2Var, boolean z17, java.lang.String str, long j17) {
        this.f176768g = h2Var;
        this.f176765d = z17;
        this.f176766e = str;
        this.f176767f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq4.v.Bi().I(true, this.f176765d, this.f176766e);
        this.f176768g.b(this.f176766e, this.f176765d, false, this.f176767f);
    }
}
