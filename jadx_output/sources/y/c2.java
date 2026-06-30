package y;

/* loaded from: classes16.dex */
public final class c2 extends androidx.recyclerview.widget.f2 {
    public final /* synthetic */ mi2.h S1;

    public c2(mi2.h hVar) {
        this.S1 = hVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.S1.f326755l1.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        y.e2 holder = (y.e2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        mi2.h hVar = this.S1;
        java.lang.Object obj = hVar.f326755l1.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        y.d2 d2Var = (y.d2) obj;
        holder.f458339p1.setText(d2Var.f458328a);
        holder.f458340x1.setVisibility(d2Var.f458329b ? 0 : 8);
        android.view.View view = holder.f458341y1;
        int i18 = i17 != 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.itemView.setOnClickListener(new y.b2(hVar, d2Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup p07, int i17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        android.view.View inflate = android.view.LayoutInflater.from(p07.getContext()).inflate(com.tencent.mm.R.layout.auh, p07, false);
        kotlin.jvm.internal.o.d(inflate);
        return new y.e2(this.S1, inflate);
    }
}
