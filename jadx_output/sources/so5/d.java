package so5;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f410802a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f410803b;

    /* renamed from: c, reason: collision with root package name */
    public final uo5.q f410804c;

    /* renamed from: d, reason: collision with root package name */
    public final u26.w f410805d;

    /* renamed from: e, reason: collision with root package name */
    public final vo5.c f410806e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f410807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410808g;

    /* renamed from: h, reason: collision with root package name */
    public final int f410809h;

    public d(int i17, boolean z17, uo5.q codec, u26.w dataChannel, vo5.c dataCallbackProxy) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(dataChannel, "dataChannel");
        kotlin.jvm.internal.o.g(dataCallbackProxy, "dataCallbackProxy");
        this.f410802a = i17;
        this.f410803b = z17;
        this.f410804c = codec;
        this.f410805d = dataChannel;
        this.f410806e = dataCallbackProxy;
        this.f410807f = "MicroMsg.DecoderInfo(" + i17 + ',' + z17 + ')';
        this.f410809h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_ilink_voipmp_hwdec_lock, 0);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i(this.f410807f, "closed " + this.f410808g);
        if (this.f410808g) {
            com.tencent.mars.xlog.Log.w(this.f410807f, "already closed");
            return;
        }
        this.f410808g = true;
        this.f410805d.b(new java.util.concurrent.CancellationException("codec for (" + this.f410802a + ",hevc:" + this.f410803b + ") is closed"));
        vo5.c cVar = this.f410806e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close ");
        sb6.append(cVar.f438715a);
        com.tencent.mars.xlog.Log.i("MicroMsg.HW.ILinkVoIPDecodeDataCallbackProxy", sb6.toString());
        cVar.f438720f = true;
        if (this.f410809h != 1) {
            uo5.l lVar = (uo5.l) this.f410804c;
            com.tencent.mars.xlog.Log.i(lVar.f429726c, "stopWorking");
            lVar.a();
        } else {
            synchronized (this.f410806e) {
                uo5.l lVar2 = (uo5.l) this.f410804c;
                com.tencent.mars.xlog.Log.i(lVar2.f429726c, "stopWorking");
                lVar2.a();
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so5.d)) {
            return false;
        }
        so5.d dVar = (so5.d) obj;
        return this.f410802a == dVar.f410802a && this.f410803b == dVar.f410803b && kotlin.jvm.internal.o.b(this.f410804c, dVar.f410804c) && kotlin.jvm.internal.o.b(this.f410805d, dVar.f410805d) && kotlin.jvm.internal.o.b(this.f410806e, dVar.f410806e);
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f410802a) * 31) + java.lang.Boolean.hashCode(this.f410803b)) * 31) + this.f410804c.hashCode()) * 31) + this.f410805d.hashCode()) * 31) + this.f410806e.hashCode();
    }

    public java.lang.String toString() {
        return "DecoderInfo(mid=" + this.f410802a + ", hevc=" + this.f410803b + ", codec=" + this.f410804c + ", dataChannel=" + this.f410805d + ", dataCallbackProxy=" + this.f410806e + ')';
    }
}
