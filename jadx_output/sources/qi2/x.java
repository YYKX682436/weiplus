package qi2;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.z f363653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.c0 f363654e;

    public x(qi2.z zVar, qi2.c0 c0Var) {
        this.f363653d = zVar;
        this.f363654e = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorTeamPkApplyPanelWidget$TeamViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qi2.z zVar = this.f363653d;
        if (zVar.f363668k) {
            qi2.c0 c0Var = this.f363654e;
            c0Var.getClass();
            fj2.k kVar = zVar.f363663f;
            fj2.k kVar2 = fj2.k.f263175d;
            java.util.LinkedList linkedList = c0Var.f363507p;
            java.util.LinkedList linkedList2 = c0Var.f363506o;
            if (kVar == kVar2) {
                if (linkedList.size() <= 2) {
                    zVar.a(fj2.k.f263176e);
                    fg2.g gVar = c0Var.f363505n;
                    if (gVar == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    android.widget.LinearLayout blueTeamLayout = gVar.f262034b;
                    kotlin.jvm.internal.o.f(blueTeamLayout, "blueTeamLayout");
                    c0Var.z(zVar, blueTeamLayout);
                    km2.q qVar = zVar.f363664g;
                    if (qVar != null) {
                        linkedList2.remove(qVar);
                        linkedList.add(qVar);
                    }
                }
            } else if (linkedList2.size() <= 2) {
                zVar.a(kVar2);
                fg2.g gVar2 = c0Var.f363505n;
                if (gVar2 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                android.widget.LinearLayout redTeamLayout = gVar2.f262039g;
                kotlin.jvm.internal.o.f(redTeamLayout, "redTeamLayout");
                c0Var.z(zVar, redTeamLayout);
                km2.q qVar2 = zVar.f363664g;
                if (qVar2 != null) {
                    linkedList.remove(qVar2);
                    linkedList2.add(qVar2);
                }
            }
            c0Var.C();
        } else {
            db5.t7.makeText(zVar.f363658a.getContext(), com.tencent.mm.R.string.eg9, 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorTeamPkApplyPanelWidget$TeamViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
