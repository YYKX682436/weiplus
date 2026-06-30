package com.tencent.mm.plugin.newtips;

/* loaded from: classes8.dex */
public class NormalIconNewTipPreference extends com.tencent.mm.ui.base.preference.NormalIconPreference implements com.tencent.mm.plugin.newtips.model.a {
    public final android.content.Context Y1;
    public android.view.View Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final java.lang.String f152357a2;

    /* renamed from: b2, reason: collision with root package name */
    public java.lang.String f152358b2;

    /* renamed from: c2, reason: collision with root package name */
    public java.lang.ref.WeakReference f152359c2;

    /* renamed from: d2, reason: collision with root package name */
    public k70.f0 f152360d2;

    /* renamed from: e2, reason: collision with root package name */
    public rn3.g f152361e2;

    /* renamed from: f2, reason: collision with root package name */
    public rn3.h f152362f2;

    /* renamed from: g2, reason: collision with root package name */
    public final k70.f0 f152363g2;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f152364h2;

    public NormalIconNewTipPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        if (z17) {
            c0(8);
            b0(0);
            d0(pm6Var.f383187e, -1, android.graphics.Color.parseColor("#8c8c8c"));
            e0(true);
            Y(8);
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        if (z17) {
            a0(0);
            this.V = this.Y1.getString(com.tencent.mm.R.string.f490501wv);
            this.W = com.tencent.mm.R.drawable.asx;
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        if (z17) {
            a0(0);
            java.lang.String str = pm6Var.f383186d + "";
            if (pm6Var.f383186d > 99) {
                str = this.Y1.getString(com.tencent.mm.R.string.f493304jo3);
            }
            int b17 = com.tencent.mm.ui.tools.pd.b(this.f197770d, pm6Var.f383186d);
            this.V = str;
            this.W = b17;
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
        rn3.h hVar = this.f152362f2;
        if (hVar != null) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$c settingsUI$$c = (com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$c) hVar;
            settingsUI$$c.getClass();
            int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "plugin ShowNewTipsCallback = " + z17);
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = settingsUI$$c.f160760a;
            if (z17) {
                normalIconNewTipPreference.H("");
                return;
            }
            java.lang.String c17 = v24.s0.c();
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                return;
            }
            normalIconNewTipPreference.D = true;
            normalIconNewTipPreference.E = android.text.TextUtils.TruncateAt.END;
            normalIconNewTipPreference.H(c17);
        }
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return this.f152357a2;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        if (this.Z1 == null) {
            this.Z1 = new android.view.View(this.Y1);
        }
        return this.Z1;
    }

    public void h0() {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.a(this);
    }

    public final float i0(android.graphics.Bitmap bitmap) {
        return java.lang.Math.max(this.Y1.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479645bk) * 1.0f, java.lang.Math.min(bitmap.getHeight(), bitmap.getWidth()) * 0.1f);
    }

    public void k0() {
        com.tencent.mm.ui.base.preference.r rVar;
        java.lang.ref.WeakReference weakReference = this.f152359c2;
        if (weakReference == null || (rVar = (com.tencent.mm.ui.base.preference.r) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
    }

    public void l0(android.graphics.Bitmap bitmap) {
    }

    public void n0(com.tencent.mm.ui.base.preference.r rVar) {
        this.f152359c2 = new java.lang.ref.WeakReference(rVar);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        android.graphics.Bitmap s07;
        if (z17) {
            c0(8);
            Y(0);
            T(0);
            V(0);
            e0(false);
            android.content.Context context = this.Y1;
            android.content.res.Resources resources = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bhm));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            if (this.f152364h2) {
                android.content.res.Resources resources2 = context.getResources();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bhp));
                arrayList2.add(resources2);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.e(obj2, decodeResource, "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            }
            R(decodeResource);
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(pm6Var.f383188f);
            if (this.f152360d2 != null) {
                if (Bi != null) {
                    rn3.g gVar = this.f152361e2;
                    if (gVar != null) {
                        gVar.a(null);
                    }
                    if (this instanceof com.tencent.mm.plugin.newtips.CustomSizeIconNewTipPreference) {
                        l0(Bi);
                    }
                    R(Bi);
                } else {
                    rn3.g gVar2 = this.f152361e2;
                    if (gVar2 != null) {
                        gVar2.a(pm6Var.f383188f);
                    }
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(pm6Var.f383188f, this.f152360d2);
                }
            } else if (Bi != null) {
                this.f152358b2 = null;
                if (this.f152364h2) {
                    s07 = com.tencent.mm.sdk.platformtools.x.s0(Bi, false, Bi.getWidth() / 2);
                } else if (this instanceof com.tencent.mm.plugin.newtips.CustomSizeIconNewTipPreference) {
                    s07 = com.tencent.mm.sdk.platformtools.x.s0(Bi, false, i0(Bi));
                    l0(s07);
                } else {
                    s07 = com.tencent.mm.sdk.platformtools.x.s0(Bi, false, Bi.getWidth() * 0.1f);
                }
                R(s07);
            } else {
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(pm6Var.f383188f, this.f152363g2);
                this.f152358b2 = pm6Var.f383188f;
            }
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.NormalIconPreference, com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        if (this.Z1 == null) {
            this.Z1 = u17;
        }
        return u17;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        android.graphics.Bitmap s07;
        if (z17) {
            c0(8);
            Y(0);
            T(0);
            V(0);
            b0(0);
            e0(false);
            d0(pm6Var.f383187e, -1, android.graphics.Color.parseColor("#8c8c8c"));
            android.content.Context context = this.Y1;
            android.content.res.Resources resources = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bhm));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointPointTitleIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointPointTitleIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            if (this.f152364h2) {
                android.content.res.Resources resources2 = context.getResources();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bhp));
                arrayList2.add(resources2);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointPointTitleIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.e(obj2, decodeResource, "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointPointTitleIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            }
            R(decodeResource);
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(pm6Var.f383188f);
            if (this.f152360d2 != null) {
                if (Bi != null) {
                    rn3.g gVar = this.f152361e2;
                    if (gVar != null) {
                        gVar.a(null);
                    }
                    if (this instanceof com.tencent.mm.plugin.newtips.CustomSizeIconNewTipPreference) {
                        l0(Bi);
                    }
                    R(Bi);
                } else {
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(pm6Var.f383188f, this.f152360d2);
                    rn3.g gVar2 = this.f152361e2;
                    if (gVar2 != null) {
                        gVar2.a(pm6Var.f383188f);
                    }
                }
            } else if (Bi != null) {
                this.f152358b2 = null;
                if (this.f152364h2) {
                    s07 = com.tencent.mm.sdk.platformtools.x.s0(Bi, false, Bi.getWidth() / 2);
                } else if (this instanceof com.tencent.mm.plugin.newtips.CustomSizeIconNewTipPreference) {
                    s07 = com.tencent.mm.sdk.platformtools.x.s0(Bi, false, i0(Bi));
                    l0(s07);
                } else {
                    s07 = com.tencent.mm.sdk.platformtools.x.s0(Bi, false, Bi.getWidth() * 0.1f);
                }
                R(s07);
            } else {
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(pm6Var.f383188f, this.f152363g2);
                this.f152358b2 = pm6Var.f383188f;
            }
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        if (z17) {
            c0(0);
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    public NormalIconNewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NormalIconNewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f152358b2 = null;
        this.f152359c2 = null;
        this.f152363g2 = new rn3.f(this);
        this.f152364h2 = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, di0.a.f232623a, i17, 0);
        java.lang.String string = obtainStyledAttributes.getString(0);
        this.f152357a2 = string;
        this.Y1 = context;
        obtainStyledAttributes.recycle();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NormalIconNewTipPreference", "NormalIconNewTipPreference() path:%s", string);
    }
}
