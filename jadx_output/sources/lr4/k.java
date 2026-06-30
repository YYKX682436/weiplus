package lr4;

/* loaded from: classes11.dex */
public final class k extends wn.a {

    /* renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f320742e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f320743f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f320744g;

    /* renamed from: h, reason: collision with root package name */
    public lr4.d f320745h;

    /* renamed from: i, reason: collision with root package name */
    public lr4.c f320746i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f320747m;

    /* renamed from: n, reason: collision with root package name */
    public int f320748n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f320749o;

    public k(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f320742e = fragment;
        this.f320743f = new java.util.ArrayList();
        this.f320744g = new java.util.HashMap();
        this.f320747m = new java.util.HashSet();
        this.f320748n = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        r1 = new org.json.JSONObject(r6).optJSONObject("fromUserInfo");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        if (r1 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        r1 = r1.optString(dm.i4.COL_USERNAME, r11.field_selfUserName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        r1 = r11.field_selfUserName;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(lr4.k r10, kr4.g r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr4.k.B(lr4.k, kr4.g):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f320743f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.CharSequence charSequence;
        wn.j holder = (wn.j) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof lr4.e) {
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            java.lang.Object obj = this.f320743f.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            kr4.g gVar = (kr4.g) obj;
            holder.f293125i = gVar;
            lr4.e eVar = (lr4.e) holder;
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = eVar.f320721n;
            mMRoundCornerImageView.setImageDrawable(null);
            if (kotlin.jvm.internal.o.b(gVar.field_talkerUserName, "w1wnotificationholder@w1wmsg")) {
                mMRoundCornerImageView.setRadius(i65.a.a(itemView.getContext(), 4.8f));
                mMRoundCornerImageView.setImageResource(com.tencent.mm.R.raw.w1w_personal_msg_notification_holder_avatar);
            } else if (kotlin.jvm.internal.o.b(gVar.field_talkerUserName, "w1wsayhisessionholder@w1wmsg")) {
                mMRoundCornerImageView.setRadius(i65.a.a(itemView.getContext(), 4.8f));
                if (this.f320749o == null) {
                    this.f320749o = com.tencent.mm.sdk.platformtools.x.r(com.tencent.mm.R.raw.bubble_3_dot_filled, mMRoundCornerImageView.getLayoutParams().width, mMRoundCornerImageView.getLayoutParams().height, itemView.getContext().getColor(com.tencent.mm.R.color.ani), itemView.getContext().getColor(com.tencent.mm.R.color.anh), 0.65f);
                }
                mMRoundCornerImageView.setImageBitmap(this.f320749o);
            } else {
                java.lang.String str = gVar.field_talkerUserName;
                com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
                if (str != null && str.endsWith("@zhugeprivate")) {
                    ng5.a.a(mMRoundCornerImageView, gVar.field_talkerUserName);
                } else if (com.tencent.mm.storage.z3.K4(gVar.field_talkerUserName)) {
                    ng5.a.b(mMRoundCornerImageView, gVar.field_talkerUserName);
                }
            }
            eVar.f320722o.setText(java.lang.String.valueOf(gVar.f311506p0));
            if (gVar.f311508y0 != null) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.String str2 = gVar.field_editingMsg;
                if (str2 == null || r26.n0.N(str2)) {
                    if (kotlin.jvm.internal.o.b(gVar.field_digestType, "47") || kotlin.jvm.internal.o.b(gVar.field_digestType, "1048625")) {
                        charSequence = context.getString(com.tencent.mm.R.string.f490382tf);
                        kotlin.jvm.internal.o.f(charSequence, "getString(...)");
                    } else {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String str3 = gVar.field_digest;
                        ((ke0.e) xVar).getClass();
                        charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3);
                    }
                } else {
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.tencent.mm.R.string.pcl));
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479482a31)), 0, spannableStringBuilder.length(), 33);
                    android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str4 = gVar.field_editingMsg;
                    ((ke0.e) xVar2).getClass();
                    append.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str4));
                    charSequence = spannableStringBuilder;
                }
            } else {
                charSequence = null;
            }
            eVar.f320723p.setText(charSequence);
            jz5.l lVar = gVar.field_status == 5 ? new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.msg_state_failed), java.lang.Integer.valueOf(com.tencent.mm.R.color.f478532ac)) : null;
            if (lVar != null) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = eVar.f320724q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(weImageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(weImageView, arrayList2.toArray(), "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/chatting/ConversationHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                weImageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(weImageView, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/chatting/ConversationHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(weImageView, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                weImageView.setImageResource(((java.lang.Number) lVar.f302833d).intValue());
                weImageView.setIconColor(weImageView.getResources().getColor(((java.lang.Number) lVar.f302834e).intValue(), weImageView.getContext().getTheme()));
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = eVar.f320724q;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(weImageView2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(intValue2));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(weImageView2, arrayList4.toArray(), "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/chatting/ConversationHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                weImageView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(weImageView2, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/chatting/ConversationHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(weImageView2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if ((gVar.field_placedFlag <= 0 || kotlin.jvm.internal.o.b(gVar.field_sessionId, "w1wnotificationholder@w1wmsg") || kotlin.jvm.internal.o.b(gVar.field_sessionId, "w1wsayhisessionholder@w1wmsg")) ? false : true) {
                itemView.setBackgroundResource(com.tencent.mm.R.drawable.aj6);
            } else {
                itemView.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
            }
            android.content.Context context2 = itemView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            eVar.f320725r.setText(java.lang.String.valueOf(gVar.field_status == 1 ? context2.getString(com.tencent.mm.R.string.pcn) : k35.m1.f(context2, gVar.field_updateTime, true, false)));
            boolean b17 = kotlin.jvm.internal.o.b(gVar.field_talkerUserName, "w1wsayhisessionholder@w1wmsg");
            android.widget.TextView textView = eVar.f320726s;
            android.widget.TextView textView2 = eVar.f320727t;
            if (b17) {
                textView2.setVisibility(8);
                textView.setVisibility((gVar.field_unReadCount <= 0 || gVar.field_readStatus != 0) ? 8 : 0);
                return;
            }
            textView2.setVisibility((gVar.field_unReadCount <= 0 || gVar.field_readStatus != 0) ? 8 : 0);
            textView2.setText(java.lang.String.valueOf(gVar.field_unReadCount));
            textView2.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(itemView.getContext(), gVar.field_unReadCount));
            textView2.setTextSize(0, i65.a.f(itemView.getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(itemView.getContext()));
            textView.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f320742e.getContext()).inflate(com.tencent.mm.R.layout.eql, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        lr4.e eVar = new lr4.e(inflate);
        android.view.View view = eVar.itemView;
        view.setOnLongClickListener(new lr4.h(eVar, this, view));
        view.setOnClickListener(new lr4.i(eVar, this, view));
        return eVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 k3Var) {
        lr4.e eVar;
        int adapterPosition;
        kr4.g gVar;
        java.lang.String str;
        java.util.ArrayList arrayList = this.f320743f;
        wn.j holder = (wn.j) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof lr4.e) && (adapterPosition = (eVar = (lr4.e) holder).getAdapterPosition()) != -1) {
            try {
                gVar = (kr4.g) holder.f293125i;
                if (gVar == null) {
                    java.lang.Object obj = arrayList.get(adapterPosition);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    gVar = (kr4.g) obj;
                }
            } catch (java.lang.Throwable unused) {
                java.lang.Object obj2 = arrayList.get(adapterPosition);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                gVar = (kr4.g) obj2;
            }
            java.lang.String str2 = gVar.field_sessionId;
            java.util.HashSet hashSet = this.f320747m;
            if (hashSet.contains(str2)) {
                return;
            }
            hashSet.add(str2);
            if (kotlin.jvm.internal.o.b(gVar.field_talkerUserName, "w1wsayhisessionholder@w1wmsg")) {
                str = eVar.f320726s.getVisibility() == 0 ? "reddot_hello_window:reddot_hello_window" : "hello_window:hello_window";
            } else {
                str = gVar.field_sessionId + ":message_window";
            }
            androidx.fragment.app.Fragment fragment = this.f320742e;
            kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment");
            ((com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment) fragment).K0(vu4.d.f440292e, mr4.a.a(str), "", gVar.field_sessionId);
        }
    }

    @Override // wn.a
    public java.util.List x() {
        return this.f320743f;
    }

    @Override // wn.a
    public void y(boolean z17, java.util.List convs) {
        kotlin.jvm.internal.o.g(convs, "convs");
        pm0.v.X(new lr4.j(this, convs, z17));
    }

    @Override // wn.a
    public boolean z(java.lang.String str, l75.w0 w0Var) {
        if (str == null || w0Var == null) {
            return false;
        }
        java.lang.Object obj = w0Var.f316976d;
        if (obj instanceof kr4.g) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            kr4.g gVar = (kr4.g) obj;
            if (!kotlin.jvm.internal.o.b(gVar.field_selfUserName, ((fr4.g0) i95.n0.c(fr4.g0.class)).Di())) {
                return true;
            }
            pm0.v.X(new lr4.f(w0Var, this, gVar));
        } else {
            if (!(obj instanceof kr4.e)) {
                return false;
            }
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wContact");
            if (!kotlin.jvm.internal.o.b(((fr4.g0) i95.n0.c(fr4.g0.class)).Di(), ((kr4.e) obj).field_username)) {
                return true;
            }
            pm0.v.X(new lr4.g(this, w0Var));
        }
        return true;
    }
}
