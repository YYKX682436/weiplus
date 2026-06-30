package wo2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.q f448112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wo2.q qVar) {
        super(0);
        this.f448112d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f448112d.f448115a.f343783f;
        kotlin.jvm.internal.o.d(view);
        int i17 = com.tencent.mm.R.id.nut;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.nut);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.nuw;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.nuw);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.nuz;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.nuz);
                if (weImageView != null) {
                    return new ap2.c((androidx.constraintlayout.widget.ConstraintLayout) view, imageView, textView, weImageView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }
}
