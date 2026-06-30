package lr;

/* loaded from: classes15.dex */
public final class w extends lr.u {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.emoji.panel.SmileyPanelView f320596p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ lr.x f320597q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(lr.x r5, android.view.View r6) {
        /*
            r4 = this;
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.g(r6, r0)
            r4.f320597q = r5
            lr.o0 r0 = r5.f320602f
            com.tencent.mm.emoji.panel.layout.SmileyLayoutManager r1 = new com.tencent.mm.emoji.panel.layout.SmileyLayoutManager
            android.content.Context r2 = r6.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            lr.o0 r3 = r5.f320602f
            int r3 = r3.f320561b
            r1.<init>(r2, r3)
            r4.<init>(r5, r6, r0, r1)
            r0 = 2131303541(0x7f091c75, float:1.82252E38)
            android.view.View r6 = r6.findViewById(r0)
            java.lang.String r0 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r6, r0)
            com.tencent.mm.emoji.panel.SmileyPanelView r6 = (com.tencent.mm.emoji.panel.SmileyPanelView) r6
            r4.f320596p = r6
            com.tencent.mm.pluginsdk.ui.k0 r5 = r5.f320609p
            r6.setTextOperationListener(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.w.<init>(lr.x, android.view.View):void");
    }

    @Override // lr.u
    public void j(ir.t0 groupModel) {
        kotlin.jvm.internal.o.g(groupModel, "groupModel");
        super.j(groupModel);
        lr.x xVar = this.f320597q;
        com.tencent.mars.xlog.Log.i(xVar.f320605i, "smiley_log SmileyPanelGroupViewHolder onBind");
        com.tencent.mm.emoji.panel.SmileyPanelView smileyPanelView = this.f320596p;
        smileyPanelView.getClass();
        ir.h config = xVar.f320600d;
        kotlin.jvm.internal.o.g(config, "config");
        ir.h hVar = smileyPanelView.config;
        yz5.a listener = smileyPanelView.A;
        if (hVar != null) {
            kotlin.jvm.internal.o.g(listener, "listener");
            hVar.f293861t.remove(listener);
        }
        smileyPanelView.config = config;
        kotlin.jvm.internal.o.g(listener, "listener");
        config.f293861t.add(listener);
        ((kr.f) listener).invoke();
    }

    @Override // lr.u
    public void k() {
        super.k();
        com.tencent.mm.emoji.panel.SmileyPanelView smileyPanelView = this.f320596p;
        ir.h hVar = smileyPanelView.config;
        if (hVar != null) {
            yz5.a listener = smileyPanelView.A;
            kotlin.jvm.internal.o.g(listener, "listener");
            hVar.f293861t.remove(listener);
        }
    }
}
