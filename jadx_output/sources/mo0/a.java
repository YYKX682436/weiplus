package mo0;

/* loaded from: classes3.dex */
public final class a extends com.tencent.mm.ui.widget.RoundCornerRelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f330256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
        yz5.l lVar = this.f330256f;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.xlog.Log.i("FluentSwitchRelativeLayout", "onWindowVisibilityChanged visibility: " + i17 + " function: " + this.f330256f);
    }

    public final void setNotifyVisibilityFunction(yz5.l function) {
        kotlin.jvm.internal.o.g(function, "function");
        this.f330256f = function;
    }
}
