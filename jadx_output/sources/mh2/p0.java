package mh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final mh2.p0 f326435d;

    /* renamed from: e, reason: collision with root package name */
    public static final mh2.p0 f326436e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mh2.p0[] f326437f;

    static {
        mh2.p0 p0Var = new mh2.p0("GOOD", 0);
        f326435d = p0Var;
        mh2.p0 p0Var2 = new mh2.p0("PERFECT", 1);
        f326436e = p0Var2;
        mh2.p0[] p0VarArr = {p0Var, p0Var2};
        f326437f = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    public static mh2.p0 valueOf(java.lang.String str) {
        return (mh2.p0) java.lang.Enum.valueOf(mh2.p0.class, str);
    }

    public static mh2.p0[] values() {
        return (mh2.p0[]) f326437f.clone();
    }
}
