package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/TallHalfScreenDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "context", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class TallHalfScreenDialogFragment extends com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment {
    public static final /* synthetic */ int H = 0;
    public final jz5.g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TallHalfScreenDialogFragment(android.content.Context context, dh5.a halfScreenParam) {
        super(context, halfScreenParam);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
        this.G = jz5.h.b(new com.tencent.mm.ui.gj(this));
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int p0() {
        return ((java.lang.Number) ((jz5.n) this.G).getValue()).intValue();
    }
}
