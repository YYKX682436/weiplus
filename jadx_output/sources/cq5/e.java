package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.e f221521e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.e f221522f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cq5.e[] f221523g;

    /* renamed from: d, reason: collision with root package name */
    public final int f221524d;

    static {
        cq5.e eVar = new cq5.e(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_CONNECTING, 0, 1);
        f221521e = eVar;
        cq5.e eVar2 = new cq5.e("TRANSMITTING", 1, 2);
        f221522f = eVar2;
        cq5.e[] eVarArr = {eVar, eVar2};
        f221523g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f221524d = i18;
    }

    public static cq5.e valueOf(java.lang.String str) {
        return (cq5.e) java.lang.Enum.valueOf(cq5.e.class, str);
    }

    public static cq5.e[] values() {
        return (cq5.e[]) f221523g.clone();
    }
}
