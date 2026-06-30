package ky2;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f313550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout f313552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f313553g;

    public i(int i17, ky2.w wVar, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, android.widget.TextView textView) {
        this.f313550d = i17;
        this.f313551e = wVar;
        this.f313552f = constraintLayout;
        this.f313553g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteAddViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ky2.w wVar = this.f313551e;
        int size = wVar.f313585e.size() - 1;
        int i17 = this.f313550d;
        if (i17 == size) {
            ((ky2.r) wVar.f313585e.get(i17)).f313577c = 2;
            ky2.r rVar = (ky2.r) wVar.f313585e.get(i17);
            rVar.getClass();
            rVar.f313575a = "";
            wVar.f313593p = i17;
            wVar.notifyItemChanged(i17);
            int i18 = wVar.f313586f;
            android.widget.TextView textView = this.f313553g;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f313552f;
            if (i17 < i18) {
                java.util.List list = wVar.f313585e;
                kotlin.jvm.internal.o.f(list, "access$getDataList$p(...)");
                if (!list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((ky2.r) it.next()).f313577c == 1) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteAddViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                wVar.f313585e.add(new ky2.r("", new ky2.s(false, 0, null, 7, null), 1));
                wVar.notifyItemInserted(wVar.getItemCount());
                wVar.notifyItemChanged(wVar.getItemCount());
                constraintLayout.setVisibility(0);
                textView.setVisibility(8);
            } else {
                constraintLayout.setVisibility(4);
                textView.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteAddViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
