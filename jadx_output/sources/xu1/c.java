package xu1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final xu1.c f457190d;

    /* renamed from: e, reason: collision with root package name */
    public static final xu1.c f457191e;

    /* renamed from: f, reason: collision with root package name */
    public static final xu1.c f457192f;

    /* renamed from: g, reason: collision with root package name */
    public static final xu1.c f457193g;

    /* renamed from: h, reason: collision with root package name */
    public static final xu1.c f457194h;

    /* renamed from: i, reason: collision with root package name */
    public static final xu1.c f457195i;

    /* renamed from: m, reason: collision with root package name */
    public static final xu1.c f457196m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ xu1.c[] f457197n;

    static {
        xu1.c cVar = new xu1.c("DISCONNECTED", 0);
        f457190d = cVar;
        xu1.c cVar2 = new xu1.c(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_CONNECTING, 1);
        f457191e = cVar2;
        xu1.c cVar3 = new xu1.c("CONNECTED", 2);
        f457192f = cVar3;
        xu1.c cVar4 = new xu1.c(com.google.android.gms.iid.InstanceID.ERROR_TIMEOUT, 3);
        f457193g = cVar4;
        xu1.c cVar5 = new xu1.c("ERROR", 4);
        f457194h = cVar5;
        xu1.c cVar6 = new xu1.c("INIT_MEDIACODEC_FAILED", 5);
        f457195i = cVar6;
        xu1.c cVar7 = new xu1.c("REMOTE_SERVICE_REMOVED", 6);
        f457196m = cVar7;
        xu1.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f457197n = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static xu1.c valueOf(java.lang.String str) {
        return (xu1.c) java.lang.Enum.valueOf(xu1.c.class, str);
    }

    public static xu1.c[] values() {
        return (xu1.c[]) f457197n.clone();
    }
}
