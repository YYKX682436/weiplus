package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class yd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.zd f212586d;

    public yd(com.tencent.mm.ui.zd zdVar) {
        this.f212586d = zdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f212586d.f212618d.getResources().getString(com.tencent.mm.R.string.c1s), 1).show();
    }
}
