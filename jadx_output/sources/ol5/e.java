package ol5;

/* loaded from: classes15.dex */
public abstract class e extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.happybubble.BubbleLayout f346220d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f346221e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f346222f;

    /* renamed from: g, reason: collision with root package name */
    public final int f346223g;

    /* renamed from: h, reason: collision with root package name */
    public ol5.d f346224h;

    /* renamed from: i, reason: collision with root package name */
    public ol5.d[] f346225i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f346226m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f346227n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f346228o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Activity f346229p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f346230q;

    public e(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.f346224h = ol5.d.TOP;
        this.f346225i = new ol5.d[4];
        this.f346226m = false;
        this.f346228o = new int[2];
        setCancelable(true);
        this.f346229p = (android.app.Activity) context;
        android.view.Window window = getWindow();
        if (window == null) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        int i17 = ol5.h.a(getContext())[0];
        this.f346223g = com.tencent.mm.ui.bl.h(getContext());
        getWindow().getDecorView().setOnTouchListener(new ol5.a(this, attributes, i17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r2 != 3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ol5.e.b():void");
    }

    public final void c() {
        if (this.f346222f != null) {
            int i17 = 0;
            for (ol5.d dVar : this.f346225i) {
                if (dVar != null) {
                    i17++;
                }
            }
            if (i17 > 0) {
                int[] iArr = this.f346228o;
                int[] iArr2 = {iArr[0], iArr[1], (ol5.h.a(getContext())[0] - iArr[0]) - this.f346222f.width(), (ol5.h.a(getContext())[1] - iArr[1]) - this.f346222f.height()};
                int i18 = 0;
                for (ol5.d dVar2 : this.f346225i) {
                    if (dVar2 != null) {
                        i18++;
                    }
                }
                boolean z17 = i18 > 0;
                ol5.d dVar3 = ol5.d.BOTTOM;
                ol5.d dVar4 = ol5.d.RIGHT;
                ol5.d dVar5 = ol5.d.TOP;
                ol5.d dVar6 = ol5.d.LEFT;
                if (!z17) {
                    int i19 = 0;
                    for (int i27 = 0; i27 < 4; i27++) {
                        int i28 = iArr2[i27];
                        if (i28 > i19) {
                            i19 = i28;
                        }
                    }
                    if (i19 == iArr2[0]) {
                        this.f346224h = dVar6;
                        return;
                    }
                    if (i19 == iArr2[1]) {
                        this.f346224h = dVar5;
                        return;
                    } else if (i19 == iArr2[2]) {
                        this.f346224h = dVar4;
                        return;
                    } else {
                        if (i19 == iArr2[3]) {
                            this.f346224h = dVar3;
                            return;
                        }
                        return;
                    }
                }
                this.f346221e.measure(0, 0);
                for (ol5.d dVar7 : this.f346225i) {
                    if (dVar7 == null) {
                        return;
                    }
                    int ordinal = dVar7.ordinal();
                    if (ordinal == 0) {
                        if (iArr2[0] > this.f346221e.getMeasuredWidth()) {
                            this.f346224h = dVar6;
                            return;
                        }
                    } else if (ordinal == 1) {
                        if (iArr2[1] > this.f346221e.getMeasuredHeight()) {
                            this.f346224h = dVar5;
                            return;
                        }
                    } else if (ordinal == 2) {
                        if (iArr2[2] > this.f346221e.getMeasuredWidth()) {
                            this.f346224h = dVar4;
                            return;
                        }
                    } else if (ordinal == 3 && iArr2[3] > this.f346221e.getMeasuredHeight()) {
                        this.f346224h = dVar3;
                        return;
                    }
                }
                this.f346224h = this.f346225i[0];
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.tencent.mm.ui.widget.happybubble.BubbleLayout bubbleLayout = this.f346220d;
        if (bubbleLayout != null) {
            bubbleLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f346230q);
        }
        super.dismiss();
    }

    public ol5.e e(int i17, int i18) {
        this.f346222f = new android.graphics.Rect(0, 0, 1, 1);
        int[] iArr = this.f346228o;
        iArr[0] = i17;
        iArr[1] = i18;
        c();
        if (this.f346230q != null) {
            f();
            b();
        }
        return this;
    }

    public final void f() {
        int ordinal = this.f346224h.ordinal();
        if (ordinal == 0) {
            this.f346220d.setLook(ol5.f.RIGHT);
        } else if (ordinal == 1) {
            this.f346220d.setLook(ol5.f.BOTTOM);
        } else if (ordinal == 2) {
            this.f346220d.setLook(ol5.f.LEFT);
        } else if (ordinal == 3) {
            this.f346220d.setLook(ol5.f.TOP);
        }
        this.f346220d.b();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.f346220d == null) {
            this.f346220d = new com.tencent.mm.ui.widget.happybubble.BubbleLayout(getContext(), null);
        }
        android.view.View view = this.f346221e;
        if (view != null) {
            this.f346220d.addView(view);
        }
        setContentView(this.f346220d);
        android.view.Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(-2, -2);
        c();
        f();
        this.f346220d.measure(0, 0);
        b();
        this.f346230q = new ol5.b(this);
        this.f346220d.getViewTreeObserver().addOnGlobalLayoutListener(this.f346230q);
        this.f346220d.setOnClickEdgeListener(new ol5.c(this));
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (!this.f346226m || i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        dismiss();
        this.f346229p.onBackPressed();
        this.f346229p = null;
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.Window window = getWindow();
        if (window == null) {
            return false;
        }
        android.view.View decorView = window.getDecorView();
        if (this.f346227n && isShowing()) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            if (x17 <= 0 || y17 <= 0 || x17 > decorView.getWidth() || y17 > decorView.getHeight()) {
                cancel();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        this.f346227n = z17;
    }
}
