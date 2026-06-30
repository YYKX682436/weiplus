package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class xo implements com.tencent.neattextview.textview.view.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f206002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206003f;

    public xo(com.tencent.mm.ui.chatting.viewitems.dp dpVar, java.lang.String str, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f206001d = str;
        this.f206002e = dVar;
        this.f206003f = f9Var;
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        android.content.Context context = view.getContext();
        java.lang.String str = this.f206001d;
        yb5.d dVar = this.f206002e;
        com.tencent.mm.storage.f9 f9Var = this.f206003f;
        com.tencent.mm.ui.chatting.viewitems.lp.a(context, str, dVar, f9Var);
        com.tencent.mm.ui.chatting.viewitems.mp.b(f9Var);
        return true;
    }
}
