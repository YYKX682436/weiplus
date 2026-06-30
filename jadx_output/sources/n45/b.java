package n45;

/* loaded from: classes8.dex */
public final class b extends n23.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f335084d = new java.util.ArrayList();

    @Override // n23.a
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeMsgItemProcessor", "[reportFetchResult] errCode = " + i17);
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21158, "", "", "", 7);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21158, "", "", "", 8);
        }
    }

    @Override // n23.a, n23.k
    public void b(jz5.l item) {
        kotlin.jvm.internal.o.g(item, "item");
        synchronized (this.f335084d) {
            java.lang.Object obj = item.f302833d;
            int i17 = ((qk.h6) ((l23.a) obj)).field_cmdid;
            java.lang.String str = ((qk.h6) ((l23.a) obj)).field_functionmsgid;
            if (this.f335084d.isEmpty()) {
                pm0.v.P("FinderLiveNoticeMsgItemProcessor", false, new n45.a(this), 1000L);
            }
            this.f335084d.add(item);
        }
    }
}
