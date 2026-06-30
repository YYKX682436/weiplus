package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f188491d;

    public e(com.tencent.mm.plugin.wepkg.utils.g gVar, java.util.List list) {
        this.f188491d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f188491d;
            if (i17 >= list.size() || i17 >= 5) {
                return;
            }
            com.tencent.mm.plugin.wepkg.model.p0.b().d((java.lang.String) list.get(i17), false);
            i17++;
        }
    }
}
