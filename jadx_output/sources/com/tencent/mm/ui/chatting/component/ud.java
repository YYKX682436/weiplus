package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class ud implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f200065d;

    public ud(com.tencent.mm.ui.chatting.component.le leVar, android.content.Context context) {
        this.f200065d = context;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f200065d;
        g4Var.f(0, context.getString(com.tencent.mm.R.string.gce));
        g4Var.f(1, context.getString(com.tencent.mm.R.string.gcd));
    }
}
