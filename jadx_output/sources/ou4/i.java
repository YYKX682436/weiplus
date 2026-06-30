package ou4;

/* loaded from: classes8.dex */
public final class i implements ou4.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel.Result f348982a;

    public i(io.flutter.plugin.common.MethodChannel.Result result) {
        this.f348982a = result;
    }

    @Override // ou4.b0
    public void a(java.util.Map map) {
        this.f348982a.success(map);
    }

    @Override // ou4.b0
    public void b(java.lang.String code, java.lang.String message) {
        kotlin.jvm.internal.o.g(code, "code");
        kotlin.jvm.internal.o.g(message, "message");
        this.f348982a.error(code, message, null);
    }
}
