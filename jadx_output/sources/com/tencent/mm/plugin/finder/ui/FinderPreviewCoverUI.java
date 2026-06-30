package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/tc", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class FinderPreviewCoverUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final com.tencent.mm.plugin.finder.ui.tc S = new com.tencent.mm.plugin.finder.ui.tc(null);
    public boolean B;
    public boolean C;
    public java.lang.String E;
    public java.lang.String F;
    public int G;
    public long H;

    /* renamed from: J, reason: collision with root package name */
    public byte[] f128660J;
    public byte[] K;
    public int L;
    public java.lang.String P;
    public java.lang.String Q;
    public int R;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f128661t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f128662u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f128663v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f128664w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f128665x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f128666y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f128667z;
    public final java.util.LinkedList A = new java.util.LinkedList();
    public final android.content.Intent D = new android.content.Intent();
    public int I = 2;
    public so2.b5 M = new so2.b5("", "", 0, 1, null, null, 0);
    public com.tencent.mm.plugin.finder.ui.td N = com.tencent.mm.plugin.finder.ui.td.f129872d;

    public static final void c7(com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI, com.tencent.mm.plugin.finder.ui.td tdVar, int i17) {
        finderPreviewCoverUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        r45.kb4 kb4Var = null;
        if (com.tencent.mm.plugin.finder.ui.uc.f129912a[tdVar.ordinal()] == 1) {
            intent.putExtra("cover_style", finderPreviewCoverUI.M.f410272g);
            intent.putExtra("cover_time_ms", finderPreviewCoverUI.M.f410271f);
            intent.putExtra("cover_crop_model", finderPreviewCoverUI.M.f410273h);
            intent.putExtra("cover_word_info_wrap", finderPreviewCoverUI.M.f410274i);
            intent.putExtra("key_full_cover_path", finderPreviewCoverUI.M.f410269d);
            intent.putExtra("key_cover_select_source", finderPreviewCoverUI.M.f410275m);
            if (finderPreviewCoverUI.B && !finderPreviewCoverUI.C) {
                intent.putExtra("key_cover_can_use_profile_cover", true);
                intent.putExtra("key_other_cover_time_ms", finderPreviewCoverUI.H);
                java.lang.String str = finderPreviewCoverUI.E;
                if (str == null) {
                    kotlin.jvm.internal.o.o("fullCoverUrl");
                    throw null;
                }
                intent.putExtra("key_other_full_cover_path", str);
                intent.putExtra("key_other_cover_select_source", finderPreviewCoverUI.L);
            }
        } else {
            intent.putExtra("cover_style", finderPreviewCoverUI.I);
            intent.putExtra("cover_time_ms", finderPreviewCoverUI.H);
            intent.putExtra("cover_crop_model", finderPreviewCoverUI.f128660J);
            intent.putExtra("cover_word_info_wrap", finderPreviewCoverUI.K);
            java.lang.String str2 = finderPreviewCoverUI.E;
            if (str2 == null) {
                kotlin.jvm.internal.o.o("fullCoverUrl");
                throw null;
            }
            intent.putExtra("key_full_cover_path", str2);
            intent.putExtra("key_cover_select_source", finderPreviewCoverUI.L);
        }
        r45.kb4 kb4Var2 = new r45.kb4();
        byte[] byteArrayExtra = finderPreviewCoverUI.getIntent().getByteArrayExtra("media_list_");
        if (byteArrayExtra != null) {
            try {
                kb4Var2.parseFrom(byteArrayExtra);
                kb4Var = kb4Var2;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        if (kb4Var == null) {
            kb4Var = new r45.kb4();
        }
        boolean booleanExtra = finderPreviewCoverUI.getIntent().getBooleanExtra("isLongVideoPost", false);
        intent.setClass(finderPreviewCoverUI.getContext(), com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.class);
        intent.putExtra("media_list_", kb4Var.toByteArray());
        intent.putExtra("media_list_count", kb4Var.getList(0).size());
        intent.putExtra("isLongVideoPost", booleanExtra);
        androidx.appcompat.app.AppCompatActivity context = finderPreviewCoverUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xy2.c.c(context, intent);
        intent.putExtra("key_cover_scene", tdVar);
        intent.putExtra("key_last_cover_scene", finderPreviewCoverUI.N);
        finderPreviewCoverUI.N = tdVar;
        intent.setClass(finderPreviewCoverUI.getContext(), com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.class);
        finderPreviewCoverUI.getContext().startActivityForResult(intent, i17);
    }

    public static final void d7(com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI) {
        int i17 = finderPreviewCoverUI.R - 1;
        finderPreviewCoverUI.R = i17;
        if (i17 <= 0) {
            android.view.View view = finderPreviewCoverUI.f128665x;
            if (view != null) {
                view.setEnabled(true);
            } else {
                kotlin.jvm.internal.o.o("previewBtn");
                throw null;
            }
        }
    }

    public static final void e7(com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI, android.graphics.Bitmap bitmap) {
        int dimension = (int) finderPreviewCoverUI.getContext().getResources().getDimension(com.tencent.mm.R.dimen.app);
        int dimension2 = (int) finderPreviewCoverUI.getContext().getResources().getDimension(com.tencent.mm.R.dimen.aoa);
        jz5.o o17 = mv2.f0.f331561a.o(bitmap.getWidth(), bitmap.getHeight(), finderPreviewCoverUI.I);
        float intValue = ((java.lang.Number) o17.f302843f).intValue() / ((java.lang.Number) o17.f302842e).floatValue();
        android.widget.ImageView imageView = finderPreviewCoverUI.f128661t;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("profileImageView");
            throw null;
        }
        imageView.getLayoutParams().height = (int) (dimension * intValue);
        android.widget.ImageView imageView2 = finderPreviewCoverUI.f128661t;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("profileImageView");
            throw null;
        }
        imageView2.setScaleType(android.widget.ImageView.ScaleType.values()[((java.lang.Number) o17.f302841d).intValue()]);
        android.widget.ImageView imageView3 = finderPreviewCoverUI.f128661t;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("profileImageView");
            throw null;
        }
        imageView3.requestLayout();
        android.widget.ImageView imageView4 = finderPreviewCoverUI.f128661t;
        if (imageView4 == null) {
            kotlin.jvm.internal.o.o("profileImageView");
            throw null;
        }
        imageView4.setImageBitmap(bitmap);
        android.graphics.Bitmap a17 = S.a(bitmap, dimension, dimension2);
        android.widget.ImageView imageView5 = finderPreviewCoverUI.f128666y;
        if (imageView5 != null) {
            imageView5.setImageBitmap(a17);
        } else {
            kotlin.jvm.internal.o.o("blurImageView");
            throw null;
        }
    }

    public static final void f7(com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = finderPreviewCoverUI.f128662u;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("shareImageView");
            throw null;
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.widget.ImageView imageView2 = finderPreviewCoverUI.f128662u;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
        } else {
            kotlin.jvm.internal.o.o("shareImageView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        boolean z17 = this.B;
        android.content.Intent intent = this.D;
        if (z17) {
            intent.putExtra("RESULT_IS_SET_PROFILE_COVER", true);
            java.lang.String str = this.E;
            if (str == null) {
                kotlin.jvm.internal.o.o("fullCoverUrl");
                throw null;
            }
            intent.putExtra("RESULT_COVER_FULL_PATH", str);
            intent.putExtra("RESULT_COVER_QUALITY", this.G);
            intent.putExtra("RESULT_COVER_STYLE", this.I);
            intent.putExtra("RESULT_COVER_TIME_MS", this.H);
            intent.putExtra("key_cover_select_source", this.L);
            intent.putExtra("RESULT_COVER_WORD_INFO_WRAP", this.K);
        }
        if (this.M.f410270e.length() > 0) {
            intent.putExtra("RESULT_IS_SET_SHARE_COVER", true);
        }
        intent.putExtra("key_share_cover_item", this.M);
        setResult(0, intent);
        super.finish();
    }

    public final void g7() {
        this.R++;
        android.view.View view = this.f128665x;
        if (view != null) {
            view.setEnabled(false);
        } else {
            kotlin.jvm.internal.o.o("previewBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.edi;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tt_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128661t = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ttg);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f128662u = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.tt9);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f128663v = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ttf);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f128664w = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ros);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f128665x = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.tt7);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f128666y = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.tbl);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f128667z = findViewById7;
        findViewById7.setOnClickListener(new com.tencent.mm.plugin.finder.ui.vc(this));
        android.view.View view = this.f128663v;
        if (view == null) {
            kotlin.jvm.internal.o.o("profileEditBtn");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.ui.wc(this));
        android.view.View view2 = this.f128664w;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("shareEditBtn");
            throw null;
        }
        view2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.xc(this));
        android.view.View view3 = this.f128665x;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("previewBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f128665x;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("previewBtn");
            throw null;
        }
        view4.setEnabled(false);
        android.view.View view5 = this.f128665x;
        if (view5 != null) {
            view5.setOnClickListener(new com.tencent.mm.plugin.finder.ui.yc(this));
        } else {
            kotlin.jvm.internal.o.o("previewBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (intent != null) {
            pf5.u uVar = pf5.u.f353936a;
            if (i17 != 1001) {
                if (i17 == 1002 && intent.getBooleanExtra("key_is_set_cover", false)) {
                    this.C = true;
                    so2.b5 b5Var = this.M;
                    java.lang.String stringExtra = intent.getStringExtra("RESULT_COVER_FULL_PATH");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    b5Var.getClass();
                    b5Var.f410269d = stringExtra;
                    so2.b5 b5Var2 = this.M;
                    java.lang.String stringExtra2 = intent.getStringExtra("RESULT_COVER_PATH");
                    if (stringExtra2 == null) {
                        stringExtra2 = "";
                    }
                    b5Var2.getClass();
                    b5Var2.f410270e = stringExtra2;
                    this.M.f410272g = intent.getIntExtra("RESULT_COVER_STYLE", 0);
                    this.M.f410271f = intent.getLongExtra("RESULT_COVER_TIME_MS", 0L);
                    this.M.f410275m = intent.getIntExtra("key_cover_select_source", 0);
                    this.M.f410273h = intent.getByteArrayExtra("RESULT_COVER_CROP_MODEL");
                    this.M.f410274i = intent.getByteArrayExtra("RESULT_COVER_WORD_INFO_WRAP");
                    java.lang.String str = this.M.f410270e;
                    if (str.length() == 0) {
                        return;
                    }
                    this.Q = str;
                    mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    wo0.c d17 = d1Var.d(ya2.l.f460502a.e(str, com.tencent.mm.plugin.finder.storage.y90.f128355e));
                    g7();
                    d17.f447873d = new com.tencent.mm.plugin.finder.ui.cd(this);
                    ((wo0.b) d17).a();
                    return;
                }
                return;
            }
            if (intent.getBooleanExtra("key_is_set_cover", false)) {
                this.B = true;
                java.lang.String stringExtra3 = intent.getStringExtra("RESULT_COVER_FULL_PATH");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                this.E = stringExtra3;
                java.lang.String stringExtra4 = intent.getStringExtra("RESULT_COVER_PATH");
                if (stringExtra4 == null) {
                    stringExtra4 = "";
                }
                this.F = stringExtra4;
                android.content.Intent intent2 = this.D;
                intent2.putExtra("RESULT_COVER_PATH", stringExtra4);
                this.G = intent.getIntExtra("RESULT_COVER_QUALITY", 0);
                com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable localVideoCropInfoParcelable = (com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable) intent.getParcelableExtra("RESULT_CROP_INFO");
                if (localVideoCropInfoParcelable != null) {
                    intent2.putExtra("RESULT_CROP_INFO", localVideoCropInfoParcelable);
                }
                this.I = intent.getIntExtra("RESULT_COVER_STYLE", 0);
                this.H = intent.getLongExtra("RESULT_COVER_TIME_MS", 0L);
                this.L = intent.getIntExtra("key_cover_select_source", 0);
                this.f128660J = intent.getByteArrayExtra("RESULT_COVER_CROP_MODEL");
                this.K = intent.getByteArrayExtra("RESULT_COVER_WORD_INFO_WRAP");
                java.lang.String str2 = this.F;
                if (str2 == null) {
                    kotlin.jvm.internal.o.o("coverUrl");
                    throw null;
                }
                if (str2.length() == 0) {
                    return;
                }
                this.P = str2;
                mn2.d1 d1Var2 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                wo0.c d18 = d1Var2.d(ya2.l.f460502a.e(str2, com.tencent.mm.plugin.finder.storage.y90.f128355e));
                g7();
                d18.f447873d = new com.tencent.mm.plugin.finder.ui.ad(this);
                ((wo0.b) d18).a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0277, code lost:
    
        if ((r5.length() > 0) == true) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b4  */
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.onCreate(android.os.Bundle):void");
    }
}
