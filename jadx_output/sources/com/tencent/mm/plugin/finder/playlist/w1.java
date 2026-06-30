package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class w1 extends com.tencent.mm.ui.component.UIComponent implements zy2.m9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f122482d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f122483e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f122484f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f122485g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f122483e = jz5.h.b(new com.tencent.mm.plugin.finder.playlist.v1(this));
        this.f122484f = getActivity().getIntent().getBooleanExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
        this.f122485g = kz5.c0.i(39, 1, 8, 32, 33, 172);
    }

    public final void O6(com.tencent.mm.plugin.finder.feed.k8 contract, in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        int i17;
        kotlin.jvm.internal.o.g(contract, "contract");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() && this.f122484f) {
            this.f122484f = false;
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
            com.tencent.mm.plugin.finder.feed.pz pzVar = contract instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) contract : null;
            a4Var.W6(pzVar != null ? pzVar.f108756h : null, item, holder, P6());
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = item.getFeedObject();
            int adapterPosition = holder.getAdapterPosition();
            int c17 = com.tencent.mm.ui.bl.c(context);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i18 = b17.x;
            int i19 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z17) {
                i17 = i19 - c17;
            } else {
                if (i19 >= i18) {
                    i18 = i19;
                }
                i17 = i18 - c17;
            }
            T6(feedObject, 1, adapterPosition, (int) (i17 * kx2.a.f313278a.a(context)), null);
            getActivity().getIntent().putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.gg) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).U6(getActivity().getIntent().getExtras());
        }
    }

    public final com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer P6() {
        return (com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer) this.f122483e.getValue();
    }

    public final java.util.Map Q6(long j17, r45.vx0 vx0Var, int i17) {
        if (vx0Var != null) {
            return kz5.c1.k(new jz5.l("collection_id", pm0.v.u(vx0Var.getLong(0))), new jz5.l("feed_location_id", java.lang.Integer.valueOf(i17)), new jz5.l("feed_id", pm0.v.u(j17)));
        }
        return null;
    }

    public final void R6(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        r45.vx0 vx0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.dm2 object_extend = item.getFeedObject().getFeedObject().getObject_extend();
        java.lang.String str = null;
        if ((object_extend != null ? (r45.vx0) object_extend.getCustom(0) : null) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFeedFocused hit collection jumper expt, collectionName=");
            r45.dm2 object_extend2 = item.getFeedObject().getFeedObject().getObject_extend();
            if (object_extend2 != null && (vx0Var = (r45.vx0) object_extend2.getCustom(0)) != null) {
                str = vx0Var.getString(1);
            }
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawerUIC", sb6.toString());
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Cd).getValue()).l();
        }
    }

    public final void S6(com.tencent.mm.plugin.finder.playlist.d2 initParam, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(initParam, "initParam");
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer P6 = P6();
        if (P6 != null) {
            com.tencent.mm.plugin.finder.report.d2.m(com.tencent.mm.plugin.finder.report.d2.f124994a, P6, "choose_collection_half_view", 0, 0, Q6(initParam.f122281a, initParam.f122285e, i18), null, 44, null);
        }
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer P62 = P6();
        if (P62 != null) {
            P62.w(initParam, i17, i18, i19);
        }
    }

    public final void T6(com.tencent.mm.plugin.finder.storage.FinderItem feedObj, int i17, int i18, int i19, r45.vx0 vx0Var) {
        r45.vx0 vx0Var2;
        r45.vx0 vx0Var3;
        java.lang.String concat;
        com.tencent.mm.plugin.finder.playlist.w1 w1Var;
        r45.vx0 vx0Var4;
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer P6 = P6();
        if (P6 != null) {
            com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
            long id6 = feedObj.getId();
            if (vx0Var == null) {
                r45.dm2 object_extend = feedObj.getFeedObject().getObject_extend();
                if (object_extend != null) {
                    vx0Var4 = (r45.vx0) object_extend.getCustom(0);
                    w1Var = this;
                } else {
                    w1Var = this;
                    vx0Var4 = null;
                }
            } else {
                w1Var = this;
                vx0Var4 = vx0Var;
            }
            com.tencent.mm.plugin.finder.report.d2.m(d2Var, P6, "choose_collection_half_view", 0, 0, w1Var.Q6(id6, vx0Var4, i18), null, 44, null);
        }
        if (vx0Var == null) {
            r45.dm2 object_extend2 = feedObj.getFeedObject().getObject_extend();
            vx0Var2 = object_extend2 != null ? (r45.vx0) object_extend2.getCustom(0) : null;
        } else {
            vx0Var2 = vx0Var;
        }
        if (vx0Var2 != null) {
            java.lang.String string = vx0Var2.getString(3);
            if (string == null || string.length() == 0) {
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(feedObj.getMediaList());
                java.lang.String str = "";
                if (mb4Var != null) {
                    java.lang.String string2 = mb4Var.getString(16);
                    if (string2 == null || string2.length() == 0) {
                        java.lang.String string3 = mb4Var.getString(1);
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (string3 == null) {
                            string3 = "";
                        }
                        java.lang.String string4 = mb4Var.getString(19);
                        if (string4 == null) {
                            string4 = "";
                        }
                        concat = string3.concat(string4);
                    } else {
                        java.lang.String string5 = mb4Var.getString(16);
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (string5 == null) {
                            string5 = "";
                        }
                        java.lang.String string6 = mb4Var.getString(20);
                        if (string6 == null) {
                            string6 = "";
                        }
                        concat = string5.concat(string6);
                    }
                    if (concat != null) {
                        str = concat;
                    }
                }
                vx0Var2.set(3, str);
            }
            vx0Var3 = vx0Var2;
        } else {
            vx0Var3 = null;
        }
        if (vx0Var3 == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderPlayListDrawerUIC", "%s no collectionInfo", pm0.v.u(feedObj.getId()));
            return;
        }
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer P62 = P6();
        if (P62 != null) {
            P62.w(new com.tencent.mm.plugin.finder.playlist.d2(feedObj.getId(), feedObj.getDupFlag(), feedObj.getObjectNonceId(), kotlin.jvm.internal.o.b(feedObj.getUserName(), xy2.c.e(getContext())), vx0Var3, hc2.q.a(feedObj.getFeedObject()), feedObj.getUserName(), null, 128, null), i17, i18, i19);
        }
    }

    public final com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer U6() {
        if (this.f122482d) {
            return P6();
        }
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer U6 = U6();
        if (!(U6 != null && U6.q())) {
            return false;
        }
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer U62 = U6();
        if (U62 != null) {
            U62.u();
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer U6 = U6();
        if (U6 != null) {
            U6.b();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        U6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        U6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f122483e = jz5.h.b(new com.tencent.mm.plugin.finder.playlist.v1(this));
        this.f122484f = getActivity().getIntent().getBooleanExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
        this.f122485g = kz5.c0.i(39, 1, 8, 32, 33, 172);
    }
}
