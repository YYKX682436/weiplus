package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class i9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.a f117149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var, xg2.a aVar) {
        super(0);
        this.f117148d = v9Var;
        this.f117149e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117148d;
        android.widget.ProgressBar progressBar = v9Var.f117489h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eib);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        rm0.j jVar = this.f117149e.f454379a;
        if (jVar != null && (str = jVar.f397426g) != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                string = str;
            }
        }
        db5.t7.f(v9Var.getContext(), string, com.tencent.mm.plugin.finder.live.viewmodel.h9.f117133a);
        return jz5.f0.f302826a;
    }
}
