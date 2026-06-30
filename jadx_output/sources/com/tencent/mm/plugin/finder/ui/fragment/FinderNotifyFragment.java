package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderNotifyFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderNotifyFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {
    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.kq.class, com.tencent.mm.plugin.finder.viewmodel.component.yo.class});
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("FinderNotifyFragment", "index:" + this.f129265p);
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.viewmodel.component.kq) zVar.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.kq.class)).f134982d = this.f129265p;
        com.tencent.mm.plugin.finder.viewmodel.component.yo yoVar = (com.tencent.mm.plugin.finder.viewmodel.component.yo) zVar.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.yo.class);
        yoVar.f136598f = this.f129265p;
        android.app.Activity context = yoVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        yoVar.f136597e = (((com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).f134417w == 1 ? com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI.f128577w : com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI.f128576v)[this.f129265p];
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        com.tencent.mars.xlog.Log.i("FinderNotifyFragment", " onCreateView");
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("FinderNotifyFragment", "onViewCreated");
        super.onViewCreated(view, bundle);
    }
}
