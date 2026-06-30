package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class r2 extends com.tencent.mm.plugin.mv.ui.view.u2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView, android.content.Context context) {
        super(musicMvLyricView, context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.u2, androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return 25.0f / displayMetrics.densityDpi;
    }
}
