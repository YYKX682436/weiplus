package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class ConversationFolderItemView extends com.tencent.mm.view.x2c.X2CLinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Class f207309d;

    static {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$PerformClick");
            f207309d = cls;
            com.tencent.mars.xlog.Log.i("ConversationFolderItemV", "processName, performClick = %s", bm5.f1.a(), java.lang.Integer.valueOf(cls.hashCode()));
        } catch (java.lang.ClassNotFoundException unused) {
            com.tencent.mars.xlog.Log.w("ConversationFolderItemV", "ClassNotFoundException for android.view.View$PerformClick");
        }
    }

    public ConversationFolderItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!(getTag() instanceof yf5.n)) {
            super.onMeasure(i17, i18);
            return;
        }
        yf5.n nVar = (yf5.n) getTag();
        nVar.getClass();
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(nVar.f461929p, 1073741824));
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        if (runnable != null && runnable.getClass() == f207309d && (getTag() instanceof yf5.n)) {
            runnable = new com.tencent.mm.ui.conversation.c3(this, runnable);
        }
        return super.post(runnable);
    }

    public ConversationFolderItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
