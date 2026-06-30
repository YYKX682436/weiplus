package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/SplitWindowInitializer;", "Lr4/b;", "Landroidx/window/embedding/SplitController;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SplitWindowInitializer implements r4.b {
    @Override // r4.b
    public java.util.List dependencies() {
        return kz5.p0.f313996d;
    }

    @Override // r4.b
    public java.lang.Object l0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.ui.fj.h()) {
            androidx.window.embedding.SplitController.INSTANCE.initialize(context, com.tencent.mm.R.xml.f494901b2);
        }
        return androidx.window.embedding.SplitController.INSTANCE.getInstance();
    }
}
