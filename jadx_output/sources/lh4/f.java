package lh4;

/* loaded from: classes8.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f318705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lh4.h f318706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f318707f;

    public f(boolean z17, lh4.h hVar, int i17) {
        this.f318705d = z17;
        this.f318706e = hVar;
        this.f318707f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (!this.f318705d) {
            i17 = 1;
        }
        int i18 = this.f318707f;
        lh4.h hVar = this.f318706e;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            hVar.e(i18);
            return;
        }
        gh4.e0 e0Var = (gh4.e0) i95.n0.c(gh4.e0.class);
        java.lang.String field_id = ((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) hVar.getViewModel().f318724d).get(i18)).field_id;
        kotlin.jvm.internal.o.f(field_id, "field_id");
        int i19 = ((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) hVar.getViewModel().f318724d).get(i18)).field_type;
        e0Var.getClass();
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo Ai = e0Var.Ai(field_id);
        if (Ai != null) {
            com.tencent.mm.vfs.w6.c(gh4.m0.f271940b + field_id, com.tencent.mm.plugin.multitask.u0.f150506a.b(field_id));
            lk3.b aj6 = ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).aj();
            if (aj6 != null) {
                if (aj6.Y6(field_id, i19) == null) {
                    com.tencent.mm.sdk.storage.mvvm.MvvmStorage.U6(aj6, Ai, false, false, false, 14, null);
                    nk3.f.f338041a.d(Ai, 3L, 2L, "", "");
                } else {
                    com.tencent.mm.sdk.storage.mvvm.MvvmStorage.W6(aj6, Ai, false, false, 6, null);
                    nk3.f.f338041a.d(Ai, 3L, 1L, "", "");
                }
            }
        }
        db5.t7.h(hVar.getContext(), i65.a.r(hVar.getContext(), com.tencent.mm.R.string.f490307rc));
    }
}
