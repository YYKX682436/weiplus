package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes8.dex */
public final class m0 extends pk3.h {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.ting.uic.k0 f174779d = new com.tencent.mm.plugin.ting.uic.k0(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 23 || i17 == 24;
    }

    @Override // pk3.b
    public boolean Mb(com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(info, "info");
        return false;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, r45.fr4 animateData, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(animateData, "animateData");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            rk4.k5.e("onMultiTaskItemClick main process", "TingMultiTaskRegisterUIC");
            com.tencent.mm.plugin.ting.uic.k0.a(f174779d, info, getActivity());
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tingTaskInfo", info);
            com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.ting.uic.l0.class);
        }
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356435e;
    }
}
