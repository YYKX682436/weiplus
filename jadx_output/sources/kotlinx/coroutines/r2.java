package kotlinx.coroutines;

/* loaded from: classes14.dex */
public interface r2 extends oz5.i {
    public static final /* synthetic */ int O0 = 0;

    boolean A();

    java.lang.Object C(kotlin.coroutines.Continuation continuation);

    boolean a();

    void b(java.util.concurrent.CancellationException cancellationException);

    q26.n c();

    boolean isCancelled();

    kotlinx.coroutines.s1 p(yz5.l lVar);

    kotlinx.coroutines.w q(kotlinx.coroutines.y yVar);

    boolean start();

    java.util.concurrent.CancellationException x();

    kotlinx.coroutines.s1 z(boolean z17, boolean z18, yz5.l lVar);
}
