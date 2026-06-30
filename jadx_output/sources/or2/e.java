package or2;

/* loaded from: classes13.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or2.f f347620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Display.Mode f347621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Display.Mode f347622f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(or2.f fVar, android.view.Display.Mode mode, android.view.Display.Mode mode2) {
        super(1);
        this.f347620d = fVar;
        this.f347621e = mode;
        this.f347622f = mode2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent event = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(event, "event");
        event.getAction();
        or2.f fVar = this.f347620d;
        fVar.Q6(this.f347621e);
        jz5.g gVar = fVar.f347623d;
        ((android.os.Handler) gVar.getValue()).removeCallbacksAndMessages(null);
        jz5.g gVar2 = fVar.f347624e;
        ((or2.b) gVar2.getValue()).f347616d = this.f347622f;
        ((android.os.Handler) gVar.getValue()).postDelayed((or2.b) gVar2.getValue(), 2000L);
        return jz5.f0.f302826a;
    }
}
