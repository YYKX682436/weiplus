package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class LabelContainerView extends com.tencent.mm.ui.base.MMTagPanelScrollView {

    /* renamed from: g, reason: collision with root package name */
    public boolean f206438g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f206439h;

    /* renamed from: i, reason: collision with root package name */
    public float f206440i;

    /* renamed from: m, reason: collision with root package name */
    public float f206441m;

    /* renamed from: n, reason: collision with root package name */
    public int f206442n;

    /* renamed from: o, reason: collision with root package name */
    public float f206443o;

    /* renamed from: p, reason: collision with root package name */
    public float f206444p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.contact.m4 f206445q;

    public LabelContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f206438g = true;
        this.f206439h = false;
        int scaledTouchSlop = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f206442n = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z17 = (action & 255) == 6;
        int actionIndex = z17 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i17 = 0; i17 < pointerCount; i17++) {
            if (actionIndex != i17) {
                f17 += motionEvent.getX(i17);
                f18 += motionEvent.getY(i17);
            }
        }
        if (z17) {
            pointerCount--;
        }
        float f19 = pointerCount;
        float f27 = f17 / f19;
        float f28 = f18 / f19;
        if (action == 0) {
            this.f206443o = f27;
            this.f206444p = f28;
        } else if (action == 2) {
            int i18 = (int) (f27 - this.f206443o);
            int i19 = (int) (f28 - this.f206444p);
            if ((i18 * i18) + (i19 * i19) > this.f206442n) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r0 != 3) goto L43;
     */
    @Override // android.widget.ScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = 6
            r3 = 0
            r4 = 1
            if (r1 != r2) goto Ld
            r1 = r4
            goto Le
        Ld:
            r1 = r3
        Le:
            if (r1 == 0) goto L15
            int r2 = r11.getActionIndex()
            goto L16
        L15:
            r2 = -1
        L16:
            int r5 = r11.getPointerCount()
            r6 = 0
            r8 = r3
            r7 = r6
        L1d:
            if (r8 >= r5) goto L2f
            if (r2 != r8) goto L22
            goto L2c
        L22:
            float r9 = r11.getX(r8)
            float r6 = r6 + r9
            float r9 = r11.getY(r8)
            float r7 = r7 + r9
        L2c:
            int r8 = r8 + 1
            goto L1d
        L2f:
            if (r1 == 0) goto L33
            int r5 = r5 + (-1)
        L33:
            float r1 = (float) r5
            float r6 = r6 / r1
            float r7 = r7 / r1
            if (r0 == 0) goto L7a
            if (r0 == r4) goto L66
            r1 = 2
            if (r0 == r1) goto L41
            r1 = 3
            if (r0 == r1) goto L66
            goto L82
        L41:
            boolean r0 = r10.f206439h
            if (r0 != 0) goto L4d
            r10.f206438g = r4
            r10.f206440i = r6
            r10.f206441m = r7
            r10.f206439h = r4
        L4d:
            com.tencent.mm.ui.contact.m4 r0 = r10.f206445q
            if (r0 == 0) goto L54
            r0.b()
        L54:
            float r0 = r10.f206440i
            float r6 = r6 - r0
            int r0 = (int) r6
            float r1 = r10.f206441m
            float r7 = r7 - r1
            int r1 = (int) r7
            int r0 = r0 * r0
            int r1 = r1 * r1
            int r0 = r0 + r1
            int r1 = r10.f206442n
            if (r0 <= r1) goto L82
            r10.f206438g = r3
            goto L82
        L66:
            boolean r0 = r10.f206438g
            if (r0 != 0) goto L6e
            boolean r0 = r10.f206439h
            if (r0 != 0) goto L75
        L6e:
            com.tencent.mm.ui.contact.m4 r0 = r10.f206445q
            if (r0 == 0) goto L75
            r0.a()
        L75:
            r10.f206438g = r4
            r10.f206439h = r3
            goto L82
        L7a:
            r10.f206438g = r4
            r10.f206440i = r6
            r10.f206441m = r7
            r10.f206439h = r4
        L82:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.LabelContainerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnLabelContainerListener(com.tencent.mm.ui.contact.m4 m4Var) {
        this.f206445q = m4Var;
    }

    public LabelContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206438g = true;
        this.f206439h = false;
        int scaledTouchSlop = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f206442n = scaledTouchSlop * scaledTouchSlop;
    }
}
