package df2;

/* loaded from: classes3.dex */
public final class hw implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.kw f230357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gw1 f230358e;

    public hw(df2.kw kwVar, r45.gw1 gw1Var) {
        this.f230357d = kwVar;
        this.f230358e = gw1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f230357d.f230604n.remove(java.lang.Integer.valueOf(this.f230358e.getInteger(1)));
    }
}
