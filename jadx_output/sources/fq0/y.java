package fq0;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.z f265493d;

    public y(fq0.z zVar) {
        this.f265493d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MagicSclFrameSetManagerService_Report");
        M.d();
        this.f265493d.f265494d = M;
    }
}
