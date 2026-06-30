package nf2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class l1 {

    /* renamed from: e, reason: collision with root package name */
    public static final nf2.l1 f336772e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ nf2.l1[] f336773f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f336774g;

    /* renamed from: d, reason: collision with root package name */
    public final int f336775d;

    static {
        nf2.l1 l1Var = new nf2.l1("BRAND", 0, -16268960);
        f336772e = l1Var;
        nf2.l1[] l1VarArr = {l1Var, new nf2.l1("OVERLAY", 1, -1), new nf2.l1("BG", 2, -11776948), new nf2.l1("ORANGE_RED", 3, -40634), new nf2.l1("YELLOW", 4, -17664), new nf2.l1("BLUE", 5, -15683841), new nf2.l1("PURPLE", 6, -10197008)};
        f336773f = l1VarArr;
        f336774g = rz5.b.a(l1VarArr);
    }

    public l1(java.lang.String str, int i17, int i18) {
        this.f336775d = i18;
    }

    public static nf2.l1 valueOf(java.lang.String str) {
        return (nf2.l1) java.lang.Enum.valueOf(nf2.l1.class, str);
    }

    public static nf2.l1[] values() {
        return (nf2.l1[]) f336773f.clone();
    }
}
