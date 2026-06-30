package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class j implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145884a;

    public j(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145884a = envelopeAppBarLayout;
    }

    @Override // gb3.i
    public void onComplete(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145884a;
            envelopeAppBarLayout.S.setVisibility(8);
            envelopeAppBarLayout.f145776b2 = true;
            envelopeAppBarLayout.q();
        }
    }
}
