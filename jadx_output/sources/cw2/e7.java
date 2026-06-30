package cw2;

/* loaded from: classes12.dex */
public final class e7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f223677d;

    public e7(kotlin.jvm.internal.h0 h0Var) {
        this.f223677d = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).markVideoBufferingStatus((java.lang.String) this.f223677d.f310123d, 3);
    }
}
