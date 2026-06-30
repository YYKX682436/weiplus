package rm5;

/* loaded from: classes10.dex */
public final class g implements com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rm5.h f397488a;

    public g(rm5.h hVar) {
        this.f397488a = hVar;
    }

    @Override // com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener
    public final void onCompletion(com.tencent.tav.coremedia.CMTime requestedTime, android.graphics.Bitmap bitmap, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.core.AssetImageGenerator.AssetImageGeneratorResult result) {
        kotlin.jvm.internal.o.g(requestedTime, "requestedTime");
        kotlin.jvm.internal.o.g(result, "result");
        if (result != com.tencent.tav.core.AssetImageGenerator.AssetImageGeneratorResult.AssetImageGeneratorSucceeded) {
            bitmap = null;
        }
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = -1L;
        rm5.h hVar = this.f397488a;
        synchronized (hVar.f397495e) {
            kz5.h0.B(hVar.f397495e, new rm5.f(requestedTime, g0Var, bitmap));
        }
        xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "get " + this.f397488a.hashCode() + ": " + g0Var.f310121d + (char) 65292 + (requestedTime.getTimeUs() / 1000), new java.lang.Object[0]);
        rm5.h hVar2 = this.f397488a;
        hVar2.f397496f = false;
        hVar2.e();
        if (g0Var.f310121d < 0 || bitmap == null) {
            return;
        }
        rm5.c cVar = rm5.h.f397489h;
        rm5.h.f397490i.put(this.f397488a.f397492b + '-' + g0Var.f310121d, bitmap);
    }
}
