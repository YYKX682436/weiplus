package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class u6 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.finder.feed.g7 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f136096d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f136097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f136098f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f136099g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f136100h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f136101i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136097e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.r6(this, activity));
        this.f136099g = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.t6.f135985d);
        this.f136100h = new java.util.HashSet();
        this.f136101i = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.q6.f135666d);
    }

    public final com.tencent.mm.plugin.finder.view.f5 O6() {
        if (this.f136096d) {
            return P6();
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.view.f5 P6() {
        return (com.tencent.mm.plugin.finder.view.f5) ((jz5.n) this.f136097e).getValue();
    }

    public final void Q6(so2.w0 msg) {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer;
        com.tencent.mm.plugin.finder.feed.a7 presenter;
        yw2.a0 a0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.view.f5 O6 = O6();
        if (O6 == null || (finderCommentDrawer = O6.f132067a) == null || (presenter = finderCommentDrawer.getPresenter()) == null) {
            return;
        }
        kotlin.jvm.internal.o.g(msg, "msg");
        long Z = pm0.v.Z(msg.f410681c);
        com.tencent.mm.plugin.finder.feed.model.y yVar = presenter.f106210g;
        so2.z0 z0Var = yVar.f108468c;
        boolean z17 = true;
        int e17 = z0Var != null && (Z > z0Var.E.field_id ? 1 : (Z == z0Var.E.field_id ? 0 : -1)) == 0 ? 0 : yVar.e(Z);
        if (e17 == -1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onCommentTranslated " + Z);
        so2.y0 f17 = yVar.f(e17);
        java.lang.String str = msg.f410684f;
        if (str == null || str.length() == 0) {
            f17.f410709m = 3;
        } else {
            f17.f410709m = 2;
        }
        f17.f410711o = msg.f410686h;
        f17.f410712p = msg;
        android.text.SpannableString spannableString = f17.f410713q;
        if (spannableString != null && spannableString.length() != 0) {
            z17 = false;
        }
        if (z17) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = msg.f410684f;
            if (str2 == null) {
                str2 = "";
            }
            ((ke0.e) xVar).getClass();
            f17.f410713q = com.tencent.mm.pluginsdk.ui.span.c0.n(presenter.f106207d, str2, 0.0f);
        }
        if ((msg.f410683e && !presenter.R) || f17.f410710n == 0 || (a0Var = presenter.f106216o) == null || (recyclerView = a0Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemChanged(e17);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(java.util.List r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.u6.R6(java.util.List):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter footer;
        long[] longArrayExtra;
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter footer2;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter footer3;
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback closeDrawerCallback;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.finder.view.f5 O6 = O6();
        if (O6 != null) {
            boolean z17 = i17 == 503;
            if (i17 == 502 || z17) {
                java.lang.Long l17 = null;
                java.lang.String str = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("key_select_image_list")) == null) ? null : (java.lang.String) kz5.n0.Z(stringArrayListExtra);
                if (intent != null && (longArrayExtra = intent.getLongArrayExtra("SELECT_IMAGES_MODIFIED_TIME")) != null) {
                    l17 = kz5.z.N(longArrayExtra);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderCommentComponent", "image %s", str);
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = O6.f132067a;
                if (finderCommentDrawer != null && (footer = finderCommentDrawer.getFooter()) != null) {
                    footer.t(str, z17, l17);
                }
            }
            if (intent == null) {
                return;
            }
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.r().r()).intValue() == 1 && i17 == 500) {
                com.tencent.mm.plugin.finder.view.c5 c5Var = (com.tencent.mm.plugin.finder.view.c5) com.tencent.mm.plugin.finder.view.f5.f132066k.remove(java.lang.Long.valueOf(intent.getLongExtra("COMMENT_RESULT_KEY", 0L)));
                if (c5Var != null && (closeDrawerCallback = O6.f132071e) != null) {
                    closeDrawerCallback.a(c5Var.f131749a, c5Var.f131750b, false);
                }
            }
            if (i17 == 501) {
                if (i18 != -1) {
                    com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer2 = O6.f132067a;
                    if (finderCommentDrawer2 == null || (footer2 = finderCommentDrawer2.getFooter()) == null) {
                        return;
                    }
                    footer2.getEditText().postDelayed(new com.tencent.mm.plugin.finder.view.u5(footer2), 300L);
                    return;
                }
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_select_contact");
                if (byteArrayExtra != null) {
                    try {
                        r45.gb4 gb4Var = new r45.gb4();
                        gb4Var.parseFrom(byteArrayExtra);
                        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer3 = O6.f132067a;
                        if (finderCommentDrawer3 == null || (footer3 = finderCommentDrawer3.getFooter()) == null) {
                            return;
                        }
                        footer3.q(gb4Var);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("Finder.FinderCommentComponent", "onActivityResult LocalFinderAtContact parseFrom:%s", e17.getMessage());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onBackPressed() {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.view.f5 r0 = r7.O6()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.b()
            if (r0 != r1) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L97
            android.app.Activity r0 = r7.getContext()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.o.g(r0, r3)
            pf5.z r4 = pf5.z.f353948a
            boolean r5 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            java.lang.String r6 = "Check failed."
            if (r5 == 0) goto L8d
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r4.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.di> r5 = com.tencent.mm.plugin.finder.viewmodel.component.di.class
            androidx.lifecycle.c1 r0 = r0.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.di r0 = (com.tencent.mm.plugin.finder.viewmodel.component.di) r0
            com.tencent.mm.plugin.finder.webview.l0 r0 = r0.f134143d
            if (r0 == 0) goto L4a
            oy2.l r5 = r0.f136882b
            boolean r5 = r5.isAttachedToWindow()
            if (r5 != 0) goto L45
            boolean r0 = r0.f136886f
            if (r0 == 0) goto L43
            goto L45
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r1
        L46:
            if (r0 != r1) goto L4a
            r0 = r1
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r0 != 0) goto L97
            android.app.Activity r0 = r7.getContext()
            kotlin.jvm.internal.o.g(r0, r3)
            boolean r3 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r3 == 0) goto L83
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r4.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.v6> r3 = com.tencent.mm.plugin.finder.viewmodel.component.v6.class
            pf5.b0 r0 = r0.e(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.v6 r0 = (com.tencent.mm.plugin.finder.viewmodel.component.v6) r0
            if (r0 == 0) goto L76
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer r0 = r0.f136212d
            if (r0 == 0) goto L71
            boolean r0 = r0.q()
            goto L72
        L71:
            r0 = r2
        L72:
            if (r0 != r1) goto L76
            r0 = r1
            goto L77
        L76:
            r0 = r2
        L77:
            if (r0 != 0) goto L97
            com.tencent.mm.plugin.finder.view.f5 r0 = r7.O6()
            if (r0 == 0) goto L82
            r0.a()
        L82:
            return r1
        L83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.u6.onBackPressed():boolean");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        getContext().getWindow().setSoftInputMode(50);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer;
        com.tencent.mm.plugin.finder.view.f5 O6 = O6();
        if (O6 != null && (finderCommentDrawer = O6.f132067a) != null) {
            finderCommentDrawer.b();
        }
        jz5.g gVar = this.f136101i;
        java.util.ArrayList arrayList = ((com.tencent.mm.plugin.finder.feed.h7) ((jz5.n) gVar).getValue()).f106905b;
        if (arrayList.contains(this)) {
            arrayList.remove(this);
        }
        com.tencent.mm.plugin.finder.feed.h7 h7Var = (com.tencent.mm.plugin.finder.feed.h7) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.finder.feed.j30 j30Var = h7Var.f106904a;
        if (j30Var != null) {
            if (j30Var.f107081d != null) {
                j30Var.f107082e.d();
                db2.x3 x3Var = j30Var.f107081d;
                if (x3Var != null) {
                    x3Var.j();
                }
            }
            j30Var.f107081d = null;
            j30Var.f107080c = false;
        }
        h7Var.f106907d.clear();
        h7Var.f106906c.clear();
        h7Var.f106905b.clear();
        ((android.util.LruCache) ((jz5.n) this.f136099g).getValue()).evictAll();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        O6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer;
        yw2.a0 a0Var;
        com.tencent.mm.plugin.finder.view.f5 O6 = O6();
        if (O6 == null || (finderCommentDrawer = O6.f132067a) == null) {
            return;
        }
        finderCommentDrawer.x(false);
        com.tencent.mm.plugin.finder.feed.a7 a7Var = finderCommentDrawer.presenter;
        android.view.View view = (a7Var == null || (a0Var = a7Var.f106216o) == null) ? null : a0Var.A;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderCommentDrawer", "onUIResume", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/FinderCommentDrawer", "onUIResume", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.finder.feed.a7 a7Var2 = finderCommentDrawer.presenter;
        yw2.a0 a0Var2 = a7Var2 != null ? a7Var2.f106216o : null;
        if (a0Var2 != null) {
            a0Var2.A = null;
        }
        if (finderCommentDrawer.q()) {
            finderCommentDrawer.w();
        }
    }
}
