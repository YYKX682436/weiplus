package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class x implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.y f189136d;

    public x(com.tencent.mm.pluginsdk.model.app.y yVar) {
        this.f189136d = yVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        ((java.util.HashMap) this.f189136d.f189151d).clear();
        return false;
    }
}
