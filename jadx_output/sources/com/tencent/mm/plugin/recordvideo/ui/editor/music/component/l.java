package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.recordvideo.ui.editor.music.component.l f156286d = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float[] fArr = new float[60];
        for (int i17 = 0; i17 < 60; i17++) {
            fArr[i17] = (((float) java.lang.Math.random()) * 0.75f) + 0.25f;
        }
        return fArr;
    }
}
