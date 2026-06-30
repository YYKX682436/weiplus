package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ac extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f128857d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostAtUI f128858e;

    public ac(com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI) {
        this.f128858e = finderPostAtUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        boolean z17 = this.f128857d;
        com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI = this.f128858e;
        return (z17 ? 1 : 0) + (finderPostAtUI.f128645u.size() == 0 ? 0 : finderPostAtUI.f128645u.size() + 1) + (finderPostAtUI.f128644t.size() != 0 ? finderPostAtUI.f128644t.size() + 1 : 0);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (!this.f128857d) {
            i17++;
        }
        if (i17 == 0) {
            return 1;
        }
        com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI = this.f128858e;
        if (finderPostAtUI.f128645u.size() <= 0) {
            return i17 == 1 ? 4 : 5;
        }
        if (i17 == 1) {
            return 2;
        }
        if (i17 == finderPostAtUI.f128645u.size() + 2) {
            return 4;
        }
        return i17 > finderPostAtUI.f128645u.size() + 2 ? 5 : 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        ya2.b2 b2Var;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        java.lang.String str;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        boolean z17 = viewHolder instanceof com.tencent.mm.plugin.finder.ui.qb;
        com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI = this.f128858e;
        if (!z17) {
            if (viewHolder instanceof com.tencent.mm.plugin.finder.ui.sb) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewHolder.itemView.findViewById(com.tencent.mm.R.id.meo);
                int dimension = (int) viewHolder.itemView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
                viewGroup.setPadding(dimension, 0, dimension, dimension);
                viewGroup.setBackgroundResource(com.tencent.mm.R.color.f478491c);
                ((android.view.ViewGroup) viewHolder.itemView.findViewById(com.tencent.mm.R.id.sac)).setBackgroundResource(com.tencent.mm.R.color.f478489a);
                viewHolder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.ui.zb(finderPostAtUI, this));
                return;
            }
            if (viewHolder instanceof com.tencent.mm.plugin.finder.ui.rb) {
                if (getItemViewType(i17) == 2) {
                    ((com.tencent.mm.plugin.finder.ui.rb) viewHolder).f129774d.setText(finderPostAtUI.getString(com.tencent.mm.R.string.f491987ev1));
                    return;
                } else {
                    ((com.tencent.mm.plugin.finder.ui.rb) viewHolder).f129774d.setText(finderPostAtUI.getString(com.tencent.mm.R.string.f491986ev0));
                    return;
                }
            }
            return;
        }
        int i18 = this.f128857d ? 2 : 1;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        int size = finderPostAtUI.f128645u.size();
        java.util.ArrayList arrayList = finderPostAtUI.f128644t;
        if (size == 0) {
            b2Var = (ya2.b2) arrayList.get(i17 - i18);
        } else {
            java.util.ArrayList arrayList2 = finderPostAtUI.f128645u;
            b2Var = i17 < arrayList2.size() + i18 ? (ya2.b2) arrayList2.get(i17 - i18) : (ya2.b2) arrayList.get(((i17 - arrayList2.size()) - i18) - 1);
        }
        kotlin.jvm.internal.o.d(b2Var);
        h0Var.f310123d = b2Var;
        mn2.g1 g1Var = mn2.g1.f329975a;
        com.tencent.mm.plugin.finder.ui.qb qbVar = (com.tencent.mm.plugin.finder.ui.qb) viewHolder;
        g1Var.a().c(new mn2.n(((ya2.b2) h0Var.f310123d).getAvatarUrl(), null, 2, null), qbVar.f129728d, g1Var.h(mn2.f1.f329957h));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = finderPostAtUI.getContext();
        java.lang.String w07 = ((ya2.b2) h0Var.f310123d).w0();
        ((ke0.e) xVar).getClass();
        qbVar.f129729e.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
        android.widget.TextView textView = qbVar.f129731g;
        textView.setVisibility(8);
        r45.xk b17 = ya2.d.b((ya2.b2) h0Var.f310123d, false);
        if (b17 == null || (finderAuthInfo = ya2.d.e(b17)) == null) {
            finderAuthInfo = ((ya2.b2) h0Var.f310123d).field_authInfo;
        }
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2 = finderAuthInfo;
        int authIconType = finderAuthInfo2 != null ? finderAuthInfo2.getAuthIconType() : 0;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.tb.a(ya2.m1.f460511a, qbVar.f129730f, finderAuthInfo2, 0, 4, null);
        if (authIconType <= 0) {
            textView.setVisibility(8);
        } else if (authIconType == 1) {
            textView.setVisibility(0);
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo3 = ((ya2.b2) h0Var.f310123d).field_authInfo;
            if (finderAuthInfo3 == null || (str = finderAuthInfo3.getAuthProfession()) == null) {
                str = "";
            }
            textView.setText(str);
        } else if (authIconType == 100) {
            textView.setVisibility(8);
        }
        viewHolder.itemView.setTag(h0Var.f310123d);
        viewHolder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.ui.yb(h0Var, this.f128858e, this, viewHolder, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI = this.f128858e;
        if (i17 == 1) {
            androidx.appcompat.app.AppCompatActivity context = finderPostAtUI.getContext();
            kotlin.jvm.internal.o.d(context);
            android.view.View inflate = context.getLayoutInflater().inflate(com.tencent.mm.R.layout.f487843m, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new com.tencent.mm.plugin.finder.ui.sb(finderPostAtUI, inflate);
        }
        if (i17 == 2) {
            androidx.appcompat.app.AppCompatActivity context2 = finderPostAtUI.getContext();
            kotlin.jvm.internal.o.d(context2);
            android.view.View inflate2 = context2.getLayoutInflater().inflate(com.tencent.mm.R.layout.b5j, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new com.tencent.mm.plugin.finder.ui.rb(finderPostAtUI, inflate2);
        }
        if (i17 != 4) {
            androidx.appcompat.app.AppCompatActivity context3 = finderPostAtUI.getContext();
            kotlin.jvm.internal.o.d(context3);
            android.view.View inflate3 = context3.getLayoutInflater().inflate(com.tencent.mm.R.layout.afg, parent, false);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            return new com.tencent.mm.plugin.finder.ui.qb(finderPostAtUI, inflate3);
        }
        androidx.appcompat.app.AppCompatActivity context4 = finderPostAtUI.getContext();
        kotlin.jvm.internal.o.d(context4);
        android.view.View inflate4 = context4.getLayoutInflater().inflate(com.tencent.mm.R.layout.b5j, parent, false);
        kotlin.jvm.internal.o.f(inflate4, "inflate(...)");
        return new com.tencent.mm.plugin.finder.ui.rb(finderPostAtUI, inflate4);
    }

    public final void x(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        java.lang.Object tag = viewHolder.itemView.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
        ya2.b2 b2Var = (ya2.b2) tag;
        r45.gb4 gb4Var = new r45.gb4();
        gb4Var.set(0, b2Var.D0());
        gb4Var.set(2, b2Var.w0());
        gb4Var.set(1, b2Var.getAvatarUrl());
        gb4Var.set(3, b2Var.field_authInfo);
        gb4Var.set(7, java.lang.Integer.valueOf(b2Var.field_user_flag));
        com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI = this.f128858e;
        finderPostAtUI.getIntent().putExtra("key_select_contact", gb4Var.toByteArray());
        if (getItemViewType(i17) == 5) {
            finderPostAtUI.getIntent().putExtra("key_source", 2);
        } else {
            finderPostAtUI.getIntent().putExtra("key_source", 1);
        }
        finderPostAtUI.setResult(-1, finderPostAtUI.getIntent());
        finderPostAtUI.finish();
    }
}
