package rj5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final rj5.a f396371d;

    /* renamed from: e, reason: collision with root package name */
    public static final rj5.a f396372e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rj5.a[] f396373f;

    static {
        rj5.a aVar = new rj5.a("IDLE", 0);
        f396371d = aVar;
        rj5.a aVar2 = new rj5.a("SCROLLING", 1);
        f396372e = aVar2;
        rj5.a[] aVarArr = {aVar, aVar2};
        f396373f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static rj5.a valueOf(java.lang.String str) {
        return (rj5.a) java.lang.Enum.valueOf(rj5.a.class, str);
    }

    public static rj5.a[] values() {
        return (rj5.a[]) f396373f.clone();
    }
}
