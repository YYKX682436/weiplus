package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b9 implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f133847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f133848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e9 f133849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f133850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133853g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.neattextview.textview.view.NeatTextView f133854h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f133855i;

    public b9(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var, android.widget.TextView textView, android.view.View view, android.view.View view2, android.view.View view3, com.tencent.neattextview.textview.view.NeatTextView neatTextView, android.widget.TextView textView2) {
        this.f133847a = h0Var;
        this.f133848b = finderEmojiView;
        this.f133849c = e9Var;
        this.f133850d = textView;
        this.f133851e = view;
        this.f133852f = view2;
        this.f133853g = view3;
        this.f133854h = neatTextView;
        this.f133855i = textView2;
    }

    @Override // sr.b
    public void a(int i17) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) this.f133847a.f310123d;
        boolean z17 = iEmojiInfo != null && iEmojiInfo.E0();
        com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var = this.f133849c;
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = this.f133848b;
        if (!z17 && i17 != 1) {
            if (i17 == 0 || i17 != -1) {
                return;
            }
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.a9(finderEmojiView, e9Var));
            return;
        }
        finderEmojiView.setAlpha(1.0f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showEmojiView emojiView height=");
        sb6.append(finderEmojiView.getHeight());
        sb6.append(" posY=");
        sb6.append(finderEmojiView.getY());
        sb6.append(" location=");
        int[] iArr = new int[2];
        finderEmojiView.getLocationInWindow(iArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        for (int i18 = 0; i18 < 2; i18++) {
            arrayList.add(java.lang.Integer.valueOf(iArr[i18]));
        }
        sb6.append(arrayList);
        sb6.append(';');
        com.tencent.mars.xlog.Log.i("Finder.DescCommentContentUIC", sb6.toString());
        android.widget.TextView prefix = this.f133850d;
        kotlin.jvm.internal.o.f(prefix, "$prefix");
        android.view.View contentContainer = this.f133851e;
        kotlin.jvm.internal.o.f(contentContainer, "$contentContainer");
        android.view.View postfixRightLikeIcon = this.f133852f;
        kotlin.jvm.internal.o.f(postfixRightLikeIcon, "$postfixRightLikeIcon");
        android.view.View postfixContainer = this.f133853g;
        kotlin.jvm.internal.o.f(postfixContainer, "$postfixContainer");
        com.tencent.neattextview.textview.view.NeatTextView commentText = this.f133854h;
        kotlin.jvm.internal.o.f(commentText, "$commentText");
        android.widget.TextView commentPostfix = this.f133855i;
        kotlin.jvm.internal.o.f(commentPostfix, "$commentPostfix");
        e9Var.getClass();
        contentContainer.post(new com.tencent.mm.plugin.finder.viewmodel.component.c9(contentContainer, prefix, commentPostfix, e9Var, postfixRightLikeIcon, postfixContainer, commentText));
    }
}
