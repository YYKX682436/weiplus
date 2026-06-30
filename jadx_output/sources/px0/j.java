package px0;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d01 f358783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment, r45.d01 d01Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358782e = materialImportPreviewFragment;
        this.f358783f = d01Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new px0.j(this.f358782e, this.f358783f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((px0.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f358781d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_maas_mj_aigc_remind_delay_show_ms, 5000L);
            if (Ui < 0) {
                Ui = 0;
            }
            this.f358781d = 1;
            if (kotlinx.coroutines.k1.b(Ui, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int integer = this.f358783f.getInteger(6) * 60;
        com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358782e;
        materialImportPreviewFragment.f69656t = integer;
        int i18 = materialImportPreviewFragment.f69656t;
        materialImportPreviewFragment.getClass();
        if (i18 < 3600) {
            int ceil = (int) java.lang.Math.ceil(i18 / 60.0d);
            if (ceil < 1) {
                ceil = 1;
            }
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493135oi5, java.lang.Integer.valueOf(ceil));
            kotlin.jvm.internal.o.d(string);
        } else {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493134oi4, java.lang.Integer.valueOf(i18 / 3600));
            kotlin.jvm.internal.o.d(string);
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.oia);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        materialImportPreviewFragment.n0(string, string2, true);
        return jz5.f0.f302826a;
    }
}
