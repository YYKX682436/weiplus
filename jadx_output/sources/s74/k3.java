package s74;

/* loaded from: classes4.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404391d;

    /* renamed from: e, reason: collision with root package name */
    public int f404392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f404393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.AppCompatImageView f404395h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView.ScaleType f404396i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(org.json.JSONObject jSONObject, s74.f3 f3Var, androidx.appcompat.widget.AppCompatImageView appCompatImageView, android.widget.ImageView.ScaleType scaleType, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404393f = jSONObject;
        this.f404394g = f3Var;
        this.f404395h = appCompatImageView;
        this.f404396i = scaleType;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$applyImage$1");
        s74.k3 k3Var = new s74.k3(this.f404393f, this.f404394g, this.f404395h, this.f404396i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$applyImage$1");
        return k3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$applyImage$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$applyImage$1");
        java.lang.Object invokeSuspend = ((s74.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$applyImage$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$applyImage$1");
        return invokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0184, code lost:
    
        if (l44.s4.i(r13.f(), r14) != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0325  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.k3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
