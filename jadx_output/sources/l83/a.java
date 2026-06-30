package l83;

/* loaded from: classes14.dex */
public class a implements com.tencent.mm.plugin.voip.model.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l83.c f317087a;

    public a(l83.c cVar) {
        this.f317087a = cVar;
    }

    @Override // com.tencent.mm.plugin.voip.model.b
    public int a(byte[] bArr, int i17) {
        if (!this.f317087a.f317092c) {
            return -1;
        }
        int playCallback = com.tencent.mm.plugin.ipcall.model.r.Ni().f324717a.playCallback(bArr, i17);
        if (playCallback >= 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAudioPlayer", "playCallback, error: %d", java.lang.Integer.valueOf(playCallback));
        return -1;
    }
}
