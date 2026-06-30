package gk4;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gk4.h0 h0Var) {
        super(1);
        this.f272634d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gk4.h0 h0Var;
        dk4.a aVar;
        kk4.b it = (kk4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kk4.v vVar = (kk4.v) it;
        kk4.c cVar = vVar.f308577b;
        long propertyLong = cVar != null ? ((kk4.f0) cVar).getPropertyLong(205) : 0L;
        kk4.c cVar2 = vVar.f308577b;
        int videoWidth = cVar2 != null ? ((kk4.f0) cVar2).getVideoWidth() : 0;
        kk4.c cVar3 = vVar.f308577b;
        int videoHeight = cVar3 != null ? ((kk4.f0) cVar3).getVideoHeight() : 0;
        gk4.h0 h0Var2 = this.f272634d;
        dk4.a aVar2 = vVar.f308578c;
        h0Var2.f272580y = aVar2;
        if (videoWidth > 0 && videoHeight > 0 && propertyLong >= 0) {
            if (aVar2 != null) {
                aVar2.f234485v = videoWidth;
            }
            if (aVar2 != null) {
                aVar2.f234486w = videoHeight;
            }
            h0Var2.f272565j = videoWidth;
            this.f272634d.f272566k = videoHeight;
            dk4.a aVar3 = this.f272634d.f272580y;
            if (aVar3 != null) {
                aVar3.f234474k = (int) propertyLong;
            }
        }
        if ((!this.f272634d.f272579x.isEmpty()) && (aVar = (h0Var = this.f272634d).f272580y) != null) {
            h0Var.f272581z = h0Var.f272579x.indexOf(aVar);
        }
        com.tencent.mars.xlog.Log.i(this.f272634d.f272556a, "onPlayStarted player width:" + videoWidth + ", height:" + videoHeight + ", rotate: " + propertyLong + ", currentMediaInfoIndex:" + this.f272634d.f272581z + ", playerPosition:" + vVar.o());
        return jz5.f0.f302826a;
    }
}
