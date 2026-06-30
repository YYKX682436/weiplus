package com.tencent.mm.ui.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/ViewCreatorFragment;", "Landroidx/fragment/app/Fragment;", "Ltk5/a;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ViewCreatorFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements tk5.a {

    /* renamed from: d, reason: collision with root package name */
    public final bh5.k f208823d;

    /* renamed from: e, reason: collision with root package name */
    public tk5.c f208824e;

    /* renamed from: f, reason: collision with root package name */
    public tk5.b f208825f;

    public ViewCreatorFragment(bh5.k viewCreator) {
        kotlin.jvm.internal.o.g(viewCreator, "viewCreator");
        this.f208823d = viewCreator;
    }

    @Override // tk5.a
    public void G() {
        tk5.b bVar = this.f208825f;
        if (bVar != null) {
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = ((bh5.x) bVar).f20971a;
            mMHalfScreenDialogFragment.dismiss();
            ((jz5.n) mMHalfScreenDialogFragment.B).getValue();
        }
    }

    @Override // tk5.a
    public void M(tk5.c router) {
        kotlin.jvm.internal.o.g(router, "router");
        this.f208824e = router;
    }

    @Override // tk5.a
    public boolean i() {
        androidx.recyclerview.widget.RecyclerView recyclerView = ((uf5.j) this.f208823d).f427247a;
        return recyclerView == null || !recyclerView.canScrollVertically(-1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        context.toString();
        super.onAttach(context);
        tk5.b bVar = this.f208825f;
        if (bVar != null) {
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = ((bh5.x) bVar).f20971a;
            com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = mMHalfScreenDialogFragment.f208812p;
            if (halfScreenPullDownCloseLayout != null) {
                halfScreenPullDownCloseLayout.setDragEnableBlock(new bh5.v(mMHalfScreenDialogFragment));
            }
            com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout2 = mMHalfScreenDialogFragment.f208812p;
            if (halfScreenPullDownCloseLayout2 == null) {
                return;
            }
            halfScreenPullDownCloseLayout2.setDragFinishInterceptor(new bh5.w(mMHalfScreenDialogFragment));
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.util.Objects.toString(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        inflater.toString();
        java.util.Objects.toString(viewGroup);
        java.util.Objects.toString(bundle);
        uf5.j jVar = (uf5.j) this.f208823d;
        jVar.getClass();
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.dz8, (android.view.ViewGroup) null, false);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.u17);
        jVar.f427247a = recyclerView;
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.u1e);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.u1f);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.u1g);
        kotlin.jvm.internal.o.d(imageView);
        uf5.k kVar = jVar.f427248b;
        java.util.HashSet hashSet = jVar.f427249c;
        java.util.ArrayList arrayList = jVar.f427250d;
        uf5.k.a(kVar, imageView, hashSet, arrayList);
        kotlin.jvm.internal.o.d(button);
        uf5.k.b(kVar, button, hashSet);
        uf5.h hVar = new uf5.h(jVar.f427250d, jVar.f427249c, jVar.f427248b, imageView, button);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(kVar.f427254a));
        recyclerView.setAdapter(hVar);
        uf5.i iVar = new uf5.i(jVar.f427249c, jVar.f427250d, hVar, jVar.f427248b, imageView, button);
        imageView.setOnClickListener(iVar);
        textView.setOnClickListener(iVar);
        button.setOnClickListener(new uf5.e(kVar, arrayList, hashSet));
        return inflate;
    }

    @Override // tk5.a
    /* renamed from: t, reason: from getter */
    public tk5.c getG() {
        return this.f208824e;
    }

    @Override // tk5.a
    public androidx.fragment.app.Fragment u() {
        return this;
    }
}
