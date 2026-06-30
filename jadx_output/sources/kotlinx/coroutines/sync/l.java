package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310657a = new kotlinx.coroutines.internal.l0("UNLOCK_FAIL");

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310658b;

    /* renamed from: c, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310659c;

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.sync.b f310660d;

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.sync.b f310661e;

    static {
        kotlinx.coroutines.internal.l0 l0Var = new kotlinx.coroutines.internal.l0("LOCKED");
        f310658b = l0Var;
        kotlinx.coroutines.internal.l0 l0Var2 = new kotlinx.coroutines.internal.l0("UNLOCKED");
        f310659c = l0Var2;
        f310660d = new kotlinx.coroutines.sync.b(l0Var);
        f310661e = new kotlinx.coroutines.sync.b(l0Var2);
    }

    public static kotlinx.coroutines.sync.d a(boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        return new kotlinx.coroutines.sync.k(z17);
    }
}
