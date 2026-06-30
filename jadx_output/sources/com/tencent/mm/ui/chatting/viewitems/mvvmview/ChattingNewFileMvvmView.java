package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/m;", "Lem/l;", "f", "Lem/l;", "getHolder", "()Lem/l;", "setHolder", "(Lem/l;)V", "holder", "Lem/p;", "g", "Lem/p;", "getSourceHolder", "()Lem/p;", "setSourceHolder", "(Lem/p;)V", "sourceHolder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingNewFileMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.m> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.l holder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public em.p sourceHolder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingNewFileMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e0v, (android.view.ViewGroup) this, false);
        em.l lVar = new em.l(inflate);
        setHolder(lVar);
        setSourceHolder(new em.p(lVar.e()));
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        boolean z17;
        java.lang.Object m521constructorimpl;
        java.lang.String str;
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        java.lang.String A;
        java.lang.String o17;
        z01.m mVar = (z01.m) pVar2;
        if (mVar == null) {
            return;
        }
        em.l holder = getHolder();
        if (holder.f254514b == null) {
            holder.f254514b = (com.tencent.mm.view.StretchFrameLayout) holder.f254513a.findViewById(com.tencent.mm.R.id.bkg);
        }
        holder.f254514b.setLayoutConfig(new ym5.a6(5.0d, 0.0d, 3.5d, 0.0d, 0, 26, null));
        java.lang.String str2 = "";
        if (j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigFileBubbleMiddleEllipsize()) == 1) {
            com.tencent.mm.ui.widget.MMNeat7extView i17 = getHolder().i();
            kotlin.jvm.internal.o.f(i17, "getChattingAppmsgTitleTv(...)");
            java.lang.String str3 = mVar.f469098i;
            java.lang.String str4 = str3 == null ? "" : str3;
            i17.setMaxLines(2);
            float width = (i17.getWidth() - i17.getPaddingLeft()) - i17.getPaddingRight();
            if (width > 0.0f) {
                android.text.TextPaint paint = i17.getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                i17.b(al5.p3.a(str4, width, 2, paint, 3, true, true));
            } else {
                i17.b(str4);
                i17.post(new al5.o3(i17, str4, 2, 3, true, true));
            }
        } else {
            getHolder().i().setEllipsize(android.text.TextUtils.TruncateAt.END);
            getHolder().i().b(mVar.f469098i);
        }
        getHolder().b().setText(mVar.f469099m);
        getHolder().i().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        getHolder().b().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.adg));
        int i18 = mVar.f469100n;
        if (i18 != 0) {
            setBackgroundResource(i18);
        }
        em.l holder2 = getHolder();
        if (holder2.f254526n == null) {
            holder2.f254526n = (android.widget.LinearLayout) holder2.f254513a.findViewById(com.tencent.mm.R.id.biy);
        }
        holder2.f254526n.setPadding(0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx), 0, 0);
        getHolder().g().setVisibility(0);
        getHolder().c().setVisibility(8);
        getHolder().h().setVisibility(8);
        ut.g gVar = ut.g.f430626a;
        boolean b17 = gVar.b(mVar.f469095f);
        boolean c17 = gVar.c(mVar.f469095f);
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        if (c17) {
            gk0.k kVar = new gk0.k(i65.a.b(getContext(), 40), i65.a.b(getContext(), 30));
            java.lang.String str5 = mVar.f469102p;
            if (str5 != null) {
                if (com.tencent.mm.vfs.w6.j(str5)) {
                    getHolder().c().setVisibility(0);
                    gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
                    com.tencent.mm.ui.widget.MMRoundCornerImageView c18 = getHolder().c();
                    kotlin.jvm.internal.o.f(c18, "getChattingAppmsgFileThumbIv(...)");
                    ((h83.g) n0Var).Ai(c18, str5, kVar);
                } else {
                    v05.a aVar = mVar.A;
                    if (!((aVar == null || (o17 = aVar.o()) == null || !(r26.n0.N(o17) ^ true)) ? false : true)) {
                        v05.a aVar2 = mVar.A;
                        if (!((aVar2 == null || (A = aVar2.A()) == null || !(r26.n0.N(A) ^ true)) ? false : true)) {
                            getHolder().c().setVisibility(8);
                        }
                    }
                    v05.a aVar3 = mVar.A;
                    if (aVar3 != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileThumb_");
                        java.lang.String o18 = aVar3.o();
                        if (!java.lang.Boolean.valueOf(o18.length() > 0).booleanValue()) {
                            o18 = null;
                        }
                        if (o18 == null) {
                            o18 = aVar3.A();
                        }
                        sb6.append(o18);
                        sb6.append('_');
                        z17 = b17;
                        sb6.append(c01.id.a());
                        y01.a aVar4 = new y01.a(sb6.toString());
                        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar3.A())) {
                            aVar4.a(aVar3.j());
                            aVar4.d(aVar3.o());
                            aVar4.b(aVar3.n());
                            aVar4.f458575d = 3;
                        } else {
                            aVar4.a(aVar3.w());
                            aVar4.d(aVar3.A());
                            aVar4.b(aVar3.z());
                            aVar4.c(aVar3.u());
                            aVar4.f458575d = 19;
                        }
                        aVar4.f458576e = str5;
                        getHolder().c().setVisibility(0);
                        int Ai = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Ai(aVar3.getLong(aVar3.f368364d + 0));
                        com.tencent.mm.ui.widget.MMRoundCornerImageView c19 = getHolder().c();
                        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(mVar.G);
                        jz5.g gVar2 = ho.b.f282615a;
                        if (c19 != null) {
                            g75.z Ui = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ui(((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(kVar, aVar4), kVar, c19, aVar4.f458576e);
                            Ui.l("KeyCdnParams", aVar4);
                            Ui.l("KeyAppMsgSubType", java.lang.Integer.valueOf(Ai));
                            Ui.l("KeyFileMd5", aVar4.f458577f);
                            jz5.g gVar3 = ho.b.f282615a;
                            ((gk0.j) ((jz5.n) ho.b.f282615a).getValue()).a(Ui, weakReference);
                        }
                        f0Var2 = f0Var3;
                    } else {
                        z17 = b17;
                        f0Var2 = null;
                    }
                    if (f0Var2 == null) {
                        getHolder().c().setVisibility(8);
                    }
                    f0Var = f0Var3;
                }
                z17 = b17;
                f0Var = f0Var3;
            } else {
                z17 = b17;
                f0Var = null;
            }
            if (f0Var == null) {
                getHolder().c().setVisibility(8);
            }
        } else {
            z17 = b17;
        }
        if (mVar.f469101o != null) {
            getHolder().g().setImageBitmap(mVar.f469101o);
        } else {
            getHolder().g().setImageResource(mVar.f469103q);
        }
        getHolder().f().setVisibility(0);
        getHolder().b().setVisibility(0);
        em.p sourceHolder = getSourceHolder();
        if (sourceHolder.f254695c == null) {
            sourceHolder.f254695c = (android.widget.ImageView) sourceHolder.f254693a.findViewById(com.tencent.mm.R.id.bjn);
        }
        sourceHolder.f254695c.setVisibility(8);
        em.p sourceHolder2 = getSourceHolder();
        if (sourceHolder2.f254694b == null) {
            sourceHolder2.f254694b = (com.tencent.mm.ui.widget.MMTextView) sourceHolder2.f254693a.findViewById(com.tencent.mm.R.id.bjo);
        }
        sourceHolder2.f254694b.setVisibility(8);
        if (mVar.f469104r) {
            android.view.View e17 = getHolder().e();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/FileViewModel;Lcom/tencent/mm/modelchatting/FileViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/FileViewModel;Lcom/tencent/mm/modelchatting/FileViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View e18 = getHolder().e();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e18, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/FileViewModel;Lcom/tencent/mm/modelchatting/FileViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(e18, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/FileViewModel;Lcom/tencent/mm/modelchatting/FileViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        getHolder().a().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.adg));
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            te5.j jVar = te5.j.f418686a;
            z01.m viewModel = getViewModel();
            if (viewModel != null && (str = viewModel.f469095f) != null) {
                str2 = str;
            }
            int color = getContext().getResources().getColor(jVar.b(str2), null);
            getHolder().d().setIconColor(color);
            getHolder().j().setProgressColor(color);
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var3);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingNewFileMvvmView", "getFileProgressIconColorResIdByExt failed");
        }
        getHolder().j().setVisibility(8);
        getHolder().d().setVisibility(8);
        getHolder().a().setVisibility(8);
        getHolder().k().setVisibility(8);
        switch (mVar.f469093d) {
            case 1:
                getHolder().a().setVisibility(0);
                getHolder().a().setText(getContext().getString(com.tencent.mm.R.string.na9));
                g();
                break;
            case 2:
                getHolder().d().setImageResource(com.tencent.mm.R.raw.app_attach_file_arrow_up);
                h();
                break;
            case 3:
                getHolder().a().setVisibility(0);
                getHolder().a().setText(getContext().getString(com.tencent.mm.R.string.n_m));
                g();
                break;
            case 4:
                getHolder().d().setImageResource(com.tencent.mm.R.raw.app_attach_file_arrow_down);
                h();
                break;
            case 5:
                getHolder().j().setHasPause(false);
                getHolder().j().setVisibility(0);
                getHolder().d().setVisibility(0);
                getHolder().d().setImageResource(com.tencent.mm.R.raw.app_attach_file_arrow_down);
                getHolder().a().setVisibility(0);
                getHolder().a().setText(getContext().getString(com.tencent.mm.R.string.f490483wc));
                break;
            case 6:
                getHolder().a().setVisibility(0);
                getHolder().a().setText(getContext().getString(com.tencent.mm.R.string.n_x));
                break;
            case 7:
                getHolder().a().setVisibility(0);
                getHolder().a().setText(getContext().getString(com.tencent.mm.R.string.n_y));
                break;
            case 8:
                getHolder().j().setVisibility(8);
                getHolder().d().setVisibility(8);
                break;
            case 9:
                getHolder().d().setImageResource(com.tencent.mm.R.raw.app_attach_file_arrow_up);
                h();
                getHolder().a().setVisibility(0);
                getHolder().a().setText(getContext().getString(com.tencent.mm.R.string.f490485we));
                getHolder().a().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac));
                break;
            default:
                z01.m viewModel2 = getViewModel();
                if (viewModel2 != null && viewModel2.f469108v) {
                    getHolder().a().setVisibility(0);
                    getHolder().a().setText(getContext().getString(com.tencent.mm.R.string.nad));
                } else {
                    z01.m viewModel3 = getViewModel();
                    if (viewModel3 != null && (viewModel3.f469094e ^ true)) {
                        z01.m viewModel4 = getViewModel();
                        if (viewModel4 != null && viewModel4.f469096g) {
                            getHolder().a().setVisibility(0);
                            getHolder().a().setText(getContext().getString(com.tencent.mm.R.string.na_));
                        }
                    }
                }
                getHolder().j().setVisibility(8);
                getHolder().d().setVisibility(8);
                break;
        }
        if (mVar.f469093d == 0) {
            if (z17 && getHolder().c().getVisibility() == 0 && getHolder().c().getDrawable() != null) {
                getHolder().h().setVisibility(0);
            } else {
                getHolder().h().setVisibility(8);
            }
        }
        em.l holder3 = getHolder();
        if (holder3.f254520h == null) {
            holder3.f254520h = (android.widget.ImageView) holder3.f254513a.findViewById(com.tencent.mm.R.id.f483656bl5);
        }
        holder3.f254520h.setVisibility(8);
        em.l holder4 = getHolder();
        if (holder4.f254524l == null) {
            holder4.f254524l = (android.widget.ProgressBar) holder4.f254513a.findViewById(com.tencent.mm.R.id.v3b);
        }
        holder4.f254524l.setVisibility(8);
        if (getHolder().j().getVisibility() == 0) {
            getHolder().j().setProgress(mVar.f469107u);
        }
        if (mVar.f469106t) {
            getHolder().f().setOnClickListener(mVar.B);
        } else {
            getHolder().f().setOnClickListener(null);
            getHolder().f().setClickable(false);
            if (mVar.f469097h == 1) {
                getHolder().a().setVisibility(0);
                getHolder().a().setText(getContext().getString(com.tencent.mm.R.string.na9));
            }
        }
        setTag(mVar.C);
        setOnClickListener(mVar.D);
        setOnLongClickListener(mVar.E);
        setOnTouchListener(mVar.F);
    }

    public final void g() {
        getHolder().d().setVisibility(8);
        getHolder().j().setHasPause(true);
        getHolder().j().setVisibility(0);
    }

    public final em.l getHolder() {
        em.l lVar = this.holder;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final em.p getSourceHolder() {
        em.p pVar = this.sourceHolder;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.o.o("sourceHolder");
        throw null;
    }

    public final void h() {
        getHolder().j().setHasPause(false);
        getHolder().j().setVisibility(0);
        getHolder().d().setVisibility(0);
    }

    public final void setHolder(em.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.holder = lVar;
    }

    public final void setSourceHolder(em.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<set-?>");
        this.sourceHolder = pVar;
    }

    public /* synthetic */ ChattingNewFileMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingNewFileMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
