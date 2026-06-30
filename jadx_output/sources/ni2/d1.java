package ni2;

/* loaded from: classes10.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.f1 f337277d;

    public d1(ni2.f1 f1Var) {
        this.f337277d = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        km2.q qVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicTagEditWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ni2.f1 f1Var = this.f337277d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = f1Var.f337293n;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        java.lang.String obj = mMEditText.getEditableText().toString();
        if (((mm2.e1) f1Var.f337291i.a(mm2.e1.class)).g7()) {
            fj2.s sVar = fj2.s.f263183a;
            ml2.w4 w4Var = ml2.w4.f328192m;
            xh2.a aVar = f1Var.f337296q;
            if (aVar == null || (qVar = aVar.f454520a) == null || (str = qVar.f309172c) == null) {
                str = "";
            }
            fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        }
        kotlinx.coroutines.y0 a17 = f1Var.f337292m.a();
        if (a17 != null) {
            kotlinx.coroutines.l.d(a17, null, null, new ni2.c1(f1Var, obj, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicTagEditWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
