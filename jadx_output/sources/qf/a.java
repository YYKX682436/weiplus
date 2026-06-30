package qf;

/* loaded from: classes7.dex */
public class a implements qf.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f362231a;

    public a(android.content.Context context) {
        this.f362231a = context;
    }

    @Override // qf.c
    public android.webkit.WebResourceResponse a(java.lang.String str) {
        try {
            return new android.webkit.WebResourceResponse("application/javascript", com.tencent.mapsdk.internal.rv.f51270c, this.f362231a.getAssets().open("LuggageBridge.js"));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // qf.c
    public java.lang.String b() {
        return "^luggage://bridge$";
    }
}
