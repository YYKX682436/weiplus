package ox5;

/* loaded from: classes15.dex */
public class i implements io.flutter.plugin.common.MethodChannel.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox5.a f349815a;

    public i(ox5.a aVar) {
        this.f349815a = aVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() error. s:%s s1:%s", str, str2);
        ox5.a aVar = this.f349815a;
        if (aVar.f349794c.m42getActivity() != null) {
            aVar.f349794c.m42getActivity().finish();
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() notImplemented.", new java.lang.Object[0]);
        ox5.a aVar = this.f349815a;
        if (aVar.f349794c.m42getActivity() != null) {
            aVar.f349794c.m42getActivity().finish();
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(java.lang.Object obj) {
        if (obj != null && (obj instanceof java.lang.Boolean) && ((java.lang.Boolean) obj).booleanValue()) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() back press comsumed .", new java.lang.Object[0]);
            return;
        }
        ox5.a aVar = this.f349815a;
        if (aVar.f349794c.m42getActivity() != null) {
            ox5.l lVar = aVar.f349794c;
            if (lVar instanceof android.view.View) {
                return;
            }
            lVar.m42getActivity().finish();
        }
    }
}
