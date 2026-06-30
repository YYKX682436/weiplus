package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class TencentMapGestureListenerList implements com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener {
    private java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener> mListeners = new java.util.ArrayList<>();

    public synchronized void addListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        if (tencentMapGestureListener != null) {
            if (!this.mListeners.contains(tencentMapGestureListener)) {
                this.mListeners.add(tencentMapGestureListener);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onDoubleTap(float f17, float f18) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onDoubleTap(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onDown(float f17, float f18) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onDown(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onFling(float f17, float f18) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onFling(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onLongPress(float f17, float f18) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onLongPress(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized void onMapStable() {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onMapStable();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onScroll(float f17, float f18) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onScroll(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onSingleTap(float f17, float f18) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onSingleTap(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onTwoFingerMoveAgainst(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener.TwoFingerMoveAgainstStatus twoFingerMoveAgainstStatus, com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onTwoFingerMoveAgainst(twoFingerMoveAgainstStatus, cameraPosition);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onUp(float f17, float f18) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onUp(f17, f18);
        }
        return false;
    }

    public synchronized void removeListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        this.mListeners.remove(tencentMapGestureListener);
    }
}
