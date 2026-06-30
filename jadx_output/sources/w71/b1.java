package w71;

/* loaded from: classes14.dex */
public abstract class b1 {
    public static final w71.a1 a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            return w71.a1.f443381g;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            return w71.a1.f443382h;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            return w71.a1.f443383i;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
            return w71.a1.f443384m;
        }
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
        return netType != -1 ? netType != 0 ? w71.a1.f443379e : w71.a1.f443380f : w71.a1.f443385n;
    }
}
