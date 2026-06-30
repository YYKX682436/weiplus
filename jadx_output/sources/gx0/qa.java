package gx0;

/* loaded from: classes5.dex */
public final class qa implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276881d;

    public qa(gx0.ac acVar) {
        this.f276881d = acVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((com.tencent.maas.model.time.MJTime) obj) == null) {
            return;
        }
        this.f276881d.i8();
    }
}
