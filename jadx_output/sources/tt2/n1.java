package tt2;

/* loaded from: classes3.dex */
public final class n1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f421969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt2.o1 f421970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(tt2.o1 o1Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f421970e = o1Var;
        this.f421969d = itemView;
    }

    public final java.lang.String i(r45.z80 z80Var, boolean z17) {
        if (z17) {
            java.lang.String string = z80Var.getString(4);
            if (!(string == null || string.length() == 0)) {
                return z80Var.getString(4);
            }
        }
        return z80Var.getString(1);
    }
}
