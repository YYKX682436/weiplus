package mq1;

@j95.b
/* loaded from: classes10.dex */
public class w0 extends i95.w implements mq1.g0 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f330696d;

    public static void wi() {
        if (f330696d) {
            return;
        }
        if (!com.tencent.mm.plugin.sight.base.i.f162416a) {
            fp.d0.o("xffmpeg");
            com.tencent.mm.plugin.sight.base.i.f162416a = true;
        }
        lg0.q.a();
        fp.d0.o("wechatsight_v7a");
        fp.d0.o("wechatpack");
        f330696d = true;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        int a17 = wo.r.a() >> 12;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightInitTask", "load wechatsight_v7a, core number[%d]", java.lang.Integer.valueOf(a17));
        if (a17 >= 4) {
            com.tencent.mm.plugin.sight.base.d.f162406a = 3;
            com.tencent.mm.plugin.sight.base.d.f162407b = 3;
            com.tencent.mm.plugin.sight.base.d.f162408c = 544000;
        } else {
            com.tencent.mm.plugin.sight.base.d.f162406a = 1;
            com.tencent.mm.plugin.sight.base.d.f162407b = 1;
            com.tencent.mm.plugin.sight.base.d.f162408c = 640000;
        }
    }
}
