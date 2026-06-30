package yw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final yw0.a f466521d;

    /* renamed from: e, reason: collision with root package name */
    public static final yw0.a f466522e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yw0.a[] f466523f;

    static {
        yw0.a aVar = new yw0.a("Enable", 0);
        f466521d = aVar;
        yw0.a aVar2 = new yw0.a("Disable", 1);
        f466522e = aVar2;
        yw0.a[] aVarArr = {aVar, aVar2};
        f466523f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static yw0.a valueOf(java.lang.String str) {
        return (yw0.a) java.lang.Enum.valueOf(yw0.a.class, str);
    }

    public static yw0.a[] values() {
        return (yw0.a[]) f466523f.clone();
    }
}
