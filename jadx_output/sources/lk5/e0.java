package lk5;

/* loaded from: classes14.dex */
public final class e0 implements al5.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f319030d;

    public e0(com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment) {
        this.f319030d = vASCommonFragment;
    }

    @Override // al5.f3
    public void onCancel() {
        this.f319030d.getF211120o();
    }

    @Override // al5.f3
    public void onDrag() {
        this.f319030d.getF211120o();
    }

    @Override // al5.f3
    public void onSwipeBack() {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319030d;
        vASCommonFragment.getF211120o();
        com.tencent.mm.ui.vas.VASActivity vASActivity = vASCommonFragment.f211121p;
        if (vASActivity != null) {
            vASActivity.finishWithNoAnim();
        }
    }
}
