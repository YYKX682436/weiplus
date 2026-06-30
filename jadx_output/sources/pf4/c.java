package pf4;

/* loaded from: classes4.dex */
public final class c extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f353849d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f353850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pf4.e eVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f353849d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.kbq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f353850e = textView;
        pm0.v.c(textView);
    }
}
