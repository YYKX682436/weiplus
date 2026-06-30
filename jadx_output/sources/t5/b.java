package t5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final t5.a f415683a = new t5.a(null);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f415684b = new java.util.HashMap();

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LinkedMultimap( ");
        t5.a aVar = this.f415683a;
        t5.a aVar2 = aVar.f415682d;
        while (!kotlin.jvm.internal.o.b(aVar2, aVar)) {
            sb6.append('{');
            sb6.append(aVar2.f415679a);
            sb6.append(':');
            java.util.List list = aVar2.f415680b;
            sb6.append(list == null ? 0 : ((java.util.ArrayList) list).size());
            sb6.append('}');
            aVar2 = aVar2.f415682d;
            if (!kotlin.jvm.internal.o.b(aVar2, aVar)) {
                sb6.append(", ");
            }
        }
        sb6.append(" )");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "StringBuilder().apply(builderAction).toString()");
        return sb7;
    }
}
