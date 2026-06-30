package os3;

/* loaded from: classes8.dex */
public class p1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.q1 f348169d;

    public p1(os3.q1 q1Var) {
        this.f348169d = q1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os3.q1 q1Var = this.f348169d;
        ks3.v0 v0Var = q1Var.f348176d;
        int i18 = v0Var.f311758g;
        if (i18 == 0 || i18 == 1) {
            ms3.a aVar = (ms3.a) ((java.util.HashMap) q1Var.f348178f.f348227i).get(v0Var.f311755d);
            if (aVar != null) {
                gm0.j1.n().f273288b.d(aVar);
            }
        }
        ((java.util.HashMap) q1Var.f348178f.f348226h).remove(q1Var.f348176d.f311755d);
        ((java.util.HashMap) q1Var.f348178f.f348227i).remove(q1Var.f348176d.f311755d);
        q1Var.f348178f.f348223e.removeView(q1Var.f348177e);
        q1Var.f348178f.b();
    }
}
