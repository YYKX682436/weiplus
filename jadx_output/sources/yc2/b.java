package yc2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final yc2.b f460825e;

    /* renamed from: f, reason: collision with root package name */
    public static final yc2.b f460826f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yc2.b[] f460827g;

    /* renamed from: d, reason: collision with root package name */
    public final int f460828d;

    static {
        yc2.b bVar = new yc2.b("JOIN_BTN", 0, 1);
        f460825e = bVar;
        yc2.b bVar2 = new yc2.b("CLOSE_BTN", 1, 2);
        f460826f = bVar2;
        yc2.b[] bVarArr = {bVar, bVar2};
        f460827g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f460828d = i18;
    }

    public static yc2.b valueOf(java.lang.String str) {
        return (yc2.b) java.lang.Enum.valueOf(yc2.b.class, str);
    }

    public static yc2.b[] values() {
        return (yc2.b[]) f460827g.clone();
    }
}
