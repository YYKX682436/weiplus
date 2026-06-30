package ed2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final ed2.a f251252d;

    /* renamed from: e, reason: collision with root package name */
    public static final ed2.a f251253e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ed2.a[] f251254f;

    static {
        ed2.a aVar = new ed2.a("BUBBLE_TIPS_KEY_AUTO_SCROLL", 0);
        f251252d = aVar;
        ed2.a aVar2 = new ed2.a("BUBBLE_TIPS_KEY_DISLIKE_EDU_TIPS", 1);
        f251253e = aVar2;
        ed2.a[] aVarArr = {aVar, aVar2};
        f251254f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static ed2.a valueOf(java.lang.String str) {
        return (ed2.a) java.lang.Enum.valueOf(ed2.a.class, str);
    }

    public static ed2.a[] values() {
        return (ed2.a[]) f251254f.clone();
    }
}
