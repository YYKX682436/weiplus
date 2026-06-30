package cw2;

/* loaded from: classes12.dex */
public final class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223567d;

    public a7(java.lang.String str) {
        this.f223567d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).markVideoBufferingStatus(this.f223567d, 0);
    }
}
