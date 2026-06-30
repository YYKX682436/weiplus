package dd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ dd.v[] f228895d;

    static {
        dd.v[] vVarArr = {new dd.v("WalletAreaChangeInvokeSceneUnknown", 0, 0), new dd.v("WalletAreaChangeInvokeSceneCashierAppPay", 1, 1), new dd.v("WalletAreaChangeInvokeSceneCashierJsapiPay", 2, 2), new dd.v("WalletAreaChangeInvokeSceneOfflinePay", 3, 3), new dd.v("WalletAreaChangeInvokeSceneCashierTinyAppPay", 4, 4), new dd.v("WalletAreaChangeInvokeSceneCashierNativePay", 5, 5), new dd.v("WalletAreaChangeInvokeSceneCashierH5Pay", 6, 6)};
        f228895d = vVarArr;
        rz5.b.a(vVarArr);
    }

    public v(java.lang.String str, int i17, int i18) {
    }

    public static dd.v valueOf(java.lang.String str) {
        return (dd.v) java.lang.Enum.valueOf(dd.v.class, str);
    }

    public static dd.v[] values() {
        return (dd.v[]) f228895d.clone();
    }
}
