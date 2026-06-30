package wv1;

/* loaded from: classes12.dex */
public class c extends wv1.a {

    /* renamed from: f, reason: collision with root package name */
    public final long f449936f;

    public c(com.tencent.mm.plugin.choosemsgfile.logic.ui.w wVar, long j17) {
        super(wVar);
        this.f449936f = j17;
    }

    @Override // wv1.a
    public long g() {
        return this.f449936f;
    }

    @Override // wv1.a
    public int h() {
        return 0;
    }

    @Override // wv1.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(wv1.l lVar, int i17, wv1.a aVar) {
        com.tencent.mm.plugin.choosemsgfile.logic.ui.w wVar = this.f449929a;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.a aVar2 = (com.tencent.mm.plugin.choosemsgfile.logic.ui.a) wVar;
        if (i17 != aVar2.getItemCount() - 1) {
            long g17 = aVar2.x(i17 + 1).g();
            com.tencent.mm.sdk.platformtools.r2 r2Var = xv1.d.f457391a;
            long a17 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(g17));
            long j17 = this.f449936f;
            if (a17 == com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(j17))) {
                lVar.f449955e.setVisibility(0);
                lVar.f449955e.setText(com.tencent.mm.ui.gridviewheaders.a.e().d(new java.util.Date(j17), com.tencent.mm.sdk.platformtools.x2.f193071a));
                boolean o17 = wVar.o();
                android.widget.ProgressBar progressBar = lVar.f449956f;
                if (o17) {
                    progressBar.setVisibility(0);
                    return;
                } else {
                    progressBar.setVisibility(8);
                    return;
                }
            }
        }
        lVar.f449955e.setVisibility(8);
    }
}
