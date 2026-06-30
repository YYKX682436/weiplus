package wn;

/* loaded from: classes10.dex */
public abstract class a extends androidx.recyclerview.widget.f2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f447368d;

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        yz5.a aVar;
        if (!z(str, w0Var) || (aVar = this.f447368d) == null) {
            return;
        }
        aVar.invoke();
    }

    public abstract java.util.List x();

    public abstract void y(boolean z17, java.util.List list);

    public abstract boolean z(java.lang.String str, l75.w0 w0Var);
}
