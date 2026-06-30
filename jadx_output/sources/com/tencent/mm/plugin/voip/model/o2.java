package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f176773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f176775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.h2 f176776g;

    public o2(com.tencent.mm.plugin.voip.model.h2 h2Var, boolean z17, java.lang.String str, long j17) {
        this.f176776g = h2Var;
        this.f176773d = z17;
        this.f176774e = str;
        this.f176775f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq4.v.Bi().I(true, this.f176773d, this.f176774e);
        this.f176776g.b(this.f176774e, this.f176773d, false, this.f176775f);
    }
}
