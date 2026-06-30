package wa5;

/* loaded from: classes14.dex */
public class a extends android.app.SharedElementCallback {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f444308a = "";

    public void a(java.util.List list, java.util.Map map) {
    }

    @Override // android.app.SharedElementCallback
    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF) {
        android.os.Parcelable onCaptureSharedElementSnapshot;
        try {
            onCaptureSharedElementSnapshot = super.onCaptureSharedElementSnapshot(view, matrix, rectF);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f444308a, th6, "onCaptureSharedElementSnapshot err", new java.lang.Object[0]);
            onCaptureSharedElementSnapshot = super.onCaptureSharedElementSnapshot(null, matrix, rectF);
        }
        java.util.Objects.toString(view);
        java.util.Objects.toString(matrix);
        java.util.Objects.toString(rectF);
        java.util.Objects.toString(onCaptureSharedElementSnapshot);
        kotlin.jvm.internal.o.d(onCaptureSharedElementSnapshot);
        return onCaptureSharedElementSnapshot;
    }

    @Override // android.app.SharedElementCallback
    public android.view.View onCreateSnapshotView(android.content.Context context, android.os.Parcelable parcelable) {
        android.view.View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        java.util.Objects.toString(context);
        java.util.Objects.toString(parcelable);
        java.util.Objects.toString(onCreateSnapshotView);
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(java.util.List list, java.util.Map map) {
        java.util.Objects.toString(list);
        java.util.Objects.toString(map);
        super.onMapSharedElements(list, map);
    }

    @Override // android.app.SharedElementCallback
    public void onRejectSharedElements(java.util.List list) {
        java.util.Objects.toString(list);
        super.onRejectSharedElements(list);
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.Objects.toString(list);
        java.util.Objects.toString(list2);
        java.util.Objects.toString(list3);
        super.onSharedElementEnd(list, list2, list3);
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.Objects.toString(list);
        java.util.Objects.toString(list2);
        java.util.Objects.toString(list3);
        super.onSharedElementStart(list, list2, list3);
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementsArrived(java.util.List list, java.util.List list2, android.app.SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        java.util.Objects.toString(list);
        java.util.Objects.toString(list2);
        java.util.Objects.toString(onSharedElementsReadyListener);
        super.onSharedElementsArrived(list, list2, onSharedElementsReadyListener);
    }
}
