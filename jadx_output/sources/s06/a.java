package s06;

/* loaded from: classes16.dex */
public final class a extends o06.y2 {

    /* renamed from: c, reason: collision with root package name */
    public static final s06.a f401980c = new s06.a();

    public a() {
        super("package", false);
    }

    @Override // o06.y2
    public java.lang.Integer a(o06.y2 visibility) {
        kotlin.jvm.internal.o.g(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        java.util.Map map = o06.x2.f342005a;
        return visibility == o06.s2.f341983c || visibility == o06.t2.f341991c ? 1 : -1;
    }

    @Override // o06.y2
    public java.lang.String b() {
        return "public/*package*/";
    }

    @Override // o06.y2
    public o06.y2 c() {
        return o06.u2.f341999c;
    }
}
