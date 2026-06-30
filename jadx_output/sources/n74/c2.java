package n74;

/* loaded from: classes4.dex */
public class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f335315a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundedCornerFrameLayout f335316b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f335317c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f335318d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f335319e;

    /* renamed from: f, reason: collision with root package name */
    public s34.b1 f335320f;

    /* renamed from: g, reason: collision with root package name */
    public final w64.n f335321g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f335322h;

    public c2(android.content.Context context, int i17, i64.b1 b1Var, com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout, w64.l lVar) {
        n74.b2 b2Var = new n74.b2(this);
        this.f335315a = context;
        this.f335316b = roundedCornerFrameLayout;
        this.f335317c = (android.widget.ImageView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.n5w);
        this.f335318d = (android.widget.ImageView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.n5y);
        this.f335319e = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.n5z);
        roundedCornerFrameLayout.setOnClickListener(b2Var);
        this.f335321g = new w64.n(context, i17, b1Var, null, lVar);
    }
}
