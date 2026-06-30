package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c40 implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.y30 f112107m = new com.tencent.mm.plugin.finder.live.plugin.y30(null);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f112108d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f112109e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f112110f;

    /* renamed from: g, reason: collision with root package name */
    public final cm2.t f112111g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f112112h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f112113i;

    public c40(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112108d = context;
        this.f112109e = buContext;
        this.f112110f = statusMonitor;
        this.f112111g = tVar;
        this.f112112h = "FinderLiveOtherBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.aws, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f112113i = (android.view.ViewGroup) inflate;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f112111g;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", "POST_PORTRAIT")) {
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            if (bundle2 != null) {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                finderJumpInfo.parseFrom(bundle2.getByteArray("POST_PORTRAIT_DATA"));
                f112107m.a(this.f112108d, new cm2.b0(finderJumpInfo, bundle2.getInt("POST_PORTRAIT_DATA_TYPE")));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(cm2.b0 r17) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.c40.a(cm2.b0):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.b0) {
            a((cm2.b0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f112113i;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.b0) {
            cm2.b0 b0Var = (cm2.b0) data;
            a(b0Var);
            java.lang.Integer g17 = b0Var.g();
            if (g17 != null) {
                int intValue = g17.intValue();
                bf2.c cVar = bf2.c.f19598a;
                gk2.e eVar = this.f112109e;
                java.lang.String jump_id = b0Var.f43331v.getJump_id();
                if (jump_id == null) {
                    jump_id = "";
                }
                bf2.c.c(cVar, eVar, 1, intValue, jump_id, 0, null, 0, 0, null, 0, 1008, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
