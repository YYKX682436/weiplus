package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class ij extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f132308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRedDotTextView f132309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f132310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(boolean z17, com.tencent.mm.plugin.finder.view.FinderRedDotTextView finderRedDotTextView, int i17) {
        super(0);
        this.f132308d = z17;
        this.f132309e = finderRedDotTextView;
        this.f132310f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f132308d;
        com.tencent.mm.plugin.finder.view.FinderRedDotTextView finderRedDotTextView = this.f132309e;
        if (z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderRedDotTextView.f131450m;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("highLightIcon");
                throw null;
            }
            weImageView.setIconColor(this.f132310f);
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = finderRedDotTextView.f131450m;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("highLightIcon");
                throw null;
            }
            weImageView2.setVisibility(4);
        }
        return jz5.f0.f302826a;
    }
}
