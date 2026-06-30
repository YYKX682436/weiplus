package v11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final v11.n0 f432445d;

    /* renamed from: e, reason: collision with root package name */
    public static final v11.n0 f432446e;

    /* renamed from: f, reason: collision with root package name */
    public static final v11.n0 f432447f;

    /* renamed from: g, reason: collision with root package name */
    public static final v11.n0 f432448g;

    /* renamed from: h, reason: collision with root package name */
    public static final v11.n0 f432449h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ v11.n0[] f432450i;

    static {
        v11.n0 n0Var = new v11.n0("NONE", 0);
        f432445d = n0Var;
        v11.n0 n0Var2 = new v11.n0(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_CONNECTING, 1);
        f432446e = n0Var2;
        v11.n0 n0Var3 = new v11.n0("THINKING", 2);
        f432447f = n0Var3;
        v11.n0 n0Var4 = new v11.n0("RESULT_STREAMING", 3);
        f432448g = n0Var4;
        v11.n0 n0Var5 = new v11.n0("COMPLETE", 4);
        f432449h = n0Var5;
        v11.n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4, n0Var5};
        f432450i = n0VarArr;
        rz5.b.a(n0VarArr);
    }

    public n0(java.lang.String str, int i17) {
    }

    public static v11.n0 valueOf(java.lang.String str) {
        return (v11.n0) java.lang.Enum.valueOf(v11.n0.class, str);
    }

    public static v11.n0[] values() {
        return (v11.n0[]) f432450i.clone();
    }
}
