package mo1;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f330314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f330316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f330317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f330318h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI, qo1.j0 j0Var, com.tencent.wechat.aff.affroam.n0 n0Var, qo1.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330315e = roamLiteTaskDetailUI;
        this.f330316f = j0Var;
        this.f330317g = n0Var;
        this.f330318h = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mo1.o0(this.f330315e, this.f330316f, this.f330317g, this.f330318h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mo1.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f330314d;
        com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI = this.f330315e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f330314d = 1;
            if (com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.U6(roamLiteTaskDetailUI, this.f330316f, this.f330317g, this.f330318h, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        em.d4 d4Var = roamLiteTaskDetailUI.f92715f;
        if (d4Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (d4Var.f254235b == null) {
            d4Var.f254235b = (android.widget.TextView) d4Var.f254234a.findViewById(com.tencent.mm.R.id.knt);
        }
        android.widget.TextView textView = d4Var.f254235b;
        go1.d dVar = go1.d.f273944a;
        com.tencent.wechat.aff.affroam.g gVar = roamLiteTaskDetailUI.f92714e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        textView.setText(dVar.a(gVar));
        em.d4 d4Var2 = roamLiteTaskDetailUI.f92715f;
        if (d4Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (d4Var2.f254236c == null) {
            d4Var2.f254236c = (com.tencent.mm.ui.widget.imageview.WeImageView) d4Var2.f254234a.findViewById(com.tencent.mm.R.id.ria);
        }
        d4Var2.f254236c.setImageResource(com.tencent.mm.R.raw.icons_outlined_display_backup);
        return jz5.f0.f302826a;
    }
}
