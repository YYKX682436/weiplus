package ug5;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f427652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.v f427653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f427654f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, ug5.v vVar, long j17) {
        super(0);
        this.f427652d = context;
        this.f427653e = vVar;
        this.f427654f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ug5.v vVar = this.f427653e;
        java.lang.Class cls = vVar.f427658a.f427607u;
        android.content.Context context = this.f427652d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) cls);
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("intent_key_view_performer_builder", vVar.toString());
        java.util.HashMap hashMap = ug5.v.f427656h;
        java.lang.String obj = vVar.toString();
        ug5.g gVar = vVar.f427658a;
        hashMap.put(obj, gVar);
        gVar.f427595i.put("intent_key_cost", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("ViewFluentPerformer", "startTransparentActivity real startActivity, post cost: " + (java.lang.System.currentTimeMillis() - this.f427654f));
        android.content.Context context2 = this.f427652d;
        if (context2 instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(7701);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/ui/fluent/ViewFluentPerformer$startTransparentActivity$call$1", "invoke", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/ui/fluent/ViewFluentPerformer$startTransparentActivity$call$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/fluent/ViewFluentPerformer$startTransparentActivity$call$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f302826a;
    }
}
