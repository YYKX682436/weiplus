package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yn implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.zn f120453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f120454e;

    public yn(com.tencent.mm.plugin.finder.live.widget.zn znVar, gk2.e eVar) {
        this.f120453d = znVar;
        this.f120454e = eVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.xn(this.f120453d, this.f120454e));
        return true;
    }
}
