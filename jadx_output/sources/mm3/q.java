package mm3;

/* loaded from: classes10.dex */
public final class q extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.w f329671d;

    public q(mm3.w wVar) {
        this.f329671d = wVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f329671d.f329678o.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        mm3.o holder = (mm3.o) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        mm3.w wVar = this.f329671d;
        fm3.b bVar = i17 == 0 ? null : (fm3.b) wVar.f329678o.get(i17 - 1);
        if (kotlin.jvm.internal.o.b(bVar != null ? bVar.f264028a : null, wVar.f329681r)) {
            android.view.View view = holder.f329666e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = holder.f329666e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = holder.f329665d;
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = holder.f329667f;
        if (bVar != null) {
            mMAnimateView.setImageFilePath(bVar.f264030c);
            mMAnimateView.resume();
            java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            org.json.JSONObject jSONObject = bVar.f264029b;
            java.lang.String optString = jSONObject.optString(f17);
            textView.setText((optString == null && (optString = jSONObject.optString("en")) == null) ? "" : optString);
        } else {
            mMAnimateView.setImageDrawable(mMAnimateView.getContext().getDrawable(com.tencent.mm.R.raw.f489699wu));
            textView.setText("");
        }
        holder.itemView.setOnClickListener(new mm3.p(wVar, bVar, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.c4v, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new mm3.o(inflate);
    }
}
