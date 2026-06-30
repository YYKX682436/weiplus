package rb2;

/* loaded from: classes10.dex */
public final class v extends rb2.m0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter, long j17) {
        super(presenter, j17);
        kotlin.jvm.internal.o.g(presenter, "presenter");
        jz5.h.b(rb2.k.f393666d);
    }

    public static final void B(rb2.v vVar, in5.s0 s0Var, so2.y0 y0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, int i17) {
        java.lang.String string;
        vVar.getClass();
        java.lang.String str = null;
        if (y0Var.f410703d.a1()) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.report.u.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.finder.report.u) a17).O6(s0Var, V6, y0Var, i17);
        } else if (y0Var.f410703d.i1()) {
            android.content.Context context3 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.report.x.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            ((com.tencent.mm.plugin.finder.report.x) a18).P6(pm0.v.u(y0Var.f410703d.field_feedId), i17);
        }
        if (finderJumpInfo == null) {
            vVar.q(y0Var, s0Var, true);
            return;
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context4 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
        if (advertisement_info == null || (string = advertisement_info.getString(4)) == null) {
            r45.qy0 promotion_info = y0Var.f410703d.u0().getPromotion_info();
            if (promotion_info != null) {
                str = promotion_info.getString(4);
            }
        } else {
            str = string;
        }
        if (str == null) {
            str = "";
        }
        p0Var.f453254p = str;
        p0Var.f453244f = vVar.f393686e.f0();
        xc2.y2.i(y2Var, context4, p0Var, 0, null, 12, null);
    }

    public final void C(in5.s0 s0Var, r45.j60 j60Var, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout, long j17, so2.y0 y0Var, boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        kotlin.jvm.internal.o.d(j60Var);
        float integer = j60Var.getInteger(2) > 0 ? j60Var.getInteger(2) : 16.0f;
        float integer2 = j60Var.getInteger(3) > 0 ? j60Var.getInteger(3) : 9.0f;
        if (z17) {
            jz5.l a17 = rb2.b.f393570g.a(integer, integer2);
            int dimensionPixelSize = s0Var.f293121e.getResources().getDimensionPixelSize(((java.lang.Number) a17.f302833d).intValue());
            int dimensionPixelSize2 = s0Var.f293121e.getResources().getDimensionPixelSize(((java.lang.Number) a17.f302834e).intValue());
            android.view.ViewGroup.LayoutParams layoutParams = finderFixedRatioLayout.getLayoutParams();
            layoutParams.height = dimensionPixelSize2;
            finderFixedRatioLayout.setLayoutParams(layoutParams);
            finderFixedRatioLayout.b(dimensionPixelSize, dimensionPixelSize2, false);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int integer3 = j60Var.getInteger(4);
            if (integer > 0.0f && integer2 > 0.0f) {
                if (integer3 > 0) {
                    E(s0Var, finderFixedRatioLayout, integer3, integer, integer2, j60Var.getInteger(6));
                } else {
                    finderFixedRatioLayout.b(integer, integer2, false);
                }
            }
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dqg, (android.view.ViewGroup) null);
        finderFixedRatioLayout.removeView(inflate);
        r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
        if (advertisement_info != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) advertisement_info.getCustom(0)) != null) {
            com.tencent.mm.protocal.protobuf.NativeInfo native_info = finderJumpInfo.getNative_info();
            if (native_info != null && native_info.getNative_type() == 14) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
                layoutParams2.topMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
                finderFixedRatioLayout.addView(inflate, layoutParams2);
            }
        }
        long c17 = c01.id.c();
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).I).getValue());
        java.lang.String string = j60Var.getString(0);
        if (string == null) {
            string = "";
        }
        wo0.c a18 = d1Var.a(new mn2.j0(string));
        rb2.c cVar = new rb2.c(this, j17, c17);
        a18.getClass();
        a18.f447873d = cVar;
        a18.c(imageView);
        ym5.a1.i(finderFixedRatioLayout, new rb2.d(this, j17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(in5.s0 s0Var, r45.s60 s60Var, android.widget.ImageView imageView, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout, long j17, so2.y0 y0Var, boolean z17) {
        java.lang.String str;
        int i17;
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView;
        com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout2;
        java.lang.String str2;
        java.lang.String string;
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f393686e;
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView v07 = nPresenter.v0();
        if (s60Var == null || (str = s60Var.getString(0)) == null) {
            str = "";
        }
        v07.getMediaReporter().a(nPresenter.f0().getItemId(), y0Var.f410703d.u0());
        v07.setAid(j17);
        android.view.ViewParent parent = v07.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(v07);
        }
        viewGroup.addView(v07);
        viewGroup.setVisibility(0);
        imageView.setVisibility(8);
        boolean z18 = true;
        if (v07.getPlayerState() != 1 && v07.getPlayerState() != 0 && v07.getPlayerState() != 10) {
            java.lang.String str3 = v07.mediaId;
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            if (!(!kotlin.jvm.internal.o.b(str3, com.tencent.mm.sdk.platformtools.w2.b(str.getBytes())))) {
                z18 = false;
            }
        }
        if (z18) {
            imageView.setVisibility(0);
            long c17 = c01.id.c();
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).I).getValue());
            if (s60Var == null || (str2 = s60Var.getString(2)) == null) {
                str2 = "";
            }
            wo0.c a17 = d1Var.a(new mn2.j0(str2));
            i17 = 0;
            a17.f447873d = new rb2.e(this, j17, c17);
            ((wo0.b) a17).c(imageView);
            v07.u((s60Var == null || (string = s60Var.getString(0)) == null) ? "" : string, new rb2.i(v07, imageView, s0Var, y0Var));
            v07.getOnePlayContext().getClass();
            java.lang.String fTPPTag = v07.getFTPPTag();
            v07.getOnePlayContext().getClass();
            com.tencent.mars.xlog.Log.i(fTPPTag, "prepareToFirstFrameRender return for isViewFocused:true");
        } else {
            i17 = 0;
        }
        float integer = (s60Var == null || s60Var.getInteger(4) <= 0) ? 16.0f : s60Var.getInteger(4);
        float integer2 = (s60Var == null || s60Var.getInteger(5) <= 0) ? 9.0f : s60Var.getInteger(5);
        if (z17) {
            finderCommentAdVideoView = v07;
            boolean z19 = i17;
            com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout3 = finderFixedRatioLayout;
            jz5.l a18 = rb2.b.f393570g.a(integer, integer2);
            int dimensionPixelSize = s0Var.f293121e.getResources().getDimensionPixelSize(((java.lang.Number) a18.f302833d).intValue());
            int dimensionPixelSize2 = s0Var.f293121e.getResources().getDimensionPixelSize(((java.lang.Number) a18.f302834e).intValue());
            android.view.ViewGroup.LayoutParams layoutParams = finderFixedRatioLayout.getLayoutParams();
            layoutParams.height = dimensionPixelSize2;
            finderFixedRatioLayout3.setLayoutParams(layoutParams);
            finderFixedRatioLayout3.b(dimensionPixelSize, dimensionPixelSize2, z19);
            finderFixedRatioLayout2 = finderFixedRatioLayout3;
        } else {
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            int integer3 = s60Var != null ? s60Var.getInteger(7) : i17;
            if (integer <= 0.0f || integer2 <= 0.0f) {
                finderFixedRatioLayout2 = finderFixedRatioLayout;
                finderCommentAdVideoView = v07;
            } else if (integer3 > 0) {
                if (s60Var != null) {
                    i17 = s60Var.getInteger(9);
                }
                finderCommentAdVideoView = v07;
                E(s0Var, finderFixedRatioLayout, integer3, integer, integer2, i17);
                finderFixedRatioLayout2 = finderFixedRatioLayout;
            } else {
                finderCommentAdVideoView = v07;
                boolean z27 = i17;
                com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout4 = finderFixedRatioLayout;
                finderFixedRatioLayout4.b(integer, integer2, z27);
                finderFixedRatioLayout2 = finderFixedRatioLayout4;
            }
        }
        ym5.a1.i(finderFixedRatioLayout2, new rb2.j(finderCommentAdVideoView, j17, s0Var, y0Var));
    }

    public final void E(in5.s0 s0Var, com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout, int i17, float f17, float f18, int i18) {
        float f19;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var;
        r45.ky0 advertisement_info;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var2;
        r45.ky0 advertisement_info2;
        int dimensionPixelSize = s0Var.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        android.content.Context context = s0Var.f293121e;
        int c17 = com.tencent.mm.plugin.finder.assist.e8.f102131a.c(null) - (dimensionPixelSize + context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9));
        float b17 = r8.b(context) * kx2.a.f313278a.a(context);
        int i19 = (int) ((i17 * b17) / 100.0f);
        int i27 = (int) ((i19 * 9.0f) / 16);
        int i28 = i27 * i19;
        int b18 = i65.a.b(context, i18 > 0 ? i18 : 9216);
        int i29 = i28 < b18 ? b18 : i28;
        float sqrt = (float) java.lang.Math.sqrt((i29 / f17) / f18);
        int i37 = (((int) (sqrt * f18)) / 8) * 8;
        float f27 = (i37 / f18) * f17;
        java.lang.Object obj = s0Var.f293125i;
        so2.y0 y0Var = obj instanceof so2.y0 ? (so2.y0) obj : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAdHeightPercentage: resultWidth=");
        sb6.append(f27);
        sb6.append(", resultHeight=");
        sb6.append(i37);
        sb6.append(", area=");
        sb6.append(i29);
        sb6.append(", calArea=");
        sb6.append(i28);
        sb6.append(", realMiniArea=");
        sb6.append(b18);
        sb6.append(", svrMiniArea=");
        sb6.append(i18);
        sb6.append("proportion=");
        sb6.append(sqrt);
        sb6.append(", commentAreaHeight=");
        sb6.append(b17);
        sb6.append(", heightPercentage=");
        sb6.append(i17);
        sb6.append(", refWidth=");
        sb6.append(i27);
        sb6.append(", refHeight=");
        sb6.append(i19);
        sb6.append(", maxWidth=");
        sb6.append(c17);
        sb6.append(", aid=");
        sb6.append((y0Var == null || (yj0Var2 = y0Var.f410703d) == null || (advertisement_info2 = yj0Var2.u0().getAdvertisement_info()) == null) ? null : java.lang.Long.valueOf(advertisement_info2.getLong(1)));
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", sb6.toString());
        float f28 = c17;
        if (f27 > f28) {
            f19 = f18;
            i37 = (int) ((f28 / f17) * f19);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleAdHeightPercentage: out of width limit, resultHeight=");
            sb7.append(i37);
            sb7.append(", maxWidth=");
            sb7.append(c17);
            sb7.append(" aid=");
            sb7.append((y0Var == null || (yj0Var = y0Var.f410703d) == null || (advertisement_info = yj0Var.u0().getAdvertisement_info()) == null) ? null : java.lang.Long.valueOf(advertisement_info.getLong(1)));
            com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", sb7.toString());
        } else {
            f19 = f18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = finderFixedRatioLayout.getLayoutParams();
        layoutParams.height = i37;
        finderFixedRatioLayout.setLayoutParams(layoutParams);
        finderFixedRatioLayout.b(f17, f19, false);
    }

    public final void F(android.view.ViewGroup viewGroup) {
        android.view.View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView = childAt instanceof com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView ? (com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView) childAt : null;
        if (finderCommentAdVideoView == null) {
            return;
        }
        if (finderCommentAdVideoView.isAttached) {
            finderCommentAdVideoView.q();
        }
        viewGroup.removeAllViews();
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.drf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x022f, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0ce5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0d89 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0cfc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0677  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r50, in5.c r51, int r52, int r53, boolean r54, java.util.List r55) {
        /*
            Method dump skipped, instructions count: 3466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.v.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.tencent.mm.R.id.a_z), "finder_feed_second_comment_awesome_iv");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        ym5.a1.i(itemView, new rb2.u(holder, this));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.v2_);
        if (weImageView != null) {
            java.lang.Object tag = weImageView.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (!kotlin.jvm.internal.o.b(tag, bool)) {
                weImageView.setTag(bool);
                weImageView.post(new d92.a(weImageView));
            }
        }
        o(holder);
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class);
        a8Var.getClass();
        a8Var.f7(holder);
        da2.g gVar = this.f393688g;
        if (gVar != null) {
            gVar.j();
        }
        this.f393688g = null;
        try {
            if (kotlin.jvm.internal.o.b(holder.f293124h, java.lang.Boolean.TRUE)) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.c6i);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.rga);
                F(viewGroup);
                F(viewGroup2);
                holder.f293124h = java.lang.Boolean.FALSE;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Finder.FinderCommentConvert", "onViewRecycled error=" + th6);
        }
    }
}
