package ni2;

/* loaded from: classes10.dex */
public final class f0 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.h0 f337290a;

    public f0(ni2.h0 h0Var) {
        this.f337290a = h0Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        boolean z18;
        int i17;
        int i18 = 2;
        ni2.h0 h0Var = this.f337290a;
        if (!z17) {
            h0Var.g(new java.util.ArrayList());
            h0Var.f337317s.setVisibility(0);
            if (h0Var.f337322x == 2) {
                h0Var.b(false);
                i17 = 3;
            } else {
                h0Var.d(false);
                i17 = 1;
            }
            h0Var.f337321w = i17;
            h0Var.k(h0Var.f337306e.g());
            h0Var.e(h0Var.f337321w != h0Var.f337320v);
            return;
        }
        if (h0Var.f()) {
            int i19 = h0Var.f337322x;
            zh2.c cVar = h0Var.f337306e;
            if (i19 == 2 || ((mm2.o4) cVar.g().a(mm2.o4.class)).f329327v.size() < 4) {
                z18 = true;
            } else {
                android.content.Context context = h0Var.f337308g;
                db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.f491593dm4));
                z18 = false;
            }
            if (z18) {
                if (h0Var.f337322x == 2) {
                    h0Var.l(4, h0Var.a());
                    i18 = 4;
                } else {
                    h0Var.l(2, h0Var.c());
                }
                h0Var.f337321w = i18;
                h0Var.k(cVar.g());
                h0Var.e(h0Var.f337321w != h0Var.f337320v);
                return;
            }
        }
        h0Var.f337316r.setCheck(false);
    }
}
