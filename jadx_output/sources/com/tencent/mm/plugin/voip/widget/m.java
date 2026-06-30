package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.n f177183d;

    public m(com.tencent.mm.plugin.voip.widget.n nVar) {
        this.f177183d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.ui.t0 Ai = gq4.v.Ai();
        java.lang.String a17 = this.f177183d.f177184d.a();
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = Ai.f176987a;
        if (voipViewFragment != null) {
            voipViewFragment.f(a17);
        }
    }
}
