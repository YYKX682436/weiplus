package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class n9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendReadingView f132699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f132702g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f132703h;

    public n9(com.tencent.mm.plugin.finder.view.FinderExtendReadingView finderExtendReadingView, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2) {
        this.f132699d = finderExtendReadingView;
        this.f132700e = str;
        this.f132701f = str2;
        this.f132702g = num;
        this.f132703h = num2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendReadingView$updateVerifiedTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.r rVar = this.f132699d.f131048f;
        if (rVar != null) {
            java.lang.String str = this.f132700e;
            kotlin.jvm.internal.o.d(str);
            java.lang.String str2 = this.f132701f;
            kotlin.jvm.internal.o.d(str2);
            java.lang.Integer num = this.f132702g;
            kotlin.jvm.internal.o.d(num);
            java.lang.Integer num2 = this.f132703h;
            kotlin.jvm.internal.o.d(num2);
            rVar.C(str, str2, num, num2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView$updateVerifiedTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
