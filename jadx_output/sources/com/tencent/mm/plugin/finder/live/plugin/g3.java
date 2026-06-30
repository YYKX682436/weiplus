package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f112627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f112628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f112629g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, km2.b bVar, boolean z17, boolean z18, boolean z19) {
        super(2);
        this.f112626d = v3Var;
        this.f112627e = z17;
        this.f112628f = z18;
        this.f112629g = z19;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f112626d;
        if (num != null && num.intValue() == 0) {
            com.tencent.mm.plugin.finder.live.plugin.v3.x1(v3Var, 3);
            km2.b bVar = v3Var.S;
            r45.sl1 sl1Var = bVar != null ? bVar.f309071u : null;
            if (sl1Var == null) {
                com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "shouldShowAutoGenWidget:autoGenReplayOption is null, return false");
            } else {
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("FINDER_LIVE_MMKV");
                boolean z17 = sl1Var.getInteger(0) == 1 && kotlin.jvm.internal.o.b(M != null ? java.lang.Boolean.valueOf(M.getBoolean("HAS_SHOW_AUTO_GEN_REPLAY_ID", false)) : null, java.lang.Boolean.FALSE);
                sl1Var.getInteger(0);
                r1 = z17;
            }
            android.view.ViewGroup viewGroup = v3Var.f365323d;
            if (r1) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSetAutoReplayGenWidget() called with: needDanmu=");
                boolean z18 = this.f112627e;
                sb6.append(z18);
                sb6.append(", onlyMember=");
                boolean z19 = this.f112628f;
                sb6.append(z19);
                sb6.append(", genHighlight=");
                boolean z27 = this.f112629g;
                sb6.append(z27);
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
                if (v3Var.V == null) {
                    android.content.Context context = viewGroup.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    v3Var.V = new com.tencent.mm.plugin.finder.live.widget.l8(context, new com.tencent.mm.plugin.finder.live.plugin.o3(v3Var, z18, z19, z27));
                }
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "showSetAutoReplayGenWidget");
                com.tencent.mm.plugin.finder.live.widget.l8 l8Var = v3Var.V;
                if (l8Var != null) {
                    l8Var.w();
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "shouldShowAutoGenWidget returned false, skipping widget display");
            }
            java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.nun);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.content.Context context2 = viewGroup.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
        } else {
            if (str == null || str.length() == 0) {
                java.lang.String string2 = v3Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.e6x);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                android.content.Context context3 = v3Var.f365323d.getContext();
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context3);
                e4Var2.f211776c = string2;
                e4Var2.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
