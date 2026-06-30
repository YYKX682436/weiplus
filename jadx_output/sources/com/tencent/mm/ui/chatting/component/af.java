package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class af implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem.OnMenuItemClickListener f198620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f198621e;

    public af(com.tencent.mm.ui.chatting.component.pe peVar, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f198621e = peVar;
        this.f198620d = onMenuItemClickListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f198620d;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(new db5.h4(this.f198621e.f198580d.g(), 0, 0));
        }
    }
}
