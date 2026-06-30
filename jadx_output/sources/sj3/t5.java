package sj3;

/* loaded from: classes4.dex */
public final class t5 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f408750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.n0j);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f408750d = (android.widget.RelativeLayout) findViewById;
    }
}
