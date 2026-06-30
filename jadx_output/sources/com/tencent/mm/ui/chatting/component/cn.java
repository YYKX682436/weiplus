package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class cn implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f198907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f198908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f198910g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ym f198911h;

    public cn(com.tencent.mm.ui.chatting.component.ym ymVar, long j17, com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        this.f198911h = ymVar;
        this.f198907d = j17;
        this.f198908e = f9Var;
        this.f198909f = i17;
        this.f198910g = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.chatting.component.ym ymVar = this.f198911h;
        ymVar.f200337h = true;
        ymVar.f200338i = false;
        ymVar.f200339m = 0;
        go.d.f273696a.b(false, this.f198907d);
        ymVar.p0(this.f198908e, this.f198909f, this.f198910g == 125);
        dialogInterface.dismiss();
    }
}
