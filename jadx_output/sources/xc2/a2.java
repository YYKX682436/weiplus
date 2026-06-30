package xc2;

/* loaded from: classes2.dex */
public final class a2 extends com.tencent.mm.plugin.finder.viewmodel.component.vh {
    @Override // com.tencent.mm.plugin.finder.viewmodel.component.vh
    public float b(android.content.Context context) {
        int i17;
        kotlin.jvm.internal.o.g(context, "context");
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        return (i17 * kx2.a.f313278a.a(context)) + com.tencent.mm.ui.bl.c(context);
    }
}
