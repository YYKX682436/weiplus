package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u0004\u0018\u00010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingImgMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/q;", "Landroid/widget/ImageView;", "getMainContentIv", "Lcom/tencent/mm/ui/chatting/viewitems/er;", "tag", "Ljz5/f0;", "setItemTag", "Landroid/graphics/Bitmap;", "getBitmap", "Lem/o;", "f", "Lem/o;", "getHolder", "()Lem/o;", "setHolder", "(Lem/o;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ChattingImgMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.q> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.o holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingImgMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e0z, (android.view.ViewGroup) this, false);
        setHolder(new em.o(inflate));
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        z01.q qVar = (z01.q) pVar2;
        if (qVar == null) {
            return;
        }
        yz5.p pVar3 = qVar.f469140e;
        int i17 = qVar.f469144i;
        if (pVar3 != null) {
            android.widget.ImageView b17 = getHolder().b();
            kotlin.jvm.internal.o.f(b17, "getChattingContentIv(...)");
            pVar3.invoke(b17, new af5.b0(this));
        } else {
            em.o holder = getHolder();
            int i18 = i17 + 2;
            int i19 = i17 + 1;
            o70.f aj6 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(qVar.getInteger(i18), qVar.getInteger(i19));
            android.widget.ImageView b18 = holder.b();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(aj6.f343231a, aj6.f343232b);
            int i27 = i17 + 4;
            if (qVar.getBoolean(i27)) {
                layoutParams.gravity = 5;
            } else {
                layoutParams.gravity = 3;
            }
            b18.setLayoutParams(layoutParams);
            if (qVar.getBoolean(i27)) {
                holder.b().setTag(com.tencent.mm.R.id.f485995ui0, holder.g());
            }
            holder.b().setTag(com.tencent.mm.R.id.uhz, holder.c());
            int i28 = i17 + 9;
            if (((oi3.f) qVar.getCustom(i28)) == null) {
                if (qVar.getInteger(i18) == 0 || qVar.getInteger(i19) == 0) {
                    com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                    com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
                    com.tencent.mm.sdk.platformtools.x.r0(qVar.getString(i17 + 0), pInt, pInt2);
                    qVar.set(i18, java.lang.Integer.valueOf(pInt.value));
                    qVar.set(i19, java.lang.Integer.valueOf(pInt2.value));
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingImgMvvmView", "getRent: " + pInt + ", " + pInt2);
                }
                o70.f aj7 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(qVar.getInteger(i18), qVar.getInteger(i19));
                qVar.set(i18, java.lang.Integer.valueOf(aj7.f343231a));
                qVar.set(i19, java.lang.Integer.valueOf(aj7.f343232b));
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingImgMvvmView", "viewModel.thumbImgW: " + qVar.getInteger(i18) + " , " + qVar.getInteger(i19));
                gk0.k kVar = new gk0.k(qVar.getInteger(i18), qVar.getInteger(i19));
                kVar.f272434e = com.tencent.mm.R.raw.icons_filled_pic_error1;
                kVar.f272432c = qVar.f469139d;
                kVar.f272433d = 0.0f;
                int i29 = i17 + 0;
                if (com.tencent.mm.vfs.w6.j(qVar.getString(i29))) {
                    gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
                    android.widget.ImageView b19 = getHolder().b();
                    kotlin.jvm.internal.o.f(b19, "getChattingContentIv(...)");
                    java.lang.String string = qVar.getString(i29);
                    if (string == null) {
                        string = "";
                    }
                    ((h83.g) n0Var).Ai(b19, string, kVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingImgMvvmView", "attachLocalFile: file exists");
                }
            } else {
                xs.f1 f1Var = (xs.f1) i95.n0.c(xs.f1.class);
                oi3.f fVar = (oi3.f) qVar.getCustom(i28);
                android.widget.ImageView b27 = getHolder().b();
                kotlin.jvm.internal.o.f(b27, "getChattingContentIv(...)");
                v70.b0 b0Var = (v70.b0) f1Var;
                b0Var.getClass();
                if (fVar != null) {
                    int i37 = fVar.f345617d;
                    if (!r26.n0.N(fVar.getString(i37 + 3)) && (fVar.getLong(i37 + 0) != 0 || fVar.getLong(i37 + 1) != 0)) {
                        v70.a0 a0Var = v70.b0.f433600m;
                        java.lang.String a17 = a0Var.a(fVar);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgLoaderFeatureService", "attachMsgImgThumb imageKey:" + a17);
                        jz5.l Zi = v70.b0.Zi(b0Var, fVar, false, 2, null);
                        java.lang.String str = (java.lang.String) Zi.f302833d;
                        java.lang.String str2 = (java.lang.String) Zi.f302834e;
                        i95.m c17 = i95.n0.c(tg3.u0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        java.lang.String Q8 = tg3.u0.Q8((tg3.u0) c17, fVar, fVar.k(), false, true, 4, null);
                        java.lang.String concat = Q8.concat("hd");
                        g75.z zVar = new g75.z();
                        zVar.l("Common_ImageKey", a17);
                        zVar.l("Common_StartTimestamp", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                        zVar.l("Common_MakeSureUIThread", java.lang.Boolean.TRUE);
                        zVar.l("Common_ImageViewRefMap", a0Var.b());
                        zVar.l("Common_ImageViewRef", new d75.c(b27));
                        zVar.l("key_thumb_path", str);
                        zVar.l("key_hd_thumb_path", str2);
                        zVar.l("key_write_thumb_path", Q8);
                        zVar.l("key_write_hd_thumb_path", concat);
                        zVar.l("key_msg_info", fVar);
                        b27.setTag(com.tencent.mm.R.id.h9z, a17);
                        gk0.j.b(new gk0.j(kz5.c0.k(y70.g.class, y70.h.class, y70.f.class, y70.s.class, y70.l.class, y70.p.class)), zVar, null, 2, null);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgLoaderFeatureService", "attachMsgImgThumb invalid msg info");
            }
        }
        pd5.k kVar2 = pd5.l.f353580b;
        if (kVar2.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_ImgArcProgress.class, false)) {
            em.o holder2 = getHolder();
            if (holder2.f254649d == null) {
                holder2.f254649d = (com.tencent.mm.ui.widget.progress.RoundProgressBtn) holder2.f254646a.findViewById(com.tencent.mm.R.id.f487507lg);
            }
            holder2.f254649d.setProgress(qVar.getInteger(i17 + 6));
            getHolder().e().setVisibility(qVar.getBoolean(i17 + 7) ? 0 : 8);
            getHolder().g().setVisibility(8);
        } else {
            getHolder().f().setText(qVar.getString(i17 + 5));
            int i38 = i17 + 7;
            com.tencent.mm.ui.chatting.w5.A(getHolder().d(), qVar.getBoolean(i38), false);
            getHolder().f().setVisibility(qVar.getBoolean(i38) ? 0 : 8);
            getHolder().g().setVisibility(qVar.getBoolean(i38) ? 0 : 8);
            getHolder().e().setVisibility(8);
        }
        em.o holder3 = getHolder();
        if (holder3.f254648c == null) {
            holder3.f254648c = (android.widget.ProgressBar) holder3.f254646a.findViewById(com.tencent.mm.R.id.d4_);
        }
        holder3.f254648c.setVisibility(qVar.getBoolean(i17 + 8) ? 0 : 8);
        android.view.View.OnClickListener onClickListener = qVar.f469141f;
        if (onClickListener != null) {
            getHolder().a().setOnClickListener(onClickListener);
        }
        android.view.View.OnLongClickListener onLongClickListener = qVar.f469142g;
        if (onLongClickListener != null) {
            getHolder().a().setOnLongClickListener(onLongClickListener);
        }
        android.view.View.OnTouchListener onTouchListener = qVar.f469143h;
        if (onTouchListener != null) {
            getHolder().a().setOnTouchListener(onTouchListener);
        }
        getHolder().a().setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.b2g));
        if (!com.tencent.mm.ui.bk.d0() || j62.e.g().i("clicfg_disable_tablet_media_opt", 0, true, true) == 0) {
            getHolder().a().setMStretchIds(kVar2.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_ImgArcProgress.class, false) ? kz5.c0.i(java.lang.Integer.valueOf(getHolder().c().getId()), java.lang.Integer.valueOf(getHolder().b().getId()), java.lang.Integer.valueOf(getHolder().e().getId())) : kz5.c0.i(java.lang.Integer.valueOf(getHolder().c().getId()), java.lang.Integer.valueOf(getHolder().b().getId()), java.lang.Integer.valueOf(getHolder().g().getId())));
            getHolder().a().setLayoutConfig(g(qVar.getInteger(i17 + 2), qVar.getInteger(i17 + 1)));
        }
    }

    public final ym5.a6 g(int i17, int i18) {
        ym5.a6 a6Var;
        z01.q viewModel = getViewModel();
        if (viewModel == null) {
            return new ym5.a6(0.0d, 0.0d, 0.0d, 0.0d, 0, 31, null);
        }
        int i19 = viewModel.f469144i;
        if (i17 == i18) {
            a6Var = new ym5.a6(3.0d, 3.0d, 2.25d, 2.25d, viewModel.getBoolean(i19 + 4) ? 5 : 3);
        } else if (i17 > i18) {
            a6Var = new ym5.a6(4.0d, 3.0d, 3.0d, 2.25d, viewModel.getBoolean(i19 + 4) ? 5 : 3);
        } else if (i17 < i18) {
            a6Var = new ym5.a6(3.0d, 4.0d, 2.25d, 3.0d, viewModel.getBoolean(i19 + 4) ? 5 : 3);
        } else {
            a6Var = new ym5.a6(3.0d, 3.0d, 2.25d, 2.25d, viewModel.getBoolean(i19 + 4) ? 5 : 3);
        }
        return a6Var;
    }

    public final android.graphics.Bitmap getBitmap() {
        android.widget.ImageView b17 = getHolder().b();
        android.graphics.drawable.Drawable drawable = b17 != null ? b17.getDrawable() : null;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    public final em.o getHolder() {
        em.o oVar = this.holder;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final android.widget.ImageView getMainContentIv() {
        android.widget.ImageView b17 = getHolder().b();
        kotlin.jvm.internal.o.f(b17, "getChattingContentIv(...)");
        return b17;
    }

    public final void setHolder(em.o oVar) {
        kotlin.jvm.internal.o.g(oVar, "<set-?>");
        this.holder = oVar;
    }

    public final void setItemTag(com.tencent.mm.ui.chatting.viewitems.er tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        getHolder().a().setTag(tag);
    }

    public /* synthetic */ ChattingImgMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingImgMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
