package vu0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final vu0.v f440166d;

    /* renamed from: e, reason: collision with root package name */
    public static final vu0.w f440167e;

    /* renamed from: f, reason: collision with root package name */
    public static final vu0.w f440168f;

    /* renamed from: g, reason: collision with root package name */
    public static final vu0.w f440169g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vu0.w[] f440170h;

    static {
        vu0.w wVar = new vu0.w("CHANGING", 0);
        f440167e = wVar;
        vu0.w wVar2 = new vu0.w("IDLE", 1);
        f440168f = wVar2;
        vu0.w wVar3 = new vu0.w("FAILED", 2);
        f440169g = wVar3;
        vu0.w[] wVarArr = {wVar, wVar2, wVar3};
        f440170h = wVarArr;
        rz5.b.a(wVarArr);
        f440166d = new vu0.v(null);
    }

    public w(java.lang.String str, int i17) {
    }

    public static vu0.w valueOf(java.lang.String str) {
        return (vu0.w) java.lang.Enum.valueOf(vu0.w.class, str);
    }

    public static vu0.w[] values() {
        return (vu0.w[]) f440170h.clone();
    }
}
