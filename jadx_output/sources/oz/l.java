package oz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final oz.l f350167d;

    /* renamed from: e, reason: collision with root package name */
    public static final oz.l f350168e;

    /* renamed from: f, reason: collision with root package name */
    public static final oz.l f350169f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ oz.l[] f350170g;

    static {
        oz.l lVar = new oz.l("DELETE", 0);
        f350167d = lVar;
        oz.l lVar2 = new oz.l("RUNNING", 1);
        f350168e = lVar2;
        oz.l lVar3 = new oz.l("SKIP", 2);
        f350169f = lVar3;
        oz.l[] lVarArr = {lVar, lVar2, lVar3};
        f350170g = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static oz.l valueOf(java.lang.String str) {
        return (oz.l) java.lang.Enum.valueOf(oz.l.class, str);
    }

    public static oz.l[] values() {
        return (oz.l[]) f350170g.clone();
    }
}
