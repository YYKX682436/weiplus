package jt;

/* loaded from: classes.dex */
public enum w {
    TencentMap(0),
    GoogleMap(1),
    SogouMap(2),
    BaiduMap(3),
    AutonaviMap(4);

    w(int i17) {
    }

    public java.lang.String h() {
        int ordinal = ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "com.tencent.map" : "com.autonavi.minimap" : "com.baidu.BaiduMap" : "com.sogou.map.android.maps" : "com.google.android.apps.maps";
    }
}
