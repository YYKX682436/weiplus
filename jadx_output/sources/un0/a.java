package un0;

/* loaded from: classes12.dex */
public final class a extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("FinderLiveScreenCastForegroundListener", "#appForegroundListener onEnter");
        boolean z17 = un0.b.f429345a;
        un0.b.f429345a = true;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        boolean z17 = un0.b.f429345a;
        un0.b.f429345a = false;
        com.tencent.mars.xlog.Log.i("FinderLiveScreenCastForegroundListener", "#appForegroundListener onExit");
    }
}
