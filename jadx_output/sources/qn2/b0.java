package qn2;

/* loaded from: classes3.dex */
public final class b0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f365039d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f365040e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f365041f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f365042g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f365043h;

    /* renamed from: i, reason: collision with root package name */
    public final qn2.a0 f365044i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(qn2.c0 c0Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f365039d = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.a9m);
        this.f365040e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.kbf);
        this.f365041f = itemView.findViewById(com.tencent.mm.R.id.q6w);
        this.f365042g = itemView.findViewById(com.tencent.mm.R.id.q39);
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.q6y);
        this.f365043h = findViewById;
        kotlin.jvm.internal.o.d(findViewById);
        this.f365044i = new qn2.a0(findViewById);
    }
}
