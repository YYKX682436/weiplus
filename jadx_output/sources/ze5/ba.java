package ze5;

/* loaded from: classes9.dex */
public class ba implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f471855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f471856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk4.k f471857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fk4.k f471858g;

    public ba(t21.v2 v2Var, t21.v2 v2Var2, fk4.k kVar, fk4.k kVar2) {
        this.f471855d = v2Var;
        this.f471856e = v2Var2;
        this.f471857f = kVar;
        this.f471858g = kVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        java.util.Map map = ze5.ia.f472008o;
        t21.v2 v2Var = this.f471855d;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) map).get(v2Var.d());
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoItemHolder", "update status, filename %s, holder not found", v2Var.d());
            return;
        }
        final ze5.ia iaVar = (ze5.ia) weakReference.get();
        if (iaVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoItemHolder", "update status, filename %s, holder gc!", v2Var.d());
            return;
        }
        z01.j0 viewModel = iaVar.f472009b.getViewModel();
        if (viewModel == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoItemHolder", "videoViewModel is null,filename:" + v2Var.d());
            return;
        }
        iaVar.f472010c.setVisibility(8);
        int i19 = v2Var.f415011i;
        viewModel.f469067h = i19;
        viewModel.f469066g = i19 == 198;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoItemHolder", "updateStatus videoStatus : " + i19, ",fileName : " + v2Var.d());
        boolean b17 = ze5.ia.b();
        t21.v2 v2Var2 = this.f471856e;
        if (b17) {
            iaVar.f472012e.setVisibility(8);
            if (v2Var2 != null && this.f471857f != null) {
                int m17 = t21.d3.m(v2Var);
                if (v2Var2.f415011i == 199) {
                    com.tencent.mm.ui.chatting.gallery.l.f201163a.d(v2Var.f415016n);
                    z01.i0 i0Var = viewModel.f469074r;
                    if (i0Var.f469054d && i0Var.f469057g == z01.h0.f469048e) {
                        viewModel.f469067h = i19;
                        i0Var.f469054d = false;
                        i0Var.a(true);
                        viewModel.f469074r = i0Var;
                        iaVar.f472009b.postDelayed(new java.lang.Runnable() { // from class: ze5.ba$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ze5.ia iaVar2 = ze5.ia.this;
                                z01.j0 viewModel2 = iaVar2.f472009b.getViewModel();
                                viewModel2.f469074r.a(false);
                                iaVar2.f472009b.setViewModel(viewModel2);
                            }
                        }, 3000L);
                    }
                } else {
                    z01.i0 i0Var2 = viewModel.f469074r;
                    i0Var2.f469054d = true;
                    i0Var2.f469057g = z01.h0.f469048e;
                    i0Var2.a(false);
                    viewModel.f469074r.f469058h = m17;
                }
            } else if (this.f471858g == null || !((i17 = v2Var.f415011i) == 120 || i17 == 199 || i17 == 121 || i17 == 122)) {
                if (t21.d3.s()) {
                    iaVar.f472012e.setVisibility(8);
                    iaVar.f472009b.setOriginVideoStatusAreaVisibility(0);
                    viewModel.f469077u = t21.d3.n(v2Var);
                } else {
                    com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = iaVar.f472012e;
                    int i27 = v2Var.f415008f;
                    mMPinProgressBtn.setProgress(i27 == 0 ? 0 : (int) ((v2Var.f415006d * 100) / i27));
                }
                viewModel.f469074r.f469054d = false;
            } else {
                int g17 = t21.d3.g(v2Var);
                if (v2Var.f415011i == 199) {
                    com.tencent.mm.ui.chatting.gallery.p.f201254a.c(v2Var.f415016n);
                    z01.i0 i0Var3 = viewModel.f469074r;
                    if (i0Var3.f469054d && i0Var3.f469057g == z01.h0.f469049f) {
                        viewModel.f469067h = i19;
                        i0Var3.f469054d = false;
                        i0Var3.a(true);
                        viewModel.f469074r = i0Var3;
                        iaVar.f472009b.postDelayed(new ze5.da(this, iaVar), 3000L);
                    }
                } else {
                    z01.i0 i0Var4 = viewModel.f469074r;
                    i0Var4.f469054d = true;
                    i0Var4.f469057g = z01.h0.f469049f;
                    i0Var4.a(false);
                    viewModel.f469074r.f469058h = g17;
                }
            }
        } else {
            iaVar.f472012e.setVisibility(0);
            if (i19 == 112 || i19 == 122 || i19 == 120 || (v2Var2 != null && ((i18 = v2Var2.f415011i) == 120 || i18 == 199))) {
                if (v2Var2 != null) {
                    iaVar.f472012e.setVisibility(8);
                    if (v2Var2.f415011i == 120) {
                        viewModel.f469073q = t21.d3.m(v2Var);
                        viewModel.f469071o = true;
                    }
                    if (v2Var2.f415011i == 199) {
                        com.tencent.mm.ui.chatting.gallery.l.f201163a.d(v2Var.f415016n);
                        if (viewModel.f469071o) {
                            viewModel.f469067h = i19;
                            viewModel.f469071o = false;
                            viewModel.f469072p = true;
                            iaVar.f472009b.postDelayed(new ze5.ca(this, iaVar), 2000L);
                        }
                    }
                } else {
                    iaVar.f472012e.setProgress(t21.d3.g(v2Var));
                }
            } else if (t21.d3.s()) {
                iaVar.f472012e.setVisibility(8);
                iaVar.f472009b.setOriginVideoStatusAreaVisibility(0);
                viewModel.f469077u = t21.d3.n(v2Var);
            } else {
                com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn2 = iaVar.f472012e;
                int i28 = v2Var.f415008f;
                mMPinProgressBtn2.setProgress(i28 != 0 ? (int) ((v2Var.f415006d * 100) / i28) : 0);
            }
        }
        iaVar.f472009b.setViewModel(viewModel);
    }
}
