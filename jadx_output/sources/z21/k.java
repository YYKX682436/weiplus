package z21;

/* loaded from: classes9.dex */
public class k implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.l f469644d;

    public k(z21.l lVar) {
        this.f469644d = lVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        z21.l lVar = this.f469644d;
        long k17 = com.tencent.mm.vfs.w6.k(lVar.f469650i);
        fp.k.c();
        java.lang.String str = lVar.f469650i;
        int i17 = lVar.f469649h;
        boolean z17 = lVar.f469648g;
        if (k17 - i17 < 3300 && !z17) {
            return true;
        }
        if (lVar.doScene(lVar.dispatcher(), lVar.f469645d) != -1) {
            return false;
        }
        lVar.f469647f = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
        lVar.f469645d.onSceneEnd(3, -1, "doScene failed", lVar);
        return false;
    }
}
