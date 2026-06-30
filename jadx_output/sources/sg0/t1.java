package sg0;

/* loaded from: classes.dex */
public final class t1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407814c;

    public t1(kotlin.jvm.internal.h0 h0Var, java.lang.String str, yz5.l lVar) {
        this.f407812a = h0Var;
        this.f407813b = str;
        this.f407814c = lVar;
    }

    @Override // q80.f0
    public void fail() {
        kotlin.jvm.internal.h0 h0Var = this.f407812a;
        ((org.json.JSONObject) h0Var.f310123d).put("err_code", -1);
        ((org.json.JSONObject) h0Var.f310123d).put("err_msg", "ensureLiteAppStoreAlive:fail createStore failed");
        this.f407814c.invoke(h0Var.f310123d);
    }

    @Override // q80.f0
    public void success() {
        kotlin.jvm.internal.h0 h0Var = this.f407812a;
        ((org.json.JSONObject) h0Var.f310123d).put("requestId", this.f407813b);
        ((org.json.JSONObject) h0Var.f310123d).put("err_code", 0);
        ((org.json.JSONObject) h0Var.f310123d).put("err_msg", "ensureLiteAppStoreAlive:ok");
        this.f407814c.invoke(h0Var.f310123d);
    }
}
