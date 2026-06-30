package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class m1 extends com.tencent.mm.sdk.platformtools.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201190b;

    public m1(java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        this.f201189a = str;
        this.f201190b = f9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void a(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        java.lang.String str = this.f201189a;
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.h(str);
        }
        super.a(a7Var);
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void b(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        java.lang.String str = this.f201189a;
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.h(str);
        }
        com.tencent.mm.ui.chatting.gallery.k1.Q(a7Var.f192462c, a7Var.f192461b, this.f201190b);
    }
}
