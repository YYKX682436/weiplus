package pg0;

@j95.b
/* loaded from: classes4.dex */
public final class g3 extends i95.w {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        xs4.b bVar = (xs4.b) a17;
        bVar.getClass();
        bVar.O6(gm0.j1.u().h() + "WalletCoreDB-2.db");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
    }
}
