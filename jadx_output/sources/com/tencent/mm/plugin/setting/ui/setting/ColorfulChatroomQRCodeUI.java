package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(2336)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/ColorfulChatroomQRCodeUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(0)
/* loaded from: classes5.dex */
public final class ColorfulChatroomQRCodeUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f160124u = 0;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f160132n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f160133o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f160134p;

    /* renamed from: s, reason: collision with root package name */
    public int f160137s;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f160125d = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.c1(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f160126e = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.j0(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f160127f = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.k0(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f160128g = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.l0(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f160129h = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.s0(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f160130i = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.h1(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f160131m = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.i1(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f160135q = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.d1(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f160136r = jz5.h.b(com.tencent.mm.plugin.setting.ui.setting.b1.f160852d);

    /* renamed from: t, reason: collision with root package name */
    public final r14.y f160138t = new r14.y(this, new com.tencent.mm.plugin.setting.ui.setting.y0(this), a7());

    public static final void U6(com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        colorfulChatroomQRCodeUI.getClass();
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(colorfulChatroomQRCodeUI, new com.tencent.mm.plugin.setting.ui.setting.p0(colorfulChatroomQRCodeUI), new com.tencent.mm.plugin.setting.ui.setting.q0(colorfulChatroomQRCodeUI));
    }

    public final android.graphics.Bitmap V6() {
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.Object value = ((jz5.n) this.f160126e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.ImageView) value).getHitRect(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        java.lang.Object value2 = ((jz5.n) this.f160129h).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.TextView) value2).getHitRect(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        X6().getHitRect(rect3);
        int max = java.lang.Math.max(java.lang.Math.min(rect2.left, rect3.left) - b7(), 0);
        int max2 = java.lang.Math.max(rect.top - b7(), 0);
        int max3 = java.lang.Math.max(rect2.right, rect3.right) + b7();
        jz5.g gVar = this.f160125d;
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        int min = java.lang.Math.min(max3, ((android.view.View) value3).getWidth());
        int b76 = rect2.bottom + b7();
        java.lang.Object value4 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        android.graphics.Rect rect4 = new android.graphics.Rect(max, max2, min, java.lang.Math.min(b76, ((android.view.View) value4).getHeight()));
        java.lang.Object value5 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0((android.view.View) value5);
        kotlin.jvm.internal.o.f(b07, "getBitmapFromView(...)");
        int i17 = rect4.left;
        int i18 = rect4.top;
        int width = rect4.width();
        int height = rect4.height();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(b07);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/ColorfulChatroomQRCodeUI", "createQRBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/setting/ui/setting/ColorfulChatroomQRCodeUI", "createQRBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        b07.recycle();
        return createBitmap;
    }

    public final com.tencent.mm.ui.widget.MMNeat7extView W6() {
        java.lang.Object value = ((jz5.n) this.f160127f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.MMNeat7extView) value;
    }

    public final android.widget.ImageView X6() {
        java.lang.Object value = ((jz5.n) this.f160128g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    public final java.lang.String Y6(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, boolean z17) {
        if (this.f160137s == 0) {
            this.f160137s = ((int) mMNeat7extView.getPaint().measureText("a")) * 2;
        }
        if (z17) {
            if (mMNeat7extView.getPaint().measureText(str + str3) < (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479695cu) - this.f160137s) * 2) {
                return str + str3;
            }
        }
        java.lang.String str4 = str + str2 + str3;
        return mMNeat7extView.getPaint().measureText(str4) >= ((float) ((getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479695cu) - this.f160137s) * 2)) ? Y6(str.subSequence(0, str.length() - 1).toString(), str2, str3, mMNeat7extView, false) : str4;
    }

    public final void Z6(int i17) {
        com.tencent.mm.modelbase.m1 m1Var;
        if (com.tencent.mm.storage.z3.q4(getUserName())) {
            ab0.y yVar = (ab0.y) i95.n0.c(ab0.y.class);
            java.lang.String userName = getUserName();
            ((za0.i) yVar).getClass();
            m1Var = new l41.w(userName);
            gm0.j1.d().g(m1Var);
        } else {
            kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
            java.lang.String userName2 = getUserName();
            ((jd0.q2) x2Var).getClass();
            g21.a aVar = new g21.a(userName2, md1.f1.CTRL_INDEX, i17);
            gm0.j1.d().g(aVar);
            m1Var = aVar;
        }
        this.f160134p = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492749hq2), true, true, new com.tencent.mm.plugin.setting.ui.setting.r0(m1Var, this));
    }

    public final v24.e a7() {
        return (v24.e) this.f160136r.getValue();
    }

    public final int b7() {
        return ((java.lang.Number) ((jz5.n) this.f160135q).getValue()).intValue();
    }

    public final android.widget.TextView c7() {
        java.lang.Object value = ((jz5.n) this.f160130i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r01.z.j(r0) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7(int r3, int r4, java.lang.String r5, com.tencent.mm.plugin.setting.ui.setting.n1 r6) {
        /*
            r2 = this;
            o25.s1 r0 = f14.g.a()
            androidx.appcompat.app.AppCompatActivity r1 = r2.getContext()
            com.tencent.mm.app.o7 r0 = (com.tencent.mm.app.o7) r0
            r0.getClass()
            r0 = 7
            boolean r5 = com.tencent.mm.ui.pc.a(r1, r3, r4, r5, r0)
            if (r5 == 0) goto L15
            return
        L15:
            r5 = 0
            if (r3 != 0) goto Lc9
            if (r4 == 0) goto L1c
            goto Lc9
        L1c:
            byte[] r3 = r6.b()
            r2.f160132n = r3
            byte[] r3 = r6.b()
            r4 = 1
            if (r3 == 0) goto L41
            byte[] r3 = r6.b()
            if (r3 == 0) goto L34
            int r3 = r3.length
            if (r3 != 0) goto L34
            r3 = r4
            goto L35
        L34:
            r3 = r5
        L35:
            if (r3 == 0) goto L38
            goto L41
        L38:
            byte[] r3 = r2.f160132n
            android.graphics.Bitmap r3 = com.tencent.mm.sdk.platformtools.x.G(r3)
            r2.f160133o = r3
            goto L6b
        L41:
            java.lang.String r3 = r6.c()
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 != 0) goto L6b
            java.lang.Class<kd0.f3> r3 = kd0.f3.class
            i95.m r3 = i95.n0.c(r3)
            kd0.f3 r3 = (kd0.f3) r3
            java.lang.String r0 = r6.c()
            boolean r1 = com.tencent.mm.ui.bk.C()
            if (r1 == 0) goto L5f
            r1 = r4
            goto L60
        L5f:
            r1 = 2
        L60:
            jd0.y2 r3 = (jd0.y2) r3
            r3.getClass()
            android.graphics.Bitmap r3 = zs5.v0.a(r0, r1, r4)
            r2.f160133o = r3
        L6b:
            java.lang.String r3 = r2.getUserName()
            boolean r3 = com.tencent.mm.storage.z3.R4(r3)
            if (r3 != 0) goto L8c
            java.lang.Class<rv.u2> r3 = rv.u2.class
            i95.m r3 = i95.n0.c(r3)
            rv.u2 r3 = (rv.u2) r3
            java.lang.String r0 = r2.getUserName()
            qv.o r3 = (qv.o) r3
            r3.getClass()
            boolean r3 = r01.z.j(r0)
            if (r3 == 0) goto Lab
        L8c:
            r2.enableOptionMenu(r4)
            java.lang.String r3 = r6.a()
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r4 != 0) goto Lab
            jz5.g r4 = r2.f160129h
            jz5.n r4 = (jz5.n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.String r0 = "getValue(...)"
            kotlin.jvm.internal.o.f(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r3)
        Lab:
            android.widget.ImageView r3 = r2.X6()
            android.graphics.Bitmap r4 = r2.f160133o
            r3.setImageBitmap(r4)
            java.lang.Integer r3 = r6.d()
            if (r3 != 0) goto Lbb
            goto Lc8
        Lbb:
            int r3 = r3.intValue()
            if (r3 != 0) goto Lc8
            android.widget.TextView r3 = r2.c7()
            r3.setVisibility(r5)
        Lc8:
            return
        Lc9:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            r4 = 2131768487(0x7f1034a7, float:1.9168222E38)
            java.lang.String r3 = r2.getString(r4, r3)
            android.widget.Toast r3 = dp.a.makeText(r2, r3, r5)
            r3.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI.d7(int, int, java.lang.String, com.tencent.mm.plugin.setting.ui.setting.n1):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488654zo;
    }

    public final java.lang.String getUserName() {
        return (java.lang.String) ((jz5.n) this.f160131m).getValue();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        v24.e.c(a7(), 1, 99, null, null, 0, 28, null);
        if (com.tencent.mm.ui.bk.C()) {
            setActionbarColor(0);
            getController().H0(getResources().getColor(com.tencent.mm.R.color.f478840aj1));
        } else {
            setActionbarColor(-1);
        }
        hideActionbarLine();
        setMMTitle("");
        getWindow().getDecorView().setSystemUiVisibility(1792);
        vj5.o.e(getWindow());
        getWindow().setFlags(201327616, 201327616);
        gm0.j1.d().a(be1.r0.CTRL_INDEX, this);
        gm0.j1.d().a(uc1.o1.CTRL_INDEX, this);
        com.tencent.mm.ui.bk.s0(W6().getPaint());
        W6().l(0, i65.a.f(this, com.tencent.mm.R.dimen.f479575r) * i65.a.m(this));
        Z6(1);
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        java.lang.Object value = ((jz5.n) this.f160126e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.feature.avatar.w) zVar).Ai((android.widget.ImageView) value, getUserName(), null);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(getUserName(), true);
        W6().setMaxLines(2);
        X6();
        W6().post(new com.tencent.mm.plugin.setting.ui.setting.t0(this));
        if (n17 != null) {
            java.lang.String P0 = n17.P0();
            if (com.tencent.mm.sdk.platformtools.t8.K0(P0)) {
                P0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(getUserName()).field_displayname;
            }
            java.lang.String string = getString(com.tencent.mm.R.string.f490844b04, P0);
            com.tencent.mm.ui.widget.MMNeat7extView W6 = W6();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = W6().getTextSize();
            ((ke0.e) xVar).getClass();
            W6.b(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string, textSize));
        } else {
            W6().setVisibility(8);
        }
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.setting.ui.setting.u0(this));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.v0(this));
        if (com.tencent.mm.ui.bk.C()) {
            c7().setTextColor(getContext().getResources().getColorStateList(com.tencent.mm.R.color.f479552ab3));
        } else {
            c7().setTextColor(getContext().getResources().getColorStateList(com.tencent.mm.R.color.f479311vr));
        }
        c7().setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.w0(this));
        c7().setVisibility(4);
        if (com.tencent.mm.ui.b4.c(this)) {
            new n3.m3(getWindow(), getWindow().getDecorView()).b(true);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v24.e.c(a7(), 33, 99, null, null, 0, 28, null);
        gm0.j1.d().q(be1.r0.CTRL_INDEX, this);
        gm0.j1.d().q(uc1.o1.CTRL_INDEX, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ColorfulChatroomQRCodeUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f160134p;
        if (progressDialog != null) {
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f160134p = null;
        }
        if (m1Var instanceof kd0.j2) {
            if (str == null) {
                str = "";
            }
            d7(i17, i18, str, new com.tencent.mm.plugin.setting.ui.setting.a1((kd0.j2) m1Var));
        } else if (m1Var instanceof ab0.t) {
            if (str == null) {
                str = "";
            }
            com.tencent.mm.network.v0 reqResp = m1Var.getReqResp();
            kotlin.jvm.internal.o.e(reqResp, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) reqResp).f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetOpenIMChatRoomQRCodeResp");
            r45.ak3 ak3Var = (r45.ak3) fVar;
            byte[] bArr = ak3Var.f370065d.f192156a;
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
            java.lang.String footer_wording = ak3Var.f370066e;
            kotlin.jvm.internal.o.f(footer_wording, "footer_wording");
            d7(i17, i18, str, new com.tencent.mm.plugin.setting.ui.setting.z0(bArr, footer_wording));
        }
    }
}
