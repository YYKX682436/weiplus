package op1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f347235a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f347236b;

    public void a(int i17) {
        int i18;
        java.util.List list = this.f347236b;
        int i19 = 0;
        java.lang.String str = (list == null || list.isEmpty()) ? null : ((com.tencent.mm.plugin.ball.model.BallInfo) this.f347236b.get(0)).M.f93093p;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List list2 = this.f347236b;
        if (list2 != null) {
            int size = list2.size();
            i18 = 0;
            while (i19 < size) {
                int i27 = ((com.tencent.mm.plugin.ball.model.BallInfo) this.f347236b.get(i19)).H;
                if (i27 == 8 || i27 == 4) {
                    i27 = 4;
                }
                i18 |= i27;
                if (i19 != 0) {
                    sb6.append(";");
                }
                sb6.append(((com.tencent.mm.plugin.ball.model.BallInfo) this.f347236b.get(i19)).M.f93092o);
                i19++;
            }
            i19 = size;
        } else {
            i18 = 0;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(17603, java.lang.String.format("%s,%d,%d,%d,%d,%d,%s", str, java.lang.Long.valueOf(this.f347235a), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), sb6.toString()));
        this.f347235a = -1L;
    }
}
