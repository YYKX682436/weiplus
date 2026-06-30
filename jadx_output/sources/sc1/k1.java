package sc1;

/* loaded from: classes15.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f405688a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f405689b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f405690c;

    public k1() {
        this.f405688a = 0;
        this.f405689b = "Success";
        this.f405690c = null;
    }

    public k1(int i17, java.lang.String str) {
        this.f405688a = 0;
        this.f405689b = "Success";
        this.f405690c = null;
        this.f405688a = i17;
        this.f405689b = str;
    }

    public k1(com.tencent.live2.jsplugin.V2TXJSAdapterError v2TXJSAdapterError) {
        this.f405688a = 0;
        this.f405689b = "Success";
        this.f405690c = null;
        this.f405688a = v2TXJSAdapterError.errorCode;
        this.f405689b = v2TXJSAdapterError.errorInfo;
        this.f405690c = v2TXJSAdapterError.resultMap;
    }
}
