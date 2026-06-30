package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wu implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f114994d;

    public wu(com.tencent.mm.plugin.finder.live.plugin.iv ivVar) {
        this.f114994d = ivVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f114994d;
        ivVar.M.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ivVar.M.scrollBy(0, 1);
    }
}
