package wb;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public wb.d f444345a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f444346b = new wb.j(this);

    public final void a(int i17) {
        android.os.Handler handler = this.f444346b;
        android.os.Message obtainMessage = handler.obtainMessage(100);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i17);
        obtainMessage.setData(bundle);
        handler.sendMessage(obtainMessage);
    }
}
