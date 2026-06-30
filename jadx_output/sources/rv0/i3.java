package rv0;

/* loaded from: classes5.dex */
public final class i3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.f f400047d;

    public i3(rv0.f fVar) {
        this.f400047d = fVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) obj;
        kotlin.jvm.internal.o.d(mJTime);
        this.f400047d.setCurrentTime(mJTime);
    }
}
