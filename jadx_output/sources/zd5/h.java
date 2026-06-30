package zd5;

/* loaded from: classes.dex */
public final class h extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f471687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.View convertView, android.content.Context context) {
        super(convertView);
        kotlin.jvm.internal.o.g(convertView, "convertView");
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View findViewById = convertView.findViewById(com.tencent.mm.R.id.gfy);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f471687d = textView;
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478873jj));
        android.view.View findViewById2 = convertView.findViewById(com.tencent.mm.R.id.gfp);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.view.View");
        findViewById2.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478869jf));
    }
}
