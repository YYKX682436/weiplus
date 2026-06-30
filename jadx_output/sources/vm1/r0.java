package vm1;

/* loaded from: classes11.dex */
public final class r0 implements qk.c8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438048a;

    public r0(vm1.x0 x0Var) {
        this.f438048a = x0Var;
    }

    @Override // qk.c8
    public void a() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f438048a.f438071g;
        if (eventSink != null) {
            eventSink.success(0);
        }
    }
}
