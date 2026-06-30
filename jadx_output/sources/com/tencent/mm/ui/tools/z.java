package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.AddFavoriteUI f210933d;

    public z(com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI) {
        this.f210933d = addFavoriteUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f210933d.f209982m.sendEmptyMessage(0);
    }
}
