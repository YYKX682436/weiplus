package pi2;

/* loaded from: classes3.dex */
public final class p extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final yz5.a H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context, yz5.a confirm) {
        super(context, false, null, 0.0f, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(confirm, "confirm");
        this.H = confirm;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.drx;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View E(zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f118183e).inflate(com.tencent.mm.R.layout.drx, (android.view.ViewGroup) z(), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.widget.Button button = (android.widget.Button) rootView.findViewById(com.tencent.mm.R.id.hrn);
        kotlin.jvm.internal.o.d(button);
        com.tencent.mm.ui.fk.a(button);
        button.setOnClickListener(new pi2.o(this));
    }
}
