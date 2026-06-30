package df2;

/* loaded from: classes3.dex */
public final class o extends df2.de {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f230899p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.q50 f230900q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.gd f230901r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f230902s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f230903t;

    /* renamed from: u, reason: collision with root package name */
    public r45.f07 f230904u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230899p = "Micro.AnchorLivingWhiteListController";
        this.f230904u = r45.f07.VisibilityModeOptionStatus_Enable;
    }

    public final mm2.y6 m7() {
        return (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329078s).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x03ca, code lost:
    
        if ((r14 == null || r14.isEmpty()) != false) goto L270;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Type inference failed for: r0v19, types: [r45.f07, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.tencent.mm.protobuf.f, r45.ge2] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.tencent.mm.protobuf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n7(java.util.LinkedList r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.o.n7(java.util.LinkedList, java.lang.String):void");
    }

    public final void o7() {
        java.lang.String string = O6().getString(com.tencent.mm.R.string.ouq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.live.widget.gd gdVar = this.f230901r;
        if (gdVar == null) {
            gdVar = new com.tencent.mm.plugin.finder.live.widget.gd(O6());
            this.f230901r = gdVar;
            java.lang.Object obj = this.f291099e;
            android.view.ViewGroup viewGroup = obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null;
            if (viewGroup != null) {
                viewGroup.addView(gdVar, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
        }
        df2.m mVar = new df2.m(this);
        gdVar.setVisibility(0);
        gdVar.setAlpha(1.0f);
        com.tencent.mm.sdk.platformtools.b4 b4Var = gdVar.f118425i;
        b4Var.d();
        gdVar.f118424h.setText(string);
        gdVar.f118426m = mVar;
        b4Var.c(1000L, 1000L);
    }

    @Override // df2.de, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        super.onLiveMsg(r71Var);
        if (zl2.r4.f473950a.y1(getStore().getLiveRoomData())) {
            n7(r71Var != null ? r71Var.getList(15) : null, "onLiveMsg");
            p7(r71Var != null ? (r45.ze2) r71Var.getCustom(46) : null, "onLiveStart");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        m7().f329582f = pm0.v.z(((mm2.e1) getStore().business(mm2.e1.class)).f328988r.getInteger(37), 32768) ? 1 : 0;
        if (zl2.r4.f473950a.y1(getStore().getLiveRoomData())) {
            n7(hc1Var != null ? hc1Var.getList(9) : null, "onLiveStart");
            p7(hc1Var != null ? (r45.ze2) hc1Var.getCustom(15) : null, "onLiveStart");
        }
    }

    @Override // df2.de, if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewUnmount(pluginLayout);
        this.f230900q = null;
        com.tencent.mm.plugin.finder.live.widget.gd gdVar = this.f230901r;
        if (gdVar != null) {
            gdVar.f118425i.d();
            gdVar.f118426m = null;
        }
        this.f230901r = null;
    }

    public final void p7(r45.ze2 ze2Var, java.lang.String str) {
        java.lang.Object obj;
        r45.ze2 ze2Var2 = (r45.ze2) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329073n).getValue();
        if (ze2Var2 != null) {
            if (kotlin.jvm.internal.o.b(ze2Var2.getString(5), ze2Var != null ? ze2Var.getString(5) : null)) {
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updatePoi-");
        sb6.append(str);
        sb6.append("], data = ");
        if (ze2Var == null || (obj = pm0.b0.g(ze2Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i(this.f230899p, sb6.toString());
        ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329073n).k(ze2Var);
    }
}
