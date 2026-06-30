package yr3;

/* loaded from: classes11.dex */
public abstract class a extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.i f464715d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.l5 f464716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(outAdapter, "outAdapter");
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        this.f464715d = outAdapter;
        this.f464716e = baseInfo;
        setIsRecyclable(false);
    }

    public abstract void i(yr3.c cVar, int i17, wr3.n0 n0Var, boolean z17, int i18);
}
