package o00;

/* loaded from: classes8.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f341872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI f341874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341875g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z17, java.lang.String str, com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f341872d = z17;
        this.f341873e = str;
        this.f341874f = ecsGiftSendThanksLogicUI;
        this.f341875g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new o00.o(this.f341872d, this.f341873e, this.f341874f, this.f341875g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((o00.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f341872d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f341873e;
        com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI = this.f341874f;
        if (!z17) {
            db5.e1.y(ecsGiftSendThanksLogicUI, ecsGiftSendThanksLogicUI.getString(com.tencent.mm.storage.z3.R4(str) ? com.tencent.mm.R.string.nes : com.tencent.mm.R.string.neu), "", ecsGiftSendThanksLogicUI.getString(com.tencent.mm.R.string.l_e), new o00.k(ecsGiftSendThanksLogicUI));
            return f0Var;
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(ecsGiftSendThanksLogicUI);
        y1Var.j(com.tencent.mm.R.layout.e39);
        android.widget.TextView textView = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.c_w);
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            boolean R4 = com.tencent.mm.storage.z3.R4(str);
            java.lang.String str2 = this.f341875g;
            textView.setText(R4 ? ecsGiftSendThanksLogicUI.getResources().getString(com.tencent.mm.R.string.nem, str2, e17) : ecsGiftSendThanksLogicUI.getResources().getString(com.tencent.mm.R.string.nen, str2));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.sxr);
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.storage.z3.R4(str) ? com.tencent.mm.R.drawable.da9 : com.tencent.mm.R.drawable.da_);
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        android.view.View findViewById = y1Var.f212027f.findViewById(com.tencent.mm.R.id.sxo);
        if (findViewById != null) {
            findViewById.setOnClickListener(new o00.l(y1Var));
        }
        android.view.View findViewById2 = y1Var.f212027f.findViewById(com.tencent.mm.R.id.sxp);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new o00.m(c0Var, y1Var));
        }
        y1Var.f212037s = new o00.n(ecsGiftSendThanksLogicUI, c0Var);
        y1Var.s();
        return f0Var;
    }
}
