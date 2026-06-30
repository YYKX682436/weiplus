package td1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final td1.j f417605e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ td1.k[] f417606f;

    /* renamed from: d, reason: collision with root package name */
    public final int f417607d;

    static {
        td1.k[] kVarArr = {new td1.k("REMOVE_FROM_RECENT_USAGE_LIST", 0, 0), new td1.k("ADD_TO_MY_COLLECTION", 1, 1), new td1.k("REMOVE_FROM_MY_COLLECTION", 2, 2)};
        f417606f = kVarArr;
        rz5.b.a(kVarArr);
        f417605e = new td1.j(null);
    }

    public k(java.lang.String str, int i17, int i18) {
        this.f417607d = i18;
    }

    public static td1.k valueOf(java.lang.String str) {
        return (td1.k) java.lang.Enum.valueOf(td1.k.class, str);
    }

    public static td1.k[] values() {
        return (td1.k[]) f417606f.clone();
    }
}
