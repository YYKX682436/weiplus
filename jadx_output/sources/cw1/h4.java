package cw1;

/* loaded from: classes12.dex */
public final class h4 implements kn5.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f222964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f222965b;

    public h4(cw1.q4 q4Var) {
        this.f222965b = q4Var;
    }

    @Override // kn5.a
    public void a(int i17, boolean z17) {
        boolean z18 = z17 ^ this.f222964a;
        cw1.q4 q4Var = this.f222965b;
        java.util.List list = q4Var.f223267f;
        int e17 = kz5.c0.e(list, 0, list.size(), new cw1.g4(java.lang.Integer.valueOf(i17)));
        if (e17 >= 0) {
            return;
        }
        int i18 = i17 + e17 + 1;
        if (q4Var.f223269h.get(i18) == z18) {
            return;
        }
        int i19 = (-e17) - 2;
        bw1.l lVar = (bw1.l) q4Var.f223266e.get(i18);
        if (z18) {
            q4Var.f223270i += lVar.f24809a;
            q4Var.f223271m++;
        } else {
            q4Var.f223270i -= lVar.f24809a;
            q4Var.f223271m--;
        }
        q4Var.f223265d.h7(q4Var.f223270i, q4Var.f223266e.size(), q4Var.f223271m);
        q4Var.f223269h.set(i18, z18);
        q4Var.notifyItemChanged(i17, "");
        if (i19 >= 0) {
            q4Var.notifyItemChanged(((java.lang.Number) ((jz5.l) q4Var.f223267f.get(i19)).f302833d).intValue(), "");
        }
    }

    @Override // kn5.a
    public boolean b(int i17) {
        return this.f222965b.getItemViewType(i17) == 0;
    }

    @Override // kn5.a
    public boolean c(int i17) {
        cw1.q4 q4Var = this.f222965b;
        java.util.List list = q4Var.f223267f;
        int e17 = kz5.c0.e(list, 0, list.size(), new cw1.f4(java.lang.Integer.valueOf(i17)));
        if (e17 >= 0) {
            return false;
        }
        return q4Var.f223269h.get((i17 + e17) + 1) ^ this.f222964a;
    }
}
