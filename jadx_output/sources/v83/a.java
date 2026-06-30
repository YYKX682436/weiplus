package v83;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v83.a[] f434079d;

    static {
        v83.a[] aVarArr = {new v83.a("ExtDeviceLoginRet_Ok", 0, 0), new v83.a("ExtDeviceLoginRet_Error", 1, -1), new v83.a("ExtDeviceLoginRet_Expired", 2, -2), new v83.a("ExtDeviceLoginRet_UnSupportDev", 3, -3), new v83.a("ExtDeviceLoginRet_UnSupportApp", 4, -4), new v83.a("ExtDeviceLoginRet_UnSupportClient_CanUpdate", 5, -5), new v83.a("ExtDeviceLoginRet_UnSupportClient_NoUpdate", 6, -6), new v83.a("ExtDeviceLoginRet_Error_NeedNotify", 7, -7), new v83.a("ExtDeviceLoginRet_Error_AlbumBind", 8, 8), new v83.a("ExtDeviceLoginRet_Sapm", 9, -9)};
        f434079d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    public static v83.a valueOf(java.lang.String str) {
        return (v83.a) java.lang.Enum.valueOf(v83.a.class, str);
    }

    public static v83.a[] values() {
        return (v83.a[]) f434079d.clone();
    }
}
