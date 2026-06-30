package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class xj extends android.view.TouchDelegate {

    /* renamed from: c, reason: collision with root package name */
    public static final android.graphics.Rect f212565c = new android.graphics.Rect();

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f212566a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.yj f212567b;

    public xj(android.view.View view) {
        super(f212565c, view);
    }

    public void a(com.tencent.mm.ui.yj yjVar) {
        if (this.f212566a == null) {
            this.f212566a = new java.util.ArrayList();
        }
        this.f212566a.add(yjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.xj.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
