package gx1;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.r f277323d;

    public q(gx1.r rVar) {
        this.f277323d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gx1.r rVar = this.f277323d;
        if (rVar.f277324d.f295320j != 0) {
            int i17 = rVar.f277325e.f277326e.getSelection().f341315d;
            if (i17 == rVar.f277324d.f295338s.length()) {
                rVar.f277325e.f277326e.x();
                rVar.f277325e.f277326e.getText().append((java.lang.CharSequence) "\n");
                rVar.f277325e.f277326e.B();
                rVar.f277325e.f277326e.setSelection(i17);
            }
            ix1.l lVar = rVar.f277324d;
            lVar.f295320j = 0;
            int i18 = lVar.f295321k;
            if (i18 == 1) {
                rVar.f277325e.f277326e.u(px1.v.f358862c, java.lang.Boolean.TRUE);
            } else if (i18 == 3) {
                rVar.f277325e.f277326e.u(px1.v.f358861b, java.lang.Boolean.TRUE);
            } else if (i18 == 2) {
                rVar.f277325e.f277326e.u(px1.v.f358863d, java.lang.Boolean.TRUE);
            }
        }
    }
}
