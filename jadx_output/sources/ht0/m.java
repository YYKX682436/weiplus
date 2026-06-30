package ht0;

/* loaded from: classes10.dex */
public class m implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.s f284707d;

    public m(ht0.s sVar) {
        this.f284707d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a aVar = this.f284707d.X;
        if (aVar != null) {
            aVar.invoke();
        }
        gs0.b bVar = this.f284707d.f284761i;
        if (bVar != null) {
            bVar.a(0L);
        }
        ht0.s sVar = this.f284707d;
        if (sVar.f284761i == null || sVar.f284767o.f253039a != ei3.l.WaitStop) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] final frame draw");
        ((ku5.t0) ku5.t0.f312615d).A("record_stop_timeout");
        this.f284707d.f284761i.b();
        ht0.a aVar2 = this.f284707d.f284760h;
        if (aVar2 != null) {
            aVar2.f(new ht0.l(this));
        }
        this.f284707d.I.e();
        return null;
    }
}
