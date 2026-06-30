package tp0;

/* loaded from: classes7.dex */
public abstract class i extends tp0.e {
    @Override // tp0.e
    public void x(org.json.JSONObject data, java.lang.Object view, jc3.m parent) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        super.x(data, view, parent);
        y(view, data, parent);
        z(view, data);
        parent.c(view, parent.a(data), new tp0.h(this, view, data));
    }

    public void z(java.lang.Object view, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
    }
}
