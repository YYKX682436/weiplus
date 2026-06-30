package com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public abstract class BaseFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f158077d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f158078e;

    public static /* synthetic */ void l0(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment baseFragment, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: down");
        }
        if ((i18 & 1) != 0) {
            i17 = 19;
        }
        baseFragment.j0(i17);
    }

    public abstract int getLayoutId();

    public abstract void initData();

    public void j0(int i17) {
        java.util.List list = this.f158077d;
        ((java.util.ArrayList) list).clear();
        if (i17 >= 0) {
            int i18 = 0;
            while (true) {
                ((java.util.ArrayList) list).add("测试数据" + i18);
                if (i18 == i17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        o0();
    }

    public final com.tencent.mm.view.refreshLayout.WxRefreshLayout m0() {
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f158078e;
        if (wxRefreshLayout != null) {
            return wxRefreshLayout;
        }
        kotlin.jvm.internal.o.o("refreshLayout");
        throw null;
    }

    public abstract void n0(android.view.View view);

    public void o0() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(getLayoutId(), (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.d(inflate);
        n0(inflate);
        initData();
        return inflate;
    }

    public void p0() {
        java.util.List list = this.f158077d;
        int size = ((java.util.ArrayList) list).size();
        int i17 = size + 10;
        while (size < i17) {
            ((java.util.ArrayList) list).add("测试数据" + size);
            size++;
        }
        o0();
    }
}
