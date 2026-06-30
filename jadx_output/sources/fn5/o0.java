package fn5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final fn5.o0 f264743d;

    /* renamed from: e, reason: collision with root package name */
    public static final fn5.o0 f264744e;

    /* renamed from: f, reason: collision with root package name */
    public static final fn5.o0 f264745f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fn5.o0[] f264746g;

    static {
        fn5.o0 o0Var = new fn5.o0(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        fn5.o0 o0Var2 = new fn5.o0("NO_START", 1);
        f264743d = o0Var2;
        fn5.o0 o0Var3 = new fn5.o0("START", 2);
        f264744e = o0Var3;
        fn5.o0 o0Var4 = new fn5.o0("STOP", 3);
        f264745f = o0Var4;
        fn5.o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4};
        f264746g = o0VarArr;
        rz5.b.a(o0VarArr);
    }

    public o0(java.lang.String str, int i17) {
    }

    public static fn5.o0 valueOf(java.lang.String str) {
        return (fn5.o0) java.lang.Enum.valueOf(fn5.o0.class, str);
    }

    public static fn5.o0[] values() {
        return (fn5.o0[]) f264746g.clone();
    }
}
