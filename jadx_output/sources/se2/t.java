package se2;

/* loaded from: classes2.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f406885d;

    /* renamed from: e, reason: collision with root package name */
    public int f406886e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f406887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406888g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f406889h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f406890i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f406891m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f406892n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.view.View view, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.view.MMPAGView mMPAGView, android.widget.TextView textView, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406888g = view;
        this.f406889h = weImageView;
        this.f406890i = mMPAGView;
        this.f406891m = textView;
        this.f406892n = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        se2.t tVar = new se2.t(this.f406888g, this.f406889h, this.f406890i, this.f406891m, this.f406892n, continuation);
        tVar.f406887f = obj;
        return tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((se2.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int a17;
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f406886e;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f406889h;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f406890i;
        android.widget.TextView textView = this.f406891m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f406887f;
            android.view.View view = this.f406888g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$showLikeAnimAndPostLike$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$showLikeAnimAndPostLike$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(8);
            mMPAGView.setVisibility(0);
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479048oc));
            a17 = com.tencent.mm.sdk.platformtools.b8.a(textView.getText().toString());
            weImageView.setIconColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479048oc));
            se2.s sVar = new se2.s(ae2.in.f3688a.a(ym5.f6.f463322s), mMPAGView, null);
            this.f406887f = y0Var;
            this.f406885d = a17;
            this.f406886e = 1;
            c17 = kotlinx.coroutines.a4.c(3000L, sVar, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i18 = this.f406885d;
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
            a17 = i18;
        }
        jz5.f0 f0Var = (jz5.f0) c17;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveGroupCommentHelper", "showLikeAnimAndPostLike pag anim wait timeout(3000 ms), fallback to continue");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                mMPAGView.n();
                kotlin.Result.m521constructorimpl(f0Var2);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        }
        weImageView.setVisibility(0);
        textView.setText(java.lang.String.valueOf(a17 + 1));
        textView.setVisibility(0);
        mMPAGView.setVisibility(8);
        this.f406892n.invoke();
        return f0Var2;
    }
}
