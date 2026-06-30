package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.v2[] f328147d;

    static {
        ml2.v2[] v2VarArr = {new ml2.v2("EXPOSE", 0, 1), new ml2.v2("CLICK", 1, 2), new ml2.v2("START", 2, 3), new ml2.v2(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_FINISH, 3, 4), new ml2.v2("CLOSE_CAMERA", 4, 5)};
        f328147d = v2VarArr;
        rz5.b.a(v2VarArr);
    }

    public v2(java.lang.String str, int i17, int i18) {
    }

    public static ml2.v2 valueOf(java.lang.String str) {
        return (ml2.v2) java.lang.Enum.valueOf(ml2.v2.class, str);
    }

    public static ml2.v2[] values() {
        return (ml2.v2[]) f328147d.clone();
    }
}
