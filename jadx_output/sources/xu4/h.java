package xu4;

/* loaded from: classes.dex */
public final class h extends aw4.y {

    /* renamed from: i, reason: collision with root package name */
    public su4.m1 f457288i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yu4.p uiComponent) {
        super(uiComponent);
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
        gm0.j1.d().a(4614, this);
        gm0.j1.d().a(4384, this);
    }

    @Override // aw4.y
    public void e() {
        super.e();
        gm0.j1.d().q(4614, this);
        gm0.j1.d().q(4384, this);
    }

    @Override // aw4.y
    public void h(java.lang.String paramStr) {
        kotlin.jvm.internal.o.g(paramStr, "paramStr");
        org.json.JSONObject jSONObject = new org.json.JSONObject(paramStr);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            kotlin.jvm.internal.o.d(next);
            hashMap.put(next, jSONObject.opt(next));
        }
        gm0.j1.d().g(new su4.k1(g(hashMap)));
    }

    @Override // aw4.y
    public java.util.List i() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.x50 x50Var = new r45.x50();
        x50Var.f389788d = "emojiRecPersonalization";
        x50Var.f389789e = ((com.tencent.mm.storage.h5) ((com.tencent.mm.feature.emoji.api.c6) i95.n0.c(com.tencent.mm.feature.emoji.api.c6.class))).Ai() ? 1L : 0L;
        linkedList.add(x50Var);
        return linkedList;
    }

    public final yu4.p k() {
        aw4.q qVar = this.f14844d;
        kotlin.jvm.internal.o.e(qVar, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.emojisearch.ui.IEmojiSearchUIComponent");
        return (yu4.p) qVar;
    }

    @Override // aw4.y, aw4.a, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.sn3 sn3Var;
        boolean z17;
        super.onSceneEnd(i17, i18, str, m1Var);
        jz5.f0 f0Var = null;
        if (!(m1Var instanceof su4.k1)) {
            if (m1Var instanceof su4.m1) {
                su4.m1 m1Var2 = (su4.m1) m1Var;
                if (m1Var2.f413010h == a() && kotlin.jvm.internal.o.b(m1Var, this.f457288i)) {
                    if (i17 == 0 && i18 == 0 && (sn3Var = m1Var2.f413009g) != null) {
                        k().O2(sn3Var, m1Var2.f413008f.f385027i);
                    }
                    this.f457288i = null;
                    return;
                }
                return;
            }
            return;
        }
        su4.k1 k1Var = (su4.k1) m1Var;
        if (k1Var.f412977g.f413077q == a()) {
            if (i17 != 0 || i18 != 0) {
                xu4.d b17 = k().b();
                if (b17 != null) {
                    su4.r1 r1Var = k1Var.f412977g;
                    z17 = r1Var.f413063c == 0;
                    java.lang.String requestId = r1Var.f413085y;
                    kotlin.jvm.internal.o.f(requestId, "requestId");
                    b17.q(z17, "{\"ret\":-1}", requestId);
                    return;
                }
                return;
            }
            r45.aa7 aa7Var = k1Var.f412976f;
            if (aa7Var != null) {
                xu4.d b18 = k().b();
                if (b18 != null) {
                    su4.r1 r1Var2 = k1Var.f412977g;
                    boolean z18 = r1Var2.f413063c == 0;
                    java.lang.String str2 = aa7Var.f369877f;
                    if (str2 == null) {
                        str2 = "{}";
                    }
                    java.lang.String requestId2 = r1Var2.f413085y;
                    kotlin.jvm.internal.o.f(requestId2, "requestId");
                    b18.q(z18, str2, requestId2);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var != null) {
                    return;
                }
            }
            xu4.d b19 = k().b();
            if (b19 != null) {
                su4.r1 r1Var3 = k1Var.f412977g;
                z17 = r1Var3.f413063c == 0;
                java.lang.String requestId3 = r1Var3.f413085y;
                kotlin.jvm.internal.o.f(requestId3, "requestId");
                b19.q(z17, "{\"ret\":-1}", requestId3);
            }
        }
    }
}
