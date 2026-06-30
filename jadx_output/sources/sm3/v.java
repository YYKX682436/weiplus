package sm3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final sm3.v f409911d;

    /* renamed from: e, reason: collision with root package name */
    public static final sm3.v f409912e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ sm3.v[] f409913f;

    static {
        sm3.v vVar = new sm3.v("MOVE", 0);
        f409911d = vVar;
        sm3.v vVar2 = new sm3.v("END", 1);
        f409912e = vVar2;
        sm3.v[] vVarArr = {vVar, vVar2};
        f409913f = vVarArr;
        rz5.b.a(vVarArr);
    }

    public v(java.lang.String str, int i17) {
    }

    public static sm3.v valueOf(java.lang.String str) {
        return (sm3.v) java.lang.Enum.valueOf(sm3.v.class, str);
    }

    public static sm3.v[] values() {
        return (sm3.v[]) f409913f.clone();
    }
}
