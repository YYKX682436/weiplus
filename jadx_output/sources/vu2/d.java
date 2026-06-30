package vu2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final vu2.d f440208d;

    /* renamed from: e, reason: collision with root package name */
    public static final vu2.d f440209e;

    /* renamed from: f, reason: collision with root package name */
    public static final vu2.d f440210f;

    /* renamed from: g, reason: collision with root package name */
    public static final vu2.d f440211g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vu2.d[] f440212h;

    static {
        vu2.d dVar = new vu2.d(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f440208d = dVar;
        vu2.d dVar2 = new vu2.d("LOADING", 1);
        f440209e = dVar2;
        vu2.d dVar3 = new vu2.d("LOADED", 2);
        f440210f = dVar3;
        vu2.d dVar4 = new vu2.d("FAILURE", 3);
        f440211g = dVar4;
        vu2.d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f440212h = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static vu2.d valueOf(java.lang.String str) {
        return (vu2.d) java.lang.Enum.valueOf(vu2.d.class, str);
    }

    public static vu2.d[] values() {
        return (vu2.d[]) f440212h.clone();
    }
}
