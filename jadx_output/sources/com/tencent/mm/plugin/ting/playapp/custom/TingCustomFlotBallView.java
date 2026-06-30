package com.tencent.mm.plugin.ting.playapp.custom;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0014J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/ting/playapp/custom/TingCustomFlotBallView;", "Landroid/widget/FrameLayout;", "Lbl4/a;", "Landroid/view/View$OnClickListener;", "clickListener", "Ljz5/f0;", "setOnCoverClickListener", "", "h", "Ljz5/g;", "getWaveSize", "()I", "waveSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class TingCustomFlotBallView extends android.widget.FrameLayout implements bl4.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f174718i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f174719d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f174720e;

    /* renamed from: f, reason: collision with root package name */
    public bl4.b f174721f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f174722g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g waveSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingCustomFlotBallView(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getWaveSize() {
        return ((java.lang.Number) ((jz5.n) this.waveSize).getValue()).intValue();
    }

    @Override // bl4.a
    public void a(bl4.b bVar) {
        java.lang.String str;
        bl4.b bVar2 = this.f174721f;
        boolean a17 = bVar2 != null ? bVar2.a(bVar) : false;
        this.f174721f = bVar;
        java.lang.String str2 = bVar != null ? bVar.f21735d : null;
        boolean z17 = true;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f174719d;
            if (mMRoundCornerImageView != null) {
                mMRoundCornerImageView.setContentDescription(getResources().getString(com.tencent.mm.R.string.n2d));
            }
        } else {
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView2 = this.f174719d;
            if (mMRoundCornerImageView2 != null) {
                java.lang.String string = getResources().getString(com.tencent.mm.R.string.lfz);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (bVar == null || (str = bVar.f21735d) == null) {
                    str = "";
                }
                objArr[0] = str;
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                mMRoundCornerImageView2.setContentDescription(format);
            }
        }
        bl4.b bVar3 = this.f174721f;
        if (bVar3 != null) {
            java.lang.String str3 = bVar3.f21736e;
            boolean z18 = !a17;
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelFloatBallView", "updateFloatBallCover resetCover: " + z18 + ", %s", str3);
            if (str3 != null && str3.length() != 0) {
                z17 = false;
            }
            if (z17) {
                this.f174722g = "";
                com.tencent.mars.xlog.Log.e("MicroMsg.TingRadioChannelFloatBallView", "onLoadCoverFailed");
                pm0.v.X(new wl4.j(this));
            } else {
                if (kotlin.jvm.internal.o.b(str3, this.f174722g)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TingRadioChannelFloatBallView", "updateFloatBallCover the same ignore");
                    return;
                }
                this.f174722g = str3;
                ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).aj(str3, this.f174719d, z18 ? ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ui() : 0, new wl4.k(this));
            }
        }
    }

    @Override // bl4.a
    public void setOnCoverClickListener(android.view.View.OnClickListener onClickListener) {
        this.f174720e = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingCustomFlotBallView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingCustomFlotBallView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174722g = "";
        this.waveSize = jz5.h.b(new wl4.l(this));
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dxb, this).findViewById(com.tencent.mm.R.id.s1m);
        this.f174719d = mMRoundCornerImageView;
        if (mMRoundCornerImageView != null) {
            mMRoundCornerImageView.setVisibility(0);
        }
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView2 = this.f174719d;
        if (mMRoundCornerImageView2 != null) {
            mMRoundCornerImageView2.setOnClickListener(new wl4.i(this));
        }
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr);
        ((ov.p0) j0Var).getClass();
        int a17 = qp1.e0.a(dimensionPixelSize);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView3 = this.f174719d;
        java.lang.Integer num = 0;
        if (mMRoundCornerImageView3 == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = mMRoundCornerImageView3.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = a17;
            layoutParams.height = a17;
            if (num != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                int intValue = num.intValue();
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins(intValue, intValue, intValue, intValue);
            }
        } else {
            layoutParams = null;
        }
        mMRoundCornerImageView3.setLayoutParams(layoutParams);
    }
}
