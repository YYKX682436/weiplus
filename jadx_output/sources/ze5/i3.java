package ze5;

/* loaded from: classes9.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v05.b f471993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471995f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(v05.b bVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f471993d = bVar;
        this.f471994e = dVar;
        this.f471995f = f9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0078  */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            ze5.y2 r14 = (ze5.y2) r14
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r14, r0)
            v05.b r0 = r13.f471993d
            int r1 = r0.f432315e
            int r1 = r1 + 68
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            p15.x r0 = (p15.x) r0
            com.tencent.mm.pluginsdk.ui.chat.ca r1 = new com.tencent.mm.pluginsdk.ui.chat.ca
            r1.<init>()
            r2 = 0
            java.lang.String r3 = "MicroMsg.WxaInfo"
            if (r0 != 0) goto L23
            java.lang.String r4 = "from, msgSrcWxaInfo is null"
            com.tencent.mars.xlog.Log.i(r3, r4)
            goto L3a
        L23:
            java.lang.String r6 = r0.getAppId()
            if (r6 != 0) goto L2f
            java.lang.String r4 = "from, appId is null"
            com.tencent.mars.xlog.Log.i(r3, r4)
            goto L3a
        L2f:
            java.lang.String r7 = r0.getNickname()
            if (r7 != 0) goto L3c
            java.lang.String r4 = "from, nickname is null"
            com.tencent.mars.xlog.Log.e(r3, r4)
        L3a:
            r3 = r2
            goto L5b
        L3c:
            java.lang.String r3 = r0.getIconUrl()
            if (r3 != 0) goto L44
            java.lang.String r3 = ""
        L44:
            r8 = r3
            com.tencent.mm.modelmulti.WxaInfo r3 = new com.tencent.mm.modelmulti.WxaInfo
            java.lang.String r9 = r0.j()
            java.lang.String r10 = r0.l()
            int r11 = r0.n()
            int r12 = r0.o()
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L5b:
            r1.f190246a = r3
            yb5.d r3 = r13.f471994e
            java.lang.String r4 = r3.x()
            r1.f190247b = r4
            com.tencent.mm.storage.f9 r4 = r13.f471995f
            java.lang.String r4 = te5.e2.d(r4)
            r1.f190248c = r4
            android.widget.LinearLayout r4 = r14.f472309c
            com.tencent.mm.ui.chatting.w5.q(r3, r4, r1)
            android.widget.LinearLayout r1 = r14.f472309c
            r4 = 0
            if (r1 != 0) goto L78
            goto L7b
        L78:
            r1.setVisibility(r4)
        L7b:
            android.widget.TextView r1 = r14.f472310d
            if (r1 != 0) goto L80
            goto L99
        L80:
            android.app.Activity r3 = r3.g()
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            if (r0 == 0) goto L8d
            java.lang.String r2 = r0.getNickname()
        L8d:
            r5[r4] = r2
            r0 = 2131756612(0x7f100644, float:1.9144136E38)
            java.lang.String r0 = r3.getString(r0, r5)
            r1.setText(r0)
        L99:
            com.tencent.mm.ui.widget.imageview.WeImageView r14 = r14.f472311e
            if (r14 == 0) goto La3
            r0 = 2131689619(0x7f0f0093, float:1.9008258E38)
            r14.setImageResource(r0)
        La3:
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.i3.invoke(java.lang.Object):java.lang.Object");
    }
}
