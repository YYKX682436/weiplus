package tc4;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417375d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f417376e;

    /* renamed from: f, reason: collision with root package name */
    public int f417377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tc4.n0 f417378g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.kv2 f417379h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(tc4.n0 n0Var, r45.kv2 kv2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417378g = n0Var;
        this.f417379h = kv2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        tc4.j0 j0Var = new tc4.j0(this.f417378g, this.f417379h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        return j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        java.lang.Object invokeSuspend = ((tc4.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        return invokeSuspend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [zy2.p7] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [zy2.g5] */
    /* JADX WARN: Type inference failed for: r9v13, types: [zy2.g5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Integer num;
        r45.kv2 kv2Var;
        java.lang.String str;
        java.lang.Object obj2;
        tc4.n0 n0Var;
        java.lang.String str2;
        java.lang.Object Ni;
        java.lang.String str3;
        ?? r96;
        tc4.n0 n0Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417377f;
        r45.kv2 kv2Var2 = this.f417379h;
        tc4.n0 n0Var3 = this.f417378g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            n0Var3.x("MicroMsg.Improve.FinderMediaTimelineItem", "play 2");
            android.widget.FrameLayout Y = tc4.n0.Y(n0Var3);
            java.lang.Object findViewWithTag = Y != null ? Y.findViewWithTag("sns_video_preview_view_tag") : null;
            zy2.g5 g5Var = findViewWithTag instanceof zy2.g5 ? (zy2.g5) findViewWithTag : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var3.L1 = g5Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var3.x("MicroMsg.Improve.FinderMediaTimelineItem", "play 3");
            java.lang.Object V = tc4.n0.V(n0Var3);
            android.view.View view = V instanceof android.view.View ? (android.view.View) V : null;
            java.lang.Object tag = view != null ? view.getTag(com.tencent.mm.R.id.s6u) : null;
            java.lang.String str4 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
            if (tc4.n0.V(n0Var3) != null && android.text.TextUtils.equals(kv2Var2.getString(0), str4)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play ");
                sb6.append(tc4.n0.V(n0Var3));
                sb6.append(' ');
                zy2.g5 V2 = tc4.n0.V(n0Var3);
                sb6.append(V2 != null ? java.lang.Boolean.valueOf(V2.isPlaying()) : null);
                sb6.append(" reuse.");
                n0Var3.x("MicroMsg.Improve.FinderMediaTimelineItem", sb6.toString());
                zy2.g5 V3 = tc4.n0.V(n0Var3);
                if (V3 != null) {
                    V3.play();
                }
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
                return f0Var;
            }
            if (!android.text.TextUtils.isEmpty(str4)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var3.d0();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            }
            c50.b1 b1Var = (c50.b1) i95.n0.c(c50.b1.class);
            if (b1Var == null) {
                num = null;
                r96 = num;
                int i18 = tc4.n0.N1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var3.L1 = r96;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                jz5.f0 f0Var2 = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
                return f0Var2;
            }
            long Z = pm0.v.Z(kv2Var2.getString(0));
            java.lang.String string = kv2Var2.getString(8);
            if (string == null) {
                string = "";
            }
            tc4.h0 h0Var = new tc4.h0(n0Var3);
            this.f417375d = str4;
            this.f417376e = n0Var3;
            this.f417377f = 1;
            kv2Var = kv2Var2;
            str = "MicroMsg.Improve.FinderMediaTimelineItem";
            obj2 = "sns_video_preview_view_tag";
            n0Var = n0Var3;
            str2 = "play ";
            java.lang.String str5 = str4;
            num = null;
            Ni = ((c61.s9) b1Var).Ni(Z, string, 38, 0L, null, h0Var, this);
            if (Ni == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
                return aVar;
            }
            str3 = str5;
            n0Var3 = n0Var;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
                throw illegalStateException;
            }
            tc4.n0 n0Var4 = (tc4.n0) this.f417376e;
            str3 = (java.lang.String) this.f417375d;
            kotlin.ResultKt.throwOnFailure(obj);
            kv2Var = kv2Var2;
            str = "MicroMsg.Improve.FinderMediaTimelineItem";
            obj2 = "sns_video_preview_view_tag";
            n0Var = n0Var3;
            str2 = "play ";
            num = null;
            n0Var3 = n0Var4;
            Ni = obj;
        }
        ?? r97 = (zy2.g5) Ni;
        if (r97 != 0) {
            ?? r07 = r97 instanceof zy2.p7 ? (zy2.p7) r97 : num;
            if (r07 != 0) {
                n0Var2 = n0Var;
                r07.setFluentSwitchCompleteCallback(new tc4.i0(n0Var2));
            } else {
                n0Var2 = n0Var;
            }
            int i19 = tc4.n0.N1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var2.c0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            android.widget.FrameLayout Y2 = tc4.n0.Y(n0Var2);
            if (Y2 != null) {
                Y2.setAlpha(0.0f);
            }
            android.view.View view2 = (android.view.View) r97;
            view2.setTag(obj2);
            view2.setTag(com.tencent.mm.R.id.s6u, kv2Var.getString(0));
            android.widget.FrameLayout Y3 = tc4.n0.Y(n0Var2);
            if (Y3 != null) {
                Y3.addView(view2, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            zy2.g5.u(r97, num, 1, num);
            n0Var2.x(str, str2 + r97 + ' ' + str3 + ' ' + tc4.n0.V(n0Var2));
            r96 = r97;
            int i182 = tc4.n0.N1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var3.L1 = r96;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            jz5.f0 f0Var22 = jz5.f0.f302826a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
            return f0Var22;
        }
        r96 = num;
        int i1822 = tc4.n0.N1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        n0Var3.L1 = r96;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        jz5.f0 f0Var222 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1");
        return f0Var222;
    }
}
