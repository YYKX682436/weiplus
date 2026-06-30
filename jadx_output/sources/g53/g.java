package g53;

/* loaded from: classes8.dex */
public final class g extends com.tencent.mm.network.r0 {
    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWeakNetReceiver.MMReceiver", "mmNetEventReceiver.onNetworkChange(status:" + i17 + ')');
        g53.i iVar = g53.i.f268912a;
        g53.i.f268916e = i17;
        g53.i.a(g53.i.f268912a);
    }
}
