package w03;

/* loaded from: classes11.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity f441884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity mMFlutterViewActivity) {
        super(0);
        this.f441884d = mMFlutterViewActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tencent.mm.flutter.ui.FlutterPageStyle) this.f441884d.getIntent().getParcelableExtra("page_style");
    }
}
