package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class u implements ym5.m3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145914d;

    public u(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145914d = envelopeAppBarLayout;
    }

    @Override // ym5.m3
    public void a(int i17, boolean z17, boolean z18) {
        boolean z19;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "on page change: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145914d;
        if (z17) {
            if (envelopeAppBarLayout.A1 == i17) {
                return;
            }
            envelopeAppBarLayout.j(false);
            envelopeAppBarLayout.A1 = i17;
            envelopeAppBarLayout.f145788w.setCurrentPosition(i17);
            in5.s0 s0Var = (in5.s0) envelopeAppBarLayout.f145788w.p0(i17);
            if (s0Var != null) {
                boolean h17 = envelopeAppBarLayout.f145788w.h1(envelopeAppBarLayout.A1);
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "[isVideoItem] onpage change: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(h17));
                com.tencent.mm.plugin.luckymoney.story.h0 h0Var = (com.tencent.mm.plugin.luckymoney.story.h0) s0Var.f293125i;
                if (h17) {
                    if (envelopeAppBarLayout.O1) {
                        envelopeAppBarLayout.f145788w.i1(2);
                    }
                    h0Var.a();
                } else {
                    if (envelopeAppBarLayout.O1) {
                        envelopeAppBarLayout.f145788w.i1(1);
                    }
                    com.tencent.mm.plugin.luckymoney.story.g1.f145864e++;
                }
                if (com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.c(h0Var.f145878g, h0Var.f145880i)) {
                    str = h0Var.f145880i;
                    z19 = true;
                } else {
                    z19 = false;
                    str = h0Var.f145875d.f384775e;
                }
                envelopeAppBarLayout.D1.h(envelopeAppBarLayout.getContext(), (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.j0c), (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.j09), (android.widget.ProgressBar) s0Var.p(com.tencent.mm.R.id.j0a), str, h0Var.f145875d.f384776f, h0Var.f145876e, h0Var.f145877f, i17, h17, z19, false);
                gb3.n.a(6);
            }
            com.tencent.mm.plugin.luckymoney.story.g1.f145861b++;
        }
        envelopeAppBarLayout.A.setCurrentIndex(i17);
    }
}
