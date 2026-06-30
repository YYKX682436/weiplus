package f16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final f16.l f258748d;

    /* renamed from: e, reason: collision with root package name */
    public static final f16.l f258749e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f16.l[] f258750f;

    static {
        f16.l lVar = new f16.l("READ_ONLY", 0);
        f258748d = lVar;
        f16.l lVar2 = new f16.l("MUTABLE", 1);
        f258749e = lVar2;
        f16.l[] lVarArr = {lVar, lVar2};
        f258750f = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static f16.l valueOf(java.lang.String str) {
        return (f16.l) java.lang.Enum.valueOf(f16.l.class, str);
    }

    public static f16.l[] values() {
        return (f16.l[]) f258750f.clone();
    }
}
