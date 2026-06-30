package z21;

/* loaded from: classes9.dex */
public class i implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.j f469600d;

    public i(z21.j jVar) {
        this.f469600d = jVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        z21.j jVar = this.f469600d;
        long k17 = com.tencent.mm.vfs.w6.k(jVar.f469610h);
        fp.k.c();
        java.lang.String str = jVar.f469610h;
        int i17 = jVar.f469609g;
        boolean z17 = jVar.f469613n;
        if (k17 - i17 < 3300 && !z17) {
            return true;
        }
        if (jVar.doScene(jVar.dispatcher(), jVar.f469606d) != -1) {
            return false;
        }
        jVar.f469608f = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
        jVar.f469606d.onSceneEnd(3, -1, "doScene failed", jVar);
        return false;
    }
}
