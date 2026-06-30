package l20;

/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context) {
        super(0);
        this.f315150d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f315150d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        weImageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i65.a.h(context, com.tencent.mm.R.dimen.f479738dv), i65.a.h(context, com.tencent.mm.R.dimen.f479688cn)));
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_arrow);
        weImageView.setIconColor(context.getColor(com.tencent.mm.R.color.FG_1));
        return weImageView;
    }
}
