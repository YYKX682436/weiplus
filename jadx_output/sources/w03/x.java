package w03;

/* loaded from: classes8.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity f441919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity megaVideoFlutterActivity) {
        super(0);
        this.f441919d = megaVideoFlutterActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f441919d.getIntent().getBooleanExtra("is_force_land_scape", false));
    }
}
