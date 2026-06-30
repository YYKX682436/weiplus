package com.tencent.mm.plugin.finder.post;

/* loaded from: classes10.dex */
public final class PostMainUIC extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.ui.tools.c5, mv2.w0, ya2.r1 {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public com.tencent.mm.ui.tools.f5 G;
    public ry2.o H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public int f122511J;
    public int K;
    public long L;
    public boolean M;
    public int N;
    public final java.util.ArrayList P;
    public final jz5.g Q;
    public final jz5.g R;
    public final jz5.g S;
    public final jz5.g T;
    public final jz5.g U;
    public int V;
    public final jz5.g W;
    public sr2.z2 X;
    public boolean Y;
    public final boolean[] Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f122512d;

    /* renamed from: e, reason: collision with root package name */
    public ya2.b2 f122513e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f122514f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ScrollView f122515g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f122516h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f122517i;

    /* renamed from: l1, reason: collision with root package name */
    public final org.json.JSONObject f122518l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f122519m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f122520n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f122521o;

    /* renamed from: p, reason: collision with root package name */
    public ry2.e f122522p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f122523p0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.post.PostMainUIC$jumpInfoEventListener$1 f122524p1;

    /* renamed from: q, reason: collision with root package name */
    public aw2.n f122525q;

    /* renamed from: r, reason: collision with root package name */
    public aw2.y0 f122526r;

    /* renamed from: s, reason: collision with root package name */
    public aw2.a f122527s;

    /* renamed from: t, reason: collision with root package name */
    public aw2.m0 f122528t;

    /* renamed from: u, reason: collision with root package name */
    public aw2.c0 f122529u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f122530v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f122531w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f122532x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f122533x0;

    /* renamed from: x1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.post.PostMainUIC$finderPostPreviewDelSourceListener$1 f122534x1;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f122535y;

    /* renamed from: y0, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f122536y0;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f122537z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.post.PostMainUIC$jumpInfoEventListener$1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.finder.post.PostMainUIC$finderPostPreviewDelSourceListener$1] */
    public PostMainUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f122512d = "";
        this.f122530v = jz5.h.b(new sr2.w4(activity));
        this.f122531w = jz5.h.b(new sr2.p3(activity));
        this.f122532x = jz5.h.b(new sr2.b3(activity));
        this.f122535y = jz5.h.b(new sr2.d3(activity));
        this.f122537z = jz5.h.b(new sr2.z4(activity));
        this.A = jz5.h.b(new sr2.h5(activity));
        this.B = jz5.h.b(new sr2.b4(activity));
        this.C = jz5.h.b(new sr2.a3(activity));
        this.D = jz5.h.b(new sr2.x4(activity));
        this.E = jz5.h.b(new sr2.u4(activity));
        this.F = jz5.h.b(new sr2.v4(activity));
        this.K = -1;
        this.P = new java.util.ArrayList();
        this.Q = jz5.h.b(new sr2.t4(activity));
        this.R = jz5.h.b(new sr2.j5(this));
        this.S = jz5.h.b(new sr2.i5(this));
        this.T = jz5.h.b(new sr2.l4(this));
        this.U = jz5.h.b(new sr2.w3(this));
        this.W = jz5.h.a(jz5.i.f302831f, sr2.n4.f411646d);
        this.X = sr2.z2.f411823d;
        this.Z = new boolean[]{false};
        this.f122533x0 = new sr2.t3(this);
        this.f122536y0 = new sr2.b5(this);
        this.f122518l1 = new org.json.JSONObject();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f122524p1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PostJumpInfoEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.post.PostMainUIC$jumpInfoEventListener$1
            {
                this.__eventId = 1627106574;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PostJumpInfoEvent postJumpInfoEvent) {
                com.tencent.mm.autogen.events.PostJumpInfoEvent event = postJumpInfoEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = event.f54620g.f7440a;
                if (finderJumpInfo == null) {
                    return false;
                }
                pm0.v.X(new sr2.m4(com.tencent.mm.plugin.finder.post.PostMainUIC.this, finderJumpInfo, activity));
                return false;
            }
        };
        this.f122534x1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderPostPreviewDelSourceEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.post.PostMainUIC$finderPostPreviewDelSourceListener$1
            {
                this.__eventId = -550237786;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderPostPreviewDelSourceEvent finderPostPreviewDelSourceEvent) {
                com.tencent.mm.autogen.events.FinderPostPreviewDelSourceEvent event = finderPostPreviewDelSourceEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "[FinderPostPreviewDelSourceEvent] notified.");
                com.tencent.mm.plugin.finder.post.PostMainUIC.P6(com.tencent.mm.plugin.finder.post.PostMainUIC.this);
                return true;
            }
        };
    }

    public static final void O6(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        androidx.appcompat.app.AppCompatActivity activity = postMainUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        sr2.n5 n5Var = (sr2.n5) pf5.z.f353948a.a(activity).a(sr2.n5.class);
        sr2.m3 m3Var = new sr2.m3(postMainUIC);
        n5Var.getClass();
        boolean z17 = false;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.A3).getValue()).r()).intValue() == 0) {
            com.tencent.mars.xlog.Log.i("Finder.PostRealNameAuthUIC", "[isNeedAuth] disable, no need auth");
        } else {
            ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(n5Var.getActivity()));
            if ((b17 == null || (finderAuthInfo = b17.field_authInfo) == null || finderAuthInfo.getAuthIconType() != 2) ? false : true) {
                com.tencent.mars.xlog.Log.i("Finder.PostRealNameAuthUIC", "[isNeedAuth] enterprise account, no need auth");
            } else {
                boolean wk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).wk();
                com.tencent.mars.xlog.Log.i("Finder.PostRealNameAuthUIC", "[isNeedAuth] hasPosted:" + wk6);
                z17 = wk6 ^ true;
            }
        }
        if (!z17) {
            m3Var.invoke(java.lang.Boolean.TRUE);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.PostRealNameAuthUIC", "[gotoRealNameAuth]");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("intent_appid", "wxd6fc9057fee8b782");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("8,578");
        intent.putExtra("intent_category_id", new org.json.JSONArray((java.util.Collection) linkedList).toString());
        intent.putExtra("intent_auth_type", 1);
        intent.putExtra("id_ui_theme", 1);
        intent.putExtra("intent_app_name", n5Var.getActivity().getResources().getString(com.tencent.mm.R.string.f491990ev4));
        androidx.appcompat.app.AppCompatActivity activity2 = n5Var.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
        if (mMActivity != null) {
            mMActivity.mmSetOnActivityResultCallback(new sr2.m5(m3Var));
        }
        j45.l.n(n5Var.getContext(), "appbrand", ".ui.autofill.AppBrandIDCardUI", intent, 30001);
    }

    public static final void P6(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.zw0 client_draft_ext_info;
        java.util.LinkedList list;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject3;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        com.tencent.mm.protocal.protobuf.FinderMediaExtra mediaExtra;
        java.util.LinkedList<java.lang.String> cover_url_word;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject4;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.util.LinkedList<r45.mb4> mediaExtList;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject5;
        jz5.l i17;
        ry2.e eVar = postMainUIC.f122522p;
        if (eVar != null && (i17 = eVar.i()) != null) {
            postMainUIC.g7().getLayoutParams().width = ((java.lang.Number) i17.f302833d).intValue();
            postMainUIC.g7().getLayoutParams().height = ((java.lang.Number) i17.f302834e).intValue();
        }
        ry2.e eVar2 = postMainUIC.f122522p;
        if (eVar2 != null) {
            eVar2.d();
        }
        postMainUIC.f122522p = null;
        postMainUIC.k7().f401420e = -1;
        postMainUIC.k7().f401432p = false;
        ry2.o k76 = postMainUIC.k7();
        com.tencent.mars.xlog.Log.i(k76.f401414b, "delMedia: ");
        android.os.Bundle bundle = k76.f401416c;
        bundle.remove("KEY_POST_VIDEO_TEMPLATE");
        bundle.remove("KEY_POST_MJ_PUBLISHER_INFO");
        android.content.Intent intent = k76.f401412a;
        intent.removeExtra("postType");
        intent.removeExtra("postMediaList");
        intent.removeExtra("key_post_media_quality_list");
        intent.removeExtra("video_composition");
        intent.removeExtra("postTypeList");
        intent.removeExtra("postRefMediaList");
        intent.removeExtra("postRefFeedInfo");
        intent.removeExtra("KEY_POST_FROM_CAMERA");
        intent.removeExtra("postVideoCropList");
        intent.removeExtra("postThumbList");
        intent.removeExtra("KEY_POST_VLOG_CROP_RECT");
        intent.removeExtra("MEDIA_EXTRA_MUSIC");
        intent.removeExtra("ORIGIN_MUSIC_ID");
        intent.removeExtra("ORIGIN_MUSIC_INFO");
        intent.removeExtra("ORIGIN_MUSIC_PATH");
        intent.removeExtra("ORIGIN_BGM_URL");
        intent.removeExtra("MEDIA_IS_MUTE");
        intent.removeExtra("MUSIC_IS_MUTE");
        intent.removeExtra("SOUND_TRACK_TYPE");
        intent.removeExtra("MUSIC_FEED_ID");
        intent.removeExtra("isLongVideoPost");
        intent.removeExtra("KEY_POST_HALF_IMAGE_LIST");
        intent.removeExtra("KEY_POST_HALF_RECT_LIST");
        intent.removeExtra("VIDEO_COVER_URL");
        intent.removeExtra("VIDEO_FULL_COVER_URL");
        intent.removeExtra("VIDEO_COVER_QUALITY");
        intent.removeExtra("VIDEO_COVER_STYLE");
        intent.removeExtra("KEY_POST_MIAOJIAN_TONGKUAN_META");
        intent.removeExtra("KEY_POST_VIDEO_TEMPLATE");
        intent.removeExtra("KEY_POST_MJ_PUBLISHER_INFO");
        intent.removeExtra("key_cover_select_source");
        intent.removeExtra("VIDEO_SHARE_FULL_COVER_URL");
        intent.removeExtra("VIDEO_SHARE_COVER_URL");
        intent.removeExtra("VIDEO_SHARE_COVER_INFO_WRAP");
        intent.removeExtra("VIDEO_SHARE_COVER_STYLE");
        intent.removeExtra("VIDEO_SHARE_COVER_SOURCE");
        intent.removeExtra("KEY_CREATE_TEMPLATE_INFO");
        k76.f401421e0 = null;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = k76.F;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = (finderItem == null || (feedObject5 = finderItem.getFeedObject()) == null) ? null : feedObject5.getObjectDesc();
        if (objectDesc4 != null) {
            objectDesc4.setVideo_tmpl_info(null);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = k76.F;
        if (finderItem2 != null && (mediaExtList = finderItem2.getMediaExtList()) != null) {
            mediaExtList.clear();
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = k76.F;
        if (finderItem3 != null) {
            finderItem3.setMediaType(-1);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = k76.F;
        if (finderItem4 != null && (feedObject4 = finderItem4.getFeedObject()) != null && (objectDesc3 = feedObject4.getObjectDesc()) != null && (media = objectDesc3.getMedia()) != null) {
            media.clear();
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem5 = k76.F;
        if (finderItem5 != null && (feedObject3 = finderItem5.getFeedObject()) != null && (objectDesc2 = feedObject3.getObjectDesc()) != null && (mediaExtra = objectDesc2.getMediaExtra()) != null && (cover_url_word = mediaExtra.getCover_url_word()) != null) {
            cover_url_word.clear();
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem6 = k76.F;
        if (finderItem6 != null && (feedObject2 = finderItem6.getFeedObject()) != null && (objectDesc = feedObject2.getObjectDesc()) != null && (client_draft_ext_info = objectDesc.getClient_draft_ext_info()) != null && (list = client_draft_ext_info.getList(4)) != null) {
            list.clear();
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem7 = k76.F;
        intent.putExtra("KEY_POST_DRAFT_FINDER_ITEM", finderItem7 != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.h(finderItem7).toByteArray() : null);
        ov2.b bVar = ov2.b.f349168a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem8 = k76.F;
        bVar.b((finderItem8 == null || (feedObject = finderItem8.getFeedObject()) == null) ? null : feedObject.getObjectDesc());
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem9 = k76.F;
        bVar.b((finderItem9 == null || (finderObject = finderItem9.field_finderObject) == null) ? null : finderObject.getObjectDesc());
        android.app.Activity context = postMainUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((sr2.w5) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sr2.w5.class)).f411787p.clear();
        android.view.ViewGroup viewGroup = postMainUIC.f122514f;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mediaViewContainer");
            throw null;
        }
        viewGroup.removeAllViews();
        android.view.View g76 = postMainUIC.g7();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g76, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "delMediaInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(g76, "com/tencent/mm/plugin/finder/post/PostMainUIC", "delMediaInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = (android.view.View) ((jz5.n) postMainUIC.f122531w).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "delMediaInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/post/PostMainUIC", "delMediaInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        aw2.m0 m0Var = postMainUIC.f122528t;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("postOriginWidget");
            throw null;
        }
        m0Var.b(postMainUIC.f122522p != null, postMainUIC.q7());
        postMainUIC.Z6();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject == null) {
            return;
        }
        finderFeedReportObject.setVideoSource(0);
    }

    public static final android.view.View Q6(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        return (android.view.View) ((jz5.n) postMainUIC.E).getValue();
    }

    public static final android.view.View R6(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        return (android.view.View) ((jz5.n) postMainUIC.F).getValue();
    }

    public static final android.view.View S6(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        return (android.view.View) ((jz5.n) postMainUIC.D).getValue();
    }

    public static final void T6(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC, int i17) {
        java.lang.Integer num = postMainUIC.k7().f401420e;
        if (num == null || num.intValue() != 2) {
            java.lang.Integer num2 = postMainUIC.k7().f401420e;
            if (num2 != null && num2.intValue() == 4 && (postMainUIC.f122522p instanceof ry2.q0)) {
                com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                java.lang.Integer num3 = postMainUIC.k7().f401420e;
                int intValue = num3 != null ? num3.intValue() : -1;
                ry2.e eVar = postMainUIC.f122522p;
                kotlin.jvm.internal.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.post.PostVideoWidget");
                p2Var.E(i17, intValue, 0L, ((ry2.q0) eVar).u());
            }
        } else if (postMainUIC.f122522p instanceof ry2.t) {
            com.tencent.mm.plugin.finder.report.p2 p2Var2 = com.tencent.mm.plugin.finder.report.p2.f125237a;
            java.lang.Integer num4 = postMainUIC.k7().f401420e;
            int intValue2 = num4 != null ? num4.intValue() : -1;
            ry2.e eVar2 = postMainUIC.f122522p;
            kotlin.jvm.internal.o.e(eVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.post.PostImageWidget");
            p2Var2.E(i17, intValue2, ((ry2.t) eVar2).f401489s != null ? r9.size() : 0, 0L);
        }
        com.tencent.mm.plugin.finder.report.p2.f125237a.G("andr_Post_Page_Delete", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:5:0x002f, B:7:0x0035, B:11:0x003f, B:13:0x0047, B:17:0x0051, B:19:0x0059, B:23:0x0063), top: B:4:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void U6(com.tencent.mm.plugin.finder.post.PostMainUIC r7, bw5.cr r8) {
        /*
            ry2.o r0 = r7.k7()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.k()
            if (r0 != 0) goto Lc
            goto Ld6
        Lc:
            sr2.w0 r1 = r7.F7()
            java.lang.String r1 = r1.T6()
            sr2.w0 r2 = r7.F7()
            java.lang.String r2 = r2.a7()
            ry2.o r7 = r7.k7()
            java.lang.String r3 = "VIDEO_COVER_URL"
            android.os.Bundle r7 = r7.f401416c
            java.lang.String r7 = r7.getString(r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r4 = 0
            r5 = 1
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "if_modify_describe"
            if (r1 == 0) goto L3e
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L3c
            goto L3e
        L3c:
            r1 = r4
            goto L3f
        L3e:
            r1 = r5
        L3f:
            r1 = r1 ^ r5
            r3.put(r6, r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "if_modify_short_title"
            if (r2 == 0) goto L50
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L4e
            goto L50
        L4e:
            r2 = r4
            goto L51
        L50:
            r2 = r5
        L51:
            r2 = r2 ^ r5
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "if_modify_cover"
            if (r7 == 0) goto L62
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L6c
            if (r7 != 0) goto L60
            goto L62
        L60:
            r7 = r4
            goto L63
        L62:
            r7 = r5
        L63:
            r7 = r7 ^ r5
            org.json.JSONObject r7 = r3.put(r1, r7)     // Catch: java.lang.Throwable -> L6c
            kotlin.Result.m521constructorimpl(r7)     // Catch: java.lang.Throwable -> L6c
            goto L76
        L6c:
            r7 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            kotlin.Result.m521constructorimpl(r7)
        L76:
            java.lang.String r7 = r3.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.f(r7, r1)
            java.lang.String r1 = "modifyRet"
            kotlin.jvm.internal.o.g(r8, r1)
            com.tencent.mm.autogen.mmdata.rpt.FinderModifyStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.FinderModifyStruct
            r1.<init>()
            long r2 = r0.getId()
            java.lang.String r0 = pm0.v.u(r2)
            java.lang.String r2 = "feed_id"
            java.lang.String r0 = r1.b(r2, r0, r5)
            r1.f57418d = r0
            java.lang.String r0 = ","
            java.lang.String r2 = ";"
            java.lang.String r0 = r26.i0.t(r7, r0, r2, r4)
            java.lang.String r2 = "feed_modify_info"
            java.lang.String r0 = r1.b(r2, r0, r5)
            r1.f57419e = r0
            int r8 = r8.f26205d
            r1.f57420f = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[reportModFeed] feedId:"
            r0.<init>(r2)
            java.lang.String r2 = r1.f57418d
            r0.append(r2)
            java.lang.String r2 = " modifyRet:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = " feedModifyInfo:"
            r0.append(r8)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "FinderModifyFeedHelper"
            com.tencent.mars.xlog.Log.i(r8, r7)
            r1.k()
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.post.PostMainUIC.U6(com.tencent.mm.plugin.finder.post.PostMainUIC, bw5.cr):void");
    }

    public static /* synthetic */ void Y6(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC, android.view.View view, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            view = null;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        postMainUIC.X6(view, z17);
    }

    public final void A7() {
        jz5.f0 f0Var;
        java.lang.String str;
        boolean z17 = false;
        if (B7()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getActivity().findViewById(com.tencent.mm.R.id.f484914tt4);
            if (viewGroup != null) {
                q26.h hVar = new q26.h((q26.i) q26.h0.j(new n3.r1(viewGroup), sr2.c4.f411532d));
                while (hVar.hasNext()) {
                    android.view.View view = (android.view.View) hVar.next();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "hideWidgets", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/post/PostMainUIC", "hideWidgets", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.f486368l12);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "initWidgets", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/post/PostMainUIC", "initWidgets", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        java.lang.Integer num = k7().f401420e;
        if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 7)) {
            this.f122522p = new ry2.t(getActivity(), 0, 2, null);
        } else if (num != null && num.intValue() == 4) {
            this.f122522p = new ry2.q0(getActivity(), this.f122512d);
        } else if (num != null && num.intValue() == 8) {
            this.f122522p = new ry2.y(getActivity());
        }
        ry2.e eVar = this.f122522p;
        if (eVar != null) {
            android.view.ViewGroup viewGroup2 = this.f122514f;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("mediaViewContainer");
                throw null;
            }
            viewGroup2.removeAllViews();
            android.view.View b17 = eVar.b();
            if (b17 == null) {
                android.view.ViewGroup viewGroup3 = this.f122514f;
                if (viewGroup3 == null) {
                    kotlin.jvm.internal.o.o("mediaViewContainer");
                    throw null;
                }
                viewGroup3.setVisibility(8);
            } else {
                android.view.ViewGroup viewGroup4 = this.f122514f;
                if (viewGroup4 == null) {
                    kotlin.jvm.internal.o.o("mediaViewContainer");
                    throw null;
                }
                viewGroup4.addView(b17);
                android.view.ViewGroup viewGroup5 = this.f122514f;
                if (viewGroup5 == null) {
                    kotlin.jvm.internal.o.o("mediaViewContainer");
                    throw null;
                }
                viewGroup5.post(new sr2.i4(b17, this));
                android.view.ViewGroup viewGroup6 = this.f122514f;
                if (viewGroup6 == null) {
                    kotlin.jvm.internal.o.o("mediaViewContainer");
                    throw null;
                }
                viewGroup6.setOnClickListener(null);
                x7();
            }
            android.os.Bundle data = k7().f401416c;
            kotlin.jvm.internal.o.g(data, "data");
            eVar.f401375e = data;
            eVar.m();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            x7();
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        com.tencent.mm.ui.tools.f5 f5Var = this.G;
        if (f5Var == null) {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
        aw2.c0 c0Var = new aw2.c0(mMActivity, f5Var);
        this.f122529u = c0Var;
        java.util.ArrayList arrayList3 = this.P;
        arrayList3.add(c0Var);
        aw2.y0 y0Var = new aw2.y0(mMActivity);
        this.f122526r = y0Var;
        arrayList3.add(y0Var);
        aw2.a aVar = new aw2.a(mMActivity);
        this.f122527s = aVar;
        java.lang.String str2 = (java.lang.String) ((jz5.n) this.R).getValue();
        kotlin.jvm.internal.o.f(str2, "<get-vstId>(...)");
        aVar.f14720g.setVstId(str2);
        aw2.a aVar2 = this.f122527s;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("activityWidget");
            throw null;
        }
        arrayList3.add(aVar2);
        aw2.m0 m0Var = new aw2.m0(mMActivity);
        this.f122528t = m0Var;
        m0Var.b(this.f122522p != null, q7());
        aw2.m0 m0Var2 = this.f122528t;
        if (m0Var2 == null) {
            kotlin.jvm.internal.o.o("postOriginWidget");
            throw null;
        }
        arrayList3.add(m0Var2);
        com.tencent.mm.ui.tools.f5 f5Var2 = this.G;
        if (f5Var2 == null) {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
        aw2.n nVar = new aw2.n(mMActivity, f5Var2);
        this.f122525q = nVar;
        arrayList3.add(nVar);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity2).a(dv2.a1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        dv2.a1 a1Var = (dv2.a1) a17;
        aw2.n nVar2 = this.f122525q;
        if (nVar2 == null) {
            kotlin.jvm.internal.o.o("extendLinkWidget");
            throw null;
        }
        a1Var.f243810h = nVar2;
        aw2.x0 l76 = l7();
        r45.q23 q23Var = k7().P;
        if (q23Var == null || (str = q23Var.f383585d) == null) {
            str = "";
        }
        l76.getClass();
        boolean z18 = str.length() > 0;
        jz5.g gVar = l76.f14813m;
        if (z18) {
            java.lang.String str3 = (java.lang.String) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(str3, "<get-targetTemplateId>(...)");
            if ((str3.length() > 0) && kotlin.jvm.internal.o.b(str, (java.lang.String) ((jz5.n) gVar).getValue())) {
                z17 = true;
            }
        }
        l76.f14812i = z17;
        com.tencent.mars.xlog.Log.i("FinderPostToCommentWidget", "setCurrPostVideoTemplateId: isSameTemplateId=" + l76.f14812i + "， currTemplateId=" + str + ", targetTemplateId=" + ((java.lang.String) ((jz5.n) gVar).getValue()));
        arrayList3.add(l7());
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.t9h);
            kotlin.jvm.internal.o.d(findViewById2);
            com.tencent.mm.ui.kk.f(findViewById2, (int) findViewById2.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
            com.tencent.mm.ui.kk.d(findViewById2, (int) findViewById2.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        }
    }

    public final boolean B7() {
        return 1 == this.V;
    }

    public final sr2.q1 C7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(sr2.q1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (sr2.q1) a17;
    }

    public final void D7(android.view.View view) {
        java.lang.String flowId;
        ry2.e eVar = this.f122522p;
        if (eVar != null) {
            eVar.k();
        }
        java.lang.String str = "";
        com.tencent.mars.xlog.Log.i("Finder.PostCallbackMgr", "doCallback state:2 errMsg:");
        zy2.s9 s9Var = sr2.s.f411707a;
        if (s9Var != null) {
            s9Var.a(2, "");
        }
        sr2.s.f411707a = null;
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.C(4, k7().F);
        t7(false, 2);
        ft2.b bVar = ft2.b.f266519a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject != null && (flowId = finderFeedReportObject.getFlowId()) != null) {
            str = flowId;
        }
        ft2.d dVar = ft2.c.f266520a;
        bVar.b(str, ft2.c.f266527h);
        K7(view, "post_exit");
        p2Var.G("andr_Post_Page_Cancel", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E7(android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.post.PostMainUIC.E7(android.content.Intent):void");
    }

    public final sr2.w0 F7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(sr2.w0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (sr2.w0) a17;
    }

    public final sr2.o1 G7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(sr2.o1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (sr2.o1) a17;
    }

    public final tr2.v H7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(tr2.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (tr2.v) a17;
    }

    public final sr2.y2 I7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(sr2.y2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (sr2.y2) a17;
    }

    public final void J7(int i17, int i18, long j17, int i19, org.json.JSONObject jSONObject, java.lang.String str, r45.qt2 qt2Var) {
        r45.yb1 yb1Var;
        com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct finderPageExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct();
        finderPageExposeStruct.w(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        finderPageExposeStruct.q(java.lang.String.valueOf(i17));
        finderPageExposeStruct.f57465g = i18;
        finderPageExposeStruct.r(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        finderPageExposeStruct.t(this.f122512d);
        finderPageExposeStruct.f57471m = j17;
        finderPageExposeStruct.u(str != null ? r26.i0.t(str, ",", ";", false) : "");
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (i19 != -1 && i18 == 1) {
            jSONObject.put("nextstep", i19);
        }
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        jSONObject.put("EnterScene", finderFeedReportObject != null ? finderFeedReportObject.getEnterScene() : 0);
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(getActivity()), false, 2, null);
        jSONObject.put("if_have_set_like_easter_egg", (j37 == null || (yb1Var = (r45.yb1) j37.u0().getCustom(56)) == null || !yb1Var.getBoolean(0)) ? 0 : 1);
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        jSONObject.put("finder_post_sessionid", finderFeedReportObject2 != null ? finderFeedReportObject2.getPostId() : null);
        if (qt2Var != null) {
            finderPageExposeStruct.s(qt2Var.getString(1));
            finderPageExposeStruct.p(qt2Var.getString(2));
            finderPageExposeStruct.v(java.lang.String.valueOf(qt2Var.getInteger(7)));
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderPageExposeStruct.x(r26.i0.t(jSONObject2, ",", ";", false));
        finderPageExposeStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "FinderReport21874 report scene:" + i17 + " eventCode:" + i18);
    }

    public final void K7(android.view.View view, java.lang.String viewId) {
        java.lang.String str;
        if (view != null) {
            long longExtra = getIntent().getLongExtra("key_ref_feed_id", 0L);
            java.lang.String stringExtra = getIntent().getStringExtra("key_ref_feed_dup_flag");
            int intExtra = getIntent().getIntExtra("key_ref_comment_scene", 0);
            java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, stringExtra, intExtra);
            long longExtra2 = getIntent().getLongExtra("key_topic_id", 0L);
            java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_FINDER_TARGET_TEMPLATE_ID");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            int intExtra2 = getIntent().getIntExtra("KEY_FINDER_TARGET_TEMPLATE_TYPE", 0);
            java.lang.String stringExtra3 = getIntent().getStringExtra("KEY_FINDER_SOURCE_AUDIO_ID");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            java.lang.String stringExtra4 = getIntent().getStringExtra("KEY_FINDER_SOURCE_SONG_ID");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            java.lang.String stringExtra5 = getIntent().getStringExtra("KEY_FINDER_SOURCE_TOPIC_NAME");
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            java.lang.String stringExtra6 = getIntent().getStringExtra("KEY_FINDER_POST_TOPIC_WORD");
            if (stringExtra6 == null) {
                stringExtra6 = "";
            }
            getIntent().getStringExtra("edit_id");
            java.lang.String stringExtra7 = getIntent().getStringExtra("KEY_MUSIC_ID");
            java.lang.String stringExtra8 = getIntent().getStringExtra("KEY_MUSIC_LIKE_FINDER_FEED_ID");
            int intExtra3 = getIntent().getIntExtra("KEY_MUSIC_TYPE", 0);
            java.lang.String stringExtra9 = getIntent().getStringExtra("KEY_MUSIC_SESSION_BUFFER");
            java.lang.String str2 = stringExtra4;
            java.lang.String str3 = stringExtra5;
            long longExtra3 = getIntent().getLongExtra("KEY_FINDER_POST_DRAFT_SVR_ID", 0L);
            int intExtra4 = getIntent().getIntExtra("KEY_FINDER_POST_DRAFT_SOURCE_ENTER_SCENE", 0);
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            jz5.l[] lVarArr = new jz5.l[24];
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
            lVarArr[0] = new jz5.l("enter_scene", java.lang.Integer.valueOf(finderFeedReportObject != null ? finderFeedReportObject.getEnterScene() : 0));
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            lVarArr[1] = new jz5.l("finder_post_sessionid", finderFeedReportObject2 != null ? finderFeedReportObject2.getSessionId() : null);
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject3 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            lVarArr[2] = new jz5.l("enter_child_scene", java.lang.Integer.valueOf(finderFeedReportObject3 != null ? finderFeedReportObject3.getChildEnterScene() : 0));
            lVarArr[3] = new jz5.l("source_feedid", pm0.v.u(longExtra));
            lVarArr[4] = new jz5.l("source_feed_commentScene", java.lang.Integer.valueOf(intExtra));
            lVarArr[5] = new jz5.l("source_feed_sessionbuffer", ek6);
            lVarArr[6] = new jz5.l("source_activityid", pm0.v.u(longExtra2));
            lVarArr[7] = new jz5.l("source_topicname", stringExtra6);
            lVarArr[8] = new jz5.l("source_templateid", stringExtra2);
            lVarArr[9] = new jz5.l("source_template_type", java.lang.Integer.valueOf(intExtra2));
            lVarArr[10] = new jz5.l("source_audioid", stringExtra3);
            lVarArr[11] = new jz5.l("source_songid", str2);
            lVarArr[12] = new jz5.l("source_topicname", str3);
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject4 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            if (finderFeedReportObject4 == null || (str = finderFeedReportObject4.getPostId()) == null) {
                str = "";
            }
            lVarArr[13] = new jz5.l("editid", str);
            lVarArr[14] = new jz5.l("songid", stringExtra7);
            lVarArr[15] = new jz5.l("like_feedid", stringExtra8);
            lVarArr[16] = new jz5.l("musictype", java.lang.Integer.valueOf(intExtra3));
            lVarArr[17] = new jz5.l("session_buffer", stringExtra9);
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject5 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            lVarArr[18] = new jz5.l("song_source_position", finderFeedReportObject5 != null ? java.lang.Integer.valueOf(finderFeedReportObject5.getSourcePosition()) : null);
            r45.q23 q23Var = k7().P;
            lVarArr[19] = new jz5.l("templateid", q23Var != null ? q23Var.f383585d : null);
            r45.q23 q23Var2 = k7().P;
            lVarArr[20] = new jz5.l("template_type", q23Var2 != null ? java.lang.Integer.valueOf(q23Var2.f383586e) : null);
            lVarArr[21] = new jz5.l("draft_objectid", pm0.v.u(longExtra3));
            lVarArr[22] = new jz5.l("source_enterscene", java.lang.Integer.valueOf(intExtra4));
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject6 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            lVarArr[23] = new jz5.l("music_report_info", finderFeedReportObject6 != null ? finderFeedReportObject6.getMusicReportInfo() : null);
            java.util.Map k17 = kz5.c1.k(lVarArr);
            sr2.y4 y4Var = new sr2.y4(this);
            kotlin.jvm.internal.o.g(viewId, "viewId");
            com.tencent.mm.plugin.finder.report.d2.k(com.tencent.mm.plugin.finder.report.d2.f124994a, view, viewId, "view_clk", false, k17, y4Var, 8, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0ba2  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0308  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r3v53, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L7() {
        /*
            Method dump skipped, instructions count: 2982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.post.PostMainUIC.L7():void");
    }

    public final void M7(java.lang.String str, sr2.z2 type) {
        kotlin.jvm.internal.o.g(type, "type");
        if (str == null || str.length() == 0) {
            android.view.View f76 = f7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f76, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "setPostTip", "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/post/PostMainUIC$TipType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f76, "com/tencent/mm/plugin/finder/post/PostMainUIC", "setPostTip", "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/post/PostMainUIC$TipType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.X = sr2.z2.f411823d;
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) f7().findViewById(com.tencent.mm.R.id.tbc);
        if (textView != null) {
            textView.setText(str);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) f7().findViewById(com.tencent.mm.R.id.u4n);
        if (weImageView != null) {
            weImageView.setOnClickListener(new sr2.a5(this));
        }
        android.view.View f77 = f7();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(f77, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "setPostTip", "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/post/PostMainUIC$TipType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f77.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(f77, "com/tencent/mm/plugin/finder/post/PostMainUIC", "setPostTip", "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/post/PostMainUIC$TipType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.X = type;
    }

    public final ur2.v N7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(ur2.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (ur2.v) a17;
    }

    public final void O7(java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f122520n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (str.length() == 0) {
            str = getString(com.tencent.mm.R.string.f490552yb);
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getActivity(), "", str, true, false, null);
        this.f122520n = Q;
        if (Q != null) {
            Q.show();
        }
    }

    public final void P7(int i17) {
        android.view.View view = this.f122516h;
        if (view == null) {
            kotlin.jvm.internal.o.o("bottomSpace");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateBottomSpaceHeight] cur:");
        android.view.View view2 = this.f122516h;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("bottomSpace");
            throw null;
        }
        sb6.append(view2.getHeight());
        sb6.append(" new:");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", sb6.toString());
        layoutParams2.height = i17;
        android.view.View view3 = this.f122516h;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("bottomSpace");
            throw null;
        }
        view3.setLayoutParams(layoutParams2);
        android.view.View view4 = this.f122516h;
        if (view4 != null) {
            view4.requestLayout();
        } else {
            kotlin.jvm.internal.o.o("bottomSpace");
            throw null;
        }
    }

    public final void Q7(android.content.Intent intent, java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "[updateEventInfo] from:".concat(from));
        if (intent != null) {
            aw2.a aVar = this.f122527s;
            if (aVar == null) {
                kotlin.jvm.internal.o.o("activityWidget");
                throw null;
            }
            aVar.c(intent);
            getIntent().putExtra("key_activity_src_type", "key_scene_from_post");
            if (intent.getIntExtra("key_activity_type", 100) == 100) {
                getIntent().putExtra("saveActivity", false);
            } else {
                G7().W6();
            }
            e7(intent);
        }
    }

    public final void V6(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(appId);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "can not find app info");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "Finder share video backToApp: %s", appId);
        com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo.Resp();
        resp.errCode = 0;
        resp.extMsg = "{}";
        resp.openId = h17.field_openId;
        resp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = h17.field_packageName;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }

    public final boolean W6() {
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        int videoSource = finderFeedReportObject != null ? finderFeedReportObject.getVideoSource() : 0;
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126410i).getValue()).r()).intValue() == 1 && (videoSource == 2 || videoSource == 3)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "[canDelMedia], forbid delete due to videoSource:" + videoSource);
            return false;
        }
        if (!getIntent().getBooleanExtra("KEY_POST_MEDIA_CAN_DELETE", true)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "[canDelMedia], forbid delete by intent");
            return false;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z17 = ((sr2.w5) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sr2.w5.class)).f411780f == null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[canDelMedia], childCount:");
        android.view.ViewGroup viewGroup = this.f122514f;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mediaViewContainer");
            throw null;
        }
        sb6.append(viewGroup.getChildCount());
        sb6.append(" canDelShare:");
        sb6.append(z17);
        sb6.append(" videoSource:");
        sb6.append(videoSource);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", sb6.toString());
        android.view.ViewGroup viewGroup2 = this.f122514f;
        if (viewGroup2 != null) {
            return viewGroup2.getChildCount() != 0 && z17;
        }
        kotlin.jvm.internal.o.o("mediaViewContainer");
        throw null;
    }

    public final void X6(android.view.View view, boolean z17) {
        int height;
        int dimensionPixelSize;
        android.graphics.Point point = new android.graphics.Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        int[] iArr = new int[2];
        if (view == null) {
            if (F7().V6().hasFocus()) {
                view = this.f122517i;
                if (view == null) {
                    kotlin.jvm.internal.o.o("edtContainer");
                    throw null;
                }
            } else {
                view = this.f122519m;
                if (view == null) {
                    kotlin.jvm.internal.o.o("shortTitleContainer");
                    throw null;
                }
            }
        }
        view.getLocationInWindow(iArr);
        android.view.View X6 = F7().X6();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            height = F7().Y6(com.tencent.mm.sdk.platformtools.d2.a(getContext()));
            dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        } else {
            height = point.y - X6.getHeight();
            dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        }
        int i17 = height - dimensionPixelSize;
        int i18 = iArr[1];
        android.view.View view2 = this.f122517i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("edtContainer");
            throw null;
        }
        int height2 = i18 + view2.getHeight();
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "window.y " + point.y + " footer.height " + X6.getHeight() + " bottom " + height2 + ", maxBottom " + i17 + ' ');
        android.view.View view3 = this.f122516h;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("bottomSpace");
            throw null;
        }
        P7(view3.getHeight() + (height2 - i17));
        if (z17) {
            return;
        }
        android.view.View view4 = this.f122516h;
        if (view4 != null) {
            view4.post(new sr2.i3(this, height2, i17));
        } else {
            kotlin.jvm.internal.o.o("bottomSpace");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (I7().f411816w == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6() {
        /*
            r5 = this;
            boolean r0 = r5.B7()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L73
            com.tencent.mm.ui.widget.button.WeButton r0 = r5.n7()
            sr2.w0 r3 = r5.F7()
            boolean r4 = r3.g7()
            if (r4 == 0) goto L18
            r3 = r2
            goto L2e
        L18:
            com.tencent.mm.plugin.finder.view.FinderPostTextModifyView r3 = r3.I
            if (r3 == 0) goto L2d
            android.view.View r4 = r3.f131420h
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L25
            goto L2d
        L25:
            java.util.LinkedList r3 = r3.f131429t
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r2
            goto L2e
        L2d:
            r3 = r1
        L2e:
            if (r3 != 0) goto L6e
            ry2.o r3 = r5.k7()
            java.lang.String r4 = "VIDEO_COVER_URL"
            android.os.Bundle r3 = r3.f401416c
            java.lang.String r3 = r3.getString(r4)
            if (r3 == 0) goto L47
            int r3 = r3.length()
            if (r3 != 0) goto L45
            goto L47
        L45:
            r3 = r1
            goto L48
        L47:
            r3 = r2
        L48:
            r3 = r3 ^ r2
            if (r3 != 0) goto L6e
            ry2.o r3 = r5.k7()
            java.lang.String r4 = "VIDEO_SHARE_COVER_URL"
            android.os.Bundle r3 = r3.f401416c
            java.lang.String r3 = r3.getString(r4)
            if (r3 == 0) goto L62
            int r3 = r3.length()
            if (r3 != 0) goto L60
            goto L62
        L60:
            r3 = r1
            goto L63
        L62:
            r3 = r2
        L63:
            r3 = r3 ^ r2
            if (r3 != 0) goto L6e
            sr2.y2 r3 = r5.I7()
            boolean r3 = r3.f411816w
            if (r3 == 0) goto L6f
        L6e:
            r1 = r2
        L6f:
            r0.setEnabled(r1)
            goto Lb0
        L73:
            aw2.n r0 = r5.f122525q
            if (r0 == 0) goto Lb9
            com.tencent.mm.plugin.finder.view.FinderExtendReadingView r0 = r0.f14783n
            boolean r0 = r0.isVerifyState
            r0 = r0 ^ r2
            if (r0 == 0) goto Lb1
            sr2.w0 r0 = r5.F7()
            boolean r3 = r0.h7()
            if (r3 == 0) goto L8f
            boolean r3 = r0.g7()
            if (r3 != 0) goto L8f
            goto L99
        L8f:
            boolean r3 = r0.f411765s
            if (r3 == 0) goto L99
            boolean r0 = r0.f411766t
            if (r0 == 0) goto L99
            r0 = r2
            goto L9a
        L99:
            r0 = r1
        L9a:
            if (r0 != 0) goto L9d
            goto Lb1
        L9d:
            ry2.e r0 = r5.f122522p
            if (r0 == 0) goto La9
            com.tencent.mm.ui.widget.button.WeButton r0 = r5.n7()
            r0.setEnabled(r2)
            return
        La9:
            com.tencent.mm.ui.widget.button.WeButton r0 = r5.n7()
            r0.setEnabled(r1)
        Lb0:
            return
        Lb1:
            com.tencent.mm.ui.widget.button.WeButton r0 = r5.n7()
            r0.setEnabled(r1)
            return
        Lb9:
            java.lang.String r0 = "extendLinkWidget"
            kotlin.jvm.internal.o.o(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.post.PostMainUIC.Z6():void");
    }

    public final void a7() {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "check post time " + this.f122511J);
        int i17 = this.f122511J;
        if (i17 >= 10) {
            com.tencent.mars.xlog.Log.w("Finder.FinderPostUI", "check post data ready exceed MAX times!");
            w7();
            android.widget.Toast.makeText(getActivity(), com.tencent.mm.R.string.f492006ex3, 0).show();
            this.f122511J = 0;
            return;
        }
        this.f122511J = i17 + 1;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_post_check_file_exist, true);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "xCheck :" + fj6);
        ry2.e eVar = this.f122522p;
        if (!(eVar != null && eVar.c()) && fj6) {
            db5.t7.makeText(getContext(), com.tencent.mm.R.string.evn, 0).show();
            w7();
            if (this.f122521o) {
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct videoCompositionPerformanceStruct = new com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct();
            videoCompositionPerformanceStruct.f61584z = 0L;
            videoCompositionPerformanceStruct.k();
            this.f122521o = true;
            return;
        }
        ry2.r0 p76 = p7();
        if (p76 == null || !p76.f401463a) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "not ready to post");
            com.tencent.mm.sdk.platformtools.u3.i(new sr2.k3(this), 500L);
            return;
        }
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        aw2.m0 m0Var = this.f122528t;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("postOriginWidget");
            throw null;
        }
        long j17 = m0Var.f14773e.f131377e.f211363x ? 1L : 0L;
        g0Var.f310121d = j17;
        if (this.M) {
            g0Var.f310121d = j17 | 2;
        }
        p76.f401471i = l7().c();
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.Q(F7().d7().b().f400966b, F7().d7().b().f400968d, F7().d7().b().f400969e);
        aw2.m0 m0Var2 = this.f122528t;
        if (m0Var2 == null) {
            kotlin.jvm.internal.o.o("postOriginWidget");
            throw null;
        }
        java.lang.String a17 = m0Var2.a();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setOriginalPostInfo(a17);
        }
        com.tencent.mm.plugin.finder.report.p2.w(p2Var, "FirstToPostAction", "PostPage", null, 0, 0L, 28, null);
        p2Var.G("andr_Post_Page_Real_Post", null);
        aw2.y0 y0Var = this.f122526r;
        if (y0Var == null) {
            kotlin.jvm.internal.o.o("newsWidget");
            throw null;
        }
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(y0Var.f14820d), false, 2, null);
        if ((((j37 != null ? j37.field_extFlag : 0) & 8192) != 0) && y0Var.f14822f.a()) {
            k7().f401416c.putInt("KEY_POST_OBJECT_TYPE", 1);
        } else {
            k7().f401416c.putInt("KEY_POST_OBJECT_TYPE", 0);
        }
        if (this.M) {
            go2.c0.E = 0;
        }
        pm0.v.K(null, new sr2.j3(this, p76, g0Var));
    }

    public final void b7(java.lang.String str, boolean z17, yz5.a aVar) {
        O7(str);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((dv2.e1) pf5.z.f353948a.a(activity).a(dv2.e1.class)).P6(new com.tencent.mm.plugin.finder.assist.g9(F7().T6(), null, F7().a7(), false, z17, 10, null), new sr2.n3(this, aVar));
    }

    public final com.tencent.mm.plugin.finder.storage.x80 c7() {
        ry2.r0 p76 = p7();
        if (p76 == null) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = k7().F;
            p76 = new ry2.r0(false, finderItem != null ? finderItem.getMediaType() : 0, null, null, 0, null, null, 120, null);
            java.lang.String str = this.f122512d;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            p76.f401470h = str;
        }
        ry2.r0 r0Var = p76;
        aw2.m0 m0Var = this.f122528t;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("postOriginWidget");
            throw null;
        }
        long j17 = m0Var.f14773e.f131377e.f211363x ? 1L : 0L;
        if (this.M) {
            j17 |= 2;
        }
        long j18 = j17;
        r0Var.f401471i = l7().c();
        ry2.o k76 = k7();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.lang.String T6 = F7().T6();
        java.util.ArrayList c17 = F7().d7().b().c();
        aw2.a aVar = this.f122527s;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("activityWidget");
            throw null;
        }
        r45.xl2 activityEvent = aVar.f14720g.getActivityEvent();
        aw2.a aVar2 = this.f122527s;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("activityWidget");
            throw null;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem d17 = k76.d(activity, T6, r0Var, false, c17, activityEvent, aVar2.a(), i7(), j18);
        com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
        x80Var.field_createTime = d17.getCreateTime();
        x80Var.field_localFlag = 1;
        x80Var.field_finderItem = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.h(d17);
        x80Var.field_objectType = 0;
        x80Var.field_localId = d17.getLocalId();
        x80Var.field_watermarkFlag = d17.field_watermarkFlag;
        x80Var.field_extraInfoFlag = 0L;
        x80Var.field_localFlag = 1;
        x80Var.field_objectType = 0;
        x80Var.t0().setCreateTime(c01.id.e());
        return x80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x060b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7() {
        /*
            Method dump skipped, instructions count: 2555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.post.PostMainUIC.d7():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.post.PostMainUIC.e7(android.content.Intent):void");
    }

    public final android.view.View f7() {
        return (android.view.View) ((jz5.n) this.C).getValue();
    }

    public final android.view.View g7() {
        return (android.view.View) ((jz5.n) this.f122532x).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489072b65;
    }

    public final java.lang.String h7() {
        java.lang.Integer num = k7().f401420e;
        if (num != null && num.intValue() == 4) {
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.evb);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.eva);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    public final java.util.LinkedList i7() {
        sr2.o1 G7 = G7();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        zv2.r0 r0Var = G7.U6().f411681f;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = r0Var != null ? ((zv2.b) r0Var).f476397f : null;
        if (finderJumpInfo != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = finderJumpInfo.getBusiness_type() != 52 ? finderJumpInfo : null;
            if (finderJumpInfo2 != null) {
                linkedList.add(finderJumpInfo2);
            }
        }
        return linkedList;
    }

    public final ry2.o k7() {
        ry2.o oVar = this.H;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.o.o("postDataManager");
        throw null;
    }

    public final aw2.x0 l7() {
        return (aw2.x0) ((jz5.n) this.f122530v).getValue();
    }

    public final android.widget.ScrollView m7() {
        android.widget.ScrollView scrollView = this.f122515g;
        if (scrollView != null) {
            return scrollView;
        }
        kotlin.jvm.internal.o.o("scrollView");
        throw null;
    }

    public final com.tencent.mm.ui.widget.button.WeButton n7() {
        return (com.tencent.mm.ui.widget.button.WeButton) ((jz5.n) this.f122537z).getValue();
    }

    public final android.widget.TextView o7() {
        return (android.widget.TextView) ((jz5.n) this.A).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.util.LinkedList m17;
        r45.mb4 mb4Var;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001) {
            E7(intent);
            return;
        }
        r0 = null;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = null;
        boolean z17 = false;
        if (i17 != 1002) {
            switch (i17) {
                case com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL /* 20000 */:
                    I7().Y6(intent);
                    return;
                case 20001:
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((com.tencent.mm.ui.MMActivity) activity).showVKB();
                    F7().o7(i18, intent, true);
                    return;
                case 20002:
                    u7(i18, intent, "pre_post");
                    return;
                case 20003:
                    u7(i18, intent, "participate");
                    return;
                case 20004:
                    sr2.q1 C7 = C7();
                    if (i18 == -1) {
                        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("JUMP_INFO") : null;
                        if (byteArrayExtra != null) {
                            try {
                                finderJumpInfo2.parseFrom(byteArrayExtra);
                                finderJumpInfo = finderJumpInfo2;
                            } catch (java.lang.Exception e17) {
                                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                            }
                        }
                        if (finderJumpInfo == null) {
                            return;
                        }
                        ((zv2.b) C7.P6(6, 0)).i(finderJumpInfo);
                        return;
                    }
                    return;
                case 20005:
                    y7();
                    androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                    kotlin.jvm.internal.o.g(activity2, "activity");
                    androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity2).a(sr2.f.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    sr2.f fVar = (sr2.f) a17;
                    java.lang.String e18 = xy2.c.e(fVar.getActivity());
                    fVar.f411550d = e18;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(e18)) {
                        fVar.f411551e = ya2.h.f460484a.b(fVar.f411550d);
                    }
                    fVar.P6();
                    aw2.a aVar = this.f122527s;
                    if (aVar != null) {
                        aVar.b();
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("activityWidget");
                        throw null;
                    }
                case 20006:
                    androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                    kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((com.tencent.mm.ui.MMActivity) activity3).showVKB();
                    F7().o7(i18, intent, false);
                    return;
                default:
                    return;
            }
        }
        if (intent != null ? intent.getBooleanExtra("RESULT_IS_SET_PROFILE_COVER", false) : false) {
            E7(intent);
        }
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("RESULT_IS_SET_SHARE_COVER", false) : false;
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("key_share_cover_item") : null;
        so2.b5 b5Var = serializableExtra instanceof so2.b5 ? (so2.b5) serializableExtra : null;
        ry2.e eVar = this.f122522p;
        ry2.q0 q0Var = eVar instanceof ry2.q0 ? (ry2.q0) eVar : null;
        if (q0Var != null) {
            q0Var.Q = b5Var;
        }
        if (booleanExtra) {
            if (b5Var == null || (str = b5Var.f410269d) == null) {
                str = "";
            }
            java.lang.String sharCoverUrl = b5Var != null ? b5Var.f410270e : null;
            int i19 = b5Var != null ? b5Var.f410272g : 1;
            int i27 = b5Var != null ? b5Var.f410275m : 0;
            if (sharCoverUrl != null) {
                if ((sharCoverUrl.length() > 0) == true) {
                    z17 = true;
                }
            }
            if (z17) {
                ry2.o k76 = k7();
                byte[] bArr = b5Var.f410274i;
                kotlin.jvm.internal.o.g(sharCoverUrl, "sharCoverUrl");
                android.os.Bundle bundle = k76.f401416c;
                bundle.putString("VIDEO_SHARE_FULL_COVER_URL", str);
                bundle.putString("VIDEO_SHARE_COVER_URL", sharCoverUrl);
                bundle.putByteArray("VIDEO_SHARE_COVER_INFO_WRAP", bArr);
                bundle.putInt("VIDEO_SHARE_COVER_STYLE", i19);
                bundle.putInt("VIDEO_SHARE_COVER_SOURCE", i27);
                android.content.Intent intent2 = k76.f401412a;
                intent2.putExtra("VIDEO_SHARE_FULL_COVER_URL", str);
                intent2.putExtra("VIDEO_SHARE_COVER_URL", sharCoverUrl);
                intent2.putExtra("VIDEO_SHARE_COVER_INFO_WRAP", bArr);
                intent2.putExtra("VIDEO_SHARE_COVER_STYLE", i19);
                intent2.putExtra("VIDEO_SHARE_COVER_SOURCE", i27);
                if (k76.k() != null && !com.tencent.mm.sdk.platformtools.t8.L0(k76.m()) && (m17 = k76.m()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(m17)) != null) {
                    mb4Var.set(62, sharCoverUrl);
                    mb4Var.set(65, "");
                }
                ry2.e eVar2 = this.f122522p;
                if (eVar2 != null) {
                    android.os.Bundle data = k7().f401416c;
                    kotlin.jvm.internal.o.g(data, "data");
                    eVar2.f401375e = data;
                }
                ry2.e eVar3 = this.f122522p;
                if (eVar3 != null) {
                    eVar3.f401382o = true;
                }
                if (B7()) {
                    Z6();
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        boolean z17;
        boolean z18;
        ur2.o oVar = N7().f430429i;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("previewHalfScreen");
            throw null;
        }
        if (oVar.f430414n.getVisibility() == 0) {
            yz5.a aVar = oVar.f430410g;
            if (aVar != null) {
                aVar.invoke();
            }
            oVar.a();
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return true;
        }
        aw2.n nVar = this.f122525q;
        if (nVar == null) {
            kotlin.jvm.internal.o.o("extendLinkWidget");
            throw null;
        }
        rx2.p pVar = nVar.f14779g;
        if (pVar.f400989m) {
            pVar.a();
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            return false;
        }
        s7();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023e  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.post.PostMainUIC.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ry2.e eVar = this.f122522p;
        if (eVar != null) {
            eVar.onDestroy();
        }
        if (this.f122527s == null) {
            kotlin.jvm.internal.o.o("activityWidget");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("Finder.ActivityParamStore", "reset");
        s92.b.f404991b = null;
        dead();
        dead();
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "onDestroy routeFrom :" + this.K);
        com.tencent.mars.xlog.Log.i("Finder.PostCallbackMgr", "doCallback state:3 errMsg:");
        zy2.s9 s9Var = sr2.s.f411707a;
        if (s9Var != null) {
            s9Var.a(3, "");
        }
        sr2.s.f411707a = null;
        com.tencent.mm.cache.ArtistCacheManager.a().e();
        com.tencent.mm.cache.ArtistCacheManager.a().b();
        if (k7().R) {
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
            mv2.f0.f331561a.t(this);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.I;
        int i17 = this.N;
        org.json.JSONObject jSONObject = (org.json.JSONObject) ((jz5.n) this.S).getValue();
        java.lang.String str = (java.lang.String) ((jz5.n) this.T).getValue();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        J7(74, 1, currentTimeMillis, i17, jSONObject, str, nyVar != null ? nyVar.V6() : null);
        this.Y = true;
    }

    @Override // mv2.w0
    public void onPostErr(long j17, boolean z17) {
        w7();
        this.L = j17;
        db5.t7.g(getContext(), getResources().getString(com.tencent.mm.R.string.evm));
    }

    @Override // mv2.w0
    public void onPostFakeOk(long j17) {
    }

    @Override // mv2.w0
    public void onPostNotify(long j17, boolean z17) {
    }

    @Override // mv2.w0
    public void onPostOk(long j17, long j18) {
        java.lang.String a17;
        w7();
        this.L = 0L;
        db5.t7.h(getContext(), getResources().getString(com.tencent.mm.R.string.f492004m46));
        if (k7().p()) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = k7().S;
            com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info = finderJumpInfo != null ? finderJumpInfo.getMini_app_info() : null;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.assist.o5.f102428a;
            java.lang.String str = (java.lang.String) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (str == null) {
                str = "";
            }
            concurrentHashMap.remove(java.lang.Long.valueOf(j17));
            ((w40.e) i95.n0.c(w40.e.class)).getClass();
            qs2.v vVar = qs2.v.f366327a;
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            java.lang.String app_id = mini_app_info != null ? mini_app_info.getApp_id() : null;
            java.lang.String path = mini_app_info != null ? mini_app_info.getPath() : null;
            kotlin.jvm.internal.o.g(context, "context");
            java.lang.String str2 = app_id == null ? "" : app_id;
            java.lang.String str3 = path != null ? path : "";
            if (str.length() == 0) {
                a17 = com.tencent.mm.ui.tools.qd.a(str3, "commentScene=15", "entryCardType=35");
                kotlin.jvm.internal.o.f(a17, "safelyUrlConcatParam(...)");
            } else {
                a17 = com.tencent.mm.ui.tools.qd.a(str3, "id=".concat(str), "commentScene=15", "entryCardType=35");
                kotlin.jvm.internal.o.f(a17, "safelyUrlConcatParam(...)");
            }
            qs2.v.h(vVar, context, str2, a17, 0, null, 8, null);
        }
        pm0.v.X(new sr2.s3(this, j17, j18));
    }

    @Override // mv2.w0
    public void onPostStart(long j17) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.ui.bl.a(getContext());
        aw2.n nVar = this.f122525q;
        if (nVar == null) {
            kotlin.jvm.internal.o.o("extendLinkWidget");
            throw null;
        }
        rx2.p pVar = nVar.f14779g;
        if (pVar.f400988i) {
            pVar.f400986g.post(new rx2.n(pVar));
        }
        ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).getClass();
        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markShowPostUI");
        if (com.tencent.mm.plugin.vlog.model.b0.f175556j <= 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.vlog.model.b0.f175556j = android.os.SystemClock.elapsedRealtime();
        }
        this.Y = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        org.json.JSONObject jSONObject = (org.json.JSONObject) ((jz5.n) this.S).getValue();
        java.lang.String str = (java.lang.String) ((jz5.n) this.T).getValue();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        J7(74, 0, 0L, -1, jSONObject, str, nyVar != null ? nyVar.V6() : null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        if (this.f122523p0) {
            return;
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.G;
        if (f5Var == null) {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
        f5Var.f();
        this.f122523p0 = true;
    }

    public final ry2.r0 p7() {
        ry2.r0 a17;
        r45.xn2 xn2Var;
        r45.t11 t11Var;
        r45.zn2 zn2Var;
        ry2.e eVar = this.f122522p;
        if (eVar == null || (a17 = eVar.a()) == null) {
            return null;
        }
        java.lang.String str = this.f122512d;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        a17.f401470h = str;
        java.lang.String a76 = F7().a7();
        kotlin.jvm.internal.o.g(a76, "<set-?>");
        a17.f401468f = a76;
        aw2.m0 m0Var = this.f122528t;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("postOriginWidget");
            throw null;
        }
        r45.ao2 ao2Var = m0Var.f14775g;
        if (ao2Var != null) {
            xn2Var = new r45.xn2();
            xn2Var.getList(0).add(java.lang.Integer.valueOf(ao2Var.getInteger(0)));
            if (ao2Var.getInteger(0) == 1) {
                aw2.j0 j0Var = m0Var.f14774f;
                if (j0Var != null) {
                    java.lang.String str2 = j0Var.f14759f;
                    if (!(str2 == null || str2.length() == 0)) {
                        java.lang.String str3 = j0Var.f14760g;
                        if (!(str3 == null || str3.length() == 0)) {
                            zn2Var = new r45.zn2();
                            zn2Var.set(0, j0Var.f14759f);
                            zn2Var.set(1, j0Var.f14760g);
                            xn2Var.set(1, zn2Var);
                        }
                    }
                }
                zn2Var = null;
                xn2Var.set(1, zn2Var);
            }
        } else {
            xn2Var = null;
        }
        a17.f401469g = xn2Var;
        aw2.c0 c0Var = this.f122529u;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("highlightTopicWidget");
            throw null;
        }
        a17.f401476n = c0Var.f14733p ? c0Var.f14732o : null;
        r45.zf2 zf2Var = new r45.zf2();
        zv2.r0 r0Var = C7().f411681f;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = r0Var != null ? ((zv2.b) r0Var).f476397f : null;
        zf2Var.set(0, java.lang.Integer.valueOf((finderJumpInfo == null || finderJumpInfo.getBusiness_type() != 52) ? 0 : 1));
        a17.f401475m = zf2Var;
        jz5.g gVar = this.Q;
        a17.f401477o = ((dv2.m0) ((jz5.n) gVar).getValue()).f243895h;
        a17.f401478p = ((dv2.m0) ((jz5.n) gVar).getValue()).f243896i;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.assist.h9 h9Var = ((dv2.e1) pf5.z.f353948a.a(activity).a(dv2.e1.class)).f243922i;
        a17.f401479q = h9Var != null ? h9Var.f102235c : null;
        tr2.v H7 = H7();
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = H7.f421413d;
        if (iEmojiInfo != null) {
            t11Var = new r45.t11();
            t11Var.set(0, iEmojiInfo.getMd5());
            i95.m c17 = i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            t11Var.set(1, ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) c17)).Ai(iEmojiInfo));
        } else {
            t11Var = null;
        }
        a17.f401480r = t11Var;
        a17.f401481s = H7.f421413d != null ? H7.f421414e : 0;
        aw2.m0 m0Var2 = this.f122528t;
        if (m0Var2 == null) {
            kotlin.jvm.internal.o.o("postOriginWidget");
            throw null;
        }
        a17.f401482t = m0Var2.f14773e.getF131391v();
        a17.f401483u = k7().f401417c0;
        return a17;
    }

    public final long q7() {
        ry2.e eVar = this.f122522p;
        ry2.q0 q0Var = eVar instanceof ry2.q0 ? (ry2.q0) eVar : null;
        if (q0Var != null) {
            return q0Var.u();
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r7() {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.post.PostMainUIC.r7():void");
    }

    public final void s7() {
        java.lang.String str;
        if (B7()) {
            java.lang.String string = getActivity().getResources().getString(com.tencent.mm.R.string.nly);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = getActivity().getResources().getString(com.tencent.mm.R.string.f490008ib);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = getActivity().getResources().getString(com.tencent.mm.R.string.f490347sg);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            db5.e1.D(getActivity(), string, "", string2, string3, true, new sr2.r4(this), sr2.s4.f411716d, com.tencent.mm.R.color.Red_100);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "exitAndSave: ");
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        aw2.m0 m0Var = this.f122528t;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("postOriginWidget");
            throw null;
        }
        java.lang.String a17 = m0Var.a();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setOriginalPostInfo(a17);
        }
        K7((android.view.View) ((jz5.n) this.f122535y).getValue(), "post_cancel_icon");
        I7().b7();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f122512d) && this.K == 20) {
            db5.e1.D(getActivity(), getString(com.tencent.mm.R.string.evl), "", getString(com.tencent.mm.R.string.evk), getString(com.tencent.mm.R.string.evj), true, null, new sr2.g5(this), com.tencent.mm.R.color.f478621cg);
        } else if (this.K == 30) {
            db5.e1.D(getActivity(), getString(com.tencent.mm.R.string.o6g), "", getString(com.tencent.mm.R.string.o6f), getString(com.tencent.mm.R.string.o6e), true, new sr2.c5(this), null, com.tencent.mm.R.color.f478621cg);
        } else {
            boolean z17 = true;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f122512d)) {
                android.app.Activity context = getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (((sr2.w5) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sr2.w5.class)).f411780f == null) {
                    ry2.e eVar = this.f122522p;
                    java.util.List g17 = eVar != null ? ry2.e.g(eVar, false, 1, null) : null;
                    if (g17 == null || g17.isEmpty()) {
                        java.util.LinkedList linkedList = k7().f401421e0;
                        if (linkedList != null && !linkedList.isEmpty()) {
                            z17 = false;
                        }
                        if (z17) {
                            D7(null);
                        }
                    }
                    p2Var.Q(F7().d7().b().f400966b, F7().d7().b().f400968d, F7().d7().b().f400969e);
                    java.lang.String string4 = getString(com.tencent.mm.R.string.f9f);
                    if (k7().D > 0) {
                        string4 = getString(com.tencent.mm.R.string.f9g);
                    }
                    db5.e1.D(getActivity(), string4, "", getString(com.tencent.mm.R.string.f9j), getString(com.tencent.mm.R.string.f9i), true, new sr2.u3(this), new sr2.v3(this), com.tencent.mm.R.color.f478621cg);
                }
            }
            p2Var.C(4, null);
            t7(false, 1);
            ft2.b bVar = ft2.b.f266519a;
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            if (finderFeedReportObject2 == null || (str = finderFeedReportObject2.getFlowId()) == null) {
                str = "";
            }
            bVar.b(str, ft2.c.f266527h);
        }
        mv2.f0.f331561a.p(mv2.g0.f331569d);
    }

    public final void t7(boolean z17, int i17) {
        if (sr2.s.f411707a != null) {
            com.tencent.mars.xlog.Log.i("Finder.PostCallbackMgr", "doCallback state:" + i17 + " errMsg:");
            zy2.s9 s9Var = sr2.s.f411707a;
            if (s9Var != null) {
                s9Var.a(i17, "");
            }
            sr2.s.f411707a = null;
            getActivity().finish();
            return;
        }
        if (k7().o()) {
            yy0.g0 g0Var = (yy0.g0) ((pp0.g0) i95.n0.c(pp0.g0.class));
            synchronized (g0Var) {
                yz5.l lVar = g0Var.f468100d;
                if (lVar != null) {
                    lVar.invoke(null);
                }
                g0Var.f468100d = null;
            }
            getActivity().finish();
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String O6 = ((sr2.w5) pf5.z.f353948a.a(activity).a(sr2.w5.class)).O6();
        if (z17 && !this.M) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_USERNAME_SELF", this.f122512d);
            intent.putExtra("key_finder_post_router", 13);
            intent.putExtra("key_finder_post_from", this.K);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(getActivity(), intent);
            V6(O6);
            getActivity().overridePendingTransition(0, com.tencent.mm.ui.uc.f211081d);
            getActivity().finish();
            return;
        }
        int i18 = this.K;
        if (i18 != -1 && i18 != 6) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_finder_post_router", this.K);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(getActivity(), intent2);
            V6(O6);
            getActivity().overridePendingTransition(0, com.tencent.mm.ui.uc.f211081d);
        }
        getActivity().finish();
    }

    public final void u7(int i17, android.content.Intent intent, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "[handleSelectActivityResult] resultCode:" + i17 + " from:" + str);
        if (i17 != -1 || intent == null) {
            return;
        }
        aw2.a aVar = this.f122527s;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("activityWidget");
            throw null;
        }
        aVar.c(intent);
        getIntent().putExtra("key_activity_src_type", "key_scene_from_post");
        if (intent.getIntExtra("key_activity_type", 100) == 100) {
            getIntent().putExtra("saveActivity", false);
        } else {
            G7().W6();
        }
        e7(intent);
    }

    public final void v7() {
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.f484914tt4);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "hideLocationWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/post/PostMainUIC", "hideLocationWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        sr2.r rVar;
        if (this.Y) {
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderPostFooter W6 = F7().W6();
        android.view.View X6 = F7().X6();
        W6.a(i17);
        sr2.w0 F7 = F7();
        com.tencent.mm.sdk.platformtools.d2.k(F7.getContext(), i17);
        F7.q7(i17);
        if (F7.h7() && !F7.g7() && (rVar = F7.N) != null) {
            boolean z18 = F7.f411752J;
            android.view.View view = rVar.f411689a;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            int i18 = i17 - rVar.f411691c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateBottomMargin] bottomMargin:");
            sb6.append(layoutParams2 != null ? java.lang.Integer.valueOf(layoutParams2.bottomMargin) : null);
            sb6.append(" keyboardHeight:");
            sb6.append(i17);
            sb6.append(" lastKeyboardHeight:");
            sb6.append(rVar.f411691c);
            sb6.append(" isPause:");
            sb6.append(z18);
            com.tencent.mars.xlog.Log.i("FinderPostBottomMarginHelper", sb6.toString());
            if (!(layoutParams2 != null && layoutParams2.bottomMargin == i17) && !z18) {
                sr2.q qVar = new sr2.q(rVar, i18);
                if (i17 != 0) {
                    qVar.setDuration(200L);
                } else {
                    qVar.setDuration(300L);
                }
                qVar.setAnimationListener(new sr2.p(rVar, i17));
                if (view != null) {
                    view.startAnimation(qVar);
                }
            }
        }
        sr2.w0 F72 = F7();
        if ((F72.f411754e == null || F72.f411760n == null) ? false : true) {
            if (B7()) {
                com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
                if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.W).getValue()).r()).booleanValue()) {
                    return;
                }
            }
            W6.post(new sr2.q4(X6, this));
        }
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        y7();
        java.util.Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((ya2.r1) it.next()).w4(account);
        }
    }

    public final void w7() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f122520n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f122520n = null;
    }

    public final void x7() {
        jz5.g gVar = this.f122531w;
        android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
        int i17 = (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue() || !W6()) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "initDelMediaBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/post/PostMainUIC", "initDelMediaBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View g76 = g7();
        android.view.ViewGroup viewGroup = this.f122514f;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mediaViewContainer");
            throw null;
        }
        int i18 = viewGroup.getChildCount() == 0 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(g76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "initDelMediaBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(g76, "com/tencent/mm/plugin/finder/post/PostMainUIC", "initDelMediaBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new sr2.f4(this));
        g7().setOnClickListener(new sr2.g4(this));
    }

    public final void y7() {
        java.lang.String e17 = xy2.c.e(getActivity());
        this.f122512d = e17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            return;
        }
        this.f122513e = ya2.h.f460484a.b(this.f122512d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0b98  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z7() {
        /*
            Method dump skipped, instructions count: 3561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.post.PostMainUIC.z7():void");
    }
}
