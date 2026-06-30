package pr3;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ProfileNormalItemView f357978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.profile.ui.ProfileNormalItemView profileNormalItemView) {
        super(1);
        this.f357978d = profileNormalItemView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context ctx = (android.content.Context) obj;
        kotlin.jvm.internal.o.g(ctx, "ctx");
        android.view.View inflate = android.view.LayoutInflater.from(ctx).inflate(com.tencent.mm.R.layout.elx, (android.view.ViewGroup) this.f357978d.f153784o, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMRoundCornerImageView");
        return (com.tencent.mm.ui.widget.MMRoundCornerImageView) inflate;
    }
}
