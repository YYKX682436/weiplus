package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAskShareMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/g;", "Landroid/widget/ImageView;", "thumbIv", "Ljz5/f0;", "setFailImage", "", "h", "Ljz5/g;", "getCropLongerLenThreshold", "()I", "cropLongerLenThreshold", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingAskShareMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.g> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f204613i = 0;

    /* renamed from: f, reason: collision with root package name */
    public em.h f204614f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204615g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cropLongerLenThreshold;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingAskShareMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void g(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, android.graphics.Bitmap bitmap, int i17, int i18, yz5.l lVar) {
        lVar.invoke(com.tencent.mm.sdk.platformtools.x.R(bitmap, i17, i18, chattingAskShareMvvmView.getCropLongerLenThreshold()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCropLongerLenThreshold() {
        return ((java.lang.Number) ((jz5.n) this.cropLongerLenThreshold).getValue()).intValue();
    }

    public static final java.lang.Object i(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, z01.g gVar, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        chattingAskShareMvvmView.getClass();
        java.lang.Object obj = null;
        android.graphics.Bitmap bitmap = gVar != null ? gVar.f469026t : null;
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        com.tencent.mm.pluginsdk.model.app.a1 a1Var = com.tencent.mm.pluginsdk.model.app.a1.f188800a;
        if (gVar == null || (str = gVar.f469023q) == null) {
            str = "1:1";
        }
        int[] c17 = a1Var.c(str);
        java.lang.String str2 = gVar != null ? gVar.f469017h : null;
        int i17 = c17[0];
        boolean z17 = true;
        int i18 = c17[1];
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromUrl] thumburl is null, so bitmap is null");
        } else if (r26.i0.y(str2, "http", false)) {
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new af5.o(str2, i17, i18, chattingAskShareMvvmView, null), continuation);
        } else {
            android.graphics.Bitmap c18 = com.tencent.mm.graphics.e.c(str2);
            if (c18 != null && !c18.isRecycled()) {
                obj = com.tencent.mm.sdk.platformtools.x.R(c18, i17, i18, chattingAskShareMvvmView.getCropLongerLenThreshold());
            } else if (c18 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromFile] raw is null");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromFile] raw is recycled");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFailImage(android.widget.ImageView imageView) {
        imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.x.r(com.tencent.mm.R.raw.picture_filled, imageView.getWidth(), imageView.getHeight(), imageView.getContext().getColor(com.tencent.mm.R.color.FG_4), imageView.getContext().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_4), 0.625f));
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!te5.f.f418634a.a()) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e0p, (android.view.ViewGroup) this, false);
            this.f204614f = new em.h(inflate);
            kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
            return inflate;
        }
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView u17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).u(context);
        this.f204615g = u17;
        return u17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x03c3, code lost:
    
        if (r2 != 2) goto L215;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.mvvm.MvvmView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r18, q31.p r19) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView.e(q31.p, q31.p):void");
    }

    public final void k(android.graphics.Bitmap bitmap) {
        z01.g viewModel = getViewModel();
        z01.f fVar = viewModel != null ? viewModel.f469013d : null;
        int i17 = fVar == null ? -1 : af5.i.f4581a[fVar.ordinal()];
        if (i17 == 1 || i17 == 2) {
            if (bitmap == null || bitmap.isRecycled()) {
                z01.g viewModel2 = getViewModel();
                em.h hVar = this.f204614f;
                if (hVar == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                android.widget.ImageView b17 = hVar.b();
                kotlin.jvm.internal.o.f(b17, "getPictureAreaIv(...)");
                em.h hVar2 = this.f204614f;
                if (hVar2 == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                if (hVar2.f254366g == null) {
                    hVar2.f254366g = (android.widget.ImageView) hVar2.f254360a.findViewById(com.tencent.mm.R.id.uqf);
                }
                android.widget.ImageView imageView = hVar2.f254366g;
                kotlin.jvm.internal.o.f(imageView, "getPicturePlaceholder(...)");
                l(viewModel2, b17, imageView);
                return;
            }
            em.h hVar3 = this.f204614f;
            if (hVar3 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            hVar3.b().setVisibility(0);
            em.h hVar4 = this.f204614f;
            if (hVar4 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            hVar4.b().setImageBitmap(bitmap);
            em.h hVar5 = this.f204614f;
            if (hVar5 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (hVar5.f254366g == null) {
                hVar5.f254366g = (android.widget.ImageView) hVar5.f254360a.findViewById(com.tencent.mm.R.id.uqf);
            }
            hVar5.f254366g.setVisibility(8);
            return;
        }
        if (i17 != 3) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            z01.g viewModel3 = getViewModel();
            em.h hVar6 = this.f204614f;
            if (hVar6 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            android.widget.ImageView e17 = hVar6.e();
            kotlin.jvm.internal.o.f(e17, "getVideoCoverIv(...)");
            em.h hVar7 = this.f204614f;
            if (hVar7 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (hVar7.f254370k == null) {
                hVar7.f254370k = (android.widget.ImageView) hVar7.f254360a.findViewById(com.tencent.mm.R.id.vm6);
            }
            android.widget.ImageView imageView2 = hVar7.f254370k;
            kotlin.jvm.internal.o.f(imageView2, "getVideoCoverPlaceholder(...)");
            l(viewModel3, e17, imageView2);
            return;
        }
        em.h hVar8 = this.f204614f;
        if (hVar8 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        hVar8.e().setVisibility(0);
        em.h hVar9 = this.f204614f;
        if (hVar9 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        hVar9.e().setImageBitmap(bitmap);
        em.h hVar10 = this.f204614f;
        if (hVar10 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (hVar10.f254370k == null) {
            hVar10.f254370k = (android.widget.ImageView) hVar10.f254360a.findViewById(com.tencent.mm.R.id.vm6);
        }
        hVar10.f254370k.setVisibility(8);
    }

    public final void l(z01.g gVar, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromUrl] viewModel is null, return.");
            return;
        }
        java.lang.String str = gVar.f469017h;
        int[] c17 = com.tencent.mm.pluginsdk.model.app.a1.f188800a.c(gVar.f469023q);
        if (r26.i0.A(str, "http", false, 2, null)) {
            int i17 = c17[0];
            int i18 = c17[1];
            gk0.h hVar = new gk0.h(str);
            gk0.k kVar = new gk0.k(0, 0);
            kotlinx.coroutines.l.d(v65.m.a(this), kotlinx.coroutines.q1.f310570c, null, new af5.n(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(hVar, kVar), kVar, hVar, this, i17, i18, imageView, imageView2, null), 2, null);
            return;
        }
        if (!(str.length() > 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromUrl] thumburl is null, so bitmap is null");
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            return;
        }
        int i19 = c17[0];
        int i27 = c17[1];
        android.graphics.Bitmap c18 = com.tencent.mm.graphics.e.c(str);
        if (c18 != null && !c18.isRecycled()) {
            m(com.tencent.mm.sdk.platformtools.x.R(c18, i19, i27, getCropLongerLenThreshold()), imageView, imageView2);
            return;
        }
        if (c18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromFile] raw is null");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromFile] raw is recycled");
        }
        imageView.setVisibility(8);
        imageView2.setVisibility(0);
    }

    public final void m(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        if (bitmap != null && !bitmap.isRecycled()) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
            imageView2.setVisibility(8);
        } else {
            if (bitmap == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[setImageBitmap] bitmap is null");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[setImageBitmap] bitmap is recycled");
            }
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
        }
    }

    public /* synthetic */ ChattingAskShareMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingAskShareMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.cropLongerLenThreshold = jz5.h.b(af5.j.f4584d);
    }
}
