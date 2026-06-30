package qf0;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final qf0.s f362252d = new qf0.s();

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        xn4.e0 e0Var = xn4.e0.f455614d;
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_COMM_KV").getBoolean("MMKV_KEY_NeedNotifyFlag", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateManager", "tryNotifyUpdateWithRedDotAndDialog " + z17);
        if (z17) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_COMM_KV").getString("MMKV_KEY_LastNotifyMd5", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateManager", "notifyChangeIfNeed " + string + ' ' + e0Var.b().f380671g);
            if (!kotlin.jvm.internal.o.b(string, e0Var.b().f380671g)) {
                com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_COMM_KV").putString("MMKV_KEY_LastNotifyMd5", e0Var.b().f380671g);
                java.util.Iterator it = ((java.util.ArrayList) xn4.e0.f455622o).iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.invoke(e0Var.b());
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        it.remove();
                    }
                }
            }
            e0Var.h(false, "notify success");
        }
    }
}
