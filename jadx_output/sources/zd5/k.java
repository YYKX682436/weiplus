package zd5;

/* loaded from: classes9.dex */
public abstract class k extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f471691d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f471692e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f471693f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f471694g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f471695h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f471696i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.View convertView) {
        super(convertView);
        kotlin.jvm.internal.o.g(convertView, "convertView");
        this.f471691d = convertView;
        android.view.View findViewById = convertView.findViewById(com.tencent.mm.R.id.gfx);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f471692e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = convertView.findViewById(com.tencent.mm.R.id.gfz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f471693f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = convertView.findViewById(com.tencent.mm.R.id.f485069gg0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f471694g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = convertView.findViewById(com.tencent.mm.R.id.gge);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f471695h = textView;
        android.view.View findViewById5 = convertView.findViewById(com.tencent.mm.R.id.gft);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f471696i = findViewById5;
        textView.setSingleLine(false);
        textView.setMaxLines(2);
    }

    public final void i(android.widget.TextView view, java.lang.String str) {
        kotlin.jvm.internal.o.g(view, "view");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        view.setText(o13.q.c(view.getContext(), view.getText(), str));
    }
}
