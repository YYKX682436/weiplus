package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.w f149432d;

    public v(com.tencent.mm.plugin.mmsight.ui.w wVar) {
        this.f149432d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.x xVar = this.f149432d.f149438a.f149190x;
        if (xVar != null) {
            xVar.a(true);
        }
    }
}
