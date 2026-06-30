package la5;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f317610a = new java.util.ArrayList();

    public la5.d a(java.lang.String str) {
        ((java.util.ArrayList) this.f317610a).add(str);
        return this;
    }

    public void b(android.view.View view) {
        if (view != null) {
            java.util.List list = this.f317610a;
            if (((java.util.ArrayList) list).size() <= 0) {
                return;
            }
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            java.lang.String str = "";
            while (it.hasNext()) {
                str = str + ((java.lang.String) it.next()) + ",";
            }
            view.setContentDescription(str);
        }
    }
}
