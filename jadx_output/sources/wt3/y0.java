package wt3;

/* loaded from: classes10.dex */
public final class y0 implements ek4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt3.c1 f449522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk4.a f449524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f449525d;

    public y0(wt3.c1 c1Var, java.lang.String str, dk4.a aVar, yz5.p pVar) {
        this.f449522a = c1Var;
        this.f449523b = str;
        this.f449524c = aVar;
        this.f449525d = pVar;
    }

    @Override // ek4.x
    public void a(int i17, dn.o oVar, dn.h hVar) {
        wt3.c1.a(this.f449522a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cacheAudio] onStop, mediaId:");
        sb6.append(this.f449523b);
        sb6.append(", ret:");
        sb6.append(i17);
        sb6.append(", sceneResult:");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", sb6.toString());
        yz5.p pVar = this.f449525d;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, null);
        }
    }

    @Override // ek4.x
    public void b(int i17, dn.o oVar) {
        dk4.a aVar = this.f449524c;
        java.lang.String str = this.f449523b;
        wt3.c1 c1Var = this.f449522a;
        if (i17 == 0) {
            wt3.c1.a(c1Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] start stream download ringtone success, mediaId:" + str + ", path:" + aVar.f234483t);
            return;
        }
        yz5.p pVar = this.f449525d;
        if (i17 != 1) {
            wt3.c1.a(c1Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] start cacheAudio onStart " + str + " fail: " + i17);
            if (pVar != null) {
                pVar.invoke(java.lang.Boolean.FALSE, null);
                return;
            }
            return;
        }
        wt3.c1.a(c1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] start stream download ringtone success, hit cache, mediaId:" + str + ", path:" + aVar.f234483t);
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.TRUE, aVar.f234483t);
        }
    }
}
