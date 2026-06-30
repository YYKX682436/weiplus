package fi2;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f262910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f262911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fi2.w f262912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, android.widget.TextView textView, fi2.w wVar) {
        super(0);
        this.f262910d = i17;
        this.f262911e = textView;
        this.f262912f = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = this.f262911e;
        int i17 = this.f262910d;
        if (i17 <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.f262912f.f262915a.f365323d.getContext().getString(com.tencent.mm.R.string.orn, java.lang.Integer.valueOf(i17)));
        }
        return jz5.f0.f302826a;
    }
}
