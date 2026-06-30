package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.l0 f136307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136307d = new com.tencent.mm.plugin.finder.feed.model.l0(activity);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f136307d = new com.tencent.mm.plugin.finder.feed.model.l0((com.tencent.mm.ui.MMFragmentActivity) activity);
    }
}
