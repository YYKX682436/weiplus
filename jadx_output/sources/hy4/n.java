package hy4;

/* loaded from: classes8.dex */
public class n implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.s f286178d;

    public n(hy4.s sVar) {
        this.f286178d = sVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        hy4.r rVar;
        int i17 = message.what;
        hy4.s sVar = this.f286178d;
        if (i17 != 1) {
            if (i17 != 2 || (rVar = sVar.f286197d) == null) {
                return false;
            }
            rVar.a(sVar.f286196c);
            return false;
        }
        android.graphics.Bitmap bitmap = sVar.f286195b.getBitmap();
        if (bitmap == null) {
            return false;
        }
        s75.d.b(new hy4.q(sVar, bitmap), "ViewCaptureHelper_SaveBitmap");
        sVar.f286195b = null;
        return false;
    }
}
