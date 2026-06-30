package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class j implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.l f188939d;

    public j(com.tencent.mm.pluginsdk.model.app.l lVar) {
        this.f188939d = lVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f188939d.f188976d.clear();
        return false;
    }
}
