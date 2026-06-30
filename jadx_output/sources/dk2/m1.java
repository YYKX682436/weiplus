package dk2;

/* loaded from: classes3.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(dk2.r4 r4Var) {
        super(0);
        this.f233746d = r4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context M = this.f233746d.M();
        android.app.Activity activity = M instanceof android.app.Activity ? (android.app.Activity) M : null;
        if (activity != null) {
            activity.finish();
        }
        return jz5.f0.f302826a;
    }
}
