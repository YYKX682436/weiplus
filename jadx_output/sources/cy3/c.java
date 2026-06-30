package cy3;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy3.d f224757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx3.i f224758e;

    public c(cy3.d dVar, vx3.i iVar) {
        this.f224757d = dVar;
        this.f224758e = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$refreshCommonRingBackInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cy3.d dVar = this.f224757d;
        vx3.i iVar = dVar.f224766h;
        boolean z17 = false;
        if (iVar != null && iVar.f441297n) {
            z17 = true;
        }
        if (!z17) {
            vx3.i iVar2 = this.f224758e;
            if (iVar2.j()) {
                android.content.Context context = dVar.f224765g;
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.ringtone.uic.v.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ((com.tencent.mm.plugin.ringtone.uic.v) a17).R6(this.f224758e, 39, 22, (r18 & 8) != 0 ? 0L : 0L, (r18 & 16) != 0 ? "" : null, (r18 & 32) != 0 ? 0 : 0);
                android.content.Context context2 = dVar.f224765g;
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.ringtone.uic.d3) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).O6(iVar2, "");
            } else {
                cy3.g.a(dVar, cy3.e.f224770d, null, 2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$refreshCommonRingBackInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
