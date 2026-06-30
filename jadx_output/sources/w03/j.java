package w03;

/* loaded from: classes11.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity f441885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity mMFlutterViewActivity) {
        super(0);
        this.f441885d = mMFlutterViewActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Integer num;
        com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity mMFlutterViewActivity = this.f441885d;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(mMFlutterViewActivity);
        android.content.res.Resources resources = mMFlutterViewActivity.getResources();
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = mMFlutterViewActivity.f137309g;
        frameLayout.setBackgroundColor(resources.getColor((flutterPageStyle == null || (num = flutterPageStyle.f68128r) == null) ? com.tencent.mm.R.color.a08 : num.intValue()));
        return frameLayout;
    }
}
