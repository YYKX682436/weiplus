package qh1;

/* loaded from: classes9.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f363415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f363417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f363418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, java.lang.String str, java.util.Map map, int i18) {
        super(1);
        this.f363415d = i17;
        this.f363416e = str;
        this.f363417f = map;
        this.f363418g = i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            android.view.View r12 = (android.view.View) r12
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "on force notify click, jump type: "
            r12.<init>(r0)
            int r0 = r11.f363415d
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "MicroMsg.DyeingTemplateMsgHandler"
            com.tencent.mars.xlog.Log.i(r1, r12)
            java.lang.Class<i50.s> r12 = i50.s.class
            i95.m r12 = i95.n0.c(r12)
            i50.s r12 = (i50.s) r12
            h50.k r12 = (h50.k) r12
            i50.r r12 = r12.wi()
            k13.l1 r12 = (k13.l1) r12
            java.util.ArrayList r12 = r12.f303239q
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
        L37:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r12.next()
            boolean r4 = r3 instanceof i50.m
            if (r4 == 0) goto L37
            r2.add(r3)
            goto L37
        L49:
            int r9 = r2.size()
            java.lang.Class<i50.q> r12 = i50.q.class
            i95.m r12 = i95.n0.c(r12)
            i50.q r12 = (i50.q) r12
            r6 = 1
            r7 = 5
            java.lang.String r8 = ""
            java.lang.String r10 = r11.f363416e
            r5 = r12
            h13.c0 r5 = (h13.c0) r5
            r5.Ni(r6, r7, r8, r9, r10)
            int r12 = r11.f363418g
            if (r0 == 0) goto Ld5
            r2 = 2
            if (r0 == r2) goto L6e
            qh1.c r0 = qh1.c.f363419d
            r0.wi(r12)
            goto Lda
        L6e:
            qh1.c r0 = qh1.c.f363419d
            java.util.Map r2 = r11.f363417f
            java.lang.String r3 = "$values"
            kotlin.jvm.internal.o.f(r2, r3)
            r0.getClass()
            java.lang.String r3 = "handleGameForcePushJump2H5"
            com.tencent.mars.xlog.Log.i(r1, r3)
            java.lang.String r3 = ".msgsource.forcepushinfov2.forcepushinfocontent.jumpinfo"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            r4 = 0
            if (r3 != 0) goto La6
            cl0.g r3 = new cl0.g     // Catch: cl0.f -> L9b
            r3.<init>(r2)     // Catch: cl0.f -> L9b
            java.lang.String r2 = "url"
            java.lang.String r2 = r3.optString(r2)     // Catch: cl0.f -> L9b
            goto Lac
        L9b:
            r2 = move-exception
            java.lang.String r3 = "parse json fail"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.tencent.mars.xlog.Log.e(r1, r3, r2)
            goto Lab
        La6:
            java.lang.String r2 = "jump info is empty"
            com.tencent.mars.xlog.Log.e(r1, r2)
        Lab:
            r2 = r4
        Lac:
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r3 == 0) goto Lbb
            java.lang.String r2 = "handleGameForcePushJump2H5 jumpUrl illegal, fallback to jump to service notify"
            com.tencent.mars.xlog.Log.w(r1, r2)
            r0.wi(r12)
            goto Lda
        Lbb:
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r0 = "rawUrl"
            r12.putExtra(r0, r2)
            java.lang.String r0 = "forcePushJumpToH5"
            mm.w.g(r12, r0)
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r1 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            j45.l.j(r0, r1, r2, r12, r4)
            goto Lda
        Ld5:
            qh1.c r0 = qh1.c.f363419d
            r0.wi(r12)
        Lda:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qh1.b.invoke(java.lang.Object):java.lang.Object");
    }
}
