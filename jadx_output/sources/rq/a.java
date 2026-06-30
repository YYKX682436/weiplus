package rq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ rq.a[] f398711d;

    static {
        rq.a[] aVarArr = {new rq.a("START", 0), new rq.a("STEP", 1), new rq.a("SUCCESS", 2), new rq.a("FAIL", 3)};
        f398711d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static rq.a valueOf(java.lang.String str) {
        return (rq.a) java.lang.Enum.valueOf(rq.a.class, str);
    }

    public static rq.a[] values() {
        return (rq.a[]) f398711d.clone();
    }
}
