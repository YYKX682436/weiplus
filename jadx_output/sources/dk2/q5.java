package dk2;

/* loaded from: classes3.dex */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.q5 f233939a = new dk2.q5();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f233940b = jz5.h.b(dk2.n5.f233798d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f233941c = jz5.h.b(dk2.p5.f233902d);

    /* renamed from: d, reason: collision with root package name */
    public static long f233942d;

    public static final void a(dk2.q5 q5Var, long j17) {
        q5Var.getClass();
        com.tencent.mars.xlog.Log.i("Micro.FinderLiveCommentTemporaryStorage", "[notifyDeleteTask] liveId:" + j17);
        jz5.g gVar = f233941c;
        android.os.Message obtainMessage = ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue()).obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = java.lang.Long.valueOf(j17);
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue()).removeMessages(1, java.lang.Long.valueOf(j17));
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue()).sendMessageDelayed(obtainMessage, 30000L);
    }

    public final kk.l b() {
        return (kk.l) ((jz5.n) f233940b).getValue();
    }
}
