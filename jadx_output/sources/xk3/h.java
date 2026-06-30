package xk3;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk3.i f455036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uk3.a f455037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f455038f;

    public h(xk3.i iVar, uk3.a aVar, in5.s0 s0Var) {
        this.f455036d = iVar;
        this.f455037e = aVar;
        this.f455038f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitask/ui/minusscreen/view/MinusScreenRoundCornerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vk3.a aVar = this.f455036d.f455040f;
        if (aVar != null) {
            zk3.x xVar = (zk3.x) aVar;
            in5.s0 holder = this.f455038f;
            kotlin.jvm.internal.o.g(holder, "holder");
            uk3.a aVar2 = this.f455037e;
            if (aVar2 != null && (multiTaskInfo = aVar2.f428524d) != null) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.i1.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.multitask.j0.We((com.tencent.mm.plugin.multitask.j0) c17, multiTaskInfo.field_id, multiTaskInfo.field_type, false, 4, null);
                nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
                zk3.g0 g0Var = xVar.f473522a;
                if (kr4Var != null) {
                    long a76 = g0Var.a7(multiTaskInfo.field_id, multiTaskInfo.field_type);
                    java.lang.String string2 = kr4Var.getString(4);
                    int i17 = multiTaskInfo.field_type;
                    if (i17 == 2 || i17 == 26) {
                        r45.k97 k97Var = new r45.k97();
                        try {
                            k97Var.parseFrom(multiTaskInfo.field_data);
                        } catch (java.lang.Exception unused) {
                        }
                        string = k97Var.getString(1);
                    } else {
                        string = string2;
                    }
                    nk3.f.f338041a.c(aVar2.f428524d, a76, 3L, string, kr4Var);
                }
                if (((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di()) {
                    android.app.Activity context2 = g0Var.getContext();
                    int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
                    e4Var.d(com.tencent.mm.R.string.o9v);
                    e4Var.c();
                }
            }
            if (holder.getAdapterPosition() <= 1 && ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di()) {
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.multitask.i1.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                com.tencent.mm.plugin.multitask.j0.Ff((com.tencent.mm.plugin.multitask.j0) c18, 6, null, 0, 6, null);
            }
            com.tencent.mm.plugin.multitask.j0 j0Var = (com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class);
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = aVar2 != null ? aVar2.f428524d : null;
            ((com.tencent.mm.plugin.multitask.i1) j0Var).getClass();
            java.util.Iterator it = com.tencent.mm.plugin.multitask.i1.f150444x.iterator();
            while (it.hasNext()) {
                ((jk3.d) it.next()).a(1, multiTaskInfo2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitask/ui/minusscreen/view/MinusScreenRoundCornerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
