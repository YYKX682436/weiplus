package p06;

/* loaded from: classes15.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final n16.g f350760a = n16.g.k(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);

    /* renamed from: b, reason: collision with root package name */
    public static final n16.g f350761b = n16.g.k("replaceWith");

    /* renamed from: c, reason: collision with root package name */
    public static final n16.g f350762c = n16.g.k(ya.b.LEVEL);

    /* renamed from: d, reason: collision with root package name */
    public static final n16.g f350763d = n16.g.k("expression");

    /* renamed from: e, reason: collision with root package name */
    public static final n16.g f350764e = n16.g.k("imports");

    public static p06.c a(l06.o oVar, java.lang.String message, java.lang.String replaceWith, java.lang.String level, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            replaceWith = "";
        }
        if ((i17 & 4) != 0) {
            level = "WARNING";
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(oVar, "<this>");
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(replaceWith, "replaceWith");
        kotlin.jvm.internal.o.g(level, "level");
        return new p06.o(oVar, l06.w.f314933n, kz5.c1.k(new jz5.l(f350760a, new t16.b0(message)), new jz5.l(f350761b, new t16.a(new p06.o(oVar, l06.w.f314935p, kz5.c1.k(new jz5.l(f350763d, new t16.b0(replaceWith)), new jz5.l(f350764e, new t16.b(kz5.p0.f313996d, new p06.f(oVar)))), false))), new jz5.l(f350762c, new t16.k(n16.b.l(l06.w.f314934o), n16.g.k(level)))), z17);
    }
}
