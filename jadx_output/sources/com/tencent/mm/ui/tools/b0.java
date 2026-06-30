package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.AddFavoriteUI f210280d;

    public b0(com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI) {
        this.f210280d = addFavoriteUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f210280d.f209983n.sendEmptyMessage(0);
    }
}
