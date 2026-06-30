package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes.dex */
public class z1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f188317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f188318b;

    public z1(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, android.content.Context context, android.content.Intent intent) {
        this.f188317a = context;
        this.f188318b = intent;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            android.app.Activity activity = (android.app.Activity) this.f188317a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4100);
            arrayList.add(this.f188318b);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$62", "onOp", "(Ljava/lang/Boolean;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
