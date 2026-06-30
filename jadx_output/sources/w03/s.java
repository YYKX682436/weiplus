package w03;

/* loaded from: classes10.dex */
public final class s extends androidx.activity.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w03.u f441901a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w03.u uVar) {
        super(true);
        this.f441901a = uVar;
    }

    @Override // androidx.activity.g
    public void handleOnBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "handleOnBackPressed");
        w03.u.S6(this.f441901a, true, false, false, null, 14, null);
    }
}
