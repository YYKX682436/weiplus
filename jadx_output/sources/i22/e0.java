package i22;

/* loaded from: classes15.dex */
public final class e0 extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f287955f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f287956g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f287957h;

    /* renamed from: i, reason: collision with root package name */
    public final int f287958i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(android.content.Context r1, android.view.View r2, i22.o0 r3, yz5.a r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r0 = this;
            r4 = r5 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.o.g(r1, r4)
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.o.g(r2, r4)
            r0.<init>(r2, r3)
            java.lang.String r3 = "MicroMsg.EmojiStoreV3SingleProductHolder"
            r0.f287955f = r3
            r3 = 2131310917(0x7f093945, float:1.824016E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f287956g = r3
            r3 = 2131310952(0x7f093968, float:1.824023E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f287957h = r2
            r2 = 2131166924(0x7f0706cc, float:1.7948107E38)
            int r1 = i65.a.h(r1, r2)
            r0.f287958i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i22.e0.<init>(android.content.Context, android.view.View, i22.o0, yz5.a, int, kotlin.jvm.internal.i):void");
    }

    @Override // i22.m
    public void i(i22.n0 dataItem, java.util.List payloads) {
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.i(dataItem, payloads);
        i22.c1 c1Var = dataItem instanceof i22.c1 ? (i22.c1) dataItem : null;
        r45.ri0 ri0Var = c1Var != null ? c1Var.f287952a : null;
        java.lang.String str = this.f287955f;
        if (ri0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "onBind Failed, EmojiInfo null");
            return;
        }
        this.f287957h.setText(ri0Var.f384901v);
        android.widget.ImageView imageView = this.f287956g;
        imageView.setImageResource(com.tencent.mm.R.drawable.emoji_download_icon);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(ri0Var.f384888f);
        int i17 = this.f287958i;
        if (!K0) {
            java.lang.String d17 = rr.s.f399149a.d(ri0Var.f384886d);
            n11.a b17 = n11.a.b();
            java.lang.String str2 = ri0Var.f384888f;
            b17.h(str2, imageView, y12.f.a(str2, d17, i17, new java.lang.Object[0]));
            imageView.setImportantForAccessibility(1);
            imageView.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.bvt));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(ri0Var.f384887e)) {
            imageView.setImportantForAccessibility(4);
            com.tencent.mars.xlog.Log.w(str, "this emoji has no thumb url and url. download faild");
            return;
        }
        java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", ri0Var.f384886d);
        n11.a Di = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Di();
        java.lang.String str3 = ri0Var.f384887e;
        Di.h(str3, imageView, y12.f.a(str3, p17, i17, new java.lang.Object[0]));
        imageView.setImportantForAccessibility(1);
        imageView.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.bvt));
    }
}
