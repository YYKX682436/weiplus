package ep2;

/* loaded from: classes2.dex */
public final class e extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f255705e;

    /* renamed from: f, reason: collision with root package name */
    public final int f255706f;

    /* renamed from: g, reason: collision with root package name */
    public final float f255707g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f255708h;

    /* renamed from: i, reason: collision with root package name */
    public final float f255709i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f255710m;

    public e(boolean z17, int i17, float f17, yz5.p jumProfileCallback) {
        kotlin.jvm.internal.o.g(jumProfileCallback, "jumProfileCallback");
        this.f255705e = z17;
        this.f255706f = i17;
        this.f255707g = f17;
        this.f255708h = jumProfileCallback;
        this.f255709i = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489339c64;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d6, code lost:
    
        if (r6 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (r6 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dd, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d8, code lost:
    
        r6 = r6.getHeadUrl();
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r23, in5.c r24, int r25, int r26, boolean r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep2.e.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void n(in5.s0 s0Var, r45.mb4 mb4Var, com.tencent.mm.plugin.finder.feed.e30 e30Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media3;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia3;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.f487295o70);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.icp);
        if (imageView == null) {
            com.tencent.mars.xlog.Log.w("Finder.Loader", "bindCover return for thumbIv is null.");
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.j8k);
        float f17 = this.f255709i;
        int i17 = (this.f255706f - ((int) f17)) / 2;
        float f18 = this.f255707g;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i18 = (int) (i17 * 0.6666f * f18);
        layoutParams.height = i18;
        imageView.setLayoutParams(layoutParams);
        p17.getLayoutParams().width = layoutParams.width;
        p17.getLayoutParams().height = layoutParams.height;
        viewGroup.getLayoutParams().height = i18;
        android.view.ViewGroup viewGroup2 = this.f255710m;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = i17;
        }
        android.view.ViewGroup viewGroup3 = this.f255710m;
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup3 != null ? viewGroup3.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (((r9 - (((int) f17) * 2)) / 2) * f18);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.f486596lt1);
        imageView2.getLayoutParams().height = layoutParams.height / 3;
        android.widget.ImageView imageView3 = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.f486597lt2);
        imageView3.getLayoutParams().height = layoutParams.height / 3;
        android.widget.ImageView imageView4 = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.f486598lt3);
        imageView4.getLayoutParams().height = layoutParams.height / 3;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.a0(e30Var.f106622o, 0);
        if (finderObject == null || (objectDesc3 = finderObject.getObjectDesc()) == null || (media3 = objectDesc3.getMedia()) == null || (finderMedia3 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media3)) == null) {
            str = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(finderMedia3.getThumbUrl());
            java.lang.String thumb_url_token = finderMedia3.getThumb_url_token();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (thumb_url_token == null) {
                thumb_url_token = "";
            }
            sb6.append(thumb_url_token);
            str = sb6.toString();
        }
        java.util.List list = e30Var.f106622o;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.a0(list, 1);
        if (finderObject2 == null || (objectDesc2 = finderObject2.getObjectDesc()) == null || (media2 = objectDesc2.getMedia()) == null || (finderMedia2 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media2)) == null) {
            str2 = null;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(finderMedia2.getThumbUrl());
            java.lang.String thumb_url_token2 = finderMedia2.getThumb_url_token();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (thumb_url_token2 == null) {
                thumb_url_token2 = "";
            }
            sb7.append(thumb_url_token2);
            str2 = sb7.toString();
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.a0(list, 2);
        if (finderObject3 == null || (objectDesc = finderObject3.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) {
            str3 = null;
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(finderMedia.getThumbUrl());
            java.lang.String thumb_url_token3 = finderMedia.getThumb_url_token();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (thumb_url_token3 == null) {
                thumb_url_token3 = "";
            }
            sb8.append(thumb_url_token3);
            str3 = sb8.toString();
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        mn2.n nVar = new mn2.n(str, null, 2, null);
        mn2.f1 f1Var = mn2.f1.f329965s;
        e17.c(nVar, imageView2, g1Var.h(f1Var));
        g1Var.e().c(new mn2.n(str2, null, 2, null), imageView3, g1Var.h(f1Var));
        g1Var.e().c(new mn2.n(str3, null, 2, null), imageView4, g1Var.h(f1Var));
        java.lang.String string = mb4Var.getString(16);
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = mb4Var.getString(20);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String concat = string.concat(string2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(mb4Var.getString(1));
            java.lang.String string3 = mb4Var.getString(19);
            sb9.append(string3 != null ? string3 : "");
            concat = sb9.toString();
        }
        java.lang.String str4 = concat;
        r45.nw1 liveInfo = e30Var.getFeedObject().getLiveInfo();
        if (liveInfo != null && liveInfo.getInteger(2) == 1) {
            g1Var.e().c(new mn2.q3(str4, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, this.f255705e ? g1Var.h(mn2.f1.f329968v) : g1Var.h(mn2.f1.f329953d));
            return;
        }
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb.g7((c61.zb) c17, imageView, str4, 0, 4, null);
    }
}
