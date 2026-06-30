package vr1;

/* loaded from: classes14.dex */
public final class b0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f439547d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f439548e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f439549f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f439550g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f439548e = new androidx.lifecycle.j0();
        this.f439549f = jz5.h.b(new vr1.v(activity));
        this.f439550g = jz5.h.b(new vr1.w(activity));
    }

    public final void O6(ym3.p pVar, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        java.lang.Object qVar;
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
        ym3.f fVar = mvvmList.f152057d;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.data.BizPCRecentReadDataSource");
        if (((xr1.g) fVar).f456195f) {
            qVar = vr1.p.f439594a;
        } else {
            ym3.p pVar2 = ym3.p.f463181f;
            java.util.ArrayList arrayList = mvvmList.f152065o;
            if (pVar == pVar2 && arrayList.isEmpty()) {
                qVar = vr1.s.f439597a;
            } else {
                ym3.p pVar3 = ym3.p.f463180e;
                qVar = ((pVar == pVar3 || pVar == ym3.p.f463179d) && arrayList.isEmpty()) ? vr1.r.f439596a : ((pVar == pVar3 || pVar == ym3.p.f463179d) && mvvmList.f152062i) ? new vr1.q(vr1.u.f439599e) : (pVar != pVar2 || mvvmList.f152062i) ? new vr1.q(vr1.u.f439598d) : new vr1.q(vr1.u.f439600f);
            }
        }
        this.f439548e.postValue(qVar);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI = (com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI) activity;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(vr1.o.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        vr1.o oVar = (vr1.o) a17;
        oVar.P6().f152071u.observe(bizPCRecentReadUI, new vr1.a0(this, oVar));
        android.widget.TextView textView = (android.widget.TextView) ((android.view.View) ((jz5.n) this.f439550g).getValue()).findViewById(com.tencent.mm.R.id.f486540lm3);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI2 = (com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI) activity2;
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a18 = zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(vr1.o.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        vr1.o oVar2 = (vr1.o) a18;
        android.app.Activity context3 = getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a19 = zVar.a((androidx.appcompat.app.AppCompatActivity) context3).a(vr1.b0.class);
        kotlin.jvm.internal.o.f(a19, "get(...)");
        textView.setOnClickListener(new vr1.y(bizPCRecentReadUI2, oVar2, (vr1.b0) a19));
        com.tencent.mm.ui.tools.d8.a(textView);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI3 = (com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI) activity3;
        android.app.Activity context4 = getContext();
        kotlin.jvm.internal.o.g(context4, "context");
        if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a27 = zVar.a((androidx.appcompat.app.AppCompatActivity) context4).a(vr1.o.class);
        kotlin.jvm.internal.o.f(a27, "get(...)");
        this.f439548e.observe(bizPCRecentReadUI3, new vr1.z((vr1.o) a27, this, bizPCRecentReadUI3));
    }
}
