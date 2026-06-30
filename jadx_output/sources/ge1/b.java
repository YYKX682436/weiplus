package ge1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ge1.b f270927d;

    /* renamed from: e, reason: collision with root package name */
    public static final ge1.b f270928e;

    /* renamed from: f, reason: collision with root package name */
    public static final ge1.b f270929f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ge1.b[] f270930g;

    static {
        ge1.b bVar = new ge1.b("IDLE", 0);
        f270927d = bVar;
        ge1.b bVar2 = new ge1.b(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_CONNECTING, 1);
        f270928e = bVar2;
        ge1.b bVar3 = new ge1.b("CONNECTED", 2);
        f270929f = bVar3;
        ge1.b[] bVarArr = {bVar, bVar2, bVar3};
        f270930g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static ge1.b valueOf(java.lang.String str) {
        return (ge1.b) java.lang.Enum.valueOf(ge1.b.class, str);
    }

    public static ge1.b[] values() {
        return (ge1.b[]) f270930g.clone();
    }
}
