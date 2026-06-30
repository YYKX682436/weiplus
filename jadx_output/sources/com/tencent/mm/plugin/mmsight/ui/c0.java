package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f149298e;

    public c0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton, int i17) {
        this.f149298e = mMSightRecordButton;
        this.f149297d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*android.view.View*/.setVisibility(this.f149297d);
    }
}
