package cw2;

/* loaded from: classes12.dex */
public final class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224143d;

    public z6(java.lang.String str) {
        this.f224143d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).markVideoBufferingStatus(this.f224143d, 1);
    }
}
