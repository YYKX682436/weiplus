package com.tencent.tencentmap.mapsdk.maps.model.transform;

/* loaded from: classes13.dex */
public class Point {

    /* renamed from: x, reason: collision with root package name */
    public final double f215371x;

    /* renamed from: y, reason: collision with root package name */
    public final double f215372y;

    public Point(double d17, double d18) {
        this.f215371x = d17;
        this.f215372y = d18;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.tencentmap.mapsdk.maps.model.transform.Point)) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.maps.model.transform.Point point = (com.tencent.tencentmap.mapsdk.maps.model.transform.Point) obj;
        return this.f215371x == point.f215371x && this.f215372y == point.f215372y;
    }

    public java.lang.String toString() {
        return "Point{x=" + this.f215371x + ", y=" + this.f215372y + '}';
    }
}
