package on2;

/* loaded from: classes3.dex */
public final class x0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f347064d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f347065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(on2.y0 y0Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.bx8);
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 14.0f, 0.0f, 8, null);
        this.f347064d = textView;
        android.widget.TextView textView2 = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.bwv);
        android.content.Context context2 = textView2.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView2, 14.0f, 0.0f, 8, null);
        this.f347065e = textView2;
    }
}
