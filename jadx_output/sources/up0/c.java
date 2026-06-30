package up0;

/* loaded from: classes7.dex */
public final class c extends tp0.g {
    @Override // lc3.c0
    public java.lang.String f() {
        return "removePagView";
    }

    @Override // tp0.g
    public void z(java.lang.Object obj, org.json.JSONObject data) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        super.z(view, data);
        ((com.tencent.mm.view.MMPAGView) view).n();
    }
}
