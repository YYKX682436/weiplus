package jb0;

/* loaded from: classes8.dex */
public final class f implements com.tencent.mm.pluginsdk.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.g2 f298682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jb0.g f298683b;

    public f(com.tencent.mm.pluginsdk.model.g2 g2Var, jb0.g gVar) {
        this.f298682a = g2Var;
        this.f298683b = gVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.n0
    public void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.pluginsdk.model.f2 f2Var = this.f298682a.f189318k;
        jz5.f0 f0Var = null;
        android.content.Intent intent = f2Var != null ? f2Var.f189300d : null;
        if (intent != null) {
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, context.getString(com.tencent.mm.R.string.obd));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/openway/OpenWayFeatureService$shareChattingToOtherApp$1$2$1$1", "onClick", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/openway/OpenWayFeatureService$shareChattingToOtherApp$1$2$1$1", "onClick", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(this.f298683b.f298684d, "launch chooser but intent is null");
        }
    }
}
