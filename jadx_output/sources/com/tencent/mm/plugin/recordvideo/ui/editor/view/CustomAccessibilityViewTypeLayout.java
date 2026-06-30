package com.tencent.mm.plugin.recordvideo.ui.editor.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/CustomAccessibilityViewTypeLayout;", "Landroid/widget/FrameLayout;", "", "getAccessibilityClassName", "", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "setAccessibilityClassName", "(Ljava/lang/String;)V", "accessibilityClassName", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CustomAccessibilityViewTypeLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public java.lang.String accessibilityClassName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomAccessibilityViewTypeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final java.lang.String getAccessibilityClassName() {
        return this.accessibilityClassName;
    }

    public final void setAccessibilityClassName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.accessibilityClassName = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomAccessibilityViewTypeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, null, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return this.accessibilityClassName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CustomAccessibilityViewTypeLayout(android.content.Context r1, android.util.AttributeSet r2, int r3, java.lang.String r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r6 = r5 & 4
            if (r6 == 0) goto La
            r3 = 0
        La:
            r5 = r5 & 8
            if (r5 == 0) goto L14
            java.lang.Class<android.widget.Button> r4 = android.widget.Button.class
            java.lang.String r4 = r4.getName()
        L14:
            java.lang.String r5 = "context"
            kotlin.jvm.internal.o.g(r1, r5)
            java.lang.String r5 = "accessibilityClassName"
            kotlin.jvm.internal.o.g(r4, r5)
            r0.<init>(r1, r2, r3)
            r0.accessibilityClassName = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.view.CustomAccessibilityViewTypeLayout.<init>(android.content.Context, android.util.AttributeSet, int, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
