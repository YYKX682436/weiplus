package cw1;

/* loaded from: classes12.dex */
public final class l5 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f223104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.n5 f223105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(cw1.n5 n5Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f223105e = n5Var;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.hh9);
        kotlin.jvm.internal.o.d(findViewById);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f223104d = textView;
        textView.setOnClickListener(new cw1.k5(this, n5Var.f223182e, n5Var));
    }
}
