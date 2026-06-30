package s06;

/* loaded from: classes16.dex */
public final class b extends o06.y2 {

    /* renamed from: c, reason: collision with root package name */
    public static final s06.b f401981c = new s06.b();

    public b() {
        super("protected_and_package", true);
    }

    @Override // o06.y2
    public java.lang.Integer a(o06.y2 visibility) {
        kotlin.jvm.internal.o.g(visibility, "visibility");
        if (kotlin.jvm.internal.o.b(this, visibility)) {
            return 0;
        }
        if (visibility == o06.p2.f341978c) {
            return null;
        }
        java.util.Map map = o06.x2.f342005a;
        return java.lang.Integer.valueOf(visibility == o06.s2.f341983c || visibility == o06.t2.f341991c ? 1 : -1);
    }

    @Override // o06.y2
    public java.lang.String b() {
        return "protected/*protected and package*/";
    }

    @Override // o06.y2
    public o06.y2 c() {
        return o06.u2.f341999c;
    }
}
