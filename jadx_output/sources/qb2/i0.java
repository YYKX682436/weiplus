package qb2;

/* loaded from: classes10.dex */
public final class i0 extends qb2.b0 {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f361222t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f361222t = new java.util.ArrayList();
    }

    @Override // qb2.b0
    public qb2.t E(int i17) {
        return (i17 < 0 || i17 >= K()) ? super.E(i17 - K()) : L(i17);
    }

    @Override // qb2.b0, androidx.recyclerview.widget.f2
    /* renamed from: I */
    public wn.j onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 != 10000) {
            return super.onCreateViewHolder(parent, i17);
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.afs, parent, false);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o_z);
        if (textView == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(com.tencent.mm.R.id.o_z)));
        }
        vb2.f fVar = new vb2.f(frameLayout, frameLayout, textView);
        kotlin.jvm.internal.o.f(frameLayout, "getRoot(...)");
        return new wn.j(frameLayout, fVar);
    }

    public final int K() {
        return this.f361222t.size();
    }

    public final qb2.t L(int i17) {
        java.util.ArrayList arrayList = this.f361222t;
        if (!(i17 >= 0 && i17 < arrayList.size())) {
            arrayList = null;
        }
        qb2.t tVar = arrayList != null ? (qb2.t) arrayList.get(i17) : null;
        return tVar == null ? com.tencent.mm.plugin.finder.storage.t80.f128066e.a() : tVar;
    }

    @Override // qb2.b0, androidx.recyclerview.widget.f2
    public int getItemCount() {
        return super.getItemCount() + K();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return E(i17).field_type;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        wn.j holder = (wn.j) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        qb2.t E = E(i17);
        int K = K();
        x4.a aVar = holder.f293123g;
        if (i17 >= K) {
            super.onBindViewHolder(holder, i17, payloads);
            kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationItemBinding");
            vb2.e eVar = (vb2.e) aVar;
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
            int integer = j37 != null ? j37.u0().getInteger(49) : 0;
            if ((integer == 2 || integer == 3) || !kotlin.jvm.internal.o.b(E.field_sessionId, "findersayhisessionholder")) {
                return;
            }
            eVar.f434539g.setVisibility(8);
            eVar.f434538f.setVisibility(8);
            eVar.f434537e.setVisibility(8);
            android.widget.TextView textView = eVar.f434536d;
            textView.setVisibility(0);
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.cqg));
            return;
        }
        if (kotlin.jvm.internal.o.b("finder_system_message", E.field_sessionId)) {
            super.onBindViewHolder(holder, i17, payloads);
            kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationItemBinding");
            ((vb2.e) aVar).f434534b.setImageResource(com.tencent.mm.R.drawable.f481810aa4);
            return;
        }
        if (kotlin.jvm.internal.o.b("finder_wx_system_message", E.field_sessionId)) {
            super.onBindViewHolder(holder, i17, payloads);
            kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationItemBinding");
            vb2.e eVar2 = (vb2.e) aVar;
            eVar2.f434534b.setImageResource(com.tencent.mm.R.drawable.f481810aa4);
            java.lang.String str = E.field_digest;
            eVar2.f434536d.setText(str != null ? str : "");
            return;
        }
        if (E.field_type == 10000) {
            kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationSysTipsItemBinding");
            vb2.f fVar = (vb2.f) aVar;
            java.lang.String str2 = E.G1;
            fVar.f434550b.setText(str2 != null ? str2 : "");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void p(int i17) {
        notifyItemChanged(i17 + K());
    }

    @Override // androidx.recyclerview.widget.f2
    public void q(int i17) {
        if (i17 >= 0) {
            notifyItemInserted(i17 + K());
        } else {
            notifyItemInserted(1);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void r(int i17, int i18) {
        notifyItemRangeInserted(i17 + K(), i18);
    }

    @Override // androidx.recyclerview.widget.f2
    public void w(int i17) {
        notifyItemRemoved(i17 + K());
    }
}
