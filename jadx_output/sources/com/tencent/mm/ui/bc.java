package com.tencent.mm.ui;

/* loaded from: classes4.dex */
public abstract class bc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f197876d = -1;

    public int a() {
        return 1;
    }

    public abstract void b(android.view.MenuItem menuItem);

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMCustomMenuItemClickListener", "button onclick");
        int a17 = a();
        if (a17 == 0) {
            b(menuItem);
        } else if (a17 == 1) {
            if (this.f197876d != -1) {
                long nanoTime = (java.lang.System.nanoTime() - this.f197876d) / 1000000;
                if (nanoTime < 500) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMCustomMenuItemClickListener", "click time limited limitetime:%d, delaytime:%d", java.lang.Long.valueOf(nanoTime), 500L);
                    return false;
                }
            }
            this.f197876d = java.lang.System.nanoTime();
            b(menuItem);
        }
        return false;
    }
}
