package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingVideoMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/j0;", "Lz01/i0;", "downloadViewModel", "Ljz5/f0;", "setVideoDownloadUI", "", "visibility", "setOriginVideoStatusAreaVisibility", "Landroid/graphics/Bitmap;", "getBitmap", "Lem/z;", "g", "Lem/z;", "getHolder", "()Lem/z;", "setHolder", "(Lem/z;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingVideoMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.j0> {

    /* renamed from: f, reason: collision with root package name */
    public final int f204641f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public em.z holder;

    /* renamed from: h, reason: collision with root package name */
    public final af5.m0 f204643h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingVideoMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final void setVideoDownloadUI(z01.i0 i0Var) {
        if (!i0Var.f469054d && !i0Var.f469055e) {
            em.z holder = getHolder();
            if (holder.f254959m == null) {
                holder.f254959m = (android.widget.FrameLayout) holder.f254947a.findViewById(com.tencent.mm.R.id.ukz);
            }
            holder.f254959m.setVisibility(8);
            return;
        }
        em.z holder2 = getHolder();
        if (holder2.f254959m == null) {
            holder2.f254959m = (android.widget.FrameLayout) holder2.f254947a.findViewById(com.tencent.mm.R.id.ukz);
        }
        holder2.f254959m.setVisibility(0);
        if (i0Var.f469054d) {
            getHolder().n().setVisibility(0);
            android.widget.TextView n17 = getHolder().n();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i0Var.f469058h);
            sb6.append('%');
            n17.setText(sb6.toString());
            em.z holder3 = getHolder();
            if (holder3.f254960n == null) {
                holder3.f254960n = (android.widget.LinearLayout) holder3.f254947a.findViewById(com.tencent.mm.R.id.vm7);
            }
            holder3.f254960n.setVisibility(8);
            return;
        }
        getHolder().n().setVisibility(8);
        em.z holder4 = getHolder();
        if (holder4.f254960n == null) {
            holder4.f254960n = (android.widget.LinearLayout) holder4.f254947a.findViewById(com.tencent.mm.R.id.vm7);
        }
        holder4.f254960n.setVisibility(0);
        em.z holder5 = getHolder();
        if (holder5.f254956j == null) {
            holder5.f254956j = (android.widget.TextView) holder5.f254947a.findViewById(com.tencent.mm.R.id.sxa);
        }
        holder5.f254956j.setText(i0Var.f469056f);
        em.z holder6 = getHolder();
        if (holder6.f254956j == null) {
            holder6.f254956j = (android.widget.TextView) holder6.f254947a.findViewById(com.tencent.mm.R.id.sxa);
        }
        android.widget.TextView textView = holder6.f254956j;
        em.z holder7 = getHolder();
        if (holder7.f254964r == null) {
            holder7.f254964r = (android.widget.FrameLayout) holder7.f254947a.findViewById(com.tencent.mm.R.id.uwy);
        }
        textView.setVisibility(holder7.f254964r.getWidth() > this.f204641f ? 0 : 8);
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e2b, (android.view.ViewGroup) this, false);
        setHolder(new em.z(inflate));
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        jz5.f0 f0Var;
        z01.j0 j0Var = (z01.j0) pVar2;
        if (j0Var == null) {
            return;
        }
        android.graphics.Bitmap bitmap = j0Var.f469063d;
        if (bitmap != null) {
            getHolder().b().setImageBitmap(bitmap);
            getHolder().c().setLayoutParams(new android.widget.FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            yz5.p pVar3 = j0Var.f469064e;
            if (pVar3 != null) {
                android.widget.ImageView b17 = getHolder().b();
                kotlin.jvm.internal.o.f(b17, "getChattingContentIv(...)");
                pVar3.invoke(b17, new af5.k0(this));
            }
            getHolder().c().setLayoutParams(new android.widget.FrameLayout.LayoutParams(getHolder().b().getLayoutParams().width, getHolder().b().getLayoutParams().height));
        }
        android.widget.ImageView b18 = getHolder().b();
        af5.m0 m0Var = this.f204643h;
        b18.removeOnLayoutChangeListener(m0Var);
        getHolder().b().addOnLayoutChangeListener(m0Var);
        int i17 = j0Var.f469067h;
        if (j0Var.f469065f) {
            getHolder().k().setText(com.tencent.mm.sdk.platformtools.t8.f0(j0Var.f469068i));
            getHolder().d().setText(com.tencent.mm.sdk.platformtools.t8.u(j0Var.f469069m));
            getHolder().l().setImageDrawable(i65.a.i(getContext(), com.tencent.mm.R.raw.shortvideo_play_btn));
            getHolder().j().setVisibility(8);
            getHolder().m().setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingVideoMvvmView", "video status %d, msg fail is %s, is msg remuxing is %s, isfailreson is %s, has remux job is %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(j0Var.f469066g), java.lang.Boolean.valueOf(j0Var.f469075s), java.lang.Boolean.valueOf(j0Var.f469070n), java.lang.Boolean.valueOf(j0Var.f469076t));
            if (i17 == 104 || i17 == 103) {
                if (j0Var.f469075s) {
                    getHolder().j().setVisibility(0);
                    getHolder().m().setVisibility(0);
                    getHolder().d().setText((java.lang.CharSequence) null);
                    getHolder().k().setText((java.lang.CharSequence) null);
                    getHolder().l().setImageDrawable(null);
                    setOriginVideoStatusAreaVisibility(8);
                } else if (j0Var.f469078v) {
                    getHolder().l().setVisibility(8);
                    setOriginVideoStatusAreaVisibility(0);
                    getHolder().i().setVisibility(8);
                    getHolder().f().s(com.tencent.mm.R.raw.icons_filled_pause, android.R.color.white);
                    getHolder().g().setHasPause(true);
                    getHolder().g().setProgress((int) j0Var.f469079w);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingVideoMvvmView", "newSendProgress BEGIN_SEND progress=" + j0Var.f469079w);
                } else {
                    if (getHolder().j() != null) {
                        getHolder().j().setVisibility(8);
                    }
                    if (getHolder().m() != null) {
                        getHolder().m().setVisibility(8);
                    }
                    getHolder().l().setVisibility(8);
                    if (t21.d3.s()) {
                        setOriginVideoStatusAreaVisibility(0);
                        getHolder().i().setVisibility(8);
                        getHolder().f().s(com.tencent.mm.R.raw.icons_filled_pause, android.R.color.white);
                        getHolder().g().setHasPause(true);
                        getHolder().g().setProgress(j0Var.f469077u);
                    } else {
                        setOriginVideoStatusAreaVisibility(8);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingVideoMvvmView", "status begin");
            } else if (i17 == 105 || j0Var.f469066g || i17 == 198 || j0Var.f469070n) {
                if (t21.d3.s()) {
                    getHolder().l().setVisibility(8);
                    setOriginVideoStatusAreaVisibility(0);
                    getHolder().f().s(com.tencent.mm.R.raw.app_attach_file_arrow_up, android.R.color.white);
                    getHolder().g().setProgress(j0Var.f469078v ? (int) j0Var.f469079w : j0Var.f469077u);
                    getHolder().g().setHasPause(false);
                    if (i17 == 105) {
                        getHolder().i().setVisibility(8);
                    }
                } else {
                    setOriginVideoStatusAreaVisibility(8);
                    getHolder().l().setVisibility(0);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingVideoMvvmView", "status pause");
            } else if (i17 != 106) {
                setOriginVideoStatusAreaVisibility(8);
                getHolder().l().setVisibility(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingVideoMvvmView", "status gone");
            } else if (j0Var.f469078v) {
                getHolder().j().setVisibility(8);
                getHolder().m().setVisibility(8);
                getHolder().l().setVisibility(8);
                setOriginVideoStatusAreaVisibility(0);
                getHolder().i().setVisibility(8);
                getHolder().f().s(com.tencent.mm.R.raw.icons_filled_pause, android.R.color.white);
                getHolder().g().setHasPause(true);
                getHolder().g().setProgress((int) j0Var.f469079w);
            } else if (j0Var.f469076t) {
                getHolder().j().setVisibility(0);
                getHolder().m().setVisibility(0);
                if (!t21.d3.s()) {
                    getHolder().d().setText((java.lang.CharSequence) null);
                }
                getHolder().k().setText((java.lang.CharSequence) null);
                getHolder().l().setImageDrawable(null);
                setOriginVideoStatusAreaVisibility(8);
            }
        } else {
            getHolder().k().setText(com.tencent.mm.sdk.platformtools.t8.f0(j0Var.f469068i));
            getHolder().d().setText(com.tencent.mm.sdk.platformtools.t8.u(j0Var.f469069m));
            if (i17 == 199) {
                getHolder().l().setImageDrawable(i65.a.i(getContext(), com.tencent.mm.R.raw.shortvideo_play_btn));
            } else {
                getHolder().l().setImageDrawable(i65.a.i(getContext(), com.tencent.mm.R.raw.shortvideo_play_btn));
                getHolder().k().setVisibility(8);
            }
            if (j0Var.f469071o) {
                getHolder().e().setVisibility(0);
                getHolder().e().setProgress(j0Var.f469073q);
            } else {
                getHolder().e().setVisibility(8);
                em.z holder = getHolder();
                if (holder.f254955i == null) {
                    holder.f254955i = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.f254947a.findViewById(com.tencent.mm.R.id.f483694bq5);
                }
                holder.f254955i.setVisibility(j0Var.f469072p ? 0 : 8);
            }
            setVideoDownloadUI(j0Var.f469074r);
            setOriginVideoStatusAreaVisibility(8);
        }
        if (t21.d3.s()) {
            getHolder().h().setOnClickListener(j0Var.f469080x);
            getHolder().h().setClickable(true);
            getHolder().h().setFocusable(true);
        }
        android.view.View.OnClickListener onClickListener = j0Var.f469081y;
        if (onClickListener != null) {
            getHolder().a().setOnClickListener(onClickListener);
        }
        android.view.View.OnLongClickListener onLongClickListener = j0Var.f469082z;
        if (onLongClickListener != null) {
            getHolder().a().setOnLongClickListener(onLongClickListener);
        }
        android.view.View.OnTouchListener onTouchListener = j0Var.A;
        if (onTouchListener != null) {
            getHolder().a().setOnTouchListener(onTouchListener);
        }
        if (!com.tencent.mm.ui.bk.d0() || j62.e.g().i("clicfg_disable_tablet_media_opt", 0, true, true) == 0) {
            getHolder().a().setMStretchIds(kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.id.bko), java.lang.Integer.valueOf(com.tencent.mm.R.id.bkm)));
            com.tencent.mm.view.StretchFrameLayout a17 = getHolder().a();
            android.graphics.Bitmap bitmap2 = j0Var.f469063d;
            int width = bitmap2 != null ? bitmap2.getWidth() : 0;
            android.graphics.Bitmap bitmap3 = j0Var.f469063d;
            a17.setLayoutConfig(g(width, bitmap3 != null ? bitmap3.getHeight() : 0));
        }
    }

    public final ym5.a6 g(int i17, int i18) {
        ym5.a6 a6Var;
        z01.j0 viewModel = getViewModel();
        if (viewModel == null) {
            return new ym5.a6(0.0d, 0.0d, 0.0d, 0.0d, 0, 31, null);
        }
        if (i17 == i18) {
            a6Var = new ym5.a6(3.0d, 3.0d, 2.25d, 2.25d, viewModel.f469065f ? 5 : 3);
        } else if (i17 > i18) {
            a6Var = new ym5.a6(4.0d, 3.0d, 3.0d, 2.25d, viewModel.f469065f ? 5 : 3);
        } else if (i17 < i18) {
            a6Var = new ym5.a6(3.0d, 4.0d, 2.25d, 3.0d, viewModel.f469065f ? 5 : 3);
        } else {
            a6Var = new ym5.a6(3.0d, 3.0d, 2.25d, 2.25d, viewModel.f469065f ? 5 : 3);
        }
        return a6Var;
    }

    public final android.graphics.Bitmap getBitmap() {
        android.graphics.drawable.Drawable drawable = getHolder().b().getDrawable();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    public final em.z getHolder() {
        em.z zVar = this.holder;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final void setHolder(em.z zVar) {
        kotlin.jvm.internal.o.g(zVar, "<set-?>");
        this.holder = zVar;
    }

    public final void setOriginVideoStatusAreaVisibility(int i17) {
        getHolder().h().setVisibility(i17);
        getHolder().i().setVisibility(i17);
        getHolder().f().setVisibility(i17);
        getHolder().g().setVisibility(i17);
    }

    public /* synthetic */ ChattingVideoMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingVideoMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f204641f = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 74);
        this.f204643h = new af5.m0(this);
    }
}
