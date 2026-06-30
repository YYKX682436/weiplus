package ze5;

/* loaded from: classes9.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v05.b f471834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471836f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(v05.b bVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f471834d = bVar;
        this.f471835e = dVar;
        this.f471836f = f9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
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
            v05.b r0 = r13.f471834d
            int r1 = r0.f432315e
            int r1 = r1 + 68
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            p15.x r0 = (p15.x) r0
            com.tencent.mm.pluginsdk.ui.chat.ca r1 = new com.tencent.mm.pluginsdk.ui.chat.ca
            r1.<init>()
            java.lang.String r2 = ""
            java.lang.String r3 = "MicroMsg.WxaInfo"
            if (r0 != 0) goto L24
            java.lang.String r4 = "from, msgSrcWxaInfo is null"
            com.tencent.mars.xlog.Log.i(r3, r4)
            goto L3b
        L24:
            java.lang.String r6 = r0.getAppId()
            if (r6 != 0) goto L30
            java.lang.String r4 = "from, appId is null"
            com.tencent.mars.xlog.Log.i(r3, r4)
            goto L3b
        L30:
            java.lang.String r7 = r0.getNickname()
            if (r7 != 0) goto L3d
            java.lang.String r4 = "from, nickname is null"
            com.tencent.mars.xlog.Log.e(r3, r4)
        L3b:
            r3 = 0
            goto L5c
        L3d:
            java.lang.String r3 = r0.getIconUrl()
            if (r3 != 0) goto L45
            r8 = r2
            goto L46
        L45:
            r8 = r3
        L46:
            com.tencent.mm.modelmulti.WxaInfo r3 = new com.tencent.mm.modelmulti.WxaInfo
            java.lang.String r9 = r0.j()
            java.lang.String r10 = r0.l()
            int r11 = r0.n()
            int r12 = r0.o()
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L5c:
            r1.f190246a = r3
            yb5.d r3 = r13.f471835e
            java.lang.String r4 = r3.x()
            r1.f190247b = r4
            com.tencent.mm.storage.f9 r4 = r13.f471836f
            java.lang.String r4 = te5.e2.d(r4)
            r1.f190248c = r4
            android.widget.LinearLayout r4 = r14.f472309c
            com.tencent.mm.ui.chatting.w5.q(r3, r4, r1)
            android.widget.LinearLayout r1 = r14.f472309c
            r4 = 0
            if (r1 != 0) goto L79
            goto L7c
        L79:
            r1.setVisibility(r4)
        L7c:
            android.widget.TextView r1 = r14.f472310d
            if (r1 != 0) goto L81
            goto L9e
        L81:
            android.app.Activity r3 = r3.g()
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            if (r0 == 0) goto L92
            java.lang.String r0 = r0.getNickname()
            if (r0 != 0) goto L91
            goto L92
        L91:
            r2 = r0
        L92:
            r5[r4] = r2
            r0 = 2131756612(0x7f100644, float:1.9144136E38)
            java.lang.String r0 = r3.getString(r0, r5)
            r1.setText(r0)
        L9e:
            com.tencent.mm.ui.widget.imageview.WeImageView r14 = r14.f472311e
            if (r14 == 0) goto La8
            r0 = 2131689619(0x7f0f0093, float:1.9008258E38)
            r14.setImageResource(r0)
        La8:
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.b3.invoke(java.lang.Object):java.lang.Object");
    }
}
