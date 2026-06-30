package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class ce implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMWizardActivity f198091d;

    public ce(com.tencent.mm.ui.MMWizardActivity mMWizardActivity) {
        this.f198091d = mMWizardActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f198091d.finish();
    }
}
