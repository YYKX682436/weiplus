package xn5;

/* loaded from: classes13.dex */
public final class j {
    public j(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(name, "name");
        if (view instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) view).setIconColor(i17);
        } else if (view instanceof com.tencent.mm.ui.widget.imageview.WeImageButton) {
            ((com.tencent.mm.ui.widget.imageview.WeImageButton) view).setIconColor(i17);
        }
    }
}
