package dl3;

/* loaded from: classes13.dex */
public class t implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl3.i f235346a;

    public t(dl3.i iVar) {
        this.f235346a = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.h5
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "onPhoneCall state:%d", java.lang.Integer.valueOf(i17));
        synchronized (this.f235346a.f235332y) {
            java.util.Iterator it = this.f235346a.f235332y.iterator();
            while (it.hasNext()) {
                dl3.v vVar = (dl3.v) ((dl3.w) it.next());
                vVar.getClass();
                if (i17 != 0) {
                    if (i17 == 1 || i17 == 2) {
                        dl3.d0 d0Var = (dl3.d0) vVar;
                        if (d0Var.i()) {
                            vVar.f235347a = true;
                            d0Var.pause();
                        }
                    }
                } else if (vVar.f235347a) {
                    vVar.f235347a = false;
                    ((dl3.d0) vVar).resume();
                }
            }
        }
    }
}
