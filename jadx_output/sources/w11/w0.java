package w11;

/* loaded from: classes12.dex */
public class w0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.y0 f442159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.z0 f442160e;

    public w0(w11.z0 z0Var, w11.y0 y0Var) {
        this.f442160e = z0Var;
        this.f442159d = y0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f442160e.f442195t = true;
        jx3.f.INSTANCE.idkeyStat(99L, 231L, 1L, false);
        this.f442160e.onGYNetEnd(-1, 0, 0, "", this.f442159d, null);
        return false;
    }
}
