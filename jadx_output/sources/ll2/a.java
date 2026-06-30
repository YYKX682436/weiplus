package ll2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final ll2.a f319124e;

    /* renamed from: f, reason: collision with root package name */
    public static final ll2.a f319125f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ll2.a[] f319126g;

    /* renamed from: d, reason: collision with root package name */
    public final int f319127d;

    static {
        ll2.a aVar = new ll2.a("EXPOSE", 0, 1);
        f319124e = aVar;
        ll2.a aVar2 = new ll2.a("CLICK", 1, 2);
        f319125f = aVar2;
        ll2.a[] aVarArr = {aVar, aVar2};
        f319126g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f319127d = i18;
    }

    public static ll2.a valueOf(java.lang.String str) {
        return (ll2.a) java.lang.Enum.valueOf(ll2.a.class, str);
    }

    public static ll2.a[] values() {
        return (ll2.a[]) f319126g.clone();
    }
}
