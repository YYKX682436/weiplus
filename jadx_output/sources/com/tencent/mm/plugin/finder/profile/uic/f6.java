package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public abstract class f6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f123704d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.e6(this));
    }

    public final void finish() {
        jz5.f0 f0Var;
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null) {
            if (fragment instanceof com.tencent.mm.plugin.finder.profile.FinderProfileUIFragment) {
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var != null || getActivity().isFinishing()) {
            return;
        }
        getActivity().finish();
    }

    public final boolean getFragmentMode() {
        return ((java.lang.Boolean) this.f123704d.getValue()).booleanValue();
    }

    public final void jumpProfile(java.lang.String username, long j17) {
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = (com.tencent.mm.plugin.finder.profile.uic.f4) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.f4.class);
        boolean z17 = false;
        if (f4Var != null && !f4Var.f123692p) {
            z17 = true;
        }
        if (z17) {
            intent.putExtra("finder_read_feed_id", j17);
        }
        if (!(getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) && !(getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI) && !(getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI)) {
            intent.putExtra("KEY_FROM_TIMELINE", true);
        }
        intent.putExtra("key_entrance_type", -1);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, getContext(), intent, j17, null, 0, 1, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(getContext(), intent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123704d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.e6(this));
    }
}
