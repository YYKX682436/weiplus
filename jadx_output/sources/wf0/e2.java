package wf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class e2 {

    /* renamed from: d, reason: collision with root package name */
    public static final wf0.e2 f445503d;

    /* renamed from: e, reason: collision with root package name */
    public static final wf0.e2 f445504e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ wf0.e2[] f445505f;

    static {
        wf0.e2 e2Var = new wf0.e2("CDN", 0, 1L);
        f445503d = e2Var;
        wf0.e2 e2Var2 = new wf0.e2("CGI_PARALLEL", 1, 2L);
        f445504e = e2Var2;
        wf0.e2[] e2VarArr = {e2Var, e2Var2, new wf0.e2("CGI_Serial", 2, 3L)};
        f445505f = e2VarArr;
        rz5.b.a(e2VarArr);
    }

    public e2(java.lang.String str, int i17, long j17) {
    }

    public static wf0.e2 valueOf(java.lang.String str) {
        return (wf0.e2) java.lang.Enum.valueOf(wf0.e2.class, str);
    }

    public static wf0.e2[] values() {
        return (wf0.e2[]) f445505f.clone();
    }
}
