package vn2;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f438316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader f438318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f438319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f438320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f438321i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z17, android.content.Context context, com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader, ym5.q1 q1Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f438316d = z17;
        this.f438317e = context;
        this.f438318f = megaVideoFlowLoader;
        this.f438319g = q1Var;
        this.f438320h = h0Var;
        this.f438321i = baseFinderFeed;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18;
        int i19;
        ym5.q1 q1Var;
        ym5.q1 q1Var2;
        if (this.f438316d) {
            android.content.Context context = this.f438317e;
            if (context instanceof android.app.Activity) {
                vn2.u0.f438387a.c((android.app.Activity) context);
            }
        }
        java.util.ArrayList dataListJustForAdapter = this.f438318f.getDataListJustForAdapter();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f438321i;
        synchronized (dataListJustForAdapter) {
            java.util.Iterator it = dataListJustForAdapter.iterator();
            i17 = 0;
            i18 = 0;
            while (true) {
                i19 = -1;
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                so2.j5 j5Var = (so2.j5) it.next();
                if ((j5Var instanceof zn2.a) && j5Var.getItemId() == baseFinderFeed.getItemId()) {
                    break;
                }
                i18++;
            }
        }
        if (i18 > 0 && (q1Var2 = this.f438319g) != null) {
            q1Var2.onItemRangeChanged(i18, 1, 101);
        }
        if (this.f438320h.f310123d != null) {
            this.f438318f.c().b((com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f438320h.f310123d, this.f438319g);
        } else {
            java.util.Iterator it6 = this.f438318f.getDataListJustForAdapter().iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                so2.j5 j5Var2 = (so2.j5) it6.next();
                if ((j5Var2 instanceof zn2.d) || (j5Var2 instanceof zn2.c)) {
                    i19 = i27;
                    break;
                }
                i27++;
            }
            java.util.List i28 = kz5.c0.i(java.lang.Boolean.valueOf(pm0.v.b0(this.f438318f.getDataListJustForAdapter(), vn2.k0.f438314d)), java.lang.Boolean.valueOf(pm0.v.b0(this.f438318f.getDataListJustForAdapter(), vn2.j0.f438313d)));
            if (!i28.isEmpty()) {
                java.util.Iterator it7 = i28.iterator();
                while (it7.hasNext()) {
                    if (((java.lang.Boolean) it7.next()).booleanValue() && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            if (i17 > 0 && (q1Var = this.f438319g) != null) {
                q1Var.onItemRangeRemoved(i19, i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
