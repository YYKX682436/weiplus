package qn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final qn.d f364882e;

    /* renamed from: f, reason: collision with root package name */
    public static final qn.d f364883f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qn.d[] f364884g;

    /* renamed from: d, reason: collision with root package name */
    public final int f364885d;

    static {
        qn.d dVar = new qn.d("UnTop", 0, 1);
        f364882e = dVar;
        qn.d dVar2 = new qn.d("Top", 1, 2);
        f364883f = dVar2;
        qn.d[] dVarArr = {dVar, dVar2};
        f364884g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f364885d = i18;
    }

    public static qn.d valueOf(java.lang.String str) {
        return (qn.d) java.lang.Enum.valueOf(qn.d.class, str);
    }

    public static qn.d[] values() {
        return (qn.d[]) f364884g.clone();
    }
}
