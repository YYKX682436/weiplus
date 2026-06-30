package o;

/* loaded from: classes15.dex */
public class j implements androidx.appcompat.widget.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.l f341721d;

    public j(o.l lVar) {
        this.f341721d = lVar;
    }

    @Override // androidx.appcompat.widget.m1
    public void a(o.r rVar, android.view.MenuItem menuItem) {
        o.l lVar = this.f341721d;
        lVar.f341730m.removeCallbacksAndMessages(null);
        int size = ((java.util.ArrayList) lVar.f341732o).size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                i17 = -1;
                break;
            } else if (rVar == ((o.k) ((java.util.ArrayList) lVar.f341732o).get(i17)).f341723b) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 == -1) {
            return;
        }
        int i18 = i17 + 1;
        lVar.f341730m.postAtTime(new o.i(this, i18 < ((java.util.ArrayList) lVar.f341732o).size() ? (o.k) ((java.util.ArrayList) lVar.f341732o).get(i18) : null, menuItem, rVar), rVar, android.os.SystemClock.uptimeMillis() + 200);
    }

    @Override // androidx.appcompat.widget.m1
    public void b(o.r rVar, android.view.MenuItem menuItem) {
        this.f341721d.f341730m.removeCallbacksAndMessages(rVar);
    }
}
