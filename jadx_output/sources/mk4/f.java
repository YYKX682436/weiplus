package mk4;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk4.h f327149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mk4.h hVar) {
        super(0);
        this.f327149d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mk4.h hVar = this.f327149d;
        com.tencent.mars.xlog.Log.w(hVar.d(), "dismissCoverBitmapInternal captureBitmap:" + hVar.f327158e + '.');
        hVar.f327154a.removeView(hVar.f327156c);
        return jz5.f0.f302826a;
    }
}
