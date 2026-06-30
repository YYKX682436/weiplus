package lr;

/* loaded from: classes13.dex */
public final class b extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f320495f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.b6o);
        this.f320495f = findViewById;
        itemView.setOnClickListener(null);
        findViewById.setOnClickListener(new lr.a(this));
        findViewById.setContentDescription(findViewById.getContext().getString(com.tencent.mm.R.string.aqo));
    }
}
