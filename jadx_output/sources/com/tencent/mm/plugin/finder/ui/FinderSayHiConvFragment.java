package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSayHiConvFragment;", "Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderSayHiConvFragment extends com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment {
    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment
    public void L0() {
        if (w0().x().size() == 1 && ((qb2.t) w0().x().get(0)).field_type != 1) {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(1);
            }
            androidx.fragment.app.FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            androidx.fragment.app.FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                activity3.overridePendingTransition(0, 0);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        if (w0() instanceof qb2.i0) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
            int integer = j37 != null ? j37.u0().getInteger(49) : 0;
            if (integer == 2 || integer == 3) {
                return;
            }
            wn.a w07 = w0();
            kotlin.jvm.internal.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            java.util.ArrayList arrayList = ((qb2.i0) w07).f361222t;
            qb2.t a17 = com.tencent.mm.plugin.finder.storage.t80.f128066e.a();
            a17.field_type = 10000;
            a17.G1 = view.getContext().getResources().getString(com.tencent.mm.R.string.cqh);
            arrayList.add(a17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.a t0() {
        qb2.i0 i0Var = new qb2.i0(this);
        i0Var.f361177s = new qb2.l0(com.tencent.mm.plugin.finder.ui.hd.f129325d);
        i0Var.f361176r = new qb2.g0(this, new com.tencent.mm.plugin.finder.ui.id(this), null, 4, null);
        android.os.Bundle arguments = getArguments();
        i0Var.f361175q = arguments != null ? arguments.getInt("KEY_TALKER_SCENE", -1) : -1;
        android.os.Bundle arguments2 = getArguments();
        i0Var.f361174p = arguments2 != null ? arguments2.getInt("KEY_TALKER_TYPE", -1) : -1;
        return i0Var;
    }
}
