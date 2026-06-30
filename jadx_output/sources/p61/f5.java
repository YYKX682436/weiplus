package p61;

/* loaded from: classes14.dex */
public class f5 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f352251d;

    /* renamed from: n, reason: collision with root package name */
    public final p61.d5 f352258n;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f352252e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f352253f = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f352255h = "";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f352254g = null;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f352256i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f352257m = "";

    public f5(android.content.Context context, p61.d5 d5Var) {
        this.f352251d = context;
        this.f352258n = d5Var;
    }

    public void a() {
        android.view.View inflate = android.view.View.inflate(this.f352251d, com.tencent.mm.R.layout.cke, null);
        this.f352252e = inflate;
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.mmo);
        editText.setHint(com.tencent.mm.R.string.aii);
        p61.w4 w4Var = new p61.w4(this, editText);
        p61.x4 x4Var = new p61.x4(this);
        android.content.Context context = this.f352251d;
        db5.e1.x(context, context.getString(com.tencent.mm.R.string.aid), null, this.f352252e, w4Var, x4Var);
    }

    public void b() {
        com.tencent.mm.plugin.account.bind.ui.NeedVerifyQQEventListener needVerifyQQEventListener;
        com.tencent.mm.autogen.events.NeedVerifyQQEvent needVerifyQQEvent;
        java.lang.Runnable runnable;
        gm0.j1.d().q(384, this);
        p61.d5 d5Var = this.f352258n;
        if (d5Var == null || (needVerifyQQEvent = (needVerifyQQEventListener = (com.tencent.mm.plugin.account.bind.ui.NeedVerifyQQEventListener) d5Var).f73091d) == null || (runnable = needVerifyQQEvent.f54517g.f7554b) == null) {
            return;
        }
        needVerifyQQEvent.f54518h.f7628a = false;
        runnable.run();
        needVerifyQQEventListener.f73091d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, com.tencent.mm.modelbase.m1 r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.f5.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
