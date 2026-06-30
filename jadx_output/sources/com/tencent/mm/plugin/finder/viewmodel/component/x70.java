package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x70 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC f136416d;

    public x70(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC) {
        this.f136416d = finderTabUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f136416d.getActiveFragment().s0();
    }
}
