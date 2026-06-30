package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ep implements com.tencent.neattextview.textview.view.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203903f;

    public ep(com.tencent.mm.ui.chatting.viewitems.hp hpVar, java.lang.String str, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f203901d = str;
        this.f203902e = dVar;
        this.f203903f = f9Var;
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        android.content.Context context = view.getContext();
        java.lang.String str = this.f203901d;
        yb5.d dVar = this.f203902e;
        com.tencent.mm.storage.f9 f9Var = this.f203903f;
        com.tencent.mm.ui.chatting.viewitems.lp.a(context, str, dVar, f9Var);
        com.tencent.mm.ui.chatting.viewitems.mp.b(f9Var);
        return true;
    }
}
