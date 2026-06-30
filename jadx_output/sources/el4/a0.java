package el4;

/* loaded from: classes11.dex */
public final class a0 implements hm0.w {
    @Override // hm0.w
    public void onNetworkChange(int i17) {
        jm4.i4 Zi;
        qk.g9 bj6 = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj();
        if (bj6 == null || (Zi = ((rk4.z8) bj6).Zi()) == null) {
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        urgen.ur_0025.UR_5769.UR_34C7(((jm4.k4) Zi).getCppPointer(), (com.tencent.mars.comm.NetStatusUtil.isWifi(context) ? bw5.bq0.TingNetType_Wifi : com.tencent.mars.comm.NetStatusUtil.is5G(context) ? bw5.bq0.TingNetType_5G : com.tencent.mars.comm.NetStatusUtil.is4G(context) ? bw5.bq0.TingNetType_4G : com.tencent.mars.comm.NetStatusUtil.is3G(context) ? bw5.bq0.TingNetType_3G : com.tencent.mars.comm.NetStatusUtil.is2G(context) ? bw5.bq0.TingNetType_2G : bw5.bq0.TingNetType_Unknown).f25796d);
    }
}
