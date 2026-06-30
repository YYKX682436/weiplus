package rn2;

/* loaded from: classes15.dex */
public final class u1 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397886a;

    public u1(rn2.t2 t2Var) {
        this.f397886a = t2Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        rn2.f fVar = this.f397886a.f397854f;
        if (fVar != null) {
            rn2.e eVar = ((rn2.c1) fVar).f397682y;
            eVar.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateConfig", "setEnableRepeatLottery enableRepeatLottery:" + z17);
            eVar.f397715q = z17;
        }
    }
}
