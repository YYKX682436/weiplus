package r2;

/* loaded from: classes14.dex */
public final class h0 extends r2.o {
    public yz5.l A;
    public yz5.l B;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f368717z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.content.Context context, n0.g1 g1Var, o1.e dispatcher) {
        super(context, g1Var, dispatcher);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        int i17 = r2.f0.f368711a;
        this.B = r2.e0.f368708d;
    }

    public final yz5.l getFactory() {
        return this.A;
    }

    public androidx.compose.ui.platform.AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final android.view.View getTypedView$ui_release() {
        return this.f368717z;
    }

    public final yz5.l getUpdateBlock() {
        return this.B;
    }

    public android.view.View getViewRoot() {
        return this;
    }

    public final void setFactory(yz5.l lVar) {
        this.A = lVar;
        if (lVar != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "context");
            android.view.View view = (android.view.View) lVar.invoke(context);
            this.f368717z = view;
            setView$ui_release(view);
        }
    }

    public final void setTypedView$ui_release(android.view.View view) {
        this.f368717z = view;
    }

    public final void setUpdateBlock(yz5.l value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.B = value;
        setUpdate(new r2.g0(this));
    }
}
