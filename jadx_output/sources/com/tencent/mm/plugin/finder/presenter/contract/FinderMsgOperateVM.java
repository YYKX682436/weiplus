package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM;", "", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMsgOperateVM {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.Companion f122968f = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f122969a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122970b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCommentFooter f122971c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f122972d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f122973e;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM$Companion;", "", "", "BULLET_REPLY_AFTER_TIMESTAMP", "J", "", "BULLET_REPLY_TEXT_LIMIT", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final int a(dm.pd mention) {
            kotlin.jvm.internal.o.g(mention, "mention");
            if (kv2.h.f312662a.d(mention)) {
                return 1;
            }
            return mention.field_sourceType == 3 ? 2 : 0;
        }
    }

    public FinderMsgOperateVM(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f122969a = context;
        this.f122970b = i17;
    }

    public static final void a(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM, int i17, int i18, java.lang.String str, dm.pd pdVar) {
        finderMsgOperateVM.getClass();
        if (i17 == 0 && i18 == 0) {
            android.content.Context context = finderMsgOperateVM.f122969a;
            db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.lot));
            if (finderMsgOperateVM.f122970b == 1) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_authorContact;
                if (!kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, xy2.c.e(context)) || kotlin.jvm.internal.o.b(pdVar.field_username, xy2.c.e(context))) {
                    return;
                }
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.a(context, 2);
            }
        }
    }

    public static final void b(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM, int i17, dm.pd pdVar) {
        java.lang.String d17;
        java.lang.String str;
        com.tencent.mm.plugin.finder.view.q7 postContent;
        java.lang.Long l17;
        finderMsgOperateVM.getClass();
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = null;
        ((c61.l7) i95.n0.c(c61.l7.class)).Qj().f107270b = null;
        if (hz2.d.f286313a.a(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT)) {
            return;
        }
        android.content.Context context = finderMsgOperateVM.f122969a;
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = context instanceof com.tencent.mm.ui.MMFragmentActivity;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = z17 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        java.lang.String c17 = finderMsgOperateVM.c();
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = finderMsgOperateVM.f122971c;
        com.tencent.mm.plugin.finder.view.q7 postContent2 = finderCommentFooter != null ? finderCommentFooter.getPostContent() : null;
        r45.e60 a17 = postContent2 != null ? postContent2.a() : null;
        int i18 = postContent2 != null ? postContent2.f132880c : 0;
        long longValue = (postContent2 == null || (l17 = postContent2.f132882e) == null) ? 0L : l17.longValue();
        if ((c17 == null || c17.length() == 0) && a17 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = finderMsgOperateVM.f122971c;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText = finderCommentFooter2 != null ? finderCommentFooter2.getEditText() : null;
        java.util.LinkedList u17 = editText != null ? editText.u(pdVar.field_objectId) : null;
        if (u17 != null) {
            java.util.Iterator it = u17.iterator();
            while (it.hasNext()) {
                hc2.l.b((java.lang.String) it.next());
            }
        }
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = new com.tencent.mm.protocal.protobuf.FinderCommentInfo();
        finderCommentInfo.setCommentId(pdVar.field_rootCommentId);
        finderCommentInfo.setClient_id(pm0.v.u(finderCommentInfo.getCommentId()));
        kv2.h hVar = kv2.h.f312662a;
        com.tencent.mm.protobuf.g byteString = hVar.d(pdVar) ? pdVar.field_extInfo.getByteString(5) : null;
        int integer = hVar.d(pdVar) ? pdVar.field_extInfo.getInteger(6) : 0;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter3 = finderMsgOperateVM.f122971c;
        if (finderCommentFooter3 != null && (postContent = finderCommentFooter3.getPostContent()) != null) {
            iEmojiInfo = postContent.f132878a;
        }
        d17 = finderMsgContract.d(finderCommentFooter3, 7, null, i18, iEmojiInfo, null, (r21 & 64) != 0 ? null : finderMsgContract.i(i18, a17), (r21 & 128) != 0 ? null : null);
        mv2.l lVar = mv2.l.f331597d;
        long c18 = c01.id.c();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_authorContact;
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        long j17 = pdVar.field_objectId;
        java.lang.String str3 = pdVar.field_objectNonceId;
        long j18 = pdVar.field_commentId;
        java.lang.String str4 = pdVar.field_content;
        java.lang.String c19 = hc2.t.c(context, i17);
        java.lang.String b17 = hc2.t.b(context, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        cu2.a aVar = new cu2.a(false, false, null, 3, null);
        kotlin.jvm.internal.o.d(str3);
        lVar.a(c18, str2, j17, str3, c17, "", "", java.lang.Long.valueOf(j18), str4, c19, b17, i17, false, finderCommentInfo, V6, 7, arrayList, u17, i18, a17, longValue, d17, new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReplyInter$3(finderMsgOperateVM, pdVar), byteString, integer, aVar);
        if (z17) {
            r45.qt2 V62 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c27 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c27).zj(V62, pdVar.field_objectId, null, 2, 0, 0, "", i17, (r29 & 256) != 0 ? false : false, (r29 & 512) != 0 ? false : false, (r29 & 1024) != 0 ? 0 : 0);
        }
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f122971c;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText = finderCommentFooter != null ? finderCommentFooter.getEditText() : null;
        android.text.Editable text = editText != null ? editText.getText() : null;
        if (text == null || text.length() == 0) {
            com.tencent.mars.xlog.Log.w("CommentFooterVm", "[getCommentContent] error, originText is nullOrEmpty!");
            return null;
        }
        if (!(r26.n0.u0(text).length() == 0)) {
            return hc2.l.b(text.toString());
        }
        com.tencent.mars.xlog.Log.w("CommentFooterVm", "[getCommentContent] error, originText trim is nullOrEmpty!");
        return null;
    }

    public final void d(java.lang.Long l17) {
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter;
        if (l17 != null && (finderCommentFooter = this.f122971c) != null) {
            long longValue = l17.longValue();
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = this.f122971c;
            finderCommentFooter.C(longValue, finderCommentFooter2 != null ? finderCommentFooter2.getMentionId() : 0L);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter3 = this.f122971c;
        if (finderCommentFooter3 != null) {
            finderCommentFooter3.D(false);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter4 = this.f122971c;
        if (finderCommentFooter4 != null && (editText = finderCommentFooter4.getEditText()) != null) {
            editText.setBackListener(null);
        }
        android.view.View view = this.f122972d;
        if (view != null) {
            view.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$hideCommentView$1
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.this;
                    android.view.View view2 = finderMsgOperateVM.f122972d;
                    if (view2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM$hideCommentView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM$hideCommentView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.tencent.mm.ui.tools.f5 f5Var = finderMsgOperateVM.f122973e;
                    if (f5Var != null) {
                        f5Var.d();
                    }
                    com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter5 = finderMsgOperateVM.f122971c;
                    com.tencent.mm.plugin.finder.view.FinderCommentEditText editText2 = finderCommentFooter5 != null ? finderCommentFooter5.getEditText() : null;
                    if (editText2 != null) {
                        editText2.setText((java.lang.CharSequence) null);
                    }
                    com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter6 = finderMsgOperateVM.f122971c;
                    if (finderCommentFooter6 != null) {
                        rx2.d dVar = finderCommentFooter6.D1;
                        dVar.f400966b.clear();
                        dVar.f400965a.clear();
                    }
                }
            }, 200L);
        }
    }

    public final void e(int i17, int i18, android.content.Intent intent) {
        long[] longArrayExtra;
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        if (i17 == 502) {
            java.lang.Long l17 = null;
            java.lang.String str = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("key_select_image_list")) == null) ? null : (java.lang.String) kz5.n0.Z(stringArrayListExtra);
            if (intent != null && (longArrayExtra = intent.getLongArrayExtra("SELECT_IMAGES_MODIFIED_TIME")) != null) {
                l17 = kz5.z.N(longArrayExtra);
            }
            com.tencent.mars.xlog.Log.i("CommentFooterVm", "image %s", str);
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f122971c;
            if (finderCommentFooter != null) {
                int i19 = com.tencent.mm.plugin.finder.view.FinderCommentFooter.N1;
                finderCommentFooter.t(str, false, l17);
            }
        }
    }

    public final void f(boolean z17, so2.o3 item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        if (i17 == 0) {
            g(z17, item);
            return;
        }
        if (i17 != 1) {
            return;
        }
        kv2.h hVar = kv2.h.f312662a;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onLike$1 finderMsgOperateVM$onLike$1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onLike$1(this, z17, item);
        dm.pd mention = item.f410411d;
        kotlin.jvm.internal.o.g(mention, "mention");
        if (hVar.d(mention) && hVar.g(mention) != kv2.i.f312665d) {
            kv2.b a17 = hVar.a(mention);
            if (a17 != kv2.b.f312650e) {
                if (a17 == kv2.b.f312651f) {
                    finderMsgOperateVM$onLike$1.invoke();
                    return;
                }
                return;
            }
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            r45.a13 a13Var = new r45.a13();
            a13Var.f369630d = db2.t4.f228171a.a(6989);
            a13Var.f369632f = mention.field_extInfo.getString(0);
            a13Var.f369633g = mention.field_extInfo.getString(1);
            a13Var.f369636m = z17 ? 3 : 4;
            a13Var.f369635i = mention.field_commentId;
            a13Var.f369638o = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a);
            a13Var.f369637n = 3;
            a13Var.f369639p = mention.field_extInfo.getByteString(5);
            a13Var.f369640q = mention.field_extInfo.getInteger(6);
            lVar.f70664a = a13Var;
            lVar.f70665b = new r45.b13();
            lVar.f70666c = "/cgi-bin/micromsg-bin/finderunilike";
            lVar.f70667d = 6989;
            com.tencent.mm.modelbase.z2.d(lVar.a(), kv2.d.f312658d, false);
        }
    }

    public final void g(boolean z17, so2.o3 item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLikeComment] isLike=");
        sb6.append(z17);
        sb6.append(" commentObj=");
        dm.pd pdVar = item.f410411d;
        sb6.append(pdVar.field_commentId);
        com.tencent.mars.xlog.Log.i("CommentFooterVm", sb6.toString());
        android.content.Context context = this.f122969a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        boolean z18 = context instanceof androidx.appcompat.app.AppCompatActivity;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
        yj0Var.u0().setCommentId(pdVar.field_commentId);
        kv2.h hVar = kv2.h.f312662a;
        com.tencent.mm.protobuf.g byteString = hVar.d(pdVar) ? pdVar.field_extInfo.getByteString(5) : null;
        int integer = hVar.d(pdVar) ? pdVar.field_extInfo.getInteger(6) : 0;
        so2.e2 e2Var = so2.e2.f410328a;
        long j17 = pdVar.field_objectId;
        java.lang.String field_objectNonceId = pdVar.field_objectNonceId;
        kotlin.jvm.internal.o.f(field_objectNonceId, "field_objectNonceId");
        int i17 = this.f122970b;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.fp fpVar = (com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a(appCompatActivity).e(com.tencent.mm.plugin.finder.viewmodel.component.fp.class);
        so2.e2.a(e2Var, V6, j17, null, field_objectNonceId, yj0Var, z17, i17, false, byteString, integer, finderMsgContract.j(fpVar != null ? fpVar.f134417w == 1 ? 3 : 2 : 0), null, 2048, null);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ok(z17, pdVar.field_commentId);
    }

    public final void h(so2.o3 o3Var, java.util.List list) {
        int i17 = this.f122970b;
        android.content.Context context = this.f122969a;
        java.lang.String c17 = hc2.t.c(context, i17);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a.c(context, c17, 1, new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReplyWithSecurityCheck$1(list, this, o3Var));
    }

    public final void i(final so2.i msg) {
        android.widget.TextView secondaryReplyBtn;
        android.widget.TextView replyBtn;
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = false;
        if (this.f122971c == null) {
            android.content.Context context = this.f122969a;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.View findViewById = com.tencent.mm.ui.id.b(this.f122969a).inflate(com.tencent.mm.R.layout.dha, (android.view.ViewGroup) ((android.view.ViewGroup) decorView).findViewById(android.R.id.content)).findViewById(com.tencent.mm.R.id.qd7);
            this.f122972d = findViewById;
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = findViewById != null ? (com.tencent.mm.plugin.finder.view.FinderCommentFooter) findViewById.findViewById(com.tencent.mm.R.id.eat) : null;
            this.f122971c = finderCommentFooter;
            if (finderCommentFooter != null) {
                finderCommentFooter.setScene(this.f122970b);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = this.f122971c;
            if (finderCommentFooter2 != null) {
                android.content.Context context2 = this.f122969a;
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.fp fpVar = (com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).e(com.tencent.mm.plugin.finder.viewmodel.component.fp.class);
                finderCommentFooter2.setCommentSource((fpVar == null || fpVar.f134417w != 1) ? 2 : 3);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter3 = this.f122971c;
            if (finderCommentFooter3 != null) {
                finderCommentFooter3.setBackClickListener(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$initCommentFooter$1(this));
                android.view.View view = this.f122972d;
                if (view != null) {
                    view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$initCommentFooter$2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view2) {
                            com.tencent.mm.plugin.finder.view.FinderCommentEditText editText;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(view2);
                            java.lang.Object[] array = arrayList.toArray();
                            arrayList.clear();
                            yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM$initCommentFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.this;
                            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter4 = finderMsgOperateVM.f122971c;
                            finderMsgOperateVM.d((finderCommentFooter4 == null || (editText = finderCommentFooter4.getEditText()) == null) ? null : java.lang.Long.valueOf(editText.getFeedId()));
                            yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM$initCommentFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        }
                    });
                }
                com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter4 = this.f122971c;
                if (finderCommentFooter4 != null) {
                    finderCommentFooter4.setBanSwitchScene(true);
                }
                com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter5 = this.f122971c;
                if (finderCommentFooter5 != null) {
                    finderCommentFooter5.z(false);
                }
                com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter6 = this.f122971c;
                if (finderCommentFooter6 != null) {
                    com.tencent.mm.plugin.finder.view.FinderCommentFooter.v(finderCommentFooter6, false, false, 2, null);
                }
                android.content.Context context3 = this.f122969a;
                kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
                com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context3);
                this.f122973e = f5Var;
                f5Var.f210400e = this.f122971c;
            }
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter7 = this.f122971c;
        if (finderCommentFooter7 != null) {
            finderCommentFooter7.getEditText().feedId = msg.f410411d.field_objectId;
        }
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$showCommentFooter$listener$1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM$showCommentFooter$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                so2.i iVar = so2.i.this;
                boolean z18 = iVar instanceof so2.o3;
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM = this;
                if (z18) {
                    so2.o3 msg2 = (so2.o3) iVar;
                    int a17 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.f122968f.a(iVar.f410411d);
                    finderMsgOperateVM.getClass();
                    kotlin.jvm.internal.o.g(msg2, "msg");
                    if (a17 == 0) {
                        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter8 = finderMsgOperateVM.f122971c;
                        finderMsgOperateVM.h(msg2, finderCommentFooter8 != null ? finderCommentFooter8.getMentionListWhenReply() : null);
                    } else if (a17 != 1) {
                        finderMsgOperateVM.d(null);
                    } else {
                        java.lang.String commentDesc = finderMsgOperateVM.c();
                        if (commentDesc == null || commentDesc.length() == 0) {
                            com.tencent.mars.xlog.Log.w("CommentFooterVm", "[onReply] tingMention commentText is nullOrEmpty!");
                        } else {
                            kv2.h hVar = kv2.h.f312662a;
                            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReply$1 finderMsgOperateVM$onReply$1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReply$1(finderMsgOperateVM, msg2);
                            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReply$2 finderMsgOperateVM$onReply$2 = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReply$2(finderMsgOperateVM, msg2);
                            kotlin.jvm.internal.o.g(commentDesc, "commentDesc");
                            dm.pd mention = msg2.f410411d;
                            kotlin.jvm.internal.o.g(mention, "mention");
                            if (hVar.d(mention) && hVar.g(mention) != kv2.i.f312665d) {
                                kv2.b a18 = hVar.a(mention);
                                if (a18 == kv2.b.f312650e) {
                                    com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                                    r45.w03 w03Var = new r45.w03();
                                    w03Var.f388745d = db2.t4.f228171a.a(6989);
                                    w03Var.f388747f = mention.field_extInfo.getString(0);
                                    w03Var.f388748g = mention.field_extInfo.getString(1);
                                    w03Var.f388751m = commentDesc;
                                    w03Var.f388752n = mention.field_rootCommentId;
                                    w03Var.f388753o = mention.field_commentId;
                                    w03Var.f388761w = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                    w03Var.f388755q = 3;
                                    w03Var.f388754p = 1;
                                    w03Var.f388762x = mention.field_extInfo.getByteString(5);
                                    w03Var.f388763y = mention.field_extInfo.getInteger(6);
                                    lVar.f70664a = w03Var;
                                    lVar.f70665b = new r45.x03();
                                    lVar.f70666c = "/cgi-bin/micromsg-bin/finderunicomment";
                                    lVar.f70667d = 6964;
                                    com.tencent.mm.modelbase.z2.d(lVar.a(), new kv2.e(finderMsgOperateVM$onReply$1), false);
                                } else if (a18 == kv2.b.f312651f) {
                                    finderMsgOperateVM$onReply$2.invoke();
                                }
                            }
                        }
                    }
                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).pk();
                } else if (iVar instanceof so2.n3) {
                    so2.n3 n3Var = (so2.n3) iVar;
                    android.content.Context context4 = finderMsgOperateVM.f122969a;
                    if (com.tencent.mars.comm.NetStatusUtil.isConnected(context4)) {
                        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter9 = finderMsgOperateVM.f122971c;
                        if (finderCommentFooter9 != null) {
                            int commentTextLimit = finderCommentFooter9.getCommentTextLimit() / 2;
                            android.text.Editable text = finderCommentFooter9.getEditText().getText();
                            if (commentTextLimit - com.tencent.mm.ui.tools.v4.g(text != null ? text.toString() : null) < 0) {
                                com.tencent.mars.xlog.Log.i("CommentFooterVm", "onReplyBullet text exceed the limit");
                            }
                        }
                        kotlin.jvm.internal.o.g(context4, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context4 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                        dm.pd pdVar = n3Var.f410411d;
                        long j17 = pdVar.field_objectId;
                        java.lang.String str = pdVar.field_objectNonceId;
                        if (str == null) {
                            str = "";
                        }
                        java.lang.String str2 = str;
                        java.lang.String c17 = finderMsgOperateVM.c();
                        dm.pd pdVar2 = n3Var.f410411d;
                        long j18 = pdVar2.field_extInfo.getLong(3);
                        long j19 = pdVar2.field_commentId;
                        if (c17 == null || c17.length() == 0) {
                            com.tencent.mars.xlog.Log.w("CommentFooterVm", "onReplyBullet  content is NullOrEmpty!");
                        } else {
                            int i17 = finderMsgOperateVM.f122970b == 1 ? 2 : 1;
                            int O6 = ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).O6(j17) + 1;
                            i95.m c18 = i95.n0.c(cq.k.class);
                            kotlin.jvm.internal.o.f(c18, "getService(...)");
                            cq.j1.c((cq.k) c18, finderMsgOperateVM.f122969a, V6, j17, null, str2, c17, j18 + 3000, 0, i17, j19, 0L, O6, 0L, new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReplyBullet$2(finderMsgOperateVM), null);
                            finderMsgOperateVM.d(null);
                        }
                    } else {
                        db5.t7.makeText(context4, context4.getString(com.tencent.mm.R.string.f490500wu), 0).show();
                        com.tencent.mars.xlog.Log.e("CommentFooterVm", "onReplyBullet: network is disconnect}");
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("CommentFooterVm", "showCommentFooter, msg type not support, msg: " + iVar);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM$showCommentFooter$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter8 = this.f122971c;
        if (finderCommentFooter8 != null && (replyBtn = finderCommentFooter8.getReplyBtn()) != null) {
            replyBtn.setOnClickListener(onClickListener);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter9 = this.f122971c;
        if (finderCommentFooter9 != null && (secondaryReplyBtn = finderCommentFooter9.getSecondaryReplyBtn()) != null) {
            secondaryReplyBtn.setOnClickListener(onClickListener);
        }
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = msg.f410411d.field_contact;
        if (finderContact != null) {
            if ((finderContact.getUser_flag() & 4) != 0) {
                z17 = true;
            }
        }
        if (!z17) {
            j(msg);
            return;
        }
        java.lang.String a17 = com.tencent.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
        if (a17 == null) {
            a17 = "";
        }
        java.lang.String str = a17;
        final boolean j17 = ya2.d.j("wxid_wi_1d142z0zdj03");
        ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).bj(this.f122969a, "wxid_wi_1d142z0zdj03", 5, str, new vh0.i1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$showCommentFooter$1
            @Override // vh0.i1
            public void onResult(java.lang.Object obj) {
                final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM;
                com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter10;
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                com.tencent.mars.xlog.Log.i("CommentFooterVm", "privacy result " + bool);
                kotlin.jvm.internal.o.d(bool);
                if (!bool.booleanValue() || (finderCommentFooter10 = (finderMsgOperateVM = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.this).f122971c) == null) {
                    return;
                }
                final so2.i iVar = msg;
                finderCommentFooter10.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$showCommentFooter$1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.this.j(iVar);
                    }
                }, j17 ? 0L : 300L);
            }
        });
    }

    public final void j(so2.i msg) {
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText;
        kotlin.jvm.internal.o.g(msg, "msg");
        android.view.View view = this.f122972d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM", "showCommentView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgOperateVM", "showCommentView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f122971c;
        if (finderCommentFooter != null && (editText = finderCommentFooter.getEditText()) != null) {
            editText.setBackListener(new al5.n1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$showCommentView$1
                @Override // al5.n1
                public final void a() {
                    yz5.a backClickListener;
                    com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.this.f122971c;
                    if (finderCommentFooter2 == null || (backClickListener = finderCommentFooter2.getBackClickListener()) == null) {
                        return;
                    }
                    backClickListener.invoke();
                }
            });
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.f122973e;
        if (f5Var != null) {
            f5Var.f();
        }
        boolean z17 = msg instanceof so2.o3;
        dm.pd pdVar = msg.f410411d;
        if (z17) {
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = this.f122971c;
            com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPickView quickPickEmoji = finderCommentFooter2 != null ? finderCommentFooter2.getQuickPickEmoji() : null;
            if (quickPickEmoji != null) {
                quickPickEmoji.setCanShowEmoji(true);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter3 = this.f122971c;
            if (finderCommentFooter3 != null) {
                finderCommentFooter3.getSwitchClickLayout().setVisibility(0);
                android.view.ViewGroup viewGroup = finderCommentFooter3.commentEditTextContainer;
                android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.setMarginStart(0);
                }
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter4 = this.f122971c;
            if (finderCommentFooter4 != null) {
                finderCommentFooter4.B();
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter5 = this.f122971c;
            if (finderCommentFooter5 != null) {
                java.lang.String str = pdVar.field_nickname;
                if (str == null) {
                    str = "";
                }
                com.tencent.mm.plugin.finder.view.FinderCommentFooter.h(finderCommentFooter5, "", com.tencent.mm.R.string.f490925ba1, str, null, false, false, false, false, 208, null);
                java.lang.String string = finderCommentFooter5.getResources().getString(com.tencent.mm.R.string.f490541y0);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                finderCommentFooter5.g(string);
            }
        } else if (msg instanceof so2.n3) {
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter6 = this.f122971c;
            com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPickView quickPickEmoji2 = finderCommentFooter6 != null ? finderCommentFooter6.getQuickPickEmoji() : null;
            if (quickPickEmoji2 != null) {
                quickPickEmoji2.setCanShowEmoji(false);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter7 = this.f122971c;
            if (finderCommentFooter7 != null) {
                finderCommentFooter7.getSwitchClickLayout().setVisibility(8);
                android.view.ViewGroup viewGroup2 = finderCommentFooter7.commentEditTextContainer;
                android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
                android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 != null) {
                    layoutParams4.setMarginStart((int) finderCommentFooter7.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
                }
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter8 = this.f122971c;
            if (finderCommentFooter8 != null) {
                finderCommentFooter8.setCommentTextLimit(30);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter9 = this.f122971c;
            if (finderCommentFooter9 != null) {
                finderCommentFooter9.setCommentTextLimitStart(0);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter10 = this.f122971c;
            if (finderCommentFooter10 != null) {
                com.tencent.mm.plugin.finder.view.FinderCommentFooter.h(finderCommentFooter10, "", com.tencent.mm.R.string.p4q, "", null, true, false, false, false, 224, null);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter11 = this.f122971c;
            if (finderCommentFooter11 != null) {
                java.lang.String string2 = this.f122969a.getResources().getString(com.tencent.mm.R.string.f490541y0);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                finderCommentFooter11.g(string2);
            }
        } else {
            com.tencent.mars.xlog.Log.w("CommentFooterVm", "showCommentView, msg type not support, msg: " + msg);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter12 = this.f122971c;
        if (finderCommentFooter12 != null) {
            finderCommentFooter12.setMentionExtFlag(pdVar.field_extFlag);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter13 = this.f122971c;
        if (finderCommentFooter13 != null) {
            finderCommentFooter13.setFromMention(true);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter14 = this.f122971c;
        if (finderCommentFooter14 != null) {
            finderCommentFooter14.l();
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter15 = this.f122971c;
        if (finderCommentFooter15 != null) {
            finderCommentFooter15.o(true);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter16 = this.f122971c;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText2 = finderCommentFooter16 != null ? finderCommentFooter16.getEditText() : null;
        if (editText2 != null) {
            editText2.setShowSoftInputOnFocus(true);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter17 = this.f122971c;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText3 = finderCommentFooter17 != null ? finderCommentFooter17.getEditText() : null;
        if (editText3 != null) {
            editText3.setInputType(131073);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter18 = this.f122971c;
        if (finderCommentFooter18 != null) {
            finderCommentFooter18.A(pdVar.field_objectId, pdVar.field_svrMentionId);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter19 = this.f122971c;
        if (finderCommentFooter19 != null) {
            finderCommentFooter19.setMentionId(pdVar.field_svrMentionId);
        }
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter20 = this.f122971c;
        if (finderCommentFooter20 != null) {
            finderCommentFooter20.D(true);
        }
    }
}
