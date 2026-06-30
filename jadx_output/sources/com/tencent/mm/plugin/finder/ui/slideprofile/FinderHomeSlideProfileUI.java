package com.tencent.mm.plugin.finder.ui.slideprofile;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/slideprofile/FinderHomeSlideProfileUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderHomeSlideProfileUI extends com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI {

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f129824t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f129825u;

    /* renamed from: v, reason: collision with root package name */
    public int f129826v = -1;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f129827w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f129828x;

    public static final void c7(com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI finderHomeSlideProfileUI, int i17) {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        if (finderHomeSlideProfileUI.g7() && i17 != finderHomeSlideProfileUI.f129826v) {
            if (i17 == 0) {
                com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = finderHomeSlideProfileUI.f129827w;
                if (vASCommonFragment != null && (vASActivity = vASCommonFragment.f211121p) != null) {
                    pf5.z zVar = pf5.z.f353948a;
                    if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a(vASActivity).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).f124114q == 0) {
                        ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a(vASActivity).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).f124114q = 2;
                    }
                }
                finderHomeSlideProfileUI.i7(true);
                finderHomeSlideProfileUI.h7(false);
                com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "total focus to timeline");
            } else if (i17 == 1) {
                finderHomeSlideProfileUI.i7(false);
                finderHomeSlideProfileUI.h7(true);
                com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "start focus to profile");
            }
            finderHomeSlideProfileUI.f129826v = i17;
        }
    }

    public static com.tencent.mm.ui.vas.VASCommonFragment e7(com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI finderHomeSlideProfileUI, java.lang.String str, android.content.Intent intent, boolean z17, boolean z18, java.lang.Class cls, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProfileVASFragment");
        }
        if ((i17 & 2) != 0) {
            intent = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        if ((i17 & 16) != 0) {
            cls = com.tencent.mm.ui.vas.VASCommonFragment.class;
        }
        finderHomeSlideProfileUI.getClass();
        java.lang.Class<?> cls2 = java.lang.Class.forName(str);
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_CLS, cls2);
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_COMMON_AREA_CONTROL, true);
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_IS_FRAGMENT_MODE, false);
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_ACTIVITY_SWIPE_BACK, z17);
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, z18);
        if (intent.getComponent() == null) {
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, cls2);
        }
        com.tencent.mm.ui.vas.VASCommonFragment a17 = com.tencent.mm.ui.vas.VASCommonFragment.Q.a(intent, cls);
        kotlin.jvm.internal.o.f(a17, "newInstance(...)");
        return a17;
    }

    public final void d7(com.tencent.mm.plugin.finder.storage.FinderItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "bindCurrentFeed: " + item.getId());
        com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView finderPagerView = (com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView) findViewById(com.tencent.mm.R.id.u2u);
        if (finderPagerView != null) {
            finderPagerView.setEnableHorizontallyScroll(true);
        }
        if (this.f129828x) {
            j7(true);
            this.f129828x = false;
        }
        this.f129824t = item;
        if (this.f129827w != null) {
            com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "bindCurrentFeed, reset profileFragment");
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f129827w;
            if (vASCommonFragment != null) {
                androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.j(vASCommonFragment);
                beginTransaction.e();
            }
            this.f129827w = null;
            this.f129825u = false;
        }
        j7(false);
    }

    public final boolean f7() {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView finderPagerView = (com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView) findViewById(com.tencent.mm.R.id.u2u);
        if (this.f129826v != 1 || finderPagerView == null) {
            return false;
        }
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f129827w;
        if (vASCommonFragment != null && (vASActivity = vASCommonFragment.f211121p) != null) {
            ((com.tencent.mm.plugin.finder.profile.uic.p2) pf5.z.f353948a.a(vASActivity).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).f124114q = 4;
        }
        finderPagerView.e();
        return true;
    }

    public final boolean g7() {
        int d17 = getD();
        return d17 == 20 || d17 == 25 || d17 == 172 || d17 == 38;
    }

    public final void h7(boolean z17) {
        if (!z17) {
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
            if (swipeBackLayout != null) {
                swipeBackLayout.setEnableGesture(true);
            }
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f129827w;
            if (vASCommonFragment != null) {
                if (!kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (vASCommonFragment.f211133e != 2) {
                    com.tencent.mars.xlog.Log.i(vASCommonFragment.getF211120o(), "[onViewUnFocused] " + vASCommonFragment.getClass().getSimpleName() + '@' + vASCommonFragment.hashCode());
                    java.util.Iterator it = vASCommonFragment.f211134f.iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.ui.component.UIComponent) it.next()).onUserVisibleUnFocused();
                    }
                    vASCommonFragment.f211133e = 2;
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "try resume");
        if (this.f129825u) {
            com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "resume, alreadyBindFragment");
        } else {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f129827w;
            if (vASCommonFragment2 == null) {
                com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "resume, profileFragment is null");
                this.f129828x = true;
            } else {
                androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.m(vASCommonFragment2, androidx.lifecycle.n.RESUMED);
                beginTransaction.e();
                this.f129825u = true;
                com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "resume success");
            }
        }
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout2 = getSwipeBackLayout();
        if (swipeBackLayout2 != null) {
            swipeBackLayout2.setEnableGesture(false);
        }
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment3 = this.f129827w;
        if (vASCommonFragment3 != null) {
            if (!kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (vASCommonFragment3.f211133e != 1) {
                pk5.a aVar = new pk5.a(vASCommonFragment3);
                if (vASCommonFragment3.isResumed()) {
                    aVar.run();
                } else {
                    com.tencent.mars.xlog.Log.w(vASCommonFragment3.getF211120o(), "[onUserVisibleFocused] wait to fragment resume.");
                    vASCommonFragment3.f211139n.add(aVar);
                }
                vASCommonFragment3.f211133e = 1;
            }
        }
    }

    public abstract void i7(boolean z17);

    public final void j7(boolean z17) {
        r45.vx0 vx0Var;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar;
        java.lang.String sessionBuffer;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String X6;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "tryInitProfileFragment, directCreate: " + z17);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f129824t;
        if (finderItem != null) {
            boolean z18 = finderItem.getBizInfo() != null;
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar2 = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            if (z18) {
                com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "getBizProfileFragment");
                r45.xk bizInfo = finderItem.getBizInfo();
                if (bizInfo == null || (str = bizInfo.getString(0)) == null) {
                    str = "";
                }
                android.content.Intent intent = new android.content.Intent();
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar2, context, intent, finderItem.getId(), null, 0, 1, false, 0, finderItem.getDupFlag(), 192, null);
                intent.putExtra("Contact_User", str);
                intent.putExtra("Contact_Scene", 213);
                intent.putExtra("biz_profile_enter_from_finder", true);
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                intent.putExtra("finder_feed_id", finderItem.getId());
                intent.putExtra("biz_profile_tab_type", 1);
                java.lang.String sessionBuffer2 = finderItem.getFeedObject().getSessionBuffer();
                if (sessionBuffer2 == null || sessionBuffer2.length() == 0) {
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    long id6 = finderItem.getId();
                    java.lang.String dupFlag = finderItem.getDupFlag();
                    androidx.appcompat.app.AppCompatActivity context2 = getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    str2 = "";
                    iyVar = iyVar2;
                    com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context2);
                    sessionBuffer = o3Var.ek(id6, dupFlag, e17 != null ? e17.f135380n : 0);
                } else {
                    str2 = "";
                    iyVar = iyVar2;
                    sessionBuffer = finderItem.getFeedObject().getSessionBuffer();
                }
                intent.putExtra("Contact_Scene_Note", sessionBuffer);
                intent.putExtra("finder_from_feed_id", finderItem.getFeedObject().getId());
                intent.putExtra("finder_from_feed_dup_flag", finderItem.getDupFlag());
                androidx.appcompat.app.AppCompatActivity context3 = getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context3);
                intent.putExtra("finder_from_feed_comment_scene", e18 != null ? e18.f135380n : 0);
                intent.putExtra("finder_from_feed_type", finderItem.isLiveFeed() ? 1 : 2);
                androidx.appcompat.app.AppCompatActivity context4 = getContext();
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context4);
                r45.qt2 V6 = e19 != null ? e19.V6() : null;
                boolean booleanExtra = getIntent().getBooleanExtra("is_from_ad", false);
                intent.putExtra("key_is_from_slide", true);
                if (booleanExtra) {
                    androidx.appcompat.app.AppCompatActivity context5 = getContext();
                    kotlin.jvm.internal.o.f(context5, "getContext(...)");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(context5);
                    if (e27 != null && (X6 = e27.X6()) != null) {
                        try {
                            java.lang.String optString = new org.json.JSONObject(X6).optString("sns_ad");
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                jSONObject.put("adReportInfo", optString);
                                jSONObject.put("commentscene", V6 != null ? V6.getInteger(5) : 0);
                                if (V6 == null || (str4 = V6.getString(2)) == null) {
                                    str4 = str2;
                                }
                                jSONObject.put("clicktabcontextid", str4);
                                if (V6 == null || (str5 = V6.getString(1)) == null) {
                                    str5 = str2;
                                }
                                jSONObject.put("findercontextid", str5);
                                jSONObject.put("feedid", pm0.v.u(finderItem.getId()));
                                java.lang.String jSONObject2 = jSONObject.toString();
                                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                                intent.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject2, ",", ";", false));
                            }
                        } catch (java.lang.Exception unused) {
                            com.tencent.mars.xlog.Log.e("FinderProfileUtils", "jumpBizProfile parse ad info");
                        }
                    }
                } else {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("commentscene", V6 != null ? V6.getInteger(5) : 0);
                    if (V6 == null || (str3 = V6.getString(2)) == null) {
                        str3 = str2;
                    }
                    jSONObject3.put("clicktabcontextid", str3);
                    jSONObject3.put("findercontextid", (V6 == null || (string = V6.getString(1)) == null) ? str2 : string);
                    jSONObject3.put("feedid", pm0.v.u(finderItem.getId()));
                    java.lang.String jSONObject4 = jSONObject3.toString();
                    kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                    intent.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject4, ",", ";", false));
                }
                this.f129827w = e7(this, "com.tencent.mm.plugin.profile.ui.ContactInfoUI", intent, false, false, null, 28, null);
            } else {
                com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "getFinderProfileFragment");
                androidx.appcompat.app.AppCompatActivity context6 = getContext();
                kotlin.jvm.internal.o.f(context6, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar2.e(context6);
                int i17 = e28 != null ? e28.f135380n : 0;
                android.content.Intent intent2 = new android.content.Intent();
                androidx.appcompat.app.AppCompatActivity context7 = getContext();
                com.tencent.mm.ui.MMActivity mMActivity = context7 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context7 : null;
                if (mMActivity != null) {
                    intent2.putExtra("key_to_user_name", mMActivity.getIntent().getStringExtra("key_to_user_name"));
                    intent2.putExtra("from_user", mMActivity.getIntent().getStringExtra("from_user"));
                    intent2.putExtra("key_from_user_name", mMActivity.getIntent().getStringExtra("key_from_user_name"));
                    intent2.putExtra("report_scene", mMActivity.getIntent().getIntExtra("report_scene", 0));
                }
                intent2.putExtra("finder_username", finderItem.getUserName());
                intent2.putExtra("finder_read_feed_id", finderItem.getId());
                intent2.putExtra("finder_read_feed_dup_flag", finderItem.getDupFlag());
                intent2.putExtra("finder_from_feed_id", finderItem.getId());
                intent2.putExtra("finder_from_feed_dup_flag", finderItem.getDupFlag());
                intent2.putExtra("finder_from_feed_comment_scene", i17);
                intent2.putExtra("finder_from_feed_type", finderItem.isLiveFeed() ? 1 : 2);
                r45.dm2 object_extend = finderItem.getFeedObject().getObject_extend();
                intent2.putExtra("key_finder_collection_id", (object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? null : java.lang.Long.valueOf(vx0Var.getLong(0)));
                intent2.putExtra("key_is_from_slide", true);
                androidx.appcompat.app.AppCompatActivity context8 = getContext();
                kotlin.jvm.internal.o.f(context8, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar2, context8, intent2, finderItem.getId(), null, 0, 1, false, 0, finderItem.getDupFlag(), 192, null);
                androidx.appcompat.app.AppCompatActivity context9 = getContext();
                kotlin.jvm.internal.o.f(context9, "getContext(...)");
                ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) pf5.z.f353948a.a(context9).c(zy2.v9.class))).S6(finderItem.getId(), intent2);
                if (!(getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) && !(getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI) && !(getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI)) {
                    intent2.putExtra("KEY_FROM_TIMELINE", true);
                }
                this.f129827w = e7(this, com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI.class.getName(), intent2, false, false, null, 28, null);
            }
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f129827w;
            if (vASCommonFragment != null) {
                if (z17 || this.f129826v == 1) {
                    androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
                    beginTransaction.k(com.tencent.mm.R.id.l8l, vASCommonFragment, null);
                    beginTransaction.e();
                } else {
                    androidx.fragment.app.i2 beginTransaction2 = getSupportFragmentManager().beginTransaction();
                    beginTransaction2.k(com.tencent.mm.R.id.l8l, vASCommonFragment, null);
                    beginTransaction2.m(vASCommonFragment, androidx.lifecycle.n.CREATED);
                    beginTransaction2.e();
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (f7()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fc2.c n17;
        super.onCreate(bundle);
        com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView finderPagerView = (com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView) findViewById(com.tencent.mm.R.id.u2u);
        if (finderPagerView == null) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Qb).getValue()).r()).booleanValue()) {
            finderPagerView.setOnPageScrollListener(new av2.a(this));
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
                return;
            }
            n17.a(new av2.c(this));
        }
    }
}
