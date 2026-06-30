package va;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public abstract class p {

    /* renamed from: d, reason: collision with root package name */
    public static final va.p f434200d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ va.p[] f434201e;

    /* JADX INFO: Fake field, exist only in values array */
    va.p EF0;

    static {
        final java.lang.String str = "STRONG";
        final int i17 = 0;
        va.p pVar = new va.p(str, i17) { // from class: va.n
            @Override // va.p
            public ua.c h() {
                return ua.a.f425892d;
            }
        };
        final java.lang.String str2 = "WEAK";
        final int i18 = 1;
        va.p pVar2 = new va.p(str2, i18) { // from class: va.o
            @Override // va.p
            public ua.c h() {
                return ua.b.f425893d;
            }
        };
        f434200d = pVar2;
        f434201e = new va.p[]{pVar, pVar2};
    }

    public p(java.lang.String str, int i17, va.c cVar) {
    }

    public static va.p valueOf(java.lang.String str) {
        return (va.p) java.lang.Enum.valueOf(va.p.class, str);
    }

    public static va.p[] values() {
        return (va.p[]) f434201e.clone();
    }

    public abstract ua.c h();
}
