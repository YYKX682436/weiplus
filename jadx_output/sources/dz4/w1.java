package dz4;

/* loaded from: classes.dex */
public final class w1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f245442b;

    public w1(android.app.Activity activity, android.content.Intent intent) {
        this.f245441a = activity;
        this.f245442b = intent;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            android.app.Activity activity = this.f245441a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4100);
            arrayList.add(this.f245442b);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/wenote/flutter/WeNoteFlutterFileHelper$handleJumpFilePicker$needRequestPermission$1", "onOp", "(Ljava/lang/Boolean;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
