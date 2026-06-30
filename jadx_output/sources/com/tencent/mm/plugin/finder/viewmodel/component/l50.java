package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class l50 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.m50 f135023d;

    public l50(com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var) {
        this.f135023d = m50Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var = this.f135023d;
        long j17 = currentTimeMillis - m50Var.f135125e;
        int i17 = (int) (j17 / 30000);
        m50Var.f135124d = i17;
        if (i17 < m50Var.f135129i || j17 < m50Var.f135128h) {
            return true;
        }
        kotlinx.coroutines.l.d(m50Var.getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.k50(m50Var, null), 3, null);
        return false;
    }
}
