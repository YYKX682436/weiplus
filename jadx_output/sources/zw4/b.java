package zw4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final zw4.b f476888e;

    /* renamed from: f, reason: collision with root package name */
    public static final zw4.b f476889f;

    /* renamed from: g, reason: collision with root package name */
    public static final zw4.b f476890g;

    /* renamed from: h, reason: collision with root package name */
    public static final zw4.b f476891h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ zw4.b[] f476892i;

    /* renamed from: d, reason: collision with root package name */
    public final int f476893d;

    static {
        zw4.b bVar = new zw4.b("None", 0, 0);
        f476888e = bVar;
        zw4.b bVar2 = new zw4.b("NothingComplete", 1, 1);
        f476889f = bVar2;
        zw4.b bVar3 = new zw4.b("CompleteA8keyAsyncOnly", 2, 2);
        f476890g = bVar3;
        zw4.b bVar4 = new zw4.b("CompletePrefetch", 3, 3);
        f476891h = bVar4;
        zw4.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f476892i = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f476893d = i18;
    }

    public static zw4.b valueOf(java.lang.String str) {
        return (zw4.b) java.lang.Enum.valueOf(zw4.b.class, str);
    }

    public static zw4.b[] values() {
        return (zw4.b[]) f476892i.clone();
    }
}
