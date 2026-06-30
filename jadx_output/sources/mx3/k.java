package mx3;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f332588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f332589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i17, android.app.Activity activity) {
        super(0);
        this.f332588d = i17;
        this.f332589e = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wx3.a.a(1L, "", 0L);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ringtone_channel", this.f332588d);
        intent.setClass(this.f332589e, com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI.class);
        android.app.Activity activity = this.f332589e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneHistoryUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneHistoryUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
