package fe0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final fe0.a f261364d;

    /* renamed from: e, reason: collision with root package name */
    public static final fe0.a f261365e;

    /* renamed from: f, reason: collision with root package name */
    public static final fe0.a f261366f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fe0.a[] f261367g;

    static {
        fe0.a aVar = new fe0.a("PANORAMA", 0);
        f261364d = aVar;
        fe0.a aVar2 = new fe0.a("FORM_VIEW", 1);
        f261365e = aVar2;
        fe0.a aVar3 = new fe0.a("COMMON_WEB_VIEW", 2);
        f261366f = aVar3;
        fe0.a[] aVarArr = {aVar, aVar2, aVar3};
        f261367g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static fe0.a valueOf(java.lang.String str) {
        return (fe0.a) java.lang.Enum.valueOf(fe0.a.class, str);
    }

    public static fe0.a[] values() {
        return (fe0.a[]) f261367g.clone();
    }
}
