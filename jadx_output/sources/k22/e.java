package k22;

/* loaded from: classes13.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k22.g f303479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v75 f303480e;

    public e(k22.g gVar, r45.v75 v75Var) {
        this.f303479d = gVar;
        this.f303480e = v75Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateDesignerRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k22.g gVar = this.f303479d;
        j22.a.d(gVar.f303484e, 4, gVar.f303502z, gVar.A, gVar.f303487h);
        f22.a aVar = new f22.a();
        r45.v75 v75Var = this.f303480e;
        aVar.f364027g = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(v75Var.f387964d));
        java.lang.String str = v75Var.f387965e;
        if (str == null) {
            str = "";
        }
        aVar.f364030j = str;
        java.lang.String str2 = v75Var.f387966f;
        if (str2 == null) {
            str2 = "";
        }
        aVar.f364031k = str2;
        java.lang.String str3 = v75Var.f387967g;
        if (str3 == null) {
            str3 = "";
        }
        aVar.f364032l = str3;
        java.lang.String str4 = v75Var.f387970m;
        if (str4 == null) {
            str4 = "";
        }
        aVar.f364033m = str4;
        java.lang.String str5 = v75Var.f387969i;
        aVar.f364034n = str5 != null ? str5 : "";
        aVar.f364035o = true;
        aVar.f364155a = 67;
        f22.e.f258966a.a(gVar.f303483d, aVar);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateDesignerRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
