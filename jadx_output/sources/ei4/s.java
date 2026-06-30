package ei4;

/* loaded from: classes9.dex */
public final class s extends wn.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f253239e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public yz5.q f253240f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f253241g;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f253239e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        wn.j holder = (wn.j) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        x4.a aVar = holder.f293123g;
        kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.databinding.TextStatusGreetingItemBinding");
        ui4.d dVar = (ui4.d) aVar;
        java.lang.Object obj = this.f253239e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        hi4.e eVar = (hi4.e) obj;
        holder.f293125i = eVar;
        ng5.a.a(dVar.f428132b, eVar.field_session_id);
        int i18 = eVar.M;
        boolean z17 = false;
        android.widget.TextView textView = dVar.f428136f;
        if (i18 == 0) {
            textView.setVisibility(8);
        } else if (i18 == 1) {
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.R.string.f493367jw4);
        } else if (i18 == 2) {
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.R.string.jwm);
        }
        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(eVar.field_session_id);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.String str = eVar.field_session_id;
        java.lang.String str2 = Ai != null ? Ai.field_nickname : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        bi4.c cVar = bi4.c.PRIVATE_CONVERSATION_LIST;
        android.widget.TextView textView2 = dVar.f428134d;
        textView2.setText(((we0.j1) l0Var).Ai(textView2, str, str3, cVar, textView2.getTextSize()));
        dVar.f428135e.setText(eVar.field_plain);
        mj4.w Ai2 = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(eVar.field_session_id);
        if (Ai2 != null && Ai2.field_canTalk == 1) {
            z17 = true;
        }
        dVar.f428133c.setText(holder.f293121e.getResources().getString(z17 ? com.tencent.mm.R.string.jvw : com.tencent.mm.R.string.jvx));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.czg, parent, false);
        int i18 = com.tencent.mm.R.id.a9o;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.a9o);
        if (imageView != null) {
            i18 = com.tencent.mm.R.id.azj;
            android.widget.Button button = (android.widget.Button) x4.b.a(inflate, com.tencent.mm.R.id.azj);
            if (button != null) {
                i18 = com.tencent.mm.R.id.civ;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.civ);
                if (textView != null) {
                    i18 = com.tencent.mm.R.id.cua;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.cua);
                    if (textView2 != null) {
                        i18 = com.tencent.mm.R.id.o7j;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o7j);
                        if (textView3 != null) {
                            i18 = com.tencent.mm.R.id.o_5;
                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o_5);
                            if (textView4 != null) {
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                                ui4.d dVar = new ui4.d(linearLayout, imageView, button, textView, textView2, textView3, textView4);
                                kotlin.jvm.internal.o.f(linearLayout, "getRoot(...)");
                                wn.j jVar = new wn.j(linearLayout, dVar);
                                android.view.View itemView = jVar.itemView;
                                kotlin.jvm.internal.o.f(itemView, "itemView");
                                itemView.setOnClickListener(new ei4.p(jVar, this));
                                itemView.setOnLongClickListener(new ei4.q(jVar, this));
                                button.setOnClickListener(new ei4.r(itemView));
                                return jVar;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    @Override // wn.a
    public java.util.List x() {
        return this.f253239e;
    }

    @Override // wn.a
    public void y(boolean z17, java.util.List convs) {
        kotlin.jvm.internal.o.g(convs, "convs");
        int itemCount = getItemCount();
        this.f253239e.addAll(convs);
        notifyItemRangeInserted(itemCount, convs.size());
    }

    @Override // wn.a
    public boolean z(java.lang.String str, l75.w0 w0Var) {
        if (str == null || w0Var == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusGreetingAdapter", "[onConversationStorageChange] eventData.eventId = " + w0Var.f316974b + ",obj=" + w0Var.f316976d);
        java.lang.Object obj = w0Var.f316976d;
        if (obj instanceof hi4.e) {
            pm0.v.X(new ei4.m(w0Var, this));
        } else if (obj instanceof mj4.w) {
            pm0.v.X(new ei4.n(w0Var, this));
        } else {
            if (!(obj instanceof hi4.a)) {
                return false;
            }
            pm0.v.X(new ei4.o(w0Var, this));
        }
        return true;
    }
}
