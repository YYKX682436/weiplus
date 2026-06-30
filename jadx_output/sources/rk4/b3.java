package rk4;

/* loaded from: classes11.dex */
public final class b3 implements qk.c8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396560a;

    public b3(rk4.l3 l3Var) {
        this.f396560a = l3Var;
    }

    @Override // qk.c8
    public void a() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f396560a.f396820h;
        if (eventSink != null) {
            eventSink.success(0);
        }
    }
}
