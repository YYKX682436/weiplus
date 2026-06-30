package q23;

/* loaded from: classes.dex */
public final class h implements q23.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f359814a;

    public h(android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.egt, parent, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f359814a = (com.tencent.mm.ui.widget.imageview.WeImageView) ((android.view.ViewGroup) inflate).findViewById(com.tencent.mm.R.id.tzn);
    }

    @Override // q23.f
    public void a(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f359814a;
        kotlin.jvm.internal.o.d(weImageView);
        if (i17 == 2) {
            weImageView.s(com.tencent.mm.R.raw.livephoto_off_filled, com.tencent.mm.R.color.f478553an);
        } else if (i17 == 1) {
            weImageView.s(com.tencent.mm.R.raw.icons_filled_live_photo, com.tencent.mm.R.color.f478553an);
        } else if (i17 == 3) {
            weImageView.s(com.tencent.mm.R.raw.livephoto_off_filled, com.tencent.mm.R.color.UN_BW_0_Alpha_0_3);
        }
    }

    @Override // q23.f
    public void reset() {
    }
}
