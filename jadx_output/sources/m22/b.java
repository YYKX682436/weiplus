package m22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final m22.b f323017d;

    /* renamed from: e, reason: collision with root package name */
    public static final m22.b f323018e;

    /* renamed from: f, reason: collision with root package name */
    public static final m22.b f323019f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m22.b[] f323020g;

    static {
        m22.b bVar = new m22.b("Up", 0);
        f323017d = bVar;
        m22.b bVar2 = new m22.b("Down", 1);
        f323018e = bVar2;
        m22.b bVar3 = new m22.b("None", 2);
        f323019f = bVar3;
        m22.b[] bVarArr = {bVar, bVar2, bVar3};
        f323020g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static m22.b valueOf(java.lang.String str) {
        return (m22.b) java.lang.Enum.valueOf(m22.b.class, str);
    }

    public static m22.b[] values() {
        return (m22.b[]) f323020g.clone();
    }
}
