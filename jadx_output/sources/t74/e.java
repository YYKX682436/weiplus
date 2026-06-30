package t74;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f416128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f416129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t74.w1 w1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416127d = w1Var;
        this.f416128e = snsInfo;
        this.f416129f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1");
        t74.e eVar = new t74.e(this.f416127d, this.f416128e, this.f416129f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1");
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1");
        java.lang.Object invokeSuspend = ((t74.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context a17;
        boolean z17;
        boolean z18;
        r45.jj4 jj4Var;
        r45.jj4 jj4Var2;
        r45.jj4 jj4Var3;
        r45.jj4 jj4Var4;
        float f17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsFlipCardBreakContainerStubInflated$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        t74.w1 w1Var = this.f416127d;
        boolean z19 = w1Var.f416284t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsFlipCardBreakContainerStubInflated$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (!z19) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdFlipCardBreakContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdFlipCardBreakContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) w1Var.f416280r).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdFlipCardBreakContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdFlipCardBreakContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            android.view.View h17 = a84.y0.h(viewStub);
            android.widget.FrameLayout frameLayout = h17 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) h17 : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMSnsAdFlipCardBreakContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            w1Var.f416282s = frameLayout;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMSnsAdFlipCardBreakContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsFlipCardBreakContainerStubInflated$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            w1Var.f416284t = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsFlipCardBreakContainerStubInflated$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        t74.b2 t07 = w1Var.t0();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (t07 == null || (a17 = t07.a()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1");
            return f0Var;
        }
        java.lang.String j17 = w1Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindComponentModel, snsId is ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f416128e;
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        sb6.append(", isSame is ");
        boolean z27 = this.f416129f;
        sb6.append(z27);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMShouldResetComponent$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f416272m0 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMShouldResetComponent$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        t74.a2 a2Var = snsInfo.getAdXml().adFlipCardInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMAdFlipCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f416286u = a2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMAdFlipCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        t74.a2 C = t74.w1.C(w1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        if (C == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        } else {
            java.util.Iterator it = ((java.util.ArrayList) C.h()).iterator();
            while (it.hasNext()) {
                r45.jj4 jj4Var5 = (r45.jj4) it.next();
                if (jj4Var5 != null) {
                    m44.a.g(jj4Var5);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        }
        t74.a2 C2 = t74.w1.C(w1Var);
        r45.jj4 d17 = C2 != null ? C2.d() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        if (d17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            z17 = false;
        } else {
            int i17 = d17.f377856e;
            z17 = i17 == 6 || i17 == 4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsFrontMiddleVideo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f416262c0 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsFrontMiddleVideo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        t74.a2 C3 = t74.w1.C(w1Var);
        r45.jj4 b17 = C3 != null ? C3.b() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            z18 = false;
        } else {
            int i18 = b17.f377856e;
            z18 = i18 == 6 || i18 == 4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsBackTopVideo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f416263d0 = z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsBackTopVideo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mars.xlog.Log.i(w1Var.j(), "mIsFrontMiddleVideo is " + t74.w1.Z(w1Var) + ", mIsBackTopVideo is " + t74.w1.Y(w1Var));
        if (t74.w1.Y(w1Var)) {
            t74.a2 C4 = t74.w1.C(w1Var);
            l44.c0.b(snsInfo, C4 != null ? C4.b() : null);
        }
        if (t74.w1.Z(w1Var)) {
            t74.a2 C5 = t74.w1.C(w1Var);
            l44.c0.b(snsInfo, C5 != null ? C5.d() : null);
        }
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        t74.a2 C6 = t74.w1.C(w1Var);
        if (C6 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFrontBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 jj4Var6 = C6.f416088c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFrontBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            jj4Var = jj4Var6;
        } else {
            jj4Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFakeFrontBottomImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFakeFrontBottomImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) w1Var.U).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFakeFrontBottomImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFakeFrontBottomImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int hashCode = a17.hashCode();
        com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
        s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
        hj6.l0(jj4Var, imageView, -1, hashCode, s7Var);
        if (t74.w1.Z(w1Var)) {
            com.tencent.mm.plugin.sns.model.i1 hj7 = com.tencent.mm.plugin.sns.model.l4.hj();
            t74.a2 C7 = t74.w1.C(w1Var);
            r45.jj4 d18 = C7 != null ? C7.d() : null;
            android.widget.ImageView Q = t74.w1.Q(w1Var);
            int hashCode2 = a17.hashCode();
            s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
            hj7.l0(d18, Q, com.tencent.mm.R.drawable.f482115d90, hashCode2, s7Var);
        } else {
            com.tencent.mm.plugin.sns.model.i1 hj8 = com.tencent.mm.plugin.sns.model.l4.hj();
            t74.a2 C8 = t74.w1.C(w1Var);
            r45.jj4 d19 = C8 != null ? C8.d() : null;
            android.widget.ImageView Q2 = t74.w1.Q(w1Var);
            int hashCode3 = a17.hashCode();
            s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
            hj8.W(d19, Q2, com.tencent.mm.R.drawable.f482115d90, hashCode3, s7Var);
        }
        com.tencent.mm.plugin.sns.model.i1 hj9 = com.tencent.mm.plugin.sns.model.l4.hj();
        t74.a2 C9 = t74.w1.C(w1Var);
        r45.jj4 e17 = C9 != null ? C9.e() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFakeFrontTopImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFakeFrontTopImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) w1Var.X).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFakeFrontTopImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFakeFrontTopImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int hashCode4 = a17.hashCode();
        s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
        hj9.W(e17, imageView2, -1, hashCode4, s7Var);
        com.tencent.mm.plugin.sns.model.i1 hj10 = com.tencent.mm.plugin.sns.model.l4.hj();
        t74.a2 C10 = t74.w1.C(w1Var);
        if (C10 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 jj4Var7 = C10.f416091f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            jj4Var2 = jj4Var7;
        } else {
            jj4Var2 = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBackBottomImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBackBottomImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.ImageView imageView3 = (android.widget.ImageView) ((jz5.n) w1Var.f416292x).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBackBottomImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBackBottomImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int hashCode5 = a17.hashCode();
        s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
        hj10.l0(jj4Var2, imageView3, -1, hashCode5, s7Var);
        com.tencent.mm.plugin.sns.model.i1 hj11 = com.tencent.mm.plugin.sns.model.l4.hj();
        t74.a2 C11 = t74.w1.C(w1Var);
        if (C11 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 jj4Var8 = C11.f416090e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            jj4Var3 = jj4Var8;
        } else {
            jj4Var3 = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBackMiddleImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBackMiddleImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.ImageView imageView4 = (android.widget.ImageView) ((jz5.n) w1Var.f416296z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBackMiddleImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBackMiddleImage", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int hashCode6 = a17.hashCode();
        s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
        hj11.W(jj4Var3, imageView4, com.tencent.mm.R.drawable.f482115d90, hashCode6, s7Var);
        com.tencent.mm.plugin.sns.model.i1 hj12 = com.tencent.mm.plugin.sns.model.l4.hj();
        t74.a2 C12 = t74.w1.C(w1Var);
        if (C12 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFrontBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 jj4Var9 = C12.f416088c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFrontBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            jj4Var4 = jj4Var9;
        } else {
            jj4Var4 = null;
        }
        android.widget.ImageView S = t74.w1.S(w1Var);
        int hashCode7 = a17.hashCode();
        s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
        hj12.l0(jj4Var4, S, -1, hashCode7, s7Var);
        com.tencent.mm.plugin.sns.model.i1 hj13 = com.tencent.mm.plugin.sns.model.l4.hj();
        t74.a2 C13 = t74.w1.C(w1Var);
        r45.jj4 b18 = C13 != null ? C13.b() : null;
        android.widget.ImageView J2 = t74.w1.J(w1Var);
        int hashCode8 = a17.hashCode();
        s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
        hj13.l0(b18, J2, com.tencent.mm.R.drawable.b17, hashCode8, s7Var);
        if (t74.w1.Z(w1Var)) {
            com.tencent.mm.plugin.sns.model.i1 hj14 = com.tencent.mm.plugin.sns.model.l4.hj();
            t74.a2 C14 = t74.w1.C(w1Var);
            r45.jj4 d27 = C14 != null ? C14.d() : null;
            android.widget.ImageView V = t74.w1.V(w1Var);
            int hashCode9 = a17.hashCode();
            s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
            hj14.l0(d27, V, com.tencent.mm.R.drawable.f482115d90, hashCode9, s7Var);
        } else {
            com.tencent.mm.plugin.sns.model.i1 hj15 = com.tencent.mm.plugin.sns.model.l4.hj();
            t74.a2 C15 = t74.w1.C(w1Var);
            r45.jj4 d28 = C15 != null ? C15.d() : null;
            android.widget.ImageView V2 = t74.w1.V(w1Var);
            int hashCode10 = a17.hashCode();
            s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
            hj15.W(d28, V2, com.tencent.mm.R.drawable.f482115d90, hashCode10, s7Var);
        }
        com.tencent.mm.plugin.sns.model.i1 hj16 = com.tencent.mm.plugin.sns.model.l4.hj();
        t74.a2 C16 = t74.w1.C(w1Var);
        r45.jj4 e18 = C16 != null ? C16.e() : null;
        android.widget.ImageView X = t74.w1.X(w1Var);
        int hashCode11 = a17.hashCode();
        s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
        hj16.W(e18, X, -1, hashCode11, s7Var);
        t74.a2 C17 = t74.w1.C(w1Var);
        java.lang.String c17 = C17 != null ? C17.c() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFlipIntroduceFrontIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFlipIntroduceFrontIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.ImageView imageView5 = (android.widget.ImageView) ((jz5.n) w1Var.N).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFlipIntroduceFrontIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFlipIntroduceFrontIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        a84.m.a(c17, imageView5);
        t74.a2 C18 = t74.w1.C(w1Var);
        java.lang.String c18 = C18 != null ? C18.c() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFlipIntroduceBackIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFlipIntroduceBackIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.ImageView imageView6 = (android.widget.ImageView) ((jz5.n) w1Var.O).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFlipIntroduceBackIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFlipIntroduceBackIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        a84.m.a(c18, imageView6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFlipIntroduceTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFlipIntroduceTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) w1Var.P).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFlipIntroduceTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFlipIntroduceTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (textView != null) {
            t74.a2 C19 = t74.w1.C(w1Var);
            if (C19 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFlipIntroduceTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
                str4 = C19.f416101p;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipIntroduceTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            } else {
                str4 = null;
            }
            textView.setText(str4);
            textView.setTextSize(1, 14.0f);
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        com.tencent.mm.ui.base.MMDotView O = t74.w1.O(w1Var);
        if (O != null) {
            O.setDotCount(2);
        }
        t74.w1.i0(w1Var, 0);
        com.tencent.mm.ui.base.MMDotView O2 = t74.w1.O(w1Var);
        if (O2 != null) {
            O2.setSelectedDot(t74.w1.N(w1Var));
        }
        android.widget.ImageView V3 = t74.w1.V(w1Var);
        if (V3 != null) {
            V3.setVisibility(0);
        }
        android.widget.ImageView J3 = t74.w1.J(w1Var);
        if (J3 != null) {
            J3.setVisibility(0);
        }
        if (t74.w1.Y(w1Var)) {
            if (t74.w1.y(w1Var, t74.w1.H(w1Var), snsInfo)) {
                t74.w1.h0(w1Var, t74.w1.I(w1Var), t74.w1.H(w1Var));
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView d07 = t74.w1.d0(w1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMBackOnlineVideoView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                w1Var.f416260a0 = d07;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMBackOnlineVideoView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                w1Var.P0(t74.w1.I(w1Var), t74.w1.H(w1Var), 1);
                java.lang.String j18 = w1Var.j();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("backOnlineVideoView hashcode is ");
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H = t74.w1.H(w1Var);
                sb7.append(H != null ? H.hashCode() : 0);
                com.tencent.mars.xlog.Log.i(j18, sb7.toString());
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H2 = t74.w1.H(w1Var);
            if (H2 != null) {
                H2.setFirstFrameRenderCallback(new t74.b(w1Var));
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H3 = t74.w1.H(w1Var);
            t74.a2 C20 = t74.w1.C(w1Var);
            t74.w1.k0(w1Var, H3, snsInfo, C20 != null ? C20.b() : null);
        } else {
            t74.w1.g0(w1Var, snsInfo, t74.w1.H(w1Var));
        }
        if (t74.w1.Z(w1Var)) {
            if (t74.w1.y(w1Var, t74.w1.W(w1Var), snsInfo)) {
                t74.w1.h0(w1Var, t74.w1.U(w1Var), t74.w1.W(w1Var));
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView d08 = t74.w1.d0(w1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMFrontOnlineVideoView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                w1Var.f416261b0 = d08;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMFrontOnlineVideoView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                w1Var.P0(t74.w1.U(w1Var), t74.w1.W(w1Var), 0);
                java.lang.String j19 = w1Var.j();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("frontOnlineVideoView hashcode is ");
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W = t74.w1.W(w1Var);
                sb8.append(W != null ? W.hashCode() : 0);
                com.tencent.mars.xlog.Log.i(j19, sb8.toString());
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W2 = t74.w1.W(w1Var);
            t74.a2 C21 = t74.w1.C(w1Var);
            t74.w1.k0(w1Var, W2, snsInfo, C21 != null ? C21.d() : null);
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W3 = t74.w1.W(w1Var);
            if (W3 != null) {
                W3.setFirstFrameRenderCallback(new t74.c(w1Var));
            }
        } else {
            t74.w1.g0(w1Var, snsInfo, t74.w1.W(w1Var));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) w1Var.H).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (textView2 != null) {
            t74.a2 C22 = t74.w1.C(w1Var);
            if (C22 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackTitleWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
                str3 = C22.f416096k;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackTitleWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            } else {
                str3 = null;
            }
            textView2.setText(str3);
            textView2.setTextSize(1, 15.0f);
            com.tencent.mm.ui.bk.s0(textView2.getPaint());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDesc", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.TextView A0 = w1Var.A0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDesc", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (A0 != null) {
            t74.a2 C23 = t74.w1.C(w1Var);
            if (C23 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackSubTitleWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
                str2 = C23.f416097l;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackSubTitleWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            } else {
                str2 = null;
            }
            A0.setText(str2);
            A0.setTextSize(1, 14.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMActionTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.TextView textView3 = (android.widget.TextView) ((jz5.n) w1Var.K).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMActionTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (textView3 != null) {
            t74.a2 C24 = t74.w1.C(w1Var);
            if (C24 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackLearnMoreWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
                str = C24.f416098m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackLearnMoreWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            } else {
                str = null;
            }
            textView3.setText(str);
            textView3.setTextSize(1, 14.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMActionIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) w1Var.L).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMActionIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (weImageView != null) {
            if (com.tencent.mm.ui.bk.C()) {
                weImageView.setIconColor(android.graphics.Color.parseColor("#4A4A4A"));
            } else {
                weImageView.setIconColor(android.graphics.Color.parseColor("#C2C2C2"));
            }
        }
        t74.a2 C25 = t74.w1.C(w1Var);
        if (C25 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaOffsetFactor", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            f17 = C25.f416095j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaOffsetFactor", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        } else {
            f17 = 0.17f;
        }
        android.view.ViewGroup c19 = w1Var.t0().c();
        com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer adFlipCardTouchContainer = c19 instanceof com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer ? (com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer) c19 : null;
        if (adFlipCardTouchContainer != null) {
            adFlipCardTouchContainer.setScrollListener(new t74.d(w1Var, f17));
        }
        android.widget.FrameLayout b07 = t74.w1.b0(w1Var);
        if (b07 != null) {
            b07.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeUI$default", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.N0(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeUI$default", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$initFlipCardAdChannelData", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFlipCardAdChannelData", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        t74.b2 b2Var = w1Var.f416276p;
        if (b2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFlipCardAdChannelData", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            int i19 = b2Var.f416116j;
            if (i19 == 0 || !z27) {
                java.lang.String T = ca4.z0.T(snsInfo);
                java.lang.String uxinfo = snsInfo.getUxinfo();
                t74.i2 i2Var = new t74.i2();
                w1Var.f416291w0 = i2Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
                java.lang.String str5 = snsInfo.getAdXml().adExtInfo;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommonData", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
                i2Var.f416158a = i19 == 0 ? 1 : 2;
                if (T == null) {
                    T = "";
                }
                i2Var.f416159b = T;
                i2Var.f416160c = uxinfo == null ? "" : uxinfo;
                if (str5 == null) {
                    str5 = "";
                }
                i2Var.f416161d = str5;
                java.util.ArrayList arrayList = (java.util.ArrayList) i2Var.f416168k;
                arrayList.add(i2Var.f416166i);
                arrayList.add(i2Var.f416167j);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommonData", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFlipCardAdChannelData", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$initFlipCardAdChannelData", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setClickEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (b2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        } else {
            t74.p1 p1Var = new t74.p1(snsInfo, w1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
            w64.n nVar = b2Var.f416113g;
            if (nVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            } else {
                nVar.x(p1Var);
                t74.a2 a2Var2 = w1Var.f416286u;
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo g17 = a2Var2 != null ? a2Var2.g() : null;
                android.view.ViewGroup c27 = b2Var.c();
                if (c27 != null) {
                    c27.setOnClickListener(new t74.o1(w1Var, g17, nVar, snsInfo));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setClickEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1");
        return f0Var;
    }
}
