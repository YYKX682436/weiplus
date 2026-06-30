package qp2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.i f365783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qp2.i iVar) {
        super(0);
        this.f365783d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f365783d.f365784a.f343783f;
        kotlin.jvm.internal.o.d(view);
        int i17 = com.tencent.mm.R.id.nut;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.nut);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.nuw;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.nuw);
            if (textView != null) {
                return new ap2.d((androidx.constraintlayout.widget.ConstraintLayout) view, imageView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }
}
