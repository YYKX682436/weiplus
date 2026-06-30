package zk3;

/* loaded from: classes8.dex */
public final class p implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473487a;

    public p(zk3.g0 g0Var) {
        this.f473487a = g0Var;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        java.util.Iterator it;
        long j17;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.Iterator it6 = data.f293156i.iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.x0 x0Var = (in5.x0) next;
            if (x0Var.f293158a instanceof uk3.a) {
                zk3.g0 g0Var = this.f473487a;
                androidx.appcompat.app.AppCompatActivity activity = g0Var.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                if (((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).Y6()) {
                    in5.c cVar = x0Var.f293158a;
                    kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.minusscreen.data.RVMultiTaskData");
                    nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                    android.content.Context context = recyclerView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
                    com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = ((uk3.a) cVar).f428524d;
                    long a76 = g0Var.a7(multiTaskInfo.field_id, multiTaskInfo.field_type);
                    if (kr4Var != null) {
                        java.lang.String string = kr4Var.getString(4);
                        int i19 = multiTaskInfo.field_type;
                        if (i19 == 2 || i19 == 26) {
                            r45.k97 k97Var = new r45.k97();
                            try {
                                k97Var.parseFrom(multiTaskInfo.field_data);
                            } catch (java.lang.Exception unused) {
                            }
                            string = k97Var.getString(1);
                        }
                        java.lang.String str = string;
                        nk3.f fVar = nk3.f.f338041a;
                        java.lang.String field_id = multiTaskInfo.field_id;
                        kotlin.jvm.internal.o.f(field_id, "field_id");
                        nk3.f.f338042b.put(field_id, java.lang.Long.valueOf(c01.id.c()));
                        it = it6;
                        j17 = a76;
                        fVar.c(multiTaskInfo, a76, 1L, str, kr4Var);
                    } else {
                        it = it6;
                        j17 = a76;
                    }
                    zk3.h hVar = g0Var.f473459q;
                    if (hVar != null) {
                        pm0.v.X(new yk3.f((yk3.i) hVar, multiTaskInfo, (int) j17));
                    }
                    it6 = it;
                    i17 = i18;
                }
            }
            it = it6;
            it6 = it;
            i17 = i18;
        }
    }
}
