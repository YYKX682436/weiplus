package zd5;

/* loaded from: classes.dex */
public final class j extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f471689d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f471690e;

    public j(java.util.ArrayList titles, yz5.l clickCallback) {
        kotlin.jvm.internal.o.g(titles, "titles");
        kotlin.jvm.internal.o.g(clickCallback, "clickCallback");
        this.f471689d = titles;
        this.f471690e = clickCallback;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f471689d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        zd5.c holder = (zd5.c) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.widget.TextView textView = holder.f471670d;
        textView.setTag(valueOf);
        textView.setText((java.lang.CharSequence) this.f471689d.get(i17));
        final yz5.l lVar = this.f471690e;
        textView.setOnClickListener(new android.view.View.OnClickListener(lVar) { // from class: zd5.i

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f471688d;

            {
                kotlin.jvm.internal.o.g(lVar, "function");
                this.f471688d = lVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiEduGirdAdapter$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f471688d.invoke(view);
                yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiEduGirdAdapter$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bc9, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new zd5.c(inflate);
    }
}
