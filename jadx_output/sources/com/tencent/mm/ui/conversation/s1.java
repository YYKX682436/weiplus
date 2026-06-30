package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f208056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f208058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f208059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208060h;

    public s1(java.lang.Runnable runnable, java.lang.String str, com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog, java.lang.String str2) {
        this.f208056d = runnable;
        this.f208057e = str;
        this.f208058f = pBool;
        this.f208059g = progressDialog;
        this.f208060h = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f208056d.run();
        c01.w9.h(this.f208057e, new com.tencent.mm.ui.conversation.r1(this));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(this.f208060h, 15);
    }
}
