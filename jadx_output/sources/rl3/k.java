package rl3;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl3.l f397259d;

    public k(rl3.l lVar) {
        this.f397259d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rl3.l lVar = this.f397259d;
        if (currentTimeMillis - lVar.f397260a > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            lVar.f397260a = java.lang.System.currentTimeMillis();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.h3v), 0).show();
        }
    }
}
