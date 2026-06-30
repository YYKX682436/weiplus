package cp4;

/* loaded from: classes8.dex */
public final class x extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f221089d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f221090e;

    /* renamed from: f, reason: collision with root package name */
    public final cp4.u f221091f;

    public x(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f221089d = context;
        this.f221090e = new java.util.ArrayList();
        this.f221091f = new cp4.u(this);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f221090e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        android.view.View itemView = viewHolder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        java.util.ArrayList arrayList = this.f221090e;
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.is isVar = (r45.is) obj;
        if (!isVar.f377300g) {
            com.tencent.mm.protobuf.g gVar = isVar.f377297d;
            if (!android.text.TextUtils.isEmpty(gVar == null ? "" : gVar.h(com.tencent.mapsdk.internal.rv.f51270c))) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(itemView, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                itemView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(itemView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) itemView.findViewById(com.tencent.mm.R.id.f483544b62);
                mMEditText.setOnFocusChangeListener(new cp4.v(this, i17, mMEditText));
                com.tencent.mm.protobuf.g gVar2 = ((r45.is) arrayList.get(i17)).f377297d;
                mMEditText.setText(gVar2 != null ? gVar2.h(com.tencent.mapsdk.internal.rv.f51270c) : "");
                return;
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(itemView, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        itemView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(itemView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f221089d).inflate(com.tencent.mm.R.layout.a5_, parent, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new cp4.w((android.view.ViewGroup) inflate);
    }
}
