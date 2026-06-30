package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.BaseSmallView f177130d;

    public b(com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView) {
        this.f177130d = baseSmallView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.widget.a(this));
    }
}
