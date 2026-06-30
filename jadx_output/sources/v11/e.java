package v11;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final v11.d f432355a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f432356b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f432357c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f432358d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f432359e;

    /* renamed from: f, reason: collision with root package name */
    public final v11.b f432360f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f432361g;

    public e(v11.d type, java.lang.String label, java.lang.String callbackBuf, java.lang.String style, java.lang.String url, v11.b state, java.lang.String buttonId) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(label, "label");
        kotlin.jvm.internal.o.g(callbackBuf, "callbackBuf");
        kotlin.jvm.internal.o.g(style, "style");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(buttonId, "buttonId");
        this.f432355a = type;
        this.f432356b = label;
        this.f432357c = callbackBuf;
        this.f432358d = style;
        this.f432359e = url;
        this.f432360f = state;
        this.f432361g = buttonId;
    }

    public static v11.e a(v11.e eVar, v11.d type, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, v11.b bVar, java.lang.String str5, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            type = eVar.f432355a;
        }
        if ((i17 & 2) != 0) {
            str = eVar.f432356b;
        }
        java.lang.String label = str;
        if ((i17 & 4) != 0) {
            str2 = eVar.f432357c;
        }
        java.lang.String callbackBuf = str2;
        if ((i17 & 8) != 0) {
            str3 = eVar.f432358d;
        }
        java.lang.String style = str3;
        if ((i17 & 16) != 0) {
            str4 = eVar.f432359e;
        }
        java.lang.String url = str4;
        if ((i17 & 32) != 0) {
            bVar = eVar.f432360f;
        }
        v11.b state = bVar;
        if ((i17 & 64) != 0) {
            str5 = eVar.f432361g;
        }
        java.lang.String buttonId = str5;
        eVar.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(label, "label");
        kotlin.jvm.internal.o.g(callbackBuf, "callbackBuf");
        kotlin.jvm.internal.o.g(style, "style");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(buttonId, "buttonId");
        return new v11.e(type, label, callbackBuf, style, url, state, buttonId);
    }

    public final v11.e b(v11.b newState) {
        kotlin.jvm.internal.o.g(newState, "newState");
        return a(this, null, null, null, null, null, newState, null, 95, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.e)) {
            return false;
        }
        v11.e eVar = (v11.e) obj;
        return this.f432355a == eVar.f432355a && kotlin.jvm.internal.o.b(this.f432356b, eVar.f432356b) && kotlin.jvm.internal.o.b(this.f432357c, eVar.f432357c) && kotlin.jvm.internal.o.b(this.f432358d, eVar.f432358d) && kotlin.jvm.internal.o.b(this.f432359e, eVar.f432359e) && this.f432360f == eVar.f432360f && kotlin.jvm.internal.o.b(this.f432361g, eVar.f432361g);
    }

    public int hashCode() {
        return (((((((((((this.f432355a.hashCode() * 31) + this.f432356b.hashCode()) * 31) + this.f432357c.hashCode()) * 31) + this.f432358d.hashCode()) * 31) + this.f432359e.hashCode()) * 31) + this.f432360f.hashCode()) * 31) + this.f432361g.hashCode();
    }

    public java.lang.String toString() {
        return "InteractButtonUiModel(type=" + this.f432355a + ", label=" + this.f432356b + ", callbackBuf=" + this.f432357c + ", style=" + this.f432358d + ", url=" + this.f432359e + ", state=" + this.f432360f + ", buttonId=" + this.f432361g + ')';
    }
}
