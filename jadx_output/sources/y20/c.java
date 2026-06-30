package y20;

/* loaded from: classes.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f458993d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f458994e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f458995f;

    public c(java.util.List options, java.lang.Object obj, yz5.l onItemClick) {
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        this.f458993d = options;
        this.f458994e = obj;
        this.f458995f = onItemClick;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f458993d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        y20.b holder = (y20.b) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        qq.c option = (qq.c) this.f458993d.get(i17);
        kotlin.jvm.internal.o.g(option, "option");
        yz5.l onItemClick = this.f458995f;
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(option.f365860a);
        sb6.append(" (");
        java.lang.Object obj = option.f365861b;
        sb6.append(obj);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        android.widget.TextView textView = holder.f458990d;
        textView.setText(sb7);
        if (kotlin.jvm.internal.o.b(obj, this.f458994e)) {
            android.view.View view = holder.f458991e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/ecs/test/EcsTestModels$ConfigOption;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/ecs/test/EcsTestModels$ConfigOption;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setTextColor(holder.itemView.getContext().getColor(com.tencent.mm.R.color.f478839aj0));
        } else {
            android.view.View view2 = holder.f458991e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/ecs/test/EcsTestModels$ConfigOption;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/ecs/test/EcsTestModels$ConfigOption;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setTextColor(holder.itemView.getContext().getColor(com.tencent.mm.R.color.amz));
        }
        holder.itemView.setOnClickListener(new y20.a(onItemClick, option));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e4n, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new y20.b(inflate);
    }
}
