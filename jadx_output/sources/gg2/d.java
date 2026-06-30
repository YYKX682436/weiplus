package gg2;

/* loaded from: classes2.dex */
public final class d extends gg2.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f271666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f271666b = "LiveExpNineteenItem";
    }

    @Override // gg2.b
    public java.lang.Object a(android.view.View view, kotlin.coroutines.Continuation continuation) {
        java.lang.CharSequence charSequence;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.lang.CharSequence descriptionSpan;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        view.setOnClickListener(new gg2.c(this));
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.f484250t90);
        if (mMNeat7extView == null) {
            return java.lang.Boolean.FALSE;
        }
        boolean z17 = true;
        mMNeat7extView.setMaxLines(1);
        tc2.g gVar = this.f271664a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        java.lang.CharSequence charSequence2 = "";
        if (baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null || (charSequence = feedObject2.getDescriptionSpan()) == null) {
            charSequence = "";
        }
        com.tencent.mm.plugin.finder.feed.ui.sq b17 = com.tencent.mm.plugin.finder.feed.ui.h2.f110102a.b(mMNeat7extView.getContext(), gVar.f417148h);
        if ((charSequence.length() == 0) && b17 == null) {
            mMNeat7extView.setVisibility(8);
            z17 = false;
        } else {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
            if (baseFinderFeed2 != null && (feedObject = baseFinderFeed2.getFeedObject()) != null && (descriptionSpan = feedObject.getDescriptionSpan()) != null) {
                charSequence2 = descriptionSpan;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence2);
            if (b17 != null) {
                spannableStringBuilder.insert(0, (java.lang.CharSequence) " ");
                spannableStringBuilder.setSpan(b17, 0, 1, 17);
            }
            mMNeat7extView.b(new android.text.SpannableString(spannableStringBuilder));
            mMNeat7extView.setVisibility(0);
        }
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // gg2.b
    public int c() {
        return com.tencent.mm.R.layout.e_b;
    }

    @Override // gg2.b
    public int e() {
        return 1;
    }

    @Override // gg2.b
    public java.lang.String f() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        android.text.SpannableString descriptionSpan;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f271664a.f417148h;
        java.lang.String spannableString = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (descriptionSpan = feedObject.getDescriptionSpan()) == null) ? null : descriptionSpan.toString();
        return spannableString == null ? "" : spannableString;
    }

    @Override // gg2.b
    public int g() {
        return 19;
    }

    @Override // gg2.b
    public java.lang.String i() {
        return this.f271666b;
    }
}
