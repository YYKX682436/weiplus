package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class y extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int f162352o;

    /* renamed from: p, reason: collision with root package name */
    public bb5.e f162353p;

    /* renamed from: q, reason: collision with root package name */
    public bb5.g f162354q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeItemListUI f162355r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI, com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI2) {
        super(shakeItemListUI2, new c34.r());
        this.f162355r = shakeItemListUI;
        this.f162352o = 0;
        this.f162353p = null;
        this.f162354q = new bb5.g(15, new com.tencent.mm.plugin.shake.ui.v(this));
        o();
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        c34.r rVar = (c34.r) obj;
        if (rVar == null) {
            rVar = new c34.r();
        }
        if (cursor != null) {
            rVar.convertFrom(cursor);
        }
        return rVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.shake.ui.x xVar;
        android.view.View view2;
        if (this.f162353p == null) {
            this.f162353p = new com.tencent.mm.plugin.shake.ui.w(this);
        }
        bb5.g gVar = this.f162354q;
        if (gVar != null) {
            gVar.b(i17, this.f162353p);
        }
        if (view == null) {
            xVar = new com.tencent.mm.plugin.shake.ui.x(this);
            view2 = android.view.View.inflate(this.f212608e, com.tencent.mm.R.layout.cmk, null);
            xVar.f162340a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5l);
            xVar.f162341b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5r);
            xVar.f162343d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5o);
            xVar.f162344e = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5t);
            xVar.f162345f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5m);
            xVar.f162346g = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5u);
            xVar.f162347h = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5w);
            xVar.f162348i = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.mrx);
            xVar.f162342c = view2.findViewById(com.tencent.mm.R.id.m4c);
            xVar.f162349j = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.mqt);
            xVar.f162350k = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.mqu);
            view2.setTag(xVar);
        } else {
            xVar = (com.tencent.mm.plugin.shake.ui.x) view.getTag();
            view2 = view;
        }
        c34.r rVar = (c34.r) getItem(i17);
        if (rVar == null) {
            xVar.a();
            return view2;
        }
        xVar.a();
        int i18 = rVar.field_type;
        if (4 == i18 || (h34.z.d(i18) && 6 != rVar.field_type)) {
            if (4 != rVar.field_type) {
                xVar.f162340a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            com.tencent.mm.plugin.shake.ui.f1.b(xVar.f162340a, rVar.field_sns_bgurl, com.tencent.mm.R.raw.app_attach_file_icon_webpage, false);
        } else if (11 == rVar.field_type) {
            this.f162355r.f162099m.g(rVar.u0(), xVar.f162340a);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(xVar.f162340a, rVar.field_username, null);
        }
        xVar.f162340a.setVisibility(0);
        int i19 = rVar.field_type;
        if (7 == i19 || 10 == i19 || 12 == i19 || 13 == i19 || (8 == i19 && com.tencent.mm.sdk.platformtools.t8.K0(rVar.field_nickname) && com.tencent.mm.sdk.platformtools.t8.K0(rVar.field_username))) {
            if (8 == rVar.field_type) {
                xVar.f162350k.setText(rVar.field_distance);
            } else {
                xVar.f162350k.setText(rVar.field_nickname);
            }
            xVar.f162350k.setVisibility(0);
            xVar.f162349j.setVisibility(8);
            return view2;
        }
        xVar.f162350k.setVisibility(8);
        xVar.f162349j.setVisibility(0);
        if (8 == rVar.field_type && com.tencent.mm.sdk.platformtools.t8.K0(rVar.field_nickname)) {
            rVar.field_nickname = rVar.field_distance;
            rVar.field_distance = rVar.field_username;
        }
        java.lang.String str = rVar.field_nickname;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = xVar.f162341b;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f212608e;
        float textSize = xVar.f162341b.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        xVar.f162341b.setVisibility(0);
        int paddingBottom = view2.getPaddingBottom();
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), paddingBottom);
        int i27 = rVar.field_type;
        if (i27 == 1 || i27 == 2 || i27 == 3) {
            xVar.f162348i.setText(rVar.field_nickname);
            xVar.f162348i.setVisibility(0);
            return view2;
        }
        android.view.View view3 = xVar.f162342c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        xVar.f162345f.setText(rVar.field_distance);
        xVar.f162345f.setVisibility(0);
        java.lang.String str2 = rVar.field_signature;
        if (str2 == null || str2.trim().equals("")) {
            xVar.f162346g.setVisibility(8);
        } else {
            xVar.f162346g.setVisibility(0);
            android.widget.TextView textView2 = xVar.f162346g;
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = this.f212608e;
            java.lang.String str3 = rVar.field_signature;
            float textSize2 = xVar.f162341b.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str3, textSize2));
        }
        int i28 = rVar.field_sex;
        if (i28 == 1) {
            xVar.f162344e.setVisibility(0);
            xVar.f162344e.setImageDrawable(i65.a.i(this.f212608e, com.tencent.mm.R.raw.ic_sex_male));
            xVar.f162344e.setContentDescription(this.f212608e.getString(com.tencent.mm.R.string.f492467gr0));
        } else if (i28 == 2) {
            xVar.f162344e.setVisibility(0);
            xVar.f162344e.setImageDrawable(i65.a.i(this.f212608e, com.tencent.mm.R.raw.ic_sex_female));
            xVar.f162344e.setContentDescription(this.f212608e.getString(com.tencent.mm.R.string.cea));
        } else {
            xVar.f162344e.setVisibility(8);
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(rVar.field_username, true);
        if (n17 == null || !n17.r2()) {
            xVar.f162343d.setVisibility(8);
        } else {
            xVar.f162343d.setVisibility(0);
            if (com.tencent.mm.storage.z3.D3(rVar.field_reserved1)) {
                xVar.f162343d.setText(this.f212608e.getString(com.tencent.mm.R.string.f492620h62));
            } else {
                xVar.f162343d.setText(this.f212608e.getString(com.tencent.mm.R.string.h67));
            }
        }
        if (6 == rVar.field_type) {
            xVar.f162345f.setText(this.f212608e.getString(com.tencent.mm.R.string.j2c));
            xVar.f162343d.setVisibility(8);
        }
        if (rVar.field_reserved1 == 0 || c01.n8.b() == null) {
            xVar.f162347h.setVisibility(8);
        } else {
            xVar.f162347h.setVisibility(0);
            xVar.f162347h.setImageBitmap(com.tencent.mm.sdk.platformtools.j.a(((xf4.d) c01.n8.b()).b(rVar.field_reserved1, true), 2.0f));
            xVar.f162344e.setVisibility(8);
        }
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        if (gm0.j1.a()) {
            int i17 = this.f162352o;
            if (i17 == -12) {
                c34.s Ni = c34.h0.Ni();
                int intExtra = this.f162355r.getIntent().getIntExtra("_ibeacon_new_insert_size", 2);
                Ni.getClass();
                s(Ni.rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc limit ? ", "11", "" + intExtra));
            } else if (i17 == 11) {
                s(c34.h0.Ni().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", "11"));
            } else if (i17 == 100) {
                s(c34.h0.Ni().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   order by shakeItemID desc ", new java.lang.String[0]));
            } else if (i17 == -6) {
                s(c34.h0.Ni().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", "8", "2"));
            } else if (i17 == -5) {
                s(c34.h0.Ni().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", "4", "2"));
            } else if (i17 == -1) {
                s(c34.h0.Ni().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by reserved2 desc, shakeItemID desc ", "0", "2"));
            } else if (i17 == 0) {
                s(c34.h0.Ni().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", "0"));
            } else if (i17 == 4) {
                s(c34.h0.Ni().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by shakeItemID desc ", "4"));
            } else if (i17 == 5) {
                s(c34.h0.Ni().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type in (?, ?, ?, ?, ?) order by shakeItemID desc ", "7", "6", "8", "9", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "12"));
            }
            notifyDataSetChanged();
        }
    }
}
