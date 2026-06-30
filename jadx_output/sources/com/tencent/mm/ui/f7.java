package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class f7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f208425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q45.a f208426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.o7 f208427f;

    public f7(com.tencent.mm.ui.o7 o7Var, int i17, q45.a aVar) {
        this.f208427f = o7Var;
        this.f208425d = i17;
        this.f208426e = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        q45.a aVar = this.f208426e;
        this.f208427f.e(this.f208425d, aVar.f360121e, aVar.f360120d, aVar.f360123g);
        dialogInterface.dismiss();
    }
}
