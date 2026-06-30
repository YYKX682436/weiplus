package tn5;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.refreshLayout.WxRefreshLayout f420850a;

    /* renamed from: b, reason: collision with root package name */
    public sn5.b f420851b;

    /* renamed from: c, reason: collision with root package name */
    public sn5.b f420852c;

    /* renamed from: d, reason: collision with root package name */
    public mn5.b f420853d;

    public a(com.tencent.mm.view.refreshLayout.WxRefreshLayout layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f420850a = layout;
        sn5.b bVar = sn5.b.f410157p;
        this.f420851b = bVar;
        this.f420852c = bVar;
    }

    public final boolean a() {
        return this.f420851b == sn5.b.f410156o;
    }

    public final boolean b() {
        return this.f420851b == sn5.b.f410164w;
    }

    public final void c(sn5.b state) {
        kotlin.jvm.internal.o.g(state, "state");
        sn5.b bVar = this.f420851b;
        if (bVar == state) {
            if (this.f420852c != bVar) {
                this.f420852c = bVar;
                return;
            }
            return;
        }
        this.f420851b = state;
        this.f420852c = state;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f420850a;
        wxRefreshLayout.getClass();
        on5.g gVar = wxRefreshLayout.headerPlugin;
        tn5.a aVar = wxRefreshLayout.f213738h;
        if (gVar != null) {
            gVar.g(wxRefreshLayout, aVar.f420851b, state);
        }
        on5.g gVar2 = wxRefreshLayout.footerPlugin;
        if (gVar2 != null) {
            gVar2.g(wxRefreshLayout, aVar.f420851b, state);
        }
        if (state == sn5.b.f410154m) {
            wxRefreshLayout.getCValues().f330213f = false;
        }
    }

    public final void d(sn5.b state) {
        kotlin.jvm.internal.o.g(state, "state");
        sn5.b bVar = this.f420851b;
        if (bVar.f410170f && bVar.f410168d != state.f410168d) {
            c(sn5.b.f410157p);
        }
        if (this.f420852c != state) {
            this.f420852c = state;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r6.f330230w == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        if (r6.f330230w == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0110, code lost:
    
        if (r6.f330230w == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(sn5.b r6) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn5.a.e(sn5.b):void");
    }
}
