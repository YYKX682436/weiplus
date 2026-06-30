package com.tencent.wemagic.playable;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017J@\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0017J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tencent/wemagic/playable/WePlayableNewPlayableDelegate;", "Lcom/tencent/wemagic/common/api/IMBViewDelegateManager;", "playableViewContainer", "Landroid/widget/FrameLayout;", "env", "Lcom/tencent/wemagic/playable/WePlayableCoverBiz;", "<init>", "(Landroid/widget/FrameLayout;Lcom/tencent/wemagic/playable/WePlayableCoverBiz;)V", "onCanvasViewCreate", "", "viewId", "", "canvasId", "", "onCanvasViewLayout", "left", "", "top", "width", "height", "zIndex", "onCanvasViewDestroy", "onCanvasViewFirstFrameRendered", "Companion", "playable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WePlayableNewPlayableDelegate implements com.tencent.wemagic.common.api.IMBViewDelegateManager {
    public void onCanvasViewCreate(java.lang.String viewId, long canvasId) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        java.lang.String format = "canvas " + canvasId + " created";
        java.lang.Object[] objArr = new java.lang.Object[0];
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        throw null;
    }

    public void onCanvasViewDestroy(java.lang.String viewId, long canvasId) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        java.lang.String format = "canvas " + canvasId + " destroyed";
        java.lang.Object[] objArr = new java.lang.Object[0];
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
    }

    public void onCanvasViewFirstFrameRendered(java.lang.String viewId, long canvasId) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        java.lang.String format = "canvas " + canvasId + " first frame rendered";
        java.lang.Object[] objArr = new java.lang.Object[0];
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
    }

    public void onCanvasViewLayout(java.lang.String viewId, long canvasId, int left, int top, int width, int height, int zIndex) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
    }
}
