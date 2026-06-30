package cp4;

/* loaded from: classes8.dex */
public final class c extends androidx.recyclerview.widget.o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.vlog.ui.plugin.caption.EditorCaptionLayoutManager editorCaptionLayoutManager, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.recyclerview.widget.o1
    public int g(int i17, int i18, int i19, int i27, int i28) {
        return (i19 + ((i27 - i19) / 2)) - (i17 + ((i18 - i17) / 2));
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return 200.0f / displayMetrics.densityDpi;
    }
}
