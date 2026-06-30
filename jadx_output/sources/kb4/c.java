package kb4;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f306240a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f306241b;

    /* renamed from: c, reason: collision with root package name */
    public final kb4.c f306242c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f306243d;

    public c(java.lang.String key, java.lang.String label, java.util.List list, kb4.c cVar) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(label, "label");
        this.f306240a = key;
        this.f306241b = label;
        this.f306242c = cVar;
        this.f306243d = list;
    }

    public final java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildNodes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildNodes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        return this.f306243d;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        return this.f306240a;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PickDataNode(key='");
        sb6.append(this.f306240a);
        sb6.append("', label='");
        sb6.append(this.f306241b);
        sb6.append("', childNodes=");
        java.util.List list = this.f306243d;
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(", parentNode=");
        sb6.append(this.f306242c);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        return sb7;
    }
}
