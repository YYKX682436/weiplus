package yr1;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment f464639d;

    public e(com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment bizContactInfoDialogFragment) {
        this.f464639d = bizContactInfoDialogFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f464639d.dismissAllowingStateLoss();
    }
}
