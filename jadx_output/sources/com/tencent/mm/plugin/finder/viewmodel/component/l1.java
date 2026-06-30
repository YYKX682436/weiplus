package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.m1 f135010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f135011e;

    public l1(com.tencent.mm.plugin.finder.viewmodel.component.m1 m1Var, int i17) {
        this.f135010d = m1Var;
        this.f135011e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f135010d.a(this.f135011e, "FeedLoaderConsumeEnd");
    }
}
