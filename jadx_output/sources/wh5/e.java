package wh5;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final wh5.e f446049a = new wh5.e();

    public final void a(com.tencent.mm.storage.f9 msg, m11.b0 imgInfo, android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(imgInfo, "imgInfo");
        kotlin.jvm.internal.o.g(context, "context");
        wh5.v vVar = (wh5.v) wh5.h0.f446068a.a(msg, imgInfo);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sf3.g e17 = vVar.e();
        gg3.c a17 = vVar.a();
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        vf3.a aVar = (vf3.a) zVar.a((androidx.appcompat.app.AppCompatActivity) context).d(vf3.a.class);
        vf3.b T4 = aVar != null ? aVar.T4(vVar) : null;
        long j17 = T4 != null ? T4.f436369e : 0L;
        java.lang.String c17 = e17.c();
        java.lang.String str = a17.f271728c;
        com.tencent.mars.xlog.Log.i("C2CLiveExporter", "exportLivePhoto >> msgId: " + vVar.f446096a.getMsgId() + ", mediaLevel: " + vVar.f446098c.name() + "videoPath: " + str + ", videoSize: " + com.tencent.mm.vfs.w6.k(str) + " coverPath: " + c17 + ", coverSize: " + com.tencent.mm.vfs.w6.k(c17) + " coverTimeStampMs: " + j17);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null))), null, null, new wh5.d(c17, str, j17, currentTimeMillis, vVar, z17, context, null), 3, null);
    }
}
