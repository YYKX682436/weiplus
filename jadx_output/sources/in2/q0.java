package in2;

/* loaded from: classes10.dex */
public final class q0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f292878d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f292879e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f292880f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.yg f292881g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.q f292882h;

    public q0(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f292878d = liveData;
        this.f292879e = "FinderLiveAnchorMusicEditAdapter";
        this.f292880f = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        int size = this.f292880f.size();
        zl2.r4.f473950a.M2(this.f292879e, "getItemCount " + size);
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        in2.o0 holder = (in2.o0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f292880f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        dk2.yg ygVar = (dk2.yg) obj;
        holder.f292866d.setChecked(ygVar.f234396d);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = ygVar.f234393a;
        android.widget.TextView textView = holder.f292867e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String valueOf = java.lang.String.valueOf(ygVar.f234394b);
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context2, valueOf, textSize2);
        android.widget.TextView textView2 = holder.f292869g;
        textView2.setText(j17);
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str2 = ygVar.f234400h;
        float textSize3 = textView.getTextSize();
        ((ke0.e) xVar3).getClass();
        android.text.SpannableString j18 = com.tencent.mm.pluginsdk.ui.span.c0.j(context3, str2, textSize3);
        android.widget.TextView textView3 = holder.f292870h;
        textView3.setText(j18);
        android.widget.TextView textView4 = holder.f292871i;
        kotlin.jvm.internal.o.f(textView4, "<get-auditStatus>(...)");
        in2.b1.a(textView4, ygVar);
        boolean a86 = ((mm2.c1) this.f292878d.a(mm2.c1.class)).a8();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f292868f;
        if (a86) {
            weImageView.setVisibility(8);
            if (ygVar.f234394b <= 0) {
                textView2.setText("-");
            }
            int i18 = ygVar.a() ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$MusicEditViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$MusicEditViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.CharSequence text = textView3.getText();
            if (text == null || text.length() == 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
            }
        } else {
            textView2.setVisibility(8);
            kotlin.jvm.internal.o.f(weImageView, "<get-moveBtn>(...)");
            int i19 = ygVar.a() ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(weImageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$MusicEditViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(weImageView, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$MusicEditViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setVisibility(8);
        }
        textView.setAlpha(ygVar.a() ? 1.0f : 0.3f);
        holder.itemView.setOnClickListener(new in2.p0(this, holder, i17, ygVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.an7, null);
        kotlin.jvm.internal.o.d(inflate);
        return new in2.o0(this, inflate);
    }

    public final void x(java.util.ArrayList arrayList, java.lang.String str) {
        if (zl2.q4.f473933a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str + "(MusicList):");
            if (arrayList != null) {
                int i17 = 0;
                for (java.lang.Object obj : arrayList) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    sb6.append("[" + i17 + ',' + ((dk2.yg) obj) + ']');
                    i17 = i18;
                }
            }
            com.tencent.mars.xlog.Log.i(this.f292879e, sb6.toString());
        }
    }
}
