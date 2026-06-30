package pf4;

/* loaded from: classes4.dex */
public final class w extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f353901d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f353902e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f353903f;

    /* renamed from: g, reason: collision with root package name */
    public nf4.j f353904g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f353905h;

    public w(java.util.ArrayList commentDatas) {
        kotlin.jvm.internal.o.g(commentDatas, "commentDatas");
        this.f353901d = commentDatas;
        this.f353902e = "MicroMsg.StoryCommentListAdapter";
        this.f353903f = new java.util.HashMap();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f353901d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String valueOf;
        pf4.s holder = (pf4.s) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f353901d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        gf4.a aVar = (gf4.a) obj;
        holder.itemView.setOnClickListener(new pf4.t(this, aVar));
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f271330a, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = holder.f353892f;
        android.content.Context context = textView.getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize);
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f271339j, true);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView.getContext();
        java.lang.String g28 = n18 != null ? n18.g2() : null;
        java.lang.String str = g28 != null ? g28 : "";
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j18 = com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str, textSize2);
        if (aVar.f271341l != 0) {
            valueOf = ((java.lang.Object) j17) + ' ' + textView.getContext().getResources().getString(com.tencent.mm.R.string.f490541y0) + ' ' + ((java.lang.Object) j18);
        } else {
            valueOf = java.lang.String.valueOf(j17);
        }
        textView.setText(valueOf);
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView2 = holder.f353893g;
        android.content.Context context3 = textView2.getContext();
        float textSize3 = textView2.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, aVar.f271331b, textSize3));
        com.tencent.mm.feature.avatar.w wVar = (com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class));
        com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView commentAvatarImageView = holder.f353891e;
        java.lang.String userName = aVar.f271330a;
        wVar.Ni(commentAvatarImageView, userName);
        if (aVar.f271335f) {
            commentAvatarImageView.setBackground(commentAvatarImageView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.b4e));
            int i18 = holder.f353890d;
            commentAvatarImageView.setPadding(i18, i18, i18, i18);
        } else {
            commentAvatarImageView.setBackground(null);
            commentAvatarImageView.setPadding(0, 0, 0, 0);
        }
        java.util.HashMap hashMap = holder.f353894h.f353903f;
        ef4.v vVar = ef4.w.f252468t;
        hashMap.put(userName, java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.D0(vVar.e(), userName) && vVar.g().P0(userName).t0()));
        commentAvatarImageView.getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        if (!android.text.TextUtils.equals(commentAvatarImageView.f171880d, userName)) {
            commentAvatarImageView.f171880d = userName;
        }
        commentAvatarImageView.setOnClickListener(new pf4.r(aVar, holder));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.cwx, null);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        return new pf4.s(this, inflate, 0, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062 A[EDGE_INSN: B:11:0x0062->B:12:0x0062 BREAK  A[LOOP:0: B:2:0x0010->B:18:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:2:0x0010->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "newComments"
            kotlin.jvm.internal.o.g(r8, r0)
            java.util.HashMap r0 = r7.f353903f
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            java.lang.String r3 = "next(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            ef4.v r3 = ef4.w.f252468t
            java.lang.String r4 = r3.e()
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.D0(r4, r5)
            r5 = 1
            if (r4 != 0) goto L51
            nf4.g r3 = r3.g()
            java.lang.Object r4 = r1.getKey()
            java.lang.String r6 = "<get-key>(...)"
            kotlin.jvm.internal.o.f(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            nf4.f r3 = r3.P0(r4)
            boolean r3 = r3.t0()
            if (r3 == 0) goto L51
            r3 = r5
            goto L52
        L51:
            r3 = r2
        L52:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.o.b(r3, r1)
            if (r1 != 0) goto L10
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto L70
            java.util.ArrayList r0 = r7.f353901d
            r0.clear()
            r0.addAll(r8)
            r7.notifyDataSetChanged()
            goto L81
        L70:
            pf4.v r0 = new pf4.v
            r0.<init>(r7, r8)
            androidx.recyclerview.widget.c0 r0 = androidx.recyclerview.widget.h0.a(r0, r2)
            pf4.u r1 = new pf4.u
            r1.<init>(r7, r8)
            r0.a(r1)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf4.w.x(java.util.List):void");
    }
}
