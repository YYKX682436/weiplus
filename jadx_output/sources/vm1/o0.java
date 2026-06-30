package vm1;

/* loaded from: classes11.dex */
public final class o0 implements qk.c8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438040a;

    public o0(vm1.x0 x0Var) {
        this.f438040a = x0Var;
    }

    @Override // qk.c8
    public void a() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f438040a.f438071g;
        if (eventSink != null) {
            eventSink.success(0);
        }
    }
}
