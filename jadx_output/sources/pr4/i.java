package pr4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final pr4.i f358009d;

    /* renamed from: e, reason: collision with root package name */
    public static final pr4.i f358010e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pr4.i[] f358011f;

    static {
        pr4.i iVar = new pr4.i("continuousSubscription", 0);
        f358009d = iVar;
        pr4.i iVar2 = new pr4.i("singleSubscription", 1);
        f358010e = iVar2;
        pr4.i[] iVarArr = {iVar, iVar2};
        f358011f = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static pr4.i valueOf(java.lang.String str) {
        return (pr4.i) java.lang.Enum.valueOf(pr4.i.class, str);
    }

    public static pr4.i[] values() {
        return (pr4.i[]) f358011f.clone();
    }
}
