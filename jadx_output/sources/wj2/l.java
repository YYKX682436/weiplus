package wj2;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f446706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(wj2.w wVar, android.view.MotionEvent motionEvent) {
        super(0);
        this.f446705d = wVar;
        this.f446706e = motionEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wj2.w wVar = this.f446705d;
        wVar.E++;
        wVar.N(this.f446706e);
        return jz5.f0.f302826a;
    }
}
