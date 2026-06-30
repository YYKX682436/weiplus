package n34;

/* loaded from: classes4.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f334573d;

    public c3(r45.h70 h70Var) {
        this.f334573d = h70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$1");
        java.util.LinkedList tracks = this.f334573d.f375897d;
        kotlin.jvm.internal.o.f(tracks, "tracks");
        java.util.Iterator it = tracks.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.ho6) obj).f376334e == 2) {
                    break;
                }
            }
        }
        r45.ho6 ho6Var = (r45.ho6) obj;
        if (ho6Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$1");
            return;
        }
        java.lang.String d17 = dw3.h.d(dw3.h.f244211a, null, null, 3, null);
        com.tencent.mm.vfs.w6.c(ho6Var.f376333d, d17);
        ho6Var.f376333d = d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFinderPostManager", "compositionInfo copy finish");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$1");
    }
}
