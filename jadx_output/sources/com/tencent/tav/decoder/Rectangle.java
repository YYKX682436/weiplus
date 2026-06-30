package com.tencent.tav.decoder;

/* loaded from: classes14.dex */
public class Rectangle {
    public float height;
    public float width;

    /* renamed from: x, reason: collision with root package name */
    public float f215334x;

    /* renamed from: y, reason: collision with root package name */
    public float f215335y;

    public Rectangle() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Rectangle(float f17, float f18, float f19, float f27) {
        this.f215334x = f17;
        this.f215335y = f18;
        this.width = f19;
        this.height = f27;
    }
}
