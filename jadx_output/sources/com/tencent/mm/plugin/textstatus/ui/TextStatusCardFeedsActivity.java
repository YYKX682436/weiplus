package com.tencent.mm.plugin.textstatus.ui;

@db5.a(4131)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/h4", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class TextStatusCardFeedsActivity extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.ui.h4 f173478o = new com.tencent.mm.plugin.textstatus.ui.h4(null);

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.LinkedList f173479p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public static boolean f173480q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$Companion$updateListener$1 f173481r;

    /* renamed from: e, reason: collision with root package name */
    public boolean f173483e;

    /* renamed from: m, reason: collision with root package name */
    public ij4.i f173488m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f173482d = "SCENE_DEFAULT";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f173484f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f173485g = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.v4(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f173486h = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.e5(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f173487i = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.h5(this));

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.i4 f173489n = new com.tencent.mm.plugin.textstatus.ui.i4(this);

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$Companion$updateListener$1] */
    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f173481r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusSquareUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$Companion$updateListener$1
            {
                this.__eventId = -2021918734;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusSquareUpdateEvent statusSquareUpdateEvent) {
                com.tencent.mm.autogen.events.StatusSquareUpdateEvent event = statusSquareUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173480q = true;
                return true;
            }
        };
    }

    public java.util.ArrayList V6(java.util.Collection preDataItemList, java.lang.String str) {
        kotlin.jvm.internal.o.g(preDataItemList, "preDataItemList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = preDataItemList.iterator();
        while (it.hasNext()) {
            arrayList.add(new jj4.b(kz5.n0.V0((java.util.Collection) it.next())));
        }
        arrayList.add(new ij4.a());
        return arrayList;
    }

    public final android.widget.ImageView W6() {
        java.lang.Object value = ((jz5.n) this.f173485g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    public android.graphics.drawable.Drawable X6() {
        android.graphics.drawable.Drawable i17 = i65.a.i(getContext(), com.tencent.mm.R.drawable.f480763c5);
        kotlin.jvm.internal.o.f(i17, "getDrawable(...)");
        return i17;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView Y6() {
        java.lang.Object value = ((jz5.n) this.f173486h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    public final void Z6() {
        ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173784r = false;
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC textStatusCardFeedUIC = (com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class);
        com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent statusCardFeedItemScrollEvent = textStatusCardFeedUIC.B;
        if (statusCardFeedItemScrollEvent != null) {
            statusCardFeedItemScrollEvent.e();
        }
        textStatusCardFeedUIC.B = null;
        if (bi4.v1.i()) {
            com.tencent.mm.autogen.events.StatusExpandMiniCardEvent statusExpandMiniCardEvent = textStatusCardFeedUIC.C;
            if (statusExpandMiniCardEvent != null) {
                statusExpandMiniCardEvent.e();
            }
            textStatusCardFeedUIC.C = null;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hxz);
        if (findViewById != null) {
            findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478515x));
        }
    }

    public boolean a7() {
        return kotlin.jvm.internal.o.b(this.f173482d, "SCENE_DEFAULT");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_SCROLL_USER_NAME", ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173776g);
        intent.putExtra("VALUE_EXIT_HAS_GO_EDIT", f173480q);
        setResult(-1, intent);
        com.tencent.mm.autogen.events.StatusExpandMiniCardEvent statusExpandMiniCardEvent = new com.tencent.mm.autogen.events.StatusExpandMiniCardEvent();
        statusExpandMiniCardEvent.f54865g.f8226a = ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173777h;
        statusExpandMiniCardEvent.e();
        if (((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).S6()) {
            if (!(bi4.v1.i() && kotlin.jvm.internal.o.b(this.f173482d, "SCENE_HISTORY_FEED"))) {
                java.lang.Object value = ((jz5.n) this.f173487i).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                android.view.View view = (android.view.View) value;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.lang.String stringExtra = getIntent().getStringExtra("KEY_EXIT_CARD_ANIM_STYLE");
                if (kotlin.jvm.internal.o.b(stringExtra, "VALUE_EXIT_CARD_ANIM_AVATAR_STYLE")) {
                    com.tencent.mm.plugin.textstatus.ui.j4 j4Var = new com.tencent.mm.plugin.textstatus.ui.j4(this);
                    W6().setVisibility(0);
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(W6(), getIntent().getStringExtra("KEY_USER_NAME"), 0.0f);
                    int intExtra = getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1);
                    int intExtra2 = getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1);
                    if (intExtra == -1 || intExtra2 == -1) {
                        return;
                    }
                    android.view.View contentView = getContentView();
                    if (contentView != null) {
                        contentView.setClipToOutline(true);
                    }
                    contentView.setTranslationX(0.0f);
                    contentView.setTranslationY(0.0f);
                    W6().setAlpha(0.0f);
                    int h17 = i65.a.h(this, com.tencent.mm.R.dimen.f479718db);
                    int h18 = i65.a.h(this, com.tencent.mm.R.dimen.f479718db);
                    contentView.setPivotX(0.0f);
                    contentView.setPivotY(0.0f);
                    android.view.ViewPropertyAnimator translationY = contentView.animate().translationX(intExtra).translationY(intExtra2);
                    translationY.setDuration(200L);
                    translationY.start();
                    translationY.setUpdateListener(new com.tencent.mm.plugin.textstatus.ui.q4(contentView, h18, h18, this, h17));
                    translationY.setListener(new com.tencent.mm.plugin.textstatus.ui.r4(j4Var));
                    return;
                }
                if (!kotlin.jvm.internal.o.b(stringExtra, "VALUE_EXIT_CARD_ANIM_CARD_STYLE")) {
                    super.finish();
                    overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
                    return;
                }
                com.tencent.mm.plugin.textstatus.ui.k4 k4Var = new com.tencent.mm.plugin.textstatus.ui.k4(this);
                int intExtra3 = getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1);
                int intExtra4 = getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1);
                if (intExtra3 == -1 || intExtra4 == -1) {
                    return;
                }
                android.view.View contentView2 = getContentView();
                if (contentView2 != null) {
                    contentView2.setClipToOutline(true);
                }
                contentView2.setTranslationX(0.0f);
                contentView2.setTranslationY(0.0f);
                W6().setAlpha(0.0f);
                int h19 = i65.a.h(this, com.tencent.mm.R.dimen.f479738dv);
                int h27 = i65.a.h(this, com.tencent.mm.R.dimen.f479675cc);
                int h28 = i65.a.h(this, com.tencent.mm.R.dimen.f479682ak4);
                contentView2.setPivotX(0.0f);
                contentView2.setPivotY(0.0f);
                android.view.ViewPropertyAnimator translationY2 = contentView2.animate().translationX(intExtra3).translationY(intExtra4);
                translationY2.setDuration(200L);
                translationY2.start();
                translationY2.setUpdateListener(new com.tencent.mm.plugin.textstatus.ui.t4(contentView2, h27, h28, h19));
                translationY2.setListener(new com.tencent.mm.plugin.textstatus.ui.u4(k4Var));
                return;
            }
        }
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.m8u;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cym;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        try {
            int i17 = ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173781o;
            com.tencent.mm.plugin.textstatus.ui.ac acVar = (com.tencent.mm.plugin.textstatus.ui.ac) component(com.tencent.mm.plugin.textstatus.ui.ac.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList linkedList = f173479p;
            synchronized (linkedList) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new jj4.b((java.util.LinkedList) it.next()));
                }
            }
            arrayList.add(new ij4.a());
            acVar.f173728f = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$buildItemConverts$1(this, this.f173482d, a7()), arrayList, false);
            Y6().setAdapter(acVar.f173728f);
            com.tencent.mm.view.recyclerview.WxRecyclerView Y6 = Y6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(Y6, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
            Y6.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(Y6, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
            Y6().post(new com.tencent.mm.plugin.textstatus.ui.w4(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusCardFeedsActivity", th6, "onConfigurationChanged err", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        pj4.p0 p0Var;
        com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$Companion$updateListener$1 textStatusCardFeedsActivity$Companion$updateListener$1;
        java.lang.Object obj;
        boolean z17 = !(this instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusProfileCardFeedActivity);
        if (z17) {
            o25.n1.f(this);
        }
        super.onCreate(bundle);
        setActionbarColor(0);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FROM_SCENE");
        if (stringExtra == null) {
            stringExtra = "SCENE_DEFAULT";
        }
        this.f173482d = stringExtra;
        if (z17) {
            getWindow().getDecorView().setSystemUiVisibility(1792);
            vj5.o.e(getWindow());
            setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        setBackBtn(new com.tencent.mm.plugin.textstatus.ui.x4(this));
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_USER_NAME");
        int intExtra = getIntent().getIntExtra("KEY_SCROLL_INDEX", -1);
        java.lang.String stringExtra3 = getIntent().getStringExtra("KEY_SCROLL_STATUS_ID");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        java.lang.String stringExtra4 = getIntent().getStringExtra("KEY_FROM_SCENE");
        if (stringExtra4 == null) {
            stringExtra4 = "SCENE_DEFAULT";
        }
        this.f173482d = stringExtra4;
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(this).a(com.tencent.mm.plugin.textstatus.ui.ac.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.textstatus.ui.ac acVar = (com.tencent.mm.plugin.textstatus.ui.ac) a17;
        java.util.LinkedList linkedList = f173479p;
        java.util.ArrayList V6 = V6(linkedList, stringExtra2);
        kotlin.jvm.internal.o.g(V6, "<set-?>");
        acVar.f173730h = V6;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onCreate scene=" + this.f173482d + ", scrollIndex=" + intExtra + " size:" + V6.size());
        if (kotlin.jvm.internal.o.b(this.f173482d, "SCENE_DEFAULT") || kotlin.jvm.internal.o.b(this.f173482d, "SCENE_HISTORY_FEED")) {
            bk4.d1.f21453b = false;
            bk4.d1.f21454c = ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).wi();
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "initShowTingFloatBall show: " + bk4.d1.f21454c);
            gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
            if (Bi != null) {
                Bi.a0(64, bk4.d1.f21455d);
            }
        }
        Y6().setBackground(X6());
        Y6().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
        java.lang.Object bounceView = getBounceView();
        if (bounceView != null) {
            ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).c(new com.tencent.mm.plugin.textstatus.ui.y4(this));
        }
        acVar.f173728f = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$buildItemConverts$1(this, this.f173482d, a7()), V6, false);
        if (kotlin.jvm.internal.o.b(this.f173482d, "SCENE_HISTORY_FEED")) {
            Y6().i(new com.tencent.mm.plugin.textstatus.ui.z4(this));
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((com.tencent.mm.plugin.textstatus.ui.ac) zVar.a(context).a(com.tencent.mm.plugin.textstatus.ui.ac.class)).O6(false);
        }
        if (str.length() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onCreate: dataSize=" + acVar.f173730h.size() + ", scrollStatusId=" + str);
            java.util.Iterator it = acVar.f173730h.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i18 = i17 + 1;
                in5.c cVar = (in5.c) it.next();
                if (cVar instanceof jj4.b) {
                    java.util.Iterator it6 = ((jj4.b) cVar).f300029d.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj = it6.next();
                            if (kotlin.jvm.internal.o.b(((mj4.k) ((mj4.h) obj)).l(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (obj != null) {
                        com.tencent.mm.view.recyclerview.WxRecyclerView Y6 = Y6();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(i17));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(Y6, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                        Y6.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(Y6, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "scrollToPosition: " + i17);
                        break;
                    }
                }
                i17 = i18;
            }
        } else if (intExtra != -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "scrollToPosition: index=" + intExtra);
            com.tencent.mm.view.recyclerview.WxRecyclerView Y62 = Y6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(intExtra));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(Y62, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
            Y62.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(Y62, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
        } else {
            int i19 = 0;
            for (java.lang.Object obj2 : V6) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                in5.c cVar2 = (in5.c) obj2;
                if (cVar2 instanceof jj4.b) {
                    mj4.h hVar = (mj4.h) kz5.n0.a0(((jj4.b) cVar2).f300029d, 0);
                    if (kotlin.jvm.internal.o.b(hVar != null ? ((mj4.k) hVar).o() : null, stringExtra2)) {
                        com.tencent.mm.view.recyclerview.WxRecyclerView Y63 = Y6();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(java.lang.Integer.valueOf(i19));
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(Y63, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                        Y63.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(Y63, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
                i19 = i27;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "prepareStart: dataSize=" + acVar.f173727e.size() + " => itemsSnapShot size=" + linkedList.size());
        }
        ij4.i iVar = new ij4.i(false, 1, null);
        iVar.b(Y6());
        iVar.f330826n = new com.tencent.mm.plugin.textstatus.ui.a5(this);
        iVar.f330827o = new com.tencent.mm.plugin.textstatus.ui.b5();
        iVar.f330828p = new com.tencent.mm.plugin.textstatus.ui.c5();
        Y6().post(new com.tencent.mm.plugin.textstatus.ui.d5(iVar));
        iVar.f330821i = 20.0f;
        this.f173488m = iVar;
        Y6().setAdapter(acVar.f173728f);
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(pj4.p0.class, 9, true));
        pj4.p0 p0Var2 = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 9, pj4.p0.class);
        if (p0Var2 != null) {
            try {
                p0Var = (pj4.p0) ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).wi(9, "TextStatusCardExposed");
            } catch (java.lang.Throwable unused) {
                p0Var = null;
            }
            p0Var2.f355236d = p0Var != null ? p0Var.f355236d : null;
        }
        if (kotlin.jvm.internal.o.b(this.f173482d, "SCENE_DEFAULT")) {
            ((uj4.m) component(uj4.m.class)).P6((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.hxz), stringExtra2);
        }
        if (((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).S6()) {
            getContentView().setScaleX(0.0f);
            getContentView().setScaleY(0.0f);
        } else {
            getContentView().postDelayed(new com.tencent.mm.plugin.textstatus.ui.l4(this), 300L);
        }
        ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173784r = true;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TextStatusCardFeedsActivity);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, getClass().getSimpleName());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.TextState);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 28809);
        java.util.ArrayList arrayList4 = this.f173484f;
        arrayList4.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_LIKE_LIST_STATUS_ID");
        if (stringArrayListExtra != null && stringArrayListExtra.size() != 0) {
            arrayList4.addAll(stringArrayListExtra);
        }
        if (!bi4.v1.i() || (textStatusCardFeedsActivity$Companion$updateListener$1 = f173481r) == null) {
            return;
        }
        textStatusCardFeedsActivity$Companion$updateListener$1.alive();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity$Companion$updateListener$1 textStatusCardFeedsActivity$Companion$updateListener$1;
        super.onDestroy();
        if (kotlin.jvm.internal.o.b(this.f173482d, "SCENE_DEFAULT") || kotlin.jvm.internal.o.b(this.f173482d, "SCENE_HISTORY_FEED")) {
            bk4.d1 d1Var = bk4.d1.f21452a;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "markShouldShowTingFloatBall show: true");
            bk4.d1.f21453b = true;
            if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).fj()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onDestroy current task is playing");
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "setTingFloatBallState show: true");
                bk4.d1.f21454c = true;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onDestroy current task is not playing");
            }
            d1Var.a(true);
            gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
            if (Bi != null) {
                Bi.L(64, bk4.d1.f21455d);
            }
        }
        if (!bi4.v1.i() || (textStatusCardFeedsActivity$Companion$updateListener$1 = f173481r) == null) {
            return;
        }
        textStatusCardFeedsActivity$Companion$updateListener$1.dead();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        setRequestedOrientation(1);
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.textstatus.ui.ac.class);
        set.add(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class);
        set.add(qj4.i.class);
        set.add(uj4.m.class);
    }
}
