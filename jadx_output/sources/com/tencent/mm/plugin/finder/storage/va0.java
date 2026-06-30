package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class va0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f128183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f128184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(boolean z17, android.content.Context context) {
        super(1);
        this.f128183d = z17;
        this.f128184e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String detailSuffix = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(detailSuffix, "detailSuffix");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("k_sns_tag_id", 4L);
        intent.putExtra("k_sns_from_settings_about_sns", 1);
        intent.putExtra("BLOCK_LIST_TYPE", 1);
        boolean z17 = this.f128183d;
        android.content.Context context = this.f128184e;
        if (z17) {
            intent.setClassName(context, "com.tencent.mm.ui.contact.privacy.SnsTagDetailUI");
            intent.setFlags(268435456);
            android.content.Context context2 = this.f128184e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/storage/FinderNotSeeMyListConfig$getSubTitle$1", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/storage/FinderNotSeeMyListConfig$getSubTitle$1", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            j45.l.j(context, "sns", ".ui.SnsBlackDetailUI", intent, null);
        }
        return jz5.f0.f302826a;
    }
}
