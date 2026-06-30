package t51;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final u51.a f415707a;

    public a(android.content.Context context, v51.d dVar) {
        u51.a aVar = new u51.a(1);
        this.f415707a = aVar;
        aVar.f424790k = context;
        aVar.f424780a = dVar;
    }

    public void a(w51.e eVar) {
        eVar.f442966g = this.f415707a;
        eVar.b();
        android.content.Context context = eVar.f442963d;
        eVar.f442969m = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477839cx);
        eVar.f442968i = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477840cy);
        com.tencent.mm.picker.base.view.WheelView wheelView = new com.tencent.mm.picker.base.view.WheelView(eVar.f442973q);
        eVar.f442966g.getClass();
        w51.i iVar = eVar.f442972p;
        if (iVar.f442980a == null) {
            iVar.f442980a = wheelView;
        }
        com.tencent.mm.picker.base.view.WheelView wheelView2 = iVar.f442980a;
        iVar.f442981b = wheelView2;
        u51.a aVar = eVar.f442966g;
        v51.c cVar = aVar.f424783d;
        if (cVar != null) {
            iVar.f442983d = cVar;
        }
        wheelView2.setCyclic(aVar.f424785f);
        android.graphics.Typeface typeface = eVar.f442966g.f424792m;
        android.view.ViewGroup viewGroup = eVar.f442965f;
        if (viewGroup != null) {
            viewGroup.findViewById(com.tencent.mm.R.id.knb).setOnTouchListener(eVar.f442971o);
        }
        iVar.f442981b.setDividerColor(eVar.f442966g.f424791l);
        u51.a aVar2 = eVar.f442966g;
        s51.c cVar2 = aVar2.f424793n;
        com.tencent.mm.picker.base.view.WheelView wheelView3 = iVar.f442981b;
        wheelView3.f72388p = false;
        int i17 = aVar2.f424794o;
        if (iVar.f442982c != null) {
            wheelView3.setCurrentItem(i17);
        }
        iVar.f442981b.setDividerColor(eVar.f442966g.f424791l);
    }
}
