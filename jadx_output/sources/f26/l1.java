package f26;

/* loaded from: classes16.dex */
public final class l1 {

    /* renamed from: e, reason: collision with root package name */
    public static final f26.k1 f259190e = new f26.k1(null);

    /* renamed from: a, reason: collision with root package name */
    public final f26.l1 f259191a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.d2 f259192b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f259193c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f259194d;

    public l1(f26.l1 l1Var, o06.d2 d2Var, java.util.List list, java.util.Map map, kotlin.jvm.internal.i iVar) {
        this.f259191a = l1Var;
        this.f259192b = d2Var;
        this.f259193c = list;
        this.f259194d = map;
    }

    public final boolean a(o06.d2 descriptor) {
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        if (!kotlin.jvm.internal.o.b(this.f259192b, descriptor)) {
            f26.l1 l1Var = this.f259191a;
            if (!(l1Var != null ? l1Var.a(descriptor) : false)) {
                return false;
            }
        }
        return true;
    }
}
