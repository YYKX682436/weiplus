package yu2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu2.f f465849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yu2.f fVar) {
        super(0);
        this.f465849d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f465849d.findViewById(com.tencent.mm.R.id.g3x);
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.g1u);
        if (textView == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(com.tencent.mm.R.id.g1u)));
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        return new vb2.j0(relativeLayout, textView, relativeLayout);
    }
}
