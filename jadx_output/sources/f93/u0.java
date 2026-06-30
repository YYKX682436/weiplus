package f93;

/* loaded from: classes3.dex */
public final class u0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f260474d;

    /* renamed from: e, reason: collision with root package name */
    public final n80.c f260475e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f260476f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f260477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.view.View itemView, android.content.Context uiContext, n80.c cVar) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(uiContext, "uiContext");
        this.f260474d = uiContext;
        this.f260475e = cVar;
        this.f260476f = jz5.h.b(new f93.q0(itemView));
        this.f260477g = jz5.h.b(new f93.t0(itemView));
    }

    public final void i(com.tencent.mm.storage.z3 z3Var) {
        if (z3Var == null) {
            return;
        }
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = z3Var.d1();
        ((sg3.a) v0Var).getClass();
        java.lang.String c17 = c01.a2.c(z3Var, d17);
        java.lang.Object value = ((jz5.n) this.f260477g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.TextView) value).setText(com.tencent.mm.smiley.x1.Di().Ri(c17, true));
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        java.lang.Object value2 = ((jz5.n) this.f260476f).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((com.tencent.mm.feature.avatar.w) zVar).Ai((com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView) value2, z3Var.d1(), null);
        android.view.View itemView = this.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        itemView.setOnClickListener(new f93.s0(itemView, 1000L, this, z3Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }
}
