package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f117820a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.oo0 f117821b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f117822c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f117823d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f117824e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f117825f;

    /* renamed from: g, reason: collision with root package name */
    public c50.m0 f117826g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f117827h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f117828i;

    public b4(android.view.ViewGroup root, com.tencent.mm.plugin.finder.live.plugin.oo0 plugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f117820a = root;
        this.f117821b = plugin;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f484746fe4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f117822c = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.fur);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f117823d = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.rok);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f117824e = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f484819tp2);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f117825f = findViewById4;
    }

    public static final void a(r45.h32 h32Var, android.widget.TextView textView, com.tencent.mm.plugin.finder.live.widget.b4 b4Var) {
        if (h32Var.getInteger(1) == 1) {
            textView.setText(b4Var.f117820a.getContext().getResources().getString(com.tencent.mm.R.string.cs6));
            android.view.ViewGroup viewGroup = b4Var.f117820a;
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_7));
            textView.setBackground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a_5));
            return;
        }
        textView.setText(b4Var.f117820a.getContext().getResources().getString(com.tencent.mm.R.string.cs7));
        android.view.ViewGroup viewGroup2 = b4Var.f117820a;
        textView.setTextColor(viewGroup2.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        textView.setBackground(viewGroup2.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481684zz));
    }

    public final void b(com.tencent.mm.protocal.protobuf.FinderObject finderObject, ml2.x1 x1Var, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var;
        org.json.JSONObject jSONObject2;
        if (jSONObject == null) {
            jSONObject2 = new org.json.JSONObject();
            b4Var = this;
        } else {
            b4Var = this;
            jSONObject2 = jSONObject;
        }
        jSONObject2.put("liveid", pm0.v.u(b4Var.f117821b.Y().f410659n.getLong(0)));
        jSONObject2.put("exposeType", 1);
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        com.tencent.mars.xlog.Log.i("FinderLiveAfterNextLiveInfoWidget", "abel end page log, 21053, action=" + x1Var.f328220d + ", extra=" + jSONObject3);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String username = finderObject.getUsername();
        java.lang.String valueOf = java.lang.String.valueOf(finderObject.getRefObjectId());
        long refObjectId = finderObject.getRefObjectId();
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
        ml2.q1 q1Var = ml2.q1.f327812e;
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        int integer = liveInfo2 != null ? liveInfo2.getInteger(1) : -1;
        java.lang.String nickname = finderObject.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        ((b92.d1) zbVar).wi(new ml2.f0(null, username, 0, valueOf, refObjectId, j17, x1Var, "temp_30", integer, nickname, ml2.e0.f327371f, false, false, 0, null, null, jSONObject3, null, 1L, null, 0, 0L, 0, null, null, null, 66777088, null));
    }

    public final void c(int i17) {
        android.view.ViewGroup viewGroup = this.f117820a;
        viewGroup.setVisibility(i17);
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x03e4, code lost:
    
        if (r3 == null) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(r45.h32 r49, com.tencent.mm.protocal.protobuf.FinderObject r50, boolean r51, r45.l71 r52, r45.fw4 r53) {
        /*
            Method dump skipped, instructions count: 2002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.b4.d(r45.h32, com.tencent.mm.protocal.protobuf.FinderObject, boolean, r45.l71, r45.fw4):boolean");
    }
}
