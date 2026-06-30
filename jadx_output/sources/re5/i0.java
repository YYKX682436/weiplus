package re5;

/* loaded from: classes3.dex */
public final class i0 extends lf3.n implements gg3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // gg3.a
    public ig3.a F6(java.lang.String label, com.tencent.mm.pluginsdk.ui.tools.f4 view) {
        kotlin.jvm.internal.o.g(label, "label");
        kotlin.jvm.internal.o.g(view, "view");
        return new ig3.i(label, (com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer) view);
    }

    @Override // gg3.a
    public com.tencent.mm.pluginsdk.ui.tools.f4 Z5(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer(context, null, 0, 6, null);
    }

    @Override // gg3.a
    public hg3.a r1() {
        return new re5.c();
    }
}
