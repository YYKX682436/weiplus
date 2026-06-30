package q16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final q16.a f359697f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q16.a[] f359698g;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f359699d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f359700e;

    static {
        q16.a aVar = new q16.a("NO_ARGUMENTS", 0, false, false, 3, null);
        f359697f = aVar;
        q16.a[] aVarArr = {aVar, new q16.a("UNLESS_EMPTY", 1, true, false, 2, null), new q16.a("ALWAYS_PARENTHESIZED", 2, true, true)};
        f359698g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, boolean z17, boolean z18) {
        this.f359699d = z17;
        this.f359700e = z18;
    }

    public static q16.a valueOf(java.lang.String str) {
        return (q16.a) java.lang.Enum.valueOf(q16.a.class, str);
    }

    public static q16.a[] values() {
        return (q16.a[]) f359698g.clone();
    }

    public /* synthetic */ a(java.lang.String str, int i17, boolean z17, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i18 & 1) != 0 ? false : z17, (i18 & 2) != 0 ? false : z18);
    }
}
