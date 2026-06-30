package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bq.z1 f123546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.o0 f123547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(bq.z1 z1Var, com.tencent.mm.plugin.finder.profile.uic.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f123546d = z1Var;
        this.f123547e = o0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.b0(this.f123546d, this.f123547e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.profile.uic.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bq.z1 z1Var = this.f123546d;
        java.lang.String str = z1Var.f23542t;
        com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = this.f123547e;
        boolean b17 = kotlin.jvm.internal.o.b(str, o0Var.getUsername());
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (b17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username=");
            sb6.append(o0Var.getUsername());
            sb6.append(", scene username=");
            com.tencent.mm.protocal.protobuf.FinderContact J2 = z1Var.J();
            sb6.append(J2 != null ? J2.getUsername() : null);
            com.tencent.mars.xlog.Log.i("Finder.SelfProfileActionBarUIC", sb6.toString());
            ya2.b2 b18 = ya2.h.f460484a.b(o0Var.getUsername());
            if (b18 == null) {
                return f0Var;
            }
            android.widget.TextView textView = (android.widget.TextView) ((jz5.n) o0Var.f124035w).getValue();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity = o0Var.getActivity();
            java.lang.String z07 = b18.z0();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, z07));
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(b18.y0(), null, 2, null);
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) o0Var.f124034v).getValue();
            kotlin.jvm.internal.o.f(imageView, "access$getActionBarAvatarIv(...)");
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        }
        return f0Var;
    }
}
