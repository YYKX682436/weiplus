package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract;", "", "<init>", "()V", "MsgPresenter", "MsgViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMsgContract {

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract f122820a = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract();

    /* renamed from: b */
    public static long f122821b = android.os.SystemClock.uptimeMillis();

    /* renamed from: c */
    public static final int f122822c = 20;

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgPresenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class MsgPresenter implements fs2.a {

        /* renamed from: d */
        public final int f122823d;

        /* renamed from: e */
        public final int f122824e;

        /* renamed from: f */
        public final int[] f122825f;

        /* renamed from: g */
        public final java.lang.String f122826g;

        /* renamed from: h */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback f122827h;

        /* renamed from: i */
        public final java.util.ArrayList f122828i;

        /* renamed from: m */
        public long f122829m;

        /* renamed from: n */
        public final jz5.g f122830n;

        /* renamed from: o */
        public long f122831o;

        /* renamed from: p */
        public final com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct f122832p;

        /* renamed from: q */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$msgUpdateListener$1 f122833q;

        /* renamed from: r */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$thanksUpdateListener$1 f122834r;

        /* JADX WARN: Type inference failed for: r3v3, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$msgUpdateListener$1] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$thanksUpdateListener$1] */
        public MsgPresenter(int i17, int i18, int[] msgTypes) {
            kotlin.jvm.internal.o.g(msgTypes, "msgTypes");
            this.f122823d = i17;
            this.f122824e = i18;
            this.f122825f = msgTypes;
            this.f122826g = "Finder.FinderFinderMsgContract.MsgPresenter." + hashCode();
            this.f122828i = new java.util.ArrayList();
            this.f122830n = jz5.h.b(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$finderUsername$2(this));
            this.f122832p = new com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct();
            com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            this.f122833q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderMentionUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$msgUpdateListener$1
                {
                    this.__eventId = -2136143875;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent) {
                    com.tencent.mm.autogen.events.FinderMentionUpdateEvent event = finderMentionUpdateEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    am.lc lcVar = event.f54306g;
                    if (lcVar == null) {
                        return false;
                    }
                    long j17 = lcVar.f7236a;
                    pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$msgUpdateListener$1$callback$1(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter.this, j17, j17, event));
                    return false;
                }
            };
            this.f122834r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderThanksUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$thanksUpdateListener$1
                {
                    this.__eventId = 1097932050;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
                    com.tencent.mm.autogen.events.FinderThanksUpdateEvent event = finderThanksUpdateEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    am.md mdVar = event.f54333g;
                    java.lang.String str = mdVar != null ? mdVar.f7339c : null;
                    pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$thanksUpdateListener$1$callback$1(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter.this, mdVar != null ? java.lang.Long.valueOf(mdVar.f7337a) : null, str, mdVar != null ? java.lang.Integer.valueOf(mdVar.f7340d) : null, event));
                    return false;
                }
            };
        }

        public final void c() {
            com.tencent.mm.ui.MMActivity mMActivity;
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = this.f122827h;
            kotlinx.coroutines.y0 b17 = (msgViewCallback == null || (mMActivity = msgViewCallback.f122860g) == null) ? null : v65.m.b(mMActivity);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e(this.f122826g, "viewCallback?.getActivity()?.lifecycleScope is null");
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            cq.j1.h((cq.k) c17, this.f122823d, this.f122824e, (java.lang.String) ((jz5.n) this.f122830n).getValue(), null, new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$1(b17, this), new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2(this, b17), 8, null);
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            finderMsgContract.getClass();
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122821b = uptimeMillis;
        }

        public final int f(long j17, int i17, boolean z17, boolean z18) {
            java.util.List b17;
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = this.f122827h;
            if (msgViewCallback == null) {
                return -1;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            cu2.a0 a0Var = cu2.b0.f222371a;
            b17 = a0Var.b(j17, i17, (r18 & 4) != 0 ? new int[0] : this.f122825f, this.f122823d, (java.lang.String) ((jz5.n) this.f122830n).getValue(), (r18 & 32) != 0 ? 0 : 0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                so2.i j18 = a0Var.j((dm.pd) it.next());
                if (j18 != null) {
                    arrayList2.add(j18);
                }
            }
            com.tencent.mars.xlog.Log.i(this.f122826g, "loadMoreData mentionId:" + j17 + " limit:" + i17 + " list:" + arrayList2.size());
            arrayList.addAll(arrayList2);
            if (this.f122823d == 1) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    dm.pd pdVar = ((so2.i) it6.next()).f410411d;
                    long j19 = pdVar.field_id;
                    long j27 = this.f122829m;
                    com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = this.f122832p;
                    if (j19 < j27 || j27 == 0) {
                        int i18 = pdVar.field_type;
                        if (i18 == 1) {
                            finderMsgUIItemBrowseStruct.f57436m++;
                        } else if (i18 == 2) {
                            finderMsgUIItemBrowseStruct.f57437n++;
                        } else if (i18 == 3) {
                            finderMsgUIItemBrowseStruct.f57438o++;
                        } else if (i18 == 5) {
                            finderMsgUIItemBrowseStruct.f57439p++;
                        }
                        finderMsgUIItemBrowseStruct.f57431h++;
                    } else {
                        int i19 = pdVar.field_type;
                        if (i19 == 1) {
                            finderMsgUIItemBrowseStruct.f57432i++;
                        } else if (i19 == 2) {
                            finderMsgUIItemBrowseStruct.f57433j++;
                        } else if (i19 == 3) {
                            finderMsgUIItemBrowseStruct.f57434k++;
                        } else if (i19 == 5) {
                            finderMsgUIItemBrowseStruct.f57435l++;
                        }
                        finderMsgUIItemBrowseStruct.f57430g++;
                    }
                    finderMsgUIItemBrowseStruct.f57429f++;
                }
            }
            msgViewCallback.s(arrayList, z17, z18);
            return arrayList2.size();
        }

        public void g(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback callback) {
            kotlin.jvm.internal.o.g(callback, "callback");
            bq.p0 p0Var = bq.q0.f23513t;
            bq.q0.f23514u.clear();
            alive();
            alive();
            this.f122827h = callback;
            com.tencent.mars.xlog.Log.i(this.f122826g, "onAttach " + this.f122824e);
            if (this.f122823d == 1) {
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                if (Ri == null) {
                    Ri = "";
                }
                com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = this.f122832p;
                finderMsgUIItemBrowseStruct.f57427d = finderMsgUIItemBrowseStruct.b("SessionId", Ri, true);
            }
        }

        @Override // fs2.a
        public void onDetach() {
            dead();
            dead();
            if (this.f122823d == 1) {
                com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = this.f122832p;
                finderMsgUIItemBrowseStruct.k();
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderMsgUIItemBrowseStruct);
            }
            this.f122827h = null;
            com.tencent.mars.xlog.Log.i(this.f122826g, "onDetach " + this.f122824e);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgPresenter;", "Lym5/l1;", "UICallbackListener", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class MsgViewCallback implements fs2.c, ym5.l1 {

        /* renamed from: d */
        public final java.lang.String f122857d;

        /* renamed from: e */
        public final int f122858e;

        /* renamed from: f */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter f122859f;

        /* renamed from: g */
        public final com.tencent.mm.ui.MMActivity f122860g;

        /* renamed from: h */
        public final android.view.View f122861h;

        /* renamed from: i */
        public androidx.recyclerview.widget.RecyclerView f122862i;

        /* renamed from: m */
        public com.tencent.mm.view.RefreshLoadMoreLayout f122863m;

        /* renamed from: n */
        public com.tencent.mm.ui.widget.MMProcessBar f122864n;

        /* renamed from: o */
        public rl5.r f122865o;

        /* renamed from: p */
        public android.widget.TextView f122866p;

        /* renamed from: q */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122867q;

        /* renamed from: r */
        public db2.g4 f122868r;

        /* renamed from: s */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.UICallbackListener f122869s;

        /* renamed from: t */
        public db2.n4 f122870t;

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$UICallbackListener;", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes8.dex */
        public interface UICallbackListener {
            void F(dm.pd pdVar);
        }

        public MsgViewCallback(com.tencent.mm.ui.MMActivity activity, android.view.View msgView, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter presenter, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.UICallbackListener uICallbackListener) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(msgView, "msgView");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f122857d = "Finder.FinderMsgContract.MsgViewCallback." + hashCode();
            this.f122858e = 100;
            this.f122859f = presenter;
            this.f122860g = activity;
            this.f122861h = msgView;
            this.f122869s = uICallbackListener;
        }

        public static final void l(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback, int i17) {
            com.tencent.mm.ui.MMActivity mMActivity = msgViewCallback.f122860g;
            switch (i17) {
                case -8003:
                    db5.e1.i(mMActivity, com.tencent.mm.R.string.f492069f45, 0);
                    return;
                case -8002:
                    db5.e1.i(mMActivity, com.tencent.mm.R.string.cwu, 0);
                    return;
                case -8001:
                    db5.e1.i(mMActivity, com.tencent.mm.R.string.cv_, 0);
                    return;
                default:
                    return;
            }
        }

        public static final void o(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback, final dm.pd pdVar) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = msgViewCallback.f122859f;
            final int i17 = msgPresenter.f122823d == 1 ? 7 : 5;
            long j17 = pdVar.field_objectId;
            java.lang.String str = pdVar.field_objectNonceId;
            int i18 = msgPresenter.f122823d;
            com.tencent.mm.ui.MMActivity context = msgViewCallback.f122860g;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            db2.g4 g4Var = new db2.g4(j17, str, i17, i18, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
            msgViewCallback.f122868r = g4Var;
            pq5.g l17 = g4Var.l();
            l17.f(context);
            l17.h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$getCommentDetail$1
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
                
                    if (r2.field_commentId != 0) goto L40;
                 */
                /* JADX WARN: Removed duplicated region for block: B:57:0x01c4  */
                @Override // gm5.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object call(java.lang.Object r34) {
                    /*
                        Method dump skipped, instructions count: 526
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$getCommentDetail$1.call(java.lang.Object):java.lang.Object");
                }
            });
        }

        public static final void q(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback, boolean z17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, long j17) {
            java.lang.String str;
            jz5.f0 f0Var;
            java.lang.String str2;
            java.lang.String str3;
            java.lang.String str4;
            java.lang.String str5;
            java.lang.String str6;
            r45.ef2 mvInfo;
            r45.hf2 hf2Var;
            r45.ef2 mvInfo2;
            r45.hf2 hf2Var2;
            r45.ef2 mvInfo3;
            r45.hf2 hf2Var3;
            r45.ef2 mvInfo4;
            r45.hf2 hf2Var4;
            r45.ef2 mvInfo5;
            r45.hf2 hf2Var5;
            r45.ef2 mvInfo6;
            r45.hf2 hf2Var6;
            r45.ef2 mvInfo7;
            r45.hf2 hf2Var7;
            r45.ef2 mvInfo8;
            r45.hf2 hf2Var8;
            r45.ef2 mvInfo9;
            r45.hf2 hf2Var9;
            r45.ef2 mvInfo10;
            r45.hf2 hf2Var10;
            r45.ef2 mvInfo11;
            r45.hf2 hf2Var11;
            r45.ef2 mvInfo12;
            r45.hf2 hf2Var12;
            r45.ef2 mvInfo13;
            r45.hf2 hf2Var13;
            r45.ef2 mvInfo14;
            r45.hf2 hf2Var14;
            r45.if2 if2Var;
            r45.ef2 mvInfo15;
            r45.hf2 hf2Var15;
            r45.ef2 mvInfo16;
            r45.hf2 hf2Var16;
            r45.ef2 mvInfo17;
            r45.hf2 hf2Var17;
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
            r45.ef2 mvInfo18;
            r45.hf2 hf2Var18;
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
            com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
            msgViewCallback.getClass();
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
            if (objectDesc2 == null || (media = objectDesc2.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) {
                str = null;
            } else {
                str = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
            }
            if ((str == null || str.length() == 0) && (objectDesc = finderObject.getObjectDesc()) != null && (mvInfo18 = objectDesc.getMvInfo()) != null && (hf2Var18 = (r45.hf2) mvInfo18.getCustom(1)) != null && (str = hf2Var18.getString(8)) == null) {
                str = "";
            }
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
            java.lang.String nickname = contact != null ? contact.getNickname() : null;
            r45.xs4 xs4Var = new r45.xs4();
            long id6 = finderObject.getId();
            java.lang.String objectNonceId = finderObject.getObjectNonceId();
            java.lang.String str7 = msgViewCallback.f122857d;
            if (str == null || nickname == null || objectNonceId == null) {
                f0Var = null;
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_mv_cover_url", str);
                intent.putExtra("key_mv_feed_id", pm0.v.u(id6));
                intent.putExtra("key_mv_nonce_id", objectNonceId);
                intent.putExtra("key_mv_poster", nickname);
                intent.putExtra("key_launch_mv_comment", z17);
                intent.putExtra("key_refer_mv_comment_id", j17);
                intent.putExtra("key_need_update_music_ball_url", true);
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject.getObjectDesc();
                if (objectDesc3 == null || (mvInfo17 = objectDesc3.getMvInfo()) == null || (hf2Var17 = (r45.hf2) mvInfo17.getCustom(1)) == null || (str2 = hf2Var17.getString(12)) == null) {
                    str2 = "";
                }
                intent.putExtra("key_mv_extra_info", str2);
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = finderObject.getObjectDesc();
                if (objectDesc4 == null || (mvInfo16 = objectDesc4.getMvInfo()) == null || (hf2Var16 = (r45.hf2) mvInfo16.getCustom(1)) == null || (str3 = hf2Var16.getString(13)) == null) {
                    str3 = "";
                }
                intent.putExtra("key_mv_identification", str3);
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc5 = finderObject.getObjectDesc();
                intent.putExtra("key_mv_music_duration", (objectDesc5 == null || (mvInfo15 = objectDesc5.getMvInfo()) == null || (hf2Var15 = (r45.hf2) mvInfo15.getCustom(1)) == null) ? 0 : hf2Var15.getInteger(14));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc6 = finderObject.getObjectDesc();
                if (objectDesc6 == null || (mvInfo14 = objectDesc6.getMvInfo()) == null || (hf2Var14 = (r45.hf2) mvInfo14.getCustom(1)) == null || (if2Var = (r45.if2) hf2Var14.getCustom(17)) == null || (str4 = if2Var.getString(0)) == null) {
                    str4 = "";
                }
                intent.putExtra("key_mv_music_operation_url", str4);
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc7 = finderObject.getObjectDesc();
                if (objectDesc7 == null || (mvInfo13 = objectDesc7.getMvInfo()) == null || (hf2Var13 = (r45.hf2) mvInfo13.getCustom(1)) == null || (str5 = hf2Var13.getString(18)) == null) {
                    str5 = "";
                }
                intent.putExtra("key_mv_song_mid", str5);
                xs4Var.set(0, pm0.v.u(id6));
                xs4Var.set(1, objectNonceId);
                xs4Var.set(2, str);
                xs4Var.set(3, nickname);
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc8 = finderObject.getObjectDesc();
                xs4Var.set(4, (objectDesc8 == null || (mvInfo12 = objectDesc8.getMvInfo()) == null || (hf2Var12 = (r45.hf2) mvInfo12.getCustom(1)) == null) ? null : hf2Var12.getString(1));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc9 = finderObject.getObjectDesc();
                xs4Var.set(5, (objectDesc9 == null || (mvInfo11 = objectDesc9.getMvInfo()) == null || (hf2Var11 = (r45.hf2) mvInfo11.getCustom(1)) == null) ? null : hf2Var11.getString(7));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc10 = finderObject.getObjectDesc();
                xs4Var.set(6, (objectDesc10 == null || (mvInfo10 = objectDesc10.getMvInfo()) == null || (hf2Var10 = (r45.hf2) mvInfo10.getCustom(1)) == null) ? null : hf2Var10.getString(12));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc11 = finderObject.getObjectDesc();
                xs4Var.set(7, (objectDesc11 == null || (mvInfo9 = objectDesc11.getMvInfo()) == null || (hf2Var9 = (r45.hf2) mvInfo9.getCustom(1)) == null) ? null : hf2Var9.getString(9));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc12 = finderObject.getObjectDesc();
                xs4Var.set(8, java.lang.Long.valueOf((objectDesc12 == null || (mvInfo8 = objectDesc12.getMvInfo()) == null || (hf2Var8 = (r45.hf2) mvInfo8.getCustom(1)) == null) ? 0L : hf2Var8.getLong(11)));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc13 = finderObject.getObjectDesc();
                xs4Var.set(9, (objectDesc13 == null || (mvInfo7 = objectDesc13.getMvInfo()) == null || (hf2Var7 = (r45.hf2) mvInfo7.getCustom(1)) == null) ? null : hf2Var7.getString(1));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc14 = finderObject.getObjectDesc();
                xs4Var.set(10, java.lang.Integer.valueOf((objectDesc14 == null || (mvInfo6 = objectDesc14.getMvInfo()) == null || (hf2Var6 = (r45.hf2) mvInfo6.getCustom(1)) == null) ? 0 : hf2Var6.getInteger(14)));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc15 = finderObject.getObjectDesc();
                xs4Var.set(14, (objectDesc15 == null || (mvInfo5 = objectDesc15.getMvInfo()) == null || (hf2Var5 = (r45.hf2) mvInfo5.getCustom(1)) == null) ? null : hf2Var5.getString(0));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc16 = finderObject.getObjectDesc();
                xs4Var.set(15, (objectDesc16 == null || (mvInfo4 = objectDesc16.getMvInfo()) == null || (hf2Var4 = (r45.hf2) mvInfo4.getCustom(1)) == null) ? null : hf2Var4.getString(6));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc17 = finderObject.getObjectDesc();
                xs4Var.set(16, (objectDesc17 == null || (mvInfo3 = objectDesc17.getMvInfo()) == null || (hf2Var3 = (r45.hf2) mvInfo3.getCustom(1)) == null) ? null : hf2Var3.getString(8));
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc18 = finderObject.getObjectDesc();
                if (objectDesc18 == null || (mvInfo2 = objectDesc18.getMvInfo()) == null || (hf2Var2 = (r45.hf2) mvInfo2.getCustom(1)) == null || (str6 = hf2Var2.getString(18)) == null) {
                    str6 = "";
                }
                xs4Var.set(11, str6);
                xs4Var.set(13, str);
                com.tencent.mars.xlog.Log.i(str7, "jump to musicMvMainUI");
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc19 = finderObject.getObjectDesc();
                if (objectDesc19 != null && (mvInfo = objectDesc19.getMvInfo()) != null && (hf2Var = (r45.hf2) mvInfo.getCustom(1)) != null) {
                    com.tencent.mm.plugin.finder.storage.oa0.f127302a.e(hf2Var, pm0.v.u(finderObject.getId()), 13, xs4Var);
                }
                r45.bt4 bt4Var = new r45.bt4();
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.o.f(uuid, "toString(...)");
                bt4Var.f371037e = uuid;
                bt4Var.f371038f = 86;
                bt4Var.f371039g = pm0.v.u(finderObject.getId());
                bt4Var.f371036d = 5;
                com.tencent.mm.ui.MMActivity activity = msgViewCallback.f122860g;
                kotlin.jvm.internal.o.g(activity, "activity");
                bt4Var.f371041i = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
                intent.putExtra("key_mv_report_data", bt4Var.toByteArray());
                java.lang.String string = xs4Var.getString(14);
                if (string == null) {
                    string = "";
                }
                intent.putExtra("key_mv_song_name", string);
                java.lang.String string2 = xs4Var.getString(15);
                if (string2 == null) {
                    string2 = "";
                }
                intent.putExtra("key_mv_song_lyric", string2);
                java.lang.String string3 = xs4Var.getString(4);
                if (string3 == null) {
                    string3 = "";
                }
                intent.putExtra("key_mv_singer_name", string3);
                java.lang.String string4 = xs4Var.getString(5);
                if (string4 == null) {
                    string4 = "";
                }
                intent.putExtra("key_mv_album_name", string4);
                java.lang.String string5 = xs4Var.getString(7);
                if (string5 == null) {
                    string5 = "";
                }
                intent.putExtra("key_mv_music_genre", string5);
                intent.putExtra("key_mv_issue_date", java.lang.String.valueOf(xs4Var.getLong(8)));
                java.lang.String string6 = xs4Var.getString(16);
                if (string6 == null) {
                    string6 = "";
                }
                intent.putExtra("key_mv_album_cover_url", string6);
                java.lang.String string7 = xs4Var.getString(9);
                if (string7 == null) {
                    string7 = "";
                }
                intent.putExtra("key_mv_identification", string7);
                java.lang.String string8 = xs4Var.getString(6);
                if (string8 == null) {
                    string8 = "";
                }
                intent.putExtra("key_mv_extra_info", string8);
                intent.putExtra("key_mv_music_duration", xs4Var.getInteger(10));
                intent.putExtra("key_mv_music_operation_url", xs4Var.getString(12));
                intent.putExtra("key_mv_song_mid", xs4Var.getString(11));
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Pk(activity, intent);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i(str7, "jump to musicMvMainUI error " + str + ' ' + nickname + ' ' + finderObject.getId() + ' ' + finderObject.getObjectNonceId());
            }
        }

        @Override // ym5.l1
        public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mars.xlog.Log.i(this.f122857d, "[onOverStart] dy=" + i18);
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f122864n;
            if (mMProcessBar != null) {
                mMProcessBar.b(i18 / ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479684cj)));
                return false;
            }
            kotlin.jvm.internal.o.o("rlProcessBar");
            throw null;
        }

        public final void b() {
            fc2.o Z6;
            com.tencent.mm.ui.MMActivity context = this.f122860g;
            this.f122865o = new rl5.r(context);
            android.view.View view = this.f122861h;
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m6e);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
            this.f122863m = refreshLoadMoreLayout;
            refreshLoadMoreLayout.setLimitTopRequest(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu)));
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f122863m;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setRefreshTargetY(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)));
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f122863m;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout3.setDamping(1.85f);
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.m6l);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f122864n = (com.tencent.mm.ui.widget.MMProcessBar) findViewById2;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f122863m;
            if (refreshLoadMoreLayout4 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            this.f122862i = refreshLoadMoreLayout4.getRecyclerView();
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f486001ju1);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            this.f122866p = (android.widget.TextView) findViewById3;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f122862i;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
            android.widget.TextView textView = this.f122866p;
            if (textView == null) {
                kotlin.jvm.internal.o.o("refreshTip");
                throw null;
            }
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.f122859f;
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = msgPresenter.f122827h;
                    if (msgViewCallback != null) {
                        pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$showRefreshTip$1(null, msgViewCallback, false, 0));
                    }
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback2 = msgPresenter.f122827h;
                    if (msgViewCallback2 != null) {
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = msgViewCallback2.f122863m;
                        if (refreshLoadMoreLayout5 == null) {
                            kotlin.jvm.internal.o.o("rlLayout");
                            throw null;
                        }
                        refreshLoadMoreLayout5.L(false);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$2
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    if (com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.f122859f.f122823d != 2) {
                        if (type == so2.c4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.nq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                        }
                        if (type == so2.y3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.gq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                        }
                        if (type == so2.o3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.gp(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                        }
                        if (type == so2.d4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.pq();
                        }
                        if (type == so2.r3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.yp(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                        }
                        if (type == so2.a4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.kq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                        }
                        if (type == so2.w3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.eq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                        }
                        if (type == so2.v3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.dq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                        }
                        if (type == so2.b4.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.mq();
                        }
                        if (type == so2.s3.class.getName().hashCode()) {
                            return new com.tencent.mm.plugin.finder.convert.xp(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                        }
                        hc2.l.a(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.f122857d, type);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                    if (type == so2.c4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.nq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                    }
                    if (type == so2.y3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.gq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                    }
                    if (type == so2.o3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.jp(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t(), null, null, 6, null);
                    }
                    if (type == so2.d4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.pq();
                    }
                    if (type == so2.r3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.cq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                    }
                    if (type == so2.a4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.lq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                    }
                    if (type == so2.w3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.eq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                    }
                    if (type == so2.v3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.dq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                    }
                    if (type == so2.b4.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.mq();
                    }
                    if (type == so2.t3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.aq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                    }
                    if (type == so2.q3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.sq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                    }
                    if (type == so2.x3.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.fq(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.t());
                    }
                    hc2.l.a(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.f122857d, type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
            };
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f122859f;
            java.util.ArrayList arrayList = msgPresenter.f122828i;
            if (msgPresenter.f122823d == 1 && msgPresenter.f122824e == 1) {
                dm.pd pdVar = new dm.pd();
                pdVar.field_id = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                pdVar.field_createTime = Integer.MAX_VALUE;
                arrayList.add(0, new so2.d4(pdVar));
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, arrayList, true);
            this.f122867q = wxRecyclerAdapter;
            wxRecyclerAdapter.F = new in5.y0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$4
                @Override // in5.y0
                public void a(androidx.recyclerview.widget.RecyclerView recyclerView2, in5.w0 data) {
                    java.lang.String string;
                    java.lang.String string2;
                    kotlin.jvm.internal.o.g(recyclerView2, "recyclerView");
                    kotlin.jvm.internal.o.g(data, "data");
                    for (in5.x0 x0Var : data.f293156i) {
                        int h17 = x0Var.f293158a.h();
                        int hashCode = so2.d4.class.getName().hashCode();
                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this;
                        if (h17 == hashCode) {
                            m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
                            int i17 = I1 != null ? I1.field_systemMsgCount : 0;
                            if (i17 > 0) {
                                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                                kotlin.jvm.internal.o.f(c17, "getService(...)");
                                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                                com.tencent.mm.ui.MMActivity context2 = msgViewCallback.f122860g;
                                kotlin.jvm.internal.o.g(context2, "context");
                                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                com.tencent.mm.plugin.finder.report.o3.uj(o3Var, "5", 4, 1, 5, 0, i17, null, null, 0L, nyVar != null ? nyVar.V6() : null, 0, 0, 3520, null);
                            }
                            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "NotificitionCenterNotify", xy2.c.e(msgViewCallback.f122860g), false, false, 12, null);
                            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
                            com.tencent.mm.ui.MMActivity context3 = msgViewCallback.f122860g;
                            r45.f03 b07 = nk6.b0("NotificitionCenterNotify", xy2.c.e(context3));
                            if (S0 != null && b07 != null) {
                                com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                                kotlin.jvm.internal.o.g(context3, "context");
                                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                com.tencent.mm.plugin.finder.report.x2.i(x2Var, "5", S0, b07, 1, nyVar2 != null ? nyVar2.V6() : null, 0, null, 0, 0, 480, null);
                            }
                        }
                        in5.c cVar = x0Var.f293158a;
                        if (cVar.h() == so2.c4.class.getName().hashCode() && (cVar instanceof so2.c4)) {
                            dm.pd pdVar2 = ((so2.c4) cVar).f410411d;
                            if (pdVar2.field_notify != null) {
                                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(pdVar2.field_notify.getInteger(2));
                                sb6.append(",1,");
                                sb6.append(pm0.v.u(pdVar2.field_id));
                                sb6.append(',');
                                sb6.append(xy2.c.e(msgViewCallback.f122860g));
                                sb6.append(',');
                                r45.rk2 rk2Var = pdVar2.field_notify;
                                java.lang.String str = "";
                                sb6.append((rk2Var == null || (string2 = rk2Var.getString(6)) == null) ? "" : r26.i0.t(string2, ",", ";", false));
                                sb6.append(',');
                                r45.rk2 rk2Var2 = pdVar2.field_notify;
                                if (rk2Var2 != null && (string = rk2Var2.getString(9)) != null) {
                                    str = r26.i0.t(string, ",", ";", false);
                                }
                                sb6.append(str);
                                g0Var.kvStat(20849, sb6.toString());
                            }
                        }
                    }
                }
            };
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null && (Z6 = nyVar.Z6(-1)) != null) {
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f122862i;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                Z6.d(recyclerView2);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f122862i;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView3.setAdapter(this.f122867q);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f122867q;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.f293105o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$5
                    @Override // in5.x
                    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view2, int i17, androidx.recyclerview.widget.k3 k3Var) {
                        in5.s0 holder = (in5.s0) k3Var;
                        kotlin.jvm.internal.o.g(adapter, "adapter");
                        kotlin.jvm.internal.o.g(view2, "view");
                        kotlin.jvm.internal.o.g(holder, "holder");
                        int a07 = i17 - ((in5.n0) adapter).a0();
                        if (a07 >= 0) {
                            final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this;
                            if (a07 < msgViewCallback.f122859f.f122828i.size()) {
                                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter2 = msgViewCallback.f122859f;
                                java.lang.Object obj = msgPresenter2.f122828i.get(a07);
                                kotlin.jvm.internal.o.f(obj, "get(...)");
                                so2.i iVar = (so2.i) obj;
                                final dm.pd pdVar2 = iVar.f410411d;
                                int i18 = pdVar2.field_businessType;
                                com.tencent.mars.xlog.Log.i(msgViewCallback.f122857d, "onClick " + a07 + " id:" + pdVar2.field_id + " commentId:" + pdVar2.field_commentId);
                                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.UICallbackListener uICallbackListener = msgViewCallback.f122869s;
                                if (uICallbackListener != null) {
                                    uICallbackListener.F(pdVar2);
                                }
                                int i19 = msgPresenter2.f122823d;
                                com.tencent.mm.ui.MMActivity context2 = msgViewCallback.f122860g;
                                if (i19 == 1 && msgPresenter2.f122824e == 1 && a07 == 0) {
                                    m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
                                    int i27 = I1 != null ? I1.field_systemMsgCount : 0;
                                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ej(i27, 2L);
                                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).xj(context2, null, 1);
                                    if (i27 > 0) {
                                        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                                        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                                        kotlin.jvm.internal.o.g(context2, "context");
                                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                        com.tencent.mm.plugin.finder.report.o3.uj(o3Var, "5", 4, 2, 5, 0, i27, null, null, 0L, nyVar2 != null ? nyVar2.V6() : null, 0, 0, 3520, null);
                                    }
                                    com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "NotificitionCenterNotify", xy2.c.e(context2), false, false, 12, null);
                                    r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("NotificitionCenterNotify", xy2.c.e(context2));
                                    if (S0 == null || b07 == null) {
                                        return;
                                    }
                                    com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                                    kotlin.jvm.internal.o.g(context2, "context");
                                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                    com.tencent.mm.plugin.finder.report.x2.i(x2Var, "5", S0, b07, 2, nyVar3 != null ? nyVar3.V6() : null, 0, null, 0, 0, 480, null);
                                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().y("NotificitionCenterNotify", xy2.c.e(context2));
                                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().y("AuthorProfileNotify", xy2.c.e(context2));
                                    return;
                                }
                                int i28 = pdVar2.field_type;
                                if (i28 == 1) {
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.p(context2, pdVar2, i19, true);
                                    return;
                                }
                                android.content.Context context3 = holder.f293121e;
                                if (i28 == 10 || i28 == 11) {
                                    if (i28 != 11 || com.tencent.mm.sdk.platformtools.t8.K0(pdVar2.field_username)) {
                                        return;
                                    }
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.putExtra("finder_username", pdVar2.field_username);
                                    com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
                                    kotlin.jvm.internal.o.f(context3, "getContext(...)");
                                    com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context3, intent, 0L, null, 0, 9, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
                                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context3, intent);
                                    return;
                                }
                                if (i28 == 17) {
                                    android.content.Intent intent2 = new android.content.Intent();
                                    com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                                    kotlin.jvm.internal.o.f(context3, "getContext(...)");
                                    i0Var.Ik(context3, intent2);
                                    return;
                                }
                                dm.pd pdVar3 = iVar.f410411d;
                                if (i28 == 2 && (pdVar2.field_extFlag & 16) > 0) {
                                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Cj(pdVar2.field_type, pdVar2.u0() ? 1 : 0, pdVar2.v0(), pdVar3.field_objectId);
                                    if (com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.o(context2, pdVar2, msgPresenter2.f122823d)) {
                                        return;
                                    }
                                    db2.n4 n4Var = msgViewCallback.f122870t;
                                    if (n4Var != null) {
                                        n4Var.j();
                                    }
                                    db2.g4 g4Var = msgViewCallback.f122868r;
                                    if (g4Var != null) {
                                        g4Var.j();
                                    }
                                    long j17 = pdVar2.field_refVideoObjectId;
                                    java.lang.String str = "";
                                    java.lang.String field_refVideoObjectNonceId = pdVar2.field_refVideoObjectNonceId;
                                    kotlin.jvm.internal.o.f(field_refVideoObjectNonceId, "field_refVideoObjectNonceId");
                                    int i29 = 0;
                                    kotlin.jvm.internal.o.g(context2, "context");
                                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar4 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                    db2.n4 n4Var2 = new db2.n4(j17, str, field_refVideoObjectNonceId, i29, nyVar4 != null ? nyVar4.V6() : null, 8, null);
                                    msgViewCallback.f122870t = n4Var2;
                                    pq5.g l17 = n4Var2.l();
                                    l17.f(context2);
                                    l17.h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1
                                        @Override // gm5.a
                                        public java.lang.Object call(java.lang.Object obj2) {
                                            r45.wj4 wj4Var;
                                            r45.wj4 wj4Var2;
                                            com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj2;
                                            final dm.pd pdVar4 = pdVar2;
                                            final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback2 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this;
                                            if (fVar == null) {
                                                com.tencent.mars.xlog.Log.i(msgViewCallback2.f122857d, "result == null id " + pdVar4.field_id + " content " + com.tencent.mm.sdk.platformtools.t8.G1(pdVar4.field_content));
                                            } else if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                                                java.lang.String str2 = msgViewCallback2.f122857d;
                                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get mega video detail success, id = ");
                                                db2.n4 n4Var3 = msgViewCallback2.f122870t;
                                                sb6.append(n4Var3 != null ? java.lang.Long.valueOf(n4Var3.f228099t) : null);
                                                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                                                r45.xf2 xf2Var = new r45.xf2();
                                                com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
                                                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                                                xf2Var.set(0, (r45.oj4) ((r45.tj4) fVar2).getCustom(1));
                                                com.tencent.mm.protobuf.f fVar3 = fVar.f70618d;
                                                kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                                                xf2Var.set(1, (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.tj4) fVar3).getCustom(2));
                                                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter3 = msgViewCallback2.f122859f;
                                                int i37 = msgPresenter3.f122823d == 1 ? 7 : 5;
                                                r45.oj4 oj4Var = (r45.oj4) xf2Var.getCustom(0);
                                                if (oj4Var != null && (wj4Var = (r45.wj4) oj4Var.getCustom(18)) != null) {
                                                    long j18 = wj4Var.getLong(0);
                                                    r45.oj4 oj4Var2 = (r45.oj4) xf2Var.getCustom(0);
                                                    java.lang.String string = (oj4Var2 == null || (wj4Var2 = (r45.wj4) oj4Var2.getCustom(18)) == null) ? null : wj4Var2.getString(1);
                                                    int i38 = msgPresenter3.f122823d;
                                                    com.tencent.mm.ui.MMActivity context4 = msgViewCallback2.f122860g;
                                                    kotlin.jvm.internal.o.g(context4, "context");
                                                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar5 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                                    db2.g4 g4Var2 = new db2.g4(j18, string, i37, i38, "", true, null, null, 0L, null, false, false, null, nyVar5 != null ? nyVar5.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
                                                    msgViewCallback2.f122868r = g4Var2;
                                                    g4Var2.l().h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1$1$1
                                                        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
                                                        
                                                            if (com.tencent.mm.sdk.platformtools.t8.D0(r1 != null ? r1.getUsername() : null, xy2.c.e(r15)) != false) goto L26;
                                                         */
                                                        @Override // gm5.a
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                            To view partially-correct add '--show-bad-code' argument
                                                        */
                                                        public java.lang.Object call(java.lang.Object r21) {
                                                            /*
                                                                Method dump skipped, instructions count: 231
                                                                To view this dump add '--comments-level debug' option
                                                            */
                                                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1$1$1.call(java.lang.Object):java.lang.Object");
                                                        }
                                                    });
                                                }
                                            } else {
                                                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.l(msgViewCallback2, fVar.f70616b);
                                            }
                                            return jz5.f0.f302826a;
                                        }
                                    });
                                    return;
                                }
                                if (i28 != 4) {
                                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Cj(pdVar2.field_type, pdVar2.u0() ? 1 : 0, pdVar2.v0(), pdVar3.field_objectId);
                                    if (com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.o(context2, pdVar2, msgPresenter2.f122823d)) {
                                        return;
                                    }
                                    db2.g4 g4Var2 = msgViewCallback.f122868r;
                                    if (g4Var2 != null) {
                                        g4Var2.j();
                                    }
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.o(msgViewCallback, pdVar2);
                                    return;
                                }
                                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Cj(pdVar2.field_type, pdVar2.u0() ? 1 : 0, pdVar2.v0(), pdVar3.field_objectId);
                                r45.rk2 rk2Var = pdVar2.field_notify;
                                if (rk2Var != null) {
                                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(pdVar2.field_notify.getInteger(2));
                                    sb6.append(",2,");
                                    sb6.append(pm0.v.u(pdVar2.field_id));
                                    sb6.append(',');
                                    sb6.append(xy2.c.e(context2));
                                    sb6.append(',');
                                    java.lang.String string = rk2Var.getString(6);
                                    sb6.append(string != null ? r26.i0.t(string, ",", ";", false) : "");
                                    sb6.append(',');
                                    java.lang.String string2 = rk2Var.getString(9);
                                    sb6.append(string2 != null ? r26.i0.t(string2, ",", ";", false) : "");
                                    g0Var.kvStat(20849, sb6.toString());
                                    int integer = rk2Var.getInteger(2);
                                    if (integer == 1) {
                                        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
                                        com.tencent.mm.ui.MMActivity mMActivity = msgViewCallback.f122860g;
                                        java.lang.String string3 = rk2Var.getString(4);
                                        java.lang.String string4 = rk2Var.getString(3);
                                        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                                        appBrandStatObject.f87790f = com.tencent.mm.plugin.appbrand.jsapi.contact.u0.CTRL_INDEX;
                                        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).aj(mMActivity, string3, "", 0, 0, string4, appBrandStatObject);
                                        return;
                                    }
                                    if (integer == 2) {
                                        android.content.Intent intent3 = new android.content.Intent();
                                        intent3.putExtra("rawUrl", rk2Var.getString(3));
                                        j45.l.j(context2, "webview", ".ui.tools.WebViewUI", intent3, null);
                                        return;
                                    }
                                    if (integer == 3 || integer == 4) {
                                        db2.g4 g4Var3 = msgViewCallback.f122868r;
                                        if (g4Var3 != null) {
                                            g4Var3.j();
                                        }
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.o(msgViewCallback, pdVar2);
                                        return;
                                    }
                                    if (integer != 6) {
                                        if (integer != 8) {
                                            return;
                                        }
                                        db2.g4 g4Var4 = msgViewCallback.f122868r;
                                        if (g4Var4 != null) {
                                            g4Var4.j();
                                        }
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.o(msgViewCallback, pdVar2);
                                        return;
                                    }
                                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) rk2Var.getCustom(7);
                                    if (finderJumpInfo != null) {
                                        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                                        xc2.y2 y2Var = xc2.y2.f453343a;
                                        kotlin.jvm.internal.o.f(context3, "getContext(...)");
                                        xc2.y2.i(y2Var, context3, p0Var, 6, null, 8, null);
                                        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Yk(context3, p0Var, pdVar2.field_id, true);
                                    }
                                }
                            }
                        }
                    }
                };
            }
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.f293104n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$6
                    @Override // in5.y
                    public boolean c(androidx.recyclerview.widget.f2 adapter, final android.view.View view2, int i17, androidx.recyclerview.widget.k3 k3Var) {
                        in5.s0 holder = (in5.s0) k3Var;
                        kotlin.jvm.internal.o.g(adapter, "adapter");
                        kotlin.jvm.internal.o.g(view2, "view");
                        kotlin.jvm.internal.o.g(holder, "holder");
                        final int a07 = i17 - ((in5.n0) adapter).a0();
                        if (a07 < 0) {
                            return true;
                        }
                        final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this;
                        if (a07 >= msgViewCallback.f122859f.f122828i.size()) {
                            return true;
                        }
                        java.lang.Object obj = msgViewCallback.f122859f.f122828i.get(a07);
                        kotlin.jvm.internal.o.f(obj, "get(...)");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClick ");
                        sb6.append(a07);
                        sb6.append(" id:");
                        final dm.pd pdVar2 = ((so2.i) obj).f410411d;
                        sb6.append(pdVar2.field_id);
                        sb6.append(" commentId:");
                        sb6.append(pdVar2.field_commentId);
                        com.tencent.mars.xlog.Log.i(msgViewCallback.f122857d, sb6.toString());
                        rl5.r rVar = msgViewCallback.f122865o;
                        if (rVar == null) {
                            kotlin.jvm.internal.o.o("popupMenu");
                            throw null;
                        }
                        rVar.a();
                        rl5.r rVar2 = msgViewCallback.f122865o;
                        if (rVar2 != null) {
                            rVar2.h(view2, new android.view.View.OnCreateContextMenuListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$1
                                @Override // android.view.View.OnCreateContextMenuListener
                                public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view3, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                                    contextMenu.add(0, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.f122858e, 0, view2.getResources().getString(com.tencent.mm.R.string.ev_));
                                }
                            }, new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2

                                @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr45/e11;", "it", "Ljz5/f0;", "invoke", "(Lr45/e11;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2$1, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f122895d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback f122896e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f122897f;

                                    /* renamed from: g, reason: collision with root package name */
                                    public final /* synthetic */ int f122898g;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(az2.f fVar, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback, dm.pd pdVar, int i17) {
                                        super(1);
                                        this.f122895d = fVar;
                                        this.f122896e = msgViewCallback;
                                        this.f122897f = pdVar;
                                        this.f122898g = i17;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        r45.e11 it = (r45.e11) obj;
                                        kotlin.jvm.internal.o.g(it, "it");
                                        this.f122895d.b();
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = this.f122896e;
                                        java.lang.String str = msgViewCallback.f122857d;
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mentionId: ");
                                        dm.pd pdVar = this.f122897f;
                                        sb6.append(pdVar.field_id);
                                        com.tencent.mars.xlog.Log.i(str, sb6.toString());
                                        cu2.a0 a0Var = cu2.b0.f222371a;
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = msgViewCallback.f122859f;
                                        a0Var.a(pdVar, msgPresenter.f122823d);
                                        java.util.ArrayList arrayList = msgPresenter.f122828i;
                                        int i17 = this.f122898g;
                                        arrayList.remove(i17);
                                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = msgViewCallback.f122867q;
                                        if (wxRecyclerAdapter != null) {
                                            wxRecyclerAdapter.notifyItemRemoved(i17);
                                        }
                                        com.tencent.mm.ui.MMActivity mMActivity = msgViewCallback.f122860g;
                                        db5.t7.makeText(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.erj), 0).show();
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/modelbase/f;", "Lr45/e11;", "it", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/modelbase/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2$2, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass2 extends kotlin.jvm.internal.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f122899d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback f122900e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f122901f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass2(az2.f fVar, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback, dm.pd pdVar) {
                                        super(1);
                                        this.f122899d = fVar;
                                        this.f122900e = msgViewCallback;
                                        this.f122901f = pdVar;
                                    }

                                    @Override // yz5.l
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        this.f122899d.b();
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = this.f122900e;
                                        com.tencent.mars.xlog.Log.i(msgViewCallback.f122857d, "del mention network error!: " + this.f122901f.field_id);
                                        com.tencent.mm.ui.MMActivity mMActivity = msgViewCallback.f122860g;
                                        db5.t7.makeText(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.eri), 0).show();
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2$3, reason: invalid class name */
                                /* loaded from: classes5.dex */
                                final class AnonymousClass3 extends kotlin.jvm.internal.q implements yz5.a {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f122902d;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass3(az2.f fVar) {
                                        super(0);
                                        this.f122902d = fVar;
                                    }

                                    @Override // yz5.a
                                    public java.lang.Object invoke() {
                                        this.f122902d.b();
                                        return jz5.f0.f302826a;
                                    }
                                }

                                @Override // db5.t4
                                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                                    int itemId = menuItem.getItemId();
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback2 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this;
                                    if (itemId == msgViewCallback2.f122858e) {
                                        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                                        dm.pd pdVar3 = pdVar2;
                                        o3Var.rj(0, 1, pdVar3.field_type);
                                        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(bq.p0.e(bq.q0.f23513t, 2, 0, xy2.c.e(msgViewCallback2.f122860g), false, 8, null));
                                        az2.c cVar = az2.f.f16125d;
                                        com.tencent.mm.ui.MMActivity mMActivity = msgViewCallback2.f122860g;
                                        az2.f a17 = az2.c.a(cVar, mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.f9y), 200L, null, 8, null);
                                        a17.a();
                                        i95.m c17 = i95.n0.c(cq.k.class);
                                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                                        cq.j1.e((cq.k) c17, "", pdVar3.field_id, null, pdVar3.field_objectId, pdVar3.field_commentId, b17, pdVar3.field_type, pdVar3.field_svrMentionId, new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2.AnonymousClass1(a17, msgViewCallback2, pdVar3, a07), new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2.AnonymousClass2(a17, msgViewCallback2, pdVar3), new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2.AnonymousClass3(a17));
                                    }
                                }
                            }, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
                            return true;
                        }
                        kotlin.jvm.internal.o.o("popupMenu");
                        throw null;
                    }
                };
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f122863m;
            if (refreshLoadMoreLayout5 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout5.setOverCallback(this);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout6 = this.f122863m;
            if (refreshLoadMoreLayout6 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout6.setActionCallback(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$7
                @Override // ym5.q3
                public void b(int i17) {
                    boolean b17 = bq.q0.f23513t.b();
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this;
                    if (b17) {
                        msgViewCallback.f122859f.c();
                        return;
                    }
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter2 = msgViewCallback.f122859f;
                    long j17 = ((so2.i) kz5.n0.i0(msgPresenter2.f122828i)).f410411d.field_id;
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.getClass();
                    msgPresenter2.f(j17, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122822c, true, false);
                }

                @Override // ym5.q3
                public void c(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                }

                @Override // ym5.q3
                public void d(int i17, rn5.a aVar, boolean z17) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this;
                    msgViewCallback.f122859f.c();
                    androidx.recyclerview.widget.RecyclerView recyclerView4 = msgViewCallback.f122862i;
                    if (recyclerView4 != null) {
                        recyclerView4.setItemAnimator(new uw2.n0());
                    } else {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                }

                @Override // ym5.q3
                public void e(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this;
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout7 = msgViewCallback.f122863m;
                    if (refreshLoadMoreLayout7 == null) {
                        kotlin.jvm.internal.o.o("rlLayout");
                        throw null;
                    }
                    com.tencent.mm.view.RefreshLoadMoreLayout.u(refreshLoadMoreLayout7, null, 1, null);
                    androidx.recyclerview.widget.RecyclerView recyclerView4 = msgViewCallback.f122862i;
                    if (recyclerView4 != null) {
                        recyclerView4.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$7$onRefreshEnd$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.recyclerview.widget.RecyclerView recyclerView5 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.this.f122862i;
                                if (recyclerView5 != null) {
                                    recyclerView5.setItemAnimator(new androidx.recyclerview.widget.z());
                                } else {
                                    kotlin.jvm.internal.o.o("recyclerView");
                                    throw null;
                                }
                            }
                        }, 1000L);
                    } else {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                }
            });
            if (!bq.q0.f23513t.b()) {
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$8(this));
            }
            pm0.v.V(300L, new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$9(this));
        }

        @Override // ym5.l1
        public void g(int i17) {
            com.tencent.mars.xlog.Log.i(this.f122857d, "[onOverStop]");
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f122864n;
            if (mMProcessBar != null) {
                mMProcessBar.d();
            } else {
                kotlin.jvm.internal.o.o("rlProcessBar");
                throw null;
            }
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f122860g;
        }

        @Override // ym5.l1
        public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mars.xlog.Log.i(this.f122857d, "[onOverEnd] dy=" + i18);
            return false;
        }

        public final void s(java.util.List msgList, boolean z17, boolean z18) {
            kotlin.jvm.internal.o.g(msgList, "msgList");
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            f0Var.f310116d = this.f122859f.f122828i.size();
            long j17 = 0;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.getClass();
                long j18 = uptimeMillis - com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122821b;
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (j18 < ((java.lang.Number) t70Var.F2().r()).longValue()) {
                    j17 = ((java.lang.Number) t70Var.F2().r()).longValue() - j18;
                }
            }
            pm0.v.V(j17, new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$finishLoadMore$1(this, msgList, z18, f0Var));
        }

        public final com.tencent.mm.plugin.finder.convert.kp t() {
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f122859f;
            return new com.tencent.mm.plugin.finder.convert.kp(msgPresenter.f122823d, msgPresenter.f122824e);
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[kv2.i.values().length];
            try {
                iArr[0] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                kv2.i iVar = kv2.i.f312665d;
                iArr[1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                kv2.i iVar2 = kv2.i.f312665d;
                iArr[2] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                kv2.i iVar3 = kv2.i.f312665d;
                iArr[3] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                kv2.i iVar4 = kv2.i.f312665d;
                iArr[4] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private FinderMsgContract() {
    }

    public static /* synthetic */ java.lang.String e(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract, com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter, int i17, so2.e0 e0Var, int i18, com.tencent.mm.api.IEmojiInfo iEmojiInfo, r45.k60 k60Var, org.json.JSONObject jSONObject, java.lang.Boolean bool, int i19, java.lang.Object obj) {
        return finderMsgContract.d(finderCommentFooter, i17, e0Var, i18, iEmojiInfo, k60Var, (i19 & 64) != 0 ? null : jSONObject, (i19 & 128) != 0 ? null : bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c4, code lost:
    
        if (r7 != null) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x014a, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0146, code lost:
    
        if (pm0.v.z(r27.field_extFlag, 128) != false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x009e, code lost:
    
        if (r9 != 33) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0120, code lost:
    
        if (pm0.v.z(r27.field_extFlag, 128) != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0148, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028a A[LOOP:0: B:135:0x0284->B:137:0x028a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f8  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r7v6, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String l(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract r22, android.content.Context r23, int r24, boolean r25, java.lang.String r26, dm.pd r27, boolean r28, boolean r29, boolean r30, boolean r31, int r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract, android.content.Context, int, boolean, java.lang.String, dm.pd, boolean, boolean, boolean, boolean, int, java.lang.Object):java.lang.String");
    }

    public static void r(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract, final android.view.View redPacketBanner, final r45.tl6 tl6Var, java.lang.String viewId, java.lang.String str, java.lang.Integer num, yz5.a aVar, int i17, java.lang.Object obj) {
        final java.lang.String str2 = (i17 & 8) != 0 ? null : str;
        final java.lang.Integer num2 = (i17 & 16) != 0 ? null : num;
        final yz5.a aVar2 = (i17 & 32) != 0 ? null : aVar;
        finderMsgContract.getClass();
        kotlin.jvm.internal.o.g(redPacketBanner, "redPacketBanner");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        if (tl6Var == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(redPacketBanner, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(redPacketBanner, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String string = tl6Var.getString(1);
        if (string == null) {
            string = "";
        }
        android.widget.TextView textView = (android.widget.TextView) redPacketBanner.findViewById(com.tencent.mm.R.id.tua);
        textView.setText(((ht2.y0) ((zy2.s6) i95.n0.c(zy2.s6.class))).mj(string, (int) textView.getTextSize(), false));
        int integer = tl6Var.getInteger(0);
        if (integer == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(redPacketBanner, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(redPacketBanner, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (integer == 1) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(redPacketBanner, arrayList3.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(redPacketBanner, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$refreshRedPackBanner$1$1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$refreshRedPackBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    xc2.y2 y2Var = xc2.y2.f453343a;
                    android.content.Context context = view.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    finderJumpInfo.setHtml5_info((com.tencent.mm.protocal.protobuf.Html5Info) tl6Var.getCustom(3));
                    y2Var.I(context, new xc2.p0(finderJumpInfo), null);
                    yz5.a aVar3 = yz5.a.this;
                    if (aVar3 != null) {
                        aVar3.invoke();
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$refreshRedPackBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        } else if (integer == 2 || integer == 3) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(redPacketBanner, arrayList4.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(redPacketBanner, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$refreshRedPackBanner$1$2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(view);
                    java.lang.Object[] array = arrayList5.toArray();
                    arrayList5.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$refreshRedPackBanner$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    xc2.y2 y2Var = xc2.y2.f453343a;
                    android.content.Context context = view.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    finderJumpInfo.setMini_app_info((com.tencent.mm.protocal.protobuf.MiniAppInfo) tl6Var.getCustom(2));
                    xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                    p0Var.f453251m = new l81.b1();
                    xc2.y2.P(y2Var, context, p0Var, 0, false, null, 0.0f, 60, null);
                    yz5.a aVar3 = yz5.a.this;
                    if (aVar3 != null) {
                        aVar3.invoke();
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$refreshRedPackBanner$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.pk(redPacketBanner, viewId);
        aVar3.ik(redPacketBanner, 8, 29309);
        aVar3.Ai(redPacketBanner, new ly1.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$refreshRedPackBanner$1$3$1
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str3) {
                android.content.Context context = redPacketBanner.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                jz5.l[] lVarArr = new jz5.l[6];
                lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
                lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
                lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
                r45.tl6 tl6Var2 = tl6Var;
                lVarArr[3] = new jz5.l("red_envelope_banner_type", tl6Var2 != null ? java.lang.Integer.valueOf(tl6Var2.getInteger(0)) : null);
                lVarArr[4] = new jz5.l("feed_id", str2);
                lVarArr[5] = new jz5.l("like_panel", num2);
                return kz5.c1.k(lVarArr);
            }
        });
        aVar3.Tj(redPacketBanner, 40, 1, false);
    }

    public final void a(android.content.Context context, int i17) {
        r45.dt5 dt5Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_MENTION_LIST_INTERACTION_JUMP_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        if (v17.length() > 0) {
            r45.et5 et5Var = new r45.et5();
            try {
                et5Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            java.util.LinkedList list = et5Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getReward_tips_infos(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.dt5) obj).getList(0).contains(java.lang.Integer.valueOf(i17))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.dt5 dt5Var2 = (r45.dt5) obj;
            com.tencent.mars.xlog.Log.i("FinderMsgContract", "trigger_type: " + i17 + ", listSize: " + et5Var.getList(0).size());
            java.util.LinkedList list2 = et5Var.getList(0);
            kotlin.jvm.internal.o.f(list2, "getReward_tips_infos(...)");
            int i18 = 0;
            for (java.lang.Object obj2 : list2) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.dt5 dt5Var3 = (r45.dt5) obj2;
                com.tencent.mars.xlog.Log.i("FinderMsgContract", "read RewardTipsInfo, index: " + i18 + ", triggerType: " + dt5Var3.getList(0) + ", jumpType: " + dt5Var3.getInteger(1) + ", showType: " + dt5Var3.getInteger(2) + ", link: " + dt5Var3.getString(3) + ", expireTime: " + dt5Var3.getLong(4));
                i18 = i19;
            }
            et5Var.getList(0).remove(dt5Var2);
            try {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MENTION_LIST_INTERACTION_JUMP_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(et5Var.toByteArray()));
            } catch (java.lang.Exception unused) {
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFinderMentionListInteractionInfo, url: ");
            sb6.append(dt5Var2 != null ? dt5Var2.getString(3) : null);
            sb6.append(", showType: ");
            sb6.append(dt5Var2 != null ? java.lang.Integer.valueOf(dt5Var2.getInteger(2)) : null);
            sb6.append(", jumpType: ");
            sb6.append(dt5Var2 != null ? java.lang.Integer.valueOf(dt5Var2.getInteger(1)) : null);
            com.tencent.mars.xlog.Log.i("FinderMsgContract", sb6.toString());
            dt5Var = dt5Var2;
        } else {
            dt5Var = null;
        }
        if (dt5Var == null) {
            return;
        }
        if (dt5Var.getLong(4) < c01.id.e()) {
            com.tencent.mars.xlog.Log.i("FinderMsgContract", "info invaild");
            return;
        }
        if (dt5Var.getInteger(1) == 1) {
            if (dt5Var.getInteger(2) == 1) {
                java.lang.String string = dt5Var.getString(3);
                n(context, string != null ? string : "", true);
            } else {
                java.lang.String string2 = dt5Var.getString(3);
                n(context, string2 != null ? string2 : "", false);
            }
        }
    }

    public final void b(final in5.s0 holder, long j17, long j18, int i17, r45.e60 e60Var, boolean z17) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.g60 g60Var = (e60Var == null || (list = e60Var.getList(0)) == null) ? null : (r45.g60) kz5.n0.Z(list);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.swc);
        if (viewGroup == null) {
            return;
        }
        if (z17 || i17 != 1 || g60Var == null) {
            viewGroup.setVisibility(8);
            return;
        }
        final com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = (com.tencent.mm.plugin.finder.view.FinderEmojiView) holder.p(com.tencent.mm.R.id.sw_);
        finderEmojiView.setEmojiMaxSize(holder.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn));
        finderEmojiView.setEmojiMinSize(finderEmojiView.getEmojiMaxSize() / 2);
        final kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.feature.emoji.api.n6 n6Var = (com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
        java.lang.String string = g60Var.getString(0);
        if (string == null) {
            string = "";
        }
        h0Var.f310123d = ((com.tencent.mm.feature.emoji.t2) n6Var).Bi(string, g60Var.getByteString(5));
        viewGroup.setVisibility(0);
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.f0().r()).booleanValue()) {
            java.lang.String md52 = ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).getMd5();
            kotlin.jvm.internal.o.f(md52, "getMd5(...)");
            if (!r26.i0.y(md52, "failedTest", false)) {
                h0Var.f310123d = ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class))).Bi("failedTest:" + ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).getMd5(), null);
            }
        }
        com.tencent.mm.api.IEmojiInfo emojiInfo = finderEmojiView.getEmojiInfo();
        if (!kotlin.jvm.internal.o.b(emojiInfo != null ? emojiInfo.getMd5() : null, ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).getMd5())) {
            finderEmojiView.setEmojiInfo((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d);
            finderEmojiView.requestLayout();
        }
        final android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.swd);
        final android.view.View p17 = holder.p(com.tencent.mm.R.id.ddp);
        final android.view.View p18 = holder.p(com.tencent.mm.R.id.t7i);
        final android.view.View p19 = holder.p(com.tencent.mm.R.id.t7j);
        finderEmojiView.setDownloadListener(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentEmoji$1(j18, j17, i17, h0Var));
        finderEmojiView.setStatusListener(new sr.b() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentEmoji$2
            @Override // sr.b
            public void a(int i18) {
                boolean E0 = ((com.tencent.mm.api.IEmojiInfo) kotlin.jvm.internal.h0.this.f310123d).E0();
                android.view.ViewGroup viewGroup3 = viewGroup2;
                if (E0 || i18 == 1) {
                    viewGroup3.setVisibility(8);
                    return;
                }
                if (i18 == 0) {
                    viewGroup3.setVisibility(0);
                    android.view.View view = p17;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = p18;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = p19;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                if (i18 == -1) {
                    viewGroup3.setVisibility(0);
                    android.view.View view4 = p17;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view5 = p18;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view6 = p19;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        });
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Pc).getValue()).r()).booleanValue()) {
            finderEmojiView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentEmoji$3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    kotlin.jvm.internal.h0 h0Var2 = kotlin.jvm.internal.h0.this;
                    java.lang.String md53 = ((com.tencent.mm.api.IEmojiInfo) h0Var2.f310123d).getMd5();
                    if (md53 == null) {
                        md53 = "";
                    }
                    objArr[0] = md53;
                    com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView2 = finderEmojiView;
                    objArr[1] = java.lang.Integer.valueOf(finderEmojiView2.getStatus());
                    com.tencent.mars.xlog.Log.i("FinderMsgContract", "emoji longClick: %s status:%d", objArr);
                    if (finderEmojiView2.getStatus() == -1) {
                        finderEmojiView2.getDelegate().reload();
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.api.IEmojiInfo) h0Var2.f310123d).getMd5())) {
                        com.tencent.mm.feature.emoji.api.v5 v5Var = (com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class);
                        java.lang.String md54 = ((com.tencent.mm.api.IEmojiInfo) h0Var2.f310123d).getMd5();
                        if (md54 == null) {
                            md54 = "";
                        }
                        if (((com.tencent.mm.feature.emoji.k0) v5Var).Bi(md54) == null) {
                            com.tencent.mm.feature.emoji.api.n6 n6Var2 = (com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
                            java.lang.String md55 = ((com.tencent.mm.api.IEmojiInfo) h0Var2.f310123d).getMd5();
                            if (md55 == null) {
                                md55 = "";
                            }
                            ((com.tencent.mm.feature.emoji.t2) n6Var2).wi(md55, (com.tencent.mm.api.IEmojiInfo) h0Var2.f310123d);
                            ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Vi((com.tencent.mm.api.IEmojiInfo) h0Var2.f310123d);
                        }
                        java.lang.String md56 = ((com.tencent.mm.api.IEmojiInfo) h0Var2.f310123d).getMd5();
                        qk.u uVar = new qk.u(md56 != null ? md56 : "", (com.tencent.mm.api.IEmojiInfo) h0Var2.f310123d);
                        uVar.f364155a = 41;
                        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                        if (p6Var != null) {
                            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(holder.f293121e, uVar);
                        }
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
    }

    public final void c(final in5.s0 holder, final long j17, final long j18, final int i17, r45.e60 e60Var, boolean z17) {
        java.lang.String str;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.swi);
        final r45.j60 j60Var = (e60Var == null || (list = e60Var.getList(1)) == null) ? null : (r45.j60) kz5.n0.Z(list);
        if (z17 || i17 != 2 || j60Var == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        final android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.c7_);
        int dimensionPixelSize = holder.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
        int min = java.lang.Math.min(j60Var.getInteger(2), j60Var.getInteger(3));
        float max = min == 0 ? 1.0f : java.lang.Math.max(j60Var.getInteger(2), j60Var.getInteger(3)) / min;
        if (max > 1.3333334f) {
            max = 1.3333334f;
        }
        if (j60Var.getInteger(3) > j60Var.getInteger(2)) {
            viewGroup.getLayoutParams().width = dimensionPixelSize;
            viewGroup.getLayoutParams().height = (int) (dimensionPixelSize * max);
        } else {
            viewGroup.getLayoutParams().width = (int) (dimensionPixelSize * max);
            viewGroup.getLayoutParams().height = dimensionPixelSize;
        }
        final kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = 1L;
        java.lang.String string = j60Var.getString(7);
        str = "";
        if (string == null || string.length() == 0) {
            h0Var.f310123d = j60Var.getString(0);
            java.lang.String string2 = j60Var.getString(1);
            str = string2 != null ? string2 : "";
            g0Var.f310121d = 0L;
        } else {
            h0Var.f310123d = j60Var.getString(7);
            java.lang.String string3 = j60Var.getString(8);
            if (string3 != null) {
                str = string3;
            }
        }
        final java.lang.String str2 = str;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.f0().r()).booleanValue()) {
            h0Var.f310123d = "failedTest:" + ((java.lang.String) h0Var.f310123d);
        }
        final android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.swj);
        final android.view.View p17 = holder.p(com.tencent.mm.R.id.u3z);
        final android.view.View p18 = holder.p(com.tencent.mm.R.id.u3l);
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        wo0.c a17 = d1Var.a(ya2.l.f460502a.e(((java.lang.String) h0Var.f310123d) + str2, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        ep0.e eVar = new ep0.e() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$1
            @Override // ep0.e
            public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imageLoader: result:");
                sb6.append(bitmap != null);
                com.tencent.mars.xlog.Log.i("FinderMsgContract", sb6.toString());
                boolean z18 = bitmap != null;
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
                pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$showImageStatus$1(z18, viewGroup2, p18, p17));
            }
        };
        a17.getClass();
        a17.f447873d = eVar;
        a17.f447879j = new ep0.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$2
            @Override // ep0.a
            public final void a(boolean z18, java.lang.Object[] objArr) {
                com.tencent.mars.xlog.Log.i("FinderMsgContract", "imageLoader: download:" + z18);
                com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct finderCommentResourceLoadingStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct();
                finderCommentResourceLoadingStruct.q(pm0.v.u(j18));
                finderCommentResourceLoadingStruct.p(pm0.v.u(j17));
                finderCommentResourceLoadingStruct.f56686f = i17;
                finderCommentResourceLoadingStruct.f56687g = !z18 ? 1L : 0L;
                finderCommentResourceLoadingStruct.f56688h = java.lang.System.currentTimeMillis() - currentTimeMillis;
                finderCommentResourceLoadingStruct.f56689i = finderCommentResourceLoadingStruct.b("Url", (java.lang.String) h0Var.f310123d, true);
                finderCommentResourceLoadingStruct.f56692l = finderCommentResourceLoadingStruct.b("Token", str2, true);
                finderCommentResourceLoadingStruct.f56690j = g0Var.f310121d;
                finderCommentResourceLoadingStruct.k();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2091L, z18 ? 2L : 3L, 1L, false);
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
                pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$showImageStatus$1(z18, viewGroup2, p18, p17));
            }
        };
        a17.f447878i = new ep0.b(viewGroup2, p18, p17) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$3

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ android.view.View f122932a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ android.view.View f122933b;

            {
                this.f122932a = p18;
                this.f122933b = p17;
            }
        };
        kotlin.jvm.internal.o.d(imageView);
        a17.b(imageView, true);
        viewGroup.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$4
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                android.content.Intent intent = new android.content.Intent();
                r45.j60 j60Var2 = r45.j60.this;
                java.lang.String string4 = j60Var2.getString(0);
                java.lang.String string5 = j60Var2.getString(1);
                if (string5 == null) {
                    string5 = "";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(j60Var2.getString(7));
                java.lang.String string6 = j60Var2.getString(8);
                sb6.append(string6 != null ? string6 : "");
                java.lang.String sb7 = sb6.toString();
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Wc).getValue()).r()).booleanValue()) {
                    string4 = android.net.Uri.parse(j60Var2.getString(0)).buildUpon().clearQuery().toString() + "-failedTest";
                }
                intent.putExtra("nowUrl", string4 + string5);
                intent.putExtra("thumbUrl", sb7);
                intent.putExtra("urlList", new java.lang.String[]{string4 + string5});
                intent.putExtra("ShowIndicator", false);
                intent.putExtra("BottomSheetStyle", 0);
                intent.putExtra("FinderScene", 1);
                intent.putExtra("FinderCommentId", j17);
                intent.putExtra("FinderFeedId", j18);
                intent.putExtra("FinderRawUrl", string4);
                intent.putExtra("FinderUrlToken", string5);
                in5.s0 s0Var = holder;
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                intent.putExtra("key_ref_comment_scene", V6 != null ? V6.getInteger(5) : 0);
                intent.putExtra("key_click_tab_context_id", V6 != null ? V6.getString(2) : null);
                intent.putExtra("key_context_id", V6 != null ? V6.getString(1) : null);
                android.graphics.Rect rect = new android.graphics.Rect();
                imageView.getGlobalVisibleRect(rect);
                com.tencent.mars.xlog.Log.i("FinderMsgContract", "doPreviewImg left %d, top %d, w %d, h %d", java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()));
                intent.putExtra("img_gallery_width", rect.width()).putExtra("img_gallery_height", rect.height()).putExtra("img_gallery_left", rect.left).putExtra("img_gallery_top", rect.top);
                int width = rect.width();
                android.content.Context context2 = s0Var.f293121e;
                if (width > 0 && rect.height() > 0 && rect.height() < i65.a.k(context2)) {
                    intent.putExtra("shouldRunDragAnimation", true);
                }
                j45.l.j(context2, "subapp", ".ui.gallery.GestureGalleryUI", intent, null);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String d(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter, int i17, so2.e0 e0Var, int i18, com.tencent.mm.api.IEmojiInfo iEmojiInfo, r45.k60 k60Var, org.json.JSONObject jSONObject, java.lang.Boolean bool) {
        java.lang.String str;
        int i19;
        java.util.LinkedList list;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPickView quickPickEmoji;
        str = "0";
        if (finderCommentFooter != null && (quickPickEmoji = finderCommentFooter.getQuickPickEmoji()) != null) {
            str = (quickPickEmoji.getPickEmojiStr().length() > 0) == true ? quickPickEmoji.getPickEmojiStr() : "0";
            quickPickEmoji.setPickEmojiStr("");
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("CandidateEmoji", str);
        jSONObject2.put("comment_source", finderCommentFooter != null ? finderCommentFooter.getCommentSource() : 1);
        jSONObject2.put("Entertype", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).tk(i17));
        if (e0Var != null) {
            jSONObject2.put("click_choose_finder_cnt", e0Var.f410321a);
            jSONObject2.put("input_finder_cnt", e0Var.f410322b);
            jSONObject2.put("remind_finder_list", e0Var.f410323c);
        }
        if (i18 == 2) {
            jSONObject2.put("you_might_want_to_send_picture", kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) ? 1 : 0);
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = f122820a;
        finderMsgContract.getClass();
        if (k60Var == null || (list = k60Var.getList(0)) == null) {
            i19 = 0;
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.h60) obj).getString(0), c01.z1.r())) {
                    break;
                }
            }
            i19 = obj == null ? list.size() : list.size() - 1;
        }
        jSONObject2.put("friend_recommend_cnt", i19);
        finderMsgContract.getClass();
        jSONObject2.put("ContentType", i18);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (iEmojiInfo != null) {
            jSONObject3.put("pid", iEmojiInfo.getGroupId());
            jSONObject3.put("emoticon_designerid", iEmojiInfo.X0());
            jSONObject3.put("emoticon_activityid", iEmojiInfo.S0());
        }
        jSONObject2.put("big_sticker_info", jSONObject3);
        java.lang.Object md52 = iEmojiInfo != null ? iEmojiInfo.getMd5() : null;
        jSONObject2.put("EmoticonMd5", md52 != null ? md52 : "");
        finderMsgContract.getClass();
        if (jSONObject != null) {
            try {
                jSONObject2.put("posterinfo", jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("FinderMsgContract", e17.getMessage());
            }
        }
        java.lang.String jSONObject4 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        return r26.i0.t(jSONObject4, ",", ";", false);
    }

    public final void f(final com.tencent.mm.ui.MMActivity context, final dm.pd mention, final int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mention, "mention");
        final int i18 = i17 == 1 ? 7 : 5;
        long j17 = mention.field_objectId;
        java.lang.String str = mention.field_objectNonceId;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        pq5.g l17 = new db2.g4(j17, str, i18, i17, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null).l();
        l17.f(context);
        l17.h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$getCommentDetail$1
            /* JADX WARN: Removed duplicated region for block: B:49:0x019b  */
            @Override // gm5.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object call(java.lang.Object r37) {
                /*
                    Method dump skipped, instructions count: 481
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$getCommentDetail$1.call(java.lang.Object):java.lang.Object");
            }
        });
    }

    public final int g(dm.pd mention) {
        kotlin.jvm.internal.o.g(mention, "mention");
        return m(mention.field_contact) ? 1 : 2;
    }

    public final int h(android.content.Context context, int i17) {
        if (i17 == 1) {
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (context instanceof androidx.appcompat.app.AppCompatActivity) {
                return ((com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).X6();
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((vy2.e) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(vy2.e.class)).X6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final org.json.JSONObject i(int i17, r45.e60 e60Var) {
        java.util.LinkedList list;
        r45.j60 j60Var;
        java.lang.String string;
        if (i17 == 2 && e60Var != null && (list = e60Var.getList(1)) != null && (j60Var = (r45.j60) kz5.n0.Z(list)) != null && (string = j60Var.getString(0)) != null) {
            try {
                java.lang.String attribute = new androidx.exifinterface.media.ExifInterface(string).getAttribute(androidx.exifinterface.media.ExifInterface.TAG_USER_COMMENT);
                if (attribute != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(attribute);
                    if (jSONObject.has("poster_type")) {
                        if (jSONObject.has("poster_num")) {
                            return jSONObject;
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FinderMsgContract", e17.getMessage());
            }
        }
        return null;
    }

    public final java.lang.String j(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("comment_source", i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    public final r45.qt2 k(android.content.Context context, int i17) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar == null) {
            return null;
        }
        r45.qt2 V6 = nyVar.V6();
        V6.set(5, java.lang.Integer.valueOf(i17));
        return V6;
    }

    public final boolean m(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        java.lang.String username;
        return (finderContact == null || (username = finderContact.getUsername()) == null || !r26.i0.n(username, "@finder", false)) ? false : true;
    }

    public final void n(android.content.Context context, java.lang.String str, boolean z17) {
        if (z17) {
            i95.m c17 = i95.n0.c(zg0.u2.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) zg0.u2.K2((zg0.u2) c17, context, str, null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.0f, 0.0f, null, false, false, 1, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 2, false, false, false, 7864015, null), 4, null)).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public final boolean o(android.content.Context context, dm.pd mention, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mention, "mention");
        if (mention.field_objectType != 6) {
            return false;
        }
        java.lang.String str = mention.field_memberProviderFinderusername;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                db5.t7.makeText(context, "no providerUsername", 1).show();
            }
            com.tencent.mars.xlog.Log.i("FinderMsgContract", "no providerUsername");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_member_top_feed", mention.field_objectId);
            intent.putExtra("key_member_inlet_source", 26);
            intent.putExtra("feed_object_id", mention.field_objectId);
            intent.putExtra("mention_id", mention.field_id);
            intent.putExtra("mention_create_time", mention.field_createTime);
            intent.putExtra("from_scene", i17);
            u(intent, mention);
            com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(context, intent);
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P0().r()).intValue() == 1) {
                r45.t64 t64Var = mention.field_likeInfo;
                if ((t64Var != null ? t64Var.getInteger(2) : 0) > 0) {
                    intent.putExtra("key_show_first_like_tag", true);
                }
            }
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            java.lang.String field_memberProviderFinderusername = mention.field_memberProviderFinderusername;
            kotlin.jvm.internal.o.f(field_memberProviderFinderusername, "field_memberProviderFinderusername");
            i0Var.Nk(context, intent, field_memberProviderFinderusername, 0, 0);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
    
        if (r23.field_likeId != 0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
    
        if (r3 != 0) goto L304;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(final android.content.Context r22, dm.pd r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.p(android.content.Context, dm.pd, int, boolean):void");
    }

    public final int q(dm.pd mention, int i17) {
        java.lang.String str;
        r45.so2 so2Var;
        if (i17 != 1) {
            if (i17 != 2) {
                return 0;
            }
            if ((mention.u0() || (mention.field_extFlag & 1) == 0) ? false : true) {
                return 2;
            }
            return (mention.t0() && ya2.g.h(ya2.h.f460484a, mention.field_username, null, false, false, 14, null)) ? 1 : 0;
        }
        kotlin.jvm.internal.o.g(mention, "mention");
        int i18 = mention.field_type;
        boolean z17 = i18 == 1 || i18 == 10 || i18 == 11;
        boolean z18 = i18 == 17;
        r45.r31 r31Var = mention.field_followReason;
        boolean z19 = (r31Var == null || r31Var.getInteger(0) == 0) ? false : true;
        r45.pg2 pg2Var = mention.field_svrMention;
        if (pg2Var == null || (so2Var = (r45.so2) pg2Var.getCustom(53)) == null || (str = so2Var.getString(0)) == null) {
            str = "";
        }
        if ((mention.u0() || (mention.field_extFlag & 1) == 0) ? false : true) {
            return 6;
        }
        if ((mention.field_extFlag & 64) > 0) {
            return 1;
        }
        if (z17 && z19) {
            return 3;
        }
        if (str.length() > 0) {
            return 7;
        }
        if (!z17 && !z18 && mention.field_followFlag == 1) {
            return 2;
        }
        if (mention.field_orderCount > 0) {
            return 4;
        }
        return mention.field_interactionCount > 0 ? 5 : 0;
    }

    public final void s(android.view.View view, dm.pd pdVar, int i17, int i18, boolean z17) {
        int i19 = z17 ? 16 : i17 == 1 ? 14 : 15;
        int i27 = pdVar.t0() ? 1 : 2;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        long j17 = i19;
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_contact;
        com.tencent.mm.plugin.finder.report.o3.Mj(o3Var, context, j17, 1L, false, i27, i18, l(this, context2, i17, false, finderContact != null ? finderContact.getUsername() : null, pdVar, z17, false, true, false, com.tencent.mm.plugin.appbrand.jsapi.q3.CTRL_INDEX, null), 8, null);
    }

    public final void t(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        r45.qt2 k17 = k(context, 97);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, k17, "", i17, jSONObject, false, null, 48, null);
    }

    public final void u(android.content.Intent intent, dm.pd mention) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        kotlin.jvm.internal.o.g(mention, "mention");
        intent.putExtra("mention_finder", mention.field_svrMention.toByteArray());
    }

    public final void v(android.view.View view, final so2.i msg, final int i17, final boolean z17, final boolean z18, final boolean z19) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (view != null) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$setClickListener$1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    boolean z27;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis - qd2.h.f361767a >= 500) {
                        z27 = false;
                    } else {
                        com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
                        z27 = true;
                    }
                    qd2.h.f361767a = currentTimeMillis;
                    if (z27) {
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    dm.pd pdVar = so2.i.this.f410411d;
                    android.content.Context context = view2.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    this.p(context, pdVar, i17, z18);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
                    android.content.Context context2 = view2.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    finderMsgContract.getClass();
                    com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, finderMsgContract.k(context2, 117), "protrait", 1, null, false, null, 56, null);
                    if (z17) {
                        this.s(view2, pdVar, i17, 1, z19);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
    }

    public final void w(com.tencent.mm.plugin.finder.view.UserRelationshipTagTextView view, final dm.pd mention, final int i17) {
        r45.so2 so2Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(mention, "mention");
        int q17 = q(mention, i17);
        if (i17 == 1) {
            view.setVisibility(0);
            java.lang.String str = "";
            switch (q17) {
                case 1:
                    view.b(com.tencent.mm.plugin.finder.view.ss.f133075d, null);
                    break;
                case 2:
                    view.b(com.tencent.mm.plugin.finder.view.ss.f133076e, null);
                    break;
                case 3:
                    int integer = mention.field_followReason.getInteger(0);
                    if (integer == 1) {
                        str = view.getResources().getString(com.tencent.mm.R.string.cxx);
                    } else if (integer == 2) {
                        str = view.getResources().getString(com.tencent.mm.R.string.cxv);
                    } else if (integer == 3) {
                        str = view.getResources().getString(com.tencent.mm.R.string.cxw);
                    }
                    kotlin.jvm.internal.o.d(str);
                    view.b(com.tencent.mm.plugin.finder.view.ss.f133078g, str);
                    break;
                case 4:
                    view.g(mention.field_orderCount);
                    break;
                case 5:
                    view.e(mention.field_interactionCount);
                    break;
                case 6:
                    view.b(com.tencent.mm.plugin.finder.view.ss.f133079h, null);
                    break;
                case 7:
                    r45.pg2 pg2Var = mention.field_svrMention;
                    if (pg2Var != null && (so2Var = (r45.so2) pg2Var.getCustom(53)) != null && (string = so2Var.getString(0)) != null) {
                        str = string;
                    }
                    view.b(com.tencent.mm.plugin.finder.view.ss.f133080i, str);
                    break;
                default:
                    view.setVisibility(8);
                    break;
            }
        } else if (i17 == 2) {
            view.setVisibility(0);
            if (q17 == 1) {
                view.b(com.tencent.mm.plugin.finder.view.ss.f133077f, null);
            } else if (q17 != 2) {
                view.setVisibility(8);
            } else {
                view.b(com.tencent.mm.plugin.finder.view.ss.f133079h, null);
            }
        }
        if (view.getVisibility() == 0) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127641cc).getValue()).r()).intValue() == 1) {
                view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$setMentionUserTag$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view2);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setMentionUserTag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        if (view2 == null) {
                            yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setMentionUserTag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        android.content.Context context = view2.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.this.p(context, mention, i17, true);
                        dm.pd pdVar = mention;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.this.s(view2, pdVar, i17, 7, pdVar.field_type == 17);
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setMentionUserTag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            }
        }
    }

    public final void x(android.content.Intent intent, int i17, int i18) {
        int i19;
        kotlin.jvm.internal.o.g(intent, "intent");
        if (i17 == 1) {
            if (i18 != 0) {
                if (i18 == 1) {
                    i19 = 35;
                }
                i19 = 0;
            } else {
                i19 = 37;
            }
        } else if (i18 != 0) {
            if (i18 == 1) {
                i19 = 34;
            }
            i19 = 0;
        } else {
            i19 = 36;
        }
        intent.putExtra("key_enter_profile_type", i19);
    }

    public final void y(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String string = resources != null ? resources.getString(com.tencent.mm.R.string.epi) : null;
        if (string == null || string.length() == 0) {
            return;
        }
        db5.t7.makeText(context, string, 0).show();
    }

    public final dm.pd z(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        kotlin.jvm.internal.o.g(mMActivity, "<this>");
        if (!mMActivity.getIntent().hasExtra("mention_finder")) {
            return null;
        }
        r45.pg2 pg2Var = new r45.pg2();
        byte[] byteArrayExtra = mMActivity.getIntent().getByteArrayExtra("mention_finder");
        if (byteArrayExtra != null) {
            try {
                pg2Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        return cu2.b0.f222371a.k(i17, pg2Var, "");
    }
}
