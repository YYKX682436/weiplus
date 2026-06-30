package vh4;

/* loaded from: classes.dex */
public class j2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f437088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f437089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f437090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f437091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f437093f;

    public j2(vh4.t1 t1Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, android.content.DialogInterface.OnDismissListener onDismissListener, android.app.Activity activity, int i17, java.lang.String str, int i18) {
        this.f437088a = u3Var;
        this.f437089b = onDismissListener;
        this.f437090c = activity;
        this.f437091d = i17;
        this.f437092e = str;
        this.f437093f = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f437088a.dismiss();
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f437089b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            boolean z17 = ((r45.m20) fVar.f70618d).f380087d;
            int i17 = this.f437093f;
            java.lang.String str = this.f437092e;
            int i18 = this.f437091d;
            android.app.Activity activity = this.f437090c;
            if (z17) {
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
                intent.putExtra("intent_process", 1);
                intent.putExtra("intent_extra_biz_type", i18);
                intent.putExtra("intent_extra_biz_key", str);
                android.app.Activity activity2 = this.f437090c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$9", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } else {
                android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI.class);
                intent2.putExtra("intent_extra_biz_type", i18);
                intent2.putExtra("intent_extra_biz_key", str);
                android.app.Activity activity3 = this.f437090c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(activity3, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$9", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
        return null;
    }
}
