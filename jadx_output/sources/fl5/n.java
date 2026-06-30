package fl5;

/* loaded from: classes5.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public static final java.lang.reflect.Constructor a(fl5.n nVar, java.lang.String str) {
        nVar.getClass();
        if (str == null) {
            throw new java.lang.IllegalArgumentException("name is null.");
        }
        java.util.HashMap hashMap = com.tencent.mm.ui.widget.cedit.api.MMFlexEditText.f211556q;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = java.lang.Class.forName(str).getConstructor(android.content.Context.class, android.util.AttributeSet.class);
            kotlin.jvm.internal.o.f(obj, "getConstructor(...)");
            hashMap.put(str, obj);
        }
        return (java.lang.reflect.Constructor) obj;
    }
}
