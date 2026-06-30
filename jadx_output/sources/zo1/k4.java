package zo1;

/* loaded from: classes5.dex */
public final class k4 extends androidx.recyclerview.widget.f2 implements io1.c {

    /* renamed from: i, reason: collision with root package name */
    public static android.text.style.TextAppearanceSpan f474668i = new android.text.style.TextAppearanceSpan(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.style.f494506yc);

    /* renamed from: m, reason: collision with root package name */
    public static final zo1.y3 f474669m = new zo1.y3();

    /* renamed from: n, reason: collision with root package name */
    public static android.text.style.TextAppearanceSpan f474670n = new android.text.style.TextAppearanceSpan(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.style.f494505yb);

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f474671o;

    /* renamed from: p, reason: collision with root package name */
    public static final zo1.z3 f474672p;

    /* renamed from: d, reason: collision with root package name */
    public zo1.a4 f474673d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f474674e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public long f474675f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f474676g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f474677h = -1;

    static {
        new android.graphics.PorterDuffColorFilter(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_1), android.graphics.PorterDuff.Mode.SRC_IN);
        f474671o = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.mvc);
        f474672p = new zo1.z3();
    }

    public final void B(long j17) {
        long j18 = this.f474677h;
        if (j17 != j18) {
            if (j18 >= 0) {
                this.f474676g = j18;
            }
            if (j17 >= 0) {
                this.f474675f = j17;
            }
        }
        this.f474677h = j17;
    }

    public final void E(zo1.b4 b4Var, com.tencent.wechat.aff.affroam.g gVar, com.tencent.wechat.aff.affroam.n0 n0Var) {
        if (n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_DELETING) {
            jz5.l a17 = com.tencent.mm.plugin.backup.roambackup.b.f92568a.a(gVar.f215829d);
            if ((a17 != null ? (com.tencent.mm.plugin.backup.roambackup.a) a17.f302833d : null) != com.tencent.mm.plugin.backup.roambackup.a.f92561e) {
                b4Var.f474559h.setAlpha(1.0f);
                b4Var.f474559h.setInterceptTouch(false);
                return;
            }
        }
        b4Var.f474559h.setAlpha(0.5f);
        b4Var.f474559h.setInterceptTouch(true);
    }

    @Override // io1.c
    public void P5(qo1.f0 task, float f17) {
        kotlin.jvm.internal.o.g(task, "task");
        pm0.v.X(new zo1.h4(this, task, f17));
    }

    @Override // io1.c
    public void V1(qo1.j0 task, com.tencent.wechat.aff.affroam.n0 state, qo1.i0 error) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(error, "error");
        pm0.v.X(new zo1.i4(this, task, com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(task.a()), state, error));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f474674e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.duu, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        zo1.b4 b4Var = new zo1.b4(inflate);
        inflate.setTag(b4Var);
        zo1.c4 c4Var = new zo1.c4(this);
        com.tencent.mm.plugin.backup.roambackup.ui.component.TaskStatusCardView taskStatusCardView = b4Var.f474560i;
        taskStatusCardView.setTaskChangeCallback(c4Var);
        taskStatusCardView.f92758w = b4Var;
        taskStatusCardView.setOnClickListener(null);
        b4Var.f474555d.setOnClickListener(new zo1.d4(b4Var, this));
        android.widget.TextView textView = b4Var.f474557f;
        textView.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView.getPaint().setStrokeWidth(1.25f);
        b4Var.f474561m.setOnClickListener(new zo1.e4(b4Var, this));
        b4Var.f474562n.setOnClickListener(new zo1.f4(b4Var, this));
        b4Var.f474563o.setOnClickListener(new zo1.g4(b4Var, this));
        return b4Var;
    }

    public final void x(long j17) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "expand package by id=" + j17);
        java.util.Iterator it = this.f474674e.iterator();
        int i18 = 0;
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else {
                if (((com.tencent.wechat.aff.affroam.g) it.next()).f215829d == j17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectPackageUI", "Fail to get package by id=" + j17);
            return;
        }
        java.util.Iterator it6 = this.f474674e.iterator();
        int i19 = 0;
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            if (((com.tencent.wechat.aff.affroam.g) it6.next()).f215829d == this.f474677h) {
                i17 = i19;
                break;
            }
            i19++;
        }
        B(j17);
        if (i17 >= 0) {
            notifyItemChanged(i17);
        }
        notifyItemChanged(i18);
        zo1.a4 a4Var = this.f474673d;
        if (a4Var != null) {
            ((zo1.r4) a4Var).a(i18);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(zo1.b4 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f474674e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "onBindViewHolder pkgId=" + gVar.f215829d + ", option=" + gVar.f215835m);
        po1.c cVar = po1.d.f357294i;
        com.tencent.wechat.aff.affroam.u uVar = gVar.f215832g;
        kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
        po1.d a17 = cVar.a(uVar);
        java.lang.String a18 = go1.d.f273944a.a(gVar);
        android.text.SpannableString spannableString = new android.text.SpannableString(a18);
        spannableString.setSpan(f474668i, 0, a18.length(), 33);
        android.widget.TextView textView = holder.f474557f;
        textView.setText(spannableString);
        if ((gVar.f215835m & 1) != 0) {
            textView.append(" ");
            java.lang.String str = f474671o;
            android.text.SpannableString spannableString2 = new android.text.SpannableString(str);
            spannableString2.setSpan(f474670n, 0, str.length(), 33);
            spannableString2.setSpan(f474672p, 0, str.length(), 33);
            spannableString2.setSpan(f474669m, 0, str.length(), 33);
            textView.append(spannableString2);
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        int ordinal = a17.f357296b.ordinal();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f474556e;
        if (ordinal == 0 || ordinal == 1) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_display_backup);
        } else if (ordinal != 2) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_usb);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_usb);
        }
        qo1.j0 d17 = qo1.j1.f365523a.d(gVar.f215829d);
        jz5.l d18 = d17.d();
        com.tencent.wechat.aff.affroam.n0 n0Var = (com.tencent.wechat.aff.affroam.n0) d18.f302833d;
        qo1.i0 i0Var = (qo1.i0) d18.f302834e;
        long j17 = this.f474677h;
        long j18 = gVar.f215829d;
        com.tencent.mm.plugin.backup.roambackup.ui.component.ClickableLinearLayout clickableLinearLayout = holder.f474559h;
        if (j17 == j18) {
            clickableLinearLayout.setVisibility(0);
            holder.f474560i.x(gVar, d17, n0Var, i0Var, true);
            E(holder, gVar, n0Var);
        } else {
            clickableLinearLayout.setVisibility(8);
            holder.f474560i.x(gVar, d17, n0Var, i0Var, false);
        }
        int itemCount = getItemCount();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = holder.f474558g;
        if (itemCount == 1) {
            weImageView2.setVisibility(8);
            this.f474675f = -1L;
            this.f474676g = -1L;
            return;
        }
        weImageView2.setVisibility(0);
        long j19 = this.f474675f;
        long j27 = gVar.f215829d;
        if (j19 == j27) {
            this.f474675f = -1L;
            android.view.ViewPropertyAnimator animate = weImageView2.animate();
            animate.cancel();
            weImageView2.setRotation(0.0f);
            animate.rotation(180.0f);
            animate.setDuration(300L);
            animate.start();
            return;
        }
        if (this.f474676g != j27) {
            weImageView2.setRotation(this.f474677h != j27 ? 0.0f : 180.0f);
            return;
        }
        this.f474676g = -1L;
        android.view.ViewPropertyAnimator animate2 = weImageView2.animate();
        animate2.cancel();
        weImageView2.setRotation(180.0f);
        animate2.rotation(0.0f);
        animate2.setDuration(300L);
        animate2.start();
    }

    public final void z(long j17) {
        java.util.Iterator it = this.f474674e.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((com.tencent.wechat.aff.affroam.g) it.next()).f215829d == j17) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 >= 0) {
            this.f474674e.remove(i17);
            notifyItemRemoved(i17);
            if (this.f474674e.size() == 1) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                zo1.j4 j4Var = new zo1.j4(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(j4Var, 150L, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        zo1.b4 holder = (zo1.b4) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "onBindViewHolder, payload.size = " + payloads.size());
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
            return;
        }
        java.lang.Object obj = this.f474674e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) obj;
        for (java.lang.Object obj2 : payloads) {
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            java.util.List list = (java.util.List) obj2;
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "onBindViewHolder, notifyType=" + list.get(0));
            java.lang.Object obj3 = list.get(0);
            boolean b17 = kotlin.jvm.internal.o.b(obj3, 1);
            com.tencent.mm.plugin.backup.roambackup.ui.component.TaskStatusCardView taskStatusCardView = holder.f474560i;
            if (b17) {
                java.lang.Object obj4 = list.get(2);
                qo1.f0 f0Var = obj4 instanceof qo1.f0 ? (qo1.f0) obj4 : null;
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SelectPackageUI", "onBindViewHolder with payloads, Fail to get task by pkgId=" + gVar.f215829d);
                    return;
                } else {
                    java.lang.Object obj5 = list.get(1);
                    kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Float");
                    taskStatusCardView.u(((java.lang.Float) obj5).floatValue(), f0Var);
                }
            } else if (kotlin.jvm.internal.o.b(obj3, 0)) {
                boolean z17 = this.f474677h == gVar.f215829d;
                com.tencent.mm.plugin.backup.roambackup.ui.component.TaskStatusCardView taskStatusCardView2 = holder.f474560i;
                java.lang.Object obj6 = list.get(3);
                kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.task.IRoamTask");
                qo1.j0 j0Var = (qo1.j0) obj6;
                java.lang.Object obj7 = list.get(1);
                kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type com.tencent.wechat.aff.affroam.AffRoamTaskState");
                com.tencent.wechat.aff.affroam.n0 n0Var = (com.tencent.wechat.aff.affroam.n0) obj7;
                java.lang.Object obj8 = list.get(2);
                kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.task.IRoamTask.ErrorType");
                taskStatusCardView2.x(gVar, j0Var, n0Var, (qo1.i0) obj8, z17);
                if (z17) {
                    java.lang.Object obj9 = list.get(1);
                    kotlin.jvm.internal.o.e(obj9, "null cannot be cast to non-null type com.tencent.wechat.aff.affroam.AffRoamTaskState");
                    E(holder, gVar, (com.tencent.wechat.aff.affroam.n0) obj9);
                }
            } else if (kotlin.jvm.internal.o.b(obj3, 2)) {
                if (this.f474677h != gVar.f215829d) {
                    return;
                }
                java.lang.Object obj10 = list.get(1);
                kotlin.jvm.internal.o.e(obj10, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((java.lang.Float) obj10).floatValue();
                if (taskStatusCardView.f92761z) {
                    taskStatusCardView.f447889g.setProgress((int) (floatValue * 100));
                } else {
                    taskStatusCardView.f92759x.setText(taskStatusCardView.B + ' ' + ((int) (floatValue * 100)) + '%');
                }
            } else {
                onBindViewHolder(holder, i17);
            }
        }
    }
}
