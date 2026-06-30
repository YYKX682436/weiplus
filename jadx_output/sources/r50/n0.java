package r50;

/* loaded from: classes.dex */
public final class n0 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        vg5.a aVar = new vg5.a();
        java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        java.util.List list = aVar.f436775f;
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f07) {
            if (!r26.n0.N((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        java.lang.String stringExtra2 = getIntent().getStringExtra("Retr_ForwardXmlContent");
        aVar.f436774e = stringExtra2 != null ? stringExtra2 : "";
        return aVar;
    }
}
