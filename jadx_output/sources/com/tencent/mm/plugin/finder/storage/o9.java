package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class o9 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.o9 f127297a = new com.tencent.mm.plugin.finder.storage.o9();

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            if (str == null) {
                str = "";
            }
            try {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((c61.l7) b6Var).qj(context, null, str, false, null);
            } catch (java.lang.Exception e17) {
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "报错了：" + e17.getMessage(), 0).show();
            }
        }
    }
}
