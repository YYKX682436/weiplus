package wo1;

/* loaded from: classes5.dex */
public abstract class a1 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f447886d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f447887e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f447888f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.loading.MMProgressLoading f447889g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f447890h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ProgressBar f447891i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f447892m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f447893n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.Button f447894o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.Button f447895p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.Button f447896q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f447897r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f447898s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f447899t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ObjectAnimator f447900u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.content.Context context, android.util.AttributeSet attrs, int i17, int i18) {
        super(context, attrs, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f447898s = jz5.h.b(new wo1.z(context));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, rj.t.f396153c);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            throw new java.lang.IllegalArgumentException("BaseTaskStatusView must have a valid layoutResource");
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(resourceId, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.s7y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f447887e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.s7z);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f447888f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f487227s81);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f447889g = (com.tencent.mm.ui.widget.loading.MMProgressLoading) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.f487230s84);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f447890h = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.f487228s82);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f447891i = (android.widget.ProgressBar) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.f487229s83);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f447892m = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.s7x);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById7;
        this.f447893n = textView;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.s7v);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f447894o = (android.widget.Button) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.s7w);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f447895p = (android.widget.Button) findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.f487226s80);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f447896q = (android.widget.Button) findViewById10;
        textView.setMovementMethod(new android.text.method.LinkMovementMethod());
        textView.setHighlightColor(0);
    }

    private final android.view.animation.Animation getInfiniteRotate() {
        return (android.view.animation.Animation) ((jz5.n) this.f447898s).getValue();
    }

    public final jz5.l a(com.tencent.wechat.aff.affroam.g pkgInfo, po1.d device, boolean z17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(device, "device");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "checkPermissionAndStartTask, pkgId=" + pkgInfo.f215829d + ", isBackup=" + z17);
        fo1.p pVar = fo1.p.f264890a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        if (!pVar.a((com.tencent.mm.ui.MMFragmentActivity) context, device, new wo1.y(pkgInfo, z17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseTaskStatusView", "[checkPermissionAndStartTask] permission denied. pkgId=" + pkgInfo.f215829d + ", isBackup=" + z17);
            return new jz5.l(null, java.lang.Boolean.TRUE);
        }
        qo1.d1 g17 = z17 ? qo1.j1.f365523a.g(pkgInfo) : qo1.j1.f365523a.h(pkgInfo, kz5.p0.f313996d);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "[checkPermissionAndStartTask] result = " + g17 + '.');
        int ordinal = g17.ordinal();
        if (ordinal == 0) {
            qo1.j0 d17 = qo1.j1.f365523a.d(pkgInfo.f215829d);
            if (d17 instanceof qo1.v0) {
                qo1.v0 v0Var = (qo1.v0) d17;
                if (v0Var.f365476b == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) {
                    v0Var.f365557x = true;
                }
            }
            return new jz5.l(g17, java.lang.Boolean.FALSE);
        }
        int i17 = com.tencent.mm.R.string.n0p;
        if (ordinal != 1) {
            if (ordinal == 2) {
                i17 = com.tencent.mm.R.string.n0q;
            } else if (ordinal != 3) {
                throw new jz5.j();
            }
        }
        android.content.Context context2 = getContext();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
        e4Var.d(i17);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
        return new jz5.l(g17, java.lang.Boolean.FALSE);
    }

    public final int b(po1.d dVar, qo1.j0 j0Var) {
        int ordinal = dVar.f357296b.ordinal();
        return (ordinal == 0 || ordinal == 1) ? ((j0Var instanceof qo1.c1) || (this.f447886d && (j0Var instanceof qo1.g0))) ? j0Var.b() ? com.tencent.mm.R.drawable.icon_restore_from_computer_doing : com.tencent.mm.R.drawable.icon_restore_from_computer_default : j0Var.b() ? com.tencent.mm.R.drawable.icon_backup_to_computer_doing : com.tencent.mm.R.drawable.icon_backup_to_computer_default : ordinal != 2 ? ((j0Var instanceof qo1.c1) || (this.f447886d && (j0Var instanceof qo1.g0))) ? j0Var.b() ? com.tencent.mm.R.drawable.icon_restore_from_cloud_doing : com.tencent.mm.R.drawable.icon_restore_from_cloud_default : j0Var.b() ? com.tencent.mm.R.drawable.icon_backup_to_cloud_doing : com.tencent.mm.R.drawable.icon_backup_to_cloud_default : ((j0Var instanceof qo1.c1) || (this.f447886d && (j0Var instanceof qo1.g0))) ? j0Var.b() ? com.tencent.mm.R.drawable.icon_restore_from_usb_doing : com.tencent.mm.R.drawable.icon_restore_from_usb_default : j0Var.b() ? com.tencent.mm.R.drawable.icon_backup_to_usb_doing : com.tencent.mm.R.drawable.icon_backup_to_usb_default;
    }

    public final java.lang.String c(qo1.j0 task) {
        kotlin.jvm.internal.o.g(task, "task");
        if ((task instanceof qo1.g0) && this.f447886d) {
            java.lang.String str = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
            return com.tencent.mm.plugin.backup.roambackup.w1.f92924b;
        }
        if (task instanceof qo1.c1) {
            java.lang.String str2 = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
            return com.tencent.mm.plugin.backup.roambackup.w1.f92924b;
        }
        java.lang.String str3 = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
        return com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
    }

    public void d(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(error, "error");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "[onAutoBackupConsecutiveFail] pkgId=" + task.f365483i + ", error=" + error);
        android.widget.ImageView imageView = this.f447888f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.tencent.mm.R.drawable.cwp);
        this.f447890h.setText(com.tencent.mm.R.string.f492873n00);
        android.widget.TextView textView = this.f447893n;
        textView.setVisibility(0);
        t(textView, pkgInfo);
        android.widget.Button button = this.f447895p;
        button.setVisibility(0);
        button.setText(com.tencent.mm.R.string.mwo);
        button.setOnClickListener(new wo1.a0(this, pkgInfo, device));
        android.widget.Button button2 = this.f447896q;
        button2.setVisibility(0);
        button2.setText(com.tencent.mm.R.string.f490680a72);
        button2.setOnClickListener(new wo1.b0(task, this, pkgInfo, device));
    }

    public void e(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        android.widget.ImageView imageView = this.f447888f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.tencent.mm.R.raw.checkbox_selected_filled);
        this.f447890h.setText(getContext().getString(com.tencent.mm.R.string.mzy, c(task)));
        if (task instanceof qo1.c1) {
            long m17 = ((qo1.c1) task).m();
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "onCompletedState failConvCount=" + m17);
            if (m17 > 0) {
                android.widget.TextView textView = this.f447893n;
                textView.setVisibility(0);
                textView.setText(getContext().getString(com.tencent.mm.R.string.ofn, java.lang.Long.valueOf(m17)));
            }
        }
    }

    public void f(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        android.widget.ImageView imageView = this.f447888f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.tencent.mm.R.raw.spinner_48_outer_holo);
        imageView.startAnimation(getInfiniteRotate());
        this.f447897r = true;
        this.f447890h.setText(com.tencent.mm.R.string.mzo);
        android.widget.TextView textView = this.f447893n;
        textView.setVisibility(0);
        textView.setText(getContext().getString(com.tencent.mm.R.string.mzq, c(task)));
        android.widget.Button button = this.f447896q;
        button.setVisibility(0);
        button.setText(com.tencent.mm.R.string.mvh);
        button.setOnClickListener(new wo1.c0(this, pkgInfo, task, device));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(com.tencent.wechat.aff.affroam.g r18, qo1.f0 r19, po1.d r20, qo1.i0 r21) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo1.a1.g(com.tencent.wechat.aff.affroam.g, qo1.f0, po1.d, qo1.i0):void");
    }

    public final boolean getDummyAsRestore() {
        return this.f447886d;
    }

    public final android.widget.Button getGreenBtn() {
        return this.f447894o;
    }

    public final android.widget.Button getGreyBtn() {
        return this.f447895p;
    }

    public final android.widget.TextView getHintTv() {
        return this.f447893n;
    }

    public final android.widget.ImageView getIconRectangle() {
        return this.f447887e;
    }

    public final android.widget.ImageView getIconSquare() {
        return this.f447888f;
    }

    public final android.widget.Button getLinkBtn() {
        return this.f447896q;
    }

    public final com.tencent.mm.ui.widget.loading.MMProgressLoading getLoadingProgress() {
        return this.f447889g;
    }

    public final boolean getNeedRotateAnimation() {
        return this.f447897r;
    }

    public final android.widget.ProgressBar getProgressBar() {
        return this.f447891i;
    }

    public final android.widget.TextView getProgressHintTv() {
        return this.f447892m;
    }

    public final android.widget.TextView getTitleTv() {
        return this.f447890h;
    }

    public void h(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        java.lang.String string;
        java.lang.String string2;
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(error, "error");
        android.widget.ImageView imageView = this.f447888f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.tencent.mm.R.drawable.cwp);
        int ordinal = task.f365476b.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseTaskStatusView", "Task type error.");
            return;
        }
        if (ordinal == 1) {
            q(pkgInfo, task, device, -1);
            return;
        }
        android.widget.TextView textView = this.f447890h;
        android.widget.Button button = this.f447895p;
        if (ordinal == 2) {
            textView.setText(getContext().getString(com.tencent.mm.R.string.f492877n04, device.b()));
            if (task.f365479e == null) {
                string = getContext().getString(com.tencent.mm.R.string.aby);
            } else {
                android.content.Context context = getContext();
                java.lang.String str = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
                string = context.getString(com.tencent.mm.R.string.mwj, com.tencent.mm.plugin.backup.roambackup.w1.f92923a);
            }
            button.setText(string);
        } else if (ordinal == 3) {
            textView.setText(com.tencent.mm.R.string.f492879n06);
            android.widget.TextView textView2 = this.f447893n;
            textView2.setVisibility(0);
            textView2.setText(com.tencent.mm.R.string.mvx);
            if (task.f365479e == null) {
                string2 = getContext().getString(com.tencent.mm.R.string.aby);
            } else {
                android.content.Context context2 = getContext();
                java.lang.String str2 = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
                string2 = context2.getString(com.tencent.mm.R.string.mwj, com.tencent.mm.plugin.backup.roambackup.w1.f92924b);
            }
            button.setText(string2);
        }
        if (task.f365479e != null) {
            android.widget.ProgressBar progressBar = this.f447891i;
            progressBar.setVisibility(0);
            com.tencent.wechat.aff.affroam.a2 a2Var = task.f365479e;
            progressBar.setProgress((int) ((a2Var != null ? a2Var.b() : 0.0f) * 100));
            progressBar.setProgressDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.aow));
        }
        button.setVisibility(0);
        button.setOnClickListener(new wo1.j0(this, pkgInfo, device, task));
        android.widget.Button button2 = this.f447896q;
        button2.setVisibility(0);
        button2.setText(com.tencent.mm.R.string.mvh);
        button2.setOnClickListener(new wo1.k0(this, pkgInfo, task, device));
    }

    public void i(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, com.tencent.mm.plugin.backup.roambackup.a extState, java.lang.Object obj) {
        java.lang.String c17;
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(extState, "extState");
        int ordinal = extState.ordinal();
        android.widget.TextView textView = this.f447890h;
        android.widget.ImageView imageView = this.f447888f;
        android.widget.TextView textView2 = this.f447893n;
        if (ordinal == 0) {
            if (!(obj instanceof java.lang.Boolean)) {
                c17 = c(task);
            } else if (((java.lang.Boolean) obj).booleanValue()) {
                java.lang.String str = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
                c17 = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
            } else {
                java.lang.String str2 = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
                c17 = com.tencent.mm.plugin.backup.roambackup.w1.f92924b;
            }
            imageView.setVisibility(0);
            imageView.setImageResource(com.tencent.mm.R.drawable.cwp);
            textView.setText(getContext().getString(com.tencent.mm.R.string.n08, c17));
            textView2.setVisibility(0);
            textView2.setText(com.tencent.mm.R.string.myl);
            android.widget.Button button = this.f447895p;
            button.setVisibility(0);
            button.setText(com.tencent.mm.R.string.aby);
            button.setOnClickListener(new wo1.l0(this, pkgInfo, device, task));
            android.widget.Button button2 = this.f447896q;
            button2.setVisibility(0);
            button2.setText(com.tencent.mm.R.string.mvh);
            button2.setOnClickListener(new wo1.m0(extState, pkgInfo));
            return;
        }
        if (ordinal != 1) {
            return;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.listeners.DeleteParams");
        io1.a aVar = (io1.a) obj;
        boolean z17 = aVar.f293456e;
        io1.b bVar = aVar.f293453b;
        if (z17) {
            imageView.setVisibility(0);
            imageView.setImageResource(com.tencent.mm.R.raw.checkbox_selected_filled);
            textView.setText(com.tencent.mm.R.string.mvu);
            if (bVar == io1.b.f293458d && aVar.f293457f == -1) {
                textView2.setText(getContext().getString(com.tencent.mm.R.string.mxa, aVar.f293454c.f357299e));
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading = this.f447889g;
        mMProgressLoading.setVisibility(0);
        android.animation.ValueAnimator valueAnimator = this.f447899t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        int i17 = (int) (aVar.f293455d * 100);
        if (i17 > mMProgressLoading.getProgress()) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(mMProgressLoading.getProgress(), i17);
            ofInt.setDuration(500L);
            ofInt.addUpdateListener(new wo1.n0(this));
            ofInt.start();
            this.f447899t = ofInt;
        } else {
            mMProgressLoading.setProgress(i17);
        }
        if (bVar == io1.b.f293458d) {
            textView.setText(com.tencent.mm.R.string.mvt);
        } else {
            textView.setText(com.tencent.mm.R.string.mzp);
        }
        textView2.setVisibility(0);
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.mvr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        textView2.setText(getContext().getString(com.tencent.mm.R.string.mzq, string));
    }

    public void j(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        android.widget.ImageView imageView = this.f447888f;
        imageView.setVisibility(0);
        imageView.setImageResource(com.tencent.mm.R.raw.spinner_green_48_outer_holo);
        imageView.startAnimation(getInfiniteRotate());
        this.f447897r = true;
        this.f447890h.setText(com.tencent.mm.R.string.n0b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r11.a(r3) <= java.lang.System.currentTimeMillis()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r2 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r0.setText(getContext().getString(com.tencent.mm.R.string.mvd, fo1.r.a(r11.a(r8.f215829d))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        r11 = r7.f447895p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r0.setText(com.tencent.mm.R.string.mve);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
    
        if (((r8.f215835m & 1) != 0) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (((qo1.f0) r9).f365476b != com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r11 = eo1.a.f255545a;
        r3 = r8.f215829d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        monitor-enter(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.tencent.wechat.aff.affroam.g r8, qo1.j0 r9, po1.d r10, int r11) {
        /*
            r7 = this;
            java.lang.String r0 = "pkgInfo"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "task"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "device"
            kotlin.jvm.internal.o.g(r10, r0)
            android.widget.ImageView r0 = r7.f447887e
            r1 = 0
            r0.setVisibility(r1)
            r0.setImageResource(r11)
            boolean r11 = r9 instanceof qo1.f0
            android.widget.TextView r0 = r7.f447890h
            r2 = 1
            if (r11 == 0) goto L29
            r11 = r9
            qo1.f0 r11 = (qo1.f0) r11
            com.tencent.wechat.aff.affroam.o0 r3 = com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP
            com.tencent.wechat.aff.affroam.o0 r11 = r11.f365476b
            if (r11 == r3) goto L37
        L29:
            boolean r11 = r9 instanceof qo1.g0
            if (r11 == 0) goto L76
            int r11 = r8.f215835m
            r11 = r11 & r2
            if (r11 == 0) goto L34
            r11 = r2
            goto L35
        L34:
            r11 = r1
        L35:
            if (r11 == 0) goto L76
        L37:
            eo1.a r11 = eo1.a.f255545a
            long r3 = r8.f215829d
            monitor-enter(r11)
            long r3 = r11.a(r3)     // Catch: java.lang.Throwable -> L73
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L49
            goto L4a
        L49:
            r2 = r1
        L4a:
            monitor-exit(r11)
            if (r2 == 0) goto L6a
            long r2 = r8.f215829d
            long r2 = r11.a(r2)
            android.content.Context r11 = r7.getContext()
            java.lang.String r2 = fo1.r.a(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 2131774146(0x7f104ac2, float:1.91797E38)
            java.lang.String r11 = r11.getString(r3, r2)
            r0.setText(r11)
            goto L70
        L6a:
            r11 = 2131774147(0x7f104ac3, float:1.9179702E38)
            r0.setText(r11)
        L70:
            android.widget.Button r11 = r7.f447895p
            goto Lbb
        L73:
            r8 = move-exception
            monitor-exit(r11)
            throw r8
        L76:
            po1.a r11 = com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo.CREATOR
            com.tencent.wechat.aff.affroam.i r2 = r8.f215834i
            java.lang.String r3 = "getBackupRange(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo r11 = r11.a(r2)
            po1.b r11 = r11.f92730d
            po1.b r2 = po1.b.f357289d
            if (r11 != r2) goto L95
            android.content.Context r11 = r7.getContext()
            r2 = 2131774162(0x7f104ad2, float:1.9179732E38)
            java.lang.String r11 = r11.getString(r2)
            goto La0
        L95:
            android.content.Context r11 = r7.getContext()
            r2 = 2131774291(0x7f104b53, float:1.9179994E38)
            java.lang.String r11 = r11.getString(r2)
        La0:
            kotlin.jvm.internal.o.d(r11)
            android.content.Context r2 = r7.getContext()
            java.lang.String r3 = r10.b()
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r3}
            r3 = 2131774384(0x7f104bb0, float:1.9180182E38)
            java.lang.String r11 = r2.getString(r3, r11)
            r0.setText(r11)
            android.widget.Button r11 = r7.f447894o
        Lbb:
            android.widget.TextView r0 = r7.f447893n
            r7.t(r0, r8)
            r11.setVisibility(r1)
            r0 = 2131774203(0x7f104afb, float:1.9179815E38)
            r11.setText(r0)
            wo1.o0 r0 = new wo1.o0
            r0.<init>(r8, r9, r10, r7)
            r11.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wo1.a1.k(com.tencent.wechat.aff.affroam.g, qo1.j0, po1.d, int):void");
    }

    public void l(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(error, "error");
        android.widget.ImageView imageView = this.f447888f;
        imageView.setVisibility(0);
        if (task.o()) {
            imageView.setImageResource(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
            imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(getResources().getColor(com.tencent.mm.R.color.FG_2), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            imageView.setImageResource(com.tencent.mm.R.drawable.cwp);
        }
        this.f447890h.setText(com.tencent.mm.R.string.mzl);
        android.widget.Button button = this.f447895p;
        button.setVisibility(0);
        button.setText(getContext().getString(com.tencent.mm.R.string.aby));
        button.setOnClickListener(new wo1.p0(this, pkgInfo, device, task));
        android.widget.Button button2 = this.f447896q;
        button2.setVisibility(0);
        button2.setText(com.tencent.mm.R.string.mvh);
        button2.setOnClickListener(new wo1.q0(this, pkgInfo, task, device));
    }

    public void m(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        this.f447888f.setVisibility(0);
        this.f447888f.setImageResource(com.tencent.mm.R.raw.spinner_48_outer_holo);
        this.f447888f.startAnimation(getInfiniteRotate());
        this.f447897r = true;
        this.f447890h.setText(com.tencent.mm.R.string.n0h);
        if (task instanceof qo1.f0) {
            int i18 = ((qo1.f0) task).f365487m;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "[onPreparingState] prepareState=" + i18);
            if (i18 == 1) {
                this.f447890h.setText(com.tencent.mm.R.string.mzx);
            } else if (i18 == 2) {
                this.f447890h.setText(com.tencent.mm.R.string.mzw);
            }
        }
        this.f447893n.setVisibility(0);
        this.f447893n.setText(getContext().getString(com.tencent.mm.R.string.mzq, c(task)));
        this.f447896q.setVisibility(0);
        this.f447896q.setText(com.tencent.mm.R.string.mvh);
        this.f447896q.setOnClickListener(new wo1.r0(this, pkgInfo, task, device));
    }

    public void n(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(error, "error");
        com.tencent.mars.xlog.Log.e("MicroMsg.BaseTaskStatusView", "onRestError, pkgId=" + task.f365483i + " taskType=" + task.f365476b + ", error=" + error);
        boolean o17 = task.o();
        boolean z17 = (task instanceof qo1.v0) && ((qo1.v0) task).f365557x;
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseTaskStatusView", "pkgId=" + task.f365483i + " isAutoBackup=" + o17 + ", needShowError=" + z17);
        if (o17 && !z17) {
            q(pkgInfo, task, device, -1);
            return;
        }
        java.lang.String c17 = c(task);
        this.f447888f.setVisibility(0);
        if (o17) {
            this.f447888f.setImageResource(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
            this.f447888f.setColorFilter(new android.graphics.PorterDuffColorFilter(getResources().getColor(com.tencent.mm.R.color.FG_2), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            this.f447888f.setImageResource(com.tencent.mm.R.drawable.cwp);
        }
        this.f447890h.setText(getContext().getString(com.tencent.mm.R.string.n08, c17));
        if (task.f365479e == null) {
            this.f447895p.setText(com.tencent.mm.R.string.aby);
        } else {
            this.f447891i.setVisibility(0);
            android.widget.ProgressBar progressBar = this.f447891i;
            com.tencent.wechat.aff.affroam.a2 a2Var = task.f365479e;
            kotlin.jvm.internal.o.d(a2Var);
            progressBar.setProgress((int) (a2Var.b() * 100));
            this.f447891i.setProgressDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.aow));
            this.f447895p.setText(getContext().getString(com.tencent.mm.R.string.mwj, c17));
        }
        this.f447895p.setVisibility(0);
        this.f447895p.setOnClickListener(new wo1.s0(this, pkgInfo, device, task));
        this.f447896q.setVisibility(0);
        this.f447896q.setText(com.tencent.mm.R.string.mvh);
        this.f447896q.setOnClickListener(new wo1.t0(this, pkgInfo, task, device));
    }

    public void o(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, qo1.i0 error, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(error, "error");
        kotlin.jvm.internal.o.g(device, "device");
        qo1.f0 f0Var = (qo1.f0) task;
        java.lang.String c17 = c(task);
        android.widget.ImageView imageView = this.f447887e;
        imageView.setVisibility(0);
        imageView.setImageResource(i17);
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        java.lang.String str = pkgInfo.f215832g.f215989e;
        kotlin.jvm.internal.o.f(str, "getDeviceId(...)");
        com.tencent.mm.plugin.backup.roambackup.n nVar = (com.tencent.mm.plugin.backup.roambackup.n) com.tencent.mm.plugin.backup.roambackup.r0.f92689f.get(str);
        if (nVar == null) {
            nVar = com.tencent.mm.plugin.backup.roambackup.n.f92657d;
        }
        int ordinal = nVar.ordinal();
        this.f447890h.setText(getContext().getString(ordinal != 1 ? ordinal != 2 ? com.tencent.mm.R.string.n0i : com.tencent.mm.R.string.n0m : com.tencent.mm.R.string.n0n, c17));
        android.widget.TextView textView = this.f447893n;
        textView.setVisibility(0);
        if (nVar == com.tencent.mm.plugin.backup.roambackup.n.f92658e && f0Var.f365482h) {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.n0o);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.mw_);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            s(textView, string, string2, new wo1.u0(this, task, device));
        } else {
            textView.setText(getContext().getString(com.tencent.mm.R.string.mzq, c17));
        }
        android.widget.ProgressBar progressBar = this.f447891i;
        progressBar.setVisibility(0);
        this.f447892m.setVisibility(0);
        progressBar.setProgressDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.aoy));
        u(-1.0f, task);
        android.widget.Button button = this.f447896q;
        button.setVisibility(0);
        button.setText(com.tencent.mm.R.string.mwr);
        button.setOnClickListener(new wo1.v0(this, pkgInfo, task, device));
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        if (this.f447897r && z17) {
            android.widget.ImageView imageView = this.f447888f;
            imageView.clearAnimation();
            imageView.startAnimation(getInfiniteRotate());
        }
    }

    public abstract void p(com.tencent.wechat.aff.affroam.g gVar, qo1.f0 f0Var, po1.d dVar);

    public void q(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        com.tencent.wechat.aff.affroam.a2 c17 = task.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "Task failed before enter sdk. pkgId=" + task.a());
            if (i17 <= 0) {
                i17 = b(device, task);
            }
            k(pkgInfo, task, device, i17);
            return;
        }
        java.lang.String c18 = c(task);
        android.widget.ImageView imageView = this.f447888f;
        imageView.setVisibility(0);
        long j17 = c17.c().f215947e;
        boolean z18 = task instanceof qo1.f0;
        android.widget.TextView textView = this.f447890h;
        if (z18) {
            if (((qo1.f0) task).f365476b == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) {
                android.widget.TextView textView2 = this.f447893n;
                textView2.setVisibility(0);
                if (((com.tencent.wechat.aff.affroam.n0) task.d().f302833d) == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED) {
                    eo1.a aVar = eo1.a.f255545a;
                    long j18 = pkgInfo.f215829d;
                    synchronized (aVar) {
                        z17 = aVar.a(j18) > java.lang.System.currentTimeMillis();
                    }
                    if (z17) {
                        imageView.setImageResource(com.tencent.mm.R.raw.checkbox_selected_filled);
                        textView.setText(com.tencent.mm.R.string.oes);
                        textView2.setText(com.tencent.mm.R.string.mwp);
                        return;
                    }
                }
                imageView.setImageResource(com.tencent.mm.R.raw.clock_filled);
                imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(getResources().getColor(com.tencent.mm.R.color.Blue_100), android.graphics.PorterDuff.Mode.SRC_IN));
                textView.setText(getContext().getString(com.tencent.mm.R.string.n0k, com.tencent.mm.sdk.platformtools.t8.S1(j17)));
                textView2.setText(com.tencent.mm.R.string.mzm);
                return;
            }
        }
        imageView.setImageResource(com.tencent.mm.R.raw.checkbox_selected_filled);
        textView.setText(getContext().getString(com.tencent.mm.R.string.n0l, c18));
    }

    public void r() {
        this.f447897r = false;
        android.widget.ImageView imageView = this.f447888f;
        imageView.clearAnimation();
        imageView.setVisibility(8);
        imageView.clearColorFilter();
        this.f447889g.setVisibility(8);
        this.f447887e.setVisibility(8);
        this.f447891i.setVisibility(8);
        this.f447892m.setVisibility(8);
        this.f447893n.setVisibility(8);
        this.f447894o.setVisibility(8);
        this.f447895p.setVisibility(8);
        this.f447896q.setVisibility(8);
    }

    public final void s(android.widget.TextView textView, java.lang.String hintStr, java.lang.String linkStr, yz5.a cb6) {
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(hintStr, "hintStr");
        kotlin.jvm.internal.o.g(linkStr, "linkStr");
        kotlin.jvm.internal.o.g(cb6, "cb");
        textView.setText(hintStr);
        textView.append(" ");
        android.text.SpannableString spannableString = new android.text.SpannableString(linkStr);
        spannableString.setSpan(new wo1.z0(this, cb6), 0, linkStr.length(), 33);
        textView.append(spannableString);
    }

    public final void setDummyAsRestore(boolean z17) {
        this.f447886d = z17;
    }

    public final void setNeedRotateAnimation(boolean z17) {
        this.f447897r = z17;
    }

    public final void t(android.widget.TextView view, com.tencent.wechat.aff.affroam.g pkgInfo) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        view.setVisibility(0);
        if (pkgInfo.f215837o.f215839e > 0) {
            com.tencent.wechat.aff.affroam.l0 h17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().h(pkgInfo.f215829d);
            long j17 = 1000;
            long j18 = pkgInfo.f215837o.f215839e * j17;
            long j19 = h17.f215890g * j17;
            long j27 = h17.f215888e;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "pkgId = " + pkgInfo.f215829d + ", lastBackupUpdateTime = " + j19 + ", lastStopOrErrorTime = " + j27 + ", timestamp = " + j18);
            if (j19 <= 0) {
                string = getContext().getString(com.tencent.mm.R.string.n0f, k35.m1.f(getContext(), j18, true, false));
            } else if (j27 >= j19) {
                string = getContext().getString(com.tencent.mm.R.string.n0j, k35.m1.f(getContext(), j27, true, false));
            } else {
                string = getContext().getString(com.tencent.mm.R.string.n0e, k35.m1.f(getContext(), j19, true, false));
            }
        } else {
            string = getContext().getString(com.tencent.mm.R.string.mzz);
        }
        view.setText(string);
    }

    public void u(float f17, qo1.j0 task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.wechat.aff.affroam.a2 c17 = task.c();
        if (c17 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail to get roamTask by pkgId=");
            qo1.f0 f0Var = task instanceof qo1.f0 ? (qo1.f0) task : null;
            sb6.append(f0Var != null ? java.lang.Long.valueOf(f0Var.f365483i) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", sb6.toString());
            return;
        }
        com.tencent.wechat.aff.affroam.p0 c18 = c17.c();
        if (f17 < 0.0f) {
            f17 = c17.b();
        }
        int i17 = (int) (f17 * 100);
        kotlin.jvm.internal.o.d(c18);
        java.lang.String b17 = fo1.r.b(c18);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "updateProgress, progress = " + i17 + ", hint = " + b17);
        this.f447892m.setText(b17);
        android.animation.ObjectAnimator objectAnimator = this.f447900u;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        android.widget.ProgressBar progressBar = this.f447891i;
        if (progressBar.getProgress() <= 0 || i17 - progressBar.getProgress() <= 2.0f) {
            progressBar.setProgress(i17);
            return;
        }
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), i17);
        if (i17 < 90) {
            ofInt.setDuration(1000L);
        } else {
            ofInt.setDuration((java.lang.Math.max(100 - i17, 0) * 50) + 100);
        }
        ofInt.start();
        this.f447900u = ofInt;
    }

    public final void v(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, com.tencent.wechat.aff.affroam.n0 state, qo1.i0 error) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(error, "error");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "updateStatus state = " + state + ", error=" + error + ", pkgId=" + pkgInfo.f215829d);
        po1.c cVar = po1.d.f357294i;
        com.tencent.wechat.aff.affroam.u uVar = pkgInfo.f215832g;
        kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
        po1.d a17 = cVar.a(uVar);
        int b17 = b(a17, task);
        r();
        jz5.l a18 = com.tencent.mm.plugin.backup.roambackup.b.f92568a.a(pkgInfo.f215829d);
        if (a18 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Intercept normal state=");
            sb6.append(state);
            sb6.append(" and show extState=");
            java.lang.Object obj = a18.f302833d;
            sb6.append(obj);
            sb6.append(", extra=");
            sb6.append(a18.f302834e);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", sb6.toString());
            i(pkgInfo, task, a17, (com.tencent.mm.plugin.backup.roambackup.a) obj, a18.f302834e);
            return;
        }
        switch (state) {
            case AFFROAM_TASK_STATE_INITED:
                k(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_PREPARING:
                m(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_RUNNING:
                o(pkgInfo, task, error, a17, b17);
                return;
            case AFFROAM_TASK_STATE_PAUSED:
                g(pkgInfo, (qo1.f0) task, a17, qo1.i0.f365509p);
                return;
            case AFFROAM_TASK_STATE_COMPLETED:
                e(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_STOPPED:
                q(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_QUIT:
                g(pkgInfo, (qo1.f0) task, a17, qo1.i0.f365509p);
                return;
            case AFFROAM_TASK_STATE_ERROR:
                if (!(task instanceof qo1.f0)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BaseTaskStatusView", "Task type error");
                    return;
                }
                qo1.f0 f0Var = (qo1.f0) task;
                if (f0Var.o() && f0Var.p()) {
                    d(pkgInfo, f0Var, a17, error);
                    return;
                }
                switch (error.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        n(pkgInfo, f0Var, a17, error);
                        return;
                    case 4:
                        h(pkgInfo, f0Var, a17, error);
                        return;
                    case 5:
                    case 7:
                        g(pkgInfo, f0Var, a17, error);
                        return;
                    case 8:
                        l(pkgInfo, f0Var, a17, error);
                        return;
                    case 9:
                        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "Error state, pkgId=" + pkgInfo.f215829d);
                        return;
                    default:
                        return;
                }
            case AFFROAM_TASK_STATE_IMPORTING:
                j(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_DELETING:
                f(pkgInfo, task, a17, b17);
                return;
            case AFFROAM_TASK_STATE_CONNECTING:
                m(pkgInfo, task, a17, b17);
                return;
            default:
                return;
        }
    }
}
