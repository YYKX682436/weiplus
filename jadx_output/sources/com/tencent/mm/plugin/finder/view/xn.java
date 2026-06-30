package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class xn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133358e;

    public xn(java.lang.String str, android.view.View view) {
        this.f133357d = str;
        this.f133358e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mn2.n nVar = new mn2.n(this.f133357d, com.tencent.mm.plugin.finder.storage.y90.V);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = nVar.f330060e;
        if (str == null) {
            str = "";
        } else if (!r26.i0.n(str, "/0", false)) {
            jz5.g gVar = nVar.f330062g;
            java.lang.String str2 = (java.lang.String) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(str2, "<get-smallSizeUrl>(...)");
            boolean n17 = r26.i0.n(str, str2, false);
            jz5.g gVar2 = nVar.f330063h;
            if (n17) {
                int length = str.length() - ((java.lang.String) ((jz5.n) gVar).getValue()).length();
                int length2 = str.length();
                java.lang.String str3 = (java.lang.String) ((jz5.n) gVar2).getValue();
                kotlin.jvm.internal.o.f(str3, "<get-originSizeUrl>(...)");
                str = r26.n0.b0(str, length, length2, str3).toString();
            } else {
                jz5.g gVar3 = nVar.f330061f;
                java.lang.String str4 = (java.lang.String) ((jz5.n) gVar3).getValue();
                kotlin.jvm.internal.o.f(str4, "<get-mediumSizeUrl>(...)");
                if (r26.i0.n(str, str4, false)) {
                    int length3 = str.length() - ((java.lang.String) ((jz5.n) gVar3).getValue()).length();
                    int length4 = str.length();
                    java.lang.String str5 = (java.lang.String) ((jz5.n) gVar2).getValue();
                    kotlin.jvm.internal.o.f(str5, "<get-originSizeUrl>(...)");
                    str = r26.n0.b0(str, length3, length4, str5).toString();
                }
            }
        }
        intent.putStringArrayListExtra("key_url_list", new java.util.ArrayList<>(kz5.b0.c(str)));
        intent.putExtra("key_preview_avatar", true);
        android.view.View view2 = this.f133358e;
        android.content.Context context = view2.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xy2.c.c(context, intent);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context2 = view2.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        i0Var.Bj(context2, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
