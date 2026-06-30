package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public final class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.k6 f208998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.TopStoryIconViewTipPreference f208999e;

    public j6(com.tencent.mm.ui.k6 k6Var, com.tencent.mm.ui.TopStoryIconViewTipPreference topStoryIconViewTipPreference) {
        this.f208998d = k6Var;
        this.f208999e = topStoryIconViewTipPreference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f208998d.d(this.f208999e);
    }
}
