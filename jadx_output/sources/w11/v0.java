package w11;

/* loaded from: classes12.dex */
public class v0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.yh f442154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.z0 f442155e;

    public v0(w11.z0 z0Var, o45.yh yhVar) {
        this.f442155e = z0Var;
        this.f442154d = yhVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f442155e.f442195t = true;
        w11.y0 y0Var = new w11.y0(this.f442154d);
        jx3.f.INSTANCE.idkeyStat(99L, 230L, 1L, false);
        this.f442155e.onGYNetEnd(-1, 0, 0, "", y0Var, null);
        return false;
    }
}
