package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class w4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f125963d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125964e;

    /* renamed from: f, reason: collision with root package name */
    public int f125965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderTopicSearchUI f125966g;

    public w4(com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 4 : i17;
        this.f125966g = finderTopicSearchUI;
        this.f125963d = i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        int i17 = this.f125963d;
        com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI = this.f125966g;
        if (i17 == 3 && finderTopicSearchUI.f125595i.size() != 0) {
            this.f125965f = 0;
            this.f125964e = false;
            java.util.Iterator it = finderTopicSearchUI.f125595i.iterator();
            while (it.hasNext()) {
                r45.r03 r03Var = (r45.r03) ((r45.t03) it.next()).getCustom(0);
                boolean z17 = r03Var != null && r03Var.getInteger(5) > 0;
                this.f125964e = z17;
                if (!z17) {
                    break;
                }
                this.f125965f++;
            }
            if (this.f125964e) {
                return this.f125965f == finderTopicSearchUI.f125595i.size() ? finderTopicSearchUI.f125595i.size() : finderTopicSearchUI.f125595i.size() + 2;
            }
        }
        return finderTopicSearchUI.f125595i.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (this.f125963d != 4 || !this.f125964e || this.f125965f == this.f125966g.f125595i.size()) {
            return 3;
        }
        if (i17 == 0) {
            return 1;
        }
        return i17 == this.f125965f + 1 ? 2 : 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        x(holder, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI = this.f125966g;
        if (i17 == 3) {
            androidx.appcompat.app.AppCompatActivity context = finderTopicSearchUI.getContext();
            kotlin.jvm.internal.o.d(context);
            android.view.View inflate = context.getLayoutInflater().inflate(com.tencent.mm.R.layout.f488820aj4, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new com.tencent.mm.plugin.finder.search.v2(inflate, false, false, false, 14, null);
        }
        androidx.appcompat.app.AppCompatActivity context2 = finderTopicSearchUI.getContext();
        kotlin.jvm.internal.o.d(context2);
        android.view.View inflate2 = context2.getLayoutInflater().inflate(com.tencent.mm.R.layout.b5j, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new com.tencent.mm.plugin.finder.search.v4(finderTopicSearchUI, inflate2);
    }

    public final void x(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        boolean z17 = k3Var instanceof com.tencent.mm.plugin.finder.search.v4;
        com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI = this.f125966g;
        if (z17) {
            if (getItemViewType(i17) == 1) {
                ((com.tencent.mm.plugin.finder.search.v4) k3Var).f125946d.setText(finderTopicSearchUI.getString(com.tencent.mm.R.string.cqb));
                return;
            } else {
                ((com.tencent.mm.plugin.finder.search.v4) k3Var).f125946d.setText(finderTopicSearchUI.getString(com.tencent.mm.R.string.cqd));
                return;
            }
        }
        r45.t03 t03Var = (this.f125963d == 4 && this.f125964e && this.f125965f != finderTopicSearchUI.f125595i.size()) ? i17 < this.f125965f + 1 ? (r45.t03) finderTopicSearchUI.f125595i.get(i17 - 1) : (r45.t03) finderTopicSearchUI.f125595i.get(i17 - 2) : (r45.t03) finderTopicSearchUI.f125595i.get(i17);
        kotlin.jvm.internal.o.d(t03Var);
        r45.r03 r03Var = (r45.r03) t03Var.getCustom(0);
        if (r03Var == null || (str = r03Var.getString(0)) == null) {
            str = "";
        }
        java.util.HashMap hashMap = finderTopicSearchUI.f125599p;
        if (!hashMap.containsKey(str)) {
            com.tencent.mm.plugin.finder.search.e0 e0Var = new com.tencent.mm.plugin.finder.search.e0();
            e0Var.f125666b = str;
            e0Var.f125665a = i17;
            e0Var.f125667c = 1;
            e0Var.f125668d = java.lang.System.currentTimeMillis();
            hashMap.put(str, e0Var);
            if (hashMap.size() % 30 == 0) {
                finderTopicSearchUI.W6(false);
            }
        }
        r45.r03 r03Var2 = (r45.r03) t03Var.getCustom(0);
        if (r03Var2 != null) {
            android.widget.TextView textView = (android.widget.TextView) k3Var.itemView.findViewById(com.tencent.mm.R.id.gbc);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = k3Var.itemView.getContext();
            java.lang.String string = r03Var2.getString(0);
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
            ((android.widget.TextView) k3Var.itemView.findViewById(com.tencent.mm.R.id.gbb)).setText(k3Var.itemView.getContext().getString(com.tencent.mm.R.string.f491951er4, com.tencent.mm.plugin.finder.assist.w2.g(2, r03Var2.getInteger(2))));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        x(holder, i17);
    }
}
