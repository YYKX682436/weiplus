package m31;

/* loaded from: classes9.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI f323174d;

    public p(com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI) {
        this.f323174d = subscribeMsgDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI = this.f323174d;
        java.util.concurrent.atomic.AtomicLong atomicLong = subscribeMsgDetailUI.f71873v;
        java.lang.String url = subscribeMsgDetailUI.f71859e.f71816v;
        kotlin.jvm.internal.o.g(url, "url");
        long nanoTime = java.lang.System.nanoTime();
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.msgsubscription.voice.PlayVoiceData(nanoTime, url, 0), p31.e.class, p31.a.f351448d);
        atomicLong.set(nanoTime);
    }
}
