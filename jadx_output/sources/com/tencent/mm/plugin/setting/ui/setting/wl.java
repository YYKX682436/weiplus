package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class wl extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f161712o;

    /* renamed from: p, reason: collision with root package name */
    public final int f161713p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI f161714q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI settingsSelectBgUI, android.content.Context context, int i17) {
        super(context, new f21.i0());
        this.f161714q = settingsSelectBgUI;
        this.f161712o = context;
        this.f161713p = i17;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        f21.i0 i0Var = (f21.i0) obj;
        if (i0Var == null) {
            i0Var = new f21.i0();
        }
        i0Var.a(cursor);
        return i0Var;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        return j().getCount() + 2;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.setting.ui.setting.jq jqVar;
        android.view.View view2;
        android.graphics.Bitmap i07;
        android.content.Context context = this.f161712o;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f489451cm0, null);
            int i18 = this.f161713p;
            view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(i18, i18));
            jqVar = new com.tencent.mm.plugin.setting.ui.setting.jq();
            jqVar.f161211a = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.mi6);
            jqVar.f161212b = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.f486804mi5);
            jqVar.f161213c = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.mi_);
            jqVar.f161214d = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.mia);
            jqVar.f161215e = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.f486803mi4);
            view2.setTag(jqVar);
        } else {
            jqVar = (com.tencent.mm.plugin.setting.ui.setting.jq) view.getTag();
            view2 = view;
        }
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12311, null), -2);
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.b wi6 = f21.r0.wi();
        com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI settingsSelectBgUI = this.f161714q;
        f21.a m07 = wi6.m0(settingsSelectBgUI.f160660m);
        if (i17 == 0) {
            boolean z17 = settingsSelectBgUI.f160659i;
            if (!(z17 && j17 == -2) && (!(!z17 && j17 == -2 && m07 == null) && (m07 == null || m07.f258833b != -2))) {
                jqVar.a("downloaded");
            } else {
                jqVar.a("using");
            }
            ((android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.mi8)).setBackgroundResource(com.tencent.mm.R.drawable.czx);
            return view2;
        }
        if (i17 == 1) {
            boolean z18 = settingsSelectBgUI.f160659i;
            if (!(z18 && j17 == 0) && (!(!z18 && j17 == 0 && m07 == null) && (m07 == null || m07.f258833b != 0))) {
                jqVar.a("downloaded");
            } else {
                jqVar.a("using");
            }
            android.content.res.Resources resources = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bh8));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$BgAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$BgAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            ((android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.mi8)).setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(decodeResource, true, settingsSelectBgUI.f160654d));
            return view2;
        }
        f21.i0 i0Var = (f21.i0) getItem(i17 - 2);
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.j0 Bi = f21.r0.Bi();
        if (gm0.j1.u().l()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            Bi.getClass();
            sb6.append(zz1.a.a());
            sb6.append(i0Var.f258913a + "_" + i0Var.f258919g + "_thumb.jpg");
            i07 = com.tencent.mm.sdk.platformtools.x.i0(sb6.toString());
        } else {
            android.content.res.Resources resources2 = settingsSelectBgUI.getResources();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bks));
            arrayList2.add(resources2);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$BgAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            i07 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.e(obj2, i07, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$BgAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        }
        if (i07 == null) {
            int i19 = i0Var.f258913a;
            int i27 = i0Var.f258919g;
            Bi.getClass();
            if (Bi.f258929d.delete("packageinfo2", "id= ? and type =?", new java.lang.String[]{"" + i19, "" + i27}) > 0) {
                Bi.doNotify();
            }
            return view2;
        }
        ((android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.mi8)).setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(i07, true, 10.0f));
        int i28 = i0Var.f258918f;
        if (i28 != 1) {
            if (i28 != 2) {
                if (i28 == 3) {
                    jqVar.a("downloading");
                } else if (i28 == 4) {
                    jqVar.a("canceling");
                } else if (i28 == 5) {
                    jqVar.a("undownloaded");
                }
            } else if (settingsSelectBgUI.f160659i || m07 == null || m07.f258833b != i0Var.f258913a) {
                jqVar.a("downloaded");
            } else {
                jqVar.a("using");
            }
        } else if (settingsSelectBgUI.f160659i || m07 == null || m07.f258833b == i0Var.f258913a) {
            jqVar.a("using");
        } else {
            jqVar.a("downloaded");
        }
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.j0 Bi = f21.r0.Bi();
        Bi.getClass();
        s(Bi.f258929d.B("select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=1", null));
        notifyDataSetChanged();
    }
}
