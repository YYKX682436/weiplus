package i22;

/* loaded from: classes15.dex */
public abstract class m extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final i22.o0 f288002d;

    /* renamed from: e, reason: collision with root package name */
    public i22.n0 f288003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.View itemView, i22.o0 o0Var) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f288002d = o0Var;
        itemView.setOnClickListener(new i22.l(this));
    }

    public void i(i22.n0 item, java.util.List payloads) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        this.f288003e = item;
    }
}
