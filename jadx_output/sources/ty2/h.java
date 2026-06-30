package ty2;

/* loaded from: classes9.dex */
public final class h extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f423067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f423109i, config);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(12.0f);
        textView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.f478520a84));
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f423067d = textView;
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        kotlin.jvm.internal.o.g(item, "item");
        if (item.X == 0) {
            return null;
        }
        android.widget.TextView textView = this.f423067d;
        textView.setText(item.hasFieldNumber(8) ? item.f31949n : "");
        return textView;
    }
}
