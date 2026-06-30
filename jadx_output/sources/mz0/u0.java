package mz0;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.widget.MusicV2State f333067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(mz0.b2 b2Var, com.tencent.mm.mj_template.album_template.widget.MusicV2State musicV2State) {
        super(2);
        this.f333066d = b2Var;
        this.f333067e = musicV2State;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l visibleCallback = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(visibleCallback, "visibleCallback");
        kotlinx.coroutines.l.d(this.f333066d.getMainScope(), null, null, new mz0.t0(booleanValue, this.f333066d, this.f333067e, visibleCallback, null), 3, null);
        return jz5.f0.f302826a;
    }
}
