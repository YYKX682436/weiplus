package v40;

@j95.b
/* loaded from: classes2.dex */
public final class s extends i95.w implements uc.n, androidx.lifecycle.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.l1 f433191d = new androidx.lifecycle.l1();

    public void Ai(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Zi("", "enterFinderLiveFindPageUI");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        nq2.d dVar = nq2.d.f338980a;
        dVar.k(intent);
        rq2.s sVar = rq2.s.f398879a;
        sVar.c(true, false);
        if (!sVar.a()) {
            dVar.l(intent, 88890, 0, "推荐");
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveFindPageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveFindPageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Bi(android.content.Context context, android.content.Intent intent, java.lang.String themeId) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(themeId, "themeId");
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.w("FinderLiveSquareService", "enterLiveSpecialThemeUI: is in teen mode, themeId=".concat(themeId));
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        if (!intent2.hasExtra("KEY_PARAMS_CONFIG_THEME_SPECIAL_BUBBLE_KEY")) {
            dk2.of.f233859j.b(intent2, new dk2.of(themeId, "", "", null, null, null, false, 0, 0, false));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSquareService", "enterLiveSpecialThemeUI: enter live theme, themeId=".concat(themeId));
        wo2.i.f448077a.a(context, intent2);
    }

    public int Di(int i17, int i18) {
        return (i17 * 100000) + kp2.a.f310956a.a(i17, i18);
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f433191d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di((android.app.Activity) r13) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi(android.content.Context r13, android.content.Intent r14) {
        /*
            r12 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.Class<l40.e> r0 = l40.e.class
            i95.m r0 = i95.n0.c(r0)
            l40.e r0 = (l40.e) r0
            k40.f r0 = (k40.f) r0
            java.lang.String r1 = ""
            java.lang.String r2 = "enterLiveEntranceUI"
            r0.Zi(r1, r2)
            rq2.d r0 = rq2.d.f398816a
            r1 = 1
            r0.i(r1)
            r0 = 0
            if (r14 == 0) goto L28
            java.lang.String r2 = "KEY_ENTER_LIVE_PARAM_INTENT_DATA"
            android.os.Parcelable r2 = r14.getParcelableExtra(r2)
            android.content.Intent r2 = (android.content.Intent) r2
            goto L29
        L28:
            r2 = r0
        L29:
            r3 = 0
            if (r2 != 0) goto L51
            if (r14 == 0) goto L37
            java.lang.String r2 = "nearby_live_forbid_enter_preload_params_key"
            boolean r2 = r14.getBooleanExtra(r2, r3)
            if (r2 != r1) goto L37
            goto L38
        L37:
            r1 = r3
        L38:
            if (r1 != 0) goto L51
            ys5.e r5 = ys5.e.f465257e
            java.lang.Class<ys5.f> r1 = ys5.f.class
            i95.m r1 = i95.n0.c(r1)
            java.lang.String r2 = "getService(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r4 = r1
            ys5.f r4 = (ys5.f) r4
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            ys5.f.D6(r4, r5, r6, r7, r8, r9)
        L51:
            if (r14 != 0) goto L58
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
        L58:
            boolean r1 = r13 instanceof android.app.Activity
            if (r1 != 0) goto L5d
            r0 = r14
        L5d:
            if (r0 == 0) goto L64
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r2)
        L64:
            java.lang.Class<zy2.c9> r0 = zy2.c9.class
            i95.m r2 = i95.n0.c(r0)
            zy2.c9 r2 = (zy2.c9) r2
            com.tencent.mm.plugin.finder.service.l3 r2 = (com.tencent.mm.plugin.finder.service.l3) r2
            boolean r2 = r2.Zi(r13)
            if (r2 != 0) goto L8e
            if (r1 == 0) goto L88
            i95.m r0 = i95.n0.c(r0)
            zy2.c9 r0 = (zy2.c9) r0
            r1 = r13
            android.app.Activity r1 = (android.app.Activity) r1
            com.tencent.mm.plugin.finder.service.l3 r0 = (com.tencent.mm.plugin.finder.service.l3) r0
            boolean r0 = r0.Di(r1)
            if (r0 == 0) goto L88
            goto L8e
        L88:
            java.lang.Class<com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI> r0 = com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI.class
            r14.setClass(r13, r0)
            goto L93
        L8e:
            java.lang.Class<com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceWithAffinityUI> r0 = com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceWithAffinityUI.class
            r14.setClass(r13, r0)
        L93:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r14)
            java.util.Collections.reverse(r0)
            java.lang.Object[] r5 = r0.toArray()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter"
            java.lang.String r7 = "enterLiveEntranceUI"
            java.lang.String r8 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r13
            yj0.a.d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r14 = r0.get(r3)
            android.content.Intent r14 = (android.content.Intent) r14
            r13.startActivity(r14)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter"
            java.lang.String r2 = "enterLiveEntranceUI"
            java.lang.String r3 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r13
            yj0.a.f(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.s.wi(android.content.Context, android.content.Intent):void");
    }
}
