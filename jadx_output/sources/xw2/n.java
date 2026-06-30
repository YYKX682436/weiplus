package xw2;

/* loaded from: classes2.dex */
public final class n extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457710d;

    public n(xw2.s sVar) {
        this.f457710d = sVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        xw2.s sVar = this.f457710d;
        ((com.tencent.mm.plugin.finder.viewmodel.component.h00) sVar.getViewModel()).getClass();
        return sVar.c((java.util.List) ((kotlinx.coroutines.flow.h3) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d).getValue()).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int currentGroupCount;
        xw2.o holder = (xw2.o) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        xw2.s sVar = this.f457710d;
        currentGroupCount = sVar.getCurrentGroupCount();
        for (int i18 = 0; i18 < currentGroupCount; i18++) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.h00) sVar.getViewModel()).getClass();
            kotlinx.coroutines.flow.j2 j2Var = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d;
            java.util.Objects.toString(xw2.s.b(sVar, (java.util.List) ((kotlinx.coroutines.flow.h3) j2Var).getValue(), i17, i18));
            android.view.View childAt = linearLayout.getChildAt(i18);
            childAt.setOnClickListener(new xw2.h(sVar, i17, i18));
            childAt.setOnLongClickListener(new xw2.i(sVar, i17, i18));
            xw2.u viewModel = sVar.getViewModel();
            ((com.tencent.mm.plugin.finder.viewmodel.component.h00) sVar.getViewModel()).getClass();
            ((com.tencent.mm.plugin.finder.viewmodel.component.h00) viewModel).S6(j2Var, new xw2.j(sVar, i17, i18, null), new xw2.k(i17, i18, sVar, childAt));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        int currentGroupCount;
        kotlin.jvm.internal.o.g(parent, "parent");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(parent.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        xw2.s sVar = this.f457710d;
        currentGroupCount = sVar.getCurrentGroupCount();
        for (int i18 = 0; i18 < currentGroupCount; i18++) {
            linearLayout.addView(android.view.LayoutInflater.from(parent.getContext()).inflate(sVar.getItemResource(), (android.view.ViewGroup) linearLayout, false));
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.h00) sVar.getViewModel()).S6(((com.tencent.mm.plugin.finder.viewmodel.component.h00) sVar.getViewModel()).f134568f, new xw2.l(null), new xw2.m(linearLayout, parent, sVar));
        return new xw2.o(linearLayout);
    }
}
