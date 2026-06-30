package df0;

/* loaded from: classes3.dex */
public interface t extends i95.m {
    static pk4.d P5(df0.t tVar, android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createThumbPlayerVideoView");
        }
        if ((i18 & 2) != 0) {
            attributeSet = null;
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        ((cf0.c0) tVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView(context, attributeSet, i17);
    }
}
