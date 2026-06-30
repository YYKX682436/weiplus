package df2;

/* loaded from: classes3.dex */
public final class p8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f231047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f231048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f231049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f231050g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f231051h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f231052i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f231053m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f231054n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(android.graphics.Bitmap bitmap, df2.s8 s8Var, android.text.SpannableString spannableString, int i17, int i18, android.widget.TextView textView, long j17, boolean z17) {
        super(0);
        this.f231047d = bitmap;
        this.f231048e = s8Var;
        this.f231049f = spannableString;
        this.f231050g = i17;
        this.f231051h = i18;
        this.f231052i = textView;
        this.f231053m = j17;
        this.f231054n = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), this.f231047d);
        df2.s8 s8Var = this.f231048e;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) s8Var.C1).getValue()).intValue(), ((java.lang.Number) ((jz5.n) s8Var.C1).getValue()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        java.lang.String str = s8Var.f231314x1;
        int length = str.length();
        int i17 = this.f231051h;
        android.text.SpannableString spannableString = this.f231049f;
        int i18 = this.f231050g;
        al5.w[] wVarArr = (al5.w[]) spannableString.getSpans(i18, length + i17, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                spannableString.removeSpan(wVar2);
            }
        }
        spannableString.setSpan(wVar, i18, i17 + str.length(), 33);
        android.widget.TextView textView = this.f231052i;
        textView.setText(spannableString);
        textView.invalidate();
        long j17 = this.f231053m;
        boolean z17 = this.f231054n;
        android.widget.TextView textView2 = s8Var.E;
        if (textView2 != null) {
            textView2.invalidate();
            textView2.post(new df2.p7(textView2, s8Var, j17, z17));
        }
        return jz5.f0.f302826a;
    }
}
