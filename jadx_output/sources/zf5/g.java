package zf5;

/* loaded from: classes5.dex */
public class g extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f472714m;

    public g(android.content.Context context) {
        super(context);
        f();
    }

    @Override // s35.b
    public void a() {
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.f488434t7;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        if (view != null) {
            this.f472714m = view.findViewById(com.tencent.mm.R.id.kh7);
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.g_u)).setText(((android.content.Context) this.f402842g.get()).getString(com.tencent.mm.R.string.b1q));
        }
    }
}
