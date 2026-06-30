package un;

/* loaded from: classes.dex */
public final class s0 extends cj5.d1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // cj5.d1
    public void U6(boolean z17) {
        super.U6(z17);
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new un.r0(this, null), 1, null);
        }
    }
}
