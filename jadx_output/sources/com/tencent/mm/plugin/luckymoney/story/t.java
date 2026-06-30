package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class t implements ym5.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.scaledLayout.b f145911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.HorizontalLayoutManager f145912b;

    public t(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout, com.tencent.mm.plugin.luckymoney.scaledLayout.b bVar, com.tencent.mm.plugin.luckymoney.ui.HorizontalLayoutManager horizontalLayoutManager) {
        this.f145911a = bVar;
        this.f145912b = horizontalLayoutManager;
    }

    @Override // ym5.n3
    public void a(android.view.MotionEvent motionEvent) {
    }

    @Override // ym5.n3
    public boolean b(int i17, android.view.MotionEvent motionEvent, boolean z17) {
        if (motionEvent.getAction() == 0) {
            com.tencent.mm.plugin.luckymoney.ui.HorizontalLayoutManager horizontalLayoutManager = this.f145912b;
            com.tencent.mm.plugin.luckymoney.scaledLayout.b bVar = this.f145911a;
            bVar.f145750f = bVar.n(horizontalLayoutManager);
        }
        return z17;
    }
}
