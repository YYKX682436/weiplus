package wt3;

/* loaded from: classes5.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.c1 f449383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f449384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f449385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(wt3.c1 c1Var, yz5.p pVar, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        super(2);
        this.f449383d = c1Var;
        this.f449384e = pVar;
        this.f449385f = audioCacheInfo;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        wt3.c1 c1Var = this.f449383d;
        wt3.c1.a(c1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cacheAudio callback ");
        sb6.append(booleanValue);
        sb6.append(", ");
        yz5.p pVar = this.f449384e;
        sb6.append(pVar == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", sb6.toString());
        c1Var.f449388a.remove(java.lang.Integer.valueOf(this.f449385f.f155711e));
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(booleanValue), str);
        }
        return jz5.f0.f302826a;
    }
}
