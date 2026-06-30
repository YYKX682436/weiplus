package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class ya extends com.tencent.mm.ui.conversation.o2 {

    /* renamed from: J, reason: collision with root package name */
    public final java.util.Set f208276J;
    public final boolean K;
    public final o11.g L;

    public ya(android.content.Context context, java.lang.String str, com.tencent.mm.ui.y9 y9Var) {
        super(context, y9Var);
        this.f208276J = new java.util.HashSet();
        boolean a17 = te5.s1.f418747a.a();
        this.K = a17;
        if (a17) {
            o11.f fVar = new o11.f();
            fVar.f342096t = true;
            fVar.f342086j = 132;
            fVar.f342087k = 132;
            fVar.f342091o = com.tencent.mm.R.drawable.bgo;
            this.L = fVar.a();
        }
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public void E() {
        android.database.Cursor j17 = j();
        if (j17 != null) {
            com.tencent.mm.ui.conversation.za zaVar = null;
            if (!j17.isClosed() && j17.moveToFirst()) {
                java.util.HashSet hashSet = new java.util.HashSet();
                do {
                    int columnIndex = j17.getColumnIndex("talker");
                    java.lang.String string = columnIndex >= 0 ? j17.getString(columnIndex) : null;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        hashSet.add(string);
                    }
                } while (j17.moveToNext());
                com.tencent.mm.ui.conversation.za zaVar2 = new com.tencent.mm.ui.conversation.za(null);
                if (!hashSet.isEmpty()) {
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        if (com.tencent.mm.storage.z3.z3(str)) {
                            zaVar2.f208314a++;
                        } else {
                            if (str == null) {
                                str = "";
                            }
                            if (str.startsWith("gh_")) {
                                zaVar2.f208315b++;
                            } else {
                                zaVar2.f208316c++;
                            }
                        }
                    }
                }
                zaVar = zaVar2;
            }
            if (zaVar != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21825, 4, null, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), java.lang.String.format(java.util.Locale.US, "%d:%d:%d", java.lang.Integer.valueOf(zaVar.f208315b), java.lang.Integer.valueOf(zaVar.f208314a), java.lang.Integer.valueOf(zaVar.f208316c)), null, 0, 0, 0, 0, te5.v1.f418758b);
            }
        }
        super.E();
    }

    @Override // com.tencent.mm.ui.conversation.o2, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.storage.l4 l4Var;
        java.lang.String str;
        android.view.View view2 = super.getView(i17, view, viewGroup);
        com.tencent.mm.ui.conversation.n2 n2Var = (com.tencent.mm.ui.conversation.n2) view2.getTag();
        com.tencent.mm.storage.l4 l4Var2 = (com.tencent.mm.storage.l4) getItem(i17);
        java.lang.String str2 = null;
        boolean z17 = this.K;
        if (z17 && l4Var2 != null) {
            android.widget.ImageView imageView = n2Var.f207885b;
            java.lang.String h17 = l4Var2.h1();
            java.lang.String j17 = l4Var2.j();
            java.util.List list = cm5.k.f43440a;
            if ("offline_scan_result".equals(h17)) {
                imageView.setImageResource(com.tencent.mm.R.drawable.c0b);
            } else if (h17 != null && !((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(h17) && !android.text.TextUtils.isEmpty(j17)) {
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(j17, "msg", null);
                if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.type"), 0) != 1 ? com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.show_icon_and_display_name"), 0) == 0 ? !h17.startsWith("follow_live") || (str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.title.avatar")) == null : (str = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.icon_url")) == null : (str = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.app.avatar_url")) == null) {
                    str = "";
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    n11.a.b().h(str, imageView, this.L);
                }
            }
        }
        if (n2Var.f207886c.getText() != null && l4Var2 != null) {
            java.lang.String charSequence = n2Var.f207886c.getText().toString();
            if (com.tencent.mm.storage.z3.z3(l4Var2.h1())) {
                k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(l4Var2.h1());
                if (Bi != null) {
                    str2 = Bi.field_nickname;
                }
            } else {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String h18 = l4Var2.h1();
                ((sg3.a) v0Var).getClass();
                java.lang.String e17 = c01.a2.e(h18);
                android.content.Context context = view2.getContext();
                if (z17 && (l4Var = (com.tencent.mm.storage.l4) getItem(i17)) != null) {
                    str2 = cm5.k.b(l4Var.h1(), l4Var.j(), context);
                }
                if (android.text.TextUtils.isEmpty(str2)) {
                    str2 = e17;
                }
            }
            if (!(charSequence != null ? charSequence : "").equals(str2)) {
                n2Var.f207886c.setText(str2);
            }
        }
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // com.tencent.mm.ui.z9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            r7 = this;
            r7.c()
            c01.f r0 = c01.d9.b()
            st0.e r0 = r0.v()
            com.tencent.mm.storage.z9 r0 = (com.tencent.mm.storage.z9) r0
            java.lang.String r1 = ") AS subquery LEFT JOIN message AS message ON message.msgId = subquery.msgId"
            java.lang.String r2 = "SELECT message.content,subquery.talker,subquery.msgId,subquery.createTime,subquery.digest FROM ("
            java.lang.String r3 = "SELECT talker,msgId,MAX(createTime) AS createTime,digest FROM NotifyMessageRecord WHERE talker IS NOT NULL AND LENGTH(talker) > 0 AND talker != 'notifymessage' GROUP BY talker ORDER BY createTime DESC"
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L38
            r5.<init>()     // Catch: java.lang.Exception -> L38
            boolean r6 = r0.f196410e
            if (r6 == 0) goto L20
            r5.append(r2)     // Catch: java.lang.Exception -> L38
        L20:
            r5.append(r3)     // Catch: java.lang.Exception -> L38
            if (r6 == 0) goto L28
            r5.append(r1)     // Catch: java.lang.Exception -> L38
        L28:
            l75.k0 r0 = r0.f196409d     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L38
            android.database.Cursor r0 = r0.B(r1, r4)     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L48
            r0.moveToFirst()     // Catch: java.lang.Exception -> L38
            goto L49
        L38:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.NotifyMessageRecordStorage"
            java.lang.String r2 = "dz[getNotifyMsgConversationCursor] exception %s"
            com.tencent.mars.xlog.Log.w(r1, r2, r0)
        L48:
            r0 = r4
        L49:
            r7.s(r0)
            com.tencent.mm.ui.y9 r0 = r7.f212611h
            if (r0 == 0) goto L53
            r0.b(r4)
        L53:
            r7.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.ya.q():void");
    }

    @Override // com.tencent.mm.ui.conversation.o2, com.tencent.mm.ui.z9
    /* renamed from: t */
    public com.tencent.mm.storage.l4 d(com.tencent.mm.storage.l4 l4Var, android.database.Cursor cursor) {
        if (l4Var == null) {
            l4Var = new com.tencent.mm.storage.l4();
        }
        int columnIndex = cursor.getColumnIndex("talker");
        l4Var.b2(columnIndex >= 0 ? cursor.getString(columnIndex) : null);
        if (this.K) {
            int columnIndex2 = cursor.getColumnIndex("content");
            l4Var.l1(columnIndex2 >= 0 ? cursor.getString(columnIndex2) : null);
        }
        int columnIndex3 = cursor.getColumnIndex("createTime");
        l4Var.n1(columnIndex3 >= 0 ? cursor.getLong(columnIndex3) : 0L);
        int columnIndex4 = cursor.getColumnIndex("digest");
        l4Var.o1(columnIndex4 >= 0 ? cursor.getString(columnIndex4) : null);
        l4Var.T1("notifymessage");
        l4Var.W1(2);
        l4Var.M1(1);
        l4Var.Y1(0);
        l4Var.S1(java.lang.Integer.toString(1));
        l4Var.p1("");
        return l4Var;
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public void x(com.tencent.mm.storage.l4 l4Var, boolean z17, int i17, boolean z18, android.view.View view) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(l4Var.h1())) {
            return;
        }
        ((java.util.HashSet) this.f208276J).add(l4Var.h1());
    }
}
