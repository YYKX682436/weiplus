package qj4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final qj4.k f363922e;

    /* renamed from: f, reason: collision with root package name */
    public static final qj4.k f363923f;

    /* renamed from: g, reason: collision with root package name */
    public static final qj4.k f363924g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qj4.k[] f363925h;

    /* renamed from: d, reason: collision with root package name */
    public final int f363926d;

    static {
        qj4.k kVar = new qj4.k("EXIT_PAGE_CLOSE_BUTTON", 0, 1);
        f363922e = kVar;
        qj4.k kVar2 = new qj4.k("EXIT_PAGE_ALERT_CONFIRM", 1, 2);
        f363923f = kVar2;
        qj4.k kVar3 = new qj4.k("EXIT_PAGE_OTHER", 2, 3);
        f363924g = kVar3;
        qj4.k[] kVarArr = {kVar, kVar2, kVar3};
        f363925h = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17, int i18) {
        this.f363926d = i18;
    }

    public static qj4.k valueOf(java.lang.String str) {
        return (qj4.k) java.lang.Enum.valueOf(qj4.k.class, str);
    }

    public static qj4.k[] values() {
        return (qj4.k[]) f363925h.clone();
    }
}
