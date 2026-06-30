package fa3;

/* loaded from: classes8.dex */
public final class n implements com.tencent.mm.plugin.lite.api.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f260772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel.Result f260773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa3.p f260774c;

    public n(kotlin.jvm.internal.c0 c0Var, io.flutter.plugin.common.MethodChannel.Result result, fa3.p pVar) {
        this.f260772a = c0Var;
        this.f260773b = result;
        this.f260774c = pVar;
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void a(java.util.Map map) {
        kotlin.jvm.internal.c0 c0Var = this.f260772a;
        if (c0Var.f310112d) {
            return;
        }
        this.f260773b.success(map);
        c0Var.f310112d = true;
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void b(java.util.Map map) {
        kotlin.jvm.internal.c0 c0Var = this.f260772a;
        if (c0Var.f310112d) {
            return;
        }
        this.f260773b.success(map);
        c0Var.f310112d = true;
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void c(java.util.Map map) {
        kotlin.jvm.internal.c0 c0Var = this.f260772a;
        if (c0Var.f310112d) {
            return;
        }
        this.f260773b.success(map);
        c0Var.f310112d = true;
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void d(java.util.Map map) {
        kotlin.jvm.internal.c0 c0Var = this.f260772a;
        if (c0Var.f310112d) {
            return;
        }
        this.f260773b.success(map);
        c0Var.f310112d = true;
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void e(java.util.Map map) {
        io.flutter.plugin.common.MethodChannel methodChannel;
        if (map != null && map.containsKey("timeout") && (methodChannel = this.f260774c.f260782m) != null) {
            methodChannel.invokeMethod("recordTimeoutEvent", map);
        }
        kotlin.jvm.internal.c0 c0Var = this.f260772a;
        if (c0Var.f310112d) {
            return;
        }
        this.f260773b.success(map);
        c0Var.f310112d = true;
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void f(java.util.Map map) {
    }
}
