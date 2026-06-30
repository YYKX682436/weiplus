package lp4;

/* loaded from: classes10.dex */
public final class q0 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f320407f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f320408g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f320409h;

    /* renamed from: i, reason: collision with root package name */
    public ct0.b f320410i;

    /* renamed from: m, reason: collision with root package name */
    public it3.y f320411m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.g70 f320412n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.view.View finishBtn, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(finishBtn, "finishBtn");
        kotlin.jvm.internal.o.g(status, "status");
        this.f320407f = finishBtn;
        android.content.Context context = finishBtn.getContext();
        this.f320408g = context;
        this.f320412n = new r45.g70();
        if (finishBtn instanceof android.widget.TextView) {
            dq4.c cVar = dq4.c.f242369a;
            kotlin.jvm.internal.o.f(context, "context");
            float a17 = cVar.a(context, 14.0f);
            android.widget.TextView textView = finishBtn instanceof android.widget.TextView ? (android.widget.TextView) finishBtn : null;
            if (textView != null) {
                textView.setTextSize(1, a17);
            }
        }
        finishBtn.setOnClickListener(new lp4.m0(status));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03db A[LOOP:2: B:91:0x03d5->B:93:0x03db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0498 A[LOOP:3: B:96:0x0492->B:98:0x0498, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(rm5.v r23, java.lang.String r24, android.graphics.Rect r25, android.graphics.Rect r26, android.graphics.Rect r27, boolean r28, yz5.l r29) {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp4.q0.z(rm5.v, java.lang.String, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, boolean, yz5.l):void");
    }
}
