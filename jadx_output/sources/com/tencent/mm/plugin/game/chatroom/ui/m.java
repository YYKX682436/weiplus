package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x33.d f138848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f138849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f138850f;

    public m(x33.d dVar, long j17, long j18) {
        this.f138848d = dVar;
        this.f138849e = j17;
        this.f138850f = j18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/MentionSomeoneDialogUtil$initMentionSomeoneDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        x33.d dVar = this.f138848d;
        dVar.f451628c.setVisibility(0);
        dVar.f451629d.setVisibility(8);
        com.tencent.mm.ui.base.MMClearEditText etInputName = dVar.f451627b;
        kotlin.jvm.internal.o.f(etInputName, "etInputName");
        java.lang.Object systemService = etInputName.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            etInputName.requestFocus();
            inputMethodManager.showSoftInput(etInputName, 0);
        }
        com.tencent.mm.game.report.g.f68195a.e(700L, 2L, this.f138849e, this.f138850f, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/ui/MentionSomeoneDialogUtil$initMentionSomeoneDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
