package zk1;

/* loaded from: classes14.dex */
public final class m extends android.view.View.AccessibilityDelegate {

    /* renamed from: l, reason: collision with root package name */
    public static final zk1.j f473414l = new zk1.j(null);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f473415m = jz5.h.a(jz5.i.f302830e, zk1.i.f473411d);

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f473416a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f473417b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f473418c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f473419d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f473420e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f473421f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f473422g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f473423h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f473424i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f473425j = new android.graphics.Rect();

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f473426k = jz5.h.a(jz5.i.f302831f, new zk1.l(this));

    public m(android.view.View view, java.lang.Class cls, java.lang.String str, boolean z17, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, yz5.a aVar, android.graphics.Rect rect, kotlin.jvm.internal.i iVar) {
        this.f473416a = view;
        this.f473417b = cls;
        this.f473418c = str;
        this.f473419d = z17;
        this.f473420e = bool;
        this.f473421f = bool2;
        this.f473422g = str2;
        this.f473423h = aVar;
        this.f473424i = rect;
    }

    public static final void a(android.view.View view, java.lang.Class cls, java.lang.Integer num, boolean z17, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num2, yz5.a aVar, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Integer num6, java.lang.Integer num7) {
        f473414l.a(view, cls, num, z17, bool, bool2, num2, aVar, num3, num4, num5, num6, num7);
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View host) {
        kotlin.jvm.internal.o.g(host, "host");
        zk1.k kVar = (zk1.k) this.f473426k.getValue();
        return kVar != null ? kVar : super.getAccessibilityNodeProvider(host);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View host, android.view.accessibility.AccessibilityNodeInfo info) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        java.lang.Class cls = this.f473417b;
        if (cls != null) {
            info.setClassName(cls.getName());
        }
        java.lang.String str = this.f473418c;
        if (str != null) {
            info.setContentDescription(str);
        }
        if (this.f473419d) {
            info.setCollectionInfo(null);
        }
        java.lang.Boolean bool = this.f473420e;
        if (bool != null) {
            info.setFocusable(bool.booleanValue());
        }
        java.lang.Boolean bool2 = this.f473421f;
        if (bool2 != null) {
            info.setClickable(bool2.booleanValue());
        }
        java.lang.String str2 = this.f473422g;
        if (str2 != null) {
            info.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, str2));
        }
        yz5.a aVar = this.f473423h;
        if (aVar != null) {
            boolean booleanValue = ((java.lang.Boolean) aVar.invoke()).booleanValue();
            info.setCheckable(true);
            info.setChecked(booleanValue);
        }
    }
}
