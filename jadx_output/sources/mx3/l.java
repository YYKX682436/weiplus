package mx3;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f332590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vx3.i f332593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f332594h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f332595i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, int i18, java.lang.String str, vx3.i iVar, android.app.Activity activity, boolean z17) {
        super(0);
        this.f332590d = i17;
        this.f332591e = i18;
        this.f332592f = str;
        this.f332593g = iVar;
        this.f332594h = activity;
        this.f332595i = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ringtone_caller", this.f332590d);
        intent.putExtra("ringtone_channel", this.f332591e);
        intent.putExtra("exclusvie_name", this.f332592f);
        vx3.i iVar = this.f332593g;
        intent.putExtra("ringtone_select_ringtone", iVar != null ? iVar.n() : null);
        intent.setClass(this.f332594h, com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI.class);
        if (this.f332595i) {
            intent.addFlags(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62);
            android.app.Activity activity = this.f332594h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneSelectUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneSelectUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.app.Activity activity2 = this.f332594h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(5);
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneSelectUI$1", "invoke", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        return jz5.f0.f302826a;
    }
}
