package qi4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final qi4.q f363782e;

    /* renamed from: f, reason: collision with root package name */
    public static final qi4.q f363783f;

    /* renamed from: g, reason: collision with root package name */
    public static final qi4.q f363784g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qi4.q[] f363785h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f363786d;

    static {
        qi4.q qVar = new qi4.q("NOT_START", 0, "not_start");
        f363782e = qVar;
        qi4.q qVar2 = new qi4.q("LOADING", 1, "loading");
        f363783f = qVar2;
        qi4.q qVar3 = new qi4.q(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_FINISH, 2, "finish");
        f363784g = qVar3;
        qi4.q[] qVarArr = {qVar, qVar2, qVar3};
        f363785h = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17, java.lang.String str2) {
        this.f363786d = str2;
    }

    public static qi4.q valueOf(java.lang.String str) {
        return (qi4.q) java.lang.Enum.valueOf(qi4.q.class, str);
    }

    public static qi4.q[] values() {
        return (qi4.q[]) f363785h.clone();
    }
}
