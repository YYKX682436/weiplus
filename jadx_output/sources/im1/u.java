package im1;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im1.x f292215d;

    public u(im1.x xVar) {
        this.f292215d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        im1.x xVar = this.f292215d;
        if (xVar.f292221c) {
            ((p05.l4) xVar.f292220b).t(xVar.f292228j);
            ((p05.l4) xVar.f292220b).s(12, false);
            ((p05.l4) xVar.f292220b).t(xVar.f292229k);
            ((p05.l4) xVar.f292220b).s(13, false);
            ((p05.l4) xVar.f292220b).t(xVar.f292227i);
            ((p05.l4) xVar.f292220b).s(11, false);
            ((p05.l4) xVar.f292220b).H(false);
            xVar.f292228j = 0L;
            xVar.f292229k = 0L;
            xVar.f292227i = 0L;
        }
    }
}
