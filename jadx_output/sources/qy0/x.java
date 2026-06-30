package qy0;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(qy0.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367665e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy0.x(this.f367665e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy0.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367664d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        qy0.d0 d0Var = this.f367665e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager X6 = d0Var.X6();
            this.f367664d = 1;
            X6.c();
            kotlinx.coroutines.r2 r2Var = X6.f69750o;
            if (r2Var == null || (obj2 = ((kotlinx.coroutines.c3) r2Var).C(this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo = d0Var.W6().f69772h;
        if (maasAlbumTemplateSnsFeedInfo != null && maasAlbumTemplateSnsFeedInfo.f69780i) {
            super/*py0.y*/.Q1();
            d0Var.f367583y.e("@@no_template@@");
            d0Var.a7(false, false);
        } else if (d0Var.f367583y.f70099q) {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "onPreview: show directly");
            qy0.d0.U6(d0Var);
        } else {
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            c0Var.f310112d = true;
            android.app.Activity context = d0Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69787h.removeObservers(d0Var.getActivity());
            android.app.Activity context2 = d0Var.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).c(dz0.l.class))).f69787h.observe(d0Var.getActivity(), new qy0.w(d0Var, c0Var));
        }
        return f0Var;
    }
}
