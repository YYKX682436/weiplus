package yj4;

/* loaded from: classes11.dex */
public final class e implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yj4.f f462696a;

    public e(yj4.f fVar) {
        this.f462696a = fVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean b17 = kotlin.jvm.internal.o.b(str, "page_out");
        yj4.f fVar = this.f462696a;
        if (b17) {
            linkedHashMap.put("status_page_exit_type", java.lang.Integer.valueOf(fVar.f462697d.f363926d));
        }
        androidx.appcompat.app.AppCompatActivity activity = fVar.getActivity();
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = activity instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity ? (com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity) activity : null;
        bi4.d1 d1Var = textStatusEditActivity != null ? textStatusEditActivity.f173613x1 : null;
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String str2 = d1Var != null ? d1Var.G : null;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("status_clipostid", str2);
        java.lang.String str3 = d1Var != null ? d1Var.f354941h : null;
        lVarArr[1] = new jz5.l("status_sessionid", str3 != null ? str3 : "");
        java.util.Map m17 = kz5.c1.m(kz5.c1.k(lVarArr), linkedHashMap);
        m17.toString();
        return m17;
    }
}
