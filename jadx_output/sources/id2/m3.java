package id2;

/* loaded from: classes.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f290668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f290669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km2.b f290670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f290671i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f290672m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f290673n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290674o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(id2.u3 u3Var, android.content.Context context, long j17, long j18, km2.b bVar, boolean z17, boolean z18, boolean z19, yz5.l lVar) {
        super(2);
        this.f290666d = u3Var;
        this.f290667e = context;
        this.f290668f = j17;
        this.f290669g = j18;
        this.f290670h = bVar;
        this.f290671i = z17;
        this.f290672m = z18;
        this.f290673n = z19;
        this.f290674o = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l lVar;
        int i17;
        java.lang.Boolean bool;
        int i18;
        boolean z17;
        android.content.Context context;
        id2.u3 u3Var;
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.String str = (java.lang.String) obj2;
        yz5.l lVar2 = this.f290674o;
        android.content.Context context2 = this.f290667e;
        id2.u3 u3Var2 = this.f290666d;
        if (num != null && num.intValue() == 0) {
            android.content.Context context3 = this.f290667e;
            long j17 = this.f290668f;
            long j18 = this.f290669g;
            boolean z18 = this.f290671i;
            boolean z19 = this.f290672m;
            boolean z27 = this.f290673n;
            u3Var2.getClass();
            r45.sl1 sl1Var = this.f290670h.f309071u;
            if (sl1Var == null) {
                com.tencent.mars.xlog.Log.e("FinderLivePersonalCente", "shouldShowAutoGenWidget:autoGenReplayOption is null, return false");
                lVar = lVar2;
                z17 = false;
            } else {
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("FINDER_LIVE_MMKV");
                if (M != null) {
                    lVar = lVar2;
                    i17 = 0;
                    bool = java.lang.Boolean.valueOf(M.getBoolean("HAS_SHOW_AUTO_GEN_REPLAY_ID", false));
                } else {
                    lVar = lVar2;
                    i17 = 0;
                    bool = null;
                }
                int integer = sl1Var.getInteger(i17);
                boolean z28 = true;
                if (integer == 1 && kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
                    i18 = 0;
                } else {
                    i18 = 0;
                    z28 = false;
                }
                sl1Var.getInteger(i18);
                z17 = z28;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "showSetAutoReplayGenWidget() called with: needDanmu=" + z18 + ", onlyMember=" + z19 + ", genHighlight=" + z27);
                context = context2;
                u3Var = u3Var2;
                u3Var.f290824i = new com.tencent.mm.plugin.finder.live.widget.l8(context3, new id2.t3(u3Var2, context3, j17, j18, z18, z19, z27));
                com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "showSetAutoReplayGenWidget");
                com.tencent.mm.plugin.finder.live.widget.l8 l8Var = u3Var.f290824i;
                if (l8Var != null) {
                    l8Var.w();
                }
            } else {
                com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "shouldShowAutoGenWidget returned false, skipping widget display");
                context = context2;
                u3Var = u3Var2;
            }
            java.lang.String string = u3Var.getContext().getResources().getString(com.tencent.mm.R.string.nun);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
            lVar.invoke(java.lang.Boolean.TRUE);
        } else {
            if (str == null || str.length() == 0) {
                java.lang.String string2 = u3Var2.getContext().getResources().getString(com.tencent.mm.R.string.e6x);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var2.f211776c = string2;
                e4Var2.c();
            } else {
                int i28 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var3.f211776c = str;
                e4Var3.c();
            }
            lVar2.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
