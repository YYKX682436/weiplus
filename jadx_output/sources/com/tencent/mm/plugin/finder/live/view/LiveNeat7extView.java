package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/LiveNeat7extView;", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "getInvalidateVerifyTag", "setInvalidateVerifyTag", "(Ljava/lang/String;)V", "invalidateVerifyTag", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class LiveNeat7extView extends com.tencent.mm.ui.widget.MMNeat7extView {

    /* renamed from: V, reason: from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: W, reason: from kotlin metadata */
    public java.lang.String invalidateVerifyTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveNeat7extView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.TAG = "LiveNeat7extView";
        this.invalidateVerifyTag = "";
    }

    public final java.lang.String getInvalidateVerifyTag() {
        return this.invalidateVerifyTag;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(drawable, "drawable");
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invalidateDrawable drawable:");
        com.tencent.mm.pluginsdk.ui.n1 n1Var = drawable instanceof com.tencent.mm.pluginsdk.ui.n1 ? (com.tencent.mm.pluginsdk.ui.n1) drawable : null;
        sb6.append(n1Var != null ? n1Var.f190901m : null);
        r4Var.M2(this.TAG, sb6.toString());
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long j17) {
        kotlin.jvm.internal.o.g(who, "who");
        kotlin.jvm.internal.o.g(what, "what");
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scheduleDrawable drawable:");
        com.tencent.mm.pluginsdk.ui.n1 n1Var = who instanceof com.tencent.mm.pluginsdk.ui.n1 ? (com.tencent.mm.pluginsdk.ui.n1) who : null;
        sb6.append(n1Var != null ? n1Var.f190901m : null);
        r4Var.M2(this.TAG, sb6.toString());
        super.scheduleDrawable(who, what, j17);
    }

    public final void setInvalidateVerifyTag(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.invalidateVerifyTag = str;
    }

    @Override // android.view.View
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable) {
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unscheduleDrawable drawable:");
        com.tencent.mm.pluginsdk.ui.n1 n1Var = drawable instanceof com.tencent.mm.pluginsdk.ui.n1 ? (com.tencent.mm.pluginsdk.ui.n1) drawable : null;
        sb6.append(n1Var != null ? n1Var.f190901m : null);
        r4Var.M2(this.TAG, sb6.toString());
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable who) {
        kotlin.jvm.internal.o.g(who, "who");
        boolean verifyDrawable = super.verifyDrawable(who);
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verifyDrawable superValud:");
        sb6.append(verifyDrawable);
        sb6.append(" view tag:");
        sb6.append(this.invalidateVerifyTag);
        sb6.append(",drawable tag:");
        boolean z17 = who instanceof com.tencent.mm.pluginsdk.ui.n1;
        com.tencent.mm.pluginsdk.ui.n1 n1Var = z17 ? (com.tencent.mm.pluginsdk.ui.n1) who : null;
        sb6.append(n1Var != null ? n1Var.f190901m : null);
        r4Var.M2(this.TAG, sb6.toString());
        if (!verifyDrawable) {
            java.lang.String str = this.invalidateVerifyTag;
            com.tencent.mm.pluginsdk.ui.n1 n1Var2 = z17 ? (com.tencent.mm.pluginsdk.ui.n1) who : null;
            if (!kotlin.jvm.internal.o.b(str, n1Var2 != null ? n1Var2.f190901m : null)) {
                return false;
            }
        }
        return true;
    }
}
