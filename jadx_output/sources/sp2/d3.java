package sp2;

/* loaded from: classes3.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f411007a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f411008b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f411009c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f411010d;

    /* renamed from: e, reason: collision with root package name */
    public final long f411011e;

    /* renamed from: f, reason: collision with root package name */
    public final int f411012f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.f1 f411013g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment f411014h;

    /* renamed from: i, reason: collision with root package name */
    public az2.f f411015i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f411016j;

    public d3(com.tencent.mm.ui.MMActivity context, androidx.fragment.app.Fragment fragment, sp2.q qVar, android.view.View parentView, r45.qt2 contextObj, long j17, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(parentView, "parentView");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f411007a = context;
        this.f411008b = fragment;
        this.f411009c = parentView;
        this.f411010d = contextObj;
        this.f411011e = j17;
        this.f411012f = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(sp2.d3 r26, com.tencent.mm.ui.MMActivity r27, yl2.k r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.d3.a(sp2.d3, com.tencent.mm.ui.MMActivity, yl2.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(yz5.a aVar) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f411007a;
        if (!(mMActivity instanceof com.tencent.mm.ui.MMActivity)) {
            mMActivity = null;
        }
        if (mMActivity != null) {
            if (this.f411014h == null) {
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            try {
                androidx.fragment.app.i2 beginTransaction = mMActivity.getSupportFragmentManager().beginTransaction();
                com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment finderLiveChatFragment = this.f411014h;
                kotlin.jvm.internal.o.d(finderLiveChatFragment);
                beginTransaction.j(finderLiveChatFragment);
                sp2.p2 p2Var = new sp2.p2(aVar, this);
                if (beginTransaction.f11350g) {
                    throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
                }
                beginTransaction.f11351h = false;
                if (beginTransaction.f11360q == null) {
                    beginTransaction.f11360q = new java.util.ArrayList();
                }
                beginTransaction.f11360q.add(p2Var);
                sp2.r2 r2Var = new sp2.r2(mMActivity);
                if (beginTransaction.f11350g) {
                    throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
                }
                beginTransaction.f11351h = false;
                if (beginTransaction.f11360q == null) {
                    beginTransaction.f11360q = new java.util.ArrayList();
                }
                beginTransaction.f11360q.add(r2Var);
                beginTransaction.e();
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                this.f411014h = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }
    }

    public final void c(java.util.LinkedList linkedList) {
        r45.pm2 pm2Var;
        r45.wm2 wm2Var;
        if (!linkedList.isEmpty()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.X(linkedList);
            finderObject.getId();
            finderObject.getNickname();
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, wk0Var.getString(0));
            wk0Var.set(1, wk0Var.getString(1));
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            r45.qt2 qt2Var = this.f411010d;
            y74Var.set(1, java.lang.Integer.valueOf(qt2Var.getInteger(5)));
            java.lang.String nickname = finderObject.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            y74Var.set(2, nickname);
            y74Var.set(5, finderObject);
            wk0Var.set(6, y74Var);
            r45.ta4 ta4Var = new r45.ta4();
            ta4Var.set(2, finderObject.getSessionBuffer());
            java.util.LinkedList list = ta4Var.getList(20);
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            list.add(qa4Var);
            r45.dm2 object_extend = finderObject.getObject_extend();
            if (object_extend != null && (pm2Var = (r45.pm2) object_extend.getCustom(12)) != null && (wm2Var = (r45.wm2) pm2Var.getCustom(10)) != null) {
                ta4Var.set(30, new com.tencent.mm.protobuf.g(wm2Var.toByteArray()));
            }
            ta4Var.set(34, 4);
            wk0Var.set(7, ta4Var);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("main_page_position", "7");
            android.content.Intent intent = new android.content.Intent();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                java.util.Set<java.lang.String> keySet = bundle.keySet();
                java.util.Iterator<java.lang.String> it = keySet != null ? keySet.iterator() : null;
                if (it != null) {
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        jSONObject.putOpt(next, bundle.get(next));
                    }
                }
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            intent.putExtra("key_chnl_extra", jSONObject2);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).bl(java.lang.String.valueOf(qt2Var.getInteger(5)));
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String valueOf = java.lang.String.valueOf(qt2Var.getInteger(5));
            r0Var.getClass();
            kotlin.jvm.internal.o.g(valueOf, "<set-?>");
            r0Var.f327872m = valueOf;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            java.lang.String valueOf2 = java.lang.String.valueOf(qt2Var.getInteger(5));
            y4Var.getClass();
            kotlin.jvm.internal.o.g(valueOf2, "<set-?>");
            y4Var.f328286a = valueOf2;
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(this.f411007a, intent, linkedList, 0, wk0Var, null);
        }
    }

    public final void d(com.tencent.mm.ui.MMActivity mMActivity) {
        az2.f fVar = this.f411015i;
        if (fVar != null) {
            fVar.b();
        }
        az2.f a17 = az2.c.a(az2.f.f16125d, mMActivity, null, 0L, null, 10, null);
        this.f411015i = a17;
        a17.a();
        kotlinx.coroutines.f1 f1Var = this.f411013g;
        if (f1Var != null) {
            kotlinx.coroutines.p2.a(f1Var, null, 1, null);
        }
    }
}
