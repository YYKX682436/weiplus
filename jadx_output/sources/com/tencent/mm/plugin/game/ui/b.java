package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class b implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.d f141037d;

    public b(com.tencent.mm.plugin.game.ui.d dVar) {
        this.f141037d = dVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f141037d.notifyDataSetChanged();
        return false;
    }
}
