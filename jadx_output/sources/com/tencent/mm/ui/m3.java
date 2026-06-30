package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.h3 f209089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f209090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f209091f;

    public m3(db5.h3 h3Var, android.content.Context context, java.lang.Runnable runnable) {
        this.f209089d = h3Var;
        this.f209090e = context;
        this.f209091f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/DismissConversationHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f209089d.B();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CONVERSATION_DISMISS_INTRO_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        com.tencent.mm.ui.o3.a(this.f209090e, this.f209091f);
        yj0.a.h(this, "com/tencent/mm/ui/DismissConversationHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
