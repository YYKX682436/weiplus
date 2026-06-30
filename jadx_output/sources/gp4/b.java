package gp4;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f274392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ju3.d0 d0Var) {
        super(1);
        this.f274392d = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.KeyEvent.Callback callback = (android.view.View) obj;
        if (callback instanceof cw3.s) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_DELETE_VIEW_TYPE_INT", ((cw3.s) callback).getType().ordinal());
            this.f274392d.w(ju3.c0.D1, bundle);
        }
        return jz5.f0.f302826a;
    }
}
