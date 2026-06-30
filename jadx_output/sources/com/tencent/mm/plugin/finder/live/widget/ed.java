package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ed implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gd f118246d;

    public ed(com.tencent.mm.plugin.finder.live.widget.gd gdVar) {
        this.f118246d = gdVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.widget.gd gdVar = this.f118246d;
        int i17 = gdVar.f118422f;
        if (i17 <= gdVar.f118421e) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.dd(gdVar));
            return false;
        }
        gdVar.f118422f = i17 - 1;
        gdVar.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.fd(gdVar));
        return true;
    }
}
