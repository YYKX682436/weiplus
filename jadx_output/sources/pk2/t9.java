package pk2;

/* loaded from: classes3.dex */
public final class t9 {

    /* renamed from: a, reason: collision with root package name */
    public static final pk2.t9 f356269a = new pk2.t9();

    public final void a(java.util.List list, qk2.f fVar, int i17, java.util.List list2, android.view.View view, java.lang.String str) {
        while (list.size() <= i17) {
            list.add(new pk2.e9(null, null, null, 7, null));
        }
        pk2.e9 e9Var = (pk2.e9) list.get(i17);
        e9Var.f355712a.clear();
        e9Var.f355712a.addAll(list2);
        e9Var.f355714c = view;
        if (str.length() > 0) {
            kotlin.jvm.internal.o.g(str, "<set-?>");
            e9Var.f355713b = str;
        } else {
            if (e9Var.f355713b.length() == 0) {
                e9Var.f355713b = "";
            }
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            qk2.h hVar = (qk2.h) it.next();
            if (fVar != null) {
                fVar.a(hVar);
            }
        }
    }
}
