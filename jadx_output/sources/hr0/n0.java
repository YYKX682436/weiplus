package hr0;

/* loaded from: classes11.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final hr0.n0 f283315d = new hr0.n0();

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SdcardRemountingHandler", "do relaunching for external cache dir changing");
            k35.o oVar = k35.p.f303943a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((bt.b1) oVar).getClass();
            com.tencent.mm.ui.vb.d(context, false, 2);
        }
    }
}
