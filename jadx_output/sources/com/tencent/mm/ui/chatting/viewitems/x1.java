package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class x1 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.f f205965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.v1 f205966b;

    public x1(ot0.f fVar, com.tencent.mm.ui.chatting.viewitems.v1 v1Var) {
        this.f205965a = fVar;
        this.f205966b = v1Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        if ((bVar == null || bVar.f359531a != 0 || (bitmap = bVar.f359534d) == null || bitmap.isRecycled()) && str != null && str.equals(this.f205965a.f348467n)) {
            com.tencent.mm.ui.chatting.viewitems.j1.b(new com.tencent.mm.ui.chatting.viewitems.w1(this));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
