package ej2;

/* loaded from: classes10.dex */
public final class l implements si2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ej2.n f253314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gk2.e f253315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f253316c;

    public l(ej2.n nVar, gk2.e eVar, android.view.View view) {
        this.f253314a = nVar;
        this.f253315b = eVar;
        this.f253316c = view;
    }

    @Override // si2.c
    public void b(int i17, km2.q hungupUser) {
        kotlin.jvm.internal.o.g(hungupUser, "hungupUser");
        if (i17 != -1) {
            ej2.n nVar = this.f253314a;
            if (i17 < nVar.a().getItemCount()) {
                hungupUser.z();
                ((mm2.o4) this.f253315b.a(mm2.o4.class)).O7(hungupUser);
                ((com.tencent.mm.plugin.finder.live.plugin.u7) nVar.f253318o).b(hungupUser);
                nVar.a().notifyItemChanged(i17);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // si2.c
    public void c(int i17, km2.q selectedUser) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(selectedUser, "selectedUser");
        ej2.n nVar = this.f253314a;
        java.util.Iterator it = nVar.f253309l.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            km2.q qVar = ((vi2.i) next).f437552d;
            if (com.tencent.mm.sdk.platformtools.t8.D0(qVar != null ? qVar.f309170a : null, selectedUser.f309170a)) {
                str = next;
                break;
            }
        }
        if (str == null) {
            android.view.View view = this.f253316c;
            db5.t7.makeText(view.getContext(), view.getContext().getResources().getString(com.tencent.mm.R.string.dnn), 0).show();
            return;
        }
        gk2.e eVar = nVar.f253299b;
        if (eVar == null || !(((mm2.y2) eVar.a(mm2.y2.class)).O6(true) ^ true)) {
            int j17 = nVar.a().j(selectedUser);
            yh2.k a17 = nVar.a();
            nVar.getClass();
            if (j17 == -1 || j17 >= a17.getItemCount()) {
                return;
            }
            selectedUser.z();
            gk2.e eVar2 = nVar.f253299b;
            if (eVar2 != null) {
                ((mm2.o4) eVar2.a(mm2.o4.class)).O7(selectedUser);
            }
            zh2.e eVar3 = nVar.f253318o;
            if (eVar3 != null) {
                ((com.tencent.mm.plugin.finder.live.plugin.u7) eVar3).a(selectedUser);
            }
            a17.notifyItemChanged(j17);
        }
    }
}
