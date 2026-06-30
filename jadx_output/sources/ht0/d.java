package ht0;

/* loaded from: classes10.dex */
public class d implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.f f284689d;

    public d(ht0.f fVar) {
        this.f284689d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ht0.f fVar = this.f284689d;
        if (fVar.f284692d.f284761i == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] final frame draw");
        ht0.s sVar = fVar.f284692d;
        sVar.f284761i.b();
        ht0.a aVar = sVar.f284760h;
        if (aVar != null) {
            aVar.f(new ht0.c(this));
        }
        sVar.I.e();
        return null;
    }
}
