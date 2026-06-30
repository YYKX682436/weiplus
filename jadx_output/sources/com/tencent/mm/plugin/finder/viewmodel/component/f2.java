package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class f2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.megavideo.multitask.h f134316d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.yj4 f134317e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f134318f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f134319g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f134320h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f134321i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f134322m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f134323n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.a2 f134324o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134317e = new r45.yj4();
        this.f134318f = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.r1.f135756d);
        this.f134319g = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.v1.f136195d);
        this.f134320h = new java.util.concurrent.ConcurrentHashMap();
        this.f134323n = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.x1.f136385d);
        this.f134324o = new com.tencent.mm.plugin.finder.viewmodel.component.a2(this);
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var, so2.u1 u1Var, int i17) {
        java.lang.String description;
        boolean z17;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.lang.String string;
        java.lang.String string2;
        f2Var.getClass();
        int i18 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(u1Var.getFeedObject().getDescription())) {
            android.content.res.Resources resources = f2Var.getContext().getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity context = f2Var.getContext();
            ya2.b2 contact = u1Var.getContact();
            java.lang.String w07 = contact != null ? contact.w0() : null;
            ((ke0.e) xVar).getClass();
            objArr[0] = com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07);
            description = resources.getString(com.tencent.mm.R.string.cw6, objArr);
        } else {
            description = u1Var.getFeedObject().getDescription();
        }
        kotlin.jvm.internal.o.d(description);
        f2Var.f134317e.set(5, 0);
        f2Var.f134317e.set(3, java.lang.Integer.valueOf(i17));
        java.util.LinkedList list = f2Var.f134317e.getList(1);
        if (list != null) {
            list.clear();
        }
        java.util.LinkedList list2 = f2Var.f134317e.getList(6);
        if (list2 != null) {
            list2.clear();
        }
        java.util.LinkedList list3 = f2Var.f134317e.getList(6);
        if (list3 != null) {
            list3.add(u1Var.getFeedObject().getFeedObject());
        }
        f2Var.f134317e.set(7, java.lang.Long.valueOf(u1Var.getFeedObject().getTimestamps() + (u1Var.getFeedObject().getFeedObject().getUrlValidDuration() * 1000)));
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) f2Var.f134320h.get(java.lang.Long.valueOf(u1Var.getItemId()));
        if (multiTaskInfo != null) {
            com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = f2Var.f134316d;
            if (hVar == null) {
                kotlin.jvm.internal.o.o("multiTaskHelper");
                throw null;
            }
            hVar.f300077a = multiTaskInfo;
            z17 = true;
        } else {
            com.tencent.mm.plugin.finder.megavideo.multitask.h hVar2 = f2Var.f134316d;
            if (hVar2 == null) {
                kotlin.jvm.internal.o.o("multiTaskHelper");
                throw null;
            }
            hVar2.f300077a = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
            com.tencent.mm.plugin.finder.megavideo.multitask.h hVar3 = f2Var.f134316d;
            if (hVar3 == null) {
                kotlin.jvm.internal.o.o("multiTaskHelper");
                throw null;
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = hVar3.f300077a;
            if (multiTaskInfo2 != null) {
                multiTaskInfo2.field_updateTime = c01.id.c();
            }
            com.tencent.mm.plugin.finder.megavideo.multitask.h hVar4 = f2Var.f134316d;
            if (hVar4 == null) {
                kotlin.jvm.internal.o.o("multiTaskHelper");
                throw null;
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo3 = hVar4.f300077a;
            if (multiTaskInfo3 != null) {
                multiTaskInfo3.field_id = pm0.v.u(u1Var.getItemId());
            }
            com.tencent.mm.plugin.finder.megavideo.multitask.h hVar5 = f2Var.f134316d;
            if (hVar5 == null) {
                kotlin.jvm.internal.o.o("multiTaskHelper");
                throw null;
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo4 = hVar5.f300077a;
            if (multiTaskInfo4 != null) {
                multiTaskInfo4.field_type = 22;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f2Var.f134320h;
            java.lang.Long valueOf = java.lang.Long.valueOf(u1Var.getItemId());
            com.tencent.mm.plugin.finder.megavideo.multitask.h hVar6 = f2Var.f134316d;
            if (hVar6 == null) {
                kotlin.jvm.internal.o.o("multiTaskHelper");
                throw null;
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo5 = hVar6.f300077a;
            kotlin.jvm.internal.o.d(multiTaskInfo5);
            z17 = false;
        }
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar7 = f2Var.f134316d;
        if (hVar7 == null) {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo6 = hVar7.f300077a;
        if (multiTaskInfo6 != null) {
            multiTaskInfo6.field_id = pm0.v.u(u1Var.getItemId());
            multiTaskInfo6.v0().set(1, description);
            r45.lr4 v07 = multiTaskInfo6.v0();
            ya2.b2 contact2 = u1Var.getContact();
            v07.set(5, contact2 != null ? contact2.getAvatarUrl() : "");
            r45.yj4 yj4Var = f2Var.f134317e;
            multiTaskInfo6.field_data = yj4Var != null ? yj4Var.toByteArray() : null;
            ya2.b2 contact3 = u1Var.getContact();
            if (contact3 != null) {
                multiTaskInfo6.v0().set(0, contact3.w0());
                multiTaskInfo6.v0().set(10, contact3.D0());
                com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = contact3.field_authInfo;
                if (finderAuthInfo != null) {
                    if (!(finderAuthInfo.getAuthIconType() > 0)) {
                        finderAuthInfo = null;
                    }
                    if (finderAuthInfo != null) {
                        multiTaskInfo6.v0().set(6, java.lang.Integer.valueOf(finderAuthInfo.getAuthIconType()));
                        multiTaskInfo6.v0().set(2, finderAuthInfo.getAuthIconUrl());
                    }
                }
            }
            if (hc2.o0.G(u1Var.getFeedObject().getFeedObject())) {
                r45.lr4 v08 = multiTaskInfo6.v0();
                r45.f1 b17 = hc2.g0.b(u1Var.getFeedObject().getFeedObject());
                if (b17 == null || (string = b17.getString(0)) == null) {
                    string = multiTaskInfo6.v0().getString(0);
                }
                v08.set(0, string);
                r45.lr4 v09 = multiTaskInfo6.v0();
                r45.f1 b18 = hc2.g0.b(u1Var.getFeedObject().getFeedObject());
                if (b18 == null || (string2 = b18.getString(1)) == null) {
                    string2 = multiTaskInfo6.v0().getString(5);
                }
                v09.set(5, string2);
                multiTaskInfo6.v0().set(6, 0);
                multiTaskInfo6.v0().set(2, "");
            }
            r45.lr4 v010 = multiTaskInfo6.v0();
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = u1Var.getFeedObject().getFeedObject().getObjectDesc();
            if (objectDesc != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                i18 = finderMedia.getVideoDuration();
            }
            v010.set(3, java.lang.Integer.valueOf(i18));
        }
        if (f2Var.f134321i) {
            return;
        }
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar8 = f2Var.f134316d;
        if (hVar8 == null) {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.finder.megavideo.multitask.d(hVar8));
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderAddHistoryUIC", "addToTaskbar: add to history, playTime = " + i17 + ", feedId = " + pm0.v.u(u1Var.getItemId()));
    }

    public final boolean P6() {
        androidx.recyclerview.widget.RecyclerView R6 = R6();
        if (R6 == null) {
            return false;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = R6.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return false;
        }
        androidx.recyclerview.widget.k3 p07 = R6.p0(linearLayoutManager.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        if (s0Var == null) {
            return false;
        }
        java.lang.Object obj = s0Var.f293125i;
        if (!(obj instanceof so2.u1)) {
            return false;
        }
        so2.u1 u1Var = (so2.u1) obj;
        if ((!u1Var.getFeedObject().isLongVideo() || u1Var.f410631e) && !this.f134321i) {
            return false;
        }
        if (this.f134321i && u1Var.getItemId() != getIntent().getLongExtra("KEY_CACHE_OBJECT_ID", 0L)) {
            com.tencent.mars.xlog.Log.i("FinderAddHistoryUIC", "addOrUpdateHistory: return for multi task, curr feed id=".concat(pm0.v.u(u1Var.getItemId())));
            return false;
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        pm0.v.L("addHistory", true, new com.tencent.mm.plugin.finder.viewmodel.component.q1(this, obj, finderVideoLayout != null ? finderVideoLayout.getCurrentPosSec() : 0));
        return true;
    }

    public final void Q6(in5.s0 holder, boolean z17) {
        java.lang.String description;
        android.graphics.Bitmap bitmap;
        java.lang.String string;
        int i17;
        java.lang.String string2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            com.tencent.mars.xlog.Log.i("FinderAddHistoryUIC", "addToMultiTask: item is not BaseFinderFeed");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderAddHistoryUIC", "addToMultiTask: item=" + baseFinderFeed + ", isFromSwipe=" + z17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(baseFinderFeed.getFeedObject().getDescription())) {
            android.content.res.Resources resources = getContext().getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity context = getContext();
            ya2.b2 contact = baseFinderFeed.getContact();
            java.lang.String w07 = contact != null ? contact.w0() : null;
            ((ke0.e) xVar).getClass();
            objArr[0] = com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07);
            description = resources.getString(com.tencent.mm.R.string.cw6, objArr);
        } else {
            description = baseFinderFeed.getFeedObject().getDescription();
        }
        kotlin.jvm.internal.o.d(description);
        r45.yj4 yj4Var = new r45.yj4();
        yj4Var.set(3, 0);
        java.util.LinkedList list = yj4Var.getList(1);
        if (list != null) {
            list.clear();
        }
        java.util.LinkedList list2 = yj4Var.getList(6);
        if (list2 != null) {
            list2.clear();
        }
        java.util.LinkedList list3 = yj4Var.getList(6);
        if (list3 != null) {
            list3.add(baseFinderFeed.getFeedObject().getFeedObject());
        }
        r45.hl2 client_local_buffer = baseFinderFeed.getFeedObject().getFeedObject().getClient_local_buffer();
        yj4Var.set(7, java.lang.Long.valueOf(client_local_buffer != null ? client_local_buffer.getLong(0) : c01.id.c()));
        baseFinderFeed.getFeedObject().getFeedObject().getUrlValidDuration();
        long c17 = c01.id.c();
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = this.f134316d;
        if (hVar == null) {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = hVar.f300077a;
        if (multiTaskInfo != null) {
            multiTaskInfo.field_id = pm0.v.u(baseFinderFeed.getItemId());
            multiTaskInfo.field_showData = new r45.lr4();
            multiTaskInfo.v0().set(1, description);
            ya2.b2 contact2 = baseFinderFeed.getContact();
            if (contact2 != null) {
                multiTaskInfo.v0().set(5, contact2.getAvatarUrl());
                multiTaskInfo.v0().set(0, contact2.w0());
                multiTaskInfo.v0().set(10, contact2.D0());
                com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = contact2.field_authInfo;
                if (finderAuthInfo != null) {
                    if (!(finderAuthInfo.getAuthIconType() > 0)) {
                        finderAuthInfo = null;
                    }
                    if (finderAuthInfo != null) {
                        multiTaskInfo.v0().set(6, java.lang.Integer.valueOf(finderAuthInfo.getAuthIconType()));
                        multiTaskInfo.v0().set(2, finderAuthInfo.getAuthIconUrl());
                    }
                }
            }
            multiTaskInfo.field_data = yj4Var.toByteArray();
            r45.lr4 v07 = multiTaskInfo.v0();
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = baseFinderFeed.getFeedObject().getFeedObject().getObjectDesc();
            v07.set(3, java.lang.Integer.valueOf((objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) ? 0 : finderMedia.getVideoDuration()));
            multiTaskInfo.field_createTime = c17;
            if (hc2.o0.G(baseFinderFeed.getFeedObject().getFeedObject())) {
                r45.lr4 v08 = multiTaskInfo.v0();
                r45.f1 b17 = hc2.g0.b(baseFinderFeed.getFeedObject().getFeedObject());
                if (b17 == null || (string = b17.getString(0)) == null) {
                    string = multiTaskInfo.v0().getString(0);
                }
                v08.set(0, string);
                r45.lr4 v09 = multiTaskInfo.v0();
                r45.f1 b18 = hc2.g0.b(baseFinderFeed.getFeedObject().getFeedObject());
                if (b18 == null || (string2 = b18.getString(1)) == null) {
                    i17 = 5;
                    string2 = multiTaskInfo.v0().getString(5);
                } else {
                    i17 = 5;
                }
                v09.set(i17, string2);
                multiTaskInfo.v0().set(6, 0);
                multiTaskInfo.v0().set(2, "");
            }
        }
        if (S6()) {
            com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
            multiTaskInfo2.field_id = pm0.v.u(baseFinderFeed.getItemId());
            multiTaskInfo2.field_type = 22;
            if (((com.tencent.mm.plugin.multitask.p1) l0Var).Ri(multiTaskInfo2)) {
                com.tencent.mm.plugin.finder.megavideo.multitask.h hVar2 = this.f134316d;
                if (hVar2 == null) {
                    kotlin.jvm.internal.o.o("multiTaskHelper");
                    throw null;
                }
                hVar2.B(false);
                com.tencent.mars.xlog.Log.i("FinderAddHistoryUIC", "addToMultiTask: item=" + baseFinderFeed + ", isFromSwipe=" + z17 + " return for removeTaskInfoAndCoverImg");
                return;
            }
        }
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar3 = this.f134316d;
        if (hVar3 == null) {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
        r45.kr4 kr4Var = hVar3.f300079c;
        r45.er4 er4Var = kr4Var != null ? (r45.er4) kr4Var.getCustom(6) : null;
        if (er4Var != null) {
            er4Var.set(0, java.lang.Long.valueOf(z17 ? 7L : 8L));
        }
        pf5.u uVar = pf5.u.f353936a;
        if (((com.tencent.mm.plugin.finder.viewmodel.component.po) uVar.c(getActivity()).e(com.tencent.mm.plugin.finder.viewmodel.component.po.class)) != null) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
            com.tencent.mm.plugin.finder.megavideo.multitask.h hVar4 = this.f134316d;
            if (hVar4 == null) {
                kotlin.jvm.internal.o.o("multiTaskHelper");
                throw null;
            }
            com.tencent.mm.plugin.finder.megavideo.multitask.h.c0(hVar4, finderVideoLayout.getBitmap(), pm0.v.t(finderVideoLayout), false, 4, null);
            com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = (com.tencent.mm.plugin.finder.viewmodel.component.g1) uVar.b(getContext()).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
            if (g1Var != null) {
                g1Var.f134456e = false;
            }
            if (!z17) {
                com.tencent.mm.plugin.finder.megavideo.multitask.h hVar5 = this.f134316d;
                if (hVar5 == null) {
                    kotlin.jvm.internal.o.o("multiTaskHelper");
                    throw null;
                }
                hVar5.B(true);
            }
        } else {
            if (z17) {
                bitmap = null;
            } else {
                bitmap = uj5.g.d(holder.itemView, (int) (r2.getWidth() / 1.0f), (int) (holder.itemView.getHeight() / 1.0f), false, android.graphics.Bitmap.Config.ARGB_8888);
            }
            com.tencent.mm.plugin.finder.megavideo.multitask.h hVar6 = this.f134316d;
            if (hVar6 == null) {
                kotlin.jvm.internal.o.o("multiTaskHelper");
                throw null;
            }
            com.tencent.mm.plugin.finder.megavideo.multitask.h.c0(hVar6, bitmap, null, z17, 2, null);
            if (z17) {
                com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.g1) uVar.b(getContext()).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
                if (g1Var2 != null) {
                    g1Var2.f134456e = false;
                }
            } else {
                com.tencent.mm.plugin.finder.megavideo.multitask.h hVar7 = this.f134316d;
                if (hVar7 == null) {
                    kotlin.jvm.internal.o.o("multiTaskHelper");
                    throw null;
                }
                if (S6()) {
                    hVar7.V(true, 8, jk3.c.f300081e);
                } else {
                    ak3.c cVar = hVar7.f300111d;
                    if (cVar != null) {
                        ck3.q.f42513a.a(cVar, ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Bi(), null, true, -1.0f, new com.tencent.mm.plugin.finder.megavideo.multitask.g(hVar7), false, false);
                    }
                }
                if (!S6()) {
                    pm0.v.V(500L, new com.tencent.mm.plugin.finder.viewmodel.component.s1(this));
                }
            }
        }
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("view_id", "button_float_frame");
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        lVarArr[2] = new jz5.l("behaviour_session_id", V6 != null ? V6.getString(0) : null);
        lVarArr[3] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[4] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[5] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
    }

    public final androidx.recyclerview.widget.RecyclerView R6() {
        android.view.View findViewById;
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.view.View view = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment().getView();
            findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.m6e) : null;
        } else {
            findViewById = findViewById(com.tencent.mm.R.id.m6e);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = findViewById instanceof com.tencent.mm.view.RefreshLoadMoreLayout ? (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById : null;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout.getRecyclerView();
        }
        return null;
    }

    public final boolean S6() {
        return ((java.lang.Boolean) ((jz5.n) this.f134323n).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (this.f134321i) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            if (!((com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134505d) {
                boolean P6 = P6();
                com.tencent.mars.xlog.Log.i("FinderAddHistoryUIC", "onBackPressed: update ret=" + P6);
                if (P6) {
                    com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = this.f134316d;
                    if (hVar == null) {
                        kotlin.jvm.internal.o.o("multiTaskHelper");
                        throw null;
                    }
                    if (hVar.U(2, false)) {
                        this.f134322m = true;
                        return true;
                    }
                } else {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    com.tencent.mm.plugin.multitask.l0.Bd((com.tencent.mm.plugin.multitask.l0) c17, 2, null, 0, null, 14, null);
                }
            }
        }
        return super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if ((r11 != null && r11.i7()) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        r11 = r10.f134316d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        r11.d0(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d1, code lost:
    
        kotlin.jvm.internal.o.o("multiTaskHelper");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c7, code lost:
    
        if ((r11 != null && (r11 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI)) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateAfter(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.f2.onCreateAfter(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = this.f134316d;
        if (hVar != null) {
            hVar.A();
        } else {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = this.f134316d;
        if (hVar != null) {
            hVar.z();
        } else {
            kotlin.jvm.internal.o.o("multiTaskHelper");
            throw null;
        }
    }
}
