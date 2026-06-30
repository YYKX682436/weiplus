package oi4;

/* loaded from: classes11.dex */
public final class c extends oi4.n {

    /* renamed from: g, reason: collision with root package name */
    public final yz5.q f345628g;

    public c(yz5.q qVar) {
        this.f345628g = qVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cyu;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String field_Description;
        int i19;
        mj4.e eVar;
        int i27;
        kj4.a item = (kj4.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.itemView.setOnLongClickListener(new oi4.a(this, holder, i17));
        android.content.Context context = holder.f293121e;
        this.f345646f = context;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ols);
        mj4.e eVar2 = item.f308451d;
        java.lang.String str = eVar2.field_FromUserName;
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oog);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) c01.a2.e(str));
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        bi4.c cVar2 = bi4.c.CONVERSATION_LIST;
        android.content.Context context2 = holder.f293121e;
        android.text.style.ReplacementSpan Zi = ((we0.j1) l0Var).Zi(textView2, str, cVar2, i65.a.h(context2, com.tencent.mm.R.dimen.f479897ia));
        if (Zi != null) {
            append.append((java.lang.CharSequence) " ");
            append.setSpan(Zi, append.length() - 1, append.length(), 17);
        }
        textView2.setText(append);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) holder.p(com.tencent.mm.R.id.hke), str, null);
        if (textView != null) {
            textView.setText(eVar2.field_CommentContent);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = eVar2.field_CommentId;
        java.lang.String str2 = eVar2.field_TextStatusId;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "textstatus_single_notif_cell");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 8, 28809);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("textstatusid", str2);
        hashMap.put("status_rootcommentid", eVar2.field_RootCommentId);
        hashMap.put("status_commentid", h0Var.f310123d);
        hashMap.put("status_interaction_type", 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.itemView, hashMap);
        holder.itemView.setOnClickListener(new oi4.b(item, h0Var, str2, this, context));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oqb)).setText(k35.m1.f(context2, eVar2.field_CreateTime * 1000, true, false));
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.jue);
        java.lang.String str3 = eVar2.field_Description;
        if (str3 == null || str3.length() == 0) {
            bk4.f a17 = bk4.i.a();
            pj4.o0 o0Var = new pj4.o0();
            byte[] bArr = eVar2.field_TopicInfo;
            if (bArr != null) {
                o0Var.parseFrom(bArr);
            }
            field_Description = a17.m(o0Var);
        } else {
            field_Description = eVar2.field_Description;
            kotlin.jvm.internal.o.f(field_Description, "field_Description");
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView3.getTextSize();
        ((ke0.e) xVar).getClass();
        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, field_Description, textSize));
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f485437ho3);
        java.lang.String str4 = eVar2.field_thumbUrl;
        imageView.setImageDrawable(null);
        if (str4 == null || r26.n0.N(str4)) {
            i19 = 1;
            eVar = eVar2;
            i27 = 8;
        } else {
            dj4.u uVar = dj4.u.f233049a;
            kotlin.jvm.internal.o.d(context);
            kotlin.jvm.internal.o.d(str4);
            i27 = 8;
            i19 = 1;
            eVar = eVar2;
            uVar.e(context, imageView, str4, java.lang.String.valueOf(eVar2.hashCode()), (eVar2.field_Option & 1) != 0, 1.0f);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.hyd);
        frameLayout.removeAllViews();
        pj4.o0 o0Var2 = new pj4.o0();
        byte[] bArr2 = eVar.field_TopicInfo;
        if (bArr2 != null) {
            o0Var2.parseFrom(bArr2);
        }
        java.lang.String d17 = wi4.a.d(o0Var2);
        if (((d17 == null || r26.n0.N(d17)) ? i19 : 0) == 0) {
            bi4.o0 b17 = sj4.z0.f408908a.b(oi4.k.b(o0Var2));
            if (b17 != null) {
                b17.m(eVar.field_TextStatusId, oi4.k.a(o0Var2));
            }
            if (b17 != null) {
                b17.q(frameLayout);
            }
            wi4.a.d(o0Var2);
            java.util.Objects.toString(b17);
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.olt);
        if (eVar.field_HasBeenDeleted == i19) {
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(i27);
            return;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(i27);
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
            com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173693f.a(context, userName, textStatusItem, str);
        }
    }
}
