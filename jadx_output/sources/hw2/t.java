package hw2;

/* loaded from: classes5.dex */
public final class t implements yt3.r2 {

    /* renamed from: v, reason: collision with root package name */
    public static final hw2.h f285554v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.ArrayList f285555w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String f285556x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String f285557y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String f285558z;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f285559d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f285560e;

    /* renamed from: f, reason: collision with root package name */
    public final ju3.d0 f285561f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f285562g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f285563h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f285564i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f285565m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f285566n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f285567o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f285568p;

    /* renamed from: q, reason: collision with root package name */
    public int f285569q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.xlabeffect.XEffectConfig f285570r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f285571s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f285572t;

    /* renamed from: u, reason: collision with root package name */
    public final android.os.Vibrator f285573u;

    static {
        hw2.h hVar = new hw2.h(null);
        f285554v = hVar;
        f285555w = new java.util.ArrayList(3);
        java.util.HashMap hashMap = new java.util.HashMap();
        f285556x = "{\n                \"skin_smooth\":35,\n                \"face_morph\":20,\n                \"eye_morph\":10,\n                \"skin_bright\":20,\n                \"eye_bright\":40,\n                \"rosy\":0,\n                \"eye_pouch\":80,\n                \"smile_folds\":80,\n                \"sharpen\":40,\n                \"teeth_bright\":30,\n                \"small_head\":0,\n                \"cheek_bone\":10,\n                \"lower_jawbone\":10,\n                \"wing_of_nose\":10\n                }";
        f285557y = "{\n                \"skin_smooth\":60,\n                \"face_morph\":30,\n                \"eye_morph\":30,\n                \"skin_bright\":40,\n                \"eye_bright\":40,\n                \"rosy\":0,\n                \"eye_pouch\":90,\n                \"smile_folds\":90,\n                \"sharpen\":40,\n                \"teeth_bright\":30,\n                \"small_head\":0,\n                \"cheek_bone\":20,\n                \"lower_jawbone\":30,\n                \"wing_of_nose\":20\n        }";
        f285558z = "{\n                \"skin_smooth\":90,\n                \"face_morph\":40,\n                \"eye_morph\":35,\n                \"skin_bright\":70,\n                \"eye_bright\":40,\n                \"rosy\":0,\n                \"eye_pouch\":100,\n                \"smile_folds\":100,\n                \"sharpen\":40,\n                \"teeth_bright\":30,\n                \"small_head\":0,\n                \"cheek_bone\":40,\n                \"lower_jawbone\":50,\n                \"wing_of_nose\":30\n        }";
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USREINFO_FINDER_RECORD_BEAUTY_CONFIG_STRING, "{\n                \"skin_smooth\":35,\n                \"face_morph\":20,\n                \"eye_morph\":10,\n                \"skin_bright\":20,\n                \"eye_bright\":40,\n                \"rosy\":0,\n                \"eye_pouch\":80,\n                \"smile_folds\":80,\n                \"sharpen\":40,\n                \"teeth_bright\":30,\n                \"small_head\":0,\n                \"cheek_bone\":10,\n                \"lower_jawbone\":10,\n                \"wing_of_nose\":10\n                }");
        kotlin.jvm.internal.o.d(v17);
        hVar.a(v17, hashMap, -1);
    }

    public t(android.view.ViewGroup parent, android.view.View view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f285559d = parent;
        this.f285560e = view;
        this.f285561f = status;
        this.f285563h = true;
        this.f285564i = true;
        this.f285565m = true;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = (com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) parent.findViewById(com.tencent.mm.R.id.f484953g15);
        this.f285566n = editorPanelHolder;
        this.f285568p = jz5.h.b(new hw2.k(this));
        this.f285570r = new com.tencent.mm.plugin.xlabeffect.XEffectConfig();
        this.f285571s = jz5.h.b(hw2.i.f285538d);
        this.f285572t = jz5.h.b(new hw2.j(this));
        java.lang.Object systemService = view.getContext().getSystemService("vibrator");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f285573u = (android.os.Vibrator) systemService;
        editorPanelHolder.setOnVisibleChangeCallback(new hw2.f(this));
        view.setOnClickListener(new hw2.g(this));
        com.tencent.mm.sdk.platformtools.o4 b17 = b();
        int i17 = qs5.a.f366421a;
        this.f285569q = b17.getInt("beauty_suit", -1000);
        hw2.h hVar = f285554v;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_record_beauty_config, f285556x, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        kotlin.jvm.internal.o.d(Zi);
        hVar.a(Zi, hashMap, 0);
        java.util.ArrayList arrayList = f285555w;
        arrayList.add(hashMap);
        java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_record_beauty_config2, f285557y, true);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        kotlin.jvm.internal.o.d(Zi2);
        hVar.a(Zi2, hashMap2, 0);
        arrayList.add(hashMap2);
        java.lang.String Zi3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_record_beauty_config3, f285558z, true);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        kotlin.jvm.internal.o.d(Zi3);
        hVar.a(Zi3, hashMap3, 0);
        arrayList.add(hashMap3);
    }

    public final int a(int i17, int i18) {
        if (i17 < 0) {
            return 0;
        }
        return b().getInt(d(i17, i18), c(i17, i18));
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        return (com.tencent.mm.sdk.platformtools.o4) this.f285571s.getValue();
    }

    public final int c(int i17, int i18) {
        java.util.HashMap hashMap = (java.util.HashMap) kz5.n0.a0(f285555w, i17);
        java.lang.Integer num = hashMap != null ? (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i18)) : null;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final java.lang.String d(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('-');
        sb6.append(i18);
        return sb6.toString();
    }

    public final android.view.View e() {
        java.lang.Object value = ((jz5.n) this.f285568p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void f() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("PARAM_BEAUTIFY_CONFIG", this.f285570r);
        this.f285561f.w(ju3.c0.f301909w, bundle);
    }

    public final void g(int i17, int i18) {
        com.tencent.mm.plugin.xlabeffect.XEffectConfig xEffectConfig = this.f285570r;
        switch (i17) {
            case 0:
                xEffectConfig.f188599g = i18;
                return;
            case 1:
                xEffectConfig.f188601i = i18;
                return;
            case 2:
                xEffectConfig.f188602m = i18;
                return;
            case 3:
                xEffectConfig.f188604o = i18;
                return;
            case 4:
                xEffectConfig.f188600h = i18;
                return;
            case 5:
                xEffectConfig.f188603n = i18;
                return;
            case 6:
                xEffectConfig.f188605p = i18;
                return;
            case 7:
                xEffectConfig.f188606q = i18;
                return;
            case 8:
                xEffectConfig.f188607r = i18;
                return;
            case 9:
                xEffectConfig.f188608s = i18;
                return;
            case 10:
                xEffectConfig.f188609t = i18;
                return;
            case 11:
                xEffectConfig.f188610u = i18;
                return;
            case 12:
                xEffectConfig.f188611v = i18;
                return;
            case 13:
                xEffectConfig.f188612w = i18;
                return;
            default:
                return;
        }
    }

    public final void h(boolean z17) {
        nu3.i.f340218a.n("KEY_RECORD_IS_BEAUTIFY", java.lang.Boolean.valueOf(z17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_BEAUTIFY_ENABLE", z17);
        this.f285561f.w(ju3.c0.f301905u, bundle);
        if (z17) {
            int i17 = this.f285569q;
            int i18 = qs5.a.f366421a;
            if (i17 == -1000) {
                java.lang.Object l17 = gm0.j1.u().c().l(12290, null);
                java.lang.Integer num = l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null;
                if ((num != null ? num.intValue() : 0) == 2) {
                    int i19 = qs5.f.f366431a;
                    this.f285569q = 1;
                } else {
                    int i27 = qs5.f.f366431a;
                    this.f285569q = 0;
                }
                b().putInt("beauty_suit", this.f285569q);
            }
            java.util.Iterator it = ((java.lang.Iterable) ((jz5.n) this.f285572t).getValue()).iterator();
            while (it.hasNext()) {
                int i28 = ((qs5.c) it.next()).f366423a;
                g(i28, a(this.f285569q, i28));
            }
            f();
        }
        this.f285570r.f188597e = z17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r2.add(java.lang.Integer.valueOf(r5));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r12 = this;
            int r0 = r12.f285569q
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r1 = r12.f285570r
            r1.f188596d = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = 0
            r3 = r0
        Ld:
            r4 = 14
            r5 = 1
            if (r3 >= r4) goto L4d
            int r4 = r12.f285569q
            int r4 = r12.a(r4, r3)
            int r6 = r12.f285569q
            int r6 = r12.c(r6, r3)
            if (r4 == r6) goto L4a
            switch(r3) {
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3b;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L33;
                case 8: goto L30;
                case 9: goto L2d;
                case 10: goto L2b;
                case 11: goto L29;
                case 12: goto L27;
                case 13: goto L24;
                default: goto L23;
            }
        L23:
            goto L42
        L24:
            r5 = 8
            goto L43
        L27:
            r5 = 7
            goto L43
        L29:
            r5 = 6
            goto L43
        L2b:
            r5 = 5
            goto L43
        L2d:
            r5 = 13
            goto L43
        L30:
            r5 = 11
            goto L43
        L33:
            r5 = 10
            goto L43
        L36:
            r5 = 9
            goto L43
        L39:
            r5 = 4
            goto L43
        L3b:
            r5 = 3
            goto L43
        L3d:
            r5 = 12
            goto L43
        L40:
            r5 = 2
            goto L43
        L42:
            r5 = r0
        L43:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2.add(r4)
        L4a:
            int r3 = r3 + 1
            goto Ld
        L4d:
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            int r3 = r12.f285569q
            if (r3 >= 0) goto L58
            r3 = r0
            goto L59
        L58:
            int r3 = r3 + r5
        L59:
            java.lang.String r4 = "suit"
            r11.put(r4, r3)
            int r3 = r12.f285569q
            if (r3 < 0) goto L63
            goto L64
        L63:
            r5 = r0
        L64:
            java.lang.String r3 = "isBeauty"
            r11.put(r3, r5)
            boolean r3 = r1.f188597e
            if (r3 == 0) goto L80
            java.lang.String r3 = "#"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            java.lang.String r2 = kz5.n0.g0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r3 = "beautyList"
            r11.put(r3, r2)
        L80:
            java.lang.String r2 = r11.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            java.lang.String r0 = r26.i0.t(r2, r3, r4, r0)
            r1.I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hw2.t.i():void");
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f285566n;
        if (!editorPanelHolder.h()) {
            return false;
        }
        editorPanelHolder.setShow(false);
        return true;
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f285562g) {
            android.view.View view = this.f285560e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
