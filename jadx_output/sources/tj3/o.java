package tj3;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f419781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tj3.p pVar) {
        super(0);
        this.f419781d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = new android.widget.TextView(this.f419781d.f419782a);
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        textView.setGravity(8388627);
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setTextSize(1, 17.0f);
        textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
        textView.setVisibility(4);
        return textView;
    }
}
