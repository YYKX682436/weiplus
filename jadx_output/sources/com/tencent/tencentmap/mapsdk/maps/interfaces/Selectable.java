package com.tencent.tencentmap.mapsdk.maps.interfaces;

/* loaded from: classes13.dex */
public interface Selectable {

    /* loaded from: classes13.dex */
    public interface OnSelectedListener<T> {
        void onSelected(T t17);
    }

    boolean isSelected();

    void setSelected(boolean z17);

    <T> void setSelectedListener(com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener<T> onSelectedListener);
}
