package o14;

/* loaded from: classes12.dex */
public class q implements com.tencent.mm.ui.widget.dialog.w1 {
    public q(o14.r rVar) {
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        int i17;
        k14.n a17 = k14.n.a();
        synchronized (a17) {
            if (a17.f303361a && (i17 = a17.f303365e) > 0 && com.tencent.mm.app.i3.a(i17)) {
                a17.f303361a = false;
                a17.f303365e = -1;
            }
        }
    }
}
