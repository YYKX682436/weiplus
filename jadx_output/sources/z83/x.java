package z83;

/* loaded from: classes5.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI f470758d;

    public x(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI kidsWatchRegRebindUI) {
        this.f470758d = kidsWatchRegRebindUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI.f143166q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startExtReg, ");
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI kidsWatchRegRebindUI = this.f470758d;
        java.lang.String str = kidsWatchRegRebindUI.f143169f;
        if (str == null) {
            kotlin.jvm.internal.o.o("nickName");
            throw null;
        }
        sb6.append(str);
        sb6.append(", ");
        sb6.append(kidsWatchRegRebindUI.f143175o);
        sb6.append(", ");
        sb6.append(kidsWatchRegRebindUI.f143172i);
        sb6.append(", 4");
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegRebindUI", sb6.toString());
        gm0.j1.d().a(5888, kidsWatchRegRebindUI);
        java.lang.String str2 = kidsWatchRegRebindUI.f143169f;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("nickName");
            throw null;
        }
        java.lang.String str3 = kidsWatchRegRebindUI.f143168e;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("mobile");
            throw null;
        }
        boolean z17 = kidsWatchRegRebindUI.f143175o;
        java.lang.String str4 = kidsWatchRegRebindUI.f143167d;
        if (str4 == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        java.lang.String str5 = kidsWatchRegRebindUI.f143170g;
        if (str5 == null) {
            kotlin.jvm.internal.o.o("headImgFileID");
            throw null;
        }
        java.lang.String str6 = kidsWatchRegRebindUI.f143171h;
        if (str6 == null) {
            kotlin.jvm.internal.o.o("headImgAesKey");
            throw null;
        }
        x83.h hVar = new x83.h(str2, str3, 4, z17, str4, str5, str6);
        hVar.H(kidsWatchRegRebindUI.f143172i);
        gm0.j1.d().g(hVar);
        kidsWatchRegRebindUI.f143174n = db5.e1.Q(kidsWatchRegRebindUI, kidsWatchRegRebindUI.getString(com.tencent.mm.R.string.f490573yv), kidsWatchRegRebindUI.getString(com.tencent.mm.R.string.g8h), true, true, new z83.z(hVar, kidsWatchRegRebindUI));
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
