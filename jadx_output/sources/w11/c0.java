package w11;

/* loaded from: classes12.dex */
public class c0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.yh f441987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.g0 f441988e;

    public c0(w11.g0 g0Var, o45.yh yhVar) {
        this.f441988e = g0Var;
        this.f441987d = yhVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f441988e.f442035n = true;
        this.f441988e.onGYNetEnd(-1, 0, 0, "", new w11.e0(this.f441987d), null);
        return false;
    }
}
