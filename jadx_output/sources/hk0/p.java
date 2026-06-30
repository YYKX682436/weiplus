package hk0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final hk0.p f281786d;

    /* renamed from: e, reason: collision with root package name */
    public static final hk0.p f281787e;

    /* renamed from: f, reason: collision with root package name */
    public static final hk0.p f281788f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ hk0.p[] f281789g;

    static {
        hk0.p pVar = new hk0.p("ADD", 0);
        f281786d = pVar;
        hk0.p pVar2 = new hk0.p("REMOVE", 1);
        f281787e = pVar2;
        hk0.p pVar3 = new hk0.p("CONTENT_EDIT", 2);
        f281788f = pVar3;
        hk0.p[] pVarArr = {pVar, pVar2, pVar3};
        f281789g = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17) {
    }

    public static hk0.p valueOf(java.lang.String str) {
        return (hk0.p) java.lang.Enum.valueOf(hk0.p.class, str);
    }

    public static hk0.p[] values() {
        return (hk0.p[]) f281789g.clone();
    }
}
