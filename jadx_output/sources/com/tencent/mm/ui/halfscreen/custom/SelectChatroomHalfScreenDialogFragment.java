package com.tencent.mm.ui.halfscreen.custom;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/SelectChatroomHalfScreenDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class SelectChatroomHalfScreenDialogFragment extends com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment {
    public final double G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectChatroomHalfScreenDialogFragment(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
        this.G = getIntent().getDoubleExtra("INTENT_KEY_HALFSCREEN_HEIGHT_RATIO", 0.85d);
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int p0() {
        return (int) (w0() * this.G);
    }
}
