package vp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final vp5.c f439091e;

    /* renamed from: f, reason: collision with root package name */
    public static final vp5.c f439092f;

    /* renamed from: g, reason: collision with root package name */
    public static final vp5.c f439093g;

    /* renamed from: h, reason: collision with root package name */
    public static final vp5.c f439094h;

    /* renamed from: i, reason: collision with root package name */
    public static final vp5.c f439095i;

    /* renamed from: m, reason: collision with root package name */
    public static final vp5.c f439096m;

    /* renamed from: n, reason: collision with root package name */
    public static final vp5.c f439097n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ vp5.c[] f439098o;

    /* renamed from: d, reason: collision with root package name */
    public final int f439099d;

    static {
        vp5.c cVar = new vp5.c("OK", 0, 0);
        f439091e = cVar;
        vp5.c cVar2 = new vp5.c("ERR_PERMISSION_DENIED", 1, 1);
        f439092f = cVar2;
        vp5.c cVar3 = new vp5.c("ERR_NO_SUCH_FILE_OR_DIR", 2, 2);
        f439093g = cVar3;
        vp5.c cVar4 = new vp5.c("ERR_IS_DIR", 3, 3);
        f439094h = cVar4;
        vp5.c cVar5 = new vp5.c("ERR_NO_SPACE_LEFT", 4, 4);
        f439095i = cVar5;
        vp5.c cVar6 = new vp5.c("ERR_NAME_TOO_LONG", 5, 5);
        f439096m = cVar6;
        vp5.c cVar7 = new vp5.c("ERR_UNKNOWN", 6, -1);
        f439097n = cVar7;
        vp5.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f439098o = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f439099d = i18;
    }

    public static vp5.c valueOf(java.lang.String str) {
        return (vp5.c) java.lang.Enum.valueOf(vp5.c.class, str);
    }

    public static vp5.c[] values() {
        return (vp5.c[]) f439098o.clone();
    }
}
