package cw1;

/* loaded from: classes12.dex */
public final class m5 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f223142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.n5 f223143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(cw1.n5 n5Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f223143e = n5Var;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.d(findViewById);
        this.f223142d = (android.widget.TextView) findViewById;
    }
}
