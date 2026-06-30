package g63;

/* loaded from: classes8.dex */
public final class j extends androidx.recyclerview.widget.f2 implements g63.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final g63.s f269127d = new g63.s(this);

    /* renamed from: e, reason: collision with root package name */
    public final g63.a f269128e = new g63.a(this);

    /* renamed from: f, reason: collision with root package name */
    public final g63.s0 f269129f = new g63.s0(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f269130g = new java.util.LinkedList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f269130g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.CharSequence charSequence;
        g63.b holder = (g63.b) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        g63.s sVar = this.f269127d;
        sVar.getClass();
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        java.lang.Object obj = ((g63.j) sVar.f269164a).f269130g.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        z53.i iVar = (z53.i) obj;
        x4.a aVar = holder.f293123g;
        kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.databinding.GamelifeConversationNormalItemBinding");
        a63.b bVar = (a63.b) aVar;
        holder.f293125i = iVar;
        itemView.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        bVar.f1741d.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(iVar.field_sessionId);
        android.widget.TextView textView = bVar.f1741d;
        if (q57 != null && q57.P0() == 5) {
            android.graphics.drawable.Drawable drawable = itemView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.msg_state_failed);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            } else {
                drawable = null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if ((iVar.field_digestFlag & 1) > 0) {
            iVar.field_digestPrefix = i65.a.r(context, com.tencent.mm.R.string.fqa);
            iVar.field_digestFlag = 0L;
        }
        java.lang.String str = iVar.field_digestPrefix;
        if (str == null || str.length() == 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = iVar.field_digest;
            ((ke0.e) xVar).getClass();
            charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(iVar.field_digestPrefix);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i65.a.d(context, com.tencent.mm.R.color.f478532ac)), 0, spannableStringBuilder.length(), 33);
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = iVar.field_digest;
            ((ke0.e) xVar2).getClass();
            append.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3));
            charSequence = spannableStringBuilder;
        }
        textView.setText(charSequence);
        bVar.f1745h.setText(java.lang.String.valueOf(k35.m1.f(itemView.getContext(), iVar.field_updateTime, true, false)));
        android.widget.TextView textView2 = bVar.f1747j;
        textView2.setVisibility(8);
        int i18 = iVar.field_unReadCount > 0 ? 0 : 8;
        android.widget.TextView textView3 = bVar.f1746i;
        textView3.setVisibility(i18);
        int i19 = iVar.field_unReadCount;
        textView3.setText(i19 > 99 ? "..." : java.lang.String.valueOf(i19));
        textView3.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(itemView.getContext(), iVar.field_unReadCount));
        boolean u07 = iVar.u0();
        android.widget.ImageView imageView = bVar.f1739b;
        android.widget.TextView textView4 = bVar.f1740c;
        if (!u07) {
            itemView.setOnClickListener(new g63.q(sVar, iVar, i17, holder, itemView));
            itemView.setOnLongClickListener(new g63.r(sVar, iVar, i17, holder, itemView));
            textView4.setText(iVar.G);
            ng5.a.a(imageView, iVar.field_sessionId);
            return;
        }
        android.view.View view = holder.itemView;
        textView3.setVisibility(8);
        int i27 = iVar.field_unReadCount;
        textView2.setVisibility((i27 == Integer.MAX_VALUE || i27 == 0) ? 8 : 0);
        imageView.setImageResource(com.tencent.mm.R.drawable.af_);
        textView4.setText(i65.a.r(view.getContext(), com.tencent.mm.R.string.fqe));
        view.setOnClickListener(new g63.o(iVar, sVar, i17, view));
        view.setOnLongClickListener(new g63.p(sVar, iVar, i17, holder, view));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f269127d.getClass();
        a63.b a17 = a63.b.a(com.tencent.mm.ui.id.b(parent.getContext()), parent, false);
        android.widget.LinearLayout linearLayout = a17.f1738a;
        kotlin.jvm.internal.o.f(linearLayout, "getRoot(...)");
        return new g63.b(linearLayout, a17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 k3Var) {
        g63.b holder = (g63.b) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        z53.i iVar = (z53.i) holder.f293125i;
        if (iVar != null) {
            int adapterPosition = holder.getAdapterPosition();
            boolean u07 = iVar.u0();
            com.tencent.mm.game.report.d dVar = com.tencent.mm.game.report.e.f68194a;
            if (u07) {
                int i17 = adapterPosition + 1;
                int x17 = x();
                java.lang.String field_sessionId = iVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                dVar.e(i17, 1L, x17, field_sessionId, 0L, "", 0L, "", iVar.t0(), e63.a.f249817a, (r35 & 1024) != 0 ? null : null);
                return;
            }
            y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(iVar.field_selfUserName);
            if (Di != null) {
                int i18 = adapterPosition + 1;
                int x18 = x();
                java.lang.String field_sessionId2 = iVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
                long j17 = Di.field_accountType;
                java.lang.String field_selfUserName = iVar.field_selfUserName;
                kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
                y53.m mVar = iVar.F;
                kotlin.jvm.internal.o.d(mVar);
                long j18 = mVar.field_accountType;
                java.lang.String field_talker = iVar.field_talker;
                kotlin.jvm.internal.o.f(field_talker, "field_talker");
                dVar.e(i18, 1L, x18, field_sessionId2, j17, field_selfUserName, j18, field_talker, iVar.t0(), e63.a.f249817a, (r35 & 1024) != 0 ? null : null);
            }
        }
    }

    public int x() {
        return this.f269130g.size();
    }
}
