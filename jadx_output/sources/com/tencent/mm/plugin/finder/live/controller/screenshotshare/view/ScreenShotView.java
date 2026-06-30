package com.tencent.mm.plugin.finder.live.controller.screenshotshare.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028BX\u0082\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ScreenShotView;", "Landroid/widget/RelativeLayout;", "", "d", "I", "getScreenWidth", "()I", "screenWidth", "e", "getScreenHeight", "screenHeight", "", "w", "Z", "isLandscape", "()Z", "setLandscape", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ScreenShotView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int screenWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int screenHeight;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f111602f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f111603g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f111604h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f111605i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f111606m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f111607n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f111608o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f111609p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f111610q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f111611r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f111612s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.ImageView f111613t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.RelativeLayout f111614u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.LinearLayout f111615v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean isLandscape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenShotView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
        this.screenWidth = e8Var.c(null);
        this.screenHeight = e8Var.a();
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.ayt, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.m7y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.m6d);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111602f = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.hmv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f111604h = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.f485429hn4);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f111605i = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.hni);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f111603g = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.hlc);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f111606m = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.hnu);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f111607n = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.hns);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f111608o = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.hod);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f111609p = (android.widget.ImageView) findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.ooe);
        android.widget.TextView textView = (android.widget.TextView) findViewById10;
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        kotlin.jvm.internal.o.f(findViewById10, "also(...)");
        this.f111610q = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.om7);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f111611r = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.hn9);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f111612s = (android.widget.ImageView) findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.tencent.mm.R.id.hkc);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f111613t = (android.widget.ImageView) findViewById13;
        android.view.View findViewById14 = inflate.findViewById(com.tencent.mm.R.id.ath);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f111614u = (android.widget.RelativeLayout) findViewById14;
        android.view.View findViewById15 = inflate.findViewById(com.tencent.mm.R.id.mfz);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f111615v = (android.widget.LinearLayout) findViewById15;
    }

    private final int getScreenHeight() {
        if (!com.tencent.mm.ui.bk.Q()) {
            return this.screenHeight;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        return com.tencent.mm.ui.zk.a(context, context.getResources().getConfiguration().screenHeightDp);
    }

    private final int getScreenWidth() {
        if (!com.tencent.mm.ui.bk.Q()) {
            return this.screenWidth;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        return com.tencent.mm.ui.zk.a(context, context.getResources().getConfiguration().screenWidthDp);
    }

    public final void a() {
        this.f111603g.setImageBitmap(null);
        this.f111606m.setImageBitmap(null);
        this.f111607n.setImageBitmap(null);
        this.f111608o.setImageBitmap(null);
        this.f111609p.setImageBitmap(null);
        this.f111610q.setText("");
        this.f111611r.setText("");
        this.f111612s.setImageBitmap(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof xf2.a
            if (r0 == 0) goto L13
            r0 = r6
            xf2.a r0 = (xf2.a) r0
            int r1 = r0.f454251f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f454251f = r1
            goto L18
        L13:
            xf2.a r0 = new xf2.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f454249d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f454251f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310570c
            xf2.b r2 = new xf2.b
            r4 = 0
            r2.<init>(r5, r4)
            r0.f454251f = r3
            java.lang.Object r6 = kotlinx.coroutines.l.g(r6, r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.graphics.Bitmap r19, android.graphics.Bitmap r20, android.graphics.Bitmap r21, r45.du1 r22, boolean r23, boolean r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 1809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView.c(android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap, r45.du1, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setLandscape(boolean z17) {
        this.isLandscape = z17;
    }
}
