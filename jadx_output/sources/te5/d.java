package te5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final te5.d f418622a = new te5.d();

    public final void a(com.tencent.mm.storage.f9 msgInfo, yz5.a onSuccess) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        l70.d U6 = x70.g.f452415f.a().U6(msgInfo, s70.c.f403919g, true);
        if (U6 == null || com.tencent.mm.vfs.w6.j(U6.f316805f)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageDownloadHelper", "tryDownloadMidImage: msgId: " + msgInfo.getMsgId());
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(onSuccess);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new te5.c(U6, weakReference, null), 1, null);
        }
    }
}
