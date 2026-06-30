package wp5;

/* loaded from: classes13.dex */
public final /* synthetic */ class b$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.weapp_core.InitLoader initLoader = wp5.e.f448468f;
        if (initLoader != null) {
            initLoader.initMainThreadLoop();
        } else {
            kotlin.jvm.internal.o.o("initLoader");
            throw null;
        }
    }
}
