package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class h implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.i f162274d;

    public h(com.tencent.mm.plugin.shake.ui.i iVar) {
        this.f162274d = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        android.view.View view = this.f162274d.f162279a;
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        return false;
    }
}
