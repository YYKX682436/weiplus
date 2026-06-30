package zq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final zq5.i f475068d;

    /* renamed from: e, reason: collision with root package name */
    public static final zq5.i f475069e;

    /* renamed from: f, reason: collision with root package name */
    public static final zq5.i f475070f;

    /* renamed from: g, reason: collision with root package name */
    public static final zq5.i f475071g;

    /* renamed from: h, reason: collision with root package name */
    public static final zq5.i f475072h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ zq5.i[] f475073i;

    static {
        zq5.i iVar = new zq5.i("Verbose", 0);
        f475068d = iVar;
        zq5.i iVar2 = new zq5.i("Debug", 1);
        f475069e = iVar2;
        zq5.i iVar3 = new zq5.i("Info", 2);
        f475070f = iVar3;
        zq5.i iVar4 = new zq5.i("Warn", 3);
        f475071g = iVar4;
        zq5.i iVar5 = new zq5.i("Error", 4);
        f475072h = iVar5;
        zq5.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, new zq5.i("Assert", 5)};
        f475073i = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static zq5.i valueOf(java.lang.String str) {
        return (zq5.i) java.lang.Enum.valueOf(zq5.i.class, str);
    }

    public static zq5.i[] values() {
        return (zq5.i[]) f475073i.clone();
    }
}
