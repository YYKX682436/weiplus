package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class n implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.k f177184d;

    public n(com.tencent.mm.plugin.voip.widget.k kVar) {
        this.f177184d = kVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.voip.widget.m(this));
        return true;
    }
}
