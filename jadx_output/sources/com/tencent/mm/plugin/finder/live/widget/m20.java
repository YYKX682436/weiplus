package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class m20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f119026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var, boolean z17) {
        super(0);
        this.f119026d = e30Var;
        this.f119027e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.MMPAGView mMPAGView;
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f119026d;
        boolean z17 = this.f119027e;
        e30Var.E = z17;
        android.widget.ImageView imageView = e30Var.f118217v;
        if ((imageView.getAlpha() == 1.0f) && (mMPAGView = e30Var.f118218w) != null) {
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463316o));
            if (z17) {
                imageView.setVisibility(8);
                mMPAGView.setVisibility(0);
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(e30Var.f365323d.getContext(), com.tencent.mm.R.raw.icons_filled_applause, e30Var.G));
                if (!mMPAGView.f()) {
                    com.tencent.mm.plugin.finder.live.util.y.m(e30Var, null, null, new com.tencent.mm.plugin.finder.live.widget.k20(mMPAGView, null), 3, null);
                }
                pm0.v.V(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, new com.tencent.mm.plugin.finder.live.widget.l20(e30Var));
            } else {
                imageView.setVisibility(0);
                mMPAGView.setVisibility(8);
                mMPAGView.n();
                com.tencent.mm.plugin.finder.live.plugin.l lVar = e30Var.f118212q;
                com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = lVar instanceof com.tencent.mm.plugin.finder.live.plugin.ag0 ? (com.tencent.mm.plugin.finder.live.plugin.ag0) lVar : null;
                if (ag0Var != null) {
                    ag0Var.C1(true);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
