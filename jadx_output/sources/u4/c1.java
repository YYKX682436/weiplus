package u4;

/* loaded from: classes13.dex */
public class c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Class[] f424448b = {android.content.Context.class, android.util.AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final x.b f424449c = new x.b();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f424450a;

    public c1(android.content.Context context) {
        this.f424450a = context;
    }

    public final java.lang.Object a(android.util.AttributeSet attributeSet, java.lang.Class cls, java.lang.String str) {
        java.lang.Object newInstance;
        java.lang.Class<? extends U> asSubclass;
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new android.view.InflateException(str + " tag must have a 'class' attribute");
        }
        try {
            x.b bVar = f424449c;
            synchronized (bVar) {
                java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) bVar.getOrDefault(attributeValue, null);
                if (constructor == null && (asSubclass = this.f424450a.getClassLoader().loadClass(attributeValue).asSubclass(cls)) != 0) {
                    constructor = asSubclass.getConstructor(f424448b);
                    constructor.setAccessible(true);
                    bVar.put(attributeValue, constructor);
                }
                newInstance = constructor.newInstance(this.f424450a, attributeSet);
            }
            return newInstance;
        } catch (java.lang.Exception e17) {
            throw new android.view.InflateException("Could not instantiate " + cls + " class " + attributeValue, e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0215, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.transition.Transition b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, androidx.transition.Transition r19) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.c1.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, androidx.transition.Transition):androidx.transition.Transition");
    }
}
