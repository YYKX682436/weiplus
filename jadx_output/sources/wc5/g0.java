package wc5;

/* loaded from: classes10.dex */
public final class g0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f444569d;

    /* renamed from: e, reason: collision with root package name */
    public cd5.c f444570e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f444571f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f444572g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.appcompat.app.AppCompatActivity baseActivity) {
        super(baseActivity);
        kotlin.jvm.internal.o.g(baseActivity, "baseActivity");
        this.f444569d = baseActivity;
        cd5.c.f40661e.getClass();
        this.f444570e = cd5.c.f40662f;
        this.f444571f = jz5.h.b(new wc5.e0(this));
        this.f444572g = jz5.h.b(new wc5.f0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryPinchZoomEnabled()) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6(com.tencent.mm.ui.chatting.history.groups.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "group"
            kotlin.jvm.internal.o.g(r3, r0)
            com.tencent.mm.ui.chatting.history.groups.q r0 = com.tencent.mm.ui.chatting.history.groups.q.f201782f
            boolean r3 = kotlin.jvm.internal.o.b(r3, r0)
            if (r3 == 0) goto L1e
            j62.e r3 = j62.e.g()
            com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryPinchZoomEnabled r0 = new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryPinchZoomEnabled
            r0.<init>()
            int r3 = r3.c(r0)
            r0 = 1
            if (r3 != r0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            jz5.g r3 = r2.f444572g
            r1 = r3
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            sl5.g r1 = (sl5.g) r1
            r1.f409307d = r0
            r1.a()
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            sl5.g r3 = (sl5.g) r3
            r3.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wc5.g0.T6(com.tencent.mm.ui.chatting.history.groups.g):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        sl5.g gVar = (sl5.g) ((jz5.n) this.f444572g).getValue();
        tl5.s sVar = gVar.f409306c;
        if (sVar.f420387c != tl5.l.f420369d) {
            sVar.a(false);
        }
        ((cd5.a) gVar.f409304a).c().U0(gVar.f409310g);
    }
}
