package yg5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final yg5.a f462333d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ yg5.a[] f462334e;

    static {
        yg5.a aVar = new yg5.a("Single", 0);
        f462333d = aVar;
        yg5.a[] aVarArr = {aVar, new yg5.a("Multi", 1)};
        f462334e = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static yg5.a valueOf(java.lang.String str) {
        return (yg5.a) java.lang.Enum.valueOf(yg5.a.class, str);
    }

    public static yg5.a[] values() {
        return (yg5.a[]) f462334e.clone();
    }
}
