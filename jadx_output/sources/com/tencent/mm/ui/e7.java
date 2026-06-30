package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class e7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f208372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q45.a f208373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.o7 f208374f;

    public e7(com.tencent.mm.ui.o7 o7Var, int i17, q45.a aVar) {
        this.f208374f = o7Var;
        this.f208372d = i17;
        this.f208373e = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        q45.a aVar = this.f208373e;
        this.f208374f.e(this.f208372d, aVar.f360121e, aVar.f360120d, aVar.f360123g);
        dialogInterface.dismiss();
    }
}
