package h12;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final h12.l f278099d;

    /* renamed from: e, reason: collision with root package name */
    public static final h12.l f278100e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h12.l[] f278101f;

    static {
        h12.l lVar = new h12.l("EMOJI", 0);
        f278099d = lVar;
        h12.l lVar2 = new h12.l("WORD", 1);
        f278100e = lVar2;
        h12.l[] lVarArr = {lVar, lVar2};
        f278101f = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static h12.l valueOf(java.lang.String str) {
        return (h12.l) java.lang.Enum.valueOf(h12.l.class, str);
    }

    public static h12.l[] values() {
        return (h12.l[]) f278101f.clone();
    }
}
