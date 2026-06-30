package com.tencent.mm.ui;

/* loaded from: classes10.dex */
public class xd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f212550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.zd f212551e;

    public xd(com.tencent.mm.ui.zd zdVar, int i17) {
        this.f212551e = zdVar;
        this.f212550d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI = this.f212551e.f212618d;
        int i17 = com.tencent.mm.ui.MMNewPhotoEditUI.f196899t;
        mMNewPhotoEditUI.W6(true);
        mMNewPhotoEditUI.f196900d.g(new com.tencent.mm.ui.ae(mMNewPhotoEditUI, this.f212550d), true);
    }
}
