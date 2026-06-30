package z62;

/* loaded from: classes4.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsBehaviorNotifyFinderEvent f470332d;

    public a0(z62.b0 b0Var, com.tencent.mm.autogen.events.SnsBehaviorNotifyFinderEvent snsBehaviorNotifyFinderEvent) {
        this.f470332d = snsBehaviorNotifyFinderEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f470332d.f54803g.f7275a;
        if (i17 == 1) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P.e(826259965, 15);
            return;
        }
        if (i17 == 2) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P.e(826259965, 16);
        } else if (i17 == 3) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P.e(826259965, 17);
        } else {
            if (i17 != 4) {
                return;
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P.e(826259965, 18);
        }
    }
}
