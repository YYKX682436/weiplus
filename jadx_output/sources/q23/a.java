package q23;

/* loaded from: classes.dex */
public final class a implements q23.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f359807a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f359808b;

    public a(android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.egs, parent, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f359807a = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.scj);
        this.f359808b = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.scd);
    }

    @Override // q23.f
    public void a(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f359808b;
        kotlin.jvm.internal.o.d(weImageView);
        if (i17 == 2) {
            weImageView.s(com.tencent.mm.R.raw.livephoto_off_filled, com.tencent.mm.R.color.f478553an);
        } else {
            if (i17 == 0 || i17 == 1) {
                weImageView.s(com.tencent.mm.R.raw.icons_filled_live_photo, com.tencent.mm.R.color.f478553an);
            } else if (i17 == 3) {
                weImageView.s(com.tencent.mm.R.raw.livephoto_off_filled, com.tencent.mm.R.color.abx);
            }
        }
        android.view.ViewGroup viewGroup = this.f359807a;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (viewGroup != null) {
            viewGroup.setBackground(null);
        }
        if (i17 == 0) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setEnabled(false);
        } else if (i17 == 1) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setEnabled(true);
        } else if (i17 == 2) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setEnabled(true);
        } else {
            if (i17 != 3 || viewGroup == null) {
                return;
            }
            viewGroup.setEnabled(false);
        }
    }

    @Override // q23.f
    public void reset() {
        android.view.ViewGroup viewGroup = this.f359807a;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
