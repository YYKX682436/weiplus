package qn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final qn.b f364873e;

    /* renamed from: f, reason: collision with root package name */
    public static final qn.b f364874f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qn.b[] f364875g;

    /* renamed from: d, reason: collision with root package name */
    public final int f364876d;

    static {
        qn.b bVar = new qn.b("Default", 0, 0);
        qn.b bVar2 = new qn.b("Profile", 1, 1);
        f364873e = bVar2;
        qn.b bVar3 = new qn.b("Conv", 2, 2);
        f364874f = bVar3;
        qn.b[] bVarArr = {bVar, bVar2, bVar3};
        f364875g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f364876d = i18;
    }

    public static qn.b valueOf(java.lang.String str) {
        return (qn.b) java.lang.Enum.valueOf(qn.b.class, str);
    }

    public static qn.b[] values() {
        return (qn.b[]) f364875g.clone();
    }
}
