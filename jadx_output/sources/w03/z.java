package w03;

/* loaded from: classes8.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity f441921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity megaVideoFlutterActivity) {
        super(0);
        this.f441921d = megaVideoFlutterActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f441921d.getIntent().getBooleanExtra("showEnterAnimation", false));
    }
}
