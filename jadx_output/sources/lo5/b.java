package lo5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final lo5.b f320204d;

    /* renamed from: e, reason: collision with root package name */
    public static final lo5.b f320205e;

    /* renamed from: f, reason: collision with root package name */
    public static final lo5.b f320206f;

    /* renamed from: g, reason: collision with root package name */
    public static final lo5.b f320207g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ lo5.b[] f320208h;

    static {
        lo5.b bVar = new lo5.b("SlideUpward", 0);
        f320204d = bVar;
        lo5.b bVar2 = new lo5.b("Accepted", 1);
        f320205e = bVar2;
        lo5.b bVar3 = new lo5.b("Hangup", 2);
        f320206f = bVar3;
        lo5.b bVar4 = new lo5.b("ClickForFullScreen", 3);
        f320207g = bVar4;
        lo5.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f320208h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static lo5.b valueOf(java.lang.String str) {
        return (lo5.b) java.lang.Enum.valueOf(lo5.b.class, str);
    }

    public static lo5.b[] values() {
        return (lo5.b[]) f320208h.clone();
    }
}
