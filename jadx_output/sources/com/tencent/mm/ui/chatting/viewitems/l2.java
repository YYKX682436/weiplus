package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class l2 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.v1 f204384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204385b;

    public l2(com.tencent.mm.ui.chatting.viewitems.c2 c2Var, com.tencent.mm.ui.chatting.viewitems.v1 v1Var, yb5.d dVar) {
        this.f204384a = v1Var;
        this.f204385b = dVar;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar.f359534d;
        if (bitmap != null) {
            this.f204384a.f205767r.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.ui.chatting.viewitems.k2(this, bitmap));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
