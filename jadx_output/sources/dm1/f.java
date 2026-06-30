package dm1;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm1.m f241635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dm1.m mVar) {
        super(0);
        this.f241635d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dm1.m mVar = this.f241635d;
        android.view.ViewManager viewManager = mVar.f241647b;
        if (viewManager != null) {
            viewManager.removeView(mVar.f241648c);
        }
        mVar.f241647b = null;
        mVar.f241651f = null;
        mVar.f241648c = null;
        return jz5.f0.f302826a;
    }
}
