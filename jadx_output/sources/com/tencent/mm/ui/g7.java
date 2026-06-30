package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class g7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f208622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q45.a f208623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.o7 f208624f;

    public g7(com.tencent.mm.ui.o7 o7Var, int i17, q45.a aVar) {
        this.f208624f = o7Var;
        this.f208622d = i17;
        this.f208623e = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        q45.a aVar = this.f208623e;
        this.f208624f.e(this.f208622d, aVar.f360121e, aVar.f360120d, aVar.f360123g);
        dialogInterface.dismiss();
    }
}
