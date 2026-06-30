package vf0;

/* loaded from: classes12.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f436123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(t21.v2 v2Var) {
        super(1);
        this.f436123d = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zz.b bVar = (zz.b) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check video dup origin, fileName = ");
        sb6.append(this.f436123d.d());
        sb6.append(" result = ");
        sb6.append(bVar != null ? bVar.toString() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.video.VideoSendFileOpFSC", sb6.toString());
        return jz5.f0.f302826a;
    }
}
