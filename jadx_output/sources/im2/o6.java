package im2;

/* loaded from: classes3.dex */
public final class o6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292468d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f292469e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.viewmodel.e4 f292470f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f292471g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.no0 f292472h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f292473i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f292474m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f292475n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f292476o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f292468d = "FinderLiveVisitorEndPageUIC";
        this.f292470f = new com.tencent.mm.plugin.finder.live.viewmodel.e4();
        this.f292471g = jz5.h.b(im2.n6.f292459d);
        this.f292476o = true;
    }

    public final so2.v2 O6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((im2.i6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.i6.class)).f292393e;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dtj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x016a, code lost:
    
        if ((r1 - r5 > ((long) java.lang.Math.max(r0.f233973g, 30000))) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.o6.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f292468d, "destryo, curpage = " + this.f292472h);
        com.tencent.mm.plugin.finder.live.plugin.no0 no0Var = this.f292472h;
        if (no0Var != null) {
            no0Var.e();
        }
        com.tencent.mm.sdk.event.IListener iListener = this.f292474m;
        if (iListener != null) {
            iListener.dead();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        if (this.f292475n) {
            com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent finderLiveSquareStatusEvent = new com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent();
            finderLiveSquareStatusEvent.f54294g.f8449a = 5L;
            finderLiveSquareStatusEvent.e();
        } else {
            com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent finderLiveScrollSquareStatusEvent = new com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent();
            am.ub ubVar = finderLiveScrollSquareStatusEvent.f54290g;
            ubVar.f8070a = 2L;
            ubVar.f8071b = true;
            finderLiveScrollSquareStatusEvent.e();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.finder.live.plugin.no0 no0Var = this.f292472h;
        if (no0Var != null) {
            no0Var.c();
        }
        ml2.b1.a(ml2.b1.f327211a, java.lang.String.valueOf(hashCode()), null, 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.live.plugin.no0 no0Var = this.f292472h;
        if (no0Var != null) {
            no0Var.d();
        }
        ml2.b1.a(ml2.b1.f327211a, java.lang.String.valueOf(hashCode()), null, 2, null);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        java.lang.String valueOf = java.lang.String.valueOf(hashCode());
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r0Var.Jj(valueOf, ((im2.i6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.i6.class)).f292393e.f410659n.getLong(0));
    }
}
