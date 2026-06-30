package s3;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        n3.v1 v1Var = new n3.v1(view, null);
        q26.o oVar = new q26.o();
        oVar.f359881g = pz5.f.a(v1Var, oVar, oVar);
        while (oVar.hasNext()) {
            java.util.ArrayList arrayList = b((android.view.View) oVar.next()).f402380a;
            for (int h17 = kz5.c0.h(arrayList); -1 < h17; h17--) {
                androidx.compose.ui.platform.AbstractComposeView abstractComposeView = ((androidx.compose.ui.platform.i4) ((s3.b) arrayList.get(h17))).f10600a;
                n0.f1 f1Var = abstractComposeView.f10451f;
                if (f1Var != null) {
                    f1Var.dispose();
                }
                abstractComposeView.f10451f = null;
                abstractComposeView.requestLayout();
            }
        }
    }

    public static final s3.c b(android.view.View view) {
        s3.c cVar = (s3.c) view.getTag(com.tencent.mm.R.id.kz9);
        if (cVar != null) {
            return cVar;
        }
        s3.c cVar2 = new s3.c();
        view.setTag(com.tencent.mm.R.id.kz9, cVar2);
        return cVar2;
    }
}
