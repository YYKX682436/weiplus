package pr1;

/* loaded from: classes9.dex */
public class b implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView f357934d;

    public b(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView) {
        this.f357934d = brandServiceSortView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag == null || !(tag instanceof pr1.k)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandServiceSortView", "view tag is null or is not a instance of ResHolder.");
            yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        pr1.k kVar = (pr1.k) tag;
        if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.f357941a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandServiceSortView", "username is null or nil.");
            yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        tg0.t1 t1Var = (tg0.t1) i95.n0.c(tg0.t1.class);
        java.lang.String str = kVar.f357941a;
        ((sg0.m3) t1Var).getClass();
        su4.t2.a(str);
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = this.f357934d;
        com.tencent.mm.ui.contact.c9.a(brandServiceSortView.f94047J, 12, 4, i17 - 1);
        if (brandServiceSortView.B) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", kVar.f357941a);
            intent.putExtra("Select_Conv_User", kVar.f357941a);
            if (brandServiceSortView.getContext() instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) brandServiceSortView.getContext();
                activity.setResult(-1, intent);
                activity.finish();
                yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
        }
        if (!brandServiceSortView.f94055z) {
            if (brandServiceSortView.f94050u == 0) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_conv_mass_send_hide_enable_android, 0) == 1) {
                    if ((c01.s0.a() & 1) != 0) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("Contact_User", kVar.f357941a);
                        intent2.putExtra("force_get_contact", true);
                        intent2.putExtra("key_use_new_contact_profile", true);
                        j45.l.j(brandServiceSortView.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
                    }
                }
            }
            java.lang.String str2 = kVar.f357941a;
            android.content.Context context = brandServiceSortView.getContext();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
            android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str2);
            putExtra.putExtra("finish_direct", true);
            putExtra.putExtra("chat_from_scene", 2);
            putExtra.putExtra("specific_chat_from_scene", 4);
            putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(putExtra, context);
        }
        pr1.i iVar = brandServiceSortView.F;
        if (iVar != null) {
            iVar.b6(i17, kVar.f357941a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
