package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f176748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f176750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.h2 f176751g;

    public m2(com.tencent.mm.plugin.voip.model.h2 h2Var, boolean z17, java.lang.String str, long j17) {
        this.f176751g = h2Var;
        this.f176748d = z17;
        this.f176749e = str;
        this.f176750f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq4.v.Bi().I(true, this.f176748d, this.f176749e);
        this.f176751g.b(this.f176749e, this.f176748d, false, this.f176750f);
    }
}
