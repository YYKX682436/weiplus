package uj4;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f428410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uj4.e f428411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentManager f428412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f428413g;

    public b(kotlin.jvm.internal.h0 h0Var, uj4.e eVar, androidx.fragment.app.FragmentManager fragmentManager, com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment) {
        this.f428410d = h0Var;
        this.f428411e = eVar;
        this.f428412f = fragmentManager;
        this.f428413g = vASCommonFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uj4.e eVar = this.f428411e;
        android.view.View findViewById = eVar.getActivity().findViewById(com.tencent.mm.R.id.s1e);
        kotlin.jvm.internal.h0 h0Var = this.f428410d;
        h0Var.f310123d = findViewById;
        eVar.T6(this.f428412f, (android.view.ViewGroup) h0Var.f310123d, this.f428413g);
    }
}
