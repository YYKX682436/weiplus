package oi4;

/* loaded from: classes11.dex */
public final class j extends oi4.n {

    /* renamed from: g, reason: collision with root package name */
    public final yz5.q f345642g;

    public j(long j17, yz5.q qVar) {
        this.f345642g = qVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.czo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String field_Description;
        kj4.c item = (kj4.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.f293121e;
        this.f345646f = context;
        mj4.l lVar = item.f308454d;
        com.tencent.mm.storage.z3 n17 = lVar.V.length() > 0 ? ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(lVar.V, true) : ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).wi(lVar.field_HashUserName, 1);
        if (n17 == null || !n17.r2()) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oog)).setText(lVar.field_DisplayName);
            n11.a.b().g(lVar.field_HeadImgUrl, (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hke));
            holder.itemView.setOnClickListener(null);
        } else {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oog);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, n17.g2(), i65.a.h(context, com.tencent.mm.R.dimen.f479897ia)));
            android.text.style.ReplacementSpan Zi = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Zi(textView, n17.d1(), bi4.c.CONVERSATION_LIST, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
            if (Zi != null) {
                spannableStringBuilder.append((java.lang.CharSequence) " ");
                spannableStringBuilder.setSpan(Zi, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
            textView.setText(spannableStringBuilder);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) holder.p(com.tencent.mm.R.id.hke), n17.d1(), null);
            java.lang.String str = lVar.field_TextStatusId;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "textstatus_single_notif_cell");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 8, 28809);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("textstatusid", str);
            hashMap.put("status_interaction_type", 1);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.itemView, hashMap);
            holder.itemView.setOnClickListener(new oi4.h(str, item, this, holder));
        }
        holder.itemView.setOnLongClickListener(new oi4.i(this, holder, i17));
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.haq);
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_like);
        com.tencent.mm.ui.uk.f(drawable, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        imageView.setImageDrawable(drawable);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oqb)).setText(k35.m1.f(context, lVar.field_CreateTime * 1000, true, false));
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.jue);
        java.lang.String str2 = lVar.field_Description;
        if (str2 == null || str2.length() == 0) {
            bk4.f a17 = bk4.i.a();
            pj4.o0 o0Var = new pj4.o0();
            byte[] bArr = lVar.field_TopicInfo;
            if (bArr != null) {
                o0Var.parseFrom(bArr);
            }
            field_Description = a17.m(o0Var);
        } else {
            field_Description = lVar.field_Description;
            kotlin.jvm.internal.o.f(field_Description, "field_Description");
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, field_Description, textSize));
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f485437ho3);
        java.lang.String str3 = lVar.field_thumbUrl;
        imageView2.setImageDrawable(null);
        if (!(str3 == null || r26.n0.N(str3))) {
            dj4.u uVar = dj4.u.f233049a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.d(str3);
            uVar.e(context, imageView2, str3, java.lang.String.valueOf(lVar.hashCode()), (lVar.field_Option & 1) != 0, 1.0f);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.hyd);
        frameLayout.removeAllViews();
        pj4.o0 o0Var2 = new pj4.o0();
        byte[] bArr2 = lVar.field_TopicInfo;
        if (bArr2 != null) {
            o0Var2.parseFrom(bArr2);
        }
        java.lang.String d17 = wi4.a.d(o0Var2);
        if (d17 == null || r26.n0.N(d17)) {
            return;
        }
        bi4.o0 b17 = sj4.z0.f408908a.b(oi4.k.b(o0Var2));
        if (b17 != null) {
            b17.m(lVar.field_TextStatusId, oi4.k.a(o0Var2));
        }
        if (b17 != null) {
            b17.q(frameLayout);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // oi4.n
    public void n(java.lang.String userName, mj4.h textStatusItem, java.lang.String str) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(textStatusItem, "textStatusItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", "goToShowTextStatusActivity: id:" + ((mj4.k) textStatusItem).l() + " userName:" + userName + " refCommentId:" + str);
        android.content.Context context = this.f345646f;
        if (context != null) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173693f.b(context, userName, textStatusItem);
        }
    }
}
