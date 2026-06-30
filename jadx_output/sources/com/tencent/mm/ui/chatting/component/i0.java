package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class i0 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f199205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.j0 f199206d;

    public i0(com.tencent.mm.ui.chatting.component.j0 j0Var, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f199206d = j0Var;
        this.f199203a = str;
        this.f199204b = str2;
        this.f199205c = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        this.f199206d.f198580d.y();
        if (z17) {
            dk5.s5 s5Var = (dk5.s5) tg3.t1.a();
            java.lang.String str2 = this.f199203a;
            java.lang.String str3 = this.f199204b;
            s5Var.Di(str2, str3, this.f199205c, null);
            ((dk5.s5) tg3.t1.a()).Ui(str, str3);
        }
    }
}
