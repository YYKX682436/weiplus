package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f119965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119966e;

    public ua(com.tencent.mm.plugin.finder.live.widget.nb nbVar, android.view.View view) {
        this.f119965d = nbVar;
        this.f119966e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        this.f119965d.getClass();
        for (java.lang.Object context = this.f119966e.getContext(); context != null; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Dialog) {
                window = ((android.app.Dialog) context).getWindow();
                break;
            } else if (context instanceof android.app.Activity) {
                window = ((android.app.Activity) context).getWindow();
                break;
            } else {
                if (!(context instanceof android.content.ContextWrapper)) {
                    break;
                }
            }
        }
        window = null;
        if (window != null) {
            window.addFlags(8192);
        }
    }
}
