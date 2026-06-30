package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class j5 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.l5 f204232b;

    public j5(com.tencent.mm.ui.chatting.viewitems.l5 l5Var, android.content.Context context) {
        this.f204232b = l5Var;
        this.f204231a = context;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar.f359534d;
        if (bitmap != null) {
            this.f204232b.f204395f.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.ui.chatting.viewitems.i5(this, bitmap));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
