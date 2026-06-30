package nh5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: d, reason: collision with root package name */
    public static final nh5.g f337147d;

    /* renamed from: e, reason: collision with root package name */
    public static final nh5.g f337148e;

    /* renamed from: f, reason: collision with root package name */
    public static final nh5.g f337149f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ nh5.g[] f337150g;

    static {
        final java.lang.String str = "DISMISS";
        final int i17 = 0;
        nh5.g gVar = new nh5.g(str, i17) { // from class: nh5.d
            @Override // nh5.g
            public java.lang.String h() {
                return "manual-dump-dismiss";
            }

            @Override // nh5.g
            public int i() {
                return 1;
            }
        };
        f337147d = gVar;
        final java.lang.String str2 = "SHARE";
        final int i18 = 1;
        nh5.g gVar2 = new nh5.g(str2, i18) { // from class: nh5.e
            @Override // nh5.g
            public java.lang.String h() {
                return "manual-dump-share";
            }

            @Override // nh5.g
            public int i() {
                return 2;
            }
        };
        f337148e = gVar2;
        final java.lang.String str3 = "MUTE";
        final int i19 = 2;
        nh5.g gVar3 = new nh5.g(str3, i19) { // from class: nh5.f
            @Override // nh5.g
            public java.lang.String h() {
                return "manual-dump-mute";
            }

            @Override // nh5.g
            public int i() {
                return 3;
            }
        };
        f337149f = gVar3;
        f337150g = new nh5.g[]{gVar, gVar2, gVar3};
    }

    public g(java.lang.String str, int i17, nh5.c cVar) {
    }

    public static nh5.g valueOf(java.lang.String str) {
        return (nh5.g) java.lang.Enum.valueOf(nh5.g.class, str);
    }

    public static nh5.g[] values() {
        return (nh5.g[]) f337150g.clone();
    }

    public abstract java.lang.String h();

    public abstract int i();
}
