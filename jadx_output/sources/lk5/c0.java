package lk5;

/* loaded from: classes14.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f319022d;

    public c0(com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment) {
        this.f319022d = vASCommonFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319022d;
        com.tencent.mars.xlog.Log.i(vASCommonFragment.getF211120o(), "oneShotPreDraw Call!!");
        vASCommonFragment.startPostponedEnterTransition();
    }
}
