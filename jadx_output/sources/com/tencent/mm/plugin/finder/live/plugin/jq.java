package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jq implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.gq f113154p = new com.tencent.mm.plugin.finder.live.plugin.gq(null);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f113155d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f113156e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f113157f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f113158g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f113159h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f113160i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f113161m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f113162n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f113163o;

    public jq(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113155d = context;
        this.f113156e = buContext;
        this.f113157f = statusMonitor;
        this.f113158g = lVar;
        this.f113159h = tVar;
        this.f113160i = "FinderLiveH5HalfBubble";
        this.f113161m = "PORTRAIT_ACTIONFinderLiveH5HalfBubble";
        this.f113162n = "PORTRAIT_ACTION_BUNDLE_OPEN_HALF_H5_INFO";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.asj, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f113163o = (android.view.ViewGroup) inflate;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f113159h;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = null;
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (kotlin.jvm.internal.o.b(string, this.f113161m)) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            byte[] byteArray = bundle2 != null ? bundle2.getByteArray(this.f113162n) : null;
            if (byteArray != null) {
                try {
                    finderJumpInfo2.parseFrom(byteArray);
                    finderJumpInfo = finderJumpInfo2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            if (finderJumpInfo != null) {
                f113154p.a(this.f113155d, finderJumpInfo);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void a(cm2.v vVar) {
        android.view.ViewGroup viewGroup = this.f113163o;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f47);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        java.lang.String str = vVar.f43402w;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f484672f44);
        java.lang.String str2 = vVar.f43403x;
        textView2.setText(str2 != null ? str2 : "");
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f484673f45);
        java.lang.String str3 = vVar.f43405z;
        if (str3 == null || str3.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(str3);
            textView3.setVisibility(0);
        }
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.eqy);
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(vVar.f43404y, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.f484674f46);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        a17.c((android.widget.ImageView) findViewById2);
        if (zl2.r4.f473950a.y1(this.f113156e)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.hq(this, vVar));
        }
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.iq(this, vVar));
        } else {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.v) {
            a((cm2.v) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f113163o;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.v) {
            cm2.v vVar = (cm2.v) data;
            a(vVar);
            bf2.c.c(bf2.c.f19598a, this.f113156e, 1, 8, vVar.A, 0, null, 0, 0, null, 0, 1008, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.f484671f43;
    }
}
