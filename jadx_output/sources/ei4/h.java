package ei4;

/* loaded from: classes11.dex */
public final class h extends wn.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f253215e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f253216f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f253217g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.q f253218h;

    public static final void B(ei4.h hVar, hi4.a aVar) {
        int i17;
        java.util.HashMap hashMap = hVar.f253216f;
        hi4.a aVar2 = (hi4.a) hashMap.get(aVar.field_sessionId);
        java.util.LinkedList linkedList = hVar.f253215e;
        int c07 = kz5.n0.c0(linkedList, aVar2);
        if (c07 >= 0) {
            linkedList.remove(c07);
            hVar.notifyItemRemoved(c07);
        }
        aVar.t0();
        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            }
            hi4.a aVar3 = (hi4.a) listIterator.previous();
            if (aVar3.field_placedFlag > 0 || kotlin.jvm.internal.o.b(aVar3.field_sessionId, "textstatussayhisessionholder")) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        int i18 = i17 >= 0 ? i17 + 1 : 0;
        linkedList.add(i18, aVar);
        hVar.notifyItemInserted(i18);
        hashMap.remove(aVar.field_sessionId);
        java.lang.String field_sessionId = aVar.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        hashMap.put(field_sessionId, aVar);
    }

    public static final void E(ei4.h hVar) {
        hVar.getClass();
        ni4.x.f337776d.k().getClass();
        java.util.LinkedList linkedList = hVar.f253215e;
        if (linkedList.size() > 0) {
            java.lang.Object obj = linkedList.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            if (ii4.b.a((hi4.a) obj)) {
                linkedList.remove(0);
                hVar.notifyItemRemoved(0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f253215e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.CharSequence charSequence;
        java.lang.String str;
        wn.j holder = (wn.j) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        x4.a aVar = holder.f293123g;
        kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.databinding.TextStatusConversationItemBinding");
        ui4.b bVar = (ui4.b) aVar;
        java.lang.Object obj = this.f253215e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        hi4.a aVar2 = (hi4.a) obj;
        holder.f293125i = aVar2;
        if (ii4.b.a(aVar2)) {
            bVar.f428121c.setText(aVar2.f281540l1);
            ni4.x xVar = ni4.x.f337776d;
            hi4.e z07 = xVar.k().z0();
            str = "";
            if (z07 != null) {
                mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(z07.field_session_id);
                java.lang.String str2 = Ai != null ? Ai.field_nickname : null;
                str = (str2 != null ? str2 : "") + (char) 65306 + z07.field_plain;
            }
            bVar.f428122d.setText(str);
            bVar.f428125g.setVisibility(li4.b.y0(xVar.k(), 0, 1, null) <= 0 ? 8 : 0);
            bVar.f428124f.setVisibility(8);
            ng5.a.a(bVar.f428120b, aVar2.field_sessionId);
            return;
        }
        ng5.a.a(bVar.f428120b, aVar2.field_sessionId);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.String str3 = aVar2.field_sessionId;
        java.lang.CharSequence charSequence2 = aVar2.f281542y0;
        bi4.c cVar = bi4.c.PRIVATE_CONVERSATION_LIST;
        android.widget.TextView textView = bVar.f428121c;
        textView.setText(((we0.j1) l0Var).Ai(textView, str3, charSequence2, cVar, textView.getTextSize()));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str4 = aVar2.field_editingMsg;
        if (str4 == null || r26.n0.N(str4)) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str5 = aVar2.field_digest;
            ((ke0.e) xVar2).getClass();
            charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str5);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.tencent.mm.R.string.jw8));
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479482a31)), 0, spannableStringBuilder.length(), 33);
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str6 = aVar2.field_editingMsg;
            ((ke0.e) xVar3).getClass();
            append.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str6));
            charSequence = spannableStringBuilder;
        }
        bVar.f428122d.setText(charSequence);
        android.content.Context context2 = itemView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        bVar.f428123e.setText(java.lang.String.valueOf(aVar2.field_status == 1 ? context2.getString(com.tencent.mm.R.string.juv) : k35.m1.f(context2, aVar2.field_updateTime, true, false)));
        int i18 = (aVar2.field_unReadCount <= 0 || aVar2.field_readStatus != 0) ? 8 : 0;
        android.widget.TextView textView2 = bVar.f428124f;
        textView2.setVisibility(i18);
        textView2.setText(java.lang.String.valueOf(aVar2.field_unReadCount));
        textView2.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(itemView.getContext(), aVar2.field_unReadCount));
        textView2.setTextSize(0, i65.a.f(itemView.getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(itemView.getContext()));
        int visibility = textView2.getVisibility();
        android.widget.TextView textView3 = bVar.f428125g;
        if (visibility != 0 && aVar2.field_readStatus == 0 && aVar2.field_isRedDot == 1) {
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.f489558cz0, parent, false);
        int i18 = com.tencent.mm.R.id.a9o;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.a9o);
        if (imageView != null) {
            i18 = com.tencent.mm.R.id.civ;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.civ);
            if (textView != null) {
                i18 = com.tencent.mm.R.id.cua;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.cua);
                if (textView2 != null) {
                    i18 = com.tencent.mm.R.id.o7m;
                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o7m);
                    if (textView3 != null) {
                        i18 = com.tencent.mm.R.id.o_4;
                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o_4);
                        if (textView4 != null) {
                            i18 = com.tencent.mm.R.id.o_5;
                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o_5);
                            if (textView5 != null) {
                                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
                                ui4.b bVar = new ui4.b(relativeLayout, imageView, textView, textView2, textView3, textView4, textView5);
                                kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                                wn.j jVar = new wn.j(relativeLayout, bVar);
                                android.view.View itemView = jVar.itemView;
                                kotlin.jvm.internal.o.f(itemView, "itemView");
                                itemView.setOnClickListener(new ei4.e(jVar, this));
                                itemView.setOnLongClickListener(new ei4.f(jVar, this));
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
        return this.f253215e;
    }

    @Override // wn.a
    public void y(boolean z17, java.util.List convs) {
        kotlin.jvm.internal.o.g(convs, "convs");
        pm0.v.X(new ei4.g(this, convs));
    }

    @Override // wn.a
    public boolean z(java.lang.String str, l75.w0 w0Var) {
        if (str == null || w0Var == null) {
            return false;
        }
        java.lang.Object obj = w0Var.f316976d;
        if (obj instanceof hi4.a) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.data.TextStatusConversation");
            h0Var.f310123d = (hi4.a) obj;
            pm0.v.X(new ei4.a(w0Var, this, h0Var));
        } else {
            java.lang.String str2 = w0Var.f316973a;
            java.lang.String[] strArr = li4.b.f318786e;
            if (kotlin.jvm.internal.o.b(str2, li4.b.f318787f)) {
                pm0.v.X(new ei4.b(this));
            } else {
                java.lang.Object obj2 = w0Var.f316976d;
                if (obj2 instanceof hi4.e) {
                    pm0.v.X(new ei4.c(w0Var, this));
                } else {
                    if (!(obj2 instanceof mj4.w)) {
                        return false;
                    }
                    pm0.v.X(new ei4.d(this, w0Var));
                }
            }
        }
        return true;
    }
}
