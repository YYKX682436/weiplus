package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class w0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f208205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f208206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208207g;

    public w0(java.lang.String str, com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog, java.lang.String str2) {
        this.f208204d = str;
        this.f208205e = pBool;
        this.f208206f = progressDialog;
        this.f208207g = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.conversation.v0 v0Var = new com.tencent.mm.ui.conversation.v0(this);
        java.lang.String str = this.f208204d;
        c01.w9.h(str, v0Var);
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(str, 15);
    }
}
