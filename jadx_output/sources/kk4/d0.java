package kk4;

/* loaded from: classes14.dex */
public final class d0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f308521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener f308522e;

    public d0(kk4.f0 f0Var, com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        this.f308521d = f0Var;
        this.f308522e = iOnPreparedListener;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        lk4.a aVar = this.f308521d.f308539o;
        if (aVar != null) {
            int propertyLong = (int) iTPPlayer.getPropertyLong(103);
            int propertyLong2 = (int) iTPPlayer.getPropertyLong(105);
            lk4.b bVar = (lk4.b) aVar;
            bVar.f319018e = ((((propertyLong * propertyLong2) * 20) / 1000) * 16) / 8;
            int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
            int Ni = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
            java.lang.String scene = bVar.f319014a;
            kotlin.jvm.internal.o.g(scene, "scene");
            long wi6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
            bVar.f319017d = wi6;
            int aj6 = wi6 > 0 ? ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).aj(bVar.f319017d, Di, Ni, bVar.f319015b, propertyLong2, propertyLong) : 0;
            bVar.f319019f = aj6 == 0;
            com.tencent.mars.xlog.Log.i(bVar.f319016c, "init expectedFrameSize:" + bVar.f319018e + " channel: " + propertyLong + " sampleRate: " + propertyLong2 + ", hearingAid Init ret: " + aj6 + ", type: " + Di + ", device: " + Ni + ", scene: " + scene);
        }
        com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener iOnPreparedListener = this.f308522e;
        if (iOnPreparedListener != null) {
            iOnPreparedListener.onPrepared(iTPPlayer);
        }
    }
}
