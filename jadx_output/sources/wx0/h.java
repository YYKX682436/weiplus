package wx0;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.z f450492e;

    public h(wx0.c0 c0Var, mx0.z zVar) {
        this.f450491d = c0Var;
        this.f450492e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.i2(m7Var, null), 3, null);
        android.view.View view2 = this.f450491d.f331814d;
        kotlin.jvm.internal.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        boolean z17 = false;
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.f450492e).f1(false);
        boolean z18 = this.f450491d.f450459g.Q != null;
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127886q).getValue()).r()).booleanValue();
        if (z18 && booleanValue) {
            z17 = true;
        }
        this.f450491d.b().setBeautyOnlyMode(z17);
        this.f450491d.b().a();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
