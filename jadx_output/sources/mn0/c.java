package mn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final mn0.c f329702e;

    /* renamed from: f, reason: collision with root package name */
    public static final mn0.c f329703f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mn0.c[] f329704g;

    /* renamed from: d, reason: collision with root package name */
    public final int f329705d;

    static {
        mn0.c cVar = new mn0.c("EXTERNAL", 0, 1);
        f329702e = cVar;
        mn0.c cVar2 = new mn0.c("TEMP_PAUSE", 1, 2);
        f329703f = cVar2;
        mn0.c[] cVarArr = {cVar, cVar2};
        f329704g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f329705d = i18;
    }

    public static mn0.c valueOf(java.lang.String str) {
        return (mn0.c) java.lang.Enum.valueOf(mn0.c.class, str);
    }

    public static mn0.c[] values() {
        return (mn0.c[]) f329704g.clone();
    }
}
