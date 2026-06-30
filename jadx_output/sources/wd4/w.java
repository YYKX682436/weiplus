package wd4;

/* loaded from: classes.dex */
public final class w extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f445048d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f445049e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f445050f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.view.View itemView, android.content.Context uiContext) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(uiContext, "uiContext");
        this.f445048d = uiContext;
        this.f445049e = jz5.h.b(new wd4.s(itemView));
        this.f445050f = jz5.h.b(new wd4.v(itemView));
    }

    public final void i(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        this.itemView.setBackgroundResource(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
    }
}
