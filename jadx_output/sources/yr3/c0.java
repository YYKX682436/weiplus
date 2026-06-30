package yr3;

/* loaded from: classes11.dex */
public final class c0 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yr3.e0 f464736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.u5 f464737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f464738c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget f464739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget f464740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f464741f;

    public c0(yr3.e0 e0Var, r45.u5 u5Var, android.widget.TextView textView, com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget, com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget2, android.widget.TextView textView2) {
        this.f464736a = e0Var;
        this.f464737b = u5Var;
        this.f464738c = textView;
        this.f464739d = finderLiveOnliveWidget;
        this.f464740e = finderLiveOnliveWidget2;
        this.f464741f = textView2;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        yr3.e0 e0Var = this.f464736a;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i(e0Var.f464785e, "query fail, liveId = 0");
        }
        r45.u5 u5Var = this.f464737b;
        if (!u5Var.f387031f.equals(this.f464738c.getTag(com.tencent.mm.R.id.bph))) {
            com.tencent.mars.xlog.Log.i(e0Var.f464785e, "recycled");
            return;
        }
        if (obj != null && (obj instanceof r45.l71)) {
            r45.l71 l71Var = (r45.l71) obj;
            if (((r45.nw1) l71Var.getCustom(1)) != null) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).A(u5Var.f387031f, (r45.nw1) l71Var.getCustom(1));
                eq1.h hVar = eq1.h.f255812a;
                r45.nw1 nw1Var = (r45.nw1) l71Var.getCustom(1);
                com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget liveOnIcon = this.f464739d;
                kotlin.jvm.internal.o.f(liveOnIcon, "$liveOnIcon");
                com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget liveEndIcon = this.f464740e;
                kotlin.jvm.internal.o.f(liveEndIcon, "$liveEndIcon");
                hVar.j(nw1Var, liveOnIcon, liveEndIcon);
            }
        }
        java.lang.String str = "";
        if (obj != null && (obj instanceof r45.l71)) {
            r45.l71 l71Var2 = (r45.l71) obj;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l71Var2.getString(4))) {
                str = l71Var2.getString(4);
                kotlin.jvm.internal.o.d(str);
            }
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.widget.TextView textView = this.f464741f;
        if (K0) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }
}
