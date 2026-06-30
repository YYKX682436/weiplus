package sc2;

/* loaded from: classes2.dex */
public abstract class d6 extends ad2.h {
    public static final java.lang.Object A = new java.lang.Object();
    public static final java.lang.Object B = new java.lang.Object();

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f405836w = jz5.h.b(sc2.x5.f406366d);

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.component.FinderBaseCarouseCardJumperObserver$feedChangeListener$1 f405837x;

    /* renamed from: y, reason: collision with root package name */
    public kotlinx.coroutines.r2 f405838y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f405839z;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.feed.component.FinderBaseCarouseCardJumperObserver$feedChangeListener$1] */
    public d6() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f405837x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.component.FinderBaseCarouseCardJumperObserver$feedChangeListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                xc2.p0 p0Var;
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
                com.tencent.mm.protocal.protobuf.NativeInfo native_info;
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ia iaVar = event.f54252g;
                if (iaVar.f6919b == 11) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String username = iaVar.f6924g;
                    kotlin.jvm.internal.o.f(username, "username");
                    for (java.lang.String str : ((b92.d1) zbVar).vj(username)) {
                        sc2.d6 d6Var = sc2.d6.this;
                        xc2.p0 p0Var2 = d6Var.f3147h;
                        if (((p0Var2 == null || (finderJumpInfo = p0Var2.f453234a) == null || (native_info = finderJumpInfo.getNative_info()) == null || native_info.getNative_type() != 34) ? false : true) && (p0Var = d6Var.f3147h) != null) {
                            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                            java.lang.String string = d6Var.O(str, p0Var).getString(4);
                            if (string == null) {
                                string = "";
                            }
                            r45.h32 bj6 = ((b92.d1) zbVar2).bj(str, string);
                            if (bj6 != null) {
                                pm0.v.X(new sc2.l5(d6Var, bj6, p0Var));
                            }
                        }
                    }
                }
                return true;
            }
        };
    }

    public static final void T(r45.h32 h32Var, java.lang.String str, sc2.d6 d6Var, xc2.p0 p0Var, android.content.Context context, int i17, android.view.View view) {
        int i18;
        h32Var.set(1, java.lang.Integer.valueOf(i17 == 1 ? 0 : 1));
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String string = h32Var.getString(4);
        kotlin.jvm.internal.o.d(string);
        gm0.j1.d().g(c61.zb.x3((c61.zb) c17, str, string, i17, null, null, 11, null, null, null, null, null, null, null, 8144, null));
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String string2 = h32Var.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        if (((b92.d1) zbVar).bj(str, string2) == null) {
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string3 = h32Var.getString(4);
            ((b92.d1) zbVar2).Ai(str, string3 != null ? string3 : "", h32Var);
            i18 = 1;
        } else {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string4 = h32Var.getString(4);
            r45.h32 bj6 = ((b92.d1) zbVar3).bj(str, string4 != null ? string4 : "");
            i18 = 1;
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
            }
        }
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.g8.class))).f417974d.M0(str);
        d6Var.U(h32Var, p0Var, view);
        if (h32Var.getInteger(i18) == 0) {
            java.lang.String string5 = context.getString(com.tencent.mm.R.string.e0j);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            db5.t7.m(context, string5);
        }
    }

    @Override // ad2.h
    public void C(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        dead();
        super.C(holder);
    }

    public final void G(android.view.View jumpView, r45.i55 i55Var, r45.i55 i55Var2) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        if (i55Var == null || i55Var2 == null || (viewGroup = (android.view.ViewGroup) jumpView.findViewById(com.tencent.mm.R.id.ft_)) == null || (viewGroup2 = (android.view.ViewGroup) jumpView.findViewById(com.tencent.mm.R.id.ft8)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewGroup2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewGroup2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(viewGroup2, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(viewGroup2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        viewGroup2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(viewGroup2, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        pm0.v.b(viewGroup2, new sc2.u5(this, jumpView, viewGroup, viewGroup2));
    }

    public final void H(android.view.View view, float f17, float f18, long j17) {
        kotlin.jvm.internal.o.g(view, "view");
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(f17, f18).setDuration(j17);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.addUpdateListener(new sc2.h5(view));
        duration.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0660  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(com.tencent.mm.plugin.finder.model.BaseFinderFeed r35, in5.s0 r36, android.view.View r37, xc2.p0 r38, java.lang.String r39, r45.i55 r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 2354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.I(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String, r45.i55, boolean):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:13|(1:15)(1:114)|16|(1:18)(2:104|(21:106|(1:108)(2:110|(1:112))|109|22|23|24|(1:26)(1:98)|27|(1:29)(1:97)|30|(1:32)(1:96)|33|(1:95)(1:37)|(1:39)(3:91|(1:93)|94)|(3:41|(1:43)|(1:45))|46|(1:90)(1:50)|(1:52)(3:77|(1:89)(1:81)|(5:83|(1:85)(1:88)|(1:87)|54|(7:56|(1:58)|59|(1:61)|(1:63)|(1:65)|(2:67|68)(1:69))(3:70|(1:72)|(2:74|75)(1:76))))|53|54|(0)(0))(1:113))|(1:20)(2:101|(1:103))|21|22|23|24|(0)(0)|27|(0)(0)|30|(0)(0)|33|(1:35)|95|(0)(0)|(0)|46|(1:48)|90|(0)(0)|53|54|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02a1, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(r10, r0, "parse color crash2, button_bg_color=" + r40.getString(4) + "， button_font_color=" + r40.getString(7), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02a0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0253 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:24:0x0249, B:26:0x0253, B:27:0x026d, B:29:0x0277, B:97:0x028e, B:98:0x025f), top: B:23:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0277 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:24:0x0249, B:26:0x0253, B:27:0x026d, B:29:0x0277, B:97:0x028e, B:98:0x025f), top: B:23:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e A[Catch: all -> 0x02a0, TRY_LEAVE, TryCatch #0 {all -> 0x02a0, blocks: (B:24:0x0249, B:26:0x0253, B:27:0x026d, B:29:0x0277, B:97:0x028e, B:98:0x025f), top: B:23:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025f A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:24:0x0249, B:26:0x0253, B:27:0x026d, B:29:0x0277, B:97:0x028e, B:98:0x025f), top: B:23:0x0249 }] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(com.tencent.mm.plugin.finder.model.BaseFinderFeed r36, in5.s0 r37, android.view.View r38, xc2.p0 r39, r45.i55 r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.J(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, r45.i55, java.lang.String):void");
    }

    public final void K(xc2.p0 jumpInfoEx, android.view.View jumpView) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(jumpInfoEx, "jumpInfoEx");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        if (Q(jumpInfoEx)) {
            android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.eex);
            android.view.View findViewById = jumpView.findViewById(com.tencent.mm.R.id.eet);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) jumpView.findViewById(com.tencent.mm.R.id.lte);
            r45.i55 M = M(jumpInfoEx);
            java.lang.String string2 = M != null ? M.getString(4) : null;
            if (string2 == null || string2.length() == 0) {
                findViewById.setBackgroundColor(jumpView.getContext().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            }
            string = M != null ? M.getString(7) : null;
            if (string == null || string.length() == 0) {
                weImageView.setIconColor(jumpView.getContext().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                textView.setTextColor(jumpView.getContext().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.eew);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) jumpView.findViewById(com.tencent.mm.R.id.ltf);
        android.view.View findViewById2 = jumpView.findViewById(com.tencent.mm.R.id.ees);
        r45.i55 P = P(jumpInfoEx);
        java.lang.String string3 = P != null ? P.getString(4) : null;
        if (string3 == null || string3.length() == 0) {
            findViewById2.setBackgroundColor(jumpView.getContext().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
        string = P != null ? P.getString(7) : null;
        if (string == null || string.length() == 0) {
            weImageView2.setIconColor(jumpView.getContext().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView2.setTextColor(jumpView.getContext().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        }
    }

    public final java.lang.String L(android.content.Context context, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        long j18 = com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
        long j19 = j17 / j18;
        long j27 = 3600000;
        long j28 = (j17 % j18) / j27;
        long j29 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        long j37 = (j17 % j27) / j29;
        long j38 = (j17 % j29) / 1000;
        java.lang.String str = "";
        if (j19 > 0) {
            str = "" + context.getResources().getString(com.tencent.mm.R.string.db8, java.lang.String.valueOf(j19));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        java.lang.String format = java.lang.String.format("%02d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38)}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        return sb6.toString();
    }

    public final r45.i55 M(xc2.p0 infoEx) {
        java.lang.Object obj;
        r45.bg0 bg0Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 24) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (bg0Var = (r45.bg0) wf6Var.getCustom(32)) == null) {
            return null;
        }
        return (r45.i55) bg0Var.getCustom(1);
    }

    public final int N(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return (int) ((com.tencent.mm.ui.bh.a(context).f197135a * 0.6d) - context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479729dl));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.h32 O(java.lang.String r9, xc2.p0 r10) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.O(java.lang.String, xc2.p0):r45.h32");
    }

    public final r45.i55 P(xc2.p0 infoEx) {
        java.lang.Object obj;
        r45.bg0 bg0Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 24) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (bg0Var = (r45.bg0) wf6Var.getCustom(32)) == null) {
            return null;
        }
        return (r45.i55) bg0Var.getCustom(0);
    }

    public final boolean Q(xc2.p0 jumpInfoEx) {
        kotlin.jvm.internal.o.g(jumpInfoEx, "jumpInfoEx");
        sc2.q8 q8Var = jumpInfoEx.f453233J;
        return q8Var != null && q8Var.f406179c == 2;
    }

    public final void R(java.lang.String str, android.view.View iconLayout, com.tencent.mm.ui.widget.imageview.WeImageView iconView) {
        kotlin.jvm.internal.o.g(iconLayout, "iconLayout");
        kotlin.jvm.internal.o.g(iconView, "iconView");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(iconLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            iconLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(iconLayout, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(iconLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        iconLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(iconLayout, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.B));
        sc2.n5 n5Var = new sc2.n5(this, iconLayout);
        b17.getClass();
        b17.f447873d = n5Var;
        b17.f447879j = new sc2.o5(this, iconLayout);
        b17.f447878i = new sc2.p5(this, iconLayout);
        b17.c(iconView);
    }

    public final void S(xc2.p0 jumpInfoEx, android.view.View jumpView, java.lang.String username, r45.h32 liveNoticeInfo) {
        kotlin.jvm.internal.o.g(jumpInfoEx, "jumpInfoEx");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(liveNoticeInfo, "liveNoticeInfo");
        if (liveNoticeInfo.getInteger(1) == 0) {
            android.content.Context context = jumpView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            sc2.q5 q5Var = new sc2.q5(jumpView, liveNoticeInfo, username, this, jumpInfoEx);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
            k0Var.f211872n = new sc2.r5(context);
            k0Var.f211881s = new sc2.s5(jumpInfoEx, this, jumpView, q5Var);
            k0Var.v();
            return;
        }
        android.content.Context context2 = jumpView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        T(liveNoticeInfo, username, this, jumpInfoEx, context2, 1, jumpView);
        r45.h32 O = O(username, jumpInfoEx);
        i95.m c17 = i95.n0.c(c50.c1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        ml2.i5 i5Var = ml2.i5.f327571f;
        android.content.Context context3 = jumpView.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
        java.lang.String string = O.getString(3);
        if (string == null) {
            string = "";
        }
        java.lang.String str = string;
        java.lang.String string2 = O.getString(4);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = jumpInfoEx.f453244f;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        android.content.Context context4 = jumpView.getContext();
        kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        c50.c1.l9(c1Var, i5Var, username, 0L, 0, valueOf, null, null, null, null, str, null, string2, null, itemId, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5), null, 38368, null);
    }

    public final void U(r45.h32 h32Var, xc2.p0 p0Var, android.view.View view) {
        android.view.View findViewById = Q(p0Var) ? view.findViewById(com.tencent.mm.R.id.lte) : view.findViewById(com.tencent.mm.R.id.ltf);
        android.widget.TextView textView = Q(p0Var) ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.eex) : (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.eew);
        if (h32Var.getInteger(1) == 0) {
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.cs7));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "refreshBtnStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "refreshBtnStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (Q(p0Var)) {
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.dkt));
        } else {
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.cs6));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "refreshBtnStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "refreshBtnStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x01f8, code lost:
    
        if (r7 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01fa, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0201, code lost:
    
        if (r7 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0434, code lost:
    
        if (r0 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0235, code lost:
    
        if ((r3 == null || r3.length() == 0) == false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String V(android.content.Context r29, android.widget.TextView r30, android.widget.LinearLayout r31, xc2.p0 r32, int r33) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.V(android.content.Context, android.widget.TextView, android.widget.LinearLayout, xc2.p0, int):java.lang.String");
    }

    public final void W(android.widget.TextView textView, java.lang.CharSequence charSequence, boolean z17) {
        if (textView == null) {
            return;
        }
        if (z17) {
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            if (charSequence == null) {
                charSequence = "";
            }
            charSequence = ((ht2.y0) s6Var).mj(charSequence, (int) textView.getTextSize(), true);
        }
        textView.setText(charSequence);
        textView.setVisibility(com.tencent.mm.sdk.platformtools.t8.J0(textView.getText()) ? 8 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void X(in5.s0 s0Var, android.view.View view, java.lang.String str) {
        r45.wf6 wf6Var;
        xc2.p0 p0Var = this.f3147h;
        if (p0Var == null) {
            sc2.k2 k2Var = (sc2.k2) this;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startAsyncLodPolling: jump info is null, source=");
            sb6.append(str);
            sb6.append(", feedId=");
            java.lang.Object obj = s0Var.f293125i;
            so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
            sb6.append(pm0.v.u(j5Var != null ? j5Var.getItemId() : 0L));
            com.tencent.mars.xlog.Log.e(k2Var.C, sb6.toString());
            return;
        }
        r45.wf6 wf6Var2 = this.f3149m;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                } else {
                    wf6Var = it.next();
                    if (((r45.wf6) wf6Var).getInteger(2) == 24) {
                        break;
                    }
                }
            }
            wf6Var2 = wf6Var;
        }
        r45.wf6 wf6Var3 = wf6Var2;
        if (wf6Var3 != null) {
            java.lang.String str2 = "startAsyncLodPolling: source=" + str + ", async_load_info_time_interval=" + wf6Var3.getInteger(35);
            java.lang.String str3 = ((sc2.k2) this).C;
            com.tencent.mars.xlog.Log.i(str3, str2);
            if (wf6Var3.getInteger(35) <= 0) {
                return;
            }
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
            com.tencent.mm.sdk.platformtools.n3 n3Var = a8Var != null ? a8Var.f406209e : null;
            java.lang.Object obj2 = B;
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(obj2);
            }
            java.lang.Object obj3 = s0Var.f293125i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj3 : null;
            if (baseFinderFeed == null) {
                return;
            }
            this.f405839z = true;
            long integer = (wf6Var3.getInteger(35) * 1000) - (android.os.SystemClock.elapsedRealtime() - p0Var.f453236b);
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = n3Var;
            sc2.b6 b6Var = new sc2.b6(p0Var, baseFinderFeed, wf6Var3, view, this, s0Var, wf6Var3, str);
            com.tencent.mars.xlog.Log.i(str3, "startAsyncLodPolling: source=" + str + ", postDelay=" + integer + ", scene=" + wf6Var3.getInteger(36));
            if (integer <= 0) {
                b6Var.run();
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() + integer;
            if (n3Var2 != null) {
                n3Var2.postAtTime(b6Var, obj2, uptimeMillis);
            }
        }
    }

    public void Y(in5.s0 holder, android.view.View jumpView, java.lang.String source) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(source, "source");
        xc2.p0 p0Var = this.f3147h;
        if (p0Var == null) {
            sc2.k2 k2Var = (sc2.k2) this;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCarouselDesc: jump info is null, source=");
            sb6.append(source);
            sb6.append(", feedId=");
            java.lang.Object obj = holder.f293125i;
            so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
            sb6.append(pm0.v.u(j5Var != null ? j5Var.getItemId() : 0L));
            com.tencent.mars.xlog.Log.e(k2Var.C, sb6.toString());
            return;
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
        com.tencent.mm.sdk.platformtools.n3 n3Var = a8Var != null ? a8Var.f406209e : null;
        java.lang.Object obj2 = A;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(obj2);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) jumpView.findViewById(com.tencent.mm.R.id.ft8);
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i(((sc2.k2) this).C, "startCarouselDesc: has not shown big card, source=".concat(source));
            return;
        }
        int size = p0Var.f453239c0.size();
        if (size >= 2) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis() + 3000;
            if (n3Var != null) {
                n3Var.postAtTime(new sc2.c6(this, holder, jumpView, source), obj2, uptimeMillis);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(((sc2.k2) this).C, "startCarouselDesc: descSize=" + size + ", source=" + source);
    }

    public final void Z(android.content.Context context, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(((sc2.k2) this).C, "stopAsyncLoadPolling: source=" + str);
        this.f405839z = false;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
        com.tencent.mm.sdk.platformtools.n3 n3Var = a8Var != null ? a8Var.f406209e : null;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(B);
        }
    }

    public void a0(android.content.Context context, java.lang.String source) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(((sc2.k2) this).C, "stopCarouselDesc: source=".concat(source));
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
        com.tencent.mm.sdk.platformtools.n3 n3Var = a8Var != null ? a8Var.f406209e : null;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(A);
        }
        kotlinx.coroutines.r2 r2Var = this.f405838y;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r4.getUseRfx() == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(android.view.View r3, com.tencent.mm.view.MMPAGView r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L1b
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r0 = com.tencent.mm.plugin.finder.storage.t70.Jg
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4.o(r0)
        L1b:
            if (r4 == 0) goto L25
            boolean r0 = r4.getUseRfx()
            r1 = 1
            if (r0 != r1) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            java.lang.String r0 = "finder_live_promoting_tiny.pag"
            if (r1 == 0) goto L3a
            android.content.Context r3 = r3.getContext()
            android.content.res.AssetManager r3 = r3.getAssets()
            com.tencent.mm.rfx.RfxPagFile r3 = com.tencent.mm.rfx.RfxPagFile.Load(r3, r0)
            r4.setComposition(r3)
            goto L4b
        L3a:
            if (r4 == 0) goto L4b
            android.content.Context r3 = r3.getContext()
            android.content.res.AssetManager r3 = r3.getAssets()
            org.libpag.PAGFile r3 = org.libpag.PAGFile.Load(r3, r0)
            r4.setComposition(r3)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.b0(android.view.View, com.tencent.mm.view.MMPAGView):void");
    }

    @Override // ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        return info.getBusiness_type() == 2 ? info.getExt_type() == 3 ? gs2.a.f275052h : gs2.a.f275054m : super.j(info);
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        in5.c cVar = (in5.c) holder.f293125i;
        java.lang.String str = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null) {
            str = feedObject.field_username;
        }
        java.lang.String str2 = str == null ? "" : str;
        r45.h32 O = O(str2, infoEx);
        i95.m c17 = i95.n0.c(c50.c1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        ml2.i5 i5Var = ml2.i5.f327570e;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
        java.lang.String string = O.getString(3);
        java.lang.String str3 = string != null ? string : "";
        java.lang.String string2 = O.getString(4);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = infoEx.f453244f;
        long itemId = baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0L;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        c50.c1.l9(c1Var, i5Var, str2, 0L, 0, valueOf, null, null, null, null, str3, null, string2, null, itemId, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5), null, 38368, null);
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        android.content.Context context = holder.f293121e;
        kotlinx.coroutines.r2 r2Var = null;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        boolean z17 = false;
        if (mMActivity != null && !mMActivity.isPaused()) {
            z17 = true;
        }
        if (z17) {
            alive();
        }
        super.v(holder, jumpView, infoEx);
        Y(holder, jumpView, "onJumpViewFocus");
        X(holder, jumpView, "onJumpViewFocus");
        kotlinx.coroutines.r2 r2Var2 = this.f405838y;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = holder.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            r2Var = kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new sc2.t5(this, jumpView, holder, null), 2, null);
        }
        this.f405838y = r2Var;
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        dead();
        super.w(holder, jumpView, infoEx);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        a0(context, "onJumpViewUnFocus");
        android.content.Context context2 = jumpView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        Z(context2, "onJumpViewUnFocus");
        kotlinx.coroutines.r2 r2Var = this.f405838y;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // ad2.h
    public void x(android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        dead();
        super.x(jumpView, infoEx);
        android.content.Context context = jumpView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        a0(context, "onPause");
        android.content.Context context2 = jumpView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        Z(context2, "onPause");
        kotlinx.coroutines.r2 r2Var = this.f405838y;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
