package nu0;

/* loaded from: classes5.dex */
public final class i4 extends gx0.hf {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f339972i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f339973m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339972i = jz5.h.b(new nu0.f4(this));
        this.f339973m = jz5.h.b(new nu0.g4(this));
    }

    @Override // gx0.hf
    public void U6(com.tencent.maas.base.MJID mjID, yz5.a aVar) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        jz5.g gVar = this.f339972i;
        if (((nu0.q0) ((jz5.n) gVar).getValue()).b7(mjID.value()) == null) {
            return;
        }
        nu0.q0.Y6((nu0.q0) ((jz5.n) gVar).getValue(), false, null, 3, null);
    }

    @Override // gx0.hf
    public void W6(com.tencent.maas.base.MJID mjID, com.tencent.maas.model.time.MJTimeRange timeRange, yz5.a aVar) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        kotlin.jvm.internal.o.g(timeRange, "timeRange");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new nu0.e4(this, mjID, aVar, null), 3, null);
    }

    @Override // gx0.hf
    public boolean g7(com.tencent.maas.base.MJID mjID, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        boolean f76 = ((nu0.q0) ((jz5.n) this.f339972i).getValue()).f7(mjID.value());
        if (f76 && z17) {
            pf5.e.launchUI$default(this, null, null, new nu0.h4(this, z18, null), 3, null);
        }
        return f76;
    }
}
