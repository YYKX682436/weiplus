package jb1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final jb1.e0 f298710d;

    /* renamed from: e, reason: collision with root package name */
    public static final jb1.e0 f298711e;

    /* renamed from: f, reason: collision with root package name */
    public static final jb1.e0 f298712f;

    /* renamed from: g, reason: collision with root package name */
    public static final jb1.e0 f298713g;

    /* renamed from: h, reason: collision with root package name */
    public static final jb1.e0 f298714h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ jb1.e0[] f298715i;

    static {
        jb1.e0 e0Var = new jb1.e0(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f298710d = e0Var;
        jb1.e0 e0Var2 = new jb1.e0("CREATED", 1);
        f298711e = e0Var2;
        jb1.e0 e0Var3 = new jb1.e0("CONNECTED", 2);
        f298712f = e0Var3;
        jb1.e0 e0Var4 = new jb1.e0("DESTROYED", 3);
        f298713g = e0Var4;
        jb1.e0 e0Var5 = new jb1.e0("TROUBLESOME", 4);
        f298714h = e0Var5;
        jb1.e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4, e0Var5};
        f298715i = e0VarArr;
        rz5.b.a(e0VarArr);
    }

    public e0(java.lang.String str, int i17) {
    }

    public static jb1.e0 valueOf(java.lang.String str) {
        return (jb1.e0) java.lang.Enum.valueOf(jb1.e0.class, str);
    }

    public static jb1.e0[] values() {
        return (jb1.e0[]) f298715i.clone();
    }
}
