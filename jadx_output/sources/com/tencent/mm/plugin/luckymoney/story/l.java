package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.m f145888d;

    public l(com.tencent.mm.plugin.luckymoney.story.m mVar) {
        this.f145888d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior envelopeStoryBehavior = this.f145888d.f145894h.f145923d.B1;
        if (envelopeStoryBehavior != null) {
            envelopeStoryBehavior.P();
        }
    }
}
