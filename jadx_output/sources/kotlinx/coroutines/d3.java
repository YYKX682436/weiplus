package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310161a = new kotlinx.coroutines.internal.l0("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310162b = new kotlinx.coroutines.internal.l0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310163c = new kotlinx.coroutines.internal.l0("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310164d = new kotlinx.coroutines.internal.l0("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310165e = new kotlinx.coroutines.internal.l0("SEALED");

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.v1 f310166f = new kotlinx.coroutines.v1(false);

    /* renamed from: g, reason: collision with root package name */
    public static final kotlinx.coroutines.v1 f310167g = new kotlinx.coroutines.v1(true);

    public static final java.lang.Object a(java.lang.Object obj) {
        kotlinx.coroutines.k2 k2Var;
        kotlinx.coroutines.l2 l2Var = obj instanceof kotlinx.coroutines.l2 ? (kotlinx.coroutines.l2) obj : null;
        return (l2Var == null || (k2Var = l2Var.f310552a) == null) ? obj : k2Var;
    }
}
