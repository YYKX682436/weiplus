package df2;

/* loaded from: classes3.dex */
public final class q8 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f231138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f231139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f231140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f231142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f231143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f231144g;

    public q8(df2.s8 s8Var, android.text.SpannableString spannableString, int i17, int i18, android.widget.TextView textView, long j17, boolean z17) {
        this.f231138a = s8Var;
        this.f231139b = spannableString;
        this.f231140c = i17;
        this.f231141d = i18;
        this.f231142e = textView;
        this.f231143f = j17;
        this.f231144g = z17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new df2.p8(bitmap, this.f231138a, this.f231139b, this.f231140c, this.f231141d, this.f231142e, this.f231143f, this.f231144g));
        } else {
            com.tencent.mars.xlog.Log.i(this.f231138a.f231299m, "resource is null!");
        }
    }
}
