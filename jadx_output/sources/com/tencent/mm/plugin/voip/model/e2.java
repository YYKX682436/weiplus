package com.tencent.mm.plugin.voip.model;

/* loaded from: classes10.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx3.i f176470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f176471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f176472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.f2 f176474h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(vx3.i iVar, yz5.l lVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, com.tencent.mm.plugin.voip.model.f2 f2Var) {
        super(1);
        this.f176470d = iVar;
        this.f176471e = lVar;
        this.f176472f = appCompatActivity;
        this.f176473g = str;
        this.f176474h = f2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.z2 dialog = (com.tencent.mm.ui.widget.dialog.z2) obj;
        kotlin.jvm.internal.o.g(dialog, "dialog");
        if (this.f176470d.j()) {
            this.f176471e.invoke(new com.tencent.mm.plugin.voip.model.d2(this.f176472f, this.f176473g, this.f176470d, dialog, this.f176474h));
        }
        return jz5.f0.f302826a;
    }
}
