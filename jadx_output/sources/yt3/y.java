package yt3;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.z f465721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yt3.z zVar) {
        super(1);
        this.f465721d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.KeyEvent.Callback callback = (android.view.View) obj;
        if (callback instanceof cw3.s) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_DELETE_VIEW_TYPE_INT", ((cw3.s) callback).getType().ordinal());
            this.f465721d.f465733e.w(ju3.c0.D1, bundle);
        }
        return jz5.f0.f302826a;
    }
}
