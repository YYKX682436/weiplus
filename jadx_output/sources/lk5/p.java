package lk5;

/* loaded from: classes14.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASActivity f319057d;

    public p(com.tencent.mm.ui.vas.VASActivity vASActivity) {
        this.f319057d = vASActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f319057d.onVASBackPressedDispatcherCallback();
    }
}
