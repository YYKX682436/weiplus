package com.tencent.mm.ui.chatting;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/BizHalfScreenChattingUI;", "Lcom/tencent/mm/ui/chatting/ChattingUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizHalfScreenChattingUI extends com.tencent.mm.ui.chatting.ChattingUI {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f198161z = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f198162u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.l9 f198163v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f198164w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f198165x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f198166y;

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (!this.f198166y) {
            int action = ev6.getAction();
            if (action == 0) {
                this.f198165x = h7(this, ev6);
            } else if (action == 1) {
                boolean h76 = h7(this, ev6);
                if (this.f198165x && h76) {
                    this.f198166y = true;
                    this.f198254h.f198152f.f460710e.Q();
                }
            }
        }
        return super.dispatchTouchEvent(ev6);
    }

    @Override // com.tencent.mm.ui.chatting.ChattingUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
    }

    public final int g7(int i17) {
        if (getIntent().getBooleanExtra("key_template_history_msg", false)) {
            return i17 / 4;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.pluginsdk.ui.tools.p0.f191821a;
        return i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 80);
    }

    public final boolean h7(android.content.Context context, android.view.MotionEvent motionEvent) {
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int scaledWindowTouchSlop = android.view.ViewConfiguration.get(context).getScaledWindowTouchSlop();
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        int i17 = -scaledWindowTouchSlop;
        return x17 < i17 || y17 < i17 || x17 > decorView.getWidth() + scaledWindowTouchSlop || y17 > decorView.getHeight() + scaledWindowTouchSlop;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x0011, B:9:0x0017, B:11:0x001d, B:13:0x0036, B:14:0x003e, B:24:0x0022, B:26:0x0028, B:28:0x002e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i7() {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.BizDialogChattingUI"
            java.lang.String r1 = "getCurrentWindowHeight tmpWindowHeight:"
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L5c
            r4 = 30
            if (r3 < r4) goto L22
            android.view.WindowManager r3 = r7.getWindowManager()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            android.view.WindowMetrics r3 = r3.getCurrentWindowMetrics()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            android.graphics.Rect r3 = r3.getBounds()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            int r3 = r3.height()     // Catch: java.lang.Exception -> L5c
            goto L34
        L22:
            android.view.WindowManager r3 = r7.getWindowManager()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            int r3 = r3.getHeight()     // Catch: java.lang.Exception -> L5c
            goto L34
        L33:
            r3 = r2
        L34:
            if (r3 > 0) goto L3d
            android.graphics.Point r4 = com.tencent.mm.ui.bl.b(r7)     // Catch: java.lang.Exception -> L5c
            int r4 = r4.y     // Catch: java.lang.Exception -> L5c
            goto L3e
        L3d:
            r4 = r3
        L3e:
            int r5 = r7.g7(r4)     // Catch: java.lang.Exception -> L5c
            int r5 = r4 - r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r6.<init>(r1)     // Catch: java.lang.Exception -> L5c
            r6.append(r3)     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "  finalWindowHeight:"
            r6.append(r1)     // Catch: java.lang.Exception -> L5c
            r6.append(r4)     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Exception -> L5c
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L5c
            goto L70
        L5c:
            r1 = move-exception
            java.lang.String r3 = "getCurrentWindowHeight"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r3, r2)
            android.graphics.Point r1 = com.tencent.mm.ui.bl.b(r7)
            int r1 = r1.y
            int r2 = r7.g7(r1)
            int r5 = r1 - r2
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentWindowHeight height:"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            r7.f198162u = r5
            android.view.Window r0 = r7.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r1 = -1
            r0.width = r1
            r0.height = r1
            r2 = 80
            r0.gravity = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.dimAmount = r2
            android.view.Window r2 = r7.getWindow()
            r2.setAttributes(r0)
            android.view.Window r0 = r7.getWindow()
            int r2 = r7.f198162u
            r0.setLayout(r1, r2)
            android.view.Window r0 = r7.getWindow()
            r1 = 2
            r0.addFlags(r1)
            com.tencent.mm.ui.chatting.l9 r0 = r7.f198163v
            if (r0 == 0) goto Lbf
            int r1 = r7.f198162u
            r0.f201929m = r1
            float r1 = (float) r1
            r2 = 1050253722(0x3e99999a, float:0.3)
            float r1 = r1 * r2
            r0.f201928i = r1
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.BizHalfScreenChattingUI.i7():void");
    }

    @Override // com.tencent.mm.ui.chatting.ChattingUI, com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizDialogChattingUI", "onConfigurationChanged  isInMultiWindowMode:" + isInMultiWindowMode());
    }

    @Override // com.tencent.mm.ui.chatting.ChattingUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
        super.onCreate(bundle);
        i7();
        fq1.e eVar = fq1.e.f265507a;
        eVar.g(getWindow().getDecorView(), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
        getWindow().getDecorView().setBackgroundColor(0);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        setFinishOnTouchOutside(true);
        int i17 = this.f198162u;
        com.tencent.mm.ui.chatting.l9 l9Var = new com.tencent.mm.ui.chatting.l9(this, new com.tencent.mm.ui.chatting.q1(this));
        this.f198163v = l9Var;
        l9Var.a(i17);
        eVar.g(this.f198163v, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super.onMultiWindowModeChanged(z17, configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizDialogChattingUI", "onMultiWindowModeChanged  isInMultiWindowMode:" + z17 + "  newConfig:" + configuration);
        i7();
    }

    @Override // com.tencent.mm.ui.chatting.ChattingUI, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
        super.setRequestedOrientation(1);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z17) {
        super.onMultiWindowModeChanged(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizDialogChattingUI", "onMultiWindowModeChanged  isInMultiWindowMode:" + z17);
        i7();
    }
}
