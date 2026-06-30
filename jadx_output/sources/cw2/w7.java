package cw2;

/* loaded from: classes15.dex */
public final class w7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f224089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f224090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f224091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f224092g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, cw2.wa waVar, long j17, long j18) {
        super(0);
        this.f224089d = finderThumbPlayerProxy;
        this.f224090e = waVar;
        this.f224091f = j17;
        this.f224092g = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cw2.i9 lifecycle = this.f224089d.getLifecycle();
        if (lifecycle != null) {
            cw2.fb.w(lifecycle, this.f224090e.f224097d, ((int) this.f224091f) / 1000, ((int) this.f224092g) / 1000, null, 8, null);
        }
        return jz5.f0.f302826a;
    }
}
