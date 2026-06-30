package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class g6 extends com.tencent.mm.pluginsdk.ui.span.y {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184753m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, com.tencent.neattextview.textview.view.NeatTextView neatTextView, android.view.View.OnTouchListener onTouchListener, java.lang.String str) {
        super(neatTextView, onTouchListener);
        this.f184753m = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.y, com.tencent.neattextview.textview.view.i, android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean onTouch = super.onTouch(view, motionEvent);
        if (onTouch) {
            com.tencent.mars.xlog.Log.i("MMNeatTouchListener", "terry h5 apply click");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16337, this.f184753m, 1, 1);
        }
        return onTouch;
    }
}
