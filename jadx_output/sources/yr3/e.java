package yr3;

/* loaded from: classes8.dex */
public final class e extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.i f464781d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f464782e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f464783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.view.View itemView, wr3.i outAdapter, int i17) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(outAdapter, "outAdapter");
        this.f464781d = outAdapter;
        this.f464782e = itemView.getContext();
        this.f464783f = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
    }
}
