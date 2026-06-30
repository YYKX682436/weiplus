package ui1;

/* loaded from: classes7.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final ui1.v f428087a = new ui1.v();

    public static final ui1.z a(com.tencent.mm.plugin.appbrand.jsapi.l component, ui1.y listener, java.util.List list) {
        ui1.z ih6;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(listener, "listener");
        ui1.x xVar = (ui1.x) component.q(ui1.x.class);
        return (xVar == null || (ih6 = xVar.ih(component, listener, list)) == null) ? f428087a.ih(component, listener, list) : ih6;
    }
}
