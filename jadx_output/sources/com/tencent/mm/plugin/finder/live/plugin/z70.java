package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z70 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a80 f115306d;

    public z70(com.tencent.mm.plugin.finder.live.plugin.a80 a80Var) {
        this.f115306d = a80Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.plugin.a80 a80Var = this.f115306d;
        int i17 = a80Var.f111835v;
        a80Var.getClass();
        if (i17 > 0) {
            android.widget.TextView textView = a80Var.f111833t;
            textView.setVisibility(0);
            textView.setText(java.lang.String.valueOf(a80Var.f111835v));
            a80Var.f111835v--;
            return true;
        }
        a80Var.getClass();
        com.tencent.mm.plugin.finder.assist.p8.c(com.tencent.mm.plugin.finder.assist.p8.f102460a, com.tencent.mm.plugin.finder.assist.t8.f102577w.f102540b, null, false, false, 14, null);
        ((kotlinx.coroutines.flow.h3) ((mm2.c1) a80Var.S0().a(mm2.c1.class)).G5).k(java.lang.Boolean.TRUE);
        az2.f fVar = a80Var.f111834u;
        if (fVar != null) {
            fVar.a();
        }
        a80Var.f111833t.setVisibility(8);
        a80Var.f111832s.setVisibility(8);
        return false;
    }
}
