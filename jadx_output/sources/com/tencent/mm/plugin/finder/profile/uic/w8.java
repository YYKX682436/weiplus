package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class w8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124320e;

    public w8(com.tencent.mm.plugin.finder.profile.uic.ob obVar, ya2.b2 b2Var) {
        this.f124319d = obVar;
        this.f124320e = b2Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124319d;
        android.text.SpannableString spannableString = new android.text.SpannableString(obVar.f7().getText());
        spannableString.setSpan(new android.text.style.BackgroundColorSpan(obVar.getContext().getResources().getColor(com.tencent.mm.R.color.FG_3)), 0, obVar.f7().getText().length(), 33);
        obVar.f7().setText(spannableString);
        rl5.r rVar = new rl5.r(obVar.getContext(), view);
        rVar.f397351u = new com.tencent.mm.plugin.finder.profile.uic.t8(obVar);
        rVar.f397354x = new com.tencent.mm.plugin.finder.profile.uic.u8(obVar);
        rVar.L = new com.tencent.mm.plugin.finder.profile.uic.v8(obVar, this.f124320e);
        int i17 = com.tencent.mm.view.TouchableLayout.f213511d;
        boolean n17 = rVar.n(com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        yj0.a.i(n17, this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return n17;
    }
}
