package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class c6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f131751d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f131752e;

    /* renamed from: f, reason: collision with root package name */
    public int f131753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentEditText f131754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f131755h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f131756i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(com.tencent.mm.plugin.finder.view.FinderCommentEditText finderCommentEditText, java.lang.CharSequence charSequence, android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f131754g = finderCommentEditText;
        this.f131755h = charSequence;
        this.f131756i = viewGroup;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.c6(this.f131754g, this.f131755h, this.f131756i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.c6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f131753f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.view.FinderCommentEditText finderCommentEditText = this.f131754g;
            android.widget.TextView textView = new android.widget.TextView(finderCommentEditText.getContext());
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(finderCommentEditText.getWidth(), finderCommentEditText.getHeight());
            android.view.ViewGroup.LayoutParams layoutParams2 = finderCommentEditText.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            layoutParams.topMargin = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams3 = finderCommentEditText.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            layoutParams.bottomMargin = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams4 = finderCommentEditText.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            layoutParams.leftMargin = marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams5 = finderCommentEditText.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
            layoutParams.rightMargin = marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0;
            textView.setLayoutParams(layoutParams);
            textView.setTextSize(0, finderCommentEditText.getTextSize());
            textView.setText(this.f131755h);
            textView.setGravity(16);
            textView.setPadding(finderCommentEditText.getPaddingLeft(), finderCommentEditText.getPaddingTop(), finderCommentEditText.getPaddingRight(), finderCommentEditText.getPaddingBottom());
            textView.setTextColor(finderCommentEditText.getHintTextColors());
            textView.setAlpha(0.0f);
            android.view.ViewGroup viewGroup = this.f131756i;
            viewGroup.addView(textView, viewGroup.indexOfChild(finderCommentEditText) + 1);
            finderCommentEditText.getLocalVisibleRect(new android.graphics.Rect());
            textView.setTranslationX(r4.left);
            textView.setTranslationY(r4.top);
            this.f131751d = textView;
            this.f131752e = viewGroup;
            this.f131753f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            if (!textView.post(new com.tencent.mm.plugin.finder.view.b6(rVar, textView))) {
                viewGroup.removeView(textView);
                rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
