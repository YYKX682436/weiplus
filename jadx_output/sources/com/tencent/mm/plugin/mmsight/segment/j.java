package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public interface j {
    int getDurationMs();

    android.graphics.Bitmap getFrameAtTime(long j17);

    int getScaledHeight();

    int getScaledWidth();

    void init(java.lang.String str, int i17, int i18, int i19);

    void release();

    void reuseBitmap(android.graphics.Bitmap bitmap);
}
