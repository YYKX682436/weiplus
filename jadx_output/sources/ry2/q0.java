package ry2;

/* loaded from: classes10.dex */
public class q0 extends ry2.e {
    public final java.util.ArrayList A;
    public r45.h70 B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public int G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public android.graphics.Rect f401447J;
    public int K;
    public r45.fp5 L;
    public final java.util.LinkedList M;
    public long N;
    public final ry2.m P;
    public so2.b5 Q;
    public r45.dd4 R;
    public java.lang.String S;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f401448p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f401449q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f401450r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f401451s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f401452t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f401453u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f401454v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f401455w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f401456x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f401457y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f401458z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context activity, java.lang.String username) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(username, "username");
        this.f401448p = username;
        this.f401458z = new java.util.ArrayList();
        this.A = new java.util.ArrayList();
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.I = "";
        this.K = -1;
        this.M = new java.util.LinkedList();
        this.P = new ry2.m();
        this.S = "";
    }

    public static final com.tencent.mm.plugin.sight.base.b o(ry2.q0 q0Var, java.lang.String str) {
        q0Var.getClass();
        com.tencent.mm.plugin.sight.base.b e17 = hc2.l.e(str);
        q0Var.M.add(java.lang.Integer.valueOf(e17 != null ? e17.f162383b : 0));
        q0Var.N += e17 != null ? e17.f162382a : 0L;
        return e17;
    }

    public final void A(android.view.View view, java.lang.String str) {
        jz5.l lVar = new jz5.l("videodurations", java.lang.Integer.valueOf((int) (u() / 1000)));
        int i17 = 0;
        java.util.List g17 = ry2.e.g(this, false, 1, null);
        if ((!g17.isEmpty()) && w((r45.mb4) kz5.n0.X(g17))) {
            i17 = 1;
        }
        hc2.p0.c(view, "video_cover", str, kz5.c1.k(lVar, new jz5.l("if_horizontal_feed", java.lang.Integer.valueOf(i17))));
    }

    @Override // ry2.n
    public ry2.r0 a() {
        com.tencent.mm.plugin.finder.storage.FinderItem k17 = h().k();
        android.content.Context context = this.f401374d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sr2.w5.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        sr2.w5 w5Var = (sr2.w5) a17;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i17 = ((dv2.e1) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(dv2.e1.class)).f243839p;
        if (k17 != null && !com.tencent.mm.sdk.platformtools.t8.L0(h().m())) {
            return new ry2.r0(true, k17.getMediaType(), null, this.S, i17, null, null, 96, null);
        }
        if (!w5Var.f411787p.isEmpty()) {
            r45.kb4 kb4Var = new r45.kb4();
            kb4Var.getList(0).addAll(w5Var.f411787p);
            kb4Var.set(9, java.lang.Boolean.TRUE);
            return new ry2.r0(true, 4, kb4Var, "", i17, null, null, 96, null);
        }
        r45.kb4 kb4Var2 = new r45.kb4();
        android.os.Bundle bundle = this.f401375e;
        kb4Var2.set(2, bundle != null ? bundle.getString("ORIGIN_MUSIC_ID") : null);
        android.os.Bundle bundle2 = this.f401375e;
        kb4Var2.set(3, bundle2 != null ? bundle2.getString("ORIGIN_MUSIC_PATH") : null);
        android.os.Bundle bundle3 = this.f401375e;
        int i18 = 4;
        kb4Var2.set(4, bundle3 != null ? bundle3.getString("ORIGIN_BGM_URL") : null);
        android.os.Bundle bundle4 = this.f401375e;
        kb4Var2.set(5, java.lang.Boolean.valueOf(bundle4 != null ? bundle4.getBoolean("MEDIA_IS_MUTE", false) : false));
        android.os.Bundle bundle5 = this.f401375e;
        kb4Var2.set(6, java.lang.Boolean.valueOf(bundle5 != null ? bundle5.getBoolean("MUSIC_IS_MUTE", false) : false));
        android.os.Bundle bundle6 = this.f401375e;
        kb4Var2.set(7, java.lang.Integer.valueOf(bundle6 != null ? bundle6.getInt("SOUND_TRACK_TYPE", 0) : 0));
        android.os.Bundle bundle7 = this.f401375e;
        kb4Var2.set(8, bundle7 != null ? bundle7.getString("MUSIC_FEED_ID") : null);
        kb4Var2.set(1, this.f401376f);
        android.os.Bundle bundle8 = this.f401375e;
        kb4Var2.set(10, bundle8 != null ? bundle8.getString("ORIGIN_FILE_PATH") : null);
        r45.fp5 fp5Var = this.L;
        if (fp5Var != null) {
            fp5Var.f374533i = this.K;
        }
        com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "getUploadData: originMusicId=" + kb4Var2.getString(2) + ", musicMute=" + kb4Var2.getBoolean(6) + ", soundTrackType=" + kb4Var2.getInteger(7));
        if (q() && kb4Var2.getList(0).size() != 0) {
            int integer = ((r45.mb4) kb4Var2.getList(0).get(0)).getInteger(2);
            if (hc2.o0.u().contains(java.lang.Integer.valueOf(integer))) {
                if (integer != 4 || kb4Var2.getList(0).size() <= 1) {
                    java.util.LinkedList list = kb4Var2.getList(0);
                    if (list != null) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((r45.mb4) it.next()).getInteger(2) != integer) {
                            }
                        }
                    }
                }
                i18 = 8;
                break;
            }
            i18 = integer;
        }
        java.util.List g17 = ry2.e.g(this, false, 1, null);
        if (!(true ^ g17.isEmpty())) {
            return new ry2.r0(false, k17 != null ? k17.getMediaType() : 0, null, null, i17, null, null, 104, null);
        }
        kb4Var2.getList(0).addAll(g17);
        return new ry2.r0(true, i18, kb4Var2, this.S, i17, null, null, 96, null);
    }

    @Override // ry2.n
    public android.view.View b() {
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var;
        java.lang.Throwable th6;
        android.content.Context context = this.f401374d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.View inflate = ((android.app.Activity) context).getLayoutInflater().inflate(com.tencent.mm.R.layout.f489073b66, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f401449q = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.oy7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f401452t = findViewById;
        android.view.View view = this.f401449q;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.o78);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f401450r = (android.widget.ImageView) findViewById2;
        android.view.View view2 = this.f401449q;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.f483429at3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f401451s = (android.widget.ImageView) findViewById3;
        android.view.View view3 = this.f401449q;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        this.f401453u = view3.findViewById(com.tencent.mm.R.id.gyw);
        android.view.View view4 = this.f401449q;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        this.f401454v = view4.findViewById(com.tencent.mm.R.id.oxz);
        android.view.View view5 = this.f401449q;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById4 = view5.findViewById(com.tencent.mm.R.id.miu);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f401455w = findViewById4;
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var2 = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        if (((java.lang.Boolean) ad0Var2.a().r()).booleanValue()) {
            android.view.View view6 = this.f401455w;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("selectCoverView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view6, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            ad0Var = ad0Var2;
            yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "inflateView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "inflateView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view6, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = this.f401449q;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            android.view.View findViewById5 = view7.findViewById(com.tencent.mm.R.id.vkh);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            this.f401455w = findViewById5;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById5, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "inflateView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "inflateView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById5, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ad0Var = ad0Var2;
        }
        android.view.View findViewById6 = ((android.app.Activity) context).findViewById(com.tencent.mm.R.id.f484907fw3);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f401456x = findViewById6;
        if (((java.lang.Boolean) ad0Var.a().r()).booleanValue()) {
            android.view.View view8 = this.f401449q;
            if (view8 == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            view8.post(new ry2.z(this));
            th6 = null;
        } else {
            th6 = null;
            v();
        }
        this.H = false;
        android.view.View view9 = this.f401449q;
        if (view9 != null) {
            return view9;
        }
        kotlin.jvm.internal.o.o("rootView");
        throw th6;
    }

    @Override // ry2.e
    public boolean c() {
        r45.h70 h70Var = this.B;
        if (h70Var != null) {
            kotlin.jvm.internal.o.d(h70Var);
            java.util.LinkedList<r45.ho6> tracks = h70Var.f375897d;
            kotlin.jvm.internal.o.f(tracks, "tracks");
            for (r45.ho6 ho6Var : tracks) {
                if (!com.tencent.mm.vfs.w6.j(ho6Var.f376333d)) {
                    com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "[compositionInfo]video widget file:" + ho6Var.f376333d + " lost!");
                    return false;
                }
            }
            return true;
        }
        java.util.ArrayList<java.lang.String> arrayList = this.f401457y;
        if (arrayList == null) {
            return true;
        }
        for (java.lang.String str : arrayList) {
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "[videoFileList]video widget file:" + str + " lost!");
                return false;
            }
        }
        return true;
    }

    @Override // ry2.e
    public void d() {
        k();
        this.f401457y = null;
        this.f401458z.clear();
        this.A.clear();
        this.B = null;
        this.f401376f = null;
        this.E = "";
        this.D = "";
        this.G = 0;
        this.C = "";
        this.I = "";
        this.f401447J = null;
        android.view.View view = this.f401456x;
        if (view == null) {
            kotlin.jvm.internal.o.o("tipsView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "delMedia", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "delMedia", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.Q = null;
    }

    @Override // ry2.e
    public android.graphics.drawable.Drawable e() {
        android.view.View view = this.f401452t;
        if (view == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        int width = view.getWidth();
        android.view.View view2 = this.f401452t;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        int height = view2.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.widget.ImageView imageView = this.f401451s;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("blurIv");
            throw null;
        }
        imageView.draw(canvas);
        canvas.translate(0.0f, this.f401453u != null ? r3.getHeight() : 0.0f);
        android.widget.ImageView imageView2 = this.f401450r;
        if (imageView2 != null) {
            imageView2.draw(canvas);
            return new android.graphics.drawable.BitmapDrawable(this.f401374d.getResources(), createBitmap);
        }
        kotlin.jvm.internal.o.o("thumbIv");
        throw null;
    }

    @Override // ry2.e
    public java.util.List f(boolean z17) {
        r45.h70 h70Var;
        java.util.ArrayList arrayList;
        byte[] byteArray;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (z17) {
            android.os.Bundle bundle = this.f401375e;
            if (bundle == null || (byteArray = bundle.getByteArray("video_composition")) == null) {
                h70Var = null;
            } else {
                com.tencent.mm.protobuf.f parseFrom = new r45.h70().parseFrom(byteArray);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CompositionInfo");
                h70Var = (r45.h70) parseFrom;
            }
        } else {
            h70Var = this.B;
        }
        if (h70Var != null) {
            r45.mb4 t17 = t(h70Var);
            p(t17);
            linkedList.add(t17);
        } else if (q() && (arrayList = this.f401457y) != null) {
            int i17 = 0;
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.mb4 s17 = s((java.lang.String) obj, i17);
                p(s17);
                linkedList.add(s17);
                i17 = i18;
            }
        }
        return linkedList;
    }

    @Override // ry2.e
    public jz5.l i() {
        android.view.View view = this.f401452t;
        if (view == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getWidth());
        android.view.View view2 = this.f401452t;
        if (view2 != null) {
            return new jz5.l(valueOf, java.lang.Integer.valueOf(view2.getHeight()));
        }
        kotlin.jvm.internal.o.o("container");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0212, code lost:
    
        if ((r2.isEmpty()) != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0289 A[Catch: IOException -> 0x02b2, TryCatch #0 {IOException -> 0x02b2, blocks: (B:51:0x016b, B:53:0x0174, B:56:0x01d0, B:57:0x01d4, B:59:0x01da, B:61:0x0205, B:63:0x0209, B:67:0x023e, B:69:0x0242, B:71:0x024a, B:75:0x0256, B:76:0x0263, B:78:0x0271, B:80:0x027d, B:85:0x0289, B:87:0x028d, B:88:0x0291, B:89:0x0295, B:91:0x0296, B:93:0x029a, B:94:0x02a3, B:95:0x02a7, B:97:0x02a8, B:98:0x02ac, B:102:0x0214, B:104:0x021f, B:106:0x0229, B:108:0x022d, B:109:0x0231, B:111:0x02ad, B:112:0x02b1), top: B:50:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029a A[Catch: IOException -> 0x02b2, TryCatch #0 {IOException -> 0x02b2, blocks: (B:51:0x016b, B:53:0x0174, B:56:0x01d0, B:57:0x01d4, B:59:0x01da, B:61:0x0205, B:63:0x0209, B:67:0x023e, B:69:0x0242, B:71:0x024a, B:75:0x0256, B:76:0x0263, B:78:0x0271, B:80:0x027d, B:85:0x0289, B:87:0x028d, B:88:0x0291, B:89:0x0295, B:91:0x0296, B:93:0x029a, B:94:0x02a3, B:95:0x02a7, B:97:0x02a8, B:98:0x02ac, B:102:0x0214, B:104:0x021f, B:106:0x0229, B:108:0x022d, B:109:0x0231, B:111:0x02ad, B:112:0x02b1), top: B:50:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a3 A[Catch: IOException -> 0x02b2, TryCatch #0 {IOException -> 0x02b2, blocks: (B:51:0x016b, B:53:0x0174, B:56:0x01d0, B:57:0x01d4, B:59:0x01da, B:61:0x0205, B:63:0x0209, B:67:0x023e, B:69:0x0242, B:71:0x024a, B:75:0x0256, B:76:0x0263, B:78:0x0271, B:80:0x027d, B:85:0x0289, B:87:0x028d, B:88:0x0291, B:89:0x0295, B:91:0x0296, B:93:0x029a, B:94:0x02a3, B:95:0x02a7, B:97:0x02a8, B:98:0x02ac, B:102:0x0214, B:104:0x021f, B:106:0x0229, B:108:0x022d, B:109:0x0231, B:111:0x02ad, B:112:0x02b1), top: B:50:0x016b }] */
    @Override // ry2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry2.q0.m():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0483, code lost:
    
        if (r8 <= r1) goto L197;
     */
    @Override // ry2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(android.graphics.Bitmap r33) {
        /*
            Method dump skipped, instructions count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry2.q0.n(android.graphics.Bitmap):void");
    }

    @Override // ry2.n
    public void onDestroy() {
        java.util.LinkedList<r45.ho6> linkedList;
        r45.h70 h70Var = this.B;
        if (h70Var == null || (linkedList = h70Var.f375897d) == null) {
            return;
        }
        for (r45.ho6 ho6Var : linkedList) {
            bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
            java.lang.String path = ho6Var.f376333d;
            kotlin.jvm.internal.o.f(path, "path");
            ((b92.u2) vVar).getClass();
            dw3.c0.f244188g.remove(path);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "removeIgnorePath: ".concat(path));
        }
    }

    public final void p(r45.mb4 mb4Var) {
        r45.uf2 uf2Var = new r45.uf2();
        uf2Var.set(1, java.lang.Float.valueOf(this.G));
        mb4Var.set(22, uf2Var);
        android.os.Bundle bundle = this.f401375e;
        mb4Var.set(58, bundle != null ? bundle.getString("KEY_POST_VIDEO_TITLE") : null);
        mb4Var.set(51, java.lang.Integer.valueOf(h().g()));
        mb4Var.set(62, h().n());
        mb4Var.set(64, java.lang.Integer.valueOf(h().f401412a.getIntExtra("VIDEO_SHARE_COVER_STYLE", 0)));
        mb4Var.set(59, java.lang.Long.valueOf(h().f401418d));
        mb4Var.set(60, java.lang.Boolean.valueOf(this.f401381n));
        mb4Var.set(61, java.lang.Boolean.valueOf(this.f401382o));
        com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "codec_info video_cover_score:" + this.G);
    }

    public final boolean q() {
        java.util.ArrayList arrayList = this.f401457y;
        if (arrayList == null || arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "video list null");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video list ");
        java.util.ArrayList arrayList2 = this.f401457y;
        kotlin.jvm.internal.o.d(arrayList2);
        sb6.append(arrayList2.size());
        sb6.append(", thumb list ");
        java.util.ArrayList arrayList3 = this.f401458z;
        sb6.append(arrayList3.size());
        com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", sb6.toString());
        java.util.ArrayList arrayList4 = this.f401457y;
        kotlin.jvm.internal.o.d(arrayList4);
        return arrayList4.size() == arrayList3.size();
    }

    public final void r(r45.mb4 mb4Var) {
        java.lang.String str;
        jz5.f0 f0Var;
        r45.ho6 ho6Var;
        java.lang.String str2;
        android.content.Context context = this.f401374d;
        if (mb4Var != null) {
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((dv2.o0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(dv2.o0.class)).f243913d = mb4Var.getString(0) + mb4Var.getString(18);
        }
        r45.h70 h70Var = this.B;
        if (h70Var != null) {
            java.util.LinkedList linkedList = h70Var.f375897d;
            if (linkedList == null || (ho6Var = (r45.ho6) kz5.n0.Z(linkedList)) == null || (str2 = ho6Var.f376333d) == null) {
                f0Var = null;
            } else {
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((dv2.o0) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(dv2.o0.class)).f243914e = str2;
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var != null) {
                return;
            }
        }
        java.util.ArrayList arrayList = this.f401457y;
        if (arrayList == null || (str = (java.lang.String) kz5.n0.Z(arrayList)) == null) {
            return;
        }
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar3 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((dv2.o0) zVar3.a((androidx.appcompat.app.AppCompatActivity) context).a(dv2.o0.class)).f243914e = str;
    }

    public final r45.mb4 s(java.lang.String str, int i17) {
        mv2.f0 f0Var = mv2.f0.f331561a;
        java.lang.String str2 = (java.lang.String) kz5.n0.a0(this.f401458z, i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.util.ArrayList arrayList = this.A;
        return f0Var.f(str, str3, arrayList.size() > i17 ? (r45.dd4) arrayList.get(i17) : null, this.D, this.E, this.L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0022, code lost:
    
        if (r2 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.mb4 t(r45.h70 r14) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry2.q0.t(r45.h70):r45.mb4");
    }

    public final long u() {
        r45.h70 h70Var = this.B;
        long j17 = (h70Var != null ? h70Var.f375899f : 0L) - (h70Var != null ? h70Var.f375898e : 0L);
        if (j17 < 0) {
            j17 = 0;
        }
        return j17 == 0 ? this.N : j17;
    }

    public final void v() {
        java.util.Map e17;
        java.lang.String str;
        android.view.View view = this.f401449q;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        A(view, "view_exp");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view2 = this.f401455w;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("selectCoverView");
            throw null;
        }
        ((cy1.a) rVar).pk(view2, "choose_cover_button");
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view3 = this.f401455w;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("selectCoverView");
            throw null;
        }
        ((cy1.a) rVar2).ik(view3, 40, 25496);
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view4 = this.f401455w;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("selectCoverView");
            throw null;
        }
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        android.content.Context context = this.f401374d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context);
        lVarArr[0] = new jz5.l("behaviour_session_id", e18 != null ? e18.f135385q : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context);
        lVarArr[1] = new jz5.l("finder_context_id", e19 != null ? e19.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(context);
        lVarArr[2] = new jz5.l("finder_tab_context_id", e27 != null ? e27.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar.e(context);
        lVarArr[3] = new jz5.l("comment_scene", e28 != null ? java.lang.Integer.valueOf(e28.f135380n) : null);
        ((cy1.a) rVar3).gk(view4, kz5.c1.k(lVarArr));
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            jz5.l[] lVarArr2 = new jz5.l[5];
            long j17 = 1000;
            lVarArr2[0] = new jz5.l("video_duration_time", java.lang.Integer.valueOf((int) (u() / j17)));
            lVarArr2[1] = new jz5.l("videodurations", java.lang.Integer.valueOf((int) (u() / j17)));
            java.util.List g17 = ry2.e.g(this, false, 1, null);
            lVarArr2[2] = new jz5.l("if_horizontal_feed", java.lang.Integer.valueOf(((g17.isEmpty() ^ true) && w((r45.mb4) kz5.n0.X(g17))) ? 1 : 0));
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
            if (finderFeedReportObject == null || (str = finderFeedReportObject.getSessionId()) == null) {
                str = "";
            }
            lVarArr2[3] = new jz5.l("finder_post_sessionid", str);
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            lVarArr2[4] = new jz5.l("enter_scene", java.lang.Integer.valueOf(finderFeedReportObject2 != null ? finderFeedReportObject2.getEnterScene() : 0));
            e17 = kz5.c1.k(lVarArr2);
        } else {
            e17 = kz5.b1.e(new jz5.l("video_duration_time", java.lang.Integer.valueOf((int) (u() / 1000))));
        }
        dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view5 = this.f401455w;
        if (view5 != null) {
            ((cy1.a) rVar4).Ai(view5, new ry2.j0(e17));
        } else {
            kotlin.jvm.internal.o.o("selectCoverView");
            throw null;
        }
    }

    public final boolean w(r45.mb4 mb4Var) {
        int i17;
        int i18;
        int i19;
        int height;
        r45.y25 y25Var;
        if (!hc2.l0.c(mb4Var)) {
            r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
            if (h70Var != null) {
                r45.i70 i70Var = h70Var.f375902i;
                if (i70Var.A == null) {
                    r45.vl5 vl5Var = i70Var.f376778g;
                    r45.bb1 bb1Var = (r45.bb1) mb4Var.getCustom(34);
                    if (bb1Var != null && java.lang.Math.abs(bb1Var.getFloat(2) - bb1Var.getFloat(0)) > 0.0f && java.lang.Math.abs(bb1Var.getFloat(1) - bb1Var.getFloat(3)) > 0.0f) {
                        vl5Var.f388350d.set(0, java.lang.Integer.valueOf((int) bb1Var.getFloat(0)));
                        vl5Var.f388350d.set(1, java.lang.Integer.valueOf((int) bb1Var.getFloat(1)));
                        vl5Var.f388350d.set(2, java.lang.Integer.valueOf((int) bb1Var.getFloat(2)));
                        vl5Var.f388350d.set(3, java.lang.Integer.valueOf((int) bb1Var.getFloat(3)));
                    }
                    java.lang.Object obj = vl5Var.f388350d.get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    int intValue = ((java.lang.Number) obj).intValue();
                    java.lang.Object obj2 = vl5Var.f388350d.get(1);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    int intValue2 = ((java.lang.Number) obj2).intValue();
                    java.lang.Object obj3 = vl5Var.f388350d.get(2);
                    kotlin.jvm.internal.o.f(obj3, "get(...)");
                    int intValue3 = ((java.lang.Number) obj3).intValue();
                    java.lang.Object obj4 = vl5Var.f388350d.get(3);
                    kotlin.jvm.internal.o.f(obj4, "get(...)");
                    android.graphics.Rect rect = new android.graphics.Rect(intValue, intValue2, intValue3, ((java.lang.Number) obj4).intValue());
                    r45.i70 i70Var2 = h70Var.f375902i;
                    i19 = i70Var2 != null ? i70Var2.f376780i : 0;
                    height = (rect.height() * i19) / rect.width();
                    com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "3 videoWidth=" + i19 + " videoHeight=" + height);
                } else {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                    r45.vl5 vl5Var2 = h70Var.f375902i.A.f390730d;
                    ((b92.u2) vVar).getClass();
                    com.tencent.mm.plugin.vlog.model.x.f(vl5Var2, rect2);
                    com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "originRect: " + rect2);
                    r45.i70 i70Var3 = h70Var.f375902i;
                    i19 = (i70Var3 == null || (y25Var = i70Var3.A) == null) ? 0 : y25Var.f390731e;
                    height = (rect2.height() * i19) / rect2.width();
                    com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "4 videoWidth=" + i19 + " videoHeight=" + height);
                }
                int i27 = height;
                i18 = i19;
                i17 = i27;
            } else {
                i17 = 0;
                i18 = 0;
            }
        } else if (com.tencent.mm.vfs.w6.j(mb4Var.getString(0))) {
            bg0.v vVar2 = (bg0.v) i95.n0.c(bg0.v.class);
            java.lang.String string = mb4Var.getString(0);
            ((b92.u2) vVar2).getClass();
            com.tencent.mm.plugin.sight.base.b c17 = j33.s.f297456a.c(string);
            i18 = c17.f162384c;
            i17 = c17.f162385d;
            com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "1 videoWidth=" + i18 + " videoHeight=" + i17 + " media.width=" + mb4Var.getFloat(4) + " media.height=" + mb4Var.getFloat(5));
        } else {
            i18 = (int) mb4Var.getFloat(4);
            i17 = (int) mb4Var.getFloat(5);
            com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "2 videoWidth=" + i18 + " videoHeight=" + i17 + " media.width=" + mb4Var.getFloat(4) + " media.height=" + mb4Var.getFloat(5));
        }
        return i18 >= i17 && i18 != 0;
    }

    public final boolean x() {
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126427z).getValue()).r()).intValue() == 1;
    }

    public final void y(java.util.LinkedList linkedList) {
        int i17;
        boolean z17;
        r45.kb4 kb4Var = new r45.kb4();
        kb4Var.getList(0).addAll(linkedList);
        r45.mb4 mb4Var = (r45.mb4) linkedList.getFirst();
        kotlin.jvm.internal.o.d(mb4Var);
        boolean z18 = true;
        if (w(mb4Var)) {
            if (this.Q == null) {
                java.lang.String stringExtra = h().f401412a.getStringExtra("VIDEO_SHARE_FULL_COVER_URL");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (stringExtra.length() == 0) {
                    stringExtra = this.F;
                }
                java.lang.String str = stringExtra;
                java.lang.String n17 = h().n();
                if (n17.length() == 0) {
                    n17 = this.F;
                }
                this.Q = new so2.b5(str, n17, 0L, 1, null, h().f401412a.getByteArrayExtra("VIDEO_SHARE_COVER_INFO_WRAP"), h().f401412a.getIntExtra("VIDEO_SHARE_COVER_SOURCE", 0));
            }
            i17 = 1002;
            z17 = true;
        } else {
            i17 = 1001;
            z17 = false;
        }
        com.tencent.mm.plugin.finder.report.p2.f125237a.G("andr_Post_Page_Cover", null);
        android.os.Bundle bundle = this.f401375e;
        boolean z19 = bundle != null ? bundle.getBoolean("post_long_video", false) : false;
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = this.f401374d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("cover_style", h().g());
        intent.putExtra("cover_time_ms", h().h());
        intent.putExtra("cover_crop_model", h().e());
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        intent.putExtra("key_context_id", nyVar != null ? nyVar.f135382p : null);
        if (!this.H) {
            this.H = true;
            intent.putExtra("cover_word_info_wrap", h().j().toByteArray());
        }
        java.lang.String l17 = h().l();
        if (l17 == null || l17.length() == 0) {
            l17 = this.E;
        }
        intent.putExtra("key_full_cover_path", l17);
        java.lang.String i18 = h().i();
        if (i18 != null && i18.length() != 0) {
            z18 = false;
        }
        if (z18) {
            i18 = this.D;
        }
        intent.putExtra("key_cover_path", i18);
        intent.putExtra("key_cover_select_source", h().f());
        intent.putExtra("key_share_cover_item", this.Q);
        i0Var.getClass();
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        android.content.Intent b17 = xy2.c.b(activity, z17 ? com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.class : com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.class, intent, false, false, 24, null);
        b17.putExtra("media_list_", kb4Var.toByteArray());
        b17.putExtra("media_list_count", kb4Var.getList(0).size());
        b17.putExtra("isLongVideoPost", z19);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterSelectCoverUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;IZZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void z(android.graphics.Bitmap bitmap) {
        pm0.v.X(new ry2.c(bitmap, this));
        l();
    }
}
