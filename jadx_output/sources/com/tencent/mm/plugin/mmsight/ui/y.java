package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f149445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.z f149446e;

    public y(com.tencent.mm.plugin.mmsight.ui.z zVar, boolean z17) {
        this.f149446e = zVar;
        this.f149445d = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MMSightRecordButton", "call onProgressFinish", new java.lang.Object[0]);
        com.tencent.mm.plugin.mmsight.ui.z zVar = this.f149446e;
        zVar.f149452b.f149199i = false;
        com.tencent.mm.plugin.mmsight.ui.x xVar = zVar.f149451a;
        if (xVar != null) {
            xVar.a(this.f149445d);
        }
    }
}
