package mn1;

/* loaded from: classes12.dex */
public class a0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.z f329826d;

    public a0(mn1.z zVar) {
        this.f329826d = zVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        mn1.z.a(this.f329826d, false);
        return true;
    }
}
